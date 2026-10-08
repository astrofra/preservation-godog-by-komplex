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

public class kmjjkkk
extends maaakma {
    public kajammk aJakkam;
    public kajammk AjAKkam;
    Object[] ajAKkam;
    Hashtable AJAKkam;
    Hashtable aJAKkam;
    mmjjmkk AjaKkam = new mmjjmkk();
    kaajmma ajaKkam = new kaajmma();
    String[] AJaKkam;

    /*
     * WARNING - void declaration
     */
    static void AKKamaj() throws IOException {
        void var1_1;
        String string;
        while ((string = var1_1.readLine()) != null) {
            Object object;
            Hashtable hashtable;
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
                kmjjkkk.AKKamaj((Hashtable)object, (DataInputStream)var1_1);
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

    public void MAJAKkA(float f, mmjjmkk mmjjmkk2) {
        if (this.aJakkam == null || this.AjAKkam == null) {
            return;
        }
        this.aJakkam.aKKamAJ(f * 1000.0f);
        this.AjAKkam.aKKamAJ(f * 1000.0f);
        float[] fArray = this.aJakkam.AjAkkAM;
        kajjkkk[] kajjkkkArray = this.AjAKkam.AJAkkAM;
        if (mmjjmkk2 != null) {
            mmjjmkk2.AMaJAkK.mAJaKka(fArray[0], fArray[1], fArray[2]);
            mmjjmkk2.JakKAMa(new kaajmma(fArray[3], fArray[4], fArray[5]));
        }
        int n = 0;
        while (n < this.mAjAKkA.size()) {
            mmaakkk mmaakkk2 = (mmaakkk)this.mAjAKkA.elementAt(n);
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

    public kmjjkkk() {
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
            float f = kmjjkkk.AkkAmaj(stringTokenizer.nextToken());
            float f2 = kmjjkkk.AkkAmaj(stringTokenizer.nextToken());
            float f3 = kmjjkkk.AkkAmaj(stringTokenizer.nextToken());
            float f4 = kmjjkkk.AkkAmaj(stringTokenizer.nextToken());
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
            float f = kmjjkkk.AkkAmaj(stringTokenizer.nextToken());
            float f2 = kmjjkkk.AkkAmaj(stringTokenizer.nextToken());
            float f3 = kmjjkkk.AkkAmaj(stringTokenizer.nextToken());
            float f4 = kmjjkkk.AkkAmaj(stringTokenizer.nextToken());
            float f5 = kmjjkkk.AkkAmaj(stringTokenizer.nextToken());
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
            this.AJAKkam.put(object, this.AKkAmaj(kmjjkkk.aKKAmaj(vector)));
        }
        if (vector2 != null) {
            this.aJAKkam.put(object, this.aKkAMaj(kmjjkkk.aKKAmaj(vector2)));
        }
    }

    mmjjmkk aKKamaj(Hashtable hashtable) {
        mmjjmkk mmjjmkk2 = new mmjjmkk();
        Vector vector = (Vector)hashtable.get("*TM_ANIMATION");
        if (vector == null) {
            return mmjjmkk2;
        }
        this.aKKAMaj((Hashtable)vector.elementAt(0), mmjjmkk2);
        this.aKKAMaj((Hashtable)vector.elementAt(1), this.ajaKkam);
        return mmjjmkk2;
    }

    void akkAmaj(Hashtable hashtable, mmaakkk mmaakkk2) {
        if (hashtable == null) {
            return;
        }
        Vector vector = (Vector)hashtable.get("*MESH_VERTEX");
        int n = 0;
        while (n < vector.size()) {
            StringTokenizer stringTokenizer = this.akkAMaj(vector, n);
            int n2 = kmjjkkk.AKkAMaj(stringTokenizer.nextToken());
            double d = kmjjkkk.akKAMaj(stringTokenizer.nextToken());
            double d2 = kmjjkkk.akKAMaj(stringTokenizer.nextToken());
            double d3 = kmjjkkk.akKAMaj(stringTokenizer.nextToken());
            mmaakkk2.MAJakka[n2] = new majjmka(d, d2, d3);
            ++n;
        }
    }

    void AkKamaj(Hashtable hashtable, mmaakkk mmaakkk2) {
        if (hashtable == null) {
            return;
        }
        Vector vector = (Vector)hashtable.get("*MESH_TVERT");
        int n = 0;
        while (n < vector.size()) {
            StringTokenizer stringTokenizer = this.akkAMaj(vector, n);
            int n2 = kmjjkkk.AKkAMaj(stringTokenizer.nextToken());
            double d = kmjjkkk.akKAMaj(stringTokenizer.nextToken());
            double d2 = kmjjkkk.akKAMaj(stringTokenizer.nextToken());
            mmaakkk2.mAJakka[n2] = new kajjmmk(d, 1.0 - d2);
            ++n;
        }
    }

    void akKAmaj(Hashtable hashtable, mmaakkk mmaakkk2) {
        if (hashtable == null) {
            return;
        }
        Vector vector = (Vector)hashtable.get("*MESH_FACE");
        int n = 0;
        while (n < vector.size()) {
            String string = (String)vector.elementAt(n);
            string = string.replace(':', ' ');
            StringTokenizer stringTokenizer = new StringTokenizer(string, " ");
            int n2 = kmjjkkk.AKkAMaj(stringTokenizer.nextToken());
            stringTokenizer.nextToken();
            int n3 = kmjjkkk.AKkAMaj(stringTokenizer.nextToken());
            stringTokenizer.nextToken();
            int n4 = kmjjkkk.AKkAMaj(stringTokenizer.nextToken());
            stringTokenizer.nextToken();
            int n5 = kmjjkkk.AKkAMaj(stringTokenizer.nextToken());
            stringTokenizer.nextToken();
            mmaakkk2.maJakka[n2] = mmaakkk2.mAJakka != null ? new kajjkka(mmaakkk2, n3, n4, n5, n3, n4, n5) : new kajjkka(mmaakkk2, n3, n4, n5);
            ++n;
        }
    }

    void AkKAmaj(Hashtable hashtable, mmaakkk mmaakkk2) {
        if (hashtable == null) {
            return;
        }
        Vector vector = (Vector)hashtable.get("*MESH_TFACE");
        int n = 0;
        while (n < vector.size()) {
            StringTokenizer stringTokenizer = this.akkAMaj(vector, n);
            int n2 = kmjjkkk.AKkAMaj(stringTokenizer.nextToken());
            int n3 = kmjjkkk.AKkAMaj(stringTokenizer.nextToken());
            int n4 = kmjjkkk.AKkAMaj(stringTokenizer.nextToken());
            int n5 = kmjjkkk.AKkAMaj(stringTokenizer.nextToken());
            kajjkka kajjkka2 = mmaakkk2.maJakka[n2];
            kajjkka2.AmaJAkk = mmaakkk2.mAJakka[n3];
            kajjkka2.amaJAkk = mmaakkk2.mAJakka[n4];
            kajjkka2.AMaJAkk = mmaakkk2.mAJakka[n5];
            ++n;
        }
    }

    mmaakkk akkamaj(Hashtable hashtable) {
        mmaakkk mmaakkk2 = new mmaakkk();
        StringTokenizer stringTokenizer = this.akkAMaj((Vector)hashtable.get("*MESH_NUMVERTEX"), 0);
        mmaakkk2.MAJakka = new majjmka[kmjjkkk.AKkAMaj(stringTokenizer.nextToken())];
        Object v = hashtable.get("*MESH_NUMTVERTEX");
        if (v != null) {
            stringTokenizer = this.akkAMaj((Vector)v, 0);
            int n = kmjjkkk.AKkAMaj(stringTokenizer.nextToken());
            if (n == 0) {
                n = mmaakkk2.MAJakka.length;
            }
            mmaakkk2.mAJakka = new kajjmmk[n];
        }
        stringTokenizer = this.akkAMaj((Vector)hashtable.get("*MESH_NUMFACES"), 0);
        mmaakkk2.maJakka = new kajjkka[kmjjkkk.AKkAMaj(stringTokenizer.nextToken())];
        this.akkAmaj(kmjjkkk.aKKAmaj(hashtable.get("*MESH_VERTEX_LIST")), mmaakkk2);
        this.AkKamaj(kmjjkkk.aKKAmaj(hashtable.get("*MESH_TVERTLIST")), mmaakkk2);
        this.akKAmaj(kmjjkkk.aKKAmaj(hashtable.get("*MESH_FACE_LIST")), mmaakkk2);
        this.AkKAmaj(kmjjkkk.aKKAmaj(hashtable.get("*MESH_TFACELIST")), mmaakkk2);
        return mmaakkk2;
    }

    mmaakkk AKkamaj(Hashtable hashtable) {
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
        mmaakkk mmaakkk2 = null;
        mmaakkk2 = this.akkamaj(kmjjkkk.aKKAmaj(hashtable.get("*MESH")));
        this.aKKAMaj(kmjjkkk.aKKAmaj(hashtable.get("*TM_ANIMATION")), mmaakkk2);
        if (mmaakkk2 != null) {
            Hashtable hashtable2 = kmjjkkk.aKKAmaj(hashtable.get("*NODE_TM"));
            StringTokenizer stringTokenizer = this.akkAMaj((Vector)hashtable2.get("*TM_POS"), 0);
            kaajmma kaajmma2 = new kaajmma(kmjjkkk.AkkAmaj(stringTokenizer.nextToken()), kmjjkkk.AkkAmaj(stringTokenizer.nextToken()), kmjjkkk.AkkAmaj(stringTokenizer.nextToken()));
            mmaakkk2.jaKkama(kaajmma2);
            mmaakkk2.Majakka.MAJAkKA(kaajmma2);
            kaaakka kaaakka2 = mmaakkk2.mAjakka;
            stringTokenizer = this.akkAMaj((Vector)hashtable2.get("*TM_ROW0"), 0);
            kaaakka2.KAMajAK(kmjjkkk.AkkAmaj(stringTokenizer.nextToken()), kmjjkkk.AkkAmaj(stringTokenizer.nextToken()), kmjjkkk.AkkAmaj(stringTokenizer.nextToken()));
            stringTokenizer = this.akkAMaj((Vector)hashtable2.get("*TM_ROW1"), 0);
            kaaakka2.kaMajAK(kmjjkkk.AkkAmaj(stringTokenizer.nextToken()), kmjjkkk.AkkAmaj(stringTokenizer.nextToken()), kmjjkkk.AkkAmaj(stringTokenizer.nextToken()));
            stringTokenizer = this.akkAMaj((Vector)hashtable2.get("*TM_ROW2"), 0);
            kaaakka2.KaMajAK(kmjjkkk.AkkAmaj(stringTokenizer.nextToken()), kmjjkkk.AkkAmaj(stringTokenizer.nextToken()), kmjjkkk.AkkAmaj(stringTokenizer.nextToken()));
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
        this.AjaKkam = new mmjjmkk();
        this.ajaKkam = new kaajmma();
        this.AJAKkam = new Hashtable();
        this.aJAKkam = new Hashtable();
        this.aJakkam = null;
        this.AjAKkam = null;
        Vector vector2 = (Vector)hashtable.get("*CAMERAOBJECT");
        this.AjaKkam = this.aKKamaj(kmjjkkk.aKKAmaj(vector2));
        Vector vector3 = (Vector)hashtable.get("*GEOMOBJECT");
        int n = 0;
        while (n < vector3.size()) {
            cloneable = (Hashtable)vector3.elementAt(n);
            object = this.AKkamaj((Hashtable)cloneable);
            if (object != null) {
                this.mAJAKkA((mmaakkk)object);
            }
            ++n;
        }
        this.aJakkam = null;
        this.AjAKkam = null;
        cloneable = null;
        int n2 = 0;
        object = this.AJAKkam.elements();
        while (object.hasMoreElements()) {
            vector = (Vector)object.nextElement();
            if (cloneable == null) {
                cloneable = vector;
            }
            if (vector.size() <= ((Vector)cloneable).size()) continue;
            cloneable = vector;
        }
        object = this.aJAKkam.elements();
        while (object.hasMoreElements()) {
            vector = (Vector)object.nextElement();
            if (cloneable == null) {
                cloneable = vector;
            }
            if (vector.size() <= ((Vector)cloneable).size()) continue;
            cloneable = vector;
        }
        n2 = ((Vector)cloneable).size();
        int n3 = 2 + this.mAjAKkA.size();
        majjmma[] majjmmaArray = new majjmma[n2];
        majjmma[] majjmmaArray2 = new majjmma[n2];
        int n4 = 0;
        while (n4 < n2) {
            float[] fArray = (float[])((Vector)cloneable).elementAt(n4);
            majjmmaArray[n4] = new majjmma(fArray[0], 0.0f, 0.0f, 0.0f, new float[3 * n3]);
            majjmmaArray2[n4] = new majjmma(fArray[0], 0.0f, 0.0f, 0.0f, new kajjkkk[n3]);
            int n5 = 0;
            while (n5 < n3) {
                majjmmaArray2[n4].MaJaKKA[n5] = new kajjkkk();
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
            kajjkkk kajjkkk2 = new kajjkkk();
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
                    mmaakkk mmaakkk2 = (mmaakkk)this.mAjAKkA.elementAt(n6 - 2);
                    object4 = mmaakkk2;
                    fArray[0] = mmaakkk2.Majakka.MajaKka;
                    fArray[1] = mmaakkk2.Majakka.majaKka;
                    fArray[2] = mmaakkk2.Majakka.MAjaKka;
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
            kajjkkk kajjkkk3 = new kajjkkk();
            n9 = 0;
            while (n9 < n10) {
                object2 = (float[])vector5.elementAt(n9);
                if (n9 > 1 && Math.abs(object2[4] - f) > 3.2f) {
                    object2[1] = object2[1] * -1.0f;
                    object2[2] = object2[2] * -1.0f;
                    object2[3] = object2[3] * -1.0f;
                    object2[4] = (float)Math.PI * 2 - object2[4];
                }
                f = object2[4];
                kajjkkk3.AKkaMAj(new kaajmma(object2[1], object2[2], object2[3]), object2[4]);
                if (object3 != null) {
                    kajjkkk3.AkkaMAj((kajjkkk)object3);
                }
                object3 = new kajjkkk(kajjkkk3);
                kaajmma kaajmma2 = new kaajmma();
                float f2 = kajjkkk3.akKAmAj(kaajmma2);
                majjmmaArray2[n9].MaJaKKA[n6] = new kajjkkk(kaajmma2.MajaKka, kaajmma2.majaKka, kaajmma2.MAjaKka, f2);
                kajjkkk2 = majjmmaArray2[n9].MaJaKKA[n6];
                ++n9;
            }
            while (n9 < n2) {
                object2 = new kaajmma();
                float f3 = kajjkkk3.akKAmAj((kaajmma)object2);
                majjmmaArray2[n9].MaJaKKA[n6] = new kajjkkk(object2.MajaKka, object2.majaKka, object2.MAjaKka, f3);
                ++n9;
            }
            ++n6;
        }
        this.aJakkam = new kajammk(majjmmaArray, 2, 0);
        this.AjAKkam = new kajammk(majjmmaArray2, 2, 2);
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

    public static kmjjkkk akKamaj(URL uRL) {
        return kmjjkkk.AkkAMaj(uRL, null);
    }

    public static kmjjkkk AKKAMaj(InputStream inputStream) {
        return kmjjkkk.aKkamaj(inputStream, null);
    }

    public static kmjjkkk AkkAMaj(URL uRL, String[] stringArray) {
        try {
            return kmjjkkk.aKkamaj(uRL.openStream(), stringArray);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    public static kmjjkkk aKkamaj(InputStream inputStream, String[] stringArray) {
        kmjjkkk kmjjkkk2 = null;
        Hashtable hashtable = new Hashtable();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 32768);
            kmjjkkk.AKKamaj(hashtable, new DataInputStream(bufferedInputStream));
            ((FilterInputStream)bufferedInputStream).close();
            kmjjkkk2 = new kmjjkkk();
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
                kmjjkkk.AKKamaj(hashtable, new DataInputStream(bufferedInputStream2));
            } else {
                kmjjkkk.AKKamaj(hashtable, new DataInputStream(bufferedInputStream));
            }
            kmjjkkk.AKKamaj(hashtable, new DataInputStream(bufferedInputStream));
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

