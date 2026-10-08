/*
 * Decompiled with CFR 0.152.
 */
public final class kajjkka
extends kaaamma {
    public majjmka amAJAkk;
    public majjmka AMAJAkk;
    public majjmka aMAJAkk;
    public kajjmmk AmaJAkk;
    public kajjmmk amaJAkk;
    public kajjmmk AMaJAkk;
    public int aMaJAkk;

    public kajjkka(mmaakkk mmaakkk2, int n, int n2, int n3) {
        super();
        this.amAJAkk = mmaakkk2.MAJakka[n];
        this.AMAJAkk = mmaakkk2.MAJakka[n2];
        this.aMAJAkk = mmaakkk2.MAJakka[n3];
    }

    public kajjkka(mmaakkk mmaakkk2, int n, int n2, int n3, int n4, int n5, int n6) {
        super();
        this.amAJAkk = mmaakkk2.MAJakka[n];
        this.AMAJAkk = mmaakkk2.MAJakka[n2];
        this.aMAJAkk = mmaakkk2.MAJakka[n3];
        this.AmaJAkk = mmaakkk2.mAJakka[n4];
        this.amaJAkk = mmaakkk2.mAJakka[n5];
        this.AMaJAkk = mmaakkk2.mAJakka[n6];
    }

    public kajjkka(majjmka majjmka2, majjmka majjmka3, majjmka majjmka4) {
        super();
        this.amAJAkk = majjmka2;
        this.AMAJAkk = majjmka3;
        this.aMAJAkk = majjmka4;
    }

    public kajjkka(majjmka majjmka2, majjmka majjmka3, majjmka majjmka4, kajjmmk kajjmmk2, kajjmmk kajjmmk3, kajjmmk kajjmmk4) {
        super();
        this.amAJAkk = majjmka2;
        this.AMAJAkk = majjmka3;
        this.aMAJAkk = majjmka4;
        this.AmaJAkk = kajjmmk2;
        this.amaJAkk = kajjmmk3;
        this.AMaJAkk = kajjmmk4;
    }

    public kajjkka(kajjkka kajjkka2) {
        super();
        this.amAJAKK = kajjkka2.amAJAKK;
        this.AMAJAKK = kajjkka2.AMAJAKK;
        this.aMAJAKK = kajjkka2.aMAJAKK;
    }

    public kajjkka(kajjkka kajjkka2, majjmka majjmka2, majjmka majjmka3, majjmka majjmka4) {
        super();
        this.amAJAKK = kajjkka2.amAJAKK;
        this.AMAJAKK = kajjkka2.AMAJAKK;
        this.aMAJAKK = kajjkka2.aMAJAKK;
        this.amAJAkk = majjmka2;
        this.AMAJAkk = majjmka3;
        this.aMAJAkk = majjmka4;
        this.AmaJAkk = new kajjmmk();
        this.amaJAkk = new kajjmmk();
        this.AMaJAkk = new kajjmmk();
    }

    public kajjkka(kajjkka kajjkka2, majjmka majjmka2, majjmka majjmka3, majjmka majjmka4, kajjmmk kajjmmk2, kajjmmk kajjmmk3, kajjmmk kajjmmk4) {
        super();
        this.amAJAKK = kajjkka2.amAJAKK;
        this.AMAJAKK = kajjkka2.AMAJAKK;
        this.aMAJAKK = kajjkka2.aMAJAKK;
        this.amAJAkk = majjmka2;
        this.AMAJAkk = majjmka3;
        this.aMAJAkk = majjmka4;
        this.AmaJAkk = kajjmmk2;
        this.amaJAkk = kajjmmk3;
        this.AMaJAkk = kajjmmk4;
    }

    public void AmajAkk(kajjkka kajjkka2) {
        this.amAJAKK = kajjkka2.amAJAKK;
        this.AMAJAKK = kajjkka2.AMAJAKK;
        this.aMAJAKK = kajjkka2.aMAJAKK;
    }

    public final void aMAjaKK() {
        kaaamma.aMaJAKK[kaaamma.AmAjaKK++] = this;
    }

    public final void amajaKK() {
        kaajmma kaajmma2 = this.AMAJAkk.MAJakKA(this.amAJAkk);
        kaajmma kaajmma3 = this.aMAJAkk.MAJakKA(this.amAJAkk);
        kaajmma2.MaJAkKA(kaajmma3);
        kaajmma2.MaJAKKA();
        this.AmaJAKK = kaajmma2.MajaKka;
        this.amaJAKK = kaajmma2.majaKka;
        this.AMaJAKK = kaajmma2.MAjaKka;
    }

    public final void AmajaKK() {
        this.amAJAkk.kAMajAK += this.AmaJAKK;
        this.amAJAkk.KamajAK += this.amaJAKK;
        this.amAJAkk.kamajAK += this.AMaJAKK;
        this.AMAJAkk.kAMajAK += this.AmaJAKK;
        this.AMAJAkk.KamajAK += this.amaJAKK;
        this.AMAJAkk.kamajAK += this.AMaJAKK;
        this.aMAJAkk.kAMajAK += this.AmaJAKK;
        this.aMAJAkk.KamajAK += this.amaJAKK;
        this.aMAJAkk.kamajAK += this.AMaJAKK;
    }
}

