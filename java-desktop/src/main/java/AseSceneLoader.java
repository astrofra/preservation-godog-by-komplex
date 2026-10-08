/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.zip.GZIPInputStream;

public class AseSceneLoader
extends SceneRenderer {
    public SplineTrack aJakkam;
    public SplineTrack AjAKkam;
    Object[] ajAKkam;
    Hashtable AJAKkam;
    Hashtable aJAKkam;
    Camera AjaKkam = new Camera();
    Vec3f ajaKkam = new Vec3f();
    String[] AJaKkam;

    static void AKKamaj(Hashtable hashtable, DataInputStream dataInputStream) throws IOException {
        String string;
        while ((string = dataInputStream.readLine()) != null) {
            Object object;
            if (string.endsWith("}")) {
                return;
            }
            String string2 = string.replace('\t', ' ').trim();
            StringTokenizer stringTokenizer = new StringTokenizer(string2, " ");
            String string3 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : "";
            Vector<Object> vector = (Vector<Object>)hashtable.get(string3);
            if (vector == null) {
                vector = new Vector<Object>();
            }
            if (string.endsWith("{")) {
                object = new Hashtable();
                vector.addElement(object);
                hashtable.put(string3, vector);
                AseSceneLoader.AKKamaj((Hashtable)object, dataInputStream);
                continue;
            }
            object = string2.substring(string3.length()).trim();
            vector.addElement(object);
            hashtable.put(string3, vector);
        }
    }

    public void majAKkA(float f) {
        this.MAJAKkA(f, null);
    }

    public void MAJAKkA(float f, Camera mmjjmkk2) {
        if (this.aJakkam == null || this.AjAKkam == null) {
            return;
        }
        this.aJakkam.aKKamAJ(f * 1000.0f);
        this.AjAKkam.aKKamAJ(f * 1000.0f);
        float[] fArray = this.aJakkam.AjAkkAM;
        Quaternionf[] kajjkkkArray = this.AjAKkam.AJAkkAM;
        if (mmjjmkk2 != null) {
            mmjjmkk2.position.mAJaKka(fArray[0], fArray[1], fArray[2]);
            mmjjmkk2.lookAt(new Vec3f(fArray[3], fArray[4], fArray[5]));
        }
        int n = 0;
        while (n < this.mAjAKkA.size()) {
            MeshObject mmaakkk2 = (MeshObject)this.mAjAKkA.elementAt(n);
            mmaakkk2.mAJAKKa = f;
            int n2 = 2;
            while (n2 < this.ajAKkam.length && mmaakkk2 != this.ajAKkam[n2]) {
                ++n2;
            }
            if (n2 == this.ajAKkam.length) break;
            mmaakkk2.Majakka.mAJaKka(fArray[n2 *= 3], fArray[n2 + 1], fArray[n2 + 2]);
            kajjkkkArray[n + 2].aKKamAj(mmaakkk2.mAjakka);
            ++n;
        }
    }

    public AseSceneLoader() {
        super();
    }

    StringTokenizer akkAMaj(Vector vector, int n) {
        String string = (String)vector.elementAt(n);
        return new StringTokenizer(string, " ");
    }

    Vector AKkAmaj(Hashtable hashtable) {
        Vector<float[]> vector = new Vector<float[]>();
        Vector vector2 = (Vector)hashtable.get("*CONTROL_POS_SAMPLE");
        int n = 0;
        while (n < vector2.size()) {
            String string = (String)vector2.elementAt(n);
            StringTokenizer stringTokenizer = new StringTokenizer(string, " ");
            float f = AseSceneLoader.AkkAmaj(stringTokenizer.nextToken());
            float f2 = AseSceneLoader.AkkAmaj(stringTokenizer.nextToken());
            float f3 = AseSceneLoader.AkkAmaj(stringTokenizer.nextToken());
            float f4 = AseSceneLoader.AkkAmaj(stringTokenizer.nextToken());
            float[] fArray = new float[]{f, f2, f3, f4};
            vector.addElement(fArray);
            ++n;
        }
        return vector;
    }

    Vector aKkAMaj(Hashtable hashtable) {
        Vector<float[]> vector = new Vector<float[]>();
        Vector vector2 = (Vector)hashtable.get("*CONTROL_ROT_SAMPLE");
        int n = 0;
        while (n < vector2.size()) {
            String string = (String)vector2.elementAt(n);
            StringTokenizer stringTokenizer = new StringTokenizer(string, " ");
            float f = AseSceneLoader.AkkAmaj(stringTokenizer.nextToken());
            float f2 = AseSceneLoader.AkkAmaj(stringTokenizer.nextToken());
            float f3 = AseSceneLoader.AkkAmaj(stringTokenizer.nextToken());
            float f4 = AseSceneLoader.AkkAmaj(stringTokenizer.nextToken());
            float f5 = AseSceneLoader.AkkAmaj(stringTokenizer.nextToken());
            float[] fArray = new float[]{f, f2, f3, f4, f5};
            vector.addElement(fArray);
            ++n;
        }
        return vector;
    }

    void aKKAMaj(Hashtable hashtable, Object object) {
        if (hashtable == null) {
            return;
        }
        if (hashtable.get("*CONTROL_POS_TCB") != null) {
            throw new IllegalArgumentException("TCB data is not supported.");
        }
        Vector vector = (Vector)hashtable.get("*CONTROL_POS_TRACK");
        Vector vector2 = (Vector)hashtable.get("*CONTROL_ROT_TRACK");
        if (vector != null) {
            this.AJAKkam.put(object, this.AKkAmaj(AseSceneLoader.aKKAmaj(vector)));
        }
        if (vector2 != null) {
            this.aJAKkam.put(object, this.aKkAMaj(AseSceneLoader.aKKAmaj(vector2)));
        }
    }

    Camera aKKamaj(Hashtable hashtable) {
        Camera mmjjmkk2 = new Camera();
        Vector vector = (Vector)hashtable.get("*TM_ANIMATION");
        if (vector == null) {
            return mmjjmkk2;
        }
        this.aKKAMaj((Hashtable)vector.elementAt(0), mmjjmkk2);
        this.aKKAMaj((Hashtable)vector.elementAt(1), this.ajaKkam);
        return mmjjmkk2;
    }

    void akkAmaj(Hashtable hashtable, MeshObject mmaakkk2) {
        if (hashtable == null) {
            return;
        }
        Vector vector = (Vector)hashtable.get("*MESH_VERTEX");
        int n = 0;
        while (n < vector.size()) {
            StringTokenizer stringTokenizer = this.akkAMaj(vector, n);
            int n2 = AseSceneLoader.AKkAMaj(stringTokenizer.nextToken());
            double d = AseSceneLoader.akKAMaj(stringTokenizer.nextToken());
            double d2 = AseSceneLoader.akKAMaj(stringTokenizer.nextToken());
            double d3 = AseSceneLoader.akKAMaj(stringTokenizer.nextToken());
            mmaakkk2.MAJakka[n2] = new Vertex(d, d2, d3);
            ++n;
        }
    }

    void AkKamaj(Hashtable hashtable, MeshObject mmaakkk2) {
        if (hashtable == null) {
            return;
        }
        Vector vector = (Vector)hashtable.get("*MESH_TVERT");
        int n = 0;
        while (n < vector.size()) {
            StringTokenizer stringTokenizer = this.akkAMaj(vector, n);
            int n2 = AseSceneLoader.AKkAMaj(stringTokenizer.nextToken());
            double d = AseSceneLoader.akKAMaj(stringTokenizer.nextToken());
            double d2 = AseSceneLoader.akKAMaj(stringTokenizer.nextToken());
            mmaakkk2.mAJakka[n2] = new UvCoord(d, 1.0 - d2);
            ++n;
        }
    }

    void akKAmaj(Hashtable hashtable, MeshObject mmaakkk2) {
        if (hashtable == null) {
            return;
        }
        Vector vector = (Vector)hashtable.get("*MESH_FACE");
        int n = 0;
        while (n < vector.size()) {
            String string = (String)vector.elementAt(n);
            string = string.replace(':', ' ');
            StringTokenizer stringTokenizer = new StringTokenizer(string, " ");
            int n2 = AseSceneLoader.AKkAMaj(stringTokenizer.nextToken());
            stringTokenizer.nextToken();
            int n3 = AseSceneLoader.AKkAMaj(stringTokenizer.nextToken());
            stringTokenizer.nextToken();
            int n4 = AseSceneLoader.AKkAMaj(stringTokenizer.nextToken());
            stringTokenizer.nextToken();
            int n5 = AseSceneLoader.AKkAMaj(stringTokenizer.nextToken());
            stringTokenizer.nextToken();
            mmaakkk2.maJakka[n2] = mmaakkk2.mAJakka != null ? new Triangle(mmaakkk2, n3, n4, n5, n3, n4, n5) : new Triangle(mmaakkk2, n3, n4, n5);
            ++n;
        }
    }

    void AkKAmaj(Hashtable hashtable, MeshObject mmaakkk2) {
        if (hashtable == null) {
            return;
        }
        Vector vector = (Vector)hashtable.get("*MESH_TFACE");
        int n = 0;
        while (n < vector.size()) {
            StringTokenizer stringTokenizer = this.akkAMaj(vector, n);
            int n2 = AseSceneLoader.AKkAMaj(stringTokenizer.nextToken());
            int n3 = AseSceneLoader.AKkAMaj(stringTokenizer.nextToken());
            int n4 = AseSceneLoader.AKkAMaj(stringTokenizer.nextToken());
            int n5 = AseSceneLoader.AKkAMaj(stringTokenizer.nextToken());
            Triangle kajjkka2 = mmaakkk2.maJakka[n2];
            kajjkka2.AmaJAkk = mmaakkk2.mAJakka[n3];
            kajjkka2.amaJAkk = mmaakkk2.mAJakka[n4];
            kajjkka2.AMaJAkk = mmaakkk2.mAJakka[n5];
            ++n;
        }
    }

    MeshObject akkamaj(Hashtable hashtable) {
        MeshObject mmaakkk2 = new MeshObject();
        StringTokenizer stringTokenizer = this.akkAMaj((Vector)hashtable.get("*MESH_NUMVERTEX"), 0);
        mmaakkk2.MAJakka = new Vertex[AseSceneLoader.AKkAMaj(stringTokenizer.nextToken())];
        Object v = hashtable.get("*MESH_NUMTVERTEX");
        if (v != null) {
            stringTokenizer = this.akkAMaj((Vector)v, 0);
            int n = AseSceneLoader.AKkAMaj(stringTokenizer.nextToken());
            if (n == 0) {
                n = mmaakkk2.MAJakka.length;
            }
            mmaakkk2.mAJakka = new UvCoord[n];
        }
        stringTokenizer = this.akkAMaj((Vector)hashtable.get("*MESH_NUMFACES"), 0);
        mmaakkk2.maJakka = new Triangle[AseSceneLoader.AKkAMaj(stringTokenizer.nextToken())];
        this.akkAmaj(AseSceneLoader.aKKAmaj(hashtable.get("*MESH_VERTEX_LIST")), mmaakkk2);
        this.AkKamaj(AseSceneLoader.aKKAmaj(hashtable.get("*MESH_TVERTLIST")), mmaakkk2);
        this.akKAmaj(AseSceneLoader.aKKAmaj(hashtable.get("*MESH_FACE_LIST")), mmaakkk2);
        this.AkKAmaj(AseSceneLoader.aKKAmaj(hashtable.get("*MESH_TFACELIST")), mmaakkk2);
        return mmaakkk2;
    }

    MeshObject AKkamaj(Hashtable hashtable) {
        String string = (String)((Vector)hashtable.get("*NODE_NAME")).elementAt(0);
        if (string.charAt(0) == '_') {
            return null;
        }
        if (this.AJaKkam != null) {
            int n = 0;
            while (n < this.AJaKkam.length) {
                if (string.equalsIgnoreCase(this.AJaKkam[n])) {
                    return null;
                }
                ++n;
            }
        }
        MeshObject mmaakkk2 = null;
        mmaakkk2 = this.akkamaj(AseSceneLoader.aKKAmaj(hashtable.get("*MESH")));
        this.aKKAMaj(AseSceneLoader.aKKAmaj(hashtable.get("*TM_ANIMATION")), mmaakkk2);
        if (mmaakkk2 != null) {
            Hashtable hashtable2 = AseSceneLoader.aKKAmaj(hashtable.get("*NODE_TM"));
            StringTokenizer stringTokenizer = this.akkAMaj((Vector)hashtable2.get("*TM_POS"), 0);
            Vec3f kaajmma2 = new Vec3f(AseSceneLoader.AkkAmaj(stringTokenizer.nextToken()), AseSceneLoader.AkkAmaj(stringTokenizer.nextToken()), AseSceneLoader.AkkAmaj(stringTokenizer.nextToken()));
            mmaakkk2.jaKkama(kaajmma2);
            mmaakkk2.Majakka.MAJAkKA(kaajmma2);
            Mat3f kaaakka2 = mmaakkk2.mAjakka;
            stringTokenizer = this.akkAMaj((Vector)hashtable2.get("*TM_ROW0"), 0);
            kaaakka2.KAMajAK(AseSceneLoader.AkkAmaj(stringTokenizer.nextToken()), AseSceneLoader.AkkAmaj(stringTokenizer.nextToken()), AseSceneLoader.AkkAmaj(stringTokenizer.nextToken()));
            stringTokenizer = this.akkAMaj((Vector)hashtable2.get("*TM_ROW1"), 0);
            kaaakka2.kaMajAK(AseSceneLoader.AkkAmaj(stringTokenizer.nextToken()), AseSceneLoader.AkkAmaj(stringTokenizer.nextToken()), AseSceneLoader.AkkAmaj(stringTokenizer.nextToken()));
            stringTokenizer = this.akkAMaj((Vector)hashtable2.get("*TM_ROW2"), 0);
            kaaakka2.KaMajAK(AseSceneLoader.AkkAmaj(stringTokenizer.nextToken()), AseSceneLoader.AkkAmaj(stringTokenizer.nextToken()), AseSceneLoader.AkkAmaj(stringTokenizer.nextToken()));
            mmaakkk2.jAkKaMA(string);
        }
        System.out.println("mesh:" + string + "  verts:" + mmaakkk2.MAJakka.length + "  faces:" + mmaakkk2.maJakka.length);
        return mmaakkk2;
    }

    void Akkamaj(Hashtable hashtable, String[] stringArray) {
        Vector vector;
        Object object;
        Cloneable cloneable;
        this.AJaKkam = stringArray;
        this.AjaKkam = new Camera();
        this.ajaKkam = new Vec3f();
        this.AJAKkam = new Hashtable();
        this.aJAKkam = new Hashtable();
        this.aJakkam = null;
        this.AjAKkam = null;
        Vector vector2 = (Vector)hashtable.get("*CAMERAOBJECT");
        this.AjaKkam = this.aKKamaj(AseSceneLoader.aKKAmaj(vector2));
        Vector vector3 = (Vector)hashtable.get("*GEOMOBJECT");
        int n = 0;
        while (n < vector3.size()) {
            cloneable = (Hashtable)vector3.elementAt(n);
            object = this.AKkamaj((Hashtable)cloneable);
            if (object != null) {
                this.mAJAKkA((MeshObject)object);
            }
            ++n;
        }
        this.aJakkam = null;
        this.AjAKkam = null;
        cloneable = null;
        int n2 = 0;
        object = this.AJAKkam.elements();
        while (((java.util.Enumeration)object).hasMoreElements()) {
            vector = (Vector)((java.util.Enumeration)object).nextElement();
            if (cloneable == null) {
                cloneable = vector;
            }
            if (vector.size() <= ((Vector)cloneable).size()) continue;
            cloneable = vector;
        }
        object = this.aJAKkam.elements();
        while (((java.util.Enumeration)object).hasMoreElements()) {
            vector = (Vector)((java.util.Enumeration)object).nextElement();
            if (cloneable == null) {
                cloneable = vector;
            }
            if (vector.size() <= ((Vector)cloneable).size()) continue;
            cloneable = vector;
        }
        n2 = ((Vector)cloneable).size();
        int n3 = 2 + this.mAjAKkA.size();
        TrackKeyframe[] majjmmaArray = new TrackKeyframe[n2];
        TrackKeyframe[] majjmmaArray2 = new TrackKeyframe[n2];
        int n4 = 0;
        while (n4 < n2) {
            float[] fArray = (float[])((Vector)cloneable).elementAt(n4);
            majjmmaArray[n4] = new TrackKeyframe(fArray[0], 0.0f, 0.0f, 0.0f, new float[3 * n3]);
            majjmmaArray2[n4] = new TrackKeyframe(fArray[0], 0.0f, 0.0f, 0.0f, new Quaternionf[n3]);
            int n5 = 0;
            while (n5 < n3) {
                majjmmaArray2[n4].MaJaKKA[n5] = new Quaternionf();
                ++n5;
            }
            ++n4;
        }
        this.ajAKkam = new Object[n3];
        int n6 = 0;
        while (n6 < n3) {
            Object object2;
            Object object3;
            float[] fArray = new float[3];
            Quaternionf kajjkkk2 = new Quaternionf();
            Object object4 = null;
            switch (n6) {
                case 0: {
                    object4 = this.AjaKkam;
                    break;
                }
                case 1: {
                    object4 = this.ajaKkam;
                    break;
                }
                default: {
                    MeshObject mmaakkk2 = (MeshObject)this.mAjAKkA.elementAt(n6 - 2);
                    object4 = mmaakkk2;
                    fArray[0] = mmaakkk2.Majakka.x;
                    fArray[1] = mmaakkk2.Majakka.y;
                    fArray[2] = mmaakkk2.Majakka.z;
                    kajjkkk2.AKkamAj(mmaakkk2.mAjakka.kamaJAK());
                }
            }
            this.ajAKkam[n6] = object4;
            Vector vector4 = (Vector)this.AJAKkam.get(object4);
            Vector vector5 = (Vector)this.aJAKkam.get(object4);
            int n7 = 0;
            int n8 = 0;
            if (vector4 != null) {
                n8 = vector4.size();
            }
            n8 = Math.min(n8, n2);
            n7 = 0;
            while (n7 < n8) {
                object3 = (float[])vector4.elementAt(n7);
                System.arraycopy(object3, 1, majjmmaArray[n7].MAjAkkA, n6 * 3, 3);
                System.arraycopy(object3, 1, fArray, 0, 3);
                ++n7;
            }
            while (n7 < n2) {
                System.arraycopy(fArray, 0, majjmmaArray[n7].MAjAkkA, n6 * 3, 3);
                ++n7;
            }
            object3 = null;
            int n9 = 0;
            int n10 = 0;
            if (vector5 != null) {
                n10 = vector5.size();
            }
            n10 = Math.min(n10, n2);
            float f = 0.0f;
            object3 = kajjkkk2;
            Quaternionf kajjkkk3 = new Quaternionf();
            n9 = 0;
            while (n9 < n10) {
                float[] rotationSample = (float[])vector5.elementAt(n9);
                if (n9 > 1 && Math.abs(rotationSample[4] - f) > 3.2f) {
                    rotationSample[1] = rotationSample[1] * -1.0f;
                    rotationSample[2] = rotationSample[2] * -1.0f;
                    rotationSample[3] = rotationSample[3] * -1.0f;
                    rotationSample[4] = (float)Math.PI * 2 - rotationSample[4];
                }
                f = rotationSample[4];
                kajjkkk3.AKkaMAj(new Vec3f(rotationSample[1], rotationSample[2], rotationSample[3]), rotationSample[4]);
                if (object3 != null) {
                    kajjkkk3.AkkaMAj((Quaternionf)object3);
                }
                object3 = new Quaternionf(kajjkkk3);
                Vec3f kaajmma2 = new Vec3f();
                float f2 = kajjkkk3.akKAmAj(kaajmma2);
                majjmmaArray2[n9].MaJaKKA[n6] = new Quaternionf(kaajmma2.x, kaajmma2.y, kaajmma2.z, f2);
                kajjkkk2 = majjmmaArray2[n9].MaJaKKA[n6];
                ++n9;
            }
            while (n9 < n2) {
                Vec3f rotationAxis = new Vec3f();
                float f3 = kajjkkk3.akKAmAj(rotationAxis);
                majjmmaArray2[n9].MaJaKKA[n6] = new Quaternionf(rotationAxis.x, rotationAxis.y, rotationAxis.z, f3);
                ++n9;
            }
            ++n6;
        }
        this.aJakkam = new SplineTrack(majjmmaArray, 2, 0);
        this.AjAKkam = new SplineTrack(majjmmaArray2, 2, 2);
        this.AJAKkam = null;
        this.aJAKkam = null;
    }

    public static float AkkAmaj(String string) {
        if (string.charAt(string.length() - 1) == ',') {
            string = string.substring(0, string.length() - 1);
        }
        return Float.valueOf(string).floatValue();
    }

    public static double akKAMaj(String string) {
        if (string.charAt(string.length() - 1) == ',') {
            string = string.substring(0, string.length() - 1);
        }
        return Double.valueOf(string);
    }

    public static int AKkAMaj(String string) {
        if (string.charAt(string.length() - 1) == ',') {
            string = string.substring(0, string.length() - 1);
        }
        return Integer.parseInt(string);
    }

    static Hashtable aKKAmaj(Object object) {
        if (object instanceof Vector) {
            return (Hashtable)((Vector)object).elementAt(0);
        }
        return (Hashtable)object;
    }

    public static AseSceneLoader akKamaj(URL uRL) {
        return AseSceneLoader.AkkAMaj(uRL, null);
    }

    public static AseSceneLoader AKKAMaj(InputStream inputStream) {
        return AseSceneLoader.aKkamaj(inputStream, null);
    }

    public static AseSceneLoader AkkAMaj(URL uRL, String[] stringArray) {
        try {
            return AseSceneLoader.aKkamaj(uRL.openStream(), stringArray);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    public static AseSceneLoader aKkamaj(InputStream inputStream, String[] stringArray) {
        AseSceneLoader kmjjkkk2 = null;
        Hashtable hashtable = new Hashtable();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 32768);
            AseSceneLoader.AKKamaj(hashtable, new DataInputStream(bufferedInputStream));
            ((FilterInputStream)bufferedInputStream).close();
            kmjjkkk2 = new AseSceneLoader();
            kmjjkkk2.Akkamaj(hashtable, stringArray);
            return kmjjkkk2;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public void AKKAmaj(URL uRL, String[] stringArray) {
        Hashtable hashtable = new Hashtable();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(uRL.openStream(), 8192);
            String string = uRL.getFile().toLowerCase();
            if (string.endsWith("z")) {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new GZIPInputStream(bufferedInputStream), 8192);
                AseSceneLoader.AKKamaj(hashtable, new DataInputStream(bufferedInputStream2));
            } else {
                AseSceneLoader.AKKamaj(hashtable, new DataInputStream(bufferedInputStream));
            }
            AseSceneLoader.AKKamaj(hashtable, new DataInputStream(bufferedInputStream));
            ((FilterInputStream)bufferedInputStream).close();
            this.Akkamaj(hashtable, stringArray);
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }
}

