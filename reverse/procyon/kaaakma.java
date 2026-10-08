import java.net.URL;

// 
// Decompiled by Procyon v0.6.0
// 

public class kaaakma extends mmaakkk
{
    float MAjakkA;
    
    public kaaakma(final kmaamma kmaamma, final URL url, final boolean b) {
        this.MAjakkA = 10000.0f;
        final boolean b2 = true;
        mmaakkk mmaakkk;
        if (b) {
            mmaakkk = maajkmk.kKAMAJA(kmaamma.aMajAKK("data/octa8.igu"));
        }
        else {
            mmaakkk = maajkmk.kKAMAJA(kmaamma.aMajAKK("data/half8.igu"));
        }
        super.MAJakka = mmaakkk.MAJakka;
        super.mAJakka = mmaakkk.mAJakka;
        super.maJakka = mmaakkk.maJakka;
        this.jAkkaMA(this.MAjakkA, this.MAjakkA, this.MAjakkA);
        this.JakKAma();
        this.jakkaMA();
        if (b2) {
            if (b) {
                final mmajkka mmajkka = (mmajkka)kmaakma.MAjaKkA(url);
                final mmajkka mmajkka2 = new mmajkka(256, 256, 1, false);
                mmajkka2.amaJAkk(mmajkka, 0, 0);
                final mmajkka mmajkka3 = new mmajkka(256, 256, 1, false);
                mmajkka3.amajAkk(mmajkka, 0, 0, 256, 0, 256, 256);
                this.jakkama(mmajkka2, mmajkka3);
            }
            else {
                final mmajkka mmajkka4 = (mmajkka)kmaakma.MAjaKkA(url);
                final mmajkka mmajkka5 = new mmajkka(256, 256, 1, false);
                mmajkka5.amaJAkk(mmajkka4, 0, 0);
                this.jakkama(mmajkka5, mmajkka5);
            }
            for (int i = 0; i < super.mAJakka.length; ++i) {
                super.mAJakka[i].jAKkaMA = 1.0f - super.mAJakka[i].jAKkaMA;
            }
        }
        else {
            this.JAkKaMA((mmajkka)kmaakma.MAjaKkA(kmaamma.aMajAKK("images/verax/test.jpg")));
            this.JAKKaMA();
        }
        super.MaJAkka = Float.POSITIVE_INFINITY;
    }
    
    public void JaKkama(final mmjjmkk mmjjmkk, final int n) {
        final float majaKka = super.Majakka.MajaKka;
        final float majaKka2 = super.Majakka.majaKka;
        final float mAjaKka = super.Majakka.MAjaKka;
        super.Majakka.MaJaKka(mmjjmkk.AMaJAkK);
        final float amAjakK = mmjjmkk.aMAjakK;
        mmjjmkk.aMAjakK = this.MAjakkA + 10.0f;
        super.JaKkama(mmjjmkk, n);
        mmjjmkk.aMAjakK = amAjakK;
        super.Majakka.MajaKka = majaKka;
        super.Majakka.majaKka = majaKka2;
        super.Majakka.MAjaKka = mAjaKka;
    }
}
