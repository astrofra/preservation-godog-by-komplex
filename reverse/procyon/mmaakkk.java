// 
// Decompiled by Procyon v0.6.0
// 

public class mmaakkk
{
    protected String mAjAKka;
    public boolean MaJakka;
    public kajjkka[] maJakka;
    public majjmka[] MAJakka;
    public kajjmmk[] mAJakka;
    public final kaajmma Majakka;
    public final kaajmma majakka;
    public final kaajmma MAjakka;
    public final kaaakka mAjakka;
    float MaJAkka;
    public boolean maJAkka;
    public boolean MAJAkka;
    public boolean mAJAkka;
    public mmjjmkk MajAkka;
    public mmaakkk majAkka;
    int MAjAkka;
    kaaakka mAjAkka;
    float MaJaKKa;
    int maJaKKa;
    int MAJaKKa;
    int mAJaKKa;
    int MajaKKa;
    float majaKKa;
    float MAjaKKa;
    float mAjaKKa;
    float MaJAKKa;
    float maJAKKa;
    public int MAJAKKa;
    public float mAJAKKa;
    public boolean MajAKKa;
    public kaaakka majAKKa;
    public static int MAjAKKa;
    public static majjmka[] mAjAKKa;
    public static int MaJakKa;
    public static kajjkka[] maJakKa;
    
    public mmaakkk() {
        this.MaJakka = true;
        this.Majakka = new kaajmma();
        this.majakka = new kaajmma(1.0f, 1.0f, 1.0f);
        this.MAjakka = new kaajmma();
        this.mAjakka = new kaaakka();
        this.MajAKKa = false;
    }
    
    public mmaakkk(final mmaakkk mmaakkk) {
        this.MaJakka = true;
        this.Majakka = new kaajmma();
        this.majakka = new kaajmma(1.0f, 1.0f, 1.0f);
        this.MAjakka = new kaajmma();
        this.mAjakka = new kaaakka();
        this.MajAKKa = false;
        this.MAJakka = new majjmka[mmaakkk.MAJakka.length];
        for (int i = 0; i < this.MAJakka.length; ++i) {
            this.MAJakka[i] = new majjmka(mmaakkk.MAJakka[i]);
        }
        this.mAJakka = new kajjmmk[mmaakkk.mAJakka.length];
        for (int j = 0; j < this.MAJakka.length; ++j) {
            this.mAJakka[j] = new kajjmmk(mmaakkk.mAJakka[j]);
        }
        this.maJakka = new kajjkka[mmaakkk.maJakka.length];
        for (int k = 0; k < this.maJakka.length; ++k) {
            kajjkka kajjkka;
            int n;
            for (kajjkka = mmaakkk.maJakka[k], n = 0; mmaakkk.MAJakka[n] != kajjkka.amAJAkk; ++n) {}
            int n2;
            for (n2 = 0; mmaakkk.MAJakka[n2] != kajjkka.AMAJAkk; ++n2) {}
            int n3;
            for (n3 = 0; mmaakkk.MAJakka[n3] != kajjkka.aMAJAkk; ++n3) {}
            int n4;
            for (n4 = 0; mmaakkk.mAJakka[n4] != kajjkka.AmaJAkk; ++n4) {}
            int n5;
            for (n5 = 0; mmaakkk.mAJakka[n5] != kajjkka.amaJAkk; ++n5) {}
            int n6;
            for (n6 = 0; mmaakkk.mAJakka[n6] != kajjkka.AMaJAkk; ++n6) {}
            (this.maJakka[k] = new kajjkka(this, n, n2, n3, n4, n5, n6)).AmajAkk(kajjkka);
        }
        this.Majakka.MAJAkKA(mmaakkk.Majakka);
        this.majakka.MAJAkKA(mmaakkk.majakka);
        this.MAjakka.MAJAkKA(mmaakkk.MAjakka);
        this.mAjakka.KaMAjAK(mmaakkk.mAjakka);
        this.MaJAkka = mmaakkk.MaJAkka;
        this.maJAkka = mmaakkk.maJAkka;
        this.mAJAkka = mmaakkk.mAJAkka;
        this.MAJAkka = mmaakkk.MAJAkka;
        this.JakKAma();
    }
    
    public void JaKKaMA(final boolean majAkka) {
        if (!(this.mAJAkka = majAkka)) {
            this.majAkka = null;
            return;
        }
        this.majAkka = new mmaakkk(this);
        this.majAkka.mAJAkka = false;
    }
    
    public void jAkKaMA(final String s) {
        this.mAjAKka = s.intern();
    }
    
    public String jAKKaMA() {
        if (this.mAjAKka == null) {
            return "";
        }
        return this.mAjAKka.intern();
    }
    
