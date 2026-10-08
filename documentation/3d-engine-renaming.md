# Desktop 3D engine naming

Date: 2026-10-08. Baseline: `30051123eda08f34252363854c275734fe3b426c`.

The user explicitly authorized direct renaming of the 3D-engine portion of the
review CSV, with regression tests, after creating the `fixed` tag. This overrides
the previous requirement to wait for CSV decisions for this portion only.

Applied: **49 class names, 54 method declarations and 32 fields**. The
[applied mapping](3d-symbol-map.json) is the authoritative record of original
owners, names, descriptors and new names. The review CSV remains the original
proposal; it was open in the user's spreadsheet editor during this work and was
not rewritten. Its pending decisions do not supersede this explicit instruction.

## Scope and implementation

The scope includes vector/matrix/quaternion types, camera and frustum, vertices,
UVs, triangles, mesh loaders and generators, animation tracks, primitive sorting,
software surfaces and rasterizers, plus the six scene implementations and their
direct presentation helpers. Examples include `Vec3f`, `Mat3f`, `Camera`,
`MeshObject`, `Triangle`, `UvCoord`, `TexturedTriangleRasterizer`,
`HeightFieldMesh`, `MetaballMesh` and `SceneRenderer`.

Scene lifecycle callbacks now use `getSceneId`, `load`, `enter`, `render`,
`handleMessage` and `dispose`. Camera fields describe the pose, viewport and
clipping distances; vector/quaternion/UV components use `x/y/z/w/u/v`.
Software image surfaces expose `width`, `height`, `image` and publishing methods.

Only names already proposed in the CSV and belonging to this scope were applied.
Unreviewed engine members still retain obfuscated names; this is not a claim of
complete deobfuscation. Audio and embedded-movie implementations retain their
names. Their references to shared renamed types or fields were updated where
necessary: for example, the script scheduler uses `SortableItem.sortKey`.
Locals, parameters, runtime scene IDs and asset paths retain their original text.

A one-shot javac `Trees` refactoring resolved declaration identities, including
overloads and inherited members, before replacing identifier spans and source
filenames. It did not perform a global text replacement. Source layout,
statements, constants, casts, comments and literals were preserved. In
particular, the bytecode-verified UV narrowing and active-count loops remain
unchanged. No archived files or decompiler outputs were edited.

The reference harness now pairs original class-name strings with explicit
desktop scene factories. Reflection into the original JAR still uses original
names. The correspondence tool maps types and methods through the applied map,
checks exact descriptors rather than falling back to a sole same-name method,
and verifies every explicitly renamed field. All 112 original classes and 1,143
methods remain accounted for; 46 source files remain byte-identical to the
selected decompiler baseline.

## Regression evidence

The existing checks and original 18-frame comparison passed before modification.
After a clean desktop build, validation passed on the installed OpenJDK 25.0.2
on macOS arm64:

- 47 assets unchanged and all external images decodable.
- UV narrowing still matches original overflow, NaN and infinity behavior.
- New differential checks cover 135 vector/vertex/UV cases, including all three
  renamed UV setters, inherited coordinate fields and floating-point edge cases.
- 256 camera orientations match the original matrix components after `lookAt`
  and `lookAlong`, with varied roll and target coordinates.
- 480 line-raster cases remain pixel-identical to original bytecode.
- 4,092 XM blocks (over 190 seconds) remain sample-identical.
- The scene comparison was expanded to **72 pixel-identical frames**: six scenes
  at 0, 0.02, 0.04, 0.5, 1, 5, 9.98, 10, 10.02, 19.98, 20 and 20.02 seconds.
  Adjacent samples also exercise buffer reuse and animated geometry. Each side
  receives matching random seeds, identical frame deltas and the same assets.
- Native-window creation, scaled mouse input, release, focus loss, F key,
  minimize/restore and closing pass.
- The rebuilt installed launcher loads its own assets from `/tmp`, plays the
  intro muted and shuts down after the requested four seconds.
- A structural check covers all 114 runtime Java source files. Exactly 2,857
  mapped identifier tokens differ from the baseline; all other tokens, including
  whitespace, comments, literals and operators, are identical.

Reproduce the checks from the repository root:

```sh
cd java-desktop
./gradlew clean check compareOriginal verifyWindow installDist
cd ..
python3 java-desktop/tools/source_correspondence.py
python3 java-desktop/tools/verify_rename_structure.py
```

`verifyWindow` and the original Applet-based scene harness require a display.
The structural check requires the recorded baseline commit in local Git history
and deliberately rejects later algorithm changes; it is a check of this naming
milestone, not a permanent prohibition on future work. It complements resolved
symbol editing and behavioral comparisons; token checks alone cannot establish
correct Java name binding.

These checks do not establish behavior on other JVMs or operating systems. The
full real-time sequence was validated in the preceding restoration milestone;
this naming milestone reran full-duration audio, fixed-time scene rendering,
native-window interaction and a short installed-launcher check.
