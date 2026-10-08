// 
// Decompiled by Procyon v0.6.0
// 

public class LinjanenScene extends Scene
{
    Camera akKAMaJ;
    SceneRenderer AKKAMaJ;
    RadialFlareMesh aKKAMaJ;
    WireframeMesh AkkAMaJ;
    RgbSurface akkAMaJ;
    DesktopDemoBase AKkAMaJ;
    ParticleCloudMesh aKkAMaJ;
    boolean AkKamaJ;
    float akKamaJ;
    
    public String getSceneId() {
        return "linjanen";
    }
    
    public void dispose() {
        this.AKKAMaJ = null;
    }
    
    public void load(final DesktopDemoBase aKkAMaJ) {
        this.AKkAMaJ = aKkAMaJ;
        this.akKAMaJ = new Camera();
        this.akKAMaJ.amaJAkK = 1.2f;
        this.akKAMaJ.viewportWidth = 512;
        this.akKAMaJ.viewportHeight = 256;
        this.akKAMaJ.farClip = 9000.0f;
        final AseSceneLoader kmjjkkk = new AseSceneLoader();
        kmjjkkk.AKKAmaj(this.AKkAMaJ.aMajAKK("data/sur3.asz"), null);
        final MeshObject mmaakkk = (MeshObject)kmjjkkk.mAjAKkA.elementAt(0);
        mmaakkk.majakka.mAjaKka(1.0);
        mmaakkk.maJAkka = true;
        mmaakkk.JakKAma();
        this.AkkAMaJ = new WireframeMesh((MeshObject)kmjjkkk.mAjAKkA.elementAt(0));
        this.AkkAMaJ.MAJAKKa = 0;
        this.AkkAMaJ.maJAkka = false;
        this.AkkAMaJ.MaJakka = true;
        this.AkkAMaJ.JAKkAma(4096);
        this.AkkAMaJ.AkKAmAJ();
        this.AkkAMaJ.aJAkkAM = true;
        this.AkkAMaJ.majakka.mAJAKKA(0.07f);
        this.akkAMaJ = (RgbSurface)ImageMathSupport.MAjaKkA(this.AKkAMaJ.aMajAKK("images/surtausta.jpg"));
        godog.KKAMAjA.kAmAJAk.kamaJAk(true);
        godog.KKAMAjA.kAmAJAk.KAmAjak(-0.23f);
        (this.AKKAMaJ = new SceneRenderer()).mAJAKkA(this.AkkAMaJ);
        final RgbSurface mmajkka = (RgbSurface)ImageMathSupport.MAjaKkA(this.AKkAMaJ.aMajAKK("images/flare.jpg"));
        this.aKkAMaJ = new ParticleCloudMesh(230, 500.0f);
        this.aKkAMaJ.aKkamaJ = 50.0f;
        this.aKkAMaJ.KkaMAJA(0);
        this.aKkAMaJ.Majakka.MAJAkKA(new Vec3f(0.0f, 0.0f, 0.0f));
        this.aKkAMaJ.JAkKaMA(mmajkka);
        this.AKKAMaJ.mAJAKkA(this.aKkAMaJ);
        this.aKKAMaJ = new RadialFlareMesh((RgbSurface)ImageMathSupport.MAjaKkA(this.AKkAMaJ.aMajAKK("images/lc.jpg")), (IndexedSurface)ImageMathSupport.MAjaKkA(this.AKkAMaJ.aMajAKK("images/kasvu.gif")));
        this.aKKAMaJ.maJakKA = -130.0f;
        this.aKKAMaJ.MAJakKA = 0.0f;
        final RadialFlareMesh akkaMaJ = this.aKKAMaJ;
        akkaMaJ.mAJakKA *= 0.3f;
        this.aKKAMaJ.MajakKA = 1.0f;
        this.aKKAMaJ.MaJakKA = 100.0f;
        this.AKKAMaJ.mAJAKkA(this.aKKAMaJ);
        this.AKKAMaJ.MAjAKkA();
    }
    
    public void render(final RgbSurface mmajkka, final float majakKa, final float n) {
        if (this.AkKamaJ) {
            this.akKamaJ = majakKa;
            this.AkKamaJ = false;
        }
        mmajkka.aMaJAkk();
        final int n2 = (int)(majakKa * 30.0f) % this.akkAMaJ.height;
        mmajkka.amaJAkk(this.akkAMaJ, 0, n2 - this.akkAMaJ.height);
        mmajkka.amaJAkk(this.akkAMaJ, 0, n2);
        final float n3 = majakKa - this.akKamaJ;
        final int n4 = (int)Math.max(30.0f, 1.0f / (1.0f + n3 * n3 * 4.0f) * 80.0f);
        godog.KKAMAjA.kAmAJAk.KAmaJAk(n4 << 20 | n4 << 10 | n4);
        this.AkkAMaJ.mAJAKKa = majakKa;
        this.AkkAMaJ.mAjakka.KamajAK();
        this.AkkAMaJ.mAjakka.kAmAJAK(majakKa * 0.2f);
        this.AkkAMaJ.Majakka.mAJaKka(0.0f, 0.0f, 0.0f);
        this.aKkAMaJ.mAjakka.KamajAK();
        this.aKkAMaJ.mAjakka.kAmAJAK(majakKa * 0.06f);
        this.aKkAMaJ.Majakka.mAJaKka(0.0f, 0.0f, 20.0f - majakKa);
        this.aKKAMaJ.Majakka.mAJaKka(0.0f, 0.0f, 35.0f - majakKa * 2.0f);
        this.aKKAMaJ.mAJAKKa = majakKa;
        this.akKAMaJ.position.mAJaKka(0.0f, 32.0f, 0.0f);
        this.akKAMaJ.lookAt(new Vec3f(0.0f, 0.001f, 0.0f));
        this.AKKAMaJ.mAjAKkA(this.akKAMaJ, godog.KKAMAjA);
        this.AKKAMaJ.MajAKkA(godog.KKAMAjA);
        mmajkka.aMajAkk();
    }
    
    public void handleMessage(final String s, final float n) {
        if (s.equals("flash")) {
            this.AkKamaJ = true;
        }
        if (this.AkkAMaJ == null) {
            return;
        }
        if (s.equals("spc0")) {
            this.AkkAMaJ.MAJAKKa = 0;
        }
        if (s.equals("spc1")) {
            this.AkkAMaJ.MAJAKKa = 1;
        }
        if (s.equals("spc2")) {
            this.AkkAMaJ.MAJAKKa = 3;
        }
        if (s.equals("spc3")) {
            this.AkkAMaJ.MAJAKKa = 4;
        }
    }
    
    public LinjanenScene() {
        this.AkKamaJ = false;
    }
}
