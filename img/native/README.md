# Native software-frame captures

These PNGs were produced on 2026-10-08 by the first C++11/SDL2 port introduced
with these files, on macOS 14.1 arm64 / Apple Clang 15. They are captures of the
native logical framebuffer, not historical images or physical-window screenshots.
Each starts a fresh scene, uses the original GIF/JPEG files, and has no script
layers. Resolution: 512 × 256; no display scaling is baked into the files.

| File | Scene-local time |
| --- | ---: |
| movieintro.png | 5 s |
| paa.png | 20 s |
| trav.png | 10 s |
| vehje.png | 5 s |
| evil.png | 10 s |
| linjanen.png | 10 s |

Example reproduction from the repository root:

```sh
native-sdl2/build/godog --headless --scene evil --at 10 --capture /tmp/evil.ppm
sips -s format png /tmp/evil.ppm --out img/native/evil.png
```

The PPM-to-PNG step is lossless. The seed is `888 + integer(scene-local time)`
and the render delta is 0.02 s, as specified by the isolated headless runner.
These single-frame captures are separate from the sequential 72-frame Java
comparison described in `documentation/native-port.md`.
