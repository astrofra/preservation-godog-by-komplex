#!/usr/bin/env python3
"""Inventory class coverage and explicit diagnostics without editing Java output."""

import argparse
import hashlib
import json
from pathlib import Path
from zipfile import ZipFile


MARKERS = {
    "failed_method": ('throw new IllegalStateException("Decompilation failed")',
                      "This method could not be decompiled", "An error occurred while decompiling"),
    "unstructured_code": ("Unable to fully structure code",),
    "missing_dependency": ("Could not load the following classes:",),
}


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--input", type=Path, default=Path("original/GODOG.ZIP"))
    parser.add_argument("--output-root", type=Path, default=Path("reverse"))
    args = parser.parse_args()
    with ZipFile(args.input) as archive:
        expected = sorted(name[:-6] + ".java" for name in archive.namelist()
                          if name.endswith(".class"))
    report = {"input": str(args.input), "expected_class_count": len(expected),
              "limitation": "Class-file coverage and explicit diagnostic scan only; no compilation or behavioral equivalence claim.",
              "tools": {}}
    complete = True
    for tool in ("cfr", "procyon"):
        base = args.output_root / tool
        files = sorted(base.rglob("*.java"))
        actual = {p.relative_to(base).as_posix() for p in files}
        missing = sorted(set(expected) - actual)
        unexpected = sorted(actual - set(expected))
        records = []
        for path in files:
            data = path.read_bytes()
            lines = data.decode("utf-8").splitlines()
            diagnostics = [{"kind": kind, "line": index, "text": line.strip()}
                           for index, line in enumerate(lines, 1)
                           for kind, markers in MARKERS.items()
                           if any(marker in line for marker in markers)]
            records.append({"path": str(path), "class_entry": path.relative_to(base).as_posix()[:-5] + ".class",
                            "bytes": len(data), "lines": len(lines),
                            "sha256": hashlib.sha256(data).hexdigest(), "diagnostics": diagnostics})
        summary = {kind: sum(d["kind"] == kind for r in records for d in r["diagnostics"])
                   for kind in MARKERS}
        report["tools"][tool] = {"java_file_count": len(files), "missing": missing,
                                 "unexpected": unexpected, "diagnostic_counts": summary,
                                 "files": records}
        complete = complete and not missing and not unexpected
        print(f"{tool}: {len(files)}/{len(expected)} classes; missing {len(missing)}; diagnostics {summary}")
    evidence = args.output_root / "evidence"
    evidence.mkdir(parents=True, exist_ok=True)
    (evidence / "coverage.json").write_text(json.dumps(report, indent=2) + "\n")
    return 0 if complete else 1


if __name__ == "__main__":
    raise SystemExit(main())
