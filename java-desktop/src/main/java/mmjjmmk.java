import java.awt.Color;
import java.awt.Graphics;

// 
// Decompiled by Procyon v0.6.0
// 

public class mmjjmmk extends mmaakkk implements mmaamka
{
    static final float AKkAmAj = 1024.0f;
    static final int aKkAmAj = 10240;
    static final int JaKkAmA = 5;
    static final int jaKkAmA = 24;
    majjmka[] JAKkAmA;
    mmjjmka[] jAKkAmA;
    float[] JakkAmA;
    boolean[] jakkAmA;
    int JAkkAmA;
    int jAkkAmA;
    int JaKKAmA;
    int jaKKAmA;
    static final float JAKKAmA = 1.1920929E-7f;
    static final float jAKKAmA = 0.0018269231f;
    kaaakkk JakKAmA;
    kaaakkk jakKAmA;
    kaaakkk JAkKAmA;
    kaaakkk jAkKAmA;
    kaaakkk JaKkamA;
    kaaakkk jaKkamA;
    kaaakkk JAKkamA;
    kaaakkk jAKkamA;
    final int JakkamA = 1;
    final int jakkamA = 24;
    final int JAkkamA = 576;
    
    public mmjjmmk() {
        this.JakKAmA = new kaaakkk();
        this.jakKAmA = new kaaakkk();
        this.JAkKAmA = new kaaakkk();
        this.jAkKAmA = new kaaakkk();
        this.JaKkamA = new kaaakkk();
        this.jaKkamA = new kaaakkk();
        this.JAKkamA = new kaaakkk();
        this.jAKkamA = new kaaakkk();
        super.MaJAkka = Float.POSITIVE_INFINITY;
        this.JAKkAmA = new majjmka[5];
        this.jAKkAmA = new mmjjmka[12];
        for (int i = 0; i < this.JAKkAmA.length; ++i) {
            this.JAKkAmA[i] = new majjmka();
        }
        for (int j = 0; j < this.jAKkAmA.length; ++j) {
            this.jAKkAmA[j] = new mmjjmka();
        }
        this.JakkAmA = new float[13824];
        this.jakkAmA = new boolean[576];
        super.MAJakka = new majjmka[10240];
        super.mAJakka = new kajjmmk[10240];
        for (int k = 0; k < super.MAJakka.length; ++k) {
            super.MAJakka[k] = new majjmka();
        }
        for (int l = 0; l < super.mAJakka.length; ++l) {
            super.mAJakka[l] = new kajjmmk();
        }
        super.maJakka = new kajjkka[super.MAJakka.length / 3];
        for (int n = 0, n2 = 0; n < super.maJakka.length; ++n, n2 += 3) {
            super.maJakka[n] = new kajjkka(this, n2 + 2, n2 + 1, n2, n2 + 2, n2 + 1, n2);
        }
        super.MaJAkka = 1.0f;
    }
    
    public void JaKkama(final mmjjmkk majAkka, final int n) {
        if (!super.MaJakka) {
            return;
        }
        this.kKAMaJa(super.mAJAKKa);
        super.MajAkka = majAkka;
        super.MAjAkka = kaaamma.AmAjaKK;
        this.jakkAma();
        this.JAKkaMA();
        if (this.JAkkAmA == 0) {
            return;
        }
        this.kkaMaJa(super.maJakka, this.jAkkAmA);
    }
    
