import java.util.zip.GZIPInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.io.IOException;
import java.util.Vector;
import java.util.StringTokenizer;
import java.io.DataInputStream;
import java.util.Hashtable;

// 
// Decompiled by Procyon v0.6.0
// 

public class kmjjkkk extends maaakma
{
    public kajammk aJakkam;
    public kajammk AjAKkam;
    Object[] ajAKkam;
    Hashtable AJAKkam;
    Hashtable aJAKkam;
    mmjjmkk AjaKkam;
    kaajmma ajaKkam;
    String[] AJaKkam;
    
    static void AKKamaj(final Hashtable hashtable, final DataInputStream dataInputStream) throws IOException {
        String line;
        while ((line = dataInputStream.readLine()) != null) {
            if (line.endsWith("}")) {
                return;
            }
            final String trim = line.replace('\t', ' ').trim();
            final StringTokenizer stringTokenizer = new StringTokenizer(trim, " ");
            final String key = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : "";
            Vector<?> vector = (Vector<?>)hashtable.get(key);
            if (vector == null) {
                vector = new Vector<Object>();
            }
            if (line.endsWith("{")) {
                final Hashtable obj = new Hashtable();
                vector.addElement(obj);
                hashtable.put(key, vector);
                AKKamaj(obj, dataInputStream);
            }
            else {
                vector.addElement(trim.substring(key.length()).trim());
                hashtable.put(key, vector);
            }
        }
    }
    
    public void majAKkA(final float n) {
        this.MAJAKkA(n, null);
    }
    
    public void MAJAKkA(final float majakKa, final mmjjmkk mmjjmkk) {
        if (this.aJakkam == null || this.AjAKkam == null) {
            return;
        }
        this.aJakkam.aKKamAJ(majakKa * 1000.0f);
        this.AjAKkam.aKKamAJ(majakKa * 1000.0f);
        final float[] ajAkkAM = this.aJakkam.AjAkkAM;
        final kajjkkk[] ajAkkAM2 = this.AjAKkam.AJAkkAM;
        if (mmjjmkk != null) {
            mmjjmkk.AMaJAkK.mAJaKka(ajAkkAM[0], ajAkkAM[1], ajAkkAM[2]);
            mmjjmkk.JakKAMa(new kaajmma(ajAkkAM[3], ajAkkAM[4], ajAkkAM[5]));
        }
        for (int i = 0; i < super.mAjAKkA.size(); ++i) {
            final mmaakkk mmaakkk = (mmaakkk)super.mAjAKkA.elementAt(i);
            mmaakkk.mAJAKKa = majakKa;
            int n;
            for (n = 2; n < this.ajAKkam.length && mmaakkk != this.ajAKkam[n]; ++n) {}
            if (n == this.ajAKkam.length) {
                break;
            }
            final int n2 = n * 3;
            mmaakkk.Majakka.mAJaKka(ajAkkAM[n2], ajAkkAM[n2 + 1], ajAkkAM[n2 + 2]);
            ajAkkAM2[i + 2].aKKamAj(mmaakkk.mAjakka);
        }
    }
    
    public kmjjkkk() {
        this.AjaKkam = new mmjjmkk();
        this.ajaKkam = new kaajmma();
    }
    
    StringTokenizer akkAMaj(final Vector vector, final int index) {
        return new StringTokenizer(vector.elementAt(index), " ");
    }
    
    Vector AKkAmaj(final Hashtable hashtable) {
        final Vector vector = new Vector();
        final Vector vector2 = (Vector)hashtable.get("*CONTROL_POS_SAMPLE");
        for (int i = 0; i < vector2.size(); ++i) {
            final StringTokenizer stringTokenizer = new StringTokenizer((String)vector2.elementAt(i), " ");
            vector.addElement(new float[] { AkkAmaj(stringTokenizer.nextToken()), AkkAmaj(stringTokenizer.nextToken()), AkkAmaj(stringTokenizer.nextToken()), AkkAmaj(stringTokenizer.nextToken()) });
        }
        return vector;
    }
    
