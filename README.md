# Godog by Komplex — preservation

Preservation and future Java desktop reconstruction of **Godog**, a Java demo
by **Komplex**, listed on [Pouët](https://www.pouet.net/prod.php?which=888)
as the winner of the Java demo competition at Assembly 1998.

The first milestone is complete: the original distribution and the YouTube
capture linked from Pouët have been recovered and checked. Decompilation and
reconstruction are future work.

- [Distribution ZIP](original/godog_by.zip) — unchanged Scene.org download,
  including the nested `GODOG.ZIP` (112 Java classes and original assets).
- [Reference video](original/video/godog-komplex-VbOJRJEa5N8.mkv) — about 3:09,
  1280 × 640, with audio, downloaded using yt-dlp.
- [Provenance manifest](original/manifest.json) and [SHA-256 checksums](original/SHA256SUMS).

## Repository layout

| Directory | Purpose |
| --- | --- |
| `documentation/` | Production notes, provenance, checks and technical decisions, in English. |
| `img/` | Images for communicating about the project. |
| `java-desktop/` | Future Java desktop reconstruction. |
| `original/` | Unmodified distribution ZIP, downloaded video and recovery evidence. |
| `reverse/cfr/` | Future CFR decompilation output. |
| `reverse/procyon/` | Future independent Procyon decompilation output. |

See the [production log](documentation/production-log.md) for the recovery scope
and progress. Original distribution files, decompiler output and reconstructed
code are kept separate. The YouTube video is a later reference capture; its
playback speed and rendering are not yet validated against the original demo.
