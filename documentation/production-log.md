# Production log

## 2026-10-08 — Initial recovery

### User request

Begin preserving Godog by Komplex from
<https://www.pouet.net/prod.php?which=888>. Use `documentation/` for English
production notes and decisions, `img/` for communication images,
`java-desktop/` for the future Java reconstruction, `original/` for original
artifacts and the YouTube download, and `reverse/` for CFR and Procyon output.
Recover the demo files and the linked YouTube video with yt-dlp, then stop.
The user also authorized supplementing the relevant preservation skill if these
recovery steps were missing.

### Findings and decisions

- The repository initially contained only an English README and had a clean
  working tree and index. Its initial commit was `6a12dda`.
- Pouët identifies the production as Godog by Komplex, released in August 1998,
  ranked first in the Assembly 1998 Java demo competition. This is catalog
  metadata, not a claim established by running the recovered program.
- The download link leads to the Scene.org landing page for `godog_by.zip`.
  That page advertises 1,732,444 bytes and a file date of
  `2014-09-12 06:59:46`; this hosting date is distinct from the demo's release.
- The YouTube link is <https://youtu.be/VbOJRJEa5N8>.
- Implementation decision: preserve both landing pages and HTTP response
  evidence, keep the distribution ZIP intact, and place the video and its
  metadata under `original/video/`. Verify archive integrity without running
  any recovered Java code. Use the best video/audio streams yt-dlp offers and
  merge them without re-encoding.
- `img/`, `java-desktop/`, `reverse/cfr/` and `reverse/procyon/` are reserved with
  `.gitkeep` files. No decompilation or reconstruction is part of this milestone.
- The local `reactivate-maeda-java` skill already covers original-file retention,
  hashes, English notes and local milestone commits, but lacks recovery from a
  Pouët catalog page and acquisition of linked video references with yt-dlp.
  The skill and its recovery guide were updated to add this workflow, including
  nested ZIP validation, video metadata and integrity checks, and to recognize
  Java demoscene artifacts. Its UI metadata was updated consistently. The
  `skill-creator` validator passed. These local skill files live outside this
  repository at `~/.codex/skills/reactivate-maeda-java/`.

### Completed recovery and checks

- [`godog_by.zip`](../original/godog_by.zip): 1,732,444 bytes, matching the
  Scene.org listing. The automatic download redirected to the NetCologne
  Scene.org mirror and returned HTTP 200 with `application/zip`.
- The outer ZIP contains `GODOG.ZIP`, `ZEPOINFO.TXT` and `scene.org.txt`.
  The nested ZIP is 1,739,555 bytes and contains 166 entries: 161 files and
  five directories. Files include 112 Java classes, 32 JPEGs, seven GIFs,
  seven custom data files, `data/rocket.xm`, `godog.html` and `readme.txt`.
  CRC checks passed for every entry in both ZIPs. Neither archive was modified
  or unpacked into the reconstruction directories.
- The nested `readme.txt` dates this build to August 7, 1998, around 17:00,
  describes it as a rushed version, and mentions expected later versions.
  We recovered the distribution linked by Pouët; whether a later build exists
  remains uninvestigated. The embedded applet declaration names `godog` and
  specifies 512 × 256 pixels. `ZEPOINFO.TXT` reports first place and 3,494 points,
  spelling the group name “Complex”; that spelling is preserved in the archive.
- [`godog-komplex-VbOJRJEa5N8.mkv`](../original/video/godog-komplex-VbOJRJEa5N8.mkv):
  71,007,435 bytes, 188.928 seconds (about 3:09), 1280 × 640, H.264 video and
  stereo Opus audio at 48 kHz. yt-dlp selected formats `298+251` and merged
  them into Matroska without re-encoding. YouTube advertises 60 fps; ffprobe's
  reported rates are retained in the [probe report](video-ffprobe.json).
- Video metadata credits uploader **Gabriele D'Antona**, upload date
  **2018-07-28**, title **godog - Complex (1998)**. The JSON metadata,
  description and available WebP thumbnail are retained. This is a later
  capture; its recording hardware, JVM, synchronization and historical
  playback fidelity remain unknown.