    Vector aKkAMaj(final Hashtable hashtable) {
        final Vector vector = new Vector();
        final Vector vector2 = (Vector)hashtable.get("*CONTROL_ROT_SAMPLE");
        for (int i = 0; i < vector2.size(); ++i) {
            final StringTokenizer stringTokenizer = new StringTokenizer((String)vector2.elementAt(i), " ");
            vector.addElement(new float[] { AkkAmaj(stringTokenizer.nextToken()), AkkAmaj(stringTokenizer.nextToken()), AkkAmaj(stringTokenizer.nextToken()), AkkAmaj(stringTokenizer.nextToken()), AkkAmaj(stringTokenizer.nextToken()) });
        }
        return vector;
    }
    
    void aKKAMaj(final Hashtable hashtable, final Object o) {
        if (hashtable == null) {
            return;
        }
        if (hashtable.get("*CONTROL_POS_TCB") != null) {
            throw new IllegalArgumentException("TCB data is not supported.");
        }
        final Vector vector = (Vector)hashtable.get("*CONTROL_POS_TRACK");
        final Vector vector2 = (Vector)hashtable.get("*CONTROL_ROT_TRACK");
        if (vector != null) {
            this.AJAKkam.put(o, this.AKkAmaj(aKKAmaj((Object)vector)));
        }
        if (vector2 != null) {
            this.aJAKkam.put(o, this.aKkAMaj(aKKAmaj((Object)vector2)));
        }
    }
    
    mmjjmkk aKKamaj(final Hashtable hashtable) {
        final mmjjmkk mmjjmkk = new mmjjmkk();
        final Vector vector = (Vector)hashtable.get("*TM_ANIMATION");
        if (vector == null) {
            return mmjjmkk;
        }
        this.aKKAMaj(vector.elementAt(0), (Object)mmjjmkk);
        this.aKKAMaj(vector.elementAt(1), (Object)this.ajaKkam);
        return mmjjmkk;
    }
    
    void akkAmaj(final Hashtable hashtable, final mmaakkk mmaakkk) {
        if (hashtable == null) {
            return;
        }
        final Vector vector = (Vector)hashtable.get("*MESH_VERTEX");
        for (int i = 0; i < vector.size(); ++i) {
            final StringTokenizer akkAMaj = this.akkAMaj(vector, i);
            mmaakkk.MAJakka[AKkAMaj(akkAMaj.nextToken())] = new majjmka(akKAMaj(akkAMaj.nextToken()), akKAMaj(akkAMaj.nextToken()), akKAMaj(akkAMaj.nextToken()));
        }
    }
    
    void AkKamaj(final Hashtable hashtable, final mmaakkk mmaakkk) {
        if (hashtable == null) {
            return;
        }
        final Vector vector = (Vector)hashtable.get("*MESH_TVERT");
        for (int i = 0; i < vector.size(); ++i) {
            final StringTokenizer akkAMaj = this.akkAMaj(vector, i);
            mmaakkk.mAJakka[AKkAMaj(akkAMaj.nextToken())] = new kajjmmk(akKAMaj(akkAMaj.nextToken()), 1.0 - akKAMaj(akkAMaj.nextToken()));
        }
    }
    
    void akKAmaj(final Hashtable hashtable, final mmaakkk mmaakkk) {
        if (hashtable == null) {
            return;
        }
        final Vector vector = (Vector)hashtable.get("*MESH_FACE");
        for (int i = 0; i < vector.size(); ++i) {
            final StringTokenizer stringTokenizer = new StringTokenizer(((String)vector.elementAt(i)).replace(':', ' '), " ");
            final int aKkAMaj = AKkAMaj(stringTokenizer.nextToken());
            stringTokenizer.nextToken();
            final int aKkAMaj2 = AKkAMaj(stringTokenizer.nextToken());
            stringTokenizer.nextToken();
            final int aKkAMaj3 = AKkAMaj(stringTokenizer.nextToken());
            stringTokenizer.nextToken();
            final int aKkAMaj4 = AKkAMaj(stringTokenizer.nextToken());
            stringTokenizer.nextToken();
            if (mmaakkk.mAJakka != null) {
                mmaakkk.maJakka[aKkAMaj] = new kajjkka(mmaakkk, aKkAMaj2, aKkAMaj3, aKkAMaj4, aKkAMaj2, aKkAMaj3, aKkAMaj4);
            }
            else {
                mmaakkk.maJakka[aKkAMaj] = new kajjkka(mmaakkk, aKkAMaj2, aKkAMaj3, aKkAMaj4);
            }
        }
    }
    
