// 
// Decompiled by Procyon v0.6.0
// 

public class RadialFlareMesh extends MeshObject
{
    RgbSurface MAjAKKA;
    IndexedSurface mAjAKKA;
    public float MaJakKA;
    public float maJakKA;
    public float MAJakKA;
    public float mAJakKA;
    public float MajakKA;
    
    public RadialFlareMesh(final RgbSurface mAjAKKA, final IndexedSurface mAjAKKA2) {
        this.MaJakKA = 50.0f;
        this.MajakKA = 1.0f;
        super.MaJAkka = Float.POSITIVE_INFINITY;
        final int kamaJaK = mAjAKKA2.width;
        super.MAJakka = new Vertex[kamaJaK + 1];
        super.mAJakka = new UvCoord[kamaJaK + 1];
        for (int i = 0; i < super.MAJakka.length; ++i) {
            super.MAJakka[i] = new Vertex();
        }
        for (int j = 0; j < super.mAJakka.length; ++j) {
            super.mAJakka[j] = new UvCoord(0.99609375, 0.0);
        }
        super.mAJakka[kamaJaK].u = this.MAJakKA;
        super.mAJakka[kamaJaK].v = 0.0f;
        super.maJakka = new Triangle[kamaJaK];
        for (int k = 0; k < super.maJakka.length; ++k) {
            super.maJakka[k] = new Triangle(this, kamaJaK, k % kamaJaK, (k + 1) % kamaJaK, kamaJaK, k % kamaJaK, (k + 1) % kamaJaK);
        }
        this.MAjAKKA = mAjAKKA;
        this.mAjAKKA = mAjAKKA2;
        this.mAJakKA = (float)mAjAKKA2.height;
        this.JAkKaMA(mAjAKKA);
        this.JAKkAma(2048);
    }
    
    public void JaKkama(final Camera majAkka, final int n) {
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
        super.MAjAkka = RenderPrimitive.AmAjaKK;
        this.jakkAma();
        this.JAKkaMA();
        this.JAKKAma(super.maJakka, super.maJakka.length);
    }
    
    public void JAKKAma(final Triangle[] array, final int n) {
        final Triangle[] aMaJAKK = RenderPrimitive.aMaJAKK;
        int amAjaKK = RenderPrimitive.AmAjaKK;
        for (int vertexIndex = 0; vertexIndex < n; vertexIndex++) {
            final Triangle kajjkka = array[vertexIndex];
            kajjkka.sortKey = -(kajjkka.amAJAkk.KaMAjAK + kajjkka.AMAJAkk.KaMAjAK + kajjkka.aMAJAkk.KaMAjAK) - this.maJakKA;
            aMaJAKK[amAjaKK++] = kajjkka;
        }
        RenderPrimitive.AmAjaKK = amAjaKK;
    }
    
    public void JAKkaMA() {
        final float mAjaKKa = super.mAjaKKa;
        final float maJAKKa = super.MaJAKKa;
        final float maJAKKa2 = super.maJAKKa;
        final float n = (float)super.maJaKKa;
        final float n2 = (float)super.MAJaKKa;
        final Vertex[] maJakka = super.MAJakka;
        final int kamaJaK = this.mAjAKKA.width;
        float n3 = 0.0f;
        final float n4 = 6.28f / kamaJaK;
        final float kaMAjAK = maJAKKa2;
        final float n5 = super.MaJaKKa / kaMAjAK;
        final float n6 = n5 * this.MajakKA;
        maJakka[kamaJaK].kaMAjAK = mAjaKKa * n5 + n;
        maJakka[kamaJaK].KAMAjAK = -maJAKKa * n5 + n2;
        super.mAJakka[kamaJaK].u = this.MAJakKA;
        final float n7 = super.mAJAKKa * this.mAJakKA;
        final int n8 = (int)n7 % this.mAjAKKA.height;
        final int n9 = (n8 + 1) % this.mAjAKKA.height;
        final float n10 = n7 - (float)Math.floor(n7);
        final float n11 = 1.0f - n10;
        final float n12 = n10;
        final float n13 = this.MaJakKA * 0.00390625f;
        final float n14 = n11 * n13;
        final float n15 = n12 * n13;
        final int n16 = n8 * this.mAjAKKA.width;
        final int n17 = n9 * this.mAjAKKA.width;
        final byte[] kamAJaK = this.mAjAKKA.kamAJaK;
        for (int i = 0; i < kamaJaK; ++i) {
            final Vertex majjmka = maJakka[i];
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
