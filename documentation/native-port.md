# Native C++11 / SDL2 port

## Scope and source

The user requested a Linux/macOS/Windows executable with WebAssembly as the
later destination, and suggested the sibling Forward `cpp-offline` project as
reference. The first native milestone plays Godog's complete sequence using
its original external assets. It includes the SWF vector intro, all five 3D
scenes, overlays and script, XM music and end screen.

The executable Java baseline is commit `fe2ee73`, after the approved renaming
and restoration of the original `godog.java` entry name. No Java runtime source,
original archive or decompiler reference was modified for this port.

A restricted javac-based translator resolves types and symbols, retaining 75
class boundaries, 806 translated method/constructor bodies and 17 methods with
native implementations. These counts include javac's implicit constructors;
they are not an archival classfile coverage claim. The generator also emits
one compositor method extracted from the original `godog.run()` body and
reference-release methods for native ownership. Generated C++ is formatted
with pinned clang-format 20.1.8. The entry constructor omits the AWT loading-font
assignment; its artwork script and other initialization remain translated. It retains `godog` as the
artwork class; the native executable entry is the SDL adapter in `main.cpp`.

[The correspondence CSV](../native-sdl2/correspondence.csv) records fields,
overloaded methods, adapters and omitted platform or unused declarations.
Java permits a field and method to have the same name; C++ fields with such a
collision have a `_field` suffix. Access is public in the generated layer to
keep platform adapters and preservation probes simple. Algorithms and recovered
member names are otherwise retained.

Forward's original-image loader was reused with its provenance recorded in
[native-sdl2/PROVENANCE.md](../native-sdl2/PROVENANCE.md). Its condensed scene
engine and tracker implementation were not substituted for Godog's own code.

## Numeric behavior and ownership

The compatibility layer explicitly implements Java's wrapping 32/64-bit integer
arithmetic, shift masking, signed and unsigned right shifts, division edge cases,
byte/short narrowing, saturating floating-to-integral conversion, and the
original float → long → int UV conversions. Float and double operations remain
distinct. Floating-point contraction is disabled. Potentially stateful binary
operands and call arguments are sequenced, including random draws and tokenizer
reads. Java's 48-bit random generator is used with its original nextDouble
construction; differential particle frames caught and corrected an early
implementation error in that construction.

Arrays retain reference aliasing and overlap-safe copies. Reference arrays use
an erased Object backing array with casts on reads so Java array covariance does
not copy the triangle lists used by DepthSorter. Bounds are checked. The small
String/Vector/Hashtable/stream adapters implement the paths used by this demo;
they are not general replacements for the Java standard library. Hashtable
iteration is insertion ordered; its effects are covered by the scene and XM
comparisons for the supplied assets.

Shared references preserve the original graph. A per-session allocation registry
holds weak references, prunes expired entries between frames and releases graph
edges at shutdown, including cycles that Java's GC normally handles. Static
math tables are initialized outside that session. Constructor-only self accesses
use non-owning references while `shared_from_this` is unavailable; their uses
in the shipped constructors were checked. The SDL host owns devices, texture,
renderer and window with explicit RAII lifetimes.

Scene teardown uses this native graph release. In particular, the original
`TravScene.dispose()` assumes an uninitialized `majaKkA` surface and cannot be
called safely by a general native shutdown path. Its recovered body is retained;
the host does not invoke it on exit. Regression tests cover creating, rendering
and destroying each of the six scenes in a single process.

## Platform adaptations

| Area | Native behavior |
| --- | --- |
| AWT image surfaces | Original packed RGB and palette operations remain; SDL uploads an opaque `ARGB8888` buffer converted from 8-bit channels at shifts 20, 10 and 0. Logical resolution stays 512 × 256. |
| Image loading | Original JPEGs use vendored stb_image; original GIF indices and palettes use Forward's decoder. All seven GIFs are single-frame and have no transparency; no animation is discarded. |
| ASE/IGU and gzip | The original parsers and spline code are translated. Local file streams and zlib replace URL/AWT/network loading. No JVM exports are needed during native execution. |
| SWF intro | Original timeline, curve, shape, fill and raster methods remain. The AWT player/controller threads become synchronous loading and explicit frame selection through MovieSurfaceBridge. |
| SWF unused paths | `intro4.swz` was inspected: 669 frames, shape/text/place/remove/background/protect/font tags; no embedded bitmap, audio or action tags. JPEG bitmap loading and SWF audio playback fail explicitly if unexpectedly invoked. They are not claimed as a general Flash port. |
| Music | The original XM loader, sequencer, envelopes, voices, channels and bus run in C++. SDL queues 16-bit stereo PCM at 22,050 Hz. Normal playback retains the script's boost of 96. |
| Clock/script | The original script, command dispatcher, compositor and smoothed frame timer are retained. The host injects elapsed time based on consumed queued audio, or a monotonic/fixed clock in muted/headless modes. Original clock-read sites in the timer remain. Music-position polling replaces Java synchronization/waits and is checked against all seven scene cues. |
| Loading/window code | Tuner, browser/fullscreen transition, loading font, Applet lifecycle and old audio-device discovery are omitted or adapted. One SDL window is used throughout. The end screen is drawn from its original indexed GIF. |
| Old library paths | Legacy ZipHoax archive discovery, AWT debug drawing, obsolete speed probing and the unused indexed `clear8` command are not native features. Dormant recovered methods are retained where translated; the compatibility layer is scoped to Godog's actual data and script. |