- ffprobe confirmed both streams. A full FFmpeg decode of video and audio
  completed with exit code 0; [`video-decode.log`](video-decode.log) is empty
  because no errors were reported. The [download log](video-download.log)
  records successful acquisition and merging; unavailable higher-resolution
  thumbnail variants were skipped automatically before a thumbnail succeeded.
- The [archive inventory](archive-inventory.json) records both archive layers.
  The [manifest](../original/manifest.json) records provenance, sizes,
  SHA-256 hashes and validation status. [SHA256SUMS](../original/SHA256SUMS)
  covers all preserved artifacts, acquisition sidecars and the manifest.
- The requested directory structure is in place. No Java code was executed,
  no decompiler was run, and reconstruction has not begun. This completes the
  requested first stage.

See [recovery commands](recovery-commands.md) for tool versions and reproducible
download and verification commands. The recovery milestone is committed locally
using the existing Git identity; no push is part of this task.

## 2026-10-08 — Demozoo screenshot references

The user extended recovery to the Demozoo record linked from Pouët and requested
that this discovery path be added to the preservation skill.

- The already archived Pouët page contains Demozoo ID **21114**, including a
  link to the screenshot gallery in a comment. The matching Demozoo production
  record is **GODOG by Komplex**.
- One full-size PNG was downloaded from the image link on the Demozoo production
  page, obtained through the web reader. The file is retained unchanged under
  `original/screenshots/demozoo/`; both Pillow verification and full decoding
  passed, and visual inspection confirmed a Komplex title image at 512 × 256.
- The complete gallery could not be enumerated: direct HTTP requests returned
  403, while a reader service and an isolated headless Chrome attempt reached
  Cloudflare's security challenge. The automated browser was stopped. Failure
  evidence is retained separately from successfully recovered original artifacts.
  This reference recovery is explicitly partial.
- The [reference index](screenshot-references.md) records the image's source,
  visual content, unknown capture conditions and the gallery access limitation.
  The preservation manifest and SHA-256 inventory were extended without changing
  previously downloaded artifacts.
- The local `reactivate-maeda-java` skill now directs agents to follow Pouët's
  Demozoo ID, check the full gallery, recover original-size images, verify them,
  and preserve provenance while reporting incomplete recovery. The update is in
  `SKILL.md` and `references/recovery.md`, outside this repository.

## 2026-10-08 — Independent decompilation references

The user requested CFR and Procyon decompilation as two independent references.
The working tree and index were clean when this stage began.

- Installed tools are CFR 0.152 and Procyon 0.6.0. The available `java` executable
  is Homebrew OpenJDK 25.0.2; macOS's `/usr/libexec/java_home` does not discover
  this installation, so the actual executable on PATH is used.
- Preserve `godog_by.zip`, extract the nested `GODOG.ZIP` and its 112 class files
  byte-for-byte, and keep package paths. Record the extraction relationship and
  input hashes. Only recovered classes will be used as decompiler input.
- Keep each tool's output under `reverse/cfr/` or `reverse/procyon/`, with tool
  versions, commands, logs and coverage evidence. Retain obfuscated names and
  tool-generated warnings. Decompiled Java is reconstructed source, not the
  original author's source and not yet a buildable desktop adaptation.

### Findings, correction and validation

- All 112 recovered classes have version 45.3 and pass outer-structure parsing.
  The static inventory finds 13 unresolved Microsoft extension types; this does
  not explain the first decompilation failure.
- Direct decompilation exposed invalid nested debug metadata. CFR produced 112
  files with 78 explicit method failures; Procyon produced only 11 files with
  repeated constant-pool exceptions. Both exited with status zero, demonstrating
  why output coverage and diagnostics must be checked separately.
- Inspection confirmed one `LocalVariableTable` entry with zero name and
  descriptor indices in each of 101 classes. The original `godog.main` descriptor
  is `([Ljava/lang/String;)V`, but the first CFR output incorrectly dropped its
  parameter. The original verbose `javap` evidence records `Bad CP index: 0`.