    void AkKAmaj(final Hashtable hashtable, final mmaakkk mmaakkk) {
        if (hashtable == null) {
            return;
        }
        final Vector vector = (Vector)hashtable.get("*MESH_TFACE");
        for (int i = 0; i < vector.size(); ++i) {
            final StringTokenizer akkAMaj = this.akkAMaj(vector, i);
            final int aKkAMaj = AKkAMaj(akkAMaj.nextToken());
            final int aKkAMaj2 = AKkAMaj(akkAMaj.nextToken());
            final int aKkAMaj3 = AKkAMaj(akkAMaj.nextToken());
            final int aKkAMaj4 = AKkAMaj(akkAMaj.nextToken());
            final kajjkka kajjkka = mmaakkk.maJakka[aKkAMaj];
            kajjkka.AmaJAkk = mmaakkk.mAJakka[aKkAMaj2];
            kajjkka.amaJAkk = mmaakkk.mAJakka[aKkAMaj3];
            kajjkka.AMaJAkk = mmaakkk.mAJakka[aKkAMaj4];
        }
    }
    
    mmaakkk akkamaj(final Hashtable hashtable) {
        final mmaakkk mmaakkk = new mmaakkk();
        mmaakkk.MAJakka = new majjmka[AKkAMaj(this.akkAMaj(hashtable.get("*MESH_NUMVERTEX"), 0).nextToken())];
        final Vector value = hashtable.get("*MESH_NUMTVERTEX");
        if (value != null) {
            int n = AKkAMaj(this.akkAMaj(value, 0).nextToken());
            if (n == 0) {
                n = mmaakkk.MAJakka.length;
            }
            mmaakkk.mAJakka = new kajjmmk[n];
        }
        mmaakkk.maJakka = new kajjkka[AKkAMaj(this.akkAMaj(hashtable.get("*MESH_NUMFACES"), 0).nextToken())];
        this.akkAmaj(aKKAmaj(hashtable.get((Object)"*MESH_VERTEX_LIST")), mmaakkk);
        this.AkKamaj(aKKAmaj(hashtable.get((Object)"*MESH_TVERTLIST")), mmaakkk);
        this.akKAmaj(aKKAmaj(hashtable.get((Object)"*MESH_FACE_LIST")), mmaakkk);
        this.AkKAmaj(aKKAmaj(hashtable.get((Object)"*MESH_TFACELIST")), mmaakkk);
        return mmaakkk;
    }
    
    mmaakkk AKkamaj(final Hashtable hashtable) {
        final String str = (String)((Vector<String>)hashtable.get("*NODE_NAME")).elementAt(0);
        if (str.charAt(0) == '_') {
            return null;
        }
        if (this.AJaKkam != null) {
            for (int i = 0; i < this.AJaKkam.length; ++i) {
                if (str.equalsIgnoreCase(this.AJaKkam[i])) {
                    return null;
                }
            }
        }
        final mmaakkk akkamaj = this.akkamaj(aKKAmaj(hashtable.get((Object)"*MESH")));
        this.aKKAMaj(aKKAmaj(hashtable.get((Object)"*TM_ANIMATION")), akkamaj);
        if (akkamaj != null) {
            final Hashtable akkAmaj = aKKAmaj(hashtable.get((Object)"*NODE_TM"));
            final StringTokenizer akkAMaj = this.akkAMaj(akkAmaj.get("*TM_POS"), 0);
            final kaajmma kaajmma = new kaajmma(AkkAmaj(akkAMaj.nextToken()), AkkAmaj(akkAMaj.nextToken()), AkkAmaj(akkAMaj.nextToken()));
            akkamaj.jaKkama(kaajmma);
            akkamaj.Majakka.MAJAkKA(kaajmma);
            final kaaakka mAjakka = akkamaj.mAjakka;
            final StringTokenizer akkAMaj2 = this.akkAMaj(akkAmaj.get("*TM_ROW0"), 0);
            mAjakka.KAMajAK(AkkAmaj(akkAMaj2.nextToken()), AkkAmaj(akkAMaj2.nextToken()), AkkAmaj(akkAMaj2.nextToken()));
            final StringTokenizer akkAMaj3 = this.akkAMaj(akkAmaj.get("*TM_ROW1"), 0);
            mAjakka.kaMajAK(AkkAmaj(akkAMaj3.nextToken()), AkkAmaj(akkAMaj3.nextToken()), AkkAmaj(akkAMaj3.nextToken()));
            final StringTokenizer akkAMaj4 = this.akkAMaj(akkAmaj.get("*TM_ROW2"), 0);
            mAjakka.KaMajAK(AkkAmaj(akkAMaj4.nextToken()), AkkAmaj(akkAMaj4.nextToken()), AkkAmaj(akkAMaj4.nextToken()));
            akkamaj.jAkKaMA(str);
        }
        System.out.println("mesh:" + str + "  verts:" + akkamaj.MAJakka.length + "  faces:" + akkamaj.maJakka.length);
        return akkamaj;
    }
    
