// 
// Decompiled by Procyon v0.6.0
// 

public class VehjeScene extends Scene
{
    Camera mAJaKKA;
    SceneRenderer MajaKKA;
    RgbSurface majaKKA;
    MetaballMesh MAjaKKA;
    DesktopDemoBase mAjaKKA;
    
    public String getSceneId() {
        return "vehje";
    }
    
    public void dispose() {
        this.MajaKKA = null;
    }
    
    public void load(final DesktopDemoBase mAjaKKA) {
        this.mAjaKKA = mAjaKKA;
        this.mAJaKKA = new Camera();
        this.mAJaKKA.amaJAkK = 1.8f;
        this.mAJaKKA.viewportWidth = 512;
        this.mAJaKKA.viewportHeight = 256;
        this.mAJaKKA.farClip = 1500.0f;
        this.MajaKKA = new SceneRenderer();
        this.majaKKA = (RgbSurface)ImageMathSupport.MAjaKkA(this.mAjaKKA.aMajAKK("images/blobkaktus.jpg"));
        final RgbSurface mmajkka = (RgbSurface)ImageMathSupport.MAjaKkA(this.mAjaKKA.aMajAKK("images/blobenv.jpg"));
        (this.MAjaKKA = new MetaballMesh()).JAKkAma(33);
        this.MAjaKKA.JAkKaMA(mmajkka);
        this.MAjaKKA.Majakka.MAJAkKA(new Vec3f(0.0f, 0.0f, 0.0f));
        this.MAjaKKA.majakka.MAJAkKA(new Vec3f(1000.0f, 1000.0f, 1000.0f));
        this.MajaKKA.mAJAKkA(this.MAjaKKA);
        this.MajaKKA.MAjAKkA();
    }
    
    public void render(final RgbSurface mmajkka, final float n, float n2) {
        mmajkka.aMaJAkk();
        mmajkka.amaJAkk(this.majaKKA, 0, 0);
        this.MajaKKA.MAJAKkA(n * 1.9f, null);
        n2 *= 0.3f;
        this.MAjaKKA.mAjakka.kAmAJAK(3.0f * n2);
        this.MAjaKKA.mAjakka.KaMaJak(2.0f * n2);
        this.MAjaKKA.mAjakka.KAMAJAK(n2);
        this.mAJaKKA.rollRadians = 2.0f;
        this.mAJaKKA.position.mAJaKka(300.0f, n * 10.0f, 700.0f);
        this.mAJaKKA.lookAt(new Vec3f(0.01f, 300.01f, 0.01f));
        this.MajaKKA.mAjAKkA(this.mAJaKKA, godog.KKAMAjA);
        this.MajaKKA.MajAKkA(godog.KKAMAjA);
    }
    
    public void handleMessage(final String s, final float n) {
    }
}
