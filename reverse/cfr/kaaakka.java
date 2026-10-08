/*
 * Decompiled with CFR 0.152.
 */
public class kaaakka {
    public float KaMAjaK;
    public float kaMAjaK;
    public float KAMAjaK;
    public float kAMAjaK;
    public float KamAjaK;
    public float kamAjaK;
    public float KAmAjaK;
    public float kAmAjaK;
    public float KaMaJAK;

    public kaaakka() {
        super();
        this.KamajAK();
    }

    public kaaakka(kaajmma kaajmma2, kaajmma kaajmma3, kaajmma kaajmma4) {
        super();
        this.kamAjAK(kaajmma2, kaajmma3, kaajmma4);
    }

    public kaaakka(kaajmma kaajmma2) {
        super();
        this.kamajAK(kaajmma2);
    }

    public kaaakka(kaaakka kaaakka2) {
        super();
        this.KaMAjAK(kaaakka2);
    }

    public final void KamajAK() {
        this.KaMAjaK = 1.0f;
        this.kaMAjaK = 0.0f;
        this.KAMAjaK = 0.0f;
        this.kAMAjaK = 0.0f;
        this.KamAjaK = 1.0f;
        this.kamAjaK = 0.0f;
        this.KAmAjaK = 0.0f;
        this.kAmAjaK = 0.0f;
        this.KaMaJAK = 1.0f;
    }

    public final void kamAjAK(kaajmma kaajmma2, kaajmma kaajmma3, kaajmma kaajmma4) {
        this.KamaJAK(kaajmma2);
        this.KAMaJAK(kaajmma3);
        this.kaMaJAK(kaajmma4);
    }

    public final void kamajAK(kaajmma kaajmma2) {
        this.KamAjAK(kaajmma2.MajaKka, kaajmma2.majaKka, kaajmma2.MAjaKka);
    }

    public final void KamAjAK(float f, float f2, float f3) {
        kaajmma kaajmma2 = new kaajmma();
        kaajmma2.MAJAkKA(kaajmma.maJaKka);
        kaajmma2.MAJaKKA(f, f2, f3);
        this.KamaJAK(kaajmma2);
        kaajmma2.MAJAkKA(kaajmma.MAJaKka);
        kaajmma2.MAJaKKA(f, f2, f3);
        this.KAMaJAK(kaajmma2);
        kaajmma2.MAJAkKA(kaajmma.mAJaKka);
        kaajmma2.MAJaKKA(f, f2, f3);
        this.kaMaJAK(kaajmma2);
        kaajmma2 = null;
    }

    public final void KamaJAK(kaajmma kaajmma2) {
        this.KAMajAK(kaajmma2.MajaKka, kaajmma2.majaKka, kaajmma2.MAjaKka);
    }

    public final void KAMajAK(float f, float f2, float f3) {
        this.KaMAjaK = f;
        this.kaMAjaK = f2;
        this.KAMAjaK = f3;
    }

    public final void KAMaJAK(kaajmma kaajmma2) {
        this.kaMajAK(kaajmma2.MajaKka, kaajmma2.majaKka, kaajmma2.MAjaKka);
    }

    public final void kaMajAK(float f, float f2, float f3) {
        this.kAMAjaK = f;
        this.KamAjaK = f2;
        this.kamAjaK = f3;
    }

    public final void kaMaJAK(kaajmma kaajmma2) {
        this.KaMajAK(kaajmma2.MajaKka, kaajmma2.majaKka, kaajmma2.MAjaKka);
    }

    public final void KaMajAK(float f, float f2, float f3) {
        this.KAmAjaK = f;
        this.kAmAjaK = f2;
        this.KaMaJAK = f3;
    }

    public final void KaMAjAK(kaaakka kaaakka2) {
        this.KaMAjaK = kaaakka2.KaMAjaK;
        this.kaMAjaK = kaaakka2.kaMAjaK;
        this.KAMAjaK = kaaakka2.KAMAjaK;
        this.kAMAjaK = kaaakka2.kAMAjaK;
        this.KamAjaK = kaaakka2.KamAjaK;
        this.kamAjaK = kaaakka2.kamAjaK;
        this.KAmAjaK = kaaakka2.KAmAjaK;
        this.kAmAjaK = kaaakka2.kAmAjaK;
        this.KaMaJAK = kaaakka2.KaMaJAK;
    }

