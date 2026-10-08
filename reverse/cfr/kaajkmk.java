/*
 * Decompiled with CFR 0.152.
 */
public class kaajkmk
extends mmaakkk {
    float AKKamaJ;
    kaajmka[] aKKamaJ;
    public static final int AkkamaJ = 0;
    public static final int akkamaJ = 1;
    int AKkamaJ;
    public float aKkamaJ = 10.0f;
    float AkKAmaJ;
    int akKAmaJ;
    float AKKAmaJ;

    public kaajkmk(int n, float f) {
        super();
        this.AKKamaJ = f;
        this.kkAmaJA(n);
        this.JakKAma();
        this.MaJAkka = Float.POSITIVE_INFINITY;
        this.KkaMAJA(0);
    }

    public void kkAmaJA(int n) {
        this.maJakka = new kajjkka[n];
        this.aKKamaJ = new kaajmka[n];
        this.MAJakka = this.aKKamaJ;
        this.mAJakka = new kajjmmk[3];
        this.mAJakka[0] = new kajjmmk(0.0f, 0.0f);
        this.mAJakka[1] = new kajjmmk(1.0f, 0.0f);
        this.mAJakka[2] = new kajjmmk(0.0f, 1.0f);
        kajjmmk kajjmmk2 = this.mAJakka[0];
        kajjmmk kajjmmk3 = this.mAJakka[0];
        kajjmmk kajjmmk4 = this.mAJakka[0];
        float f = 20.0f;
        int n2 = 0;
        while (n2 < n) {
            kaajmka kaajmka2;
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            f2 = (float)((Math.random() - 0.5) * (double)f);
            f3 = (float)((Math.random() - 0.5) * (double)f);
            f4 = (float)((Math.random() - 0.5) * (double)f);
            this.aKKamaJ[n2] = kaajmka2 = new kaajmka(f2, f3, f4);
            this.maJakka[n2] = new kajjkka(kaajmka2, kaajmka2, kaajmka2, kajjmmk2, kajjmmk3, kajjmmk4);
            this.maJakka[n2].amAJAKK = 1024;
            ++n2;
        }
    }

    public int KkAmaJA() {
        return this.AKkamaJ;
    }

    public void KkaMAJA(int n) {
        this.AKkamaJ = n;
        int n2 = this.aKKamaJ.length;
        int n3 = 0;
        while (n3 < n2) {
            switch (this.AKkamaJ) {
                case 1: {
                    this.aKKamaJ[n3].mAJaKka(0.0f, 0.0f, 0.0f);
                    break;
                }
                case 0: {
                    float f = this.aKkamaJ;
                    float f2 = 0.0f;
                    float f3 = 0.0f;
                    float f4 = 0.0f;
                    f2 = (float)((Math.random() - 0.5) * (double)f);
                    f3 = (float)((Math.random() - 0.5) * (double)f);
                    f4 = (float)((Math.random() - 0.5) * (double)f);
                    this.aKKamaJ[n3].mAJaKka(f2, f3, f4);
                    break;
                }
            }
            ++n3;
        }
    }

    public void JaKkama(mmjjmkk mmjjmkk2, int n) {
        this.MajAkka = mmjjmkk2;
        switch (this.AKkamaJ) {
            case 1: {
                this.kKaMAJA(new kaajmma(0.0f, 0.0f, 1.0f), new kaajmma(0.0f, 0.0f, 1.0f), 0.1f, 0.5f);
                break;
            }
        }
        this.jakkAma();
        this.JAKkaMA();
        this.AkKAmaJ = this.MajAkka.AMAjakK;
        this.MAjaKKa = this.MajAkka.aMAjakK;
        this.kkaMAJA();
    }

    void kkaMAJA() {
        int n = 0;
        int n2 = this.aKKamaJ.length;
        int n3 = 0;
        while (n3 < n2) {
            kaajmka kaajmka2 = this.aKKamaJ[n3];
            if (kaajmka2.KaMAjAK > this.AkKAmaJ && kaajmka2.KaMAjAK < this.MAjaKKa) {
                float f = kaajmka2.kaMAjAK;
                float f2 = kaajmka2.KAMAjAK;
                float f3 = this.AKKamaJ / kaajmka2.KaMAjAK;
                this.aKKamaJ[n++].KamAjAK = f3;
                kajjkka kajjkka2 = this.maJakka[n3];
                kajjkka2.aMajakk = -kaajmka2.KaMAjAK * 3.0f;
                kaaamma.aMaJAKK[kaaamma.AmAjaKK++] = kajjkka2;
            } else {
                ++n;
            }
            ++n3;
        }
    }

    public void kKaMAJA(kaajmma kaajmma2, kaajmma kaajmma3, float f, float f2) {
        float f3;
        kaajmma kaajmma4 = new kaajmma(0.0f, 0.0f, -0.05f);
        int n = this.aKKamaJ.length;
        kaajmka[] kaajmkaArray = this.aKKamaJ;
        int n2 = 0;
        while (n2 < n) {
            kaajmka kaajmka2 = kaajmkaArray[n2];
            kaajmka2.kAmAjak.MaJaKka(kaajmma4);
            kaajmka2.MaJaKka(kaajmka2.kAmAjak);
            f3 = 0.7f;
            if (kaajmka2.MAjaKka < f3 && kaajmka2.kAmAjak.MAjaKka < 0.0f) {
                kaajmka2.MAjaKka = f3 - kaajmka2.MAjaKka;
                kaajmka2.kAmAjak.MAjaKka = -kaajmka2.kAmAjak.MAjaKka * 0.7f;
                kaajmka2.MAjaKka += kaajmka2.kAmAjak.MAjaKka;
            }
            ++n2;
        }
        f2 = 0.0f;
        f = 0.5f;
        int n3 = 0;
        while (n3 < 7) {
            f3 = (float)((double)((float)n3 / 7.0f) * Math.PI * 2.0);
            float f4 = 0.2f;
            this.KKaMAJA(kaajmma2, f3 += this.AKKAmaJ, f4, 1.0f);
            ++n3;
        }
        this.AKKAmaJ += 0.05f;
    }

    void KKaMAJA(kaajmma kaajmma2, float f, float f2, float f3) {
        kaajmma kaajmma3 = new kaajmma();
        kaajmka kaajmka2 = this.aKKamaJ[this.akKAmaJ++];
        kaajmka2.MAJAkKA(kaajmma2);
        kaajmma3.mAJaKka(0.0f, 0.0f, f3);
        kaajmma3.MajaKka(f2);
        kaajmma3.majakKA(f);
        kaajmka2.kAmAjak.MAJAkKA(kaajmma3);
        if (this.akKAmaJ == this.aKKamaJ.length) {
            this.akKAmaJ = 0;
        }
    }
}

