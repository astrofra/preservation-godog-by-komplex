// 
// Decompiled by Procyon v0.6.0
// 

public class EvilScene extends Scene
{
    Camera AmAJakk;
    AseSceneLoader amAJakk;
    DesktopDemoBase AMAJakk;
    
    public String getSceneId() {
        return "evil";
    }
    
    public void dispose() {
        this.amAJakk = null;
    }
    
    public void load(final DesktopDemoBase amaJakk) {
        this.AMAJakk = amaJakk;
        this.AmAJakk = new Camera();
        this.AmAJakk.amaJAkK = 1.4f;
        this.AmAJakk.viewportWidth = 512;
        this.AmAJakk.viewportHeight = 256;
        this.AmAJakk.farClip = 8000.0f;
        final IndexedSurface maaakka = (IndexedSurface)ImageMathSupport.MAjaKkA(this.AMAJakk.aMajAKK("images/paameri.gif"));
        final IndexedSurface maaakka2 = (IndexedSurface)ImageMathSupport.MAjaKkA(this.AMAJakk.aMajAKK("images/envmeri.gif"));
        final RgbSurface amAjAKk = AmAjAKk(maaakka2, 0, 0, 0, 1.0);
        final RgbSurface amAjAKk2 = AmAjAKk(maaakka, 0, 0, 0, 1.0);
        final RgbSurface amAjAKk3 = AmAjAKk(maaakka2, 0, 0, 0, 0.4);
        AmAjAKk(maaakka, 0, 0, 0, 0.4);
        (this.amAJakk = new AseSceneLoader()).AKKAmaj(this.AMAJakk.aMajAKK("data/meri2.asz"), null);
        for (int i = 0; i < this.amAJakk.mAjAKkA.size(); ++i) {
            final MeshObject mmaakkk = (MeshObject)this.amAJakk.mAjAKkA.elementAt(i);
            mmaakkk.MaJakka = true;
            mmaakkk.MAJAkka = true;
            if (i == 0) {
                mmaakkk.jAKKAma(amAjAKk2, maaakka);
                mmaakkk.JAKkAma(19);
            }
            else {
                mmaakkk.majAKKa = new Mat3f().kaMAJAK(-1.5707964f);
                mmaakkk.maJAkka = true;
                mmaakkk.jAKKAma(amAjAKk, maaakka2);
                mmaakkk.JAKkAma(3);
            }
            mmaakkk.JakKAma();
            mmaakkk.majakka.mAjaKka(1.0);
            if (i != 0) {
                mmaakkk.JaKKaMA(true);
                mmaakkk.majAkka.JAKkAma(51);
                mmaakkk.majAkka.jAKKAma(amAjAKk3, maaakka2);
            }
        }
        final BackdropMesh kaaakma = new BackdropMesh(this.AMAJakk, this.AMAJakk.aMajAKK("images/taivmeri.jpg"), true);
        kaaakma.Majakka.mAJaKka(0.0f, 0.0f, 0.0f);
        this.amAJakk.mAJAKkA(kaaakma);
        this.amAJakk.mAJAKkA(aMaJakk(this.AmAJakk, this.AMAJakk));
        this.AmAJakk.fogStart = 100.0f;
        this.amAJakk.MAjAKkA();
    }
    
    public void render(final RgbSurface mmajkka, float n, final float n2) {
        n *= 2.1f;
        mmajkka.aMaJAkk();
        this.AmAJakk.rollRadians = (float)(-0.4 - Math.sin(-0.006 * (double)Math.max(n - 0.0f, 0.0f)));
        this.amAJakk.MAJAKkA(n, this.AmAJakk);
        this.amAJakk.mAjAKkA(this.AmAJakk, godog.KKAMAjA);
        this.amAJakk.MajAKkA(godog.KKAMAjA);
        mmajkka.aMajAkk();
    }
    
    public void handleMessage(final String s, final float n) {
    }
    
    public static RgbSurface AmAjAKk(final IndexedSurface maaakka, final int n, final int n2, final int n3, final double n4) {
        final RgbSurface mmajkka = new RgbSurface(256, 256, 1, false);
        for (int i = 0; i < 256; ++i) {
            for (int j = 0; j < 256; ++j) {
                final double n5 = (1.0 - i / 255.0) * n4;
                mmajkka.AMAjakk[i * 256 + j] = ((int)Math.min(255.0, (maaakka.kaMajaK[j] & 0xFF) * n5 + (1.0 - n5) * n) << 20 | (int)Math.min(255.0, (maaakka.KAMajaK[j] & 0xFF) * n5 + (1.0 - n5) * n2) << 10 | (int)Math.min(255.0, (maaakka.kAMajaK[j] & 0xFF) * n5 + (1.0 - n5) * n3));
            }
        }
        return mmajkka;
    }
    
    public static HeightFieldMesh aMaJakk(final Camera mmjjmkk, final DesktopDemoBase kmaamma) {
        mmjjmkk.position.mAJaKka(0.0f, -14.0f, 0.0f);
        final HeightFieldMesh kmjammk = new HeightFieldMesh(null, 500.0f, 0.0f, mmjjmkk, true);
        final IndexedSurface maaakka = (IndexedSurface)ImageMathSupport.MAjaKkA(kmaamma.aMajAKK("images/vesi_meri.gif"));
        kmjammk.JAKKaMa = maaakka;
        kmjammk.jAKKaMa = maaakka;
        kmjammk.AjakKaM = 0.23f;
        kmjammk.ajakKaM = 0.23f;
        kmjammk.jaKKaMa = AmAjAKk(maaakka, 0, 0, 0, 1.0);
        return kmjammk;
    }
}