    public final void kAMAjAK(kaajmma kaajmma2) {
        kaajmma2.mAJaKka(this.KaMAjaK, this.kaMAjaK, this.KAMAjaK);
    }

    public final void kAMAJAK(kaajmma kaajmma2) {
        kaajmma2.mAJaKka(this.kAMAjaK, this.KamAjaK, this.kamAjaK);
    }

    public final void kAMaJak(kaajmma kaajmma2) {
        kaajmma2.mAJaKka(this.KAmAjaK, this.kAmAjaK, this.KaMaJAK);
    }

    public final kaajmma KAMaJak() {
        kaajmma kaajmma2 = new kaajmma(this.KaMAjaK, this.kaMAjaK, this.KAMAjaK);
        return kaajmma2;
    }

    public final kaajmma kaMaJak() {
        kaajmma kaajmma2 = new kaajmma(this.kAMAjaK, this.KamAjaK, this.kamAjaK);
        return kaajmma2;
    }

    public final kaajmma kAmAjAK() {
        kaajmma kaajmma2 = new kaajmma(this.KAmAjaK, this.kAmAjaK, this.KaMaJAK);
        return kaajmma2;
    }

    public final void KAmajAK(float f) {
        this.KaMAjaK *= f;
        this.kaMAjaK *= f;
        this.KAMAjaK *= f;
        this.kAMAjaK *= f;
        this.KamAjaK *= f;
        this.kamAjaK *= f;
        this.KAmAjaK *= f;
        this.kAmAjaK *= f;
        this.KaMaJAK *= f;
    }

    public final kaaakka kAmajAK(float f) {
        kaaakka kaaakka2 = new kaaakka(this);
        kaaakka2.KAmajAK(f);
        return kaaakka2;
    }

    public final void KAmAjAK(kaajmma kaajmma2) {
        float f = kaajmma2.MajaKka;
        float f2 = kaajmma2.majaKka;
        float f3 = kaajmma2.MAjaKka;
        kaajmma2.MajaKka = this.KaMAjaK * f + this.kAMAjaK * f2 + this.KAmAjaK * f3;
        kaajmma2.majaKka = this.kaMAjaK * f + this.KamAjaK * f2 + this.kAmAjaK * f3;
        kaajmma2.MAjaKka = this.KAMAjaK * f + this.kamAjaK * f2 + this.KaMaJAK * f3;
    }

    public final kaajmma kaMAjAK(kaajmma kaajmma2) {
        kaajmma kaajmma3 = new kaajmma(kaajmma2);
        this.KAmAjAK(kaajmma3);
        return kaajmma3;
    }

    public final void kAmaJAK(kaaakka kaaakka2) {
        float f = this.KaMAjaK * kaaakka2.KaMAjaK + this.kaMAjaK * kaaakka2.kAMAjaK + this.KAMAjaK * kaaakka2.KAmAjaK;
        float f2 = this.KaMAjaK * kaaakka2.kaMAjaK + this.kaMAjaK * kaaakka2.KamAjaK + this.KAMAjaK * kaaakka2.kAmAjaK;
        float f3 = this.KaMAjaK * kaaakka2.KAMAjaK + this.kaMAjaK * kaaakka2.kamAjaK + this.KAMAjaK * kaaakka2.KaMaJAK;
        float f4 = this.kAMAjaK * kaaakka2.KaMAjaK + this.KamAjaK * kaaakka2.kAMAjaK + this.kamAjaK * kaaakka2.KAmAjaK;
        float f5 = this.kAMAjaK * kaaakka2.kaMAjaK + this.KamAjaK * kaaakka2.KamAjaK + this.kamAjaK * kaaakka2.kAmAjaK;
        float f6 = this.kAMAjaK * kaaakka2.KAMAjaK + this.KamAjaK * kaaakka2.kamAjaK + this.kamAjaK * kaaakka2.KaMaJAK;
        float f7 = this.KAmAjaK * kaaakka2.KaMAjaK + this.kAmAjaK * kaaakka2.kAMAjaK + this.KaMaJAK * kaaakka2.KAmAjaK;
        float f8 = this.KAmAjaK * kaaakka2.kaMAjaK + this.kAmAjaK * kaaakka2.KamAjaK + this.KaMaJAK * kaaakka2.kAmAjaK;
        float f9 = this.KAmAjaK * kaaakka2.KAMAjaK + this.kAmAjaK * kaaakka2.kamAjaK + this.KaMaJAK * kaaakka2.KaMaJAK;
        this.KaMAjaK = f;
        this.kaMAjaK = f2;
        this.KAMAjaK = f3;
        this.kAMAjaK = f4;
        this.KamAjaK = f5;
        this.kamAjaK = f6;
        this.KAmAjaK = f7;
        this.kAmAjaK = f8;
        this.KaMaJAK = f9;
    }

