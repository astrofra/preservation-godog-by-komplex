import java.lang.reflect.*;
import java.net.*;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;
import javax.imageio.ImageIO;

/** Differential checks against the recovered JVM bytecode, without Applet loading. */
public final class PreservationChecks {
    public static void main(String[] args) throws Exception {
        Path project = Path.of(args[0]);
        int assets = 0;
        try (ZipFile archive = new ZipFile(project.resolve("../original/GODOG.ZIP").toFile())) {
            for (var entry : Collections.list(archive.entries())) {
                if (entry.isDirectory() || !(entry.getName().startsWith("images/") || entry.getName().startsWith("data/"))) continue;
                Path file = project.resolve("assets").resolve(entry.getName());
                try (var input = archive.getInputStream(entry)) {
                    if (!Arrays.equals(input.readAllBytes(), Files.readAllBytes(file))) throw new AssertionError(file);
                }
                if (entry.getName().startsWith("images/") && ImageIO.read(file.toFile()) == null) throw new AssertionError("Undecodable image: " + file);
                assets++;
            }
        }
        System.out.println("PASS: " + assets + " assets match the archive; every external image decodes.");
        try (URLClassLoader original = new URLClassLoader(new URL[]{project.resolve("../reverse/inputs/godog-decompiler-input.jar").toUri().toURL()}, ClassLoader.getPlatformClassLoader())) {
            checkNarrowing(original);
            GeometryChecks.run(original);
            checkLines(original);
            checkMusic(original, project);
        }
    }

    static void checkNarrowing(ClassLoader original) throws Exception {
        Method uv = original.loadClass("mmaamma").getDeclaredMethod("AMaJakK", float.class);
        uv.setAccessible(true);
        for (float value : new float[]{0, -1, Float.NaN, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY,
                2147483648f, -2147483904f, 3221225472f, 4294967296f, -4294967296f}) {
            if ((int)uv.invoke(null, value) != TexturedTriangleRasterizer.AMaJakK(value)) throw new AssertionError("UV narrowing: " + value);
            if ((int)original.loadClass("kmaakma").getMethod("MaJAKkA", float.class).invoke(null, value) != ImageMathSupport.MaJAKkA(value)) throw new AssertionError("Float helper");
            if ((int)original.loadClass("kmaakma").getMethod("MajaKkA", double.class).invoke(null, (double)value) != ImageMathSupport.MajaKkA(value)) throw new AssertionError("Double helper");
        }
        System.out.println("PASS: narrowing conversions retain original overflow, NaN and infinity semantics.");
    }

    static void checkLines(ClassLoader original) throws Exception {
        Class<?> pixels = original.loadClass("mmajkka");
        Object image = pixels.getConstructor(int.class, int.class, int.class, boolean.class).newInstance(512, 256, 1, false);
        Object raster = original.loadClass("mmjamka").getConstructor(pixels, int.class, int.class).newInstance(image, 512, 256);
        RgbSurface restoredImage = new RgbSurface(512, 256, 1, false);
        LineRasterizer restored = new LineRasterizer(restoredImage, 512, 256);
        int[] reference = (int[])pixels.getField("AMAjakk").get(image);
        Random random = new Random(888);
        int cases = 0;
        for (String name : new String[]{"KamAjak", "kamAjak", "KamaJAk"}) {
            Class<?>[] types = {float.class, float.class, float.class, float.class, int.class, int.class, int.class};
            Method oldMethod = raster.getClass().getDeclaredMethod(name, types);
            Method newMethod = LineRasterizer.class.getDeclaredMethod(name, types);
            oldMethod.setAccessible(true); newMethod.setAccessible(true);
            for (int i = 0; i < 160; i++) {
                float x = 20 + random.nextFloat() * 400, y = 20 + random.nextFloat() * 180;
                float x2 = i % 3 == 0 ? x : 20 + random.nextFloat() * 400;
                float y2 = i % 3 == 1 ? y : 20 + random.nextFloat() * 180;
                Arrays.fill(reference, 0); Arrays.fill(restoredImage.AMAjakk, 0);
                Object[] values = {x, y, x2, y2, 64, 32, 5};
                oldMethod.invoke(raster, values); newMethod.invoke(restored, values);
                if (!Arrays.equals(reference, restoredImage.AMAjakk)) throw new AssertionError(name + " case " + i);
                cases++;
            }
        }
        System.out.println("PASS: " + cases + " rasterizer cases match original bytecode pixel for pixel.");
    }

    static void checkMusic(ClassLoader original, Path project) throws Exception {
        byte[] xm = Files.readAllBytes(project.resolve("assets/data/rocket.xm"));
        Class<?> oldMixerType = original.loadClass("mmajmma"), oldDeviceType = original.loadClass("muhmu.hifi.device.MAD");
        Object oldMixer = oldMixerType.getConstructor().newInstance();
        Object oldDevice = original.loadClass("muhmu.hifi.device.DeviceNoSound").getConstructor().newInstance();
        Object oldSong = original.loadClass("kajamka").getMethod("kKAmAjA", byte[].class).invoke(null, (Object)xm.clone());
        oldSong.getClass().getMethod("JakkAMa", oldMixerType).invoke(oldSong, oldMixer);
        oldDeviceType.getField("frequency").setInt(oldDevice, 22050);
        oldDeviceType.getField("stereo").setBoolean(oldDevice, true);
        mmajmma mixer = new mmajmma();
        kajamka.kKAmAjA(xm.clone()).JakkAMa(mixer);
        var device = new muhmu.hifi.device.JavaSoundDevice(true);
        device.init(mixer, 22050, 4, 22050, null);
        Method mix = oldMixerType.getMethod("mix", oldDeviceType, int[].class, int.class, int.class);
        int[] reference = new int[1024], restored = new int[1024];
        int blocks = (190 * 22050 + 1023) / 1024;
        Path pcm = project.resolve("build/validation-mixer-s16le.pcm");
        Files.createDirectories(pcm.getParent());
        byte[] bytes = new byte[4096];
        try (var output = Files.newOutputStream(pcm)) {
            for (int block = 0; block < blocks; block++) {
                long timestamp = 4_000_000_000_000L + block * 1024L * 1000 / 22050;
                oldDeviceType.getField("bufferStartTime").setLong(oldDevice, timestamp);
                device.bufferStartTime = timestamp;
                Arrays.fill(reference, 0); Arrays.fill(restored, 0);
                mix.invoke(oldMixer, oldDevice, reference, 0, 1024);
                mixer.mix(device, restored, 0, 1024);
                if (!Arrays.equals(reference, restored)) throw new AssertionError("XM mismatch at block " + block);
                for (int i = 0; i < 1024; i++) for (int b = 0; b < 4; b++) bytes[i * 4 + b] = (byte)(restored[i] >>> (8 * b));
                output.write(bytes);
            }
        }
        System.out.println("PASS: 190 seconds of XM output match original bytecode sample for sample (" + blocks + " blocks).");
    }
}