- Implementation decision: retain the direct attempts in `reverse/raw/` and
  create a derived class-only JAR removing only those 101 invalid entries. The
  script records every removed entry and leaves the originals intact. This is
  an input-metadata workaround, not a code repair or a desktop reconstruction.
- All 1,115 code regions retained identical stack/local limits, instructions and
  exception tables. Independent `javap -p -c -s` output for all 112 classes was
  byte-identical before/after preparation, including field and method descriptors.
- Both second-pass decompilers produced all 112 expected Java files. Procyon's
  output contains no detected failure markers. CFR retains 18 unstructured-code
  diagnostics and one failed method, `DeviceMSbase.hoxBuff`; Procyon supplies a
  reconstruction of that method. No claim of compilability or behavioral
  equivalence is made. The source trees retain the tools' original output.
- [Reverse-engineering notes](../reverse/README.md) document exact commands,
  preservation settings, input/output locations and limitations. Coverage and
  bytecode evidence are under `reverse/evidence/`. Original and derived artifacts
  have separate checksum inventories.
- The user noted a resemblance to Komplex's Forward and requested a separate
  French Markdown note about obfuscation. That language exception is limited to
  [`obfuscation-notes-fr.md`](obfuscation-notes-fr.md). The proposed shared-tool
  attribution is explicitly unverified; Forward was not examined in this stage.
- The local preservation skill's recovery guide was supplemented with the
  demonstrated malformed-debug-metadata workflow and verification requirements.

This stage stops at two documented decompilation references. No demo execution,
symbol renaming, Java desktop reconstruction or remote publication was performed.

## 2026-10-08 — Java desktop adaptation

The user requested a runnable desktop adaptation on the installed JDK, removal
of the Applet API, maximum retention of the decompiled structure, and comparisons
against the recovered video's timing and broad visual composition. New written
documentation returns to English; the earlier French note remains a separate
historical document.

The initial compilation uses Procyon as the baseline. CFR is selected for
`maaakkk` (XM pattern processing), `kmjjkkk` (mesh parsing) and `mmaakka` (movie
player), where Procyon emitted invalid Java. Platform work will replace the
Applet container, internal image/audio APIs and Microsoft DirectSound backends.
The recovered rasterizers, scene classes, sequence tables and XM mixer are retained.
The desktop application now runs on Homebrew OpenJDK 25.0.2 using AWT and Java
Sound. All 112 class counterparts and 1,143 original methods are accounted for;
90 source files remain byte-identical to the selected decompiler baseline.
The 47 external assets match the original ZIP byte for byte.

The first native test exposed a blank-window issue despite correct internal
captures. The user's screenshot helped identify the collision between the
recovered `getGraphics()` contract and AWT painting. A separate Canvas now paints
published frames; the user confirmed the visible result and correct sound.

Full-sequence and bytecode comparisons exposed additional decompiler errors:
a moving loop endpoint in the terrain renderer, active-count loops incorrectly
expanded to array capacity, and six missing intermediate `long` conversions.
The user pointed to Forward's history; commit
`adc4c36c6d3d294974807498bb5eb88addabc6c3` records the same fixed-point UV conversion
pitfall. Corrections follow Godog's own bytecode rather than changing the design.

Validation covers asset equality/decoding, numeric edge cases, 480 exact line
raster comparisons, more than 190 seconds of sample-identical XM mixing, and
18 exact scene-frame comparisons against archived classes with controlled random
state. AWT input/lifecycle checks pass; native playback reaches the final screen
around 188.6 seconds. Installation-relative loading was tested from `/tmp`.
The optional original-class comparison harness is separate from the desktop JAR
and uses the legacy API only in its reference test process.

Build/run instructions, platform changes and limits are recorded in
[Java desktop restoration](java-desktop-restoration.md). The local preservation
skill was updated at the user's request with a dedicated Komplex reference for
the UV and loop-bound failures. Original artifacts and decompiler trees remain
unchanged. No remote publication or native/browser port was performed.

## 2026-10-08 — Proposed descriptive symbol names

