/*
 * Decompiled with CFR 0.152.
 */
public class kmajkmk
extends kmjjmma {
    mmjjmkk akKAMaJ;
    maaakma AKKAMaJ;
    kmajmma aKKAMaJ;
    mmaammk AkkAMaJ;
    mmajkka akkAMaJ;
    kmaamma AKkAMaJ;
    kaajkmk aKkAMaJ;
    boolean AkKamaJ = false;
    float akKamaJ;

    public String MaJAkkA() {
        return "linjanen";
    }

    public void MAjakkA() {
        this.AKKAMaJ = null;
    }

    public void mAjakkA(kmaamma kmaamma2) {
        this.AKkAMaJ = kmaamma2;
        this.akKAMaJ = new mmjjmkk();
        this.akKAMaJ.amaJAkK = 1.2f;
        this.akKAMaJ.AMAJAkK = 512;
        this.akKAMaJ.aMAJAkK = 256;
        this.akKAMaJ.aMAjakK = 9000.0f;
        kmjjkkk kmjjkkk2 = new kmjjkkk();
        kmjjkkk2.AKKAmaj(this.AKkAMaJ.aMajAKK("data/sur3.asz"), null);
        mmaakkk mmaakkk2 = (mmaakkk)kmjjkkk2.mAjAKkA.elementAt(0);
        mmaakkk2.majakka.mAjaKka(1.0);
        mmaakkk2.maJAkka = true;
        mmaakkk2.JakKAma();
        this.AkkAMaJ = new mmaammk((mmaakkk)kmjjkkk2.mAjAKkA.elementAt(0));
        this.AkkAMaJ.MAJAKKa = 0;
        this.AkkAMaJ.maJAkka = false;
        this.AkkAMaJ.MaJakka = true;
        this.AkkAMaJ.JAKkAma(4096);
        this.AkkAMaJ.AkKAmAJ();
        this.AkkAMaJ.aJAkkAM = true;
        this.AkkAMaJ.majakka.mAJAKKA(0.07f);
        this.akkAMaJ = (mmajkka)kmaakma.MAjaKkA(this.AKkAMaJ.aMajAKK("images/surtausta.jpg"));
        godog.KKAMAjA.kAmAJAk.kamaJAk(true);
        godog.KKAMAjA.kAmAJAk.KAmAjak(-0.23f);
        this.AKKAMaJ = new maaakma();
        this.AKKAMaJ.mAJAKkA(this.AkkAMaJ);
        mmajkka mmajkka2 = (mmajkka)kmaakma.MAjaKkA(this.AKkAMaJ.aMajAKK("images/flare.jpg"));
        this.aKkAMaJ = new kaajkmk(230, 500.0f);
        this.aKkAMaJ.aKkamaJ = 50.0f;
        this.aKkAMaJ.KkaMAJA(0);
        this.aKkAMaJ.Majakka.MAJAkKA(new kaajmma(0.0f, 0.0f, 0.0f));
        this.aKkAMaJ.JAkKaMA(mmajkka2);
        this.AKKAMaJ.mAJAKkA(this.aKkAMaJ);
        mmajkka mmajkka3 = (mmajkka)kmaakma.MAjaKkA(this.AKkAMaJ.aMajAKK("images/lc.jpg"));
        maaakka maaakka2 = (maaakka)kmaakma.MAjaKkA(this.AKkAMaJ.aMajAKK("images/kasvu.gif"));
        this.aKKAMaJ = new kmajmma(mmajkka3, maaakka2);
        this.aKKAMaJ.maJakKA = -130.0f;
        this.aKKAMaJ.MAJakKA = 0.0f;
        this.aKKAMaJ.mAJakKA *= 0.3f;
        this.aKKAMaJ.MajakKA = 1.0f;
        this.aKKAMaJ.MaJakKA = 100.0f;
        this.AKKAMaJ.mAJAKkA(this.aKKAMaJ);
        this.AKKAMaJ.MAjAKkA();
    }

    public void MajakkA(mmajkka mmajkka2, float f, float f2) {
        if (this.AkKamaJ) {
            this.akKamaJ = f;
            this.AkKamaJ = false;
        }
        mmajkka2.aMaJAkk();
        int n = (int)(f * 30.0f) % this.akkAMaJ.KamAJaK;
        mmajkka2.amaJAkk(this.akkAMaJ, 0, n - this.akkAMaJ.KamAJaK);
        mmajkka2.amaJAkk(this.akkAMaJ, 0, n);
        float f3 = f - this.akKamaJ;
        int n2 = (int)Math.max(30.0f, 1.0f / (1.0f + f3 * f3 * 4.0f) * 80.0f);
        godog.KKAMAjA.kAmAJAk.KAmaJAk(n2 << 20 | n2 << 10 | n2);
        this.AkkAMaJ.mAJAKKa = f;
        this.AkkAMaJ.mAjakka.KamajAK();
        this.AkkAMaJ.mAjakka.kAmAJAK(f * 0.2f);
        this.AkkAMaJ.Majakka.mAJaKka(0.0f, 0.0f, 0.0f);
        this.aKkAMaJ.mAjakka.KamajAK();
        this.aKkAMaJ.mAjakka.kAmAJAK(f * 0.06f);
        this.aKkAMaJ.Majakka.mAJaKka(0.0f, 0.0f, 20.0f - f);
        this.aKKAMaJ.Majakka.mAJaKka(0.0f, 0.0f, 35.0f - f * 2.0f);
        this.aKKAMaJ.mAJAKKa = f;
        this.akKAMaJ.AMaJAkK.mAJaKka(0.0f, 32.0f, 0.0f);
        this.akKAMaJ.JakKAMa(new kaajmma(0.0f, 0.001f, 0.0f));
        this.AKKAMaJ.mAjAKkA(this.akKAMaJ, godog.KKAMAjA);
        this.AKKAMaJ.MajAKkA(godog.KKAMAjA);
        mmajkka2.aMajAkk();
    }

    public void majakkA(String string, float f) {
        if (string.equals("flash")) {
            this.AkKamaJ = true;
        }
        if (this.AkkAMaJ == null) {
            return;
        }
        if (string.equals("spc0")) {
            this.AkkAMaJ.MAJAKKa = 0;
        }
        if (string.equals("spc1")) {
            this.AkkAMaJ.MAJAKKa = 1;
        }
        if (string.equals("spc2")) {
            this.AkkAMaJ.MAJAKKa = 3;
        }
        if (string.equals("spc3")) {
            this.AkkAMaJ.MAJAKKa = 4;
        }
    }

    public kmajkmk() {
        super();
    }
}

