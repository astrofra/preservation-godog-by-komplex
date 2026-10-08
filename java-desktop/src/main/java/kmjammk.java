// 
// Decompiled by Procyon v0.6.0
// 

public class kmjammk extends mmaakkk
{
    int JAkKAMa;
    int jAkKAMa;
    short[][] JaKkaMa;
    public int jaKkaMa;
    public int JAKkaMa;
    int jAKkaMa;
    int JakkaMa;
    int jakkaMa;
    int JAkkaMa;
    float jAkkaMa;
    float JaKKaMa;
    public mmajkka jaKKaMa;
    public maaakka JAKKaMa;
    public maaakka jAKKaMa;
    public mmajkka JakKaMa;
    public boolean jakKaMa;
    majjmka[] JAkKaMa;
    kajjkka[] jAkKaMa;
    int AjAkKaM;
    int ajAkKaM;
    int AJAkKaM;
    int aJAkKaM;
    public float AjakKaM;
    public float ajakKaM;
    public static final int AJakKaM = 3;
    public static final int aJakKaM = 259;
    public boolean AjAKKaM;
    boolean ajAKKaM;
    static final float AJAKKaM = 0.0f;
    
    public kmjammk(final short[][] jaKkaMa, final float jAkkaMa, final float jaKKaMa, final mmjjmkk mmjjmkk, final boolean jakKaMa) {
        this.jakKaMa = true;
        this.AjakKaM = 0.028571429f;
        this.ajakKaM = 0.028571429f;
        this.AjAKKaM = false;
        this.ajAKKaM = false;
        this.jakKaMa = jakKaMa;
        this.JaKkaMa = jaKkaMa;
        if (this.JaKkaMa != null) {
            this.jAkKAMa = this.JaKkaMa.length;
            this.JAkKAMa = this.JaKkaMa[0].length;
        }
        this.jAkkaMa = jAkkaMa;
        this.JaKKaMa = jaKKaMa;
        final kaaamka kaaamka = new kaaamka();
        kaaamka.kKAMajA(mmjjmkk, null);
        final int n = (int)(Math.max(kaaamka.KkaMaja.maJAKka(), kaaamka.kKaMaja.MAJakKA(kaaamka.KkaMaja).maJAKka()) / this.jAkkaMa) + 4;
        this.JakkaMa = n;
        this.jAKkaMa = n;
        super.mAJakka = new kajjmmk[this.jAKkaMa * this.JakkaMa];
        for (int i = 0; i < this.jAKkaMa * this.JakkaMa; ++i) {
            super.mAJakka[i] = new kajjmmk(i / 10.0f, i / 20.0f);
        }
        if (this.jakKaMa) {
            this.AKkaMAJ(this.jAKkaMa, this.JakkaMa, this.jAkkaMa, 259);
            this.JAkKaMa = super.MAJakka;
            this.jAkKaMa = super.maJakka;
            this.AKkaMAJ(this.jAKkaMa, this.JakkaMa, this.jAkkaMa, 3);
        }
        else {
            this.AKkaMAJ(this.jAKkaMa, this.JakkaMa, this.jAkkaMa, 3);
        }
        super.MaJAkka = Float.POSITIVE_INFINITY;
    }
    