The host stops updating and pauses the audio device on Space. Escape or closing
the window ends the session. Native window playback keeps the final image visible;
`--duration` supplies an explicit time limit. Headless full playback defaults to
192 simulated seconds at 50 Hz. Scene-only headless mode renders one deterministic
frame. These host policies are separate from the translated artwork.

## Validation performed on 2026-10-08

Local system: macOS 14.1 arm64, Apple Clang 15, JDK 25.0.2, SDL2-compat 2.32.70.
CMake compiles the engine and host in actual C++11 mode, with extensions disabled.

| Check | Result |
| --- | --- |
| Six scene buffers × 12 times | All 72 frames match Java exactly in the packed framebuffer when supplied the same decoded images. Times: 0, .02, .04, .5, 1, 5, 9.98, 10, 10.02, 19.98, 20, 20.02 seconds. |
| Line rasterization | 480 cases match Java framebuffer checksums (64-bit FNV over packed pixels), covering the three recovered line paths, including horizontal and vertical lines. |
| Original image decoding | All 39 images decode at matching dimensions. All seven GIF index buffers and palettes match Java exactly. |
| JPEG decoding | Across 32 JPEGs, maximum channel error 9/255, mean absolute channel error 0.0174927/255. The decoder regression gate is max ≤ 10 and mean ≤ .03. This decoder difference is excluded from the exact renderer test by injecting Java-decoded test buffers. |
| Original XM | 4,092 blocks of 1,024 packed stereo frames (about 190 seconds) match Java bit for bit, at the regression reference settings: 22,050 Hz, stereo, boost 128. These Java settings already match the archived mixer. |
| Complete playback | All 192 simulated seconds complete. Scene cues occur at .06, 59.98, 94.28, 119.98, 128.56, 162.84 and 188.56 seconds. The regression test requires the correct sequence and cue times within 100 ms of the Java recording. |
| Numeric/lifecycle | Overflow, shifts, UV narrowing, NaN/infinity, signed zero, overlap-safe array copying and all six scene session teardowns pass. |
| Sanitizers | AddressSanitizer and UndefinedBehaviorSanitizer pass the complete playback and differential suite. The expanded six-scene lifecycle test was rerun after fixing native teardown. This does not claim a separate LeakSanitizer run. |
| Native window/audio | SDL window playback and real audio-device opening/queueing were exercised; timed shutdown and framebuffer capture succeed. These runs do not constitute automated keyboard/Finder interaction tests. |
| Relocatable macOS package | The `.app` runs from `/tmp`, resolves its bundled assets and loads both SDL2-compat and SDL3 from its own Frameworks directory, verified through dyld's load log. Local ad hoc signature verification succeeds. No JVM appears in its dependencies. |

The exact scene comparisons isolate the renderer and do not claim complete
pixel-identical playback using different JPEG decoders, arbitrary clocks or
other platforms. Native frames made from original media are in
[img/native](../img/native/README.md), with their generation conditions. The
original video remains an independent visual/timing reference.

Reproduction commands are in [native-sdl2/README.md](../native-sdl2/README.md).
`tools/validate.py` compiles the Java reference independently, exports test-only
fixtures under the build directory and runs CTest. No generated fixture is a
runtime asset or linked into the executable. The normal C++ build needs no JDK.

## Packaging and remaining platform work

The generated local application is `dist/native/macos-arm64/Godog.app`. It
contains original external assets, the native executable, SDL runtime libraries
and third-party license notices. Its signature is ad hoc, not Developer ID or
notarization; it is an arm64 build. The packager handles SDL2-compat's runtime
SDL3 lookup as well as ordinary linked libraries.

Linux and Windows CMake configurations, dependency instructions, runtime-DLL
copying and a GitHub Actions workflow are provided. Those operating systems and
that workflow have not been executed in this session. No remote push or release
was performed.

WebAssembly remains a subsequent stage. The engine exposes one update and one
audio-block operation, uses no rendering/audio worker threads, and loads external
assets. The Emscripten toolchain is not installed here. Browser frame callbacks,
audio activation, asset preloading, resource paths and browser validation still
need their own adapter and tests; no `.wasm` binary is claimed delivered.
