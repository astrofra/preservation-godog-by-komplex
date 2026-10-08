# Retired platform implementations

These three Procyon files are unchanged documentary copies of the original
Microsoft IE3/IE4 DirectSound and Sun `sun.audio` backends. They are excluded from
the source set and application JAR. Their methods are accounted for in the
[correspondence inventory](../../documentation/java-desktop-correspondence.json).

`muhmu.hifi.device.JavaSoundDevice` replaces their output role while retaining
the original `MAD` / `Mixable` boundary and XM mixer. The old factory and tuner
classes remain as documentary code; the desktop entry point directly selects
Java Sound and never invokes the browser-era device discovery path.