    public void jakkama(final mmajkka amajakk, final mmajkka amajakk2) {
        final kaajmma kaajmma = new kaajmma();
        for (int i = 0; i < this.MAJakka.length; ++i) {
            final majjmka majjmka = this.MAJakka[i];
            final kajjmmk kajjmmk = this.mAJakka[i];
            kaajmma.MAJAkKA(majjmka);
            kaajmma.majakKA(0.7853982f);
            kaajmma.MaJAKKA();
            final double a = (double)kaajmma.MAjAkKA();
            final double min = Math.min(Math.abs(1.0 / Math.cos(a)), Math.abs(1.0 / Math.cos(1.5707963267948966 - a)));
            final mmjamma mmjamma = new mmjamma(kaajmma.MajaKka, kaajmma.majaKka, 0.0);
            mmjamma.mAjAKka();
            mmjamma.Majakka(Math.acos(Math.abs(kaajmma.MAjaKka)) / 1.5707963267948966);
            mmjamma.Majakka(min);
            final double majaKka = mmjamma.mAJAKka;
            final double majAKka = mmjamma.MajAKka;
            kajjmmk.jAKkaMA = (float)((majaKka + 1.0) / 2.0);
            kajjmmk.JakkaMA = (float)((majAKka + 1.0) / 2.0);
        }
        for (int j = 0; j < this.maJakka.length; ++j) {
            final kajjkka kajjkka = this.maJakka[j];
            if (kajjkka.AMaJAKK < 0.0f) {
                kajjkka.aMAJAKK = amajakk;
            }
            else {
                kajjkka.aMAJAKK = amajakk2;
            }
        }
    }
    
    public void JAKKaMA() {
        final kaajmma kaajmma = new kaajmma();
        for (int i = 0; i < this.MAJakka.length; ++i) {
            final majjmka majjmka = this.MAJakka[i];
            final kajjmmk kajjmmk = this.mAJakka[i];
            kaajmma.mAJaKka(majjmka.kAMajAK, majjmka.KamajAK, majjmka.kamajAK);
            kaajmma.MaJAKKA();
            final double n = (1.5707963267948966 - Math.acos(kaajmma.majaKka)) / 1.5707963267948966;
            kajjmmk.jAKkaMA = (float)((-(kaajmma.maJaKka() / 3.141592653589793) + 1.0) / 2.0);
            kajjmmk.JakkaMA = (float)((n + 1.0) / 2.0);
        }
    }
    
    public void jaKkama(final kaajmma kaajmma) {
        final kaajmma maJakKA = this.MAjakka.MAJakKA(kaajmma);
        for (int i = 0; i < this.MAJakka.length; ++i) {
            this.MAJakka[i].MaJaKka(maJakKA);
        }
        this.MAjakka.MAJAkKA(kaajmma);
    }
    
    public void Jakkama(final kaajmma kaajmma) {
        this.jAkkaMA(kaajmma.MajaKka, kaajmma.majaKka, kaajmma.MAjaKka);
    }
    
    public void jAkkaMA(final float n, final float n2, final float n3) {
        for (int i = 0; i < this.MAJakka.length; ++i) {
            this.MAJakka[i].mAjAKKA(n, n2, n3);
        }
    }
    
    public void JakKAma() {
        for (int i = 0; i < this.maJakka.length; ++i) {
            final kajjkka kajjkka = this.maJakka[i];
            kajjkka.amajaKK();
            kajjkka.AmajaKK();
        }
        if (this.maJAkka) {
            this.mAJakka = new kajjmmk[this.MAJakka.length];
            for (int j = 0; j < this.MAJakka.length; ++j) {
                this.mAJakka[j] = new kajjmmk();
            }
            for (int k = 0; k < this.maJakka.length; ++k) {
                kajjkka kajjkka2;
                int n;
                for (kajjkka2 = this.maJakka[k], n = 0; this.MAJakka[n] != kajjkka2.amAJAkk; ++n) {}
                int n2;
                for (n2 = 0; this.MAJakka[n2] != kajjkka2.AMAJAkk; ++n2) {}
                int n3;
                for (n3 = 0; this.MAJakka[n3] != kajjkka2.aMAJAkk; ++n3) {}
                this.maJakka[k].AmaJAkk = this.mAJakka[n];
                this.maJakka[k].amaJAkk = this.mAJakka[n2];
                this.maJakka[k].AMaJAkk = this.mAJakka[n3];
            }
        }
        final kaajmma kaajmma = new kaajmma();
        float n4 = 0.0f;
        for (int l = 0; l < this.MAJakka.length; ++l) {
            final majjmka majjmka = this.MAJakka[l];
            kaajmma.mAJaKka(majjmka.kAMajAK, majjmka.KamajAK, majjmka.kamajAK);
            kaajmma.MaJAKKA();
            majjmka.kAMajAK = kaajmma.MajaKka;
            majjmka.KamajAK = kaajmma.majaKka;
            majjmka.kamajAK = kaajmma.MAjaKka;
            final float maJAKKA = majjmka.maJAKKA();
            if (maJAKKA > n4) {
                n4 = maJAKKA;
            }
        }
        this.MaJAkka = (float)Math.sqrt(n4);
    }
    
    public void jAKkAma(final mmajkka amajakk, final float n) {
        for (int i = 0; i < this.MAJakka.length; ++i) {
            final majjmka majjmka = this.MAJakka[i];
            final kajjmmk kajjmmk = this.mAJakka[i];
            kajjmmk.jAKkaMA = -majjmka.majaKka / n * amajakk.kAMAJaK;
            kajjmmk.JakkaMA = 0.0f;
        }
        for (int j = 0; j < this.maJakka.length; ++j) {
            this.maJakka[j].aMAJAKK = amajakk;
        }
    }
    
    public void JAkKaMA(final mmajkka amajakk) {
        for (int i = 0; i < this.maJakka.length; ++i) {
            this.maJakka[i].aMAJAKK = amajakk;
        }
    }
    
