#!/usr/bin/env python3
"""Build a labelled study contact sheet; requires Pillow and ffmpeg."""
from pathlib import Path
import argparse
import subprocess
from PIL import Image, ImageDraw

root = Path(__file__).resolve().parents[2]
parser = argparse.ArgumentParser(description=__doc__)
parser.add_argument('--captures', type=Path, default=root/'java-desktop/build/captures-verified')
args = parser.parse_args()
times = [15, 75, 105, 135, 165]
cache = root/'java-desktop/build/reference-frames'; cache.mkdir(parents=True, exist_ok=True)
image = Image.new('RGB', (1024, 280*len(times)), (30, 30, 30))
draw = ImageDraw.Draw(image)
for row, seconds in enumerate(times):
    reference = cache/f'video-{seconds:04}.png'
    if not reference.exists():
        subprocess.run(['ffmpeg','-hide_banner','-loglevel','error','-ss',str(seconds),'-i',
            str(root/'original/video/godog-komplex-VbOJRJEa5N8.mkv'),'-frames:v','1',str(reference)],check=True)
    image.paste(Image.open(reference).convert('RGB').resize((512,256)),(0,280*row+24))
    image.paste(Image.open(args.captures/f'frame-{seconds:06.1f}.png'),(512,280*row+24))
    draw.text((8,280*row+6),f'YouTube reference: {seconds}s',fill='white')
    draw.text((520,280*row+6),f'Restored Java: {seconds}s after music start',fill='white')
output=root/'img/desktop-video-comparison.png'; output.parent.mkdir(exist_ok=True);image.save(output)
print(output)
