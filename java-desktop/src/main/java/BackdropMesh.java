import java.net.URL;

// 
// Decompiled by Procyon v0.6.0
// 

public class BackdropMesh extends MeshObject
{
    float MAjakkA;
    
    public BackdropMesh(final kmaamma kmaamma, final URL url, final boolean b) {
        this.MAjakkA = 10000.0f;
        final boolean b2 = true;
        MeshObject mmaakkk;
        if (b) {
            mmaakkk = IguMeshLoader.kKAMAJA(kmaamma.aMajAKK("data/octa8.igu"));
        }
        else {
            mmaakkk = IguMeshLoader.kKAMAJA(kmaamma.aMajAKK("data/half8.igu"));
        }
        super.MAJakka = mmaakkk.MAJakka;
        super.mAJakka = mmaakkk.mAJakka;
        super.maJakka = mmaakkk.maJakka;
        this.jAkkaMA(this.MAjakkA, this.MAjakkA, this.MAjakkA);
        this.JakKAma();
        this.jakkaMA();
        if (b2) {
            if (b) {
                final RgbSurface mmajkka = (RgbSurface)ImageMathSupport.MAjaKkA(url);
                final RgbSurface mmajkka2 = new RgbSurface(256, 256, 1, false);
                mmajkka2.amaJAkk(mmajkka, 0, 0);
                final RgbSurface mmajkka3 = new RgbSurface(256, 256, 1, false);
                mmajkka3.amajAkk(mmajkka, 0, 0, 256, 0, 256, 256);
                this.jakkama(mmajkka2, mmajkka3);
            }
            else {
                final RgbSurface mmajkka4 = (RgbSurface)ImageMathSupport.MAjaKkA(url);
                final RgbSurface mmajkka5 = new RgbSurface(256, 256, 1, false);
                mmajkka5.amaJAkk(mmajkka4, 0, 0);
                this.jakkama(mmajkka5, mmajkka5);
            }
            for (int i = 0; i < super.mAJakka.length; ++i) {
                super.mAJakka[i].u = 1.0f - super.mAJakka[i].u;
            }
        }
        else {
            this.JAkKaMA((RgbSurface)ImageMathSupport.MAjaKkA(kmaamma.aMajAKK("images/verax/test.jpg")));
            this.JAKKaMA();
        }
        super.MaJAkka = Float.POSITIVE_INFINITY;
    }
    
    public void JaKkama(final Camera mmjjmkk, final int n) {
        final float majaKka = super.Majakka.x;
        final float majaKka2 = super.Majakka.y;
        final float mAjaKka = super.Majakka.z;
        super.Majakka.MaJaKka(mmjjmkk.position);
        final float amAjakK = mmjjmkk.farClip;
        mmjjmkk.farClip = this.MAjakkA + 10.0f;
        super.JaKkama(mmjjmkk, n);
        mmjjmkk.farClip = amAjakK;
        super.Majakka.x = majaKka;
        super.Majakka.y = majaKka2;
        super.Majakka.z = mAjaKka;
    }
}
