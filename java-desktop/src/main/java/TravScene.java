// 
// Decompiled by Procyon v0.6.0
// 

public class TravScene extends Scene
{
    Camera MaJaKkA;
    AseSceneLoader maJaKkA;
    RadialFlareMesh MAJaKkA;
    RgbSurface mAJaKkA;
    RgbSurface MajaKkA;
    RgbSurface majaKkA;
    kmaamma MAjaKkA;
    
    public String getSceneId() {
        return "trav";
    }
    
    public void dispose() {
        this.maJaKkA = null;
        this.majaKkA.AMAjakk = null;
        this.majaKkA = null;
        this.MajaKkA = null;
        this.MAJaKkA = null;
        this.mAJaKkA = null;
    }
    
    public void load(final kmaamma mAjaKkA) {
        this.MAjaKkA = mAjaKkA;
        this.MaJaKkA = new Camera();
        this.MaJaKkA.amaJAkK = 1.4f;
        this.MaJaKkA.viewportWidth = 512;
        this.MaJaKkA.viewportHeight = 256;
        this.MaJaKkA.fogStart = 7.0f;
        this.MaJaKkA.farClip = 18.0f;
        this.MajaKkA = (RgbSurface)ImageMathSupport.MAjaKkA(this.MAjaKkA.aMajAKK("images/lasitausta.jpg"));
        final IndexedSurface maaakka = (IndexedSurface)ImageMathSupport.MAjaKkA(this.MAjaKkA.aMajAKK("images/envplane.gif"));
        final RgbSurface maJaKkA = MaJaKkA(maaakka, 0.0f, 0.0f, 0.0f);
        (this.maJaKkA = new AseSceneLoader()).AKKAmaj(this.MAjaKkA.aMajAKK("data/hakkyra4.asz"), null);
        for (int i = 0; i < this.maJaKkA.mAjAKkA.size(); ++i) {
            final MeshObject mmaakkk = (MeshObject)this.maJaKkA.mAjAKkA.elementAt(i);
            mmaakkk.MaJakka = true;
            mmaakkk.maJAkka = true;
            mmaakkk.MAJAkka = true;
            mmaakkk.jAKKAma(maJaKkA, maaakka);
            mmaakkk.JAKkAma(19);
            mmaakkk.JakKAma();
            mmaakkk.majakka.mAjaKka(1.0);
        }
        this.MAJaKkA = new RadialFlareMesh((RgbSurface)ImageMathSupport.MAjaKkA(this.MAjaKkA.aMajAKK("images/lc2.jpg")), (IndexedSurface)ImageMathSupport.MAjaKkA(this.MAjaKkA.aMajAKK("images/kasvu.gif")));
        this.MAJaKkA.maJakKA = -130.0f;
        this.MAJaKkA.MaJakKA = 30.0f;
        this.MAJaKkA.MAJakKA = 0.08f;
        final RadialFlareMesh maJaKkA2 = this.MAJaKkA;
        maJaKkA2.mAJakKA *= 0.7f;
        this.MAJaKkA.MajakKA = 0.25f;
        this.maJaKkA.mAJAKkA(this.MAJaKkA);
        this.maJaKkA.MAjAKkA();
    }
    
    public void render(final RgbSurface mmajkka, final float majakKa, final float n) {
        mmajkka.aMaJAkk();
        final int n2 = (int)(majakKa * 20.0f) % this.MajaKkA.width;
        mmajkka.amaJAkk(this.MajaKkA, -n2, 0);
        mmajkka.amaJAkk(this.MajaKkA, -n2 + this.MajaKkA.width, 0);
        this.maJaKkA.MAJAKkA(majakKa, this.MaJaKkA);
        final MeshObject mmaakkk = (MeshObject)this.maJaKkA.mAjAKkA.elementAt(0);
        this.MAJaKkA.mAJAKKa = majakKa;
        this.MAJaKkA.Majakka.MAJAkKA(mmaakkk.Majakka);
        this.MAJaKkA.MaJakKA = 30.0f;
        final float n3 = (float)Math.max(0.0, Math.sin((double)majakKa * 0.3));
        this.MAJaKkA.MAJakKA = (float)(0.8100000023841858 - 0.8 * n3 * n3);
        this.maJaKkA.mAjAKkA(this.MaJaKkA, godog.KKAMAjA);
        this.maJaKkA.MajAKkA(godog.KKAMAjA);
        mmajkka.aMajAkk();
    }
    
    public void handleMessage(final String s, final float n) {
    }
    
    public static RgbSurface MaJaKkA(final IndexedSurface maaakka, final float n, final float n2, final float n3) {
        final RgbSurface mmajkka = new RgbSurface(256, 256, 1, false);
        for (int i = 0; i < 256; ++i) {
            for (int j = 0; j < 256; ++j) {
                final double n4 = 1.0 - i / 255.0;
                mmajkka.AMAjakk[i * 256 + j] = ((int)Math.min(255.0, (maaakka.kaMajaK[j] & 0xFF) * n4 + (1.0 - n4) * n) << 20 | (int)Math.min(255.0, (maaakka.KAMajaK[j] & 0xFF) * n4 + (1.0 - n4) * n2) << 10 | (int)Math.min(255.0, (maaakka.kAMajaK[j] & 0xFF) * n4 + (1.0 - n4) * n3));
            }
        }
        return mmajkka;
    }
}