    public void jAKKAma(final mmajkka amajakk, final maaakka amajakk2) {
        for (int i = 0; i < this.maJakka.length; ++i) {
            this.maJakka[i].aMAJAKK = amajakk;
            this.maJakka[i].AMAJAKK = amajakk2;
        }
    }
    
    public void JAKkAma(final int amAJAKK) {
        for (int i = 0; i < this.maJakka.length; ++i) {
            this.maJakka[i].amAJAKK = amAJAKK;
        }
    }
    
    public void jakkaMA() {
        for (int i = 0; i < this.maJakka.length; ++i) {
            final kajjkka kajjkka = this.maJakka[i];
            kajjkka.AmaJAKK = -kajjkka.AmaJAKK;
            kajjkka.amaJAKK = -kajjkka.amaJAKK;
            kajjkka.AMaJAKK = -kajjkka.AMaJAKK;
        }
    }
    
    public void JaKkama(final mmjjmkk majAkka, final int n) {
        if (!this.MaJakka) {
            return;
        }
        this.MajAkka = majAkka;
        this.MAjAkka = kaaamma.AmAjaKK;
        this.jakkAma();
        if (this.MAJAKKa != 0) {
            this.JakkaMA();
            if (this.MAJAkka) {
                this.JaKkAma();
            }
            if (this.maJAkka) {
                this.JakKaMA();
            }
            this.jaKKaMA();
            return;
        }
        if (this.maJAkka) {
            this.JakKaMA();
        }
        if (n == 0) {
            this.JAKkaMA();
            if (this.MAJAkka) {
                this.JaKkAma();
            }
            this.jAKkaMA();
            return;
        }
        this.JAkkama();
        if (this.MAJAkka) {
            this.JaKkAma();
        }
        this.jAkKAma();
        this.jAkkAma();
    }
    
    kaajmma jakKaMA() {
        final kaajmma kaajmma = new kaajmma(this.Majakka);
        kaajmma.MajAKKA(this.MajAkka.AMaJAkK);
        this.mAjakka.kamaJAK().KAmAjAK(kaajmma);
        return new kaajmma(kaajmma.MajaKka / this.majakka.MajaKka, kaajmma.majaKka / this.majakka.majaKka, kaajmma.MAjaKka / this.majakka.MAjaKka);
    }
    
    void JaKkAma() {
        final float amajakK = this.MajAkka.AmajakK;
        final float amAjakK = this.MajAkka.aMAjakK;
        for (final majjmka majjmka : this.MAJakka) {
            float kamAjAK = (majjmka.KaMAjAK - amajakK) / (amAjakK - amajakK);
            if (kamAjAK < 0.0f) {
                kamAjAK = 0.0f;
            }
            if (kamAjAK > 0.99609375f) {
                kamAjAK = 0.99609375f;
            }
            majjmka.KamAjAK = kamAjAK;
        }
    }
    
    public void jaKkAma() {
        for (int i = 0; i < this.maJakka.length; ++i) {
            this.maJakka[i].aMAjaKK();
        }
    }
    
    public void jakkAma() {
        (this.mAjAkka = this.mAjakka.KAMAjAK(this.MajAkka.aMaJAkK.kamaJAK())).kamAJAK(this.majakka);
        this.MaJaKKa = (float)(65536 * (this.MajAkka.AMAJAkK >> 1) / Math.tan(this.MajAkka.amaJAkK / 2.0f));
        this.maJaKKa = this.MajAkka.AMAJAkK << 16 >> 1;
        this.MAJaKKa = this.MajAkka.aMAJAkK << 16 >> 1;
        this.mAJaKKa = this.MajAkka.AMAJAkK << 16;
        this.MajaKKa = this.MajAkka.aMAJAkK << 16;
        this.majaKKa = this.MajAkka.AMAjakK;
        this.MAjaKKa = this.MajAkka.aMAjakK;
        final kaajmma kaajmma = new kaajmma(this.Majakka);
        kaajmma.MajAKKA(this.MajAkka.AMaJAkK);
        this.MajAkka.aMaJAkK.kamaJAK().KAmAjAK(kaajmma);
        this.mAjaKKa = kaajmma.MajaKka;
        this.MaJAKKa = kaajmma.majaKka;
        this.maJAKKa = kaajmma.MAjaKka;
    }
    
    public void JAKkaMA() {
        this.jakKAma(this.MAJakka, this.MAJakka.length);
    }
    
    public void jakKAma(final majjmka[] array, final int n) {
        final kaaakka mAjAkka = this.mAjAkka;
        final float kaMAjaK = mAjAkka.KaMAjaK;
        final float kaMAjaK2 = mAjAkka.kaMAjaK;
        final float kamAjaK = mAjAkka.KAMAjaK;
        final float kamAjaK2 = mAjAkka.kAMAjaK;
        final float kamAjaK3 = mAjAkka.KamAjaK;
        final float kamAjaK4 = mAjAkka.kamAjaK;
        final float kAmAjaK = mAjAkka.KAmAjaK;
        final float kAmAjaK2 = mAjAkka.kAmAjaK;
        final float kaMaJAK = mAjAkka.KaMaJAK;
        final float mAjaKKa = this.mAjaKKa;
        final float maJAKKa = this.MaJAKKa;
        final float maJAKKa2 = this.maJAKKa;
        final float maJaKKa = this.MaJaKKa;
        final float n2 = (float)this.maJaKKa;
        final float n3 = (float)this.MAJaKKa;
        majjmka majjmka;
        float majaKka;
        float majaKka2;
        float mAjaKka;
        float n4;
        float n5;
        float kaMAjAK;
        float n6;
        for (int i = 0; i < n; majjmka = array[i++], majaKka = majjmka.MajaKka, majaKka2 = majjmka.majaKka, mAjaKka = majjmka.MAjaKka, n4 = kaMAjaK * majaKka + kamAjaK2 * majaKka2 + kAmAjaK * mAjaKka + mAjaKKa, n5 = kaMAjaK2 * majaKka + kamAjaK3 * majaKka2 + kAmAjaK2 * mAjaKka + maJAKKa, kaMAjAK = kamAjaK * majaKka + kamAjaK4 * majaKka2 + kaMaJAK * mAjaKka + maJAKKa2, n6 = maJaKKa / kaMAjAK, majjmka.kaMAjAK = n4 * n6 + n2, majjmka.KAMAjAK = -(n5 * n6) + n3, majjmka.KaMAjAK = kaMAjAK) {}
    }
    
