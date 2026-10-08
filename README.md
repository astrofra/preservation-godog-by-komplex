# Godog by Komplex — preservation

Preservation and Java desktop reconstruction of **Godog**, a Java demo
by **Komplex**, listed on [Pouët](https://www.pouet.net/prod.php?which=888)
as the winner of the Java demo competition at Assembly 1998.

The original distribution and the YouTube capture linked from Pouët have been
recovered and checked. Independent CFR and Procyon references now cover all 112
classes, with remaining decompiler limitations documented. The desktop adaptation
now runs on JDK 25 with an AWT window and Java Sound, retaining the recovered
software renderer, scenes and XM mixer.

```sh
cd java-desktop
./gradlew run
```

See [desktop usage](java-desktop/README.md) and the
[restoration and validation notes](documentation/java-desktop-restoration.md).

- [Distribution ZIP](original/godog_by.zip) — unchanged Scene.org download,
  including the nested `GODOG.ZIP` (112 Java classes and original assets).
- [Reference video](original/video/godog-komplex-VbOJRJEa5N8.mkv) — about 3:09,
  1280 × 640, with audio, downloaded using yt-dlp.
- [Demozoo screenshot reference](documentation/screenshot-references.md) — one
  original-size PNG recovered; the full gallery remains blocked by Cloudflare.
- [Provenance manifest](original/manifest.json) and [SHA-256 checksums](original/SHA256SUMS).
- [Decompilation references and reproduction commands](reverse/README.md).
- [Descriptive symbol names and regression checks](documentation/symbol-renaming-applied.md).
- [Separate French note on obfuscation](documentation/obfuscation-notes-fr.md).

## Repository layout

| Directory | Purpose |
| --- | --- |
| `documentation/` | English production notes, provenance and decisions; a separate French obfuscation note requested by the user. |
| `img/` | Images for communicating about the project. |
| `java-desktop/` | Runnable JDK 25 desktop reconstruction, original external assets and validation tools. |
| `original/` | Unmodified distribution ZIPs, extracted original classes, video and recovery evidence. |
| `reverse/cfr/` | CFR decompilation reference. |
| `reverse/procyon/` | Independent Procyon decompilation reference. |
| `reverse/raw/` | Preserved first attempts before the documented debug-metadata workaround. |

See the [production log](documentation/production-log.md) for the recovery scope
and progress. Original distribution files, decompiler output and reconstructed
code are kept separate. The YouTube video is a later reference capture; its
capture conditions remain unknown. Desktop validation compares broad video
composition and timing, and fixed-time frames and XM samples against the recovered
bytecode on the installed JDK.
