// 
// Decompiled by Procyon v0.6.0
// 

public class mmaammk extends mmaakkk
{
    public boolean aJAkkAM;
    public int AjakkAM;
    
    public mmaammk() {
        this.aJAkkAM = true;
    }
    
    public mmaammk(final mmaakkk mmaakkk) {
        super(mmaakkk);
        this.aJAkkAM = true;
    }
    
    public void AkKAmAJ() {
        for (int i = 0; i < super.maJakka.length; ++i) {
            final kajjkka kajjkka = super.maJakka[i];
            for (int j = super.maJakka.length - 1; j > i; --j) {
                final kajjkka kajjkka2 = super.maJakka[j];
                if (kajjkka.amAJAkk.kaMAjAK == kajjkka2.amAJAkk.kaMAjAK && kajjkka.amAJAkk.KAMAjAK == kajjkka2.amAJAkk.KAMAjAK && kajjkka.amAJAkk.KaMAjAK == kajjkka2.amAJAkk.KaMAjAK) {
                    if (kajjkka.AMAJAkk.kaMAjAK == kajjkka2.AMAJAkk.kaMAjAK && kajjkka.AMAJAkk.KAMAjAK == kajjkka2.AMAJAkk.KAMAjAK && kajjkka.AMAJAkk.KaMAjAK == kajjkka2.AMAJAkk.KaMAjAK) {
                        final kajjkka kajjkka3 = super.maJakka[i];
                        kajjkka3.aMaJAkk |= 0x1;
                    }
                    else if (kajjkka.aMAJAkk.kaMAjAK == kajjkka2.aMAJAkk.kaMAjAK && kajjkka.aMAJAkk.KAMAjAK == kajjkka2.aMAJAkk.KAMAjAK && kajjkka.aMAJAkk.KaMAjAK == kajjkka2.aMAJAkk.KaMAjAK) {
                        final kajjkka kajjkka4 = super.maJakka[i];
                        kajjkka4.aMaJAkk |= 0x4;
                    }
                }
                if (kajjkka.AMAJAkk.kaMAjAK == kajjkka2.AMAJAkk.kaMAjAK && kajjkka.AMAJAkk.KAMAjAK == kajjkka2.AMAJAkk.KAMAjAK && kajjkka.AMAJAkk.KaMAjAK == kajjkka2.AMAJAkk.KaMAjAK && kajjkka.aMAJAkk.kaMAjAK == kajjkka2.aMAJAkk.kaMAjAK && kajjkka.aMAJAkk.KAMAjAK == kajjkka2.aMAJAkk.KAMAjAK && kajjkka.aMAJAkk.KaMAjAK == kajjkka2.aMAJAkk.KaMAjAK) {
                    final kajjkka kajjkka5 = super.maJakka[i];
                    kajjkka5.aMaJAkk |= 0x2;
                }
                if (super.maJakka[i].aMaJAkk != 0) {
                    break;
                }
            }
        }
    }
    
    public void JaKkama(final mmjjmkk majAkka, final int n) {
        if (!super.MaJakka) {
            return;
        }
        super.MajAkka = majAkka;
        super.MAjAkka = kaaamma.AmAjaKK;
        this.jakkAma();
        if (super.maJAkka) {
            this.JakKaMA();
        }
        if (super.MAJAKKa != 0) {
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
        this.akKAmAJ(super.maJakka, super.maJakka.length);
    }
    
    public void akKAmAJ(final kajjkka[] array, final int n) {
        final kajjkka[] aMaJAKK = kaaamma.aMaJAKK;
        int amAjaKK = kaaamma.AmAjaKK;
        kajjkka kajjkka;
        for (int i = 0; i < n; kajjkka = array[i++], kajjkka.aMajakk = -(kajjkka.amAJAkk.KaMAjAK + kajjkka.AMAJAkk.KaMAjAK + kajjkka.aMAJAkk.KaMAjAK + this.AjakkAM), aMaJAKK[amAjaKK++] = kajjkka) {}
        kaaamma.AmAjaKK = amAjaKK;
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
                kajjkka.aMajakk = -(kajjkka.amAJAkk.KaMAjAK + kajjkka.AMAJAkk.KaMAjAK + kajjkka.aMAJAkk.KaMAjAK + this.AjakkAM);
                aMaJAKK[amAjaKK++] = kajjkka;
            }
            else {
                if ((n2 & 0x24924) != 0x0 || (n2 & 0x30000) == 0x0 || (majaKka + kajjkka.amAJAkk.MajaKka) * kajjkka.AmaJAKK + (majaKka2 + kajjkka.amAJAkk.majaKka) * kajjkka.amaJAKK + (mAjaKka + kajjkka.amAJAkk.MAjaKka) * kajjkka.AMaJAKK >= 0.0f) {
                    continue;
                }
                kajjkka.aMajakk = -(kajjkka.amAJAkk.KaMAjAK + kajjkka.AMAJAkk.KaMAjAK + kajjkka.aMAJAkk.KaMAjAK + this.AjakkAM);
                this.JaKKAma(kajjkka);
            }
        }
        kaaamma.AmAjaKK = amAjaKK;
    }
}