    public void JAkkama() {
        this.jaKKAma(this.MAJakka, this.MAJakka.length);
    }
    
    public void jaKKAma(final majjmka[] array, final int n) {
        final kaaakka mAjAkka = this.mAjAkka;
        final float kaMAjaK = mAjAkka.KaMAjaK;
        final float kaMAjaK2 = mAjAkka.kaMAjaK;
        final float kamAjaK = mAjAkka.KAMAjaK;
        final float kamAjaK2 = mAjAkka.kAMAjaK;
        final float kamAjaK3 = mAjAkka.KamAjaK;
        final float kamAjaK4 = mAjAkka.kamAjaK;
        final float kAmAjaK = mAjAkka.KAmAjaK;
        final float kAmAjaK2 = mAjAkka.kAmAjaK;
        final float kaMaJAK = mAjAkka.KaMaJAK;
        final float mAjaKKa = this.mAjaKKa;
        final float maJAKKa = this.MaJAKKa;
        final float maJAKKa2 = this.maJAKKa;
        final float maJaKKa = this.MaJaKKa;
        final float n2 = (float)this.maJaKKa;
        final float n3 = (float)this.MAJaKKa;
        final float majaKKa = this.majaKKa;
        final float mAjaKKa2 = this.MAjaKKa;
        final float n4 = (float)this.mAJaKKa;
        final float n5 = (float)this.MajaKKa;
        int i = 0;
        while (i < n) {
            final majjmka majjmka = array[i++];
            final float kAmajAK = kaMAjaK * majjmka.MajaKka + kamAjaK2 * majjmka.majaKka + kAmAjaK * majjmka.MAjaKka + mAjaKKa;
            final float kAmajAK2 = kaMAjaK2 * majjmka.MajaKka + kamAjaK3 * majjmka.majaKka + kAmAjaK2 * majjmka.MAjaKka + maJAKKa;
            float majaKKa2 = kamAjaK * majjmka.MajaKka + kamAjaK4 * majjmka.majaKka + kaMaJAK * majjmka.MAjaKka + maJAKKa2;
            if (majaKKa2 < majaKKa) {
                majjmka.kAMAjAK = 32768;
                majaKKa2 = this.majaKKa;
            }
            else if (majaKKa2 > mAjaKKa2) {
                majjmka.kAMAjAK = 4096;
            }
            else {
                majjmka.kAMAjAK = 0;
            }
            final float n6 = maJaKKa / majaKKa2;
            majjmka.kaMAjAK = kAmajAK * n6 + n2;
            majjmka.KAMAjAK = -(kAmajAK2 * n6) + n3;
            majjmka.KAmajAK = kAmajAK;
            majjmka.kAmajAK = kAmajAK2;
            majjmka.KaMAjAK = majaKKa2;
            if (majjmka.kaMAjAK < 0.0f) {
                final majjmka majjmka2 = majjmka;
                majjmka2.kAMAjAK |= 0x1;
            }
            else if (majjmka.kaMAjAK >= n4) {
                final majjmka majjmka3 = majjmka;
                majjmka3.kAMAjAK |= 0x8;
            }
            if (majjmka.KAMAjAK < 0.0f) {
                final majjmka majjmka4 = majjmka;
                majjmka4.kAMAjAK |= 0x40;
            }
            else {
                if (majjmka.KAMAjAK < n5) {
                    continue;
                }
                final majjmka majjmka5 = majjmka;
                majjmka5.kAMAjAK |= 0x200;
            }
        }
    }
    
    public void JakkaMA() {
        this.JAkKAma(this.MAJakka, this.MAJakka.length);
    }
    
