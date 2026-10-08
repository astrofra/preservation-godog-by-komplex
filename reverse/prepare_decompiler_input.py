#!/usr/bin/env python3
"""Remove invalid LocalVariableTable entries from a DERIVED class-only JAR.

Only zero name/descriptor indices are removed. All other class bytes are copied,
apart from enclosing attribute lengths and local-variable entry counts.
Original ZIPs and classes are never rewritten.
"""

import argparse
import hashlib
import json
from pathlib import Path
import struct
from zipfile import ZipFile, ZipInfo, ZIP_DEFLATED


class Reader:
    def __init__(self, data, base=0):
        self.data, self.pos, self.base = data, 0, base

    def take(self, size):
        end = self.pos + size
        if end > len(self.data):
            raise ValueError("Truncated class structure")
        value, self.pos = self.data[self.pos:end], end
        return value

    def u2(self):
        return struct.unpack(">H", self.take(2))[0]

    def u4(self):
        return struct.unpack(">I", self.take(4))[0]

    def finish(self):
        if self.pos != len(self.data):
            raise ValueError("Unconsumed attribute or class bytes")


def digest(data):
    return hashlib.sha256(data).hexdigest()


def normalize(data):
    reader = Reader(data)
    if reader.take(4) != bytes.fromhex("cafebabe"):
        raise ValueError("Not a Java class")
    reader.take(4)  # minor and major versions remain unchanged
    count = reader.u2()
    utf8 = {}
    index = 1
    sizes = {3: 4, 4: 4, 5: 8, 6: 8, 7: 2, 8: 2, 9: 4, 10: 4,
             11: 4, 12: 4, 15: 3, 16: 2, 17: 4, 18: 4, 19: 2, 20: 2}
    while index < count:
        tag = reader.take(1)[0]
        if tag == 1:
            utf8[index] = reader.take(reader.u2())
        else:
            reader.take(sizes[tag])
        index += 2 if tag in (5, 6) else 1
    constant_pool_end = reader.pos
    reader.take(6)  # access flags, this and superclass
    reader.take(2 * reader.u2())
    output = reader.data[:reader.pos]
    removed = []
    code_regions = []

    def attributes(source, method=None, inside_code=False):
        total = source.u2()
        result = struct.pack(">H", total)
        for _ in range(total):
            name_index, length = source.u2(), source.u4()
            name = utf8[name_index]
            offset = source.base + source.pos
            body = source.take(length)
            replacement = body
            if name == b"Code":
                if inside_code or method is None:
                    raise ValueError("Unexpected Code attribute location")
                code = Reader(body, offset)
                code.take(4)  # max_stack and max_locals
                code.take(code.u4())  # bytecode
                code.take(8 * code.u2())  # exception handlers
                prefix = body[:code.pos]
                code_regions.append({"method": method, "bytes": len(prefix),
                                     "sha256": digest(prefix)})
                replacement = prefix + attributes(code, method, inside_code=True)
                code.finish()
            elif name == b"LocalVariableTable" and inside_code:
                table = Reader(body, offset)
                entries = []
                for entry_index in range(table.u2()):
                    entry_offset = table.base + table.pos
                    entry = table.take(10)
                    start, span, local_name, descriptor, slot = struct.unpack(">5H", entry)
                    if local_name == 0 or descriptor == 0:
                        removed.append({"method": method, "attribute": "LocalVariableTable",
                                        "entry_index": entry_index, "original_offset": entry_offset,
                                        "start_pc": start, "length": span, "slot": slot,
                                        "name_index": local_name, "descriptor_index": descriptor,
                                        "entry_hex": entry.hex(),
                                        "reason": "zero constant-pool index for name or descriptor"})
                    else:
                        if local_name not in utf8 or descriptor not in utf8:
                            raise ValueError("Unexpected nonzero invalid local-variable index")
                        entries.append(entry)
                table.finish()
                replacement = struct.pack(">H", len(entries)) + b"".join(entries)
            result += struct.pack(">HI", name_index, len(replacement)) + replacement
        return result

    for kind in ("field", "method"):
        total = reader.u2()
        output += struct.pack(">H", total)
        for _ in range(total):
            header = reader.take(6)
            _, name, descriptor = struct.unpack(">3H", header)
            label = (utf8[name] + utf8[descriptor]).decode("ascii") if kind == "method" else None
            output += header + attributes(reader, method=label)
    output += attributes(reader)
    reader.finish()
    if output[:constant_pool_end] != data[:constant_pool_end]:
        raise AssertionError("Constant pool changed")
    return output, removed, code_regions


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--input", type=Path, default=Path("original/GODOG.ZIP"))
    parser.add_argument("--output", type=Path,
                        default=Path("reverse/inputs/godog-decompiler-input.jar"))
    parser.add_argument("--report", type=Path,
                        default=Path("reverse/evidence/input-normalization.json"))
    args = parser.parse_args()
    if args.output.exists() or args.report.exists():
        parser.error("Choose new output/report paths; existing evidence is not overwritten")
    records, files = [], []
    with ZipFile(args.input) as archive:
        if archive.testzip() is not None:
            raise ValueError("Input ZIP failed CRC check")
        for name in sorted(archive.namelist()):
            if not name.endswith(".class"):
                continue
            original = archive.read(name)
            modified, removed, before_code = normalize(original)
            repeated, remaining, after_code = normalize(modified)
            if repeated != modified or remaining or before_code != after_code:
                raise AssertionError("Normalization changed bytecode/handlers or is not idempotent")
            records.append({"class_entry": name, "original_sha256": digest(original),
                            "derived_sha256": digest(modified), "original_bytes": len(original),
                            "derived_bytes": len(modified), "removed_entries": removed,
                            "code_regions": before_code,
                            "code_regions_unchanged": before_code == after_code})
            files.append((name, modified))
    args.output.parent.mkdir(parents=True, exist_ok=True)
    with ZipFile(args.output, "x", compression=ZIP_DEFLATED) as derived:
        for name, data in files:
            entry = ZipInfo(name, date_time=(1980, 1, 1, 0, 0, 0))
            entry.compress_type = ZIP_DEFLATED
            entry.external_attr = 0o100644 << 16
            derived.writestr(entry, data)
    report = {"input": str(args.input), "input_sha256": digest(args.input.read_bytes()),
              "output": str(args.output), "output_sha256": digest(args.output.read_bytes()),
              "scope": "Derived class-only JAR: remove only LocalVariableTable entries with zero name/descriptor indices. No instruction, exception handler, constant pool or member signature changes.",
              "class_count": len(records),
              "changed_classes": sum(bool(r["removed_entries"]) for r in records),
              "removed_entry_count": sum(len(r["removed_entries"]) for r in records),
              "classes": records}
    args.report.parent.mkdir(parents=True, exist_ok=True)
    args.report.write_text(json.dumps(report, indent=2) + "\n")
    print(f"{report['removed_entry_count']} invalid entries removed from {report['changed_classes']} of {len(records)} classes; code regions unchanged")


if __name__ == "__main__":
    main()
