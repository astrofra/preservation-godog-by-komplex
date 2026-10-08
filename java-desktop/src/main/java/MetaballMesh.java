import java.awt.Color;
import java.awt.Graphics;

// 
// Decompiled by Procyon v0.6.0
// 

public class MetaballMesh extends MeshObject implements MarchingCubesTables
{
    static final float AKkAmAj = 1024.0f;
    static final int aKkAmAj = 10240;
    static final int JaKkAmA = 5;
    static final int jaKkAmA = 24;
    Vertex[] JAKkAmA;
    IsoSurfaceIntersection[] jAKkAmA;
    float[] JakkAmA;
    boolean[] jakkAmA;
    int JAkkAmA;
    int jAkkAmA;
    int JaKKAmA;
    int jaKKAmA;
    static final float JAKKAmA = 1.1920929E-7f;
    static final float jAKKAmA = 0.0018269231f;
    ScalarFieldVertex JakKAmA;
    ScalarFieldVertex jakKAmA;
    ScalarFieldVertex JAkKAmA;
    ScalarFieldVertex jAkKAmA;
    ScalarFieldVertex JaKkamA;
    ScalarFieldVertex jaKkamA;
    ScalarFieldVertex JAKkamA;
    ScalarFieldVertex jAKkamA;
    final int JakkamA = 1;
    final int jakkamA = 24;
    final int JAkkamA = 576;
    
    public MetaballMesh() {
        this.JakKAmA = new ScalarFieldVertex();
        this.jakKAmA = new ScalarFieldVertex();
        this.JAkKAmA = new ScalarFieldVertex();
        this.jAkKAmA = new ScalarFieldVertex();
        this.JaKkamA = new ScalarFieldVertex();
        this.jaKkamA = new ScalarFieldVertex();
        this.JAKkamA = new ScalarFieldVertex();
        this.jAKkamA = new ScalarFieldVertex();
        super.MaJAkka = Float.POSITIVE_INFINITY;
        this.JAKkAmA = new Vertex[5];
        this.jAKkAmA = new IsoSurfaceIntersection[12];
        for (int i = 0; i < this.JAKkAmA.length; ++i) {
            this.JAKkAmA[i] = new Vertex();
        }
        for (int j = 0; j < this.jAKkAmA.length; ++j) {
            this.jAKkAmA[j] = new IsoSurfaceIntersection();
        }
        this.JakkAmA = new float[13824];
        this.jakkAmA = new boolean[576];
        super.MAJakka = new Vertex[10240];
        super.mAJakka = new UvCoord[10240];
        for (int k = 0; k < super.MAJakka.length; ++k) {
            super.MAJakka[k] = new Vertex();
        }
        for (int l = 0; l < super.mAJakka.length; ++l) {
            super.mAJakka[l] = new UvCoord();
        }
        super.maJakka = new Triangle[super.MAJakka.length / 3];
        for (int n = 0, n2 = 0; n < super.maJakka.length; ++n, n2 += 3) {
            super.maJakka[n] = new Triangle(this, n2 + 2, n2 + 1, n2, n2 + 2, n2 + 1, n2);
        }
        super.MaJAkka = 1.0f;
    }
    
    public void JaKkama(final Camera majAkka, final int n) {
        if (!super.MaJakka) {
            return;
        }
        this.kKAMaJa(super.mAJAKKa);
        super.MajAkka = majAkka;
        super.MAjAkka = RenderPrimitive.AmAjaKK;
        this.jakkAma();
        this.JAKkaMA();
        if (this.JAkkAmA == 0) {
            return;
        }
        this.kkaMaJa(super.maJakka, this.jAkkAmA);
    }
    
