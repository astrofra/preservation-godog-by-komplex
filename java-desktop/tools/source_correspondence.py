#!/usr/bin/env python3
"""Account for every archived class and method without loading the Applet API."""
from pathlib import Path
import json
import struct
import re

ROOT = Path(__file__).resolve().parents[2]
RENAMES = json.loads((ROOT/'documentation/symbol-map.json').read_text())
CLASS_NAMES = RENAMES['classes']
MEMBER_NAMES = {(m['owner'], m['kind'], m['original_name'], m['original_descriptor']):
                m['proposed_name'] for m in RENAMES['members']}
# Existing platform adaptations, independent of descriptive symbol renaming.
PLATFORM_TYPES = {'java/applet/Applet': 'DesktopSurface',
                  'java/applet/AudioClip': 'desktop/audio/AudioClip',
                  'java/applet/AppletContext': 'kajjmka',
                  'sun/awt/image/ImageDecoder': 'java/awt/image/ImageProducer'}


def desktop_descriptor(descriptor):
    def replace(match):
        original = match[1]
        mapped = PLATFORM_TYPES.get(original, original)
        return 'L' + CLASS_NAMES.get(mapped.replace('/', '.'), mapped).replace('.', '/') + ';'
    return re.sub(r'L([^;]+);', replace, descriptor)


def declarations(data, selected='methods'):
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
            if group == selected: result.append({'name':strings[name], 'descriptor':strings[descriptor]})
            for _ in range(u2()): take(2); take(u4())
    return result


def main():
    report = []
    for original in sorted((ROOT/'original/classes').rglob('*.class')):
        relative = original.relative_to(ROOT/'original/classes')
        owner = str(relative.with_suffix('')).replace('/', '.')
        desktop_class = CLASS_NAMES.get(owner, owner)
        source_relative = relative.with_suffix('.java')
        desktop_relative = Path(desktop_class.replace('.', '/'))
        source = ROOT/'java-desktop/src/main/java'/desktop_relative.with_suffix('.java')
        compiled = ROOT/'java-desktop/build/classes/java/main'/desktop_relative.with_suffix('.class')
        retired = not source.exists()
        if retired: source = ROOT/'java-desktop/legacy-platform'/source_relative
        assert source.exists(), source
        baseline = 'cfr' if original.stem in ('maaakkk','kmjjkkk','mmaakka') else 'procyon'
        same_source = source.read_bytes() == (ROOT/'reverse'/baseline/source_relative).read_bytes()
        current = declarations(compiled.read_bytes()) if not retired else []
        entries = []
        for method in declarations(original.read_bytes()):
            target = {'name': MEMBER_NAMES.get((owner, 'method', method['name'], method['descriptor']), method['name']),
                      'descriptor': desktop_descriptor(method['descriptor'])}
            assert retired or target in current, (relative, method, target)
            platform_changed = any('L'+name+';' in method['descriptor'] for name in PLATFORM_TYPES)
            status = ('legacy-platform-reference' if retired else 'platform-signature-adapted' if platform_changed
                      else 'same-signature' if target == method else 'symbol-renamed')
            entries.append({**method, 'status':status, 'desktop_name': target['name'],
                            'desktop_descriptor': target['descriptor'] if not retired else None})
        # Every explicitly renamed field must also resolve exactly in the desktop class.
        fields = declarations(compiled.read_bytes(), 'fields') if not retired else []
        for member in RENAMES['members']:
            if member['owner'] == owner and member['kind'] == 'field':
                assert {'name':member['proposed_name'], 'descriptor':desktop_descriptor(member['original_descriptor'])} in fields, member
        report.append({'class':owner, 'desktop_class':desktop_class, 'source':str(source.relative_to(ROOT)),
                       'baseline':baseline, 'source_unchanged':same_source, 'methods':entries})
    target = ROOT/'documentation/java-desktop-correspondence.json'
    target.write_text(json.dumps({'note':'Signature correspondence is not a proof of behavioral equivalence. See java-desktop-restoration.md for edits and differential validation; symbol-map.json records applied names.', 'classes':report},indent=2)+'\n')
    print(f'Accounted for {len(report)} classes, {sum(len(c["methods"]) for c in report)} methods; {sum(c["source_unchanged"] for c in report)} source files unchanged from selected decompiler.')
    for c in report:
        for m in c['methods']:
            if m['status']=='platform-signature-adapted':print(c['class'],m)

if __name__=='__main__': main()
