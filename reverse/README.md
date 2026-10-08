# Independent decompilation references

CFR **0.152** and Procyon **0.6.0** each produced **112 Java files** from Godog's
112 classes. These files are decompiler reconstructions, not recovered original
source or a validated Java desktop implementation. Names and generated diagnostics
are retained, and neither output tree has been manually corrected.

| Path | Contents |
| --- | --- |
| `cfr/` | CFR output from the metadata-normalized working input. |
| `procyon/` | Procyon output from the same working input. |
| `raw/cfr/` | First CFR attempt on the unchanged original archive. |
| `raw/procyon/` | First Procyon attempt on the unchanged original archive. |
| `raw/evidence/` | First-attempt logs, run records and coverage report. |
| `inputs/godog-decompiler-input.jar` | Derived class-only archive, with invalid local-variable debug entries removed. |
| `evidence/` | Extraction inventory, class inventory, normalization report, bytecode comparison, tool runs and output coverage. |

## Input preservation and necessary preparation

`original/GODOG.ZIP` is an unchanged extraction of the nested entry in
`original/godog_by.zip`. `original/classes/` contains its 112 original class
files with package paths retained. Extraction hashes are in
[`evidence/extraction.json`](evidence/extraction.json), and all original artifacts
are covered by [`original/SHA256SUMS`](../original/SHA256SUMS).

All classes use class-file version **45.3**. Outer class structures are readable,
but **101 classes each contain one invalid `LocalVariableTable` entry** with
both name and descriptor constant-pool indices set to zero. The first CFR run
produced 112 files with 78 explicit method failures; the first Procyon run produced
only 11 files. Both processes nevertheless exited with status zero.

[`prepare_decompiler_input.py`](prepare_decompiler_input.py) removes only those
invalid entries from a separate working copy. It retains valid entries, other
attributes, constant pools, field/method declarations, executable instructions
and exception tables, adjusting enclosing attribute lengths. The derived JAR
contains only the classes needed for decompilation; original media remain in
the original archive.

The preparation report records every removed entry with its original byte offset
and bytes. Its comparison verifies that all **1,115 Code prefixes** (stack/local
limits, instructions and exception tables) remain unchanged. Separately,
`javap -p -c -s` on all 112 classes produced **byte-identical text before and
after preparation**, including descriptors, instructions and exception tables.
See [`evidence/bytecode-comparison.json`](evidence/bytecode-comparison.json)
and the shared [`javap disassembly`](evidence/original.javap.txt).

## Coverage and remaining limits

| Result | CFR | Procyon |
| --- | --- | --- |
| Java files / original classes | 112 / 112 | 112 / 112 |
| Missing or unexpected output classes | 0 | 0 |
| Explicit failed-method placeholders detected | 1 | 0 |
| Unstructured-code diagnostics detected | 18, across 11 classes | 0 |
| Missing-dependency warning headers | 4 | 0 |

CFR cannot reconstruct `muhmu.hifi.device.DeviceMSbase.hoxBuff(int[], int,
byte[], int, int)` in this run; it reports a switch-structure error. Procyon's
output contains a reconstruction of that method. CFR's
[`summary.txt`](cfr/summary.txt) identifies its remaining method-level problems;
[`evidence/coverage.json`](evidence/coverage.json) maps every output to its class,
hash, size and diagnostic locations. An absence of diagnostic markers does not
establish semantic equivalence or compilability.

The archive does not supply 13 statically referenced Microsoft extension types
under `com/ms/`, including DirectSound and AWT peer interfaces. Legacy Sun audio
types also appear in CFR's missing-dependency warnings. These are recorded in
the inventory/output; no substitutes or platform stubs have been invented.
Dependency closure for reflection and dynamically built resource paths has not
been established. No demo code was executed or compiled into a new application.

## Reproduce into a fresh directory

Run from the repository root. Tool JARs were already installed by Homebrew;
provide explicit paths for other machines. Exact tool JAR hashes, actual Java
version, commands, timestamps and process results are in `evidence/*.run.json`.
The recorded runtime is Homebrew **OpenJDK 25.0.2**. `java_home` discovery is
unnecessary because the runner resolves the Java executable on PATH.

```bash
CFR_JAR=/opt/homebrew/Cellar/cfr-decompiler/0.152/libexec/cfr-0.152.jar
PROCYON_JAR=/opt/homebrew/Cellar/procyon-decompiler/0.6.0/libexec/procyon-decompiler-0.6.0.jar
decompilation_dir=$(mktemp -d)
python3 reverse/prepare_decompiler_input.py \
  --output "$decompilation_dir/godog-decompiler-input.jar" \
  --report "$decompilation_dir/input-normalization.json"
python3 reverse/decompile.py cfr --jar "$CFR_JAR" \
  --input "$decompilation_dir/godog-decompiler-input.jar" \
  --output-root "$decompilation_dir"
python3 reverse/decompile.py procyon --jar "$PROCYON_JAR" \
  --input "$decompilation_dir/godog-decompiler-input.jar" \
  --output-root "$decompilation_dir"
python3 reverse/audit_outputs.py --output-root "$decompilation_dir"
(cd original && shasum -a 256 -c SHA256SUMS)
(cd reverse && shasum -a 256 -c SHA256SUMS)
```

The runner refuses to overwrite existing source or run evidence. To reproduce
the raw attempt, omit `--input` and use another fresh output directory. Raw run
records retain the exact commands used at the time: the original output paths
were `reverse/cfr/` and `reverse/procyon/`, then relocated to `reverse/raw/` to
preserve the failed attempts before the second pass.

CFR boilerplate/dead-method/bridge/synthetic-member hiding is disabled. Procyon
retains explicit casts, pointless switches and synthetic members (`-ec -ps -ss`).
These settings retain more documentary detail; they do not prevent all
decompiler transformations. No symbol renaming or executable-bytecode patching
was performed.

See the separate [French note on obfuscation](../documentation/obfuscation-notes-fr.md)
for a discussion of the evidence and the proposed comparison with Forward.