    public void kkaMaJa(final Triangle[] array, final int n) {
        final Triangle[] aMaJAKK = RenderPrimitive.aMaJAKK;
        int amAjaKK = RenderPrimitive.AmAjaKK;
        for (int vertexIndex = 0; vertexIndex < n; vertexIndex++) {
            final Triangle kajjkka = array[vertexIndex];
            final Vertex amAJAkk = kajjkka.amAJAkk;
            final Vertex amajAkk = kajjkka.AMAJAkk;
            final Vertex amajAkk2 = kajjkka.aMAJAkk;
            final float kaMAjAK = amAJAkk.kaMAjAK;
            final float kamAjAK = amAJAkk.KAMAjAK;
            if ((amajAkk.kaMAjAK - kaMAjAK) * (amajAkk2.KAMAjAK - kamAjAK) - (amajAkk2.kaMAjAK - kaMAjAK) * (amajAkk.KAMAjAK - kamAjAK) < 0.0f) {
                kajjkka.sortKey = -(amAJAkk.KaMAjAK + amajAkk.KaMAjAK + amajAkk2.KaMAjAK);
                final double n2 = (double)(amAJAkk.KaMAjAK * 0.0018269231f);
                final double n3 = (double)(amajAkk.KaMAjAK * 0.0018269231f);
                final double n4 = (double)(amajAkk2.KaMAjAK * 0.0018269231f);
                kajjkka.AmaJAkk.u = (float)(amAJAkk.kaMAjAK * Math.cos(n2) * 1.1920928955078125E-7);
                kajjkka.AmaJAkk.v = (float)(amAJAkk.KAMAjAK * Math.sin(n2) * 1.1920928955078125E-7);
                kajjkka.amaJAkk.u = (float)(amajAkk.kaMAjAK * Math.cos(n3) * 1.1920928955078125E-7);
                kajjkka.amaJAkk.v = (float)(amajAkk.KAMAjAK * Math.sin(n3) * 1.1920928955078125E-7);
                kajjkka.AMaJAkk.u = (float)(amajAkk2.kaMAjAK * Math.cos(n4) * 1.1920928955078125E-7);
                kajjkka.AMaJAkk.v = (float)(amajAkk2.KAMAjAK * Math.sin(n4) * 1.1920928955078125E-7);
                aMaJAKK[amAjaKK++] = kajjkka;
            }
        }
        RenderPrimitive.AmAjaKK = amAjaKK;
    }
    
    public void JAKkaMA() {
        try {
            this.KkaMaJa();
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            this.JAkkAmA = 10239;
        }
        this.jAkkAmA = this.JAkkAmA / 3;
    }
    
    public void kKAMaJa(final float n) {
        Math.sin(n * 2.3 + 1.0);
        final float n2 = 6.24f;
        for (int i = 0; i < 5; ++i) {
            this.JAKkAmA[i].x = (float)(Math.sin(n * (0.2 + i * 0.007) + (double)i) * n2) - 12.0f;
            this.JAKkAmA[i].y = (float)(Math.cos(n * (0.3 + i * 0.02) + (double)(i * 3)) * n2) - 12.0f;
            this.JAKkAmA[i].z = (float)(Math.sin(n * (0.2 + i * 0.03) + (double)(i * 2)) * n2) - 12.0f;
        }
        int n3 = 0;
        final float[] array = new float[5];
        final float[] array2 = new float[5];
        final float[] array3 = new float[5];
        for (int j = 0; j < 5; ++j) {
            array[j] = this.JAKkAmA[j].x;
        }
        final float[] jakkAmA = this.JakkAmA;
        for (int k = 0; k < 24; ++k) {
            for (int l = 0; l < 5; ++l) {
                final float n4 = k + this.JAKkAmA[l].z;
                array3[l] = n4 * n4;
            }
            for (int n5 = 0; n5 < 24; ++n5) {
                boolean b = false;
                for (int n6 = 0; n6 < 5; ++n6) {
                    final float n7 = n5 + this.JAKkAmA[n6].y;
                    array2[n6] = n7 * n7 + array3[n6];
                }
                for (int n8 = 0; n8 < 24; ++n8, ++n3) {
                    float n9 = 710.0f;
                    for (int n10 = 0; n10 < 5; ++n10) {
                        final float n11 = n8 + array[n10];
                        n9 += 3200.0f / (n11 * n11 + array2[n10]);
                    }
                    jakkAmA[n3] = n9;
                    if (n9 >= 1024.0f) {
                        b = true;
                    }
                }
                this.jakkAmA[k * 24 + n5] = b;
            }
        }
    }
    
