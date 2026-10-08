# stb_image

Unmodified stb_image 2.30, upstream revision
`2c980bb59875b0d32144a71867fbdebb2f77cd20`:
https://github.com/nothings/stb/blob/2c980bb59875b0d32144a71867fbdebb2f77cd20/stb_image.h

Copied from the already vendored copy in the user's
`maeda-game-rapid-roulette/native-sdl2/vendor/stb/` workspace.

- `stb_image.h` SHA-256: `594c2fe35d49488b4382dbfaec8f98366defca819d916ac95becf3e75f4200b3`
- `LICENSE` SHA-256: `bebfe904b14301657e4e5d655c811d51fd31b97c455b9cc2d8600d6bac6cff63`

The dual public-domain / MIT terms are in LICENSE. The implementation is compiled
once, in `src/assets/original_asset_loader.cpp`, with JPEG support only. Original
GIF palette indices are decoded separately because the renderer uses the indices
as data as well as colors.
