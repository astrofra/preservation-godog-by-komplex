// 
// Decompiled by Procyon v0.6.0
// 

public class PaaScene extends Scene
{
    Camera majAkKA;
    AseSceneLoader MAjAkKA;
    RadialFlareMesh mAjAkKA;
    RgbSurface MaJaKka;
    RgbSurface maJaKka;
    MetaballMesh MAJaKka;
    DesktopDemoBase mAJaKka;
    
    public String getSceneId() {
        return "paa";
    }
    
    public void load(final DesktopDemoBase maJaKka) {
        this.mAJaKka = maJaKka;
        this.majAkKA = new Camera();
        this.majAkKA.amaJAkK = 1.1f;
        this.majAkKA.viewportWidth = 512;
        this.majAkKA.viewportHeight = 256;
        this.majAkKA.farClip = 5000.0f;
        this.MaJaKka = (RgbSurface)ImageMathSupport.MAjaKkA(this.mAJaKka.aMajAKK("images/headsea.jpg"));
        this.maJaKka = (RgbSurface)ImageMathSupport.MAjaKkA(this.mAJaKka.aMajAKK("images/koira04.jpg"));
        final RgbSurface mmajkka = (RgbSurface)ImageMathSupport.MAjaKkA(this.mAJaKka.aMajAKK("images/paa_left.jpg"));
        final RgbSurface mmajkka2 = (RgbSurface)ImageMathSupport.MAjaKkA(this.mAJaKka.aMajAKK("images/paa_right.jpg"));
        (this.MAjAkKA = new AseSceneLoader()).AKKAmaj(this.mAJaKka.aMajAKK("data/knowledge.asz"), null);
        for (int i = 0; i < this.MAjAkKA.mAjAKkA.size(); ++i) {
            final MeshObject mmaakkk = (MeshObject)this.MAjAkKA.mAjAKkA.elementAt(i);
            if (i == 2) {
                mmaakkk.maJAkka = true;
            }
            mmaakkk.JakKAma();
            mmaakkk.majakka.mAjaKka(1.0);
            if (i == 0) {
                mmaakkk.JAkKaMA(mmajkka2);
            }
            if (i == 1) {
                mmaakkk.JAkKaMA(mmajkka);
            }
            if (i == 2) {
                mmaakkk.JAkKaMA(this.maJaKka);
                mmaakkk.MaJakka = false;
            }
        }
        this.mAjAkKA = new RadialFlareMesh((RgbSurface)ImageMathSupport.MAjaKkA(this.mAJaKka.aMajAKK("images/lc.jpg")), (IndexedSurface)ImageMathSupport.MAjaKkA(this.mAJaKka.aMajAKK("images/kasvu.gif")));
        this.mAjAkKA.maJakKA = -130.0f;
        final RadialFlareMesh mAjAkKA = this.mAjAkKA;
        mAjAkKA.mAJakKA *= 0.7f;
        this.mAjAkKA.MajakKA = 1.0f;
        this.MAjAkKA.mAJAKkA(this.mAjAkKA);
    }
    
    public void enter() {
        System.out.println("know start");
        (this.MAJaKka = new MetaballMesh()).JAKkAma(33);
        this.MAJaKka.JAkKaMA(this.maJaKka);
        this.MAJaKka.majakka.MAJAkKA(new Vec3f(1000.0f, 1000.0f, 1000.0f));
        this.MAjAkKA.mAJAKkA(this.MAJaKka);
        this.MAjAkKA.MAjAKkA();
    }
    
    public void dispose() {
        this.MAjAkKA = null;
        this.maJaKka = null;
        this.MaJaKka = null;
        this.MAJaKka = null;
    }
    
    public void render(final RgbSurface mmajkka, float n, final float n2) {
        n *= 1.08f;
        mmajkka.amaJAkk(this.MaJaKka, -((int)(n * 18.0f) % (this.MaJaKka.width - 512)), 0);
        this.majAkKA.rollRadians = 2.0f * (float)Math.sin(-0.02 * (double)Math.max(n - 16.0f, 0.0f));
        this.MAjAkKA.MAJAKkA(n, this.majAkKA);
        final MeshObject mmaakkk = (MeshObject)this.MAjAkKA.mAjAKkA.elementAt(3);
        this.mAjAkKA.mAJAKKa = n;
        this.mAjAkKA.Majakka.MAJAkKA(mmaakkk.Majakka);
        this.mAjAkKA.MaJakKA = Math.min((n - 18.25f) * 17.0f, 120.0f) * 14.0f;
        this.mAjAkKA.MAJakKA = 0.11f;
        this.MAJaKka.MaJakka = (n > 9.5f);
        this.MAJaKka.mAJAKKa = n;
        this.MAjAkKA.mAjAKkA(this.majAkKA, GodogDemo.KKAMAjA);
        this.MAjAkKA.MajAKkA(GodogDemo.KKAMAjA);
    }
    
    public void handleMessage(final String s, final float n) {
    }
    
    public static RgbSurface jAkKAMA(final IndexedSurface maaakka, final float n, final float n2, final float n3) {
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