    void KkAMaJa(final Vertex majjmka, final ScalarFieldVertex kaaakkk, final ScalarFieldVertex kaaakkk2) {
        final float n = kaaakkk2.amAJAkK - kaaakkk.amAJAkK;
        if (n == 0.0f) {
            majjmka.x = kaaakkk.x;
            majjmka.y = kaaakkk.y;
            majjmka.z = kaaakkk.z;
            return;
        }
        final float n2 = (1024.0f - kaaakkk.amAJAkK) / n;
        majjmka.x = kaaakkk.x + n2 * (kaaakkk2.x - kaaakkk.x);
        majjmka.y = kaaakkk.y + n2 * (kaaakkk2.y - kaaakkk.y);
        majjmka.z = kaaakkk.z + n2 * (kaaakkk2.z - kaaakkk.z);
    }
    
    int kkAMaJa() {
        int n = 0;
        if (this.JakKAmA.amAJAkK < 1024.0f) {
            n |= 0x1;
        }
        if (this.jakKAmA.amAJAkK < 1024.0f) {
            n |= 0x2;
        }
        if (this.JAkKAmA.amAJAkK < 1024.0f) {
            n |= 0x4;
        }
        if (this.jAkKAmA.amAJAkK < 1024.0f) {
            n |= 0x8;
        }
        if (this.JaKkamA.amAJAkK < 1024.0f) {
            n |= 0x10;
        }
        if (this.jaKkamA.amAJAkK < 1024.0f) {
            n |= 0x20;
        }
        if (this.JAKkamA.amAJAkK < 1024.0f) {
            n |= 0x40;
        }
        if (this.jAKkamA.amAJAkK < 1024.0f) {
            n |= 0x80;
        }
        ++this.jaKKAmA;
        final int[] kkAmAja = MarchingCubesTables.KkAmAja;
        if (kkAmAja[n] == 0) {
            return 0;
        }
        ++this.JaKKAmA;
        final int n2 = kkAmAja[n];
        final IsoSurfaceIntersection[] jaKkAmA = this.jAKkAmA;
        if ((n2 & 0x1) != 0x0) {
            jaKkAmA[0].kamaJak(this.JakKAmA, this.jakKAmA);
        }
        if ((n2 & 0x2) != 0x0) {
            jaKkAmA[1].kamaJak(this.jakKAmA, this.JAkKAmA);
        }
        if ((n2 & 0x4) != 0x0) {
            jaKkAmA[2].kamaJak(this.JAkKAmA, this.jAkKAmA);
        }
        if ((n2 & 0x8) != 0x0) {
            jaKkAmA[3].kamaJak(this.jAkKAmA, this.JakKAmA);
        }
        if ((n2 & 0x10) != 0x0) {
            jaKkAmA[4].kamaJak(this.JaKkamA, this.jaKkamA);
        }
        if ((n2 & 0x20) != 0x0) {
            jaKkAmA[5].kamaJak(this.jaKkamA, this.JAKkamA);
        }
        if ((n2 & 0x40) != 0x0) {
            jaKkAmA[6].kamaJak(this.JAKkamA, this.jAKkamA);
        }
        if ((n2 & 0x80) != 0x0) {
            jaKkAmA[7].kamaJak(this.jAKkamA, this.JaKkamA);
        }
        if ((n2 & 0x100) != 0x0) {
            jaKkAmA[8].kamaJak(this.JakKAmA, this.JaKkamA);
        }
        if ((n2 & 0x200) != 0x0) {
            jaKkAmA[9].kamaJak(this.jakKAmA, this.jaKkamA);
        }
        if ((n2 & 0x400) != 0x0) {
            jaKkAmA[10].kamaJak(this.JAkKAmA, this.JAKkamA);
        }
        if ((n2 & 0x800) != 0x0) {
            jaKkAmA[11].kamaJak(this.jAkKAmA, this.jAKkamA);
        }
        return n;
    }
    
