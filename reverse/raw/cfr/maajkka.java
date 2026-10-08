/*
 * Decompiled with CFR 0.152.
 */
public class maajkka
extends kmjjmma {
    mmjjmkk AmAJakk;
    kmjjkkk amAJakk;
    kmaamma AMAJakk;

    public String MaJAkkA() {
        return "evil";
    }

    public void MAjakkA() {
        this.amAJakk = null;
    }

    public void mAjakkA(kmaamma kmaamma2) {
        mmaakkk mmaakkk2;
        this.AMAJakk = kmaamma2;
        this.AmAJakk = new mmjjmkk();
        this.AmAJakk.amaJAkK = 1.4f;
        this.AmAJakk.AMAJAkK = 512;
        this.AmAJakk.aMAJAkK = 256;
        this.AmAJakk.aMAjakK = 8000.0f;
        maaakka maaakka2 = (maaakka)kmaakma.MAjaKkA(this.AMAJakk.aMajAKK("images/paameri.gif"));
        maaakka maaakka3 = (maaakka)kmaakma.MAjaKkA(this.AMAJakk.aMajAKK("images/envmeri.gif"));
        mmajkka mmajkka2 = maajkka.AmAjAKk(maaakka3, 0, 0, 0, 1.0);
        mmajkka mmajkka3 = maajkka.AmAjAKk(maaakka2, 0, 0, 0, 1.0);
        mmajkka mmajkka4 = maajkka.AmAjAKk(maaakka3, 0, 0, 0, 0.4);
        maajkka.AmAjAKk(maaakka2, 0, 0, 0, 0.4);
        this.amAJakk = new kmjjkkk();
        this.amAJakk.AKKAmaj(this.AMAJakk.aMajAKK("data/meri2.asz"), null);
        int n = 0;
        while (n < this.amAJakk.mAjAKkA.size()) {
            mmaakkk2 = (mmaakkk)this.amAJakk.mAjAKkA.elementAt(n);
            mmaakkk2.MaJakka = true;
            mmaakkk2.MAJAkka = true;
            if (n == 0) {
                mmaakkk2.jAKKAma(mmajkka3, maaakka2);
                mmaakkk2.JAKkAma(19);
            } else {
                mmaakkk2.majAKKa = new kaaakka().kaMAJAK(-1.5707964f);
                mmaakkk2.maJAkka = true;
                mmaakkk2.jAKKAma(mmajkka2, maaakka3);
                mmaakkk2.JAKkAma(3);
            }
            mmaakkk2.JakKAma();
            mmaakkk2.majakka.mAjaKka(1.0);
            if (n != 0) {
                mmaakkk2.JaKKaMA(true);
                mmaakkk2.majAkka.JAKkAma(51);
                mmaakkk2.majAkka.jAKKAma(mmajkka4, maaakka3);
            }
            ++n;
        }
        mmaakkk2 = new kaaakma(this.AMAJakk, this.AMAJakk.aMajAKK("images/taivmeri.jpg"), true);
        mmaakkk2.Majakka.mAJaKka(0.0f, 0.0f, 0.0f);
        this.amAJakk.mAJAKkA(mmaakkk2);
        kmjammk kmjammk2 = maajkka.aMaJakk(this.AmAJakk, this.AMAJakk);
        this.amAJakk.mAJAKkA(kmjammk2);
        this.AmAJakk.AmajakK = 100.0f;
        this.amAJakk.MAjAKkA();
    }

    public void MajakkA(mmajkka mmajkka2, float f, float f2) {
        mmajkka2.aMaJAkk();
        this.AmAJakk.amAjakK = (float)(-0.4 - Math.sin(-0.006 * (double)Math.max((f *= 2.1f) - 0.0f, 0.0f)));
        this.amAJakk.MAJAKkA(f, this.AmAJakk);
        this.amAJakk.mAjAKkA(this.AmAJakk, godog.KKAMAjA);
        this.amAJakk.MajAKkA(godog.KKAMAjA);
        mmajkka2.aMajAkk();
    }

    public void majakkA(String string, float f) {
    }

    public static mmajkka AmAjAKk(maaakka maaakka2, int n, int n2, int n3, double d) {
        mmajkka mmajkka2 = new mmajkka(256, 256, 1, false);
        int n4 = 0;
        while (n4 < 256) {
            int n5 = 0;
            while (n5 < 256) {
                double d2 = (1.0 - (double)n4 / 255.0) * d;
                int n6 = (int)Math.min(255.0, (double)(maaakka2.kaMajaK[n5] & 0xFF) * d2 + (1.0 - d2) * (double)n);
                int n7 = (int)Math.min(255.0, (double)(maaakka2.KAMajaK[n5] & 0xFF) * d2 + (1.0 - d2) * (double)n2);
                int n8 = (int)Math.min(255.0, (double)(maaakka2.kAMajaK[n5] & 0xFF) * d2 + (1.0 - d2) * (double)n3);
                mmajkka2.AMAjakk[n4 * 256 + n5] = n6 << 20 | n7 << 10 | n8;
                ++n5;
            }
            ++n4;
        }
        return mmajkka2;
    }

    public static kmjammk aMaJakk(mmjjmkk mmjjmkk2, kmaamma kmaamma2) {
        mmajkka mmajkka2;
        maaakka maaakka2;
        mmjjmkk2.AMaJAkK.mAJaKka(0.0f, -14.0f, 0.0f);
        kmjammk kmjammk2 = new kmjammk(null, 500.0f, 0.0f, mmjjmkk2, true);
        kmjammk2.JAKKaMa = maaakka2 = (maaakka)kmaakma.MAjaKkA(kmaamma2.aMajAKK("images/vesi_meri.gif"));
        kmjammk2.jAKKaMa = maaakka2;
        kmjammk2.AjakKaM = 0.23f;
        kmjammk2.ajakKaM = 0.23f;
        kmjammk2.jaKKaMa = mmajkka2 = maajkka.AmAjAKk(maaakka2, 0, 0, 0, 1.0);
        return kmjammk2;
    }

    public maajkka() {
        super();
    }
}

