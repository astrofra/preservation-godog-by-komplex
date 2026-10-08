#!/usr/bin/env python3
"""Account for every archived class and method without loading the Applet API."""
from pathlib import Path
import json
import struct

ROOT = Path(__file__).resolve().parents[2]


def methods(data):
    pos = 8
    def take(n):
        nonlocal pos
        result = data[pos:pos+n]; pos += n; return result
    def u2(): return struct.unpack('>H', take(2))[0]
    def u4(): return struct.unpack('>I', take(4))[0]
    count = u2(); strings = {}; index = 1
    sizes = {3:4,4:4,5:8,6:8,7:2,8:2,9:4,10:4,11:4,12:4,15:3,16:2,17:4,18:4,19:2,20:2}
    while index < count:
        tag = take(1)[0]
        if tag == 1: strings[index] = take(u2()).decode('utf-8', errors='replace')
        else: take(sizes[tag])
        index += 2 if tag in (5,6) else 1
    take(6); take(u2()*2)
    result = []
    for group in ('fields','methods'):
        for _ in range(u2()):
            access, name, descriptor = u2(), u2(), u2()
            if group == 'methods': result.append({'name':strings[name], 'descriptor':strings[descriptor]})
            for _ in range(u2()): take(2); take(u4())
    return result


def main():
    report = []
    for original in sorted((ROOT/'original/classes').rglob('*.class')):
        relative = original.relative_to(ROOT/'original/classes')
        source_relative = relative.with_suffix('.java')
        source = ROOT/'java-desktop/src/main/java'/source_relative
        compiled = ROOT/'java-desktop/build/classes/java/main'/relative
        retired = not source.exists()
        if retired: source = ROOT/'java-desktop/legacy-platform'/source_relative
        assert source.exists(), source
        baseline = 'cfr' if original.stem in ('maaakkk','kmjjkkk','mmaakka') else 'procyon'
        same_source = source.read_bytes() == (ROOT/'reverse'/baseline/source_relative).read_bytes()
        current = methods(compiled.read_bytes()) if not retired else []
        entries = []
        for method in methods(original.read_bytes()):
            candidates = [m for m in current if m['name'] == method['name']]
            exact = method in candidates
            target = method if exact else candidates[0] if len(candidates) == 1 else None
            status = 'legacy-platform-reference' if retired else 'same-signature' if exact else 'platform-signature-adapted' if target else 'missing'
            assert status != 'missing', (relative, method)
            entries.append({**method, 'status':status, 'desktop_descriptor': target['descriptor'] if target else None})
        report.append({'class':str(relative.with_suffix('')).replace('/','.'), 'source':str(source.relative_to(ROOT)),
                       'baseline':baseline, 'source_unchanged':same_source, 'methods':entries})
    target = ROOT/'documentation/java-desktop-correspondence.json'
    target.write_text(json.dumps({'note':'Signature correspondence is not a proof of behavioral equivalence. See java-desktop-restoration.md for edits and differential validation.', 'classes':report},indent=2)+'\n')
    print(f'Accounted for {len(report)} classes, {sum(len(c["methods"]) for c in report)} methods; {sum(c["source_unchanged"] for c in report)} source files unchanged from selected decompiler.')
    for c in report:
        for m in c['methods']:
            if m['status']=='platform-signature-adapted':print(c['class'],m)

if __name__=='__main__': main()