    public void JAkKAma(final majjmka[] array, final int n) {
        final kaaakka mAjAkka = this.mAjAkka;
        final float kaMAjaK = mAjAkka.KaMAjaK;
        final float kaMAjaK2 = mAjAkka.kaMAjaK;
        final float kamAjaK = mAjAkka.KAMAjaK;
        final float kamAjaK2 = mAjAkka.kAMAjaK;
        final float kamAjaK3 = mAjAkka.KamAjaK;
        final float kamAjaK4 = mAjAkka.kamAjaK;
        final float kAmAjaK = mAjAkka.KAmAjaK;
        final float kAmAjaK2 = mAjAkka.kAmAjaK;
        final float kaMaJAK = mAjAkka.KaMaJAK;
        final kaaakka mAjakka = this.mAjakka;
        final float mAjaKKa = this.mAjaKKa;
        final float maJAKKa = this.MaJAKKa;
        final float maJAKKa2 = this.maJAKKa;
        final float maJaKKa = this.MaJaKKa;
        final float n2 = (float)this.maJaKKa;
        final float n3 = (float)this.MAJaKKa;
        final float majaKKa = this.majaKKa;
        final float mAjaKKa2 = this.MAjaKKa;
        final float n4 = (float)this.mAJaKKa;
        final float n5 = (float)this.MajaKKa;
        final int majakKa = this.MAJAKKa;
        final kaajmma kaajmma = new kaajmma();
        int i = 0;
        while (i < n) {
            final majjmka majjmka = array[i++];
            final float majaKka = majjmka.MajaKka;
            final float majaKka2 = majjmka.majaKka;
            final float mAjaKka = majjmka.MAjaKka;
            final float n6 = 0.0f;
            final float n7 = 0.0f;
            final float n8 = 0.0f;
            float n9 = majaKka - n6;
            float n10 = majaKka2 - n7;
            float n11 = mAjaKka - n8;
            switch (majakKa) {
                case 1: {
                    final float n12 = 1.0f + (float)Math.sin((float)Math.atan2(n9, n10) * 2.0f + this.mAJAKKa) * 0.175f;
                    n9 *= n12;
                    n10 *= n12;
                    n11 *= n12;
                    break;
                }
                case 2: {
                    final float n13 = (float)((n9 * n9 + n10 * n10 + n11 * n11) * 0.085) * (float)Math.sin(this.mAJAKKa + n11 * 0.1f);
                    kaajmma.mAJaKka(n9, n10, n11);
                    kaajmma.majakKA(n13);
                    n9 = kaajmma.MajaKka;
                    n10 = kaajmma.majaKka;
                    n11 = kaajmma.MAjaKka;
                    break;
                }
                case 3: {
                    final float n14 = 1.0f + (float)Math.sin((double)((float)Math.sqrt(n9 * n9 + n10 * n10 + n11 * n11) * 3.1f) + this.mAJAKKa * 2.1) * 0.109f;
                    n9 *= n14;
                    n10 *= n14;
                    n11 *= n14;
                    break;
                }
                case 4: {
                    final float n15 = 1.0f + (float)Math.sin(Math.sin((double)((float)Math.sqrt(n9 * n9 + n10 * n10 + n11 * n11) * 3.14f) + this.mAJAKKa * 2.7)) * 0.109f;
                    n9 *= n15;
                    n10 *= n15;
                    n11 *= n15;
                    break;
                }
                case 5: {
                    final float n16 = (n9 * n9 + n10 * n10 + n11 * n11) * 0.25f;
                    kaajmma.mAJaKka(n9, n10, n11);
                    kaajmma.majakKA(n16 * (float)Math.sin(this.mAJAKKa + n9 * 0.2f + n11 * 0.3f));
                    n9 = kaajmma.MajaKka;
                    n10 = kaajmma.majaKka;
                    n11 = kaajmma.MAjaKka;
                    break;
                }
            }
            final float n17 = n9 + n6;
            final float n18 = n10 + n7;
            final float n19 = n11 + n8;
            final float kAmajAK = kaMAjaK * n17 + kamAjaK2 * n18 + kAmAjaK * n19 + mAjaKKa;
            final float kAmajAK2 = kaMAjaK2 * n17 + kamAjaK3 * n18 + kAmAjaK2 * n19 + maJAKKa;
            float majaKKa2 = kamAjaK * n17 + kamAjaK4 * n18 + kaMaJAK * n19 + maJAKKa2;
            if (majaKKa2 < majaKKa) {
                majjmka.kAMAjAK = 32768;
                majaKKa2 = this.majaKKa;
            }
            else if (majaKKa2 > mAjaKKa2) {
                majjmka.kAMAjAK = 4096;
            }
            else {
                majjmka.kAMAjAK = 0;
            }
            final float n20 = maJaKKa / majaKKa2;
            majjmka.kaMAjAK = kAmajAK * n20 + n2;
            majjmka.KAMAjAK = -(kAmajAK2 * n20) + n3;
            majjmka.KAmajAK = kAmajAK;
            majjmka.kAmajAK = kAmajAK2;
            majjmka.KaMAjAK = majaKKa2;
            if (majjmka.kaMAjAK < 0.0f) {
                final majjmka majjmka2 = majjmka;
                majjmka2.kAMAjAK |= 0x1;
            }
            else if (majjmka.kaMAjAK >= n4) {
                final majjmka majjmka3 = majjmka;
                majjmka3.kAMAjAK |= 0x8;
            }
            if (majjmka.KAMAjAK < 0.0f) {
                final majjmka majjmka4 = majjmka;
                majjmka4.kAMAjAK |= 0x40;
            }
            else {
                if (majjmka.KAMAjAK < n5) {
                    continue;
                }
                final majjmka majjmka5 = majjmka;
                majjmka5.kAMAjAK |= 0x200;
            }
        }
    }
    
    public void jAKkaMA() {
        this.JAkkaMA(this.maJakka, this.maJakka.length);
    }
    
