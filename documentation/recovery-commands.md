# Recovery commands

Recovery date: **2026-10-08**. Run from the repository root. The preserved
artifact hashes describe the bytes recovered on that date; remote pages,
YouTube encodings and hosting redirects may change later.

Tools used: curl 8.1.2, yt-dlp 2026.08.19, FFmpeg/ffprobe 7.1.1,
Python 3.14.7. Deno 2.9.5 was available, but the download log does not show
that a JavaScript challenge was needed.

## Downloads

The original downloads used `.part` files for HTTP bodies, then renamed them
after checking the response and content. The commands below write to a fresh
temporary directory so they do not replace the preserved artifacts.

```bash
recovery_dir=$(mktemp -d)
curl --fail --location --retry 2 --connect-timeout 20 --max-time 90 \
  --dump-header "$recovery_dir/pouet-888.headers.txt" \
  --output "$recovery_dir/pouet-888.html.part" --write-out '%{json}\n' \
  'https://www.pouet.net/prod.php?which=888' \
  > "$recovery_dir/pouet-888.transfer.json"
curl --fail --location --retry 2 --connect-timeout 20 --max-time 90 \
  --dump-header "$recovery_dir/scene-org-godog.headers.txt" \
  --output "$recovery_dir/scene-org-godog.html.part" --write-out '%{json}\n' \
  'https://files.scene.org/view/parties/1998/assembly98/javademo/godog_by.zip' \
  > "$recovery_dir/scene-org-godog.transfer.json"
curl --fail --location --retry 2 --connect-timeout 20 --max-time 180 \
  --dump-header "$recovery_dir/godog_by.headers.txt" \
  --output "$recovery_dir/godog_by.zip.part" --write-out '%{json}\n' \
  'https://files.scene.org/get/parties/1998/assembly98/javademo/godog_by.zip' \
  > "$recovery_dir/godog_by.transfer.json"
yt-dlp --ignore-config --no-playlist --no-overwrites \
  --write-info-json --write-description --write-thumbnail --no-progress \
  --socket-timeout 30 --retries 3 --fragment-retries 3 \
  --format 'bv*+ba/b' --merge-output-format mkv \
  --output "$recovery_dir/godog-komplex-%(id)s.%(ext)s" \
  'https://youtu.be/VbOJRJEa5N8'
```

The original HTTP evidence is under `original/pages/` and next to the outer ZIP.
YouTube source metadata and sidecars are under `original/video/`. Keep any
subsequent retrieval distinct from these dated preservation artifacts.

## Integrity checks on the preserved files

```bash
(cd original && shasum -a 256 -c SHA256SUMS)
python3 - <<'PY'
from io import BytesIO
from zipfile import ZipFile

with ZipFile('original/godog_by.zip') as outer:
    assert outer.testzip() is None
    with ZipFile(BytesIO(outer.read('GODOG.ZIP'))) as inner:
        assert inner.testzip() is None
        print(len(inner.infolist()), 'nested ZIP entries; all CRC checks passed')
PY
ffprobe -v error -show_format -show_streams -of json \
  original/video/godog-komplex-VbOJRJEa5N8.mkv
ffmpeg -nostdin -v error -xerror \
  -i original/video/godog-komplex-VbOJRJEa5N8.mkv \
  -map 0:v:0 -map 0:a:0 -f null -
```

CRC/hash checks establish archive readability and local fixity. A complete media
decode establishes that the downloaded streams can be decoded. These checks do
not establish demo compatibility or historical rendering and timing fidelity.
