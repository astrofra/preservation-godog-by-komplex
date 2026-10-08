# Godog — C++11 / SDL2

A native reconstruction of the complete Godog sequence: the vector SWF intro,
five 3D scenes, original script and overlays, XM soundtrack and final image.
The renderer remains a 512 × 256 software framebuffer. SDL presents its pixels
and plays the original mixer output. No JVM is used at runtime or normal build time.

## Build and run

Requirements: CMake 3.21+, a C++11 compiler, SDL2 development files and zlib.

```sh
# From the repository root; dependencies must already be installed.
cmake -S native-sdl2 -B native-sdl2/build -DCMAKE_BUILD_TYPE=Release
cmake --build native-sdl2/build --config Release --parallel
./native-sdl2/build/godog
```

Escape closes the window. Space pauses both animation and audio. The window can
be resized; the logical image keeps its 2:1 aspect ratio. The final screen stays
visible until the application is closed, unless `--duration` is specified.

The build copies the 47 original resources into `assets/` beside the executable.
Resources are resolved relative to the executable, or the Resources directory
of a macOS application bundle, independently of the working directory.

```sh
./native-sdl2/build/godog --mute --duration 192
./native-sdl2/build/godog --scale 3 --assets /path/to/assets
./native-sdl2/build/godog --scene evil --at 10 --headless --capture /tmp/evil.ppm
./native-sdl2/build/godog --headless --duration 192 --capture /tmp/end.ppm
```

`--scene` selects `movieintro`, `paa`, `trav`, `vehje`, `evil` or `linjanen` in
isolation, without the soundtrack or script overlays. `--at` freezes an isolated
scene at a nonnegative local time. In headless isolated mode, one frame is
rendered with a fixed seed and delta. Full headless playback uses 50 updates per
second and defaults to 192 simulated seconds; it still runs the XM mixer and
music-position cues. Captures are binary PPM files at the logical resolution.

## Platforms

macOS arm64 is tested locally on macOS 14.1, Apple Clang 15. The installed SDL2
API is provided by SDL2-compat 2.32.70 with SDL3 behind it. The code also targets
classic SDL2. Linux and Windows are prepared but have not been executed locally;
the checked-in GitHub Actions workflow has not been run or published.

Typical dependency installation commands:

```sh
# Debian/Ubuntu
sudo apt-get install cmake g++ libsdl2-dev zlib1g-dev
# macOS / Homebrew
brew install cmake sdl2 zlib
```

Windows, from a Developer PowerShell with vcpkg:

```powershell
vcpkg install sdl2:x64-windows zlib:x64-windows
cmake -S native-sdl2 -B native-sdl2/build `
  -DCMAKE_TOOLCHAIN_FILE="$env:VCPKG_ROOT/scripts/buildsystems/vcpkg.cmake" `
  -DVCPKG_TARGET_TRIPLET=x64-windows
cmake --build native-sdl2/build --config Release --parallel
.\native-sdl2\build\Release\godog.exe
ctest --test-dir native-sdl2/build -C Release --output-on-failure
```

MSVC has no strict C++11 switch; strict C++11 compilation is checked with Clang.
The Windows build copies runtime DLLs known to CMake beside the executable.
Additional dynamically loaded dependencies need packaging if an SDL2-compat
installation is used instead of classic SDL2.

## Validation

```sh
ctest --test-dir native-sdl2/build -C Release --output-on-failure

# Requires JDK 25 and Python 3; regenerates independent Java fixtures.
python3 native-sdl2/tools/validate.py

# Address and undefined-behavior sanitizers (Clang/GCC).
cmake -S native-sdl2 -B native-sdl2/build-sanitize \
  -DCMAKE_BUILD_TYPE=RelWithDebInfo -DGODOG_SANITIZE=ON \
  -DGODOG_REFERENCE_DIR="$PWD/native-sdl2/build/reference"
cmake --build native-sdl2/build-sanitize --parallel
ctest --test-dir native-sdl2/build-sanitize --output-on-failure
```

Default CTest checks numeric semantics, repeated scene lifecycles and all 192
seconds of playback. With Java fixtures configured, it also checks 72 exact
scene buffers, 480 line cases, all 39 original images and 4,092 XM blocks.
The exact scene test injects Java-decoded images to isolate renderer behavior.
Original GIF decoding is exact; original JPEG decoding has a separately measured
STB/Java difference. See [the validation record](../documentation/native-port.md).

## Install and package

```sh
cmake --install native-sdl2/build --config Release --prefix "$PWD/dist/native/local"
python3 native-sdl2/tools/package_macos.py
```

The macOS script creates `dist/native/macos-arm64/Godog.app` on arm64, bundles
SDL and its licenses, rewrites dependency paths, and applies an ad hoc local
signature. It includes the dynamically loaded SDL3 library when SDL2-compat
is detected. `--sdl3 /path/to/libSDL3.dylib` overrides its pkg-config lookup.
The package is local, unsigned by a Developer ID, and not notarized. It is not
a universal binary. Linux installation expects compatible system SDL2/zlib.

## Source correspondence and future WebAssembly

`src/engine/core.hpp` and `core.cpp` retain 75 Java class boundaries. Fields that
share a name with a Java method receive `_field`, because C++ does not allow that
collision. [correspondence.csv](correspondence.csv) records individual methods
and fields, including native adapters and omitted platform or unused code.
The sources are checked in: Java is only needed to regenerate them or run
independent regression checks.

```sh
# Regeneration requires JDK 25 and clang-format 20.1.8.
java native-sdl2/tools/TranslateCore.java "$PWD" /path/to/clang-format
```

The translator is deliberately restricted to this repository, resolves types
with javac and rejects unsupported constructs. Keep its changes and generated
files together. The native host is in `src/main.cpp` and `src/demo.cpp`; image,
stream and AWT substitutions are in `surface_platform.*` and `java_compat.hpp`.
The latter is a compatibility layer for Godog's used paths, not a general JVM.

`NativeDemo::update()` and `mixBlock()` are separate from the SDL event loop and
run without worker threads. This prepares an Emscripten frame callback and
browser audio adapter. No WebAssembly build or browser package is included or
claimed tested yet. The eventual browser stage still needs its event-loop entry,
audio unlock, resource preloading and browser-specific validation.

Original code/media and borrowed decoder provenance: [PROVENANCE.md](PROVENANCE.md).
