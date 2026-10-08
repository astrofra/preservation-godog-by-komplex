import java.lang.reflect.*;
import java.util.Random;

/** Differential geometry checks; original symbol strings deliberately stay unchanged. */
final class GeometryChecks {
    static void equalFloat(float expected, float actual, String label) {
        if (Float.floatToIntBits(expected) != Float.floatToIntBits(actual))
            throw new AssertionError(label + ": " + expected + " != " + actual);
    }

    static void vector(Object old, Vec3f current) throws Exception {
        String[] names = {"MajaKka", "majaKka", "MAjaKka"};
        float[] values = {current.x, current.y, current.z};
        for (int i = 0; i < 3; i++) equalFloat(old.getClass().getField(names[i]).getFloat(old), values[i], "vector component " + i);
    }

    static void uv(Object old, UvCoord current) throws Exception {
        equalFloat(old.getClass().getField("jAKkaMA").getFloat(old), current.u, "u");
        equalFloat(old.getClass().getField("JakkaMA").getFloat(old), current.v, "v");
    }

    static void run(ClassLoader original) throws Exception {
        Class<?> oldVector = original.loadClass("kaajmma");
        Class<?> oldVertex = original.loadClass("majjmka");
        Class<?> oldUv = original.loadClass("kajjmmk");
        Class<?> oldCamera = original.loadClass("mmjjmkk");
        Random random = new Random(888);
        float[] edges = {0f, -0f, Float.MIN_VALUE, Float.MAX_VALUE, Float.NaN,
                         Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY};
        for (int i = 0; i < 135; i++) {
            float x = i < edges.length ? edges[i] : random.nextFloat() * 200 - 100;
            float y = random.nextFloat() * 200 - 100, z = random.nextFloat() * 200 - 100;
            Object a = oldVector.getConstructor(float.class, float.class, float.class).newInstance(x, y, z);
            Object b = oldVector.getConstructor(float.class, float.class, float.class).newInstance(z, x, y);
            Vec3f av = new Vec3f(x, y, z), bv = new Vec3f(z, x, y);
            vector(a, av);
            vector(oldVector.getMethod("mAjAkKA", oldVector).invoke(a, b), av.mAjAkKA(bv));
            vector(oldVector.getMethod("MAJakKA", oldVector).invoke(a, b), av.MAJakKA(bv));
            vector(oldVector.getMethod("majaKka", oldVector).invoke(a, b), av.majaKka(bv));
            vector(oldVector.getMethod("maJakKA").invoke(a), av.maJakKA());
            equalFloat((float)oldVector.getMethod("MaJakKA", oldVector).invoke(a, b), av.MaJakKA(bv), "dot product");
            // Inherited coordinate fields must resolve to Vec3f, including copy constructors.
            Object vertex = oldVertex.getConstructor(float.class, float.class, float.class).newInstance(x, y, z);
            vector(oldVertex.getConstructor(oldVertex).newInstance(vertex), new Vertex(new Vertex(x, y, z)));
            Object u = oldUv.getConstructor(float.class, float.class).newInstance(x, y);
            UvCoord currentUv = new UvCoord(x, y);
            uv(u, currentUv);
            oldUv.getMethod("AKKAMaJ", float.class, float.class).invoke(u, y, x);
            currentUv.set(y, x); uv(u, currentUv);
            oldUv.getMethod("akKAMaJ", double.class, double.class).invoke(u, (double)z, (double)x);
            currentUv.set((double)z, (double)x); uv(u, currentUv);
            Object copy = oldUv.getConstructor().newInstance();
            UvCoord currentCopy = new UvCoord();
            oldUv.getMethod("AkKAMaJ", oldUv).invoke(copy, u);
            currentCopy.set(currentUv); uv(copy, currentCopy);
        }
        for (int i = 0; i < 128; i++) {
            Object old = oldCamera.getConstructor().newInstance();
            Camera current = new Camera();
            float roll = random.nextFloat() * 6 - 3;
            oldCamera.getField("amAjakK").setFloat(old, roll); current.rollRadians = roll;
            float x = random.nextFloat() * 10, y = random.nextFloat() * 10, z = random.nextFloat() * 10;
            Object direction = oldVector.getConstructor(float.class, float.class, float.class).newInstance(x, y, z);
            for (boolean along : new boolean[]{false, true}) {
                oldCamera.getMethod(along ? "jakKAMa" : "JakKAMa", oldVector).invoke(old, direction);
                if (along) current.lookAlong(new Vec3f(x, y, z)); else current.lookAt(new Vec3f(x, y, z));
                Object matrix = oldCamera.getField("aMaJAkK").get(old);
                for (Field field : Mat3f.class.getFields()) {
                    if (field.getType() == float.class && !Modifier.isStatic(field.getModifiers()))
                        equalFloat(matrix.getClass().getField(field.getName()).getFloat(matrix), field.getFloat(current.orientation), "camera matrix " + field.getName());
                }
            }
        }
        System.out.println("PASS: 135 vector/vertex/UV cases and 256 camera orientations match original bytecode, including float edge cases and all UV set overloads.");
    }
}
