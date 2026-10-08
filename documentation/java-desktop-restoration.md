# Godog: Java desktop restoration

Date: 2026-10-08. Target: the installed Homebrew OpenJDK 25.0.2 on macOS arm64.
The scope is a runnable desktop Java reference, preserving decompiled structure;
no native port, browser port or bundled-JVM installer is included.

## Source fidelity

All 112 recovered classes have a counterpart: 109 are compiled, and three
obsolete audio backends are retained under `java-desktop/legacy-platform/`.
Procyon is the default source. CFR supplies `maaakkk` (XM processing), `kmjjkkk`
(mesh loading) and `mmaakka` (movie player), where Procyon could not express valid
Java. Fields, scene boundaries, script strings and assets remain. After the
user-authorized [3D-engine naming pass](3d-engine-renaming.md), 49 class names,
54 method declarations and 32 fields use descriptive names; 46 files remain
byte-identical to their selected decompiler baseline, including the three retired
platform references (90 files before renaming). The added desktop infrastructure
is separate. Original names in the historical correction tables below refer to
the archive; [the applied map](3d-symbol-map.json) resolves their desktop names.

The [machine-readable correspondence](java-desktop-correspondence.json) accounts
for all 1,143 original methods by class, name, descriptor and destination. Four
return descriptors change at platform boundaries. This inventory establishes
coverage, not behavioral equivalence. Regenerate it after compiling:

```sh
python3 java-desktop/tools/source_correspondence.py
```

Archived ZIPs, extracted original classes, the normalized decompiler input and
both decompilation trees were kept unchanged. All 47 media files under
`java-desktop/assets/` are byte-identical extractions from `original/GODOG.ZIP`.
Git text conversion is disabled for those assets. Inherited decompiler whitespace
is retained to keep baseline comparisons meaningful.

## Platform boundaries

| Classes | Adaptation |
| --- | --- |
| `DesktopSurface`, `GodogDesktop` (new) | Installation-relative assets, EDT-owned AWT window, logical framebuffer, integer scaling, modern event listeners, capture and duration options. |
| `kmaamma`, `godog` | Explicit start/stop lifecycle, cooperative render cancellation, desktop entry point, audio selection and frame publication. The browser-to-borderless-window transition stays in the same desktop window. |
| `kajjmka`, `kmajmmk`, `kmaakma` | Local parameter/resource contracts replace Applet context/stub types; original helper names remain. |
| `JavaSoundDevice` (new) | Signed 16-bit little-endian stereo at 22,050 Hz, using the recovered packed-stereo XM mixer. Output-buffer timing feeds the original music cue queue. |
| `desktop.audio.AudioClip`, `StreamAudioPlayer` (new), `kajakmk`, `mmaakka` | Replace the legacy movie player's Applet audio contract and internal Sun streaming API. Godog's actual intro is advanced by its original `kmjamma` scene path. |
| `mmjjkmk` | Replace the internal Sun image decoder with public ImageIO/ImageProducer APIs. |
| `DeviceMSbase`, `DeviceNoSound` | Retained legacy helpers use interruption instead of removed thread stopping; the desktop launcher does not select them. |

The engine draws into an image, then publishes an immutable frame snapshot.
A separate native `Canvas` paints that snapshot on the EDT. This separation is
essential: the first native-window attempt remained blank because the recovered
`getGraphics()` compatibility override also intercepted AWT painting. Internal
PNG captures alone did not expose that failure; the user's screenshot did.
The corrected window was verified through a native window capture and user feedback.

Shutdown interrupts and joins the active render and XM workers, closes the audio
line, disposes the window and exits. Unexpected render/audio failures cause a
nonzero exit. Esc closes the application; F retains the original FPS toggle.
Mouse coordinates are mapped from the scaled window to 512 × 256; focus loss
clears the pressed state. Scaling never changes engine coordinates or formulas.

The original music pattern/row script, `maajmka` averaging clock, per-scene clock
resets and render-loop sleep remain. Mute mode still runs the full mixer and
paces by generated samples. Normal playback timestamps queued audio using the
Java Sound line's playback position. Capture times are relative to music start,
not process launch or asset loading.

## Decompiler corrections