    void Akkamaj(final Hashtable hashtable, final String[] aJaKkam) {
        this.AJaKkam = aJaKkam;
        this.AjaKkam = new mmjjmkk();
        this.ajaKkam = new kaajmma();
        this.AJAKkam = new Hashtable();
        this.aJAKkam = new Hashtable();
        this.aJakkam = null;
        this.AjAKkam = null;
        this.AjaKkam = this.aKKamaj(aKKAmaj((Object)hashtable.get("*CAMERAOBJECT")));
        final Vector vector = (Vector)hashtable.get("*GEOMOBJECT");
        for (int i = 0; i < vector.size(); ++i) {
            final mmaakkk aKkamaj = this.AKkamaj((Hashtable)vector.elementAt(i));
            if (aKkamaj != null) {
                this.mAJAKkA(aKkamaj);
            }
        }
        this.aJakkam = null;
        this.AjAKkam = null;
        Vector vector2 = null;
        final Enumeration elements = this.AJAKkam.elements();
        while (elements.hasMoreElements()) {
            final Vector vector3 = (Vector)elements.nextElement();
            if (vector2 == null) {
                vector2 = vector3;
            }
            if (vector3.size() > vector2.size()) {
                vector2 = vector3;
            }
        }
        final Enumeration elements2 = this.aJAKkam.elements();
        while (elements2.hasMoreElements()) {
            final Vector vector4 = (Vector)elements2.nextElement();
            if (vector2 == null) {
                vector2 = vector4;
            }
            if (vector4.size() > vector2.size()) {
                vector2 = vector4;
            }
        }
        final int size = vector2.size();
        final int n = 2 + super.mAjAKkA.size();
        final majjmma[] array = new majjmma[size];
        final majjmma[] array2 = new majjmma[size];
        for (int j = 0; j < size; ++j) {
            final float[] array3 = (float[])vector2.elementAt(j);
            array[j] = new majjmma(array3[0], 0.0f, 0.0f, 0.0f, new float[3 * n]);
            array2[j] = new majjmma(array3[0], 0.0f, 0.0f, 0.0f, new kajjkkk[n]);
            for (int k = 0; k < n; ++k) {
                array2[j].MaJaKKA[k] = new kajjkkk();
            }
        }
        this.ajAKkam = new Object[n];
        for (int l = 0; l < n; ++l) {
            final float[] array4 = new float[3];
            final kajjkkk kajjkkk = new kajjkkk();
            Object o = null;
            switch (l) {
                case 0: {
                    o = this.AjaKkam;
                    break;
                }
                case 1: {
                    o = this.ajaKkam;
                    break;
                }
                default: {
                    final mmaakkk mmaakkk = (mmaakkk)(o = super.mAjAKkA.elementAt(l - 2));
                    array4[0] = mmaakkk.Majakka.MajaKka;
                    array4[1] = mmaakkk.Majakka.majaKka;
                    array4[2] = mmaakkk.Majakka.MAjaKka;
                    kajjkkk.AKkamAj(mmaakkk.mAjakka.kamaJAK());
                    break;
                }
            }
            this.ajAKkam[l] = o;
            final Vector vector5 = (Vector)this.AJAKkam.get(o);
            final Vector vector6 = (Vector)this.aJAKkam.get(o);
            int size2 = 0;
            if (vector5 != null) {
                size2 = vector5.size();
            }
            int min;
            int index;
            for (min = Math.min(size2, size), index = 0; index < min; ++index) {
                final float[] array5 = (float[])vector5.elementAt(index);
                System.arraycopy(array5, 1, array[index].MAjAkkA, l * 3, 3);
                System.arraycopy(array5, 1, array4, 0, 3);
            }
            while (index < size) {
                System.arraycopy(array4, 0, array[index].MAjAkkA, l * 3, 3);
                ++index;
            }
            int size3 = 0;
            if (vector6 != null) {
                size3 = vector6.size();
            }
            final int min2 = Math.min(size3, size);
            float n2 = 0.0f;
            kajjkkk kajjkkk2 = kajjkkk;
            final kajjkkk kajjkkk3 = new kajjkkk();
            int index2;
            for (index2 = 0; index2 < min2; ++index2) {
                final float[] array6 = (float[])vector6.elementAt(index2);
                if (index2 > 1 && Math.abs(array6[4] - n2) > 3.2f) {
                    final float[] array7 = array6;
                    final int n3 = 1;
                    array7[n3] *= -1.0f;
                    final float[] array8 = array6;
                    final int n4 = 2;
                    array8[n4] *= -1.0f;
                    final float[] array9 = array6;
                    final int n5 = 3;
                    array9[n5] *= -1.0f;
                    array6[4] = 6.2831855f - array6[4];
                }
                n2 = array6[4];
                kajjkkk3.AKkaMAj(new kaajmma(array6[1], array6[2], array6[3]), array6[4]);
                if (kajjkkk2 != null) {
                    kajjkkk3.AkkaMAj(kajjkkk2);
                }
                kajjkkk2 = new kajjkkk(kajjkkk3);
                final kaajmma kaajmma = new kaajmma();
                array2[index2].MaJaKKA[l] = new kajjkkk(kaajmma.MajaKka, kaajmma.majaKka, kaajmma.MAjaKka, kajjkkk3.akKAmAj(kaajmma));
                final kajjkkk kajjkkk4 = array2[index2].MaJaKKA[l];
            }
            while (index2 < size) {
                final kaajmma kaajmma2 = new kaajmma();
                array2[index2].MaJaKKA[l] = new kajjkkk(kaajmma2.MajaKka, kaajmma2.majaKka, kaajmma2.MAjaKka, kajjkkk3.akKAmAj(kaajmma2));
                ++index2;
            }
        }
        this.aJakkam = new kajammk(array, 2, 0);
        this.AjAKkam = new kajammk(array2, 2, 2);
        this.AJAKkam = null;
        this.aJAKkam = null;
    }
    
