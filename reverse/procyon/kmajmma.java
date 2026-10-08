// 
// Decompiled by Procyon v0.6.0
// 

public class kmajmma extends mmaakkk
{
    mmajkka MAjAKKA;
    maaakka mAjAKKA;
    public float MaJakKA;
    public float maJakKA;
    public float MAJakKA;
    public float mAJakKA;
    public float MajakKA;
    
    public kmajmma(final mmajkka mAjAKKA, final maaakka mAjAKKA2) {
        this.MaJakKA = 50.0f;
        this.MajakKA = 1.0f;
        super.MaJAkka = Float.POSITIVE_INFINITY;
        final int kamaJaK = mAjAKKA2.kAMAJaK;
        super.MAJakka = new majjmka[kamaJaK + 1];
        super.mAJakka = new kajjmmk[kamaJaK + 1];
        for (int i = 0; i < super.MAJakka.length; ++i) {
            super.MAJakka[i] = new majjmka();
        }
        for (int j = 0; j < super.mAJakka.length; ++j) {
            super.mAJakka[j] = new kajjmmk(0.99609375, 0.0);
        }
        super.mAJakka[kamaJaK].jAKkaMA = this.MAJakKA;
        super.mAJakka[kamaJaK].JakkaMA = 0.0f;
        super.maJakka = new kajjkka[kamaJaK];
        for (int k = 0; k < super.maJakka.length; ++k) {
            super.maJakka[k] = new kajjkka(this, kamaJaK, k % kamaJaK, (k + 1) % kamaJaK, kamaJaK, k % kamaJaK, (k + 1) % kamaJaK);
        }
        this.MAjAKKA = mAjAKKA;
        this.mAjAKKA = mAjAKKA2;
        this.mAJakKA = (float)mAjAKKA2.KamAJaK;
        this.JAkKaMA(mAjAKKA);
        this.JAKkAma(2048);
    }
    
    public void JaKkama(final mmjjmkk majAkka, final int n) {
        if (this.MaJakKA <= 0.0f) {
            return;
        }
        if (this.MAJakKA >= 1.0f) {
            return;
        }
        if (!super.MaJakka) {
            return;
        }
        super.MajAkka = majAkka;
        super.MAjAkka = kaaamma.AmAjaKK;
        this.jakkAma();
        this.JAKkaMA();
        this.JAKKAma(super.maJakka, super.maJakka.length);
    }
    
    public void JAKKAma(final kajjkka[] array, final int n) {
        final kajjkka[] aMaJAKK = kaaamma.aMaJAKK;
        int amAjaKK = kaaamma.AmAjaKK;
        for (final kajjkka kajjkka : array) {
            kajjkka.aMajakk = -(kajjkka.amAJAkk.KaMAjAK + kajjkka.AMAJAkk.KaMAjAK + kajjkka.aMAJAkk.KaMAjAK) - this.maJakKA;
            aMaJAKK[amAjaKK++] = kajjkka;
        }
        kaaamma.AmAjaKK = amAjaKK;
    }
    
    public void JAKkaMA() {
        final float mAjaKKa = super.mAjaKKa;
        final float maJAKKa = super.MaJAKKa;
        final float maJAKKa2 = super.maJAKKa;
        final float n = (float)super.maJaKKa;
        final float n2 = (float)super.MAJaKKa;
        final majjmka[] maJakka = super.MAJakka;
        final int kamaJaK = this.mAjAKKA.kAMAJaK;
        float n3 = 0.0f;
        final float n4 = 6.28f / kamaJaK;
        final float kaMAjAK = maJAKKa2;
        final float n5 = super.MaJaKKa / kaMAjAK;
        final float n6 = n5 * this.MajakKA;
        maJakka[kamaJaK].kaMAjAK = mAjaKKa * n5 + n;
        maJakka[kamaJaK].KAMAjAK = -maJAKKa * n5 + n2;
        super.mAJakka[kamaJaK].jAKkaMA = this.MAJakKA;
        final float n7 = super.mAJAKKa * this.mAJakKA;
        final int n8 = (int)n7 % this.mAjAKKA.KamAJaK;
        final int n9 = (n8 + 1) % this.mAjAKKA.KamAJaK;
        final float n10 = n7 - (float)Math.floor(n7);
        final float n11 = 1.0f - n10;
        final float n12 = n10;
        final float n13 = this.MaJakKA * 0.00390625f;
        final float n14 = n11 * n13;
        final float n15 = n12 * n13;
        final int n16 = n8 * this.mAjAKKA.kAMAJaK;
        final int n17 = n9 * this.mAjAKKA.kAMAJaK;
        final byte[] kamAJaK = this.mAjAKKA.kamAJaK;
        for (int i = 0; i < kamaJaK; ++i) {
            final majjmka majjmka = maJakka[i];
            final float n18 = (kamAJaK[n16 + i] & 0xFF) * n14 + (kamAJaK[n17 + i] & 0xFF) * n15;
            final float n19 = (float)(mAjaKKa + Math.cos(n3) * n18);
            final float n20 = (float)(maJAKKa + Math.sin(n3) * n18);
            majjmka.kaMAjAK = n19 * n5 + n;
            majjmka.KAMAjAK = -(n20 * n6) + n2;
            majjmka.KaMAjAK = kaMAjAK;
            n3 += n4;
        }
    }
}
