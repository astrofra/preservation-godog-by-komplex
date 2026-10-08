/*
 * Decompiled with CFR 0.152.
 */
public class majakkk
extends kmjjmma {
    mmjjmkk majAkKA;
    kmjjkkk MAjAkKA;
    kmajmma mAjAkKA;
    mmajkka MaJaKka;
    mmajkka maJaKka;
    mmjjmmk MAJaKka;
    kmaamma mAJaKka;

    public String MaJAkkA() {
        return "paa";
    }

    public void mAjakkA(kmaamma kmaamma2) {
        Object object;
        this.mAJaKka = kmaamma2;
        this.majAkKA = new mmjjmkk();
        this.majAkKA.amaJAkK = 1.1f;
        this.majAkKA.AMAJAkK = 512;
        this.majAkKA.aMAJAkK = 256;
        this.majAkKA.aMAjakK = 5000.0f;
        this.MaJaKka = (mmajkka)kmaakma.MAjaKkA(this.mAJaKka.aMajAKK("images/headsea.jpg"));
        this.maJaKka = (mmajkka)kmaakma.MAjaKkA(this.mAJaKka.aMajAKK("images/koira04.jpg"));
        mmajkka mmajkka2 = (mmajkka)kmaakma.MAjaKkA(this.mAJaKka.aMajAKK("images/paa_left.jpg"));
        mmajkka mmajkka3 = (mmajkka)kmaakma.MAjaKkA(this.mAJaKka.aMajAKK("images/paa_right.jpg"));
        this.MAjAkKA = new kmjjkkk();
        this.MAjAkKA.AKKAmaj(this.mAJaKka.aMajAKK("data/knowledge.asz"), null);
        int n = 0;
        while (n < this.MAjAkKA.mAjAKkA.size()) {
            object = (mmaakkk)this.MAjAkKA.mAjAKkA.elementAt(n);
            if (n == 2) {
                ((mmaakkk)object).maJAkka = true;
            }
            ((mmaakkk)object).JakKAma();
            ((mmaakkk)object).majakka.mAjaKka(1.0);
            if (n == 0) {
                ((mmaakkk)object).JAkKaMA(mmajkka3);
            }
            if (n == 1) {
                ((mmaakkk)object).JAkKaMA(mmajkka2);
            }
            if (n == 2) {
                ((mmaakkk)object).JAkKaMA(this.maJaKka);
                ((mmaakkk)object).MaJakka = false;
            }
            ++n;
        }
        object = (mmajkka)kmaakma.MAjaKkA(this.mAJaKka.aMajAKK("images/lc.jpg"));
        maaakka maaakka2 = (maaakka)kmaakma.MAjaKkA(this.mAJaKka.aMajAKK("images/kasvu.gif"));
        this.mAjAkKA = new kmajmma((mmajkka)object, maaakka2);
        this.mAjAkKA.maJakKA = -130.0f;
        this.mAjAkKA.mAJakKA *= 0.7f;
        this.mAjAkKA.MajakKA = 1.0f;
        this.MAjAkKA.mAJAKkA(this.mAjAkKA);
    }

    public void maJAkkA() {
        System.out.println("know start");
        this.MAJaKka = new mmjjmmk();
        this.MAJaKka.JAKkAma(33);
        this.MAJaKka.JAkKaMA(this.maJaKka);
        this.MAJaKka.majakka.MAJAkKA(new kaajmma(1000.0f, 1000.0f, 1000.0f));
        this.MAjAkKA.mAJAKkA(this.MAJaKka);
        this.MAjAkKA.MAjAKkA();
    }

    public void MAjakkA() {
        this.MAjAkKA = null;
        this.maJaKka = null;
        this.MaJaKka = null;
        this.MAJaKka = null;
    }

    public void MajakkA(mmajkka mmajkka2, float f, float f2) {
        int n = (int)((f *= 1.08f) * 18.0f) % (this.MaJaKka.kAMAJaK - 512);
        mmajkka2.amaJAkk(this.MaJaKka, -n, 0);
        this.majAkKA.amAjakK = 2.0f * (float)Math.sin(-0.02 * (double)Math.max(f - 16.0f, 0.0f));
        this.MAjAkKA.MAJAKkA(f, this.majAkKA);
        mmaakkk mmaakkk2 = (mmaakkk)this.MAjAkKA.mAjAKkA.elementAt(3);
        this.mAjAkKA.mAJAKKa = f;
        this.mAjAkKA.Majakka.MAJAkKA(mmaakkk2.Majakka);
        this.mAjAkKA.MaJakKA = Math.min((f - 18.25f) * 17.0f, 120.0f) * 14.0f;
        this.mAjAkKA.MAJakKA = 0.11f;
        this.MAJaKka.MaJakka = f > 9.5f;
        this.MAJaKka.mAJAKKa = f;
        this.MAjAkKA.mAjAKkA(this.majAkKA, godog.KKAMAjA);
        this.MAjAkKA.MajAKkA(godog.KKAMAjA);
    }

    public void majakkA(String string, float f) {
    }

    public static mmajkka jAkKAMA(maaakka maaakka2, float f, float f2, float f3) {
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

    public majakkk() {
        super();
    }
}