    public static float AkkAmaj(String substring) {
        if (substring.charAt(substring.length() - 1) == ',') {
            substring = substring.substring(0, substring.length() - 1);
        }
        return Float.valueOf(substring);
    }
    
    public static double akKAMaj(String substring) {
        if (substring.charAt(substring.length() - 1) == ',') {
            substring = substring.substring(0, substring.length() - 1);
        }
        return Double.valueOf(substring);
    }
    
    public static int AKkAMaj(String substring) {
        if (substring.charAt(substring.length() - 1) == ',') {
            substring = substring.substring(0, substring.length() - 1);
        }
        return Integer.parseInt(substring);
    }
    
    static Hashtable aKKAmaj(final Object o) {
        if (o instanceof Vector) {
            return ((Vector)o).elementAt(0);
        }
        return (Hashtable)o;
    }
    
    public static kmjjkkk akKamaj(final URL url) {
        return AkkAMaj(url, null);
    }
    
    public static kmjjkkk AKKAMaj(final InputStream inputStream) {
        return aKkamaj(inputStream, null);
    }
    
    public static kmjjkkk AkkAMaj(final URL url, final String[] array) {
        try {
            return aKkamaj(url.openStream(), array);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static kmjjkkk aKkamaj(final InputStream in, final String[] array) {
        final Hashtable hashtable = new Hashtable();
        try {
            final BufferedInputStream in2 = new BufferedInputStream(in, 32768);
            AKKamaj(hashtable, new DataInputStream((InputStream)in2));
            in2.close();
            final kmjjkkk kmjjkkk = new kmjjkkk();
            kmjjkkk.Akkamaj(hashtable, array);
            return kmjjkkk;
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public void AKKAmaj(final URL url, final String[] array) {
        final Hashtable hashtable = new Hashtable();
        try {
            final BufferedInputStream in = new BufferedInputStream(url.openStream(), 8192);
            if (url.getFile().toLowerCase().endsWith("z")) {
                AKKamaj(hashtable, new DataInputStream((InputStream)new BufferedInputStream(new GZIPInputStream(in), 8192)));
            }
            else {
                AKKamaj(hashtable, new DataInputStream((InputStream)in));
            }
            AKKamaj(hashtable, new DataInputStream((InputStream)in));
            in.close();
            this.Akkamaj(hashtable, array);
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
}