| Location | Evidence and correction |
| --- | --- |
| `godog`, `kmajmmk`, `kmjjkkk`, `mmaakka` | Restore explicit casts or split locals whose inferred `Object`/`Serializable` types made valid operations uncompilable. |
| `kmjakka`, `kajakmk`, `mmjakmk` | Remove pseudo-`monitorexit` statements already represented by Java `synchronized` blocks. |
| `mmajmmk` | Declare the checked interruption thrown by the original `wait()` calls. |
| `kajamma`, `maajmmk`, `mmaakka` | Remove unreachable trailing `break` statements emitted after unconditional control transfers. |
| `mmjamka` | Recover three horizontal-line loops as `while (distance-- > 0)`, following the original branch to the condition. |
| `kmjammk.aKKAMAJ` | Save the row end before iteration. Procyon emitted `j < j + count`, causing an out-of-bounds crash when “evil” began. CFR and original bytecode establish the fixed endpoint. |
| `mmaamma.AMaJakK`, `mmaamma.aMajakK`, `kmaakma.MajaKkA` / `MaJAKkA` | Restore all six `f2l; l2i` / `d2l; l2i` sequences. Both decompilers incorrectly removed intermediate `long` conversions. |
| `mmjjmmk.kkaMaJa`, `mmaakkk.JAKkama`, `kmajmma.JAKKAma` | Restore count-limited loops. Procyon incorrectly traversed the entire allocated array, including unused or stale entries. |

The UV error was the same one fixed in Forward commit
`adc4c36c6d3d294974807498bb5eb88addabc6c3` (“Fixed a precision-related issue in the
rasterizer”), inspected in the user's local Forward repository. Converting a
large fixed-point float directly to `int` saturates; converting through `long`
wraps when narrowed to `int`. For example, `0.75f * 2^32` yields `2147483647`
with the incorrect conversion and `-1073741824` with the original one. This
produced faceted UVs, overbright reflective geometry and dark terrain. Geometry
and textures did not need redesigning. Nearby genuine `f2i` operations remain.

The count-bound error also drew obsolete triangles after a metaball changed
shape. A fixed-time comparison found 3,055 erroneous pixels persisting into
later scenes; restoring the original active counts removed them.

## Validation

`./gradlew check compareOriginal installDist` passes on the installed JDK.
Gradle 9.4.0 is pinned with its distribution SHA-256; its
[compatibility matrix](https://docs.gradle.org/9.4.0/userguide/compatibility.html)
supports this build JVM. The application has no third-party runtime libraries.

- All 47 assets match the original ZIP; all 39 external images decode.
- Numeric tests compare overflow, NaN and infinity behavior to original bytecode.
- 480 line-rasterizer cases match original bytecode pixel for pixel.
- 4,092 XM blocks (slightly over 190 seconds at 22,050 Hz) match the original
  bytecode sample for sample. The user also confirmed audible playback.
- Six software scenes (`movieintro`, `paa`, `trav`, `vehje`, `evil`, `linjanen`)
  originally produced 18 pixel-identical frames at local times 0, 10 and 20
  seconds. The naming regression suite now covers **72 pixel-identical frames**
  at 12 times, including adjacent frames, against the archived classes on JDK 25.
- Native AWT validation exercises window creation, scaled mouse press/release,
  focus loss, the F callback, minimize/restore and closing via `WINDOW_CLOSING`.
- Complete real-time playback with Java Sound reached `endscreen` around
  188.6 seconds and closed at the requested duration. Launching the installed
  distribution from `/tmp` successfully resolves its own assets.

The reference harness deliberately invokes the archived Applet classes through
reflection, in a separate class loader and test process. The installed desktop
application neither includes nor loads that harness. Its controlled random seed
and JVM access flag are test-only. Window checks complement offscreen comparisons.

The [validation transcript](java-desktop-validation.txt) records commands and
results, including the final complete muted run and its seven scene timestamps.
The [video comparison sheet](../img/desktop-video-comparison.png) pairs YouTube
frames with restored frames at 15, 75, 105, 135 and 165 seconds. It was generated
from the 2026-10-08 restoration worktree on macOS arm64 / JDK 25, at the logical
512 × 256 size, with no user input. These are restoration captures, not historical
screenshots. Regenerate after capturing a full run:

```sh
python3 java-desktop/tools/video_comparison.py --captures java-desktop/build/captures-verified
```

Video comparisons use the recovered YouTube capture for scene order, timing and
large visual forms. It is compressed, resized and captured under unknown JVM,
audio and timing conditions. Random overlays and frame averaging also prevent
an arbitrary timestamp from being an exact image match. We retain the recovered
timing instead of introducing a fitted speed correction. The stronger pixel and
sample comparisons above are against original bytecode on the current machine,
not a claim of equivalence to every historical JVM or audio device.

Remaining limitations: browser navigation/device-tuner paths are documentary,
not supported desktop workflows; generalized embedded movie audio is not covered
by Godog's full-playback test. Original deprecated AWT helpers and no-op finalizer
compatibility methods remain and produce compilation warnings. Windows/Linux,
different audio hardware and a bundled runtime were not validated in this stage.

The local `reactivate-maeda-java` skill now routes Komplex productions to
`references/komplex-java.md`, recording the UV narrowing and loop-bound pitfalls,
the Forward commit and the differential validation approach.
