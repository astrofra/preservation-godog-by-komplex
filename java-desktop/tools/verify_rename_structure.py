#!/usr/bin/env python3
"""Verify that runtime sources differ from the naming baseline only at mapped identifiers.

This milestone check requires the recorded Git revision. It intentionally rejects
later algorithm edits; use the independent behavioral checks for later changes.
"""
from pathlib import Path
import json
import re
import subprocess

ROOT = Path(__file__).resolve().parents[2]
# Retain whitespace, comments and literals as exact tokens, rather than stripping
# them. Numeric literals are also indivisible so an exponent cannot look like a name.
TOKEN = re.compile(r'''//[^\n]*|/\*[\s\S]*?\*/|"(?:\\.|[^"\\])*"|'(?:\\.|[^'\\])*'|(?:0[xX][0-9a-fA-F]+|(?:\d+\.?\d*|\.\d+)(?:[eE][+-]?\d+)?)[fFdDlL]?|[A-Za-z_$][A-Za-z0-9_$]*|\s+|.''')
IDENTIFIER = re.compile(r'[A-Za-z_$][A-Za-z0-9_$]*\Z')


def git(*args):
    return subprocess.check_output(['git', '-C', str(ROOT), *args]).decode('utf-8')


def main():
    mapping = json.loads((ROOT/'documentation/3d-symbol-map.json').read_text())
    revision = mapping['baseline_commit']
    classes = mapping['classes']
    allowed = set(classes.items()) | {(m['original_name'], m['proposed_name']) for m in mapping['members']}
    prefix = 'java-desktop/src/main/java/'
    paths = git('ls-tree', '-r', '--name-only', revision, '--', prefix).splitlines()
    expected = set()
    changed_tokens = 0
    for name in paths:
        if not name.endswith('.java'):
            continue
        relative = Path(name.removeprefix(prefix))
        owner = str(relative.with_suffix('')).replace('/', '.')
        target = ROOT/prefix/Path(classes.get(owner, owner).replace('.', '/')).with_suffix('.java')
        expected.add(target)
        before = git('show', revision+':'+name)
        after = target.read_text()
        old_tokens, new_tokens = TOKEN.findall(before), TOKEN.findall(after)
        assert ''.join(old_tokens) == before and ''.join(new_tokens) == after, name
        assert len(old_tokens) == len(new_tokens), f'Token count changed: {name}'
        for old, new in zip(old_tokens, new_tokens):
            if old != new:
                assert IDENTIFIER.fullmatch(old) and IDENTIFIER.fullmatch(new) and (old, new) in allowed, (name, old, new)
                changed_tokens += 1
    actual = set((ROOT/prefix).rglob('*.java'))
    assert expected == actual, ('Added/omitted runtime source files', expected ^ actual)
    print(f'PASS: all {len(expected)} runtime sources retain exact structure, literals, comments and arithmetic; {changed_tokens} mapped identifier substitutions.')


if __name__ == '__main__':
    main()
