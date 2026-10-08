/*
 * Decompiled with CFR 0.152.
 */
public class mmaammk
extends mmaakkk {
    public boolean aJAkkAM = true;
    public int AjakkAM;

    public mmaammk() {
        super();
    }

    public mmaammk(mmaakkk mmaakkk2) {
        super(mmaakkk2);
    }

    public void AkKAmAJ() {
        int n = 0;
        while (n < this.maJakka.length) {
            kajjkka kajjkka2 = this.maJakka[n];
            int n2 = this.maJakka.length - 1;
            while (n2 > n) {
                kajjkka kajjkka3 = this.maJakka[n2];
                if (kajjkka2.amAJAkk.kaMAjAK == kajjkka3.amAJAkk.kaMAjAK && kajjkka2.amAJAkk.KAMAjAK == kajjkka3.amAJAkk.KAMAjAK && kajjkka2.amAJAkk.KaMAjAK == kajjkka3.amAJAkk.KaMAjAK) {
                    if (kajjkka2.AMAJAkk.kaMAjAK == kajjkka3.AMAJAkk.kaMAjAK && kajjkka2.AMAJAkk.KAMAjAK == kajjkka3.AMAJAkk.KAMAjAK && kajjkka2.AMAJAkk.KaMAjAK == kajjkka3.AMAJAkk.KaMAjAK) {
                        this.maJakka[n].aMaJAkk |= 1;
                    } else if (kajjkka2.aMAJAkk.kaMAjAK == kajjkka3.aMAJAkk.kaMAjAK && kajjkka2.aMAJAkk.KAMAjAK == kajjkka3.aMAJAkk.KAMAjAK && kajjkka2.aMAJAkk.KaMAjAK == kajjkka3.aMAJAkk.KaMAjAK) {
                        this.maJakka[n].aMaJAkk |= 4;
                    }
                }
                if (kajjkka2.AMAJAkk.kaMAjAK == kajjkka3.AMAJAkk.kaMAjAK && kajjkka2.AMAJAkk.KAMAjAK == kajjkka3.AMAJAkk.KAMAjAK && kajjkka2.AMAJAkk.KaMAjAK == kajjkka3.AMAJAkk.KaMAjAK && kajjkka2.aMAJAkk.kaMAjAK == kajjkka3.aMAJAkk.kaMAjAK && kajjkka2.aMAJAkk.KAMAjAK == kajjkka3.aMAJAkk.KAMAjAK && kajjkka2.aMAJAkk.KaMAjAK == kajjkka3.aMAJAkk.KaMAjAK) {
                    this.maJakka[n].aMaJAkk |= 2;
                }
                if (this.maJakka[n].aMaJAkk != 0) break;
                --n2;
            }
            ++n;
        }
    }

    public void JaKkama(mmjjmkk mmjjmkk2, int n) {
        if (!this.MaJakka) {
            return;
        }
        this.MajAkka = mmjjmkk2;
        this.MAjAkka = kaaamma.AmAjaKK;
        this.jakkAma();
        if (this.maJAkka) {
            this.JakKaMA();
        }
        if (this.MAJAKKa != 0) {
            this.JakkaMA();
            this.jaKKaMA();
            return;
        }
        if (this.aJAkkAM) {
            this.JAkkama();
            this.jAkKAma();
            this.jAkkAma();
            return;
        }
        this.JAKkaMA();
        this.aKkamAJ();
    }

    public void aKkamAJ() {
        this.akKAmAJ(this.maJakka, this.maJakka.length);
    }

    public void akKAmAJ(kajjkka[] kajjkkaArray, int n) {
        kajjkka[] kajjkkaArray2 = kaaamma.aMaJAKK;
        int n2 = kaaamma.AmAjaKK;
        int n3 = 0;
        while (n3 < n) {
            kajjkka kajjkka2 = kajjkkaArray[n3++];
            kajjkka2.aMajakk = -(kajjkka2.amAJAkk.KaMAjAK + kajjkka2.AMAJAkk.KaMAjAK + kajjkka2.aMAJAkk.KaMAjAK + (float)this.AjakkAM);
            kajjkkaArray2[n2++] = kajjkka2;
        }
        kaaamma.AmAjaKK = n2;
    }

    public void jAKkama(kajjkka[] kajjkkaArray, int n) {
        kajjkka[] kajjkkaArray2 = kaaamma.aMaJAKK;
        int n2 = kaaamma.AmAjaKK;
        kaajmma kaajmma2 = this.jakKaMA();
        float f = kaajmma2.MajaKka;
        float f2 = kaajmma2.majaKka;
        float f3 = kaajmma2.MAjaKka;
        int n3 = 0;
        while (n3 < n) {
            kajjkka kajjkka2 = kajjkkaArray[n3++];
            int n4 = 37449 + kajjkka2.amAJAkk.kAMAjAK + kajjkka2.AMAJAkk.kAMAjAK + kajjkka2.aMAJAkk.kAMAjAK;
            if ((n4 & 0x34924) == 0) {
                if (!((f + kajjkka2.amAJAkk.MajaKka) * kajjkka2.AmaJAKK + (f2 + kajjkka2.amAJAkk.majaKka) * kajjkka2.amaJAKK + (f3 + kajjkka2.amAJAkk.MAjaKka) * kajjkka2.AMaJAKK < 0.0f)) continue;
                kajjkka2.aMajakk = -(kajjkka2.amAJAkk.KaMAjAK + kajjkka2.AMAJAkk.KaMAjAK + kajjkka2.aMAJAkk.KaMAjAK + (float)this.AjakkAM);
                kajjkkaArray2[n2++] = kajjkka2;
                continue;
            }
            if ((n4 & 0x24924) != 0 || (n4 & 0x30000) == 0 || !((f + kajjkka2.amAJAkk.MajaKka) * kajjkka2.AmaJAKK + (f2 + kajjkka2.amAJAkk.majaKka) * kajjkka2.amaJAKK + (f3 + kajjkka2.amAJAkk.MAjaKka) * kajjkka2.AMaJAKK < 0.0f)) continue;
            kajjkka2.aMajakk = -(kajjkka2.amAJAkk.KaMAjAK + kajjkka2.AMAJAkk.KaMAjAK + kajjkka2.aMAJAkk.KaMAjAK + (float)this.AjakkAM);
            this.JaKKAma(kajjkka2);
        }
        kaaamma.AmAjaKK = n2;
    }
}