    void KkaMaJa() {
        this.JAkkAmA = 0;
        this.jAkkAmA = 0;
        this.JaKKAmA = 0;
        this.jaKKAmA = 0;
        final Mat3f kAmajAK = super.mAjAkka.kAmajAK(0.041666668f);
        final Vec3f kaMAjAK = kAmajAK.kaMAjAK(new Vec3f(0.0f, 1.0f, 0.0f));
        final Vec3f kaMAjAK2 = kAmajAK.kaMAjAK(new Vec3f(1.0f, 1.0f, 0.0f));
        final Vec3f kaMAjAK3 = kAmajAK.kaMAjAK(new Vec3f(1.0f, 1.0f, 1.0f));
        final Vec3f kaMAjAK4 = kAmajAK.kaMAjAK(new Vec3f(0.0f, 1.0f, 1.0f));
        final Vec3f kaMAjAK5 = kAmajAK.kaMAjAK(new Vec3f(0.0f, 0.0f, 0.0f));
        final Vec3f kaMAjAK6 = kAmajAK.kaMAjAK(new Vec3f(1.0f, 0.0f, 0.0f));
        final Vec3f kaMAjAK7 = kAmajAK.kaMAjAK(new Vec3f(1.0f, 0.0f, 1.0f));
        final Vec3f kaMAjAK8 = kAmajAK.kaMAjAK(new Vec3f(0.0f, 0.0f, 1.0f));
        final Vec3f kaajmma = kaMAjAK6;
        final Vec3f kaajmma2 = kaMAjAK;
        final Vec3f kaajmma3 = kaMAjAK8;
        final float mAjaKKa = super.mAjaKKa;
        final float maJAKKa = super.MaJAKKa;
        final float maJAKKa2 = super.maJAKKa;
        final float maJaKKa = super.MaJaKKa;
        final float n = (float)super.maJaKKa;
        final float n2 = (float)super.MAJaKKa;
        final ScalarFieldVertex jakKAmA = this.JakKAmA;
        final ScalarFieldVertex jakKAmA2 = this.jakKAmA;
        final ScalarFieldVertex jAkKAmA = this.JAkKAmA;
        final ScalarFieldVertex jAkKAmA2 = this.jAkKAmA;
        final ScalarFieldVertex jaKkamA = this.JaKkamA;
        final ScalarFieldVertex jaKkamA2 = this.jaKkamA;
        final ScalarFieldVertex jaKkamA3 = this.JAKkamA;
        final ScalarFieldVertex jaKkamA4 = this.jAKkamA;
        final Vec3f kaajmma4 = new Vec3f();
        final Vec3f kaajmma5 = new Vec3f();
        final Vec3f kaajmma6 = new Vec3f();
        final Vec3f kaMAjAK9 = kAmajAK.kaMAjAK(new Vec3f(-12.0f, -12.0f, -12.0f));
        kaMAjAK9.MajaKKA(mAjaKKa, maJAKKa, maJAKKa2);
        final float[] jakkAmA = this.JakkAmA;
        final Vertex[] maJakka = super.MAJakka;
        final boolean[] jakkAmA2 = this.jakkAmA;
        int i = 0;
        while (i < 23) {
            kaajmma5.MAJAkKA(kaMAjAK9);
            int j = 0;
            while (j < 23) {
                kaajmma4.MAJAkKA(kaajmma5);
                final int n3 = i * 24 + j;
                int n4 = j * 24 + i * 576;
                if (jakkAmA2[n3] | jakkAmA2[n3 + 1] | jakkAmA2[n3 + 24] | jakkAmA2[n3 + 1 + 24]) {
                    int k = 0;
                    while (k < 23) {
                        jakKAmA.jAKKAMa(kaajmma4.x + kaMAjAK.x, kaajmma4.y + kaMAjAK.y, kaajmma4.z + kaMAjAK.z, jakkAmA[n4 + 24]);
                        jakKAmA2.jAKKAMa(kaajmma4.x + kaMAjAK2.x, kaajmma4.y + kaMAjAK2.y, kaajmma4.z + kaMAjAK2.z, jakkAmA[n4 + 1 + 24]);
                        jAkKAmA.jAKKAMa(kaajmma4.x + kaMAjAK3.x, kaajmma4.y + kaMAjAK3.y, kaajmma4.z + kaMAjAK3.z, jakkAmA[n4 + 1 + 24 + 576]);
                        jAkKAmA2.jAKKAMa(kaajmma4.x + kaMAjAK4.x, kaajmma4.y + kaMAjAK4.y, kaajmma4.z + kaMAjAK4.z, jakkAmA[n4 + 576 + 24]);
                        jaKkamA.jAKKAMa(kaajmma4.x + kaMAjAK5.x, kaajmma4.y + kaMAjAK5.y, kaajmma4.z + kaMAjAK5.z, jakkAmA[n4]);
                        jaKkamA2.jAKKAMa(kaajmma4.x + kaMAjAK6.x, kaajmma4.y + kaMAjAK6.y, kaajmma4.z + kaMAjAK6.z, jakkAmA[n4 + 1]);
                        jaKkamA3.jAKKAMa(kaajmma4.x + kaMAjAK7.x, kaajmma4.y + kaMAjAK7.y, kaajmma4.z + kaMAjAK7.z, jakkAmA[n4 + 1 + 576]);
                        jaKkamA4.jAKKAMa(kaajmma4.x + kaMAjAK8.x, kaajmma4.y + kaMAjAK8.y, kaajmma4.z + kaMAjAK8.z, jakkAmA[n4 + 576]);
                        final int[] array = MarchingCubesTables.kkAmAja[this.kkAMaJa()];
                        if (array != null) {
                            for (int l = 0; l < array.length; ++l) {
                                final Vertex majjmka = maJakka[this.JAkkAmA];
                                final IsoSurfaceIntersection mmjjmka = this.jAKkAmA[array[l]];
                                final float n5 = maJaKKa / mmjjmka.z;
                                majjmka.kaMAjAK = mmjjmka.x * n5 + n;
                                majjmka.KAMAjAK = -(mmjjmka.y * n5) + n2;
                                majjmka.KaMAjAK = mmjjmka.z;
                                ++this.JAkkAmA;
                            }
                        }
                        ++k;
                        kaajmma4.MaJaKka(kaajmma);
                        ++n4;
                    }
                }
                ++j;
                kaajmma5.MaJaKka(kaajmma2);
            }
            ++i;
            kaMAjAK9.MaJaKka(kaajmma3);
        }
        this.jAkkAmA = this.JAkkAmA / 3;
    }
    
    void KKAMaJa(final Graphics graphics) {
        final int[] array = new int[3];
        final int[] array2 = new int[3];
        graphics.setColor(Color.white);
        int n = 0;
        for (int i = 0; i < this.JAkkAmA / 3; ++i) {
            float n2 = 0.0f;
            for (int j = 0; j < 3; ++j) {
                final float n3 = 110.0f / (super.MAJakka[n].z + 10.0f);
                final float n4 = super.MAJakka[n].x * n3 + 160.0f;
                final float n5 = super.MAJakka[n].y * n3 + 100.0f;
                ++n;
                n2 += n3;
                array[j] = (int)n4;
                array2[j] = (int)n5;
            }
            graphics.drawPolygon(array, array2, 3);
        }
    }
}
