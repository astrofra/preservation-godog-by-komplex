# Applied descriptive names

Date: 2026-10-08. The user authorized the 3D-engine subset first, then all
remaining proposals in the review CSV. Both stages modify the desktop sources
directly. The [complete applied map](symbol-map.json) now supersedes the
[3D-only map](3d-symbol-map.json), which remains a historical stage record.

## Coverage

| Stage | Classes | Method declarations | Fields |
| --- | ---: | ---: | ---: |
| 3D engine and direct consumers | 49 | 54 | 32 |
| Remaining proposals | 55 | 58 | 47 |
| Total renamed | **104** | **112** | **79** |

All 295 `rename` proposals in the CSV are applied. The eight existing audio
class names recommended as `keep` remain unchanged. The original CSV is retained
as a review snapshot, rather than rewriting a spreadsheet open in the user's
editor; the explicit user authorizations and complete map record application.
The [correspondence report](java-desktop-correspondence.json) still accounts for
all 112 original classes and 1,143 methods, including constructors and static
initializers. Six source files remain byte-identical to the selected decompiler
baseline. Renamed source filenames match their new class names.

This completes the proposed naming table, not complete deobfuscation of every
member. Unlisted methods and fields, local variables and parameters retain their
names. None of the names is presented as recovered author spelling.

## Remaining subsystem names

The final stage names the orchestration (`GodogDemo`, `GraphicsRoutine`,
`EndscreenRoutine`), desktop compatibility contracts (`DesktopDemoBase`,
`DesktopResourceContext`, `DesktopParameterStub`), audio engine (`ModuleLoader`,
`ModuleSong`, `ModuleSequencer`, `ModuleVoice`, `ModuleChannel`, `MixerBus`,
`Envelope`, `EnvelopeCursor`), music/script scheduling (`SongPositionQueue`,
`ScriptEventScheduler`, `ScriptEventListener`), and embedded movie subsystem
(`MoviePlayer`, `MovieTimeline`, `MovieRasterizer`, `MovieShapeDecoder`,
`MovieController`, `MovieBounds`, `MovieSignal`). Module header constants are
grouped under descriptive class names. Binary-reading helpers use explicit byte
order and signedness names, such as `ByteReaders.readUnsignedShortLE`.

The standalone launcher remains `GodogDesktop`; Gradle and installed launch
commands remain the same. All references to renamed declarations, constructors
and inherited members were updated with javac-resolved symbol identities.
Reflection into archived classes retains original lookup strings. Runtime
strings, scene IDs, properties such as `godog.mute`, media paths, calculations,
cast sequences and loop bounds are unchanged. Original artifacts and both
decompiler trees remain immutable.

## Regression checks

Validation on Homebrew OpenJDK 25.0.2 / macOS arm64 includes:

- A clean build, including test/reference sources and the installed distribution.
- 47 byte-identical assets, image decoding and original UV narrowing semantics.
- 135 vector/vertex/UV cases and 256 camera orientations compared to original
  bytecode, including inherited fields and overloaded setters.
- 480 pixel-identical line-raster cases and **72 pixel-identical scene frames**.
- **4,092 sample-identical XM blocks**, covering over 190 seconds of music.
- Native AWT window/input/focus/minimize/restore/shutdown checks.
- Complete 192-second muted playback of the installed distribution launched
  from `/tmp`: all seven scene IDs appear in order, the end screen is reached,
  and the process exits successfully. The [playback transcript](symbol-renaming-playback.txt)
  records the command and actual scene timestamps.
- Exact declaration correspondence for all archived methods and all explicitly
  renamed fields.
- Structural comparison of all 114 runtime Java sources against the pre-renaming
  baseline: **4,506 mapped identifier substitutions**, with every other token,
  including literals, whitespace, comments, operators and numeric constants,
  unchanged. This complements behavioral tests; it does not alone prove Java
  name binding.

Commands from the repository root:

```sh
cd java-desktop
./gradlew clean check compareOriginal verifyWindow installDist
cd ..
python3 java-desktop/tools/source_correspondence.py
python3 java-desktop/tools/verify_rename_structure.py
```

The latter script uses the complete applied map and requires its recorded
baseline commit in local Git history. It intentionally detects subsequent
non-renaming changes; it is a milestone check rather than a requirement that
future development never change the code. Native-window and original Applet
scene comparisons require a display. Other JVMs and operating systems have not
been validated in this stage.