    public void JAkkaMA(final kajjkka[] array, final int n) {
        final kajjkka[] aMaJAKK = kaaamma.aMaJAKK;
        int amAjaKK = kaaamma.AmAjaKK;
        final kaajmma jakKaMA = this.jakKaMA();
        final float majaKka = jakKaMA.MajaKka;
        final float majaKka2 = jakKaMA.majaKka;
        final float mAjaKka = jakKaMA.MAjaKka;
        int i = 0;
        while (i < n) {
            final kajjkka kajjkka = array[i++];
            if ((majaKka + kajjkka.amAJAkk.MajaKka) * kajjkka.AmaJAKK + (majaKka2 + kajjkka.amAJAkk.majaKka) * kajjkka.amaJAKK + (mAjaKka + kajjkka.amAJAkk.MAjaKka) * kajjkka.AMaJAKK < 0.0f) {
                kajjkka.aMajakk = -(kajjkka.amAJAkk.KaMAjAK + kajjkka.AMAJAkk.KaMAjAK + kajjkka.aMAJAkk.KaMAjAK);
                aMaJAKK[amAjaKK++] = kajjkka;
            }
        }
        kaaamma.AmAjaKK = amAjaKK;
    }
    
    public void jAkKAma() {
        this.jAKkama(this.maJakka, this.maJakka.length);
    }
    
    public void jAKkama(final kajjkka[] array, final int n) {
        final kajjkka[] aMaJAKK = kaaamma.aMaJAKK;
        int amAjaKK = kaaamma.AmAjaKK;
        final kaajmma jakKaMA = this.jakKaMA();
        final float majaKka = jakKaMA.MajaKka;
        final float majaKka2 = jakKaMA.majaKka;
        final float mAjaKka = jakKaMA.MAjaKka;
        int i = 0;
        while (i < n) {
            final kajjkka kajjkka = array[i++];
            final int n2 = 37449 + kajjkka.amAJAkk.kAMAjAK + kajjkka.AMAJAkk.kAMAjAK + kajjkka.aMAJAkk.kAMAjAK;
            if ((n2 & 0x34924) == 0x0) {
                if ((majaKka + kajjkka.amAJAkk.MajaKka) * kajjkka.AmaJAKK + (majaKka2 + kajjkka.amAJAkk.majaKka) * kajjkka.amaJAKK + (mAjaKka + kajjkka.amAJAkk.MAjaKka) * kajjkka.AMaJAKK >= 0.0f) {
                    continue;
                }
                kajjkka.aMajakk = -(kajjkka.amAJAkk.KaMAjAK + kajjkka.AMAJAkk.KaMAjAK + kajjkka.aMAJAkk.KaMAjAK);
                aMaJAKK[amAjaKK++] = kajjkka;
            }
            else {
                if ((n2 & 0x24924) != 0x0 || (n2 & 0x30000) == 0x0 || (majaKka + kajjkka.amAJAkk.MajaKka) * kajjkka.AmaJAKK + (majaKka2 + kajjkka.amAJAkk.majaKka) * kajjkka.amaJAKK + (mAjaKka + kajjkka.amAJAkk.MAjaKka) * kajjkka.AMaJAKK >= 0.0f) {
                    continue;
                }
                kajjkka.aMajakk = -(kajjkka.amAJAkk.KaMAjAK + kajjkka.AMAJAkk.KaMAjAK + kajjkka.aMAJAkk.KaMAjAK);
                this.JaKKAma(kajjkka);
            }
        }
        kaaamma.AmAjaKK = amAjaKK;
    }
    
    public void JakkAma() {
        final kajjkka[] maJakka = this.maJakka;
        this.JAKKAma(maJakka, maJakka.length);
    }
    
    public void JAKKAma(final kajjkka[] array, final int n) {
        final kajjkka[] aMaJAKK = kaaamma.aMaJAKK;
        int amAjaKK = kaaamma.AmAjaKK;
        int i = 0;
        while (i < n) {
            final kajjkka kajjkka = array[i++];
            final float kaMAjAK = kajjkka.amAJAkk.kaMAjAK;
            final float kamAjAK = kajjkka.amAJAkk.KAMAjAK;
            if ((kajjkka.AMAJAkk.kaMAjAK - kaMAjAK) * (kajjkka.aMAJAkk.KAMAjAK - kamAjAK) - (kajjkka.aMAJAkk.kaMAjAK - kaMAjAK) * (kajjkka.AMAJAkk.KAMAjAK - kamAjAK) < 0.0f) {
                kajjkka.aMajakk = -(kajjkka.amAJAkk.KaMAjAK + kajjkka.AMAJAkk.KaMAjAK + kajjkka.aMAJAkk.KaMAjAK);
                aMaJAKK[amAjaKK++] = kajjkka;
            }
        }
        kaaamma.AmAjaKK = amAjaKK;
    }
    
