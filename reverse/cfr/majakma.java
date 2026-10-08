/*
 * Decompiled with CFR 0.152.
 */
public class majakma
extends kmjjmma {
    mmjjmkk MaJaKkA;
    kmjjkkk maJaKkA;
    kmajmma MAJaKkA;
    mmajkka mAJaKkA;
    mmajkka MajaKkA;
    mmajkka majaKkA;
    kmaamma MAjaKkA;

    public String MaJAkkA() {
        return "trav";
    }

    public void MAjakkA() {
        this.maJaKkA = null;
        this.majaKkA.AMAjakk = null;
        this.majaKkA = null;
        this.MajaKkA = null;
        this.MAJaKkA = null;
        this.mAJaKkA = null;
    }

    public void mAjakkA(kmaamma kmaamma2) {
        Object object;
        this.MAjaKkA = kmaamma2;
        this.MaJaKkA = new mmjjmkk();
        this.MaJaKkA.amaJAkK = 1.4f;
        this.MaJaKkA.AMAJAkK = 512;
        this.MaJaKkA.aMAJAkK = 256;
        this.MaJaKkA.AmajakK = 7.0f;
        this.MaJaKkA.aMAjakK = 18.0f;
        this.MajaKkA = (mmajkka)kmaakma.MAjaKkA(this.MAjaKkA.aMajAKK("images/lasitausta.jpg"));
        maaakka maaakka2 = (maaakka)kmaakma.MAjaKkA(this.MAjaKkA.aMajAKK("images/envplane.gif"));
        mmajkka mmajkka2 = majakma.MaJaKkA(maaakka2, 0.0f, 0.0f, 0.0f);
        this.maJaKkA = new kmjjkkk();
        this.maJaKkA.AKKAmaj(this.MAjaKkA.aMajAKK("data/hakkyra4.asz"), null);
        int n = 0;
        while (n < this.maJaKkA.mAjAKkA.size()) {
            object = (mmaakkk)this.maJaKkA.mAjAKkA.elementAt(n);
            ((mmaakkk)object).MaJakka = true;
            ((mmaakkk)object).maJAkka = true;
            ((mmaakkk)object).MAJAkka = true;
            ((mmaakkk)object).jAKKAma(mmajkka2, maaakka2);
            ((mmaakkk)object).JAKkAma(19);
            ((mmaakkk)object).JakKAma();
            ((mmaakkk)object).majakka.mAjaKka(1.0);
            ++n;
        }
        object = (mmajkka)kmaakma.MAjaKkA(this.MAjaKkA.aMajAKK("images/lc2.jpg"));
        maaakka maaakka3 = (maaakka)kmaakma.MAjaKkA(this.MAjaKkA.aMajAKK("images/kasvu.gif"));
        this.MAJaKkA = new kmajmma((mmajkka)object, maaakka3);
        this.MAJaKkA.maJakKA = -130.0f;
        this.MAJaKkA.MaJakKA = 30.0f;
        this.MAJaKkA.MAJakKA = 0.08f;
        this.MAJaKkA.mAJakKA *= 0.7f;
        this.MAJaKkA.MajakKA = 0.25f;
        this.maJaKkA.mAJAKkA(this.MAJaKkA);
        this.maJaKkA.MAjAKkA();
    }

    public void MajakkA(mmajkka mmajkka2, float f, float f2) {
        mmajkka2.aMaJAkk();
        int n = (int)(f * 20.0f) % this.MajaKkA.kAMAJaK;
        mmajkka2.amaJAkk(this.MajaKkA, -n, 0);
        mmajkka2.amaJAkk(this.MajaKkA, -n + this.MajaKkA.kAMAJaK, 0);
        this.maJaKkA.MAJAKkA(f, this.MaJaKkA);
        mmaakkk mmaakkk2 = (mmaakkk)this.maJaKkA.mAjAKkA.elementAt(0);
        this.MAJaKkA.mAJAKKa = f;
        this.MAJaKkA.Majakka.MAJAkKA(mmaakkk2.Majakka);
        this.MAJaKkA.MaJakKA = 30.0f;
        float f3 = (float)Math.max(0.0, Math.sin((double)f * 0.3));
        this.MAJaKkA.MAJakKA = (float)((double)0.81f - 0.8 * (double)f3 * (double)f3);
        this.maJaKkA.mAjAKkA(this.MaJaKkA, godog.KKAMAjA);
        this.maJaKkA.MajAKkA(godog.KKAMAjA);
        mmajkka2.aMajAkk();
    }

    public void majakkA(String string, float f) {
    }

    public static mmajkka MaJaKkA(maaakka maaakka2, float f, float f2, float f3) {
        mmajkka mmajkka2 = new mmajkka(256, 256, 1, false);
        int n = 0;
        while (n < 256) {
            int n2 = 0;
            while (n2 < 256) {
                double d = 1.0 - (double)n / 255.0;
                int n3 = (int)Math.min(255.0, (double)(maaakka2.kaMajaK[n2] & 0xFF) * d + (1.0 - d) * (double)f);
                int n4 = (int)Math.min(255.0, (double)(maaakka2.KAMajaK[n2] & 0xFF) * d + (1.0 - d) * (double)f2);
                int n5 = (int)Math.min(255.0, (double)(maaakka2.kAMajaK[n2] & 0xFF) * d + (1.0 - d) * (double)f3);
                mmajkka2.AMAjakk[n * 256 + n2] = n3 << 20 | n4 << 10 | n5;
                ++n2;
            }
            ++n;
        }
        return mmajkka2;
    }

    public majakma() {
        super();
    }
}

