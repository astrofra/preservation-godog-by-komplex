# Symbol naming review

The [review CSV](symbol-renaming-review.csv) proposes names inferred from usage
in the restored Java sources. These are descriptive reconstruction names, not
recovered author names. **No source symbols have been renamed.** Application of
the mapping requires the user's explicit approval.

## Scope

This first review contains 303 rows:

- All 112 archived classes: 104 proposed names and 8 existing audio names to keep.
- 112 method declarations, including overrides of proposed lifecycle callbacks.
- 79 fields with roles established by their assignments and consumers.

This is not an exhaustive member-renaming plan. The archive has 964 ordinary
method declarations and 1,112 fields; members not listed remain unchanged and
can be reviewed in later batches. Constructors and static initializers are
excluded from the method count. Constructors follow an approved class rename.
New desktop infrastructure, local variables and parameters are outside this
batch. The three retired audio backend classes are included as `keep` rows.

The baseline is commit `2d74d31`. Source references point into that version.
All 303 decisions initially read `pending`; nothing is implicitly approved.

## Editing the CSV

Open it as UTF-8, with comma delimiters and double-quoted text fields. Filter
`kind` to review classes first, then methods and fields. The eight `keep`
recommendations document intentional retention of existing audio API names.

For each row, edit `proposed_name` if desired and set `decision` to:

| Decision | Meaning |
| --- | --- |
| `approve` | Accept this row's proposed name, including an edited proposal. |
| `keep` | Retain this symbol's current name. |
| `defer` | Leave unchanged until further investigation. |
| `pending` | Not reviewed; no authorization to rename. |

Leave the identity columns unchanged. `owner`, `kind`, `original_name` and
`original_descriptor` identify a declaration unambiguously, including overloads
and the obfuscator's case distinctions. `desktop_descriptor` records the
adapted signature where platform types changed. Descriptors are JVM signatures
using the current names, not additional symbols to approve separately.

`rename_group` joins declarations that must share a name: for example, `Scene`
callbacks and their scene-specific overrides. Review these rows together.
Conflicting decisions or names within a group must be resolved before applying
that group. Approval of a class name alone does not approve its member names.

`reason` explains the inference; `evidence` points to the declaration whose
body, assignments and callers support it. For overloaded declarations, the
source location may be the first overload; use the descriptor to distinguish
them. `high` means the operational role is clear, not that the proposed spelling
is uniquely correct. Six class names have `medium` confidence because their
responsibilities or best descriptive name are less sharply defined.

## Naming choices

Use PascalCase for classes and lowerCamelCase for methods and fields. Constants
with identified meanings use UPPER_SNAKE_CASE. Short mathematical component
names such as `x`, `y`, `z`, `w`, `u` and `v` remain useful. Scene class names
retain their script identities, such as `PaaScene` and `VehjeScene`; runtime
strings and asset names do not change.

Examples include `kaajmma` → `Vec3f`, `kajjmmk` → `UvCoord`, `mmaamma` →
`TexturedTriangleRasterizer`, and `kmaakkk` → `ModuleSequencer`. Generic roles
stay generic: `SortableItem.sortKey` is used for both depth and script position.
Existing Java/AWT and audio API callbacks are not proposed for renaming.

## Validation and subsequent application

The table was checked against archived class-file declarations and the desktop
correspondence report. Checks cover unique symbol identities, valid proposed
identifiers, distinct proposed class names, exact method descriptors and
consistent override names. The proposed UV `set` overloads retain distinct
parameter signatures. These checks validate a review document, not a refactor.

After approval, apply only accepted entries to the desktop adaptation. Preserve
`original/` and both decompiler trees as historical references. Rename by resolved
symbol identity, never by a global case-insensitive text replacement. Preserve
class boundaries, arithmetic, statement order, runtime strings and asset paths.
Keep this mapping as the audit trail and update build entry points, test tools
and correspondence reporting where approved class names require it.

Before accepting the resulting code, check inherited-name collisions and API
contracts, compile, run the existing numeric/audio/rendering comparisons against
the original classes, and verify the desktop launcher. The fixed-point UV casts
and other bytecode-verified repairs must remain unchanged. None of these code
changes or post-refactor checks has been performed at this review stage.