    public void jaKKaMA() {
        final kajjkka[] maJakka = this.maJakka;
        final int length = maJakka.length;
        final kajjkka[] aMaJAKK = kaaamma.aMaJAKK;
        int amAjaKK = kaaamma.AmAjaKK;
        final float majaKKa = this.majaKKa;
        int i = 0;
        while (i < length) {
            final kajjkka kajjkka = maJakka[i++];
            if (kajjkka.amAJAkk.KaMAjAK < majaKKa || kajjkka.AMAJAkk.KaMAjAK < majaKKa) {
                break;
            }
            if (kajjkka.aMAJAkk.KaMAjAK < majaKKa) {
                break;
            }
            final float kaMAjAK = kajjkka.amAJAkk.kaMAjAK;
            final float kamAjAK = kajjkka.amAJAkk.KAMAjAK;
            if ((kajjkka.AMAJAkk.kaMAjAK - kaMAjAK) * (kajjkka.aMAJAkk.KAMAjAK - kamAjAK) - (kajjkka.aMAJAkk.kaMAjAK - kaMAjAK) * (kajjkka.AMAJAkk.KAMAjAK - kamAjAK) >= 0.0f) {
                continue;
            }
            kajjkka.aMajakk = -(kajjkka.amAJAkk.KaMAjAK + kajjkka.AMAJAkk.KaMAjAK + kajjkka.aMAJAkk.KaMAjAK);
            aMaJAKK[amAjaKK++] = kajjkka;
        }
        kaaamma.AmAjaKK = amAjaKK;
    }
    
    public final void JakKaMA() {
        kaaakka kaaakka = this.mAjakka;
        if (this.MajAKKa) {
            kaaakka = this.MajAkka.aMaJAkK.kamaJAK();
        }
        if (this.majAKKa != null) {
            kaaakka = kaaakka.KAMAjAK(this.majAKKa);
        }
        final float kaMAjaK = kaaakka.KaMAjaK;
        final float kaMAjaK2 = kaaakka.kaMAjaK;
        final float kamAjaK = kaaakka.kAMAjaK;
        final float kamAjaK2 = kaaakka.KamAjaK;
        final float kAmAjaK = kaaakka.KAmAjaK;
        final float kAmAjaK2 = kaaakka.kAmAjaK;
        final kajjmmk[] maJakka = this.mAJakka;
        final int length = maJakka.length;
        final majjmka[] maJakka2 = this.MAJakka;
        kajjmmk kajjmmk;
        majjmka majjmka;
        for (int i = 0; i < length; majjmka = maJakka2[i++], kajjmmk.jAKkaMA = (kaMAjaK * majjmka.kAMajAK + kamAjaK * majjmka.KamajAK + kAmAjaK * majjmka.kamajAK + 1.0f) * 0.5f, kajjmmk.JakkaMA = (kaMAjaK2 * majjmka.kAMajAK + kamAjaK2 * majjmka.KamajAK + kAmAjaK2 * majjmka.kamajAK + 1.0f) * 0.5f) {
            kajjmmk = maJakka[i];
        }
    }
    
    public void JaKKAma(final kajjkka kajjkka) {
        if (mmaakkk.MaJakKa < mmaakkk.maJakKa.length) {
            mmaakkk.maJakKa[mmaakkk.MaJakKa++] = kajjkka;
        }
    }
    
    public void jAkkAma() {
        if (mmaakkk.MaJakKa == 0) {
            return;
        }
        for (int i = 0; i < mmaakkk.MaJakKa; ++i) {
            final kajjkka kajjkka = mmaakkk.maJakKa[i];
            final kajjmmk amaJAkk = kajjkka.AmaJAkk;
            final kajjmmk amaJAkk2 = kajjkka.amaJAkk;
            final kajjmmk aMaJAkk = kajjkka.AMaJAkk;
            final majjmka amAJAkk = kajjkka.amAJAkk;
            final majjmka amajAkk = kajjkka.AMAJAkk;
            final majjmka amajAkk2 = kajjkka.aMAJAkk;
            switch (((amAJAkk.kAMAjAK & 0x8000) + (amajAkk.kAMAjAK & 0x8000) * 2 + (amajAkk2.kAMAjAK & 0x8000) * 4) / 32768) {
                case 1: {
                    this.jAkkama(kajjkka, amajAkk, amajAkk2, amAJAkk, amaJAkk2, aMaJAkk, amaJAkk);
                    break;
                }
                case 2: {
                    this.jAkkama(kajjkka, amAJAkk, amajAkk2, amajAkk, amaJAkk, aMaJAkk, amaJAkk2);
                    break;
                }
                case 4: {
                    this.jAkkama(kajjkka, amAJAkk, amajAkk, amajAkk2, amaJAkk, amaJAkk2, aMaJAkk);
                    break;
                }
                case 5: {
                    this.JAkkAma(kajjkka, amajAkk, amAJAkk, amajAkk2, amaJAkk2, amaJAkk, aMaJAkk);
                    break;
                }
                case 3: {
                    this.JAkkAma(kajjkka, amajAkk2, amajAkk, amAJAkk, aMaJAkk, amaJAkk2, amaJAkk);
                    break;
                }
                case 6: {
                    this.JAkkAma(kajjkka, amAJAkk, amajAkk, amajAkk2, amaJAkk, amaJAkk2, aMaJAkk);
                    break;
                }
            }
        }
        this.JAKkama(mmaakkk.mAjAKKa, mmaakkk.MAjAKKa);
        mmaakkk.MAjAKKa = 0;
        mmaakkk.MaJakKa = 0;
    }
    
