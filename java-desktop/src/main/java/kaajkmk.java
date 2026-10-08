// 
// Decompiled by Procyon v0.6.0
// 

public class kaajkmk extends mmaakkk
{
    float AKKamaJ;
    kaajmka[] aKKamaJ;
    public static final int AkkamaJ = 0;
    public static final int akkamaJ = 1;
    int AKkamaJ;
    public float aKkamaJ;
    float AkKAmaJ;
    int akKAmaJ;
    float AKKAmaJ;
    
    public kaajkmk(final int n, final float akKamaJ) {
        this.aKkamaJ = 10.0f;
        this.AKKamaJ = akKamaJ;
        this.kkAmaJA(n);
        this.JakKAma();
        super.MaJAkka = Float.POSITIVE_INFINITY;
        this.KkaMAJA(0);
    }
    
    public void kkAmaJA(final int n) {
        super.maJakka = new kajjkka[n];
        this.aKKamaJ = new kaajmka[n];
        super.MAJakka = this.aKKamaJ;
        (super.mAJakka = new kajjmmk[3])[0] = new kajjmmk(0.0f, 0.0f);
        super.mAJakka[1] = new kajjmmk(1.0f, 0.0f);
        super.mAJakka[2] = new kajjmmk(0.0f, 1.0f);
        final kajjmmk kajjmmk = super.mAJakka[0];
        final kajjmmk kajjmmk2 = super.mAJakka[0];
        final kajjmmk kajjmmk3 = super.mAJakka[0];
        final float n2 = 20.0f;
        for (int i = 0; i < n; ++i) {
            final kaajmka kaajmka = new kaajmka((float)((Math.random() - 0.5) * n2), (float)((Math.random() - 0.5) * n2), (float)((Math.random() - 0.5) * n2));
            this.aKKamaJ[i] = kaajmka;
            super.maJakka[i] = new kajjkka(kaajmka, kaajmka, kaajmka, kajjmmk, kajjmmk2, kajjmmk3);
            super.maJakka[i].amAJAKK = 1024;
        }
    }
    
    public int KkAmaJA() {
        return this.AKkamaJ;
    }
    
    public void KkaMAJA(final int aKkamaJ) {
        this.AKkamaJ = aKkamaJ;
        for (int length = this.aKKamaJ.length, i = 0; i < length; ++i) {
            switch (this.AKkamaJ) {
                case 1: {
                    this.aKKamaJ[i].mAJaKka(0.0f, 0.0f, 0.0f);
                    break;
                }
                case 0: {
                    final float aKkamaJ2 = this.aKkamaJ;
                    this.aKKamaJ[i].mAJaKka((float)((Math.random() - 0.5) * aKkamaJ2), (float)((Math.random() - 0.5) * aKkamaJ2), (float)((Math.random() - 0.5) * aKkamaJ2));
                    break;
                }
            }
        }
    }
    
    public void JaKkama(final mmjjmkk majAkka, final int n) {
        super.MajAkka = majAkka;
        switch (this.AKkamaJ) {
            case 1: {
                this.kKaMAJA(new kaajmma(0.0f, 0.0f, 1.0f), new kaajmma(0.0f, 0.0f, 1.0f), 0.1f, 0.5f);
                break;
            }
        }
        this.jakkAma();
        this.JAKkaMA();
        this.AkKAmaJ = super.MajAkka.AMAjakK;
        super.MAjaKKa = super.MajAkka.aMAjakK;
        this.kkaMAJA();
    }
    
    void kkaMAJA() {
        int n = 0;
        for (int length = this.aKKamaJ.length, i = 0; i < length; ++i) {
            final kaajmka kaajmka = this.aKKamaJ[i];
            if (kaajmka.KaMAjAK > this.AkKAmaJ && kaajmka.KaMAjAK < super.MAjaKKa) {
                final float kaMAjAK = kaajmka.kaMAjAK;
                final float kamAjAK = kaajmka.KAMAjAK;
                this.aKKamaJ[n++].KamAjAK = this.AKKamaJ / kaajmka.KaMAjAK;
                final kajjkka kajjkka = super.maJakka[i];
                kajjkka.aMajakk = -kaajmka.KaMAjAK * 3.0f;
                kaaamma.aMaJAKK[kaaamma.AmAjaKK++] = kajjkka;
            }
            else {
                ++n;
            }
        }
    }
    
    public void kKaMAJA(final kaajmma kaajmma, final kaajmma kaajmma2, float n, float n2) {
        final kaajmma kaajmma3 = new kaajmma(0.0f, 0.0f, -0.05f);
        final int length = this.aKKamaJ.length;
        for (final kaajmka kaajmka : this.aKKamaJ) {
            kaajmka.kAmAjak.MaJaKka(kaajmma3);
            kaajmka.MaJaKka(kaajmka.kAmAjak);
            final float n3 = 0.7f;
            if (kaajmka.MAjaKka < n3 && kaajmka.kAmAjak.MAjaKka < 0.0f) {
                kaajmka.MAjaKka = n3 - kaajmka.MAjaKka;
                kaajmka.kAmAjak.MAjaKka = -kaajmka.kAmAjak.MAjaKka * 0.7f;
                final kaajmka kaajmka2 = kaajmka;
                kaajmka2.MAjaKka += kaajmka.kAmAjak.MAjaKka;
            }
        }
        n2 = 0.0f;
        n = 0.5f;
        for (int j = 0; j < 7; ++j) {
            this.KKaMAJA(kaajmma, (float)(j / 7.0f * 3.141592653589793 * 2.0) + this.AKKAmaJ, 0.2f, 1.0f);
        }
        this.AKKAmaJ += 0.05f;
    }
    
    void KKaMAJA(final kaajmma kaajmma, final float n, final float n2, final float n3) {
        final kaajmma kaajmma2 = new kaajmma();
        final kaajmka kaajmka = this.aKKamaJ[this.akKAmaJ++];
        kaajmka.MAJAkKA(kaajmma);
        kaajmma2.mAJaKka(0.0f, 0.0f, n3);
        kaajmma2.MajaKka(n2);
        kaajmma2.majakKA(n);
        kaajmka.kAmAjak.MAJAkKA(kaajmma2);
        if (this.akKAmaJ == this.aKKamaJ.length) {
            this.akKAmaJ = 0;
        }
    }
}