    public final kaaakka KAMAjAK(kaaakka kaaakka2) {
        kaaakka kaaakka3 = new kaaakka(this);
        kaaakka3.kAmaJAK(kaaakka2);
        return kaaakka3;
    }

    public final void KAmAJAK() {
        float f = this.kAMAjaK;
        float f2 = this.KAmAjaK;
        float f3 = this.kaMAjaK;
        float f4 = this.kAmAjaK;
        float f5 = this.KAMAjaK;
        float f6 = this.kamAjaK;
        this.kaMAjaK = f;
        this.KAMAjaK = f2;
        this.kAMAjaK = f3;
        this.kamAjaK = f4;
        this.KAmAjaK = f5;
        this.kAmAjaK = f6;
    }

    public final kaaakka kamaJAK() {
        kaaakka kaaakka2 = new kaaakka();
        kaaakka2.KaMAjaK = this.KaMAjaK;
        kaaakka2.kaMAjaK = this.kAMAjaK;
        kaaakka2.KAMAjaK = this.KAmAjaK;
        kaaakka2.kAMAjaK = this.kaMAjaK;
        kaaakka2.KamAjaK = this.KamAjaK;
        kaaakka2.kamAjaK = this.kAmAjaK;
        kaaakka2.KAmAjaK = this.KAMAjaK;
        kaaakka2.kAmAjaK = this.kamAjaK;
        kaaakka2.KaMaJAK = this.KaMaJAK;
        return kaaakka2;
    }

    public final void KAMAJAK(float f) {
        float f2 = (float)Math.sin(f);
        float f3 = (float)Math.cos(f);
        float f4 = this.kaMAjaK * f3 - f2 * this.KAMAjaK;
        float f5 = this.KAMAjaK * f3 + f2 * this.kaMAjaK;
        this.kaMAjaK = f4;
        this.KAMAjaK = f5;
        f4 = this.KamAjaK * f3 - f2 * this.kamAjaK;
        f5 = this.kamAjaK * f3 + f2 * this.KamAjaK;
        this.KamAjaK = f4;
        this.kamAjaK = f5;
        f4 = this.kAmAjaK * f3 - f2 * this.KaMaJAK;
        f5 = this.KaMaJAK * f3 + f2 * this.kAmAjaK;
        this.kAmAjaK = f4;
        this.KaMaJAK = f5;
    }

    public final void KaMaJak(float f) {
        float f2 = (float)Math.sin(f);
        float f3 = (float)Math.cos(f);
        float f4 = this.KaMAjaK * f3 + f2 * this.KAMAjaK;
        float f5 = this.KAMAjaK * f3 - f2 * this.KaMAjaK;
        this.KaMAjaK = f4;
        this.KAMAjaK = f5;
        f4 = this.kAMAjaK * f3 + f2 * this.kamAjaK;
        f5 = this.kamAjaK * f3 - f2 * this.kAMAjaK;
        this.kAMAjaK = f4;
        this.kamAjaK = f5;
        f4 = this.KAmAjaK * f3 + f2 * this.KaMaJAK;
        f5 = this.KaMaJAK * f3 - f2 * this.KAmAjaK;
        this.KAmAjaK = f4;
        this.KaMaJAK = f5;
    }

    public final void kAmAJAK(float f) {
        float f2 = (float)Math.sin(f);
        float f3 = (float)Math.cos(f);
        float f4 = this.KaMAjaK * f3 - f2 * this.kaMAjaK;
        float f5 = this.kaMAjaK * f3 + f2 * this.KaMAjaK;
        this.KaMAjaK = f4;
        this.kaMAjaK = f5;
        f4 = this.kAMAjaK * f3 - f2 * this.KamAjaK;
        f5 = this.KamAjaK * f3 + f2 * this.kAMAjaK;
        this.kAMAjaK = f4;
        this.KamAjaK = f5;
        f4 = this.KAmAjaK * f3 - f2 * this.kAmAjaK;
        f5 = this.kAmAjaK * f3 + f2 * this.KAmAjaK;
        this.KAmAjaK = f4;
        this.kAmAjaK = f5;
    }

