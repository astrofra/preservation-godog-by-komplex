/*
 * Decompiled with CFR 0.152.
 */
import java.net.URL;

public class kaaakma
extends mmaakkk {
    float MAjakkA = 10000.0f;

    public kaaakma(kmaamma kmaamma2, URL uRL, boolean bl) {
        super();
        boolean bl2 = true;
        mmaakkk mmaakkk2 = bl ? maajkmk.kKAMAJA(kmaamma2.aMajAKK("data/octa8.igu")) : maajkmk.kKAMAJA(kmaamma2.aMajAKK("data/half8.igu"));
        this.MAJakka = mmaakkk2.MAJakka;
        this.mAJakka = mmaakkk2.mAJakka;
        this.maJakka = mmaakkk2.maJakka;
        this.jAkkaMA(this.MAjakkA, this.MAjakkA, this.MAjakkA);
        this.JakKAma();
        this.jakkaMA();
        if (bl2) {
            mmajkka mmajkka2;
            mmajkka mmajkka3;
            if (bl) {
                mmajkka3 = (mmajkka)kmaakma.MAjaKkA(uRL);
                mmajkka2 = new mmajkka(256, 256, 1, false);
                mmajkka2.amaJAkk(mmajkka3, 0, 0);
                mmajkka mmajkka4 = new mmajkka(256, 256, 1, false);
                mmajkka4.amajAkk(mmajkka3, 0, 0, 256, 0, 256, 256);
                this.jakkama(mmajkka2, mmajkka4);
            } else {
                mmajkka3 = (mmajkka)kmaakma.MAjaKkA(uRL);
                mmajkka2 = new mmajkka(256, 256, 1, false);
                mmajkka2.amaJAkk(mmajkka3, 0, 0);
                this.jakkama(mmajkka2, mmajkka2);
            }
            int n = 0;
            while (n < this.mAJakka.length) {
                this.mAJakka[n].jAKkaMA = 1.0f - this.mAJakka[n].jAKkaMA;
                ++n;
            }
        } else {
            mmajkka mmajkka5 = (mmajkka)kmaakma.MAjaKkA(kmaamma2.aMajAKK("images/verax/test.jpg"));
            this.JAkKaMA(mmajkka5);
            this.JAKKaMA();
        }
        this.MaJAkka = Float.POSITIVE_INFINITY;
    }

    public void JaKkama(mmjjmkk mmjjmkk2, int n) {
        float f = this.Majakka.MajaKka;
        float f2 = this.Majakka.majaKka;
        float f3 = this.Majakka.MAjaKka;
        this.Majakka.MaJaKka(mmjjmkk2.AMaJAkK);
        float f4 = mmjjmkk2.aMAjakK;
        mmjjmkk2.aMAjakK = this.MAjakkA + 10.0f;
        super.JaKkama(mmjjmkk2, n);
        mmjjmkk2.aMAjakK = f4;
        this.Majakka.MajaKka = f;
        this.Majakka.majaKka = f2;
        this.Majakka.MAjaKka = f3;
    }
}

