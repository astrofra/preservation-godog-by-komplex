/*
 * Decompiled with CFR 0.152.
 */
public class kmajmma
extends mmaakkk {
    mmajkka MAjAKKA;
    maaakka mAjAKKA;
    public float MaJakKA = 50.0f;
    public float maJakKA;
    public float MAJakKA;
    public float mAJakKA;
    public float MajakKA = 1.0f;

    public kmajmma(mmajkka mmajkka2, maaakka maaakka2) {
        super();
        this.MaJAkka = Float.POSITIVE_INFINITY;
        int n = maaakka2.kAMAJaK;
        this.MAJakka = new majjmka[n + 1];
        this.mAJakka = new kajjmmk[n + 1];
        int n2 = 0;
        while (n2 < this.MAJakka.length) {
            this.MAJakka[n2] = new majjmka();
            ++n2;
        }
        int n3 = 0;
        while (n3 < this.mAJakka.length) {
            this.mAJakka[n3] = new kajjmmk(0.99609375, 0.0);
            ++n3;
        }
        this.mAJakka[n].jAKkaMA = this.MAJakKA;
        this.mAJakka[n].JakkaMA = 0.0f;
        this.maJakka = new kajjkka[n];
        int n4 = 0;
        while (n4 < this.maJakka.length) {
            kajjkka kajjkka2;
            this.maJakka[n4] = kajjkka2 = new kajjkka(this, n, n4 % n, (n4 + 1) % n, n, n4 % n, (n4 + 1) % n);
            ++n4;
        }
        this.MAjAKKA = mmajkka2;
        this.mAjAKKA = maaakka2;
        this.mAJakKA = maaakka2.KamAJaK;
        this.JAkKaMA(mmajkka2);
        this.JAKkAma(2048);
    }

    public void JaKkama(mmjjmkk mmjjmkk2, int n) {
        if (this.MaJakKA <= 0.0f) {
            return;
        }
        if (this.MAJakKA >= 1.0f) {
            return;
        }
        if (!this.MaJakka) {
            return;
        }
        this.MajAkka = mmjjmkk2;
        this.MAjAkka = kaaamma.AmAjaKK;
        this.jakkAma();
        this.JAKkaMA();
        this.JAKKAma(this.maJakka, this.maJakka.length);
    }

    public void JAKKAma(kajjkka[] kajjkkaArray, int n) {
        kajjkka[] kajjkkaArray2 = kaaamma.aMaJAKK;
        int n2 = kaaamma.AmAjaKK;
        int n3 = 0;
        while (n3 < n) {
            kajjkka kajjkka2 = kajjkkaArray[n3];
            majjmka majjmka2 = kajjkka2.amAJAkk;
            majjmka majjmka3 = kajjkka2.AMAJAkk;
            majjmka majjmka4 = kajjkka2.aMAJAkk;
            kajjkka2.aMajakk = -(majjmka2.KaMAjAK + majjmka3.KaMAjAK + majjmka4.KaMAjAK) - this.maJakKA;
            kajjkkaArray2[n2++] = kajjkka2;
            ++n3;
        }
        kaaamma.AmAjaKK = n2;
    }

    public void JAKkaMA() {
        float f = this.mAjaKKa;
        float f2 = this.MaJAKKa;
        float f3 = this.maJAKKa;
        float f4 = this.maJaKKa;
        float f5 = this.MAJaKKa;
        majjmka[] majjmkaArray = this.MAJakka;
        int n = this.mAjAKKA.kAMAJaK;
        float f6 = 0.0f;
        float f7 = 6.28f / (float)n;
        float f8 = f3;
        float f9 = this.MaJaKKa / f8;
        float f10 = f9 * this.MajakKA;
        majjmkaArray[n].kaMAjAK = f * f9 + f4;
        majjmkaArray[n].KAMAjAK = -f2 * f9 + f5;
        this.mAJakka[n].jAKkaMA = this.MAJakKA;
        float f11 = this.mAJAKKa * this.mAJakKA;
        int n2 = (int)f11 % this.mAjAKKA.KamAJaK;
        int n3 = (n2 + 1) % this.mAjAKKA.KamAJaK;
        float f12 = f11 - (float)Math.floor(f11);
        float f13 = 1.0f - f12;
        float f14 = f12;
        float f15 = this.MaJakKA * 0.00390625f;
        f13 *= f15;
        f14 *= f15;
        n2 *= this.mAjAKKA.kAMAJaK;
        n3 *= this.mAjAKKA.kAMAJaK;
        byte[] byArray = this.mAjAKKA.kamAJaK;
        int n4 = 0;
        while (n4 < n) {
            majjmka majjmka2 = majjmkaArray[n4];
            float f16 = (float)(byArray[n2 + n4] & 0xFF) * f13 + (float)(byArray[n3 + n4] & 0xFF) * f14;
            float f17 = (float)((double)f + Math.cos(f6) * (double)f16);
            float f18 = (float)((double)f2 + Math.sin(f6) * (double)f16);
            majjmka2.kaMAjAK = f17 * f9 + f4;
            majjmka2.KAMAjAK = -(f18 * f10) + f5;
            majjmka2.KaMAjAK = f8;
            f6 += f7;
            ++n4;
        }
    }
}