    public kaaakka kaMAJAK(float f) {
        kaaakka kaaakka2 = new kaaakka(this);
        kaaakka2.KAMAJAK(f);
        return kaaakka2;
    }

    public kaaakka KaMAJAK(float f) {
        kaaakka kaaakka2 = new kaaakka(this);
        kaaakka2.KaMaJak(f);
        return kaaakka2;
    }

    public kaaakka KAmaJAK(float f) {
        kaaakka kaaakka2 = new kaaakka(this);
        kaaakka2.kAmAJAK(f);
        return kaaakka2;
    }

    public void kAMaJAK() {
        float f = (float)Math.sqrt(this.KaMAjaK * this.KaMAjaK + this.kaMAjaK * this.kaMAjaK + this.KAMAjaK * this.KAMAjaK);
        this.KaMAjaK /= f;
        this.kaMAjaK /= f;
        this.KAMAjaK /= f;
        f = (float)Math.sqrt(this.kAMAjaK * this.kAMAjaK + this.KamAjaK * this.KamAjaK + this.kamAjaK * this.kamAjaK);
        this.kAMAjaK /= f;
        this.KamAjaK /= f;
        this.kamAjaK /= f;
        f = (float)Math.sqrt(this.KAmAjaK * this.KAmAjaK + this.kAmAjaK * this.kAmAjaK + this.KaMaJAK * this.KaMaJAK);
        this.KAmAjaK /= f;
        this.kAmAjaK /= f;
        this.KaMaJAK /= f;
    }

    public kaaakka KaMaJAK() {
        kaaakka kaaakka2 = new kaaakka(this);
        kaaakka2.KaMaJAK();
        return kaaakka2;
    }

    public void kamAJAK(kaajmma kaajmma2) {
        this.KaMAjaK *= kaajmma2.MajaKka;
        this.kaMAjaK *= kaajmma2.MajaKka;
        this.KAMAjaK *= kaajmma2.MajaKka;
        this.kAMAjaK *= kaajmma2.majaKka;
        this.KamAjaK *= kaajmma2.majaKka;
        this.kamAjaK *= kaajmma2.majaKka;
        this.KAmAjaK *= kaajmma2.MAjaKka;
        this.kAmAjaK *= kaajmma2.MAjaKka;
        this.KaMaJAK *= kaajmma2.MAjaKka;
    }

    public void KamAJAK(kaajmma kaajmma2) {
        this.KaMAjaK *= kaajmma2.MajaKka;
        this.kAMAjaK *= kaajmma2.MajaKka;
        this.KAmAjaK *= kaajmma2.MajaKka;
        this.kaMAjaK *= kaajmma2.majaKka;
        this.KamAjaK *= kaajmma2.majaKka;
        this.kAmAjaK *= kaajmma2.majaKka;
        this.KAMAjaK *= kaajmma2.MAjaKka;
        this.kamAjaK *= kaajmma2.MAjaKka;
        this.KaMaJAK *= kaajmma2.MAjaKka;
    }

    public kaaakka KamaJak(kaajmma kaajmma2) {
        kaaakka kaaakka2 = new kaaakka(this);
        kaaakka2.kamAJAK(kaajmma2);
        return kaaakka2;
    }

    public kaaakka kAMajAK(kaajmma kaajmma2) {
        kaaakka kaaakka2 = new kaaakka(this);
        kaaakka2.KamAJAK(kaajmma2);
        return kaaakka2;
    }

    public String toString() {
        double d = 10000.0;
        String string = "";
        string = String.valueOf(string) + (double)((int)((double)this.KaMAjaK * d)) / d + "\t" + (double)((int)((double)this.kaMAjaK * d)) / d + "\t" + (double)((int)((double)this.KAMAjaK * d)) / d + "\t \\ X\n";
        string = String.valueOf(string) + (double)((int)((double)this.kAMAjaK * d)) / d + "\t" + (double)((int)((double)this.KamAjaK * d)) / d + "\t" + (double)((int)((double)this.kamAjaK * d)) / d + "\t \\ Y\n";
        string = String.valueOf(string) + (double)((int)((double)this.KAmAjaK * d)) / d + "\t" + (double)((int)((double)this.kAmAjaK * d)) / d + "\t" + (double)((int)((double)this.KaMaJAK * d)) / d + "\t \\ Z\n";
        return string;
    }
}