    public void AKkaMAJ(final int n, final int n2, final float n3, final int n4) {
        super.MAJakka = new majjmka[n * n2];
        int n5 = 0;
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n; ++j) {
                super.MAJakka[n5] = new majjmka(-(j - n / 2) * n3, (i - n2 / 2) * n3, 0.0f);
                ++n5;
            }
        }
        super.maJakka = new kajjkka[(n - 1) * (n2 - 1) * 2];
        int n6 = 0;
        for (int k = 0; k < n2 - 1; ++k) {
            for (int l = 0; l < n - 1; ++l) {
                final int n7 = k * n2 + l;
                final int n8 = k * n2 + l + 1;
                final int n9 = (k + 1) * n2 + l;
                final int n10 = (k + 1) * n2 + l + 1;
                super.maJakka[n6++] = new kajjkka(this, n7, n10, n8, n7, n10, n8);
                super.maJakka[n6++] = new kajjkka(this, n10, n7, n9, n10, n7, n9);
                super.maJakka[n6 - 2].amAJAKK = n4;
                super.maJakka[n6 - 1].amAJAKK = n4;
            }
        }
        this.JakKAma();
    }
    
    public void AkKAMAJ() {
    }
    
    public float akKAMAJ(final float a, final float a2, final float a3, final float a4, final float b) {
        return Math.min(a, Math.min(a2, Math.min(a3, Math.min(a4, b))));
    }
    
    public float AKKAMAJ(final float a, final float a2, final float a3, final float a4, final float b) {
        return Math.max(a, Math.max(a2, Math.max(a3, Math.max(a4, b))));
    }
    
    public void aKkaMAJ() {
        final kaaamka kaaamka = new kaaamka();
        kaaamka.kKAMajA(super.MajAkka, null);
        final float akKAMAJ = this.akKAMAJ(0.0f, kaaamka.KkaMaja.MajaKka, kaaamka.kkaMaja.MajaKka, kaaamka.KKaMaja.MajaKka, kaaamka.kKaMaja.MajaKka);
        final float akkamaj = this.AKKAMAJ(0.0f, kaaamka.KkaMaja.MajaKka, kaaamka.kkaMaja.MajaKka, kaaamka.KKaMaja.MajaKka, kaaamka.kKaMaja.MajaKka);
        final float akKAMAJ2 = this.akKAMAJ(0.0f, kaaamka.KkaMaja.majaKka, kaaamka.kkaMaja.majaKka, kaaamka.KKaMaja.majaKka, kaaamka.kKaMaja.majaKka);
        final float akkamaj2 = this.AKKAMAJ(0.0f, kaaamka.KkaMaja.majaKka, kaaamka.kkaMaja.majaKka, kaaamka.KKaMaja.majaKka, kaaamka.kKaMaja.majaKka);
        final float n = akKAMAJ + super.MajAkka.AMaJAkK.MajaKka;
        final float n2 = akkamaj + super.MajAkka.AMaJAkK.MajaKka;
        final float n3 = akKAMAJ2 + super.MajAkka.AMaJAkK.majaKka;
        final float n4 = akkamaj2 + super.MajAkka.AMaJAkK.majaKka;
        final float n5 = n / this.jAkkaMa;
        final float n6 = n2 / this.jAkkaMa;
        final float n7 = n3 / this.jAkkaMa;
        final float n8 = n4 / this.jAkkaMa;
        this.AjAkKaM = (int)n5;
        this.ajAkKaM = (int)n6;
        this.AJAkKaM = (int)n7;
        this.aJAkKaM = (int)n8;
        this.ajAkKaM += 2;
        this.aJAkKaM += 2;
        --this.AjAkKaM;
        --this.AJAkKaM;
        if (this.ajAkKaM - this.AjAkKaM > this.jAKkaMa) {
            System.err.println("dem cull X over" + (this.ajAkKaM - this.AjAkKaM - this.JAkKAMa));
            this.ajAkKaM = this.AjAkKaM + this.jAKkaMa;
        }
        if (this.aJAkKaM - this.AJAkKaM > this.JakkaMa) {
            System.err.println("dem cull Y over " + (this.aJAkKaM - this.AJAkKaM - this.jAkKAMa));
            this.aJAkKaM = this.AJAkKaM + this.JakkaMa;
        }
    }
    
    public void JAKkaMA() {
        final kaaakka mAjAkka = super.mAjAkka;
        final float kaMAjaK = mAjAkka.KaMAjaK;
        final float kaMAjaK2 = mAjAkka.kaMAjaK;
        final float kamAjaK = mAjAkka.KAMAjaK;
        final float kamAjaK2 = mAjAkka.kAMAjaK;
        final float kamAjaK3 = mAjAkka.KamAjaK;
        final float kamAjaK4 = mAjAkka.kamAjaK;
        final float kAmAjaK = mAjAkka.KAmAjaK;
        final float kAmAjaK2 = mAjAkka.kAmAjaK;
        final float kaMaJAK = mAjAkka.KaMaJAK;
        final float mAjaKKa = super.mAjaKKa;
        final float maJAKKa = super.MaJAKKa;
        final float maJAKKa2 = super.maJAKKa;
        final float maJaKKa = super.MaJaKKa;
        final float n = (float)super.maJaKKa;
        final float n2 = (float)super.MAJaKKa;
        final float majaKKa = super.majaKKa;
        final float mAjaKKa2 = super.MAjaKKa;
        final float n3 = (float)super.mAJaKKa;
        final float n4 = (float)super.MajaKKa;
        final float amajakK = super.MajAkka.AmajakK;
        final float jAkkaMa = this.jAkkaMa;
        float majaKka = this.AJAkKaM * jAkkaMa;
        for (int i = this.AJAkKaM; i < this.aJAkKaM; ++i) {
            float majaKka2 = this.AjAkKaM * jAkkaMa;
            int n5 = (i - this.AJAkKaM) * this.jAKkaMa;
            for (int j = this.AjAkKaM; j < this.ajAkKaM; ++j) {
                final majjmka majjmka = super.MAJakka[n5];
                final kajjmmk kajjmmk = super.mAJakka[n5];
                final int n6 = j - this.jaKkaMa;
                final int n7 = i - this.JAKkaMa;
                float mAjaKka;
                if (this.JaKkaMa != null && this.AjAKKaM) {
                    int n8 = n6 % this.JAkKAMa;
                    if (n8 < 0) {
                        n8 += this.JAkKAMa;
                    }
                    int n9 = n7 % this.jAkKAMa;
                    if (n9 < 0) {
                        n9 += this.jAkKAMa;
                    }
                    mAjaKka = this.JaKkaMa[this.JAkKAMa - 1 - n9][n8] * this.JaKKaMa;
                    kajjmmk.jAKkaMA = n6 * this.AjakKaM;
                    kajjmmk.JakkaMA = n7 * this.ajakKaM;
                }
                else if (this.JaKkaMa != null && n7 >= 0 && n7 < this.jAkKAMa && n6 >= 0 && n6 < this.JAkKAMa) {
                    final int n10 = n6;
                    final int n11 = this.JAkKAMa - 1 - n7;
                    kajjmmk.jAKkaMA = n6 * this.AjakKaM;
                    kajjmmk.JakkaMA = -n7 * this.AjakKaM;
                    mAjaKka = this.JaKkaMa[n11][n10] * this.JaKKaMa;
                }
                else {
                    kajjmmk.jAKkaMA = n6 * this.AjakKaM;
                    kajjmmk.JakkaMA = -n7 * this.AjakKaM;
                    mAjaKka = -0.001f;
                }
                j = n6 + this.jaKkaMa;
                i = n7 + this.JAKkaMa;
                majjmka.MajaKka = majaKka2;
                majjmka.majaKka = majaKka;
                majjmka.MAjaKka = mAjaKka;
                final float kAmajAK = kaMAjaK * majaKka2 + kamAjaK2 * majaKka + kAmAjaK * mAjaKka + mAjaKKa;
                final float kAmajAK2 = kaMAjaK2 * majaKka2 + kamAjaK3 * majaKka + kAmAjaK2 * mAjaKka + maJAKKa;
                float majaKKa2 = kamAjaK * majaKka2 + kamAjaK4 * majaKka + kaMaJAK * mAjaKka + maJAKKa2;
                if (majaKKa2 < majaKKa) {
                    majjmka.kAMAjAK = 32768;
                    majaKKa2 = super.majaKKa;
                }
                else if (majaKKa2 > mAjaKKa2) {
                    majjmka.kAMAjAK = 4096;
                }
                else {
                    majjmka.kAMAjAK = 0;
                }
                final float n12 = maJaKKa / majaKKa2;
                majjmka.kaMAjAK = kAmajAK * n12 + n;
                majjmka.KAMAjAK = -(kAmajAK2 * n12) + n2;
                if (majjmka.kaMAjAK < 0.0f) {
                    final majjmka majjmka2 = majjmka;
                    majjmka2.kAMAjAK |= 0x1;
                }
                else if (majjmka.kaMAjAK >= n3) {
                    final majjmka majjmka3 = majjmka;
                    majjmka3.kAMAjAK |= 0x8;
                }
                if (majjmka.KAMAjAK < 0.0f) {
                    final majjmka majjmka4 = majjmka;
                    majjmka4.kAMAjAK |= 0x40;
                }
                else if (majjmka.KAMAjAK >= n4) {
                    final majjmka majjmka5 = majjmka;
                    majjmka5.kAMAjAK |= 0x200;
                }
                majjmka.KAmajAK = kAmajAK;
                majjmka.kAmajAK = kAmajAK2;
                majjmka.KaMAjAK = majaKKa2;
                float kamAjAK = (majaKKa2 - amajakK) / (super.MAjaKKa - amajakK);
                if (kamAjAK < 0.0f) {
                    kamAjAK = 0.0f;
                }
                if (kamAjAK > 0.99609375f) {
                    kamAjAK = 0.99609375f;
                }
                majjmka.KamAjAK = kamAjAK;
                if (this.jakKaMa) {
                    final majjmka majjmka6 = this.JAkKaMa[n5];
                    majjmka6.KamAjAK = majjmka.KamAjAK;
                    final float n13 = kAmajAK - 2.0f * kAmAjaK * mAjaKka;
                    final float n14 = kAmajAK2 - 2.0f * kAmAjaK2 * mAjaKka;
                    float majaKKa3 = majaKKa2 - 2.0f * kaMaJAK * mAjaKka;
                    if (majaKKa3 < majaKKa) {
                        majjmka6.kAMAjAK = 32768;
                        majaKKa3 = super.majaKKa;
                    }
                    else if (majaKKa3 > mAjaKKa2) {
                        majjmka6.kAMAjAK = 4096;
                    }
                    else {
                        majjmka6.kAMAjAK = 0;
                    }
                    final float n15 = maJaKKa / majaKKa3;
                    majjmka6.kaMAjAK = n13 * n15 + n;
                    majjmka6.KAMAjAK = -(n14 * n15) + n2;
                    majjmka6.KaMAjAK = majaKKa3;
                    if (majjmka6.kaMAjAK < 0.0f) {
                        final majjmka majjmka7 = majjmka6;
                        majjmka7.kAMAjAK |= 0x1;
                    }
                    else if (majjmka6.kaMAjAK >= n3) {
                        final majjmka majjmka8 = majjmka6;
                        majjmka8.kAMAjAK |= 0x8;
                    }
                    if (majjmka6.KAMAjAK < 0.0f) {
                        final majjmka majjmka9 = majjmka6;
                        majjmka9.kAMAjAK |= 0x40;
                    }
                    else if (majjmka6.KAMAjAK >= n4) {
                        final majjmka majjmka10 = majjmka6;
                        majjmka10.kAMAjAK |= 0x200;
                    }
                }
                majaKka2 += jAkkaMa;
                ++n5;
            }
            majaKka += jAkkaMa;
        }
    }
    
    public void aKKAMAJ() {
        final kajjkka[] aMaJAKK = kaaamma.aMaJAKK;
        int amAjaKK = kaaamma.AmAjaKK;
        final kaajmma jakKaMA = this.jakKaMA();
        final float majaKka = jakKaMA.MajaKka;
        final float majaKka2 = jakKaMA.majaKka;
        final float mAjaKka = jakKaMA.MAjaKka;
        final int ajAkKaM = this.AjAkKaM;
        final int n = (this.ajAkKaM - ajAkKaM) * 2 + ajAkKaM;
        for (int i = this.AJAkKaM + 1; i < this.aJAkKaM; ++i) {
            int j = (i - this.AJAkKaM - 1) * (this.jAKkaMa - 1) * 2;
            final int rowEnd = j + (n - ajAkKaM - 2); // Original bytecode stores this before the loop.
            while (j < rowEnd) {
                final kajjkka kajjkka = super.maJakka[j++];
                float n2;
                float n3;
                if ((j & 0x1) == 0x0) {
                    n2 = kajjkka.amAJAkk.MAjaKka - kajjkka.aMAJAkk.MAjaKka;
                    n3 = -(kajjkka.AMAJAkk.MAjaKka - kajjkka.aMAJAkk.MAjaKka);
                }
                else {
                    n2 = -(kajjkka.amAJAkk.MAjaKka - kajjkka.aMAJAkk.MAjaKka);
                    n3 = kajjkka.AMAJAkk.MAjaKka - kajjkka.aMAJAkk.MAjaKka;
                }
                final int n4 = 37449 + kajjkka.amAJAkk.kAMAjAK + kajjkka.AMAJAkk.kAMAjAK + kajjkka.aMAJAkk.kAMAjAK;
                if ((n4 & 0x34924) == 0x0) {
                    if ((majaKka + kajjkka.amAJAkk.MajaKka) * n2 + (majaKka2 + kajjkka.amAJAkk.majaKka) * n3 + (mAjaKka + kajjkka.amAJAkk.MAjaKka) * -this.jAkkaMa > 0.0f) {
                        if (kajjkka.amAJAkk.MAjaKka < 0.0f || kajjkka.AMAJAkk.MAjaKka < 0.0f || kajjkka.aMAJAkk.MAjaKka < 0.0f) {
                            kajjkka.AMAJAKK = this.jAKKaMa;
                        }
                        else {
                            kajjkka.AMAJAKK = this.JAKKaMa;
                        }
                        kajjkka.aMAJAKK = this.jaKKaMa;
                        kajjkka.aMajakk = -(kajjkka.amAJAkk.KaMAjAK + kajjkka.AMAJAkk.KaMAjAK + kajjkka.aMAJAkk.KaMAjAK);
                        aMaJAKK[amAjaKK++] = kajjkka;
                    }
                }
                else if ((n4 & 0x24924) == 0x0 && (majaKka + kajjkka.amAJAkk.MajaKka) * n2 + (majaKka2 + kajjkka.amAJAkk.majaKka) * n3 + (mAjaKka + kajjkka.amAJAkk.MAjaKka) * -this.jAkkaMa > 0.0f) {
                    if (kajjkka.amAJAkk.MAjaKka < 0.0f || kajjkka.AMAJAkk.MAjaKka < 0.0f || kajjkka.aMAJAkk.MAjaKka < 0.0f) {
                        kajjkka.AMAJAKK = this.jAKKaMa;
                    }
                    else {
                        kajjkka.AMAJAKK = this.JAKKaMa;
                    }
                    kajjkka.aMAJAKK = this.jaKKaMa;
                    kajjkka.aMajakk = -(kajjkka.amAJAkk.KaMAjAK + kajjkka.AMAJAkk.KaMAjAK + kajjkka.aMAJAkk.KaMAjAK);
                    this.JaKKAma(kajjkka);
                }
                if (this.jakKaMa) {
                    final kajjkka kajjkka2 = this.jAkKaMa[j - 1];
                    if ((37449 + kajjkka2.amAJAkk.kAMAjAK + kajjkka2.AMAJAkk.kAMAjAK + kajjkka2.aMAJAkk.kAMAjAK & 0x34924) != 0x0 || (majaKka + kajjkka.amAJAkk.MajaKka) * -n2 + (majaKka2 + kajjkka.amAJAkk.majaKka) * -n3 + (mAjaKka - kajjkka.amAJAkk.MAjaKka) * -this.jAkkaMa >= 0.0f) {
                        continue;
                    }
                    kajjkka2.amAJAKK = 259;
                    kajjkka2.aMAJAKK = this.JakKaMa;
                    kajjkka2.AMAJAKK = this.JAKKaMa;
                    kajjkka2.aMajakk = kajjkka2.amAJAkk.KaMAjAK + kajjkka2.AMAJAkk.KaMAjAK + kajjkka2.aMAJAkk.KaMAjAK;
                    aMaJAKK[amAjaKK++] = kajjkka2;
                }
            }
        }
        kaaamma.AmAjaKK = amAjaKK;
    }
    
    public void JaKkama(final mmjjmkk majAkka, final int n) {
        super.MajAkka = majAkka;
        super.MAjAkka = kaaamma.AmAjaKK;
        this.ajAKKaM = (super.MajAkka.AMaJAkK.MAjaKka < 0.0f);
        this.jakkAma();
        this.aKkaMAJ();
        this.JAKkaMA();
        this.aKKAMAJ();
        this.jAkkAma();
    }
}