The user requested names inferred from code usage for classes, methods and
fields, with a CSV review and explicit approval before any replacements.
The [review table](symbol-renaming-review.csv) contains all 112 archived classes
and a first set of 112 method declarations and 79 fields. There are 295 rename
proposals and 8 recommendations to retain existing audio class names. All
decisions remain pending. Unlisted members are outside this first batch and
remain unchanged; the table does not claim complete deobfuscation.

Names distinguish the 3D renderer, movie player, module audio engine and scene
implementations. Descriptors retain overload identity; override groups link
callback declarations to their implementations. Reasons and source locations
support each proposal. Six class proposals carry medium confidence rather than
presenting a naming interpretation as certain. The accompanying
[review guide](symbol-renaming-review.md) defines approval fields, scope,
preservation rules and the checks required after any approved application.

Validation checked CSV parsing, unique identities, archived declarations,
desktop signatures, identifier syntax, proposed-name collisions and consistency
of the listed override groups. No Java source, executable, archived artifact or
decompiler output changed. Runtime tests were not repeated for this
documentation-only milestone. The mapping awaits user review.

## 2026-10-08 — Apply the 3D-engine naming subset

The user authorized direct desktop-source renaming of the 3D-engine portion,
with regression tests, noting the `fixed` tag. Applied 49 class names, 54 method
declarations and 32 fields from the reviewed proposals. The
[applied mapping](3d-symbol-map.json) records authorization and exact identities;
the original CSV stays unchanged, including its remaining pending proposals.
Unlisted engine members retain their names; this is a scoped naming pass rather
than complete deobfuscation. References from the demo and shared consumers were
updated using javac-resolved symbols. No algorithms, locals, parameters, literals,
assets or archived/decompiled artifacts changed.

Baseline checks passed before editing. The renamed version passed a clean build,
asset/numeric/audio comparisons, new vector/UV/camera differential checks, an
expanded 72-frame exact scene comparison, native AWT interaction and a short
installed-launcher run from `/tmp`. Original lookup strings in the comparison
harness remain unchanged and are now explicitly paired with desktop factories.
The correspondence report still covers all 112 archived classes and 1,143
methods. A new structural check verifies all 114 runtime sources against the
baseline: only 2,857 mapped identifier tokens changed. The mapping and
correspondence also verify renamed field and method descriptors.

[Naming and regression notes](3d-engine-renaming.md) record scope, commands,
results and limitations. No remote publication was performed.

## 2026-10-08 — Apply all remaining naming proposals

The user authorized all remaining names after the 3D-engine stage. Applied the
remaining 55 classes, 58 method declarations and 47 fields directly in desktop
sources and updated their consumers, including launcher and validation code.
The cumulative [symbol map](symbol-map.json) now accounts for all 295 rename
proposals: 104 classes, 112 method declarations and 79 fields. Eight existing
audio class names retain their `keep` recommendation. The original CSV and the
3D-only map remain historical review/stage records. Members outside the CSV
remain obfuscated; this milestone completes the proposed table.

As before, edits used javac-resolved symbol identities. The structural check
confirms all 114 runtime sources differ from the pre-renaming baseline only at
4,506 mapped identifier tokens. Runtime strings, arithmetic and decompiler
formatting remain exact. Both analysis scripts now use the cumulative map.
Declaration correspondence still covers all 112 archived classes and 1,143
methods, with six source files byte-identical to the decompiler baseline.

A clean build and distribution installation pass. Regression checks pass for
all assets, UV narrowing, vector/UV/camera behavior, 480 rasterizer cases, 72
scene frames and 4,092 XM blocks. Native-window and input checks also pass.
[The complete naming record](symbol-renaming-applied.md) describes scope and
reproduction commands. Original artifacts and decompiler trees remain unchanged;
no remote publication was performed.

The final installed-distribution run from `/tmp` completed 192 seconds of muted
playback, traversed all seven scene IDs through `endscreen`, and exited with
status zero. The [playback transcript](symbol-renaming-playback.txt) records
the command and timestamps. This also exercises the newly named orchestration,
music-position scheduling and end-screen lifecycle over the complete sequence.