    void JAkkAma(final kajjkka kajjkka, final majjmka majjmka, final majjmka majjmka2, final majjmka majjmka3, final kajjmmk kajjmmk, final kajjmmk kajjmmk2, final kajjmmk kajjmmk3) {
        final float n = (majjmka.KaMAjAK - this.majaKKa) / (majjmka.KaMAjAK - majjmka2.KaMAjAK);
        final float n2 = majjmka.KAmajAK + n * (majjmka2.KAmajAK - majjmka.KAmajAK);
        final float n3 = majjmka.kAmajAK + n * (majjmka2.kAmajAK - majjmka.kAmajAK);
        final majjmka majjmka4 = new majjmka(n2, n3, this.majaKKa);
        majjmka4.kAMajak(n2, n3, this.majaKKa);
        final kajjmmk kajjmmk4 = new kajjmmk(kajjmmk.jAKkaMA + n * (kajjmmk2.jAKkaMA - kajjmmk.jAKkaMA), kajjmmk.JakkaMA + n * (kajjmmk2.JakkaMA - kajjmmk.JakkaMA));
        final float n4 = (majjmka.KaMAjAK - this.majaKKa) / (majjmka.KaMAjAK - majjmka3.KaMAjAK);
        final float n5 = majjmka.KAmajAK + n4 * (majjmka3.KAmajAK - majjmka.KAmajAK);
        final float n6 = majjmka.kAmajAK + n4 * (majjmka3.kAmajAK - majjmka.kAmajAK);
        final majjmka majjmka5 = new majjmka();
        majjmka5.kAMajak(n5, n6, this.majaKKa);
        final kajjmmk kajjmmk5 = new kajjmmk(kajjmmk.jAKkaMA + n4 * (kajjmmk3.jAKkaMA - kajjmmk.jAKkaMA), kajjmmk.JakkaMA + n4 * (kajjmmk3.JakkaMA - kajjmmk.JakkaMA));
        mmaakkk.mAjAKKa[mmaakkk.MAjAKKa++] = majjmka4;
        mmaakkk.mAjAKKa[mmaakkk.MAjAKKa++] = majjmka5;
        final kajjkka kajjkka2 = new kajjkka(kajjkka, majjmka, majjmka4, majjmka5, kajjmmk, kajjmmk4, kajjmmk5);
        kajjkka2.aMajakk = kajjkka.aMajakk;
        kaaamma.aMaJAKK[kaaamma.AmAjaKK++] = kajjkka2;
    }
    
    void jAkkama(final kajjkka kajjkka, final majjmka majjmka, final majjmka majjmka2, final majjmka majjmka3, final kajjmmk kajjmmk, final kajjmmk kajjmmk2, final kajjmmk kajjmmk3) {
        final float n = (majjmka.KaMAjAK - this.majaKKa) / (majjmka.KaMAjAK - majjmka3.KaMAjAK);
        final float n2 = majjmka.KAmajAK + n * (majjmka3.KAmajAK - majjmka.KAmajAK);
        final float n3 = majjmka.kAmajAK + n * (majjmka3.kAmajAK - majjmka.kAmajAK);
        final majjmka majjmka4 = new majjmka();
        majjmka4.kAMajak(n2, n3, this.majaKKa);
        final kajjmmk kajjmmk4 = new kajjmmk(kajjmmk.jAKkaMA + n * (kajjmmk3.jAKkaMA - kajjmmk.jAKkaMA), kajjmmk.JakkaMA + n * (kajjmmk3.JakkaMA - kajjmmk.JakkaMA));
        final float n4 = (majjmka2.KaMAjAK - this.majaKKa) / (majjmka2.KaMAjAK - majjmka3.KaMAjAK);
        final float n5 = majjmka2.KAmajAK + n4 * (majjmka3.KAmajAK - majjmka2.KAmajAK);
        final float n6 = majjmka2.kAmajAK + n4 * (majjmka3.kAmajAK - majjmka2.kAmajAK);
        final majjmka majjmka5 = new majjmka();
        majjmka5.kAMajak(n5, n6, this.majaKKa);
        final kajjmmk kajjmmk5 = new kajjmmk(kajjmmk2.jAKkaMA + n4 * (kajjmmk3.jAKkaMA - kajjmmk2.jAKkaMA), kajjmmk2.JakkaMA + n4 * (kajjmmk3.JakkaMA - kajjmmk2.JakkaMA));
        mmaakkk.mAjAKKa[mmaakkk.MAjAKKa++] = majjmka4;
        mmaakkk.mAjAKKa[mmaakkk.MAjAKKa++] = majjmka5;
        final kajjkka kajjkka2 = new kajjkka(kajjkka, majjmka4, majjmka, majjmka2, kajjmmk4, kajjmmk, kajjmmk2);
        kajjkka2.aMajakk = kajjkka.aMajakk;
        kaaamma.aMaJAKK[kaaamma.AmAjaKK++] = kajjkka2;
        final kajjkka kajjkka3 = new kajjkka(kajjkka, majjmka4, majjmka5, majjmka2, kajjmmk4, kajjmmk5, kajjmmk2);
        kajjkka3.aMajakk = kajjkka.aMajakk;
        kaaamma.aMaJAKK[kaaamma.AmAjaKK++] = kajjkka3;
    }
    
    public void JAKkama(final majjmka[] array, final int n) {
        final float n2 = (float)this.maJaKKa;
        final float n3 = (float)this.MAJaKKa;
        final float maJaKKa = this.MaJaKKa;
        for (final majjmka majjmka : array) {
            final float n4 = maJaKKa / majjmka.KaMAjAK;
            majjmka.kaMAjAK = majjmka.KAmajAK * n4 + n2;
            majjmka.KAMAjAK = -(majjmka.kAmajAK * n4) + n3;
        }
    }
    
    static {
        mmaakkk.mAjAKKa = new majjmka[1000];
        mmaakkk.maJakKa = new kajjkka[1000];
    }
}
