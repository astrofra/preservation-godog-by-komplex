# Godog desktop

Java desktop reconstruction of Komplex's Godog (Assembly 1998). The recovered
software renderer, scene classes, sequence and XM mixer run on **JDK 25**.
The application has no Applet, Microsoft JVM or internal Sun API dependency.

## Run

From this directory, with JDK 25 available:

```sh
./gradlew run
```

On Windows, use `gradlew.bat`. The first build downloads the pinned Gradle 9.4.0
distribution; the application itself uses local assets and needs no network.
The reconstruction was tested on macOS arm64, not on Windows or Linux.

The default window presents the original **512 × 256** framebuffer at 2× scale.
Press **Esc** or close the window to stop; **F** toggles the recovered FPS display.
The original final screen remains visible until the window is closed.

```sh
./gradlew run --args='--scale 3'
./gradlew run --args='--mute'
./gradlew installDist
./build/install/godog-desktop/bin/godog-desktop
```

Keep the complete installation directory together. It contains the code JAR,
launchers and a separate `assets/` directory; it requires an installed Java 25
runtime. The launcher also works from an unrelated working directory. `distZip`
creates a distributable ZIP; it does not bundle a JVM.

Options:

| Option | Behavior |
| --- | --- |
| `--scale 1\|2\|3\|4` | Integer window scaling; rendering remains 512 × 256. |
| `--mute` | Run the original XM mixer silently, with sample-based pacing. |
| `--assets DIR` | Override the installation-relative asset directory. |
| `--duration SECONDS` | Close after this many seconds from music start. |
| `--capture-dir DIR` | Save internal frames at 0, 15, …, 180 and 188 seconds. |
| `--headless` | Run without a window; combine with `--mute --duration`. |

## Verify

```sh
./gradlew check                    # Assets, numeric conversions, lines and XM
./gradlew compareOriginal          # Requires a display and JDK 25
./gradlew verifyWindow             # Opens a muted window, exercises it and closes
./gradlew installDist
python3 tools/source_correspondence.py
```

`check` runs `verifyPreservation`, a dependency-free Java test program; the empty
JUnit `test` task is disabled. `compareOriginal` is a separate reference harness:
it loads the archived classes, including their Applet superclass, **only inside
the validation process**. This optional tool requires JDK 25's still-present
legacy API. It does not ship in the application. Its reflective random seeding
is confined to fixed-time comparison; ordinary playback retains `Math.random()`.

The runnable source keeps the obfuscated names deliberately. Start with the
[restoration notes](../documentation/java-desktop-restoration.md) for platform
boundaries, decompiler corrections, evidence and remaining limitations.