    public void kkaMaJa(final kajjkka[] array, final int n) {
        final kajjkka[] aMaJAKK = kaaamma.aMaJAKK;
        int amAjaKK = kaaamma.AmAjaKK;
        for (int vertexIndex = 0; vertexIndex < n; vertexIndex++) {
            final kajjkka kajjkka = array[vertexIndex];
            final majjmka amAJAkk = kajjkka.amAJAkk;
            final majjmka amajAkk = kajjkka.AMAJAkk;
            final majjmka amajAkk2 = kajjkka.aMAJAkk;
            final float kaMAjAK = amAJAkk.kaMAjAK;
            final float kamAjAK = amAJAkk.KAMAjAK;
            if ((amajAkk.kaMAjAK - kaMAjAK) * (amajAkk2.KAMAjAK - kamAjAK) - (amajAkk2.kaMAjAK - kaMAjAK) * (amajAkk.KAMAjAK - kamAjAK) < 0.0f) {
                kajjkka.aMajakk = -(amAJAkk.KaMAjAK + amajAkk.KaMAjAK + amajAkk2.KaMAjAK);
                final double n2 = (double)(amAJAkk.KaMAjAK * 0.0018269231f);
                final double n3 = (double)(amajAkk.KaMAjAK * 0.0018269231f);
                final double n4 = (double)(amajAkk2.KaMAjAK * 0.0018269231f);
                kajjkka.AmaJAkk.jAKkaMA = (float)(amAJAkk.kaMAjAK * Math.cos(n2) * 1.1920928955078125E-7);
                kajjkka.AmaJAkk.JakkaMA = (float)(amAJAkk.KAMAjAK * Math.sin(n2) * 1.1920928955078125E-7);
                kajjkka.amaJAkk.jAKkaMA = (float)(amajAkk.kaMAjAK * Math.cos(n3) * 1.1920928955078125E-7);
                kajjkka.amaJAkk.JakkaMA = (float)(amajAkk.KAMAjAK * Math.sin(n3) * 1.1920928955078125E-7);
                kajjkka.AMaJAkk.jAKkaMA = (float)(amajAkk2.kaMAjAK * Math.cos(n4) * 1.1920928955078125E-7);
                kajjkka.AMaJAkk.JakkaMA = (float)(amajAkk2.KAMAjAK * Math.sin(n4) * 1.1920928955078125E-7);
                aMaJAKK[amAjaKK++] = kajjkka;
            }
        }
        kaaamma.AmAjaKK = amAjaKK;
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
            this.JAKkAmA[i].MajaKka = (float)(Math.sin(n * (0.2 + i * 0.007) + (double)i) * n2) - 12.0f;
            this.JAKkAmA[i].majaKka = (float)(Math.cos(n * (0.3 + i * 0.02) + (double)(i * 3)) * n2) - 12.0f;
            this.JAKkAmA[i].MAjaKka = (float)(Math.sin(n * (0.2 + i * 0.03) + (double)(i * 2)) * n2) - 12.0f;
        }
        int n3 = 0;
        final float[] array = new float[5];
        final float[] array2 = new float[5];
        final float[] array3 = new float[5];
        for (int j = 0; j < 5; ++j) {
            array[j] = this.JAKkAmA[j].MajaKka;
        }
        final float[] jakkAmA = this.JakkAmA;
        for (int k = 0; k < 24; ++k) {
            for (int l = 0; l < 5; ++l) {
                final float n4 = k + this.JAKkAmA[l].MAjaKka;
                array3[l] = n4 * n4;
            }
            for (int n5 = 0; n5 < 24; ++n5) {
                boolean b = false;
                for (int n6 = 0; n6 < 5; ++n6) {
                    final float n7 = n5 + this.JAKkAmA[n6].majaKka;
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
    
    void KkAMaJa(final majjmka majjmka, final kaaakkk kaaakkk, final kaaakkk kaaakkk2) {
        final float n = kaaakkk2.amAJAkK - kaaakkk.amAJAkK;
        if (n == 0.0f) {
            majjmka.MajaKka = kaaakkk.MajaKka;
            majjmka.majaKka = kaaakkk.majaKka;
            majjmka.MAjaKka = kaaakkk.MAjaKka;
            return;
        }
        final float n2 = (1024.0f - kaaakkk.amAJAkK) / n;
        majjmka.MajaKka = kaaakkk.MajaKka + n2 * (kaaakkk2.MajaKka - kaaakkk.MajaKka);
        majjmka.majaKka = kaaakkk.majaKka + n2 * (kaaakkk2.majaKka - kaaakkk.majaKka);
        majjmka.MAjaKka = kaaakkk.MAjaKka + n2 * (kaaakkk2.MAjaKka - kaaakkk.MAjaKka);
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
        final int[] kkAmAja = mmaamka.KkAmAja;
        if (kkAmAja[n] == 0) {
            return 0;
        }
        ++this.JaKKAmA;
        final int n2 = kkAmAja[n];
        final mmjjmka[] jaKkAmA = this.jAKkAmA;
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
        final kaaakka kAmajAK = super.mAjAkka.kAmajAK(0.041666668f);
        final kaajmma kaMAjAK = kAmajAK.kaMAjAK(new kaajmma(0.0f, 1.0f, 0.0f));
        final kaajmma kaMAjAK2 = kAmajAK.kaMAjAK(new kaajmma(1.0f, 1.0f, 0.0f));
        final kaajmma kaMAjAK3 = kAmajAK.kaMAjAK(new kaajmma(1.0f, 1.0f, 1.0f));
        final kaajmma kaMAjAK4 = kAmajAK.kaMAjAK(new kaajmma(0.0f, 1.0f, 1.0f));
        final kaajmma kaMAjAK5 = kAmajAK.kaMAjAK(new kaajmma(0.0f, 0.0f, 0.0f));
        final kaajmma kaMAjAK6 = kAmajAK.kaMAjAK(new kaajmma(1.0f, 0.0f, 0.0f));
        final kaajmma kaMAjAK7 = kAmajAK.kaMAjAK(new kaajmma(1.0f, 0.0f, 1.0f));
        final kaajmma kaMAjAK8 = kAmajAK.kaMAjAK(new kaajmma(0.0f, 0.0f, 1.0f));
        final kaajmma kaajmma = kaMAjAK6;
        final kaajmma kaajmma2 = kaMAjAK;
        final kaajmma kaajmma3 = kaMAjAK8;
        final float mAjaKKa = super.mAjaKKa;
        final float maJAKKa = super.MaJAKKa;
        final float maJAKKa2 = super.maJAKKa;
        final float maJaKKa = super.MaJaKKa;
        final float n = (float)super.maJaKKa;
        final float n2 = (float)super.MAJaKKa;
        final kaaakkk jakKAmA = this.JakKAmA;
        final kaaakkk jakKAmA2 = this.jakKAmA;
        final kaaakkk jAkKAmA = this.JAkKAmA;
        final kaaakkk jAkKAmA2 = this.jAkKAmA;
        final kaaakkk jaKkamA = this.JaKkamA;
        final kaaakkk jaKkamA2 = this.jaKkamA;
        final kaaakkk jaKkamA3 = this.JAKkamA;
        final kaaakkk jaKkamA4 = this.jAKkamA;
        final kaajmma kaajmma4 = new kaajmma();
        final kaajmma kaajmma5 = new kaajmma();
        final kaajmma kaajmma6 = new kaajmma();
        final kaajmma kaMAjAK9 = kAmajAK.kaMAjAK(new kaajmma(-12.0f, -12.0f, -12.0f));
        kaMAjAK9.MajaKKA(mAjaKKa, maJAKKa, maJAKKa2);
        final float[] jakkAmA = this.JakkAmA;
        final majjmka[] maJakka = super.MAJakka;
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
                        jakKAmA.jAKKAMa(kaajmma4.MajaKka + kaMAjAK.MajaKka, kaajmma4.majaKka + kaMAjAK.majaKka, kaajmma4.MAjaKka + kaMAjAK.MAjaKka, jakkAmA[n4 + 24]);
                        jakKAmA2.jAKKAMa(kaajmma4.MajaKka + kaMAjAK2.MajaKka, kaajmma4.majaKka + kaMAjAK2.majaKka, kaajmma4.MAjaKka + kaMAjAK2.MAjaKka, jakkAmA[n4 + 1 + 24]);
                        jAkKAmA.jAKKAMa(kaajmma4.MajaKka + kaMAjAK3.MajaKka, kaajmma4.majaKka + kaMAjAK3.majaKka, kaajmma4.MAjaKka + kaMAjAK3.MAjaKka, jakkAmA[n4 + 1 + 24 + 576]);
                        jAkKAmA2.jAKKAMa(kaajmma4.MajaKka + kaMAjAK4.MajaKka, kaajmma4.majaKka + kaMAjAK4.majaKka, kaajmma4.MAjaKka + kaMAjAK4.MAjaKka, jakkAmA[n4 + 576 + 24]);
                        jaKkamA.jAKKAMa(kaajmma4.MajaKka + kaMAjAK5.MajaKka, kaajmma4.majaKka + kaMAjAK5.majaKka, kaajmma4.MAjaKka + kaMAjAK5.MAjaKka, jakkAmA[n4]);
                        jaKkamA2.jAKKAMa(kaajmma4.MajaKka + kaMAjAK6.MajaKka, kaajmma4.majaKka + kaMAjAK6.majaKka, kaajmma4.MAjaKka + kaMAjAK6.MAjaKka, jakkAmA[n4 + 1]);
                        jaKkamA3.jAKKAMa(kaajmma4.MajaKka + kaMAjAK7.MajaKka, kaajmma4.majaKka + kaMAjAK7.majaKka, kaajmma4.MAjaKka + kaMAjAK7.MAjaKka, jakkAmA[n4 + 1 + 576]);
                        jaKkamA4.jAKKAMa(kaajmma4.MajaKka + kaMAjAK8.MajaKka, kaajmma4.majaKka + kaMAjAK8.majaKka, kaajmma4.MAjaKka + kaMAjAK8.MAjaKka, jakkAmA[n4 + 576]);
                        final int[] array = mmaamka.kkAmAja[this.kkAMaJa()];
                        if (array != null) {
                            for (int l = 0; l < array.length; ++l) {
                                final majjmka majjmka = maJakka[this.JAkkAmA];
                                final mmjjmka mmjjmka = this.jAKkAmA[array[l]];
                                final float n5 = maJaKKa / mmjjmka.MAjaKka;
                                majjmka.kaMAjAK = mmjjmka.MajaKka * n5 + n;
                                majjmka.KAMAjAK = -(mmjjmka.majaKka * n5) + n2;
                                majjmka.KaMAjAK = mmjjmka.MAjaKka;
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
                final float n3 = 110.0f / (super.MAJakka[n].MAjaKka + 10.0f);
                final float n4 = super.MAJakka[n].MajaKka * n3 + 160.0f;
                final float n5 = super.MAJakka[n].majaKka * n3 + 100.0f;
                ++n;
                n2 += n3;
                array[j] = (int)n4;
                array2[j] = (int)n5;
            }
            graphics.drawPolygon(array, array2, 3);
        }
    }
}
