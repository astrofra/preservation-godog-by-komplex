import java.awt.image.ImageObserver;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

// 
// Decompiled by Procyon v0.6.0
// 

public final class RgbSurfacePresenter extends SurfacePresenter
{
    public RgbSurface kamAJAk;
    public TexturedTriangleRasterizer KAmAJAk;
    public LineRasterizer kAmAJAk;
    Image KaMajAk;
    Graphics kaMajAk;
    int KAMajAk;
    
    public void AkKaMaJ(final DesktopDemoBase kmaamma) {
        this.kamAJAk = new RgbSurface(super.jAkkamA, super.JaKKamA, 2, true);
        this.KAmAJAk = new TexturedTriangleRasterizer(this.kamAJAk);
        this.kAmAJAk = new LineRasterizer(this.kamAJAk, super.jAkkamA, super.JaKKamA);
        if (super.jakKamA && SurfacePresenter.JAkKamA) {
            this.KaMajAk = kmaamma.createImage(super.jAkkamA, super.JaKKamA);
            this.kaMajAk = this.KaMajAk.getGraphics();
        }
    }
    
    public void AKkaMaJ(final Triangle kajjkka) {
        if (kajjkka.amAJAKK == 1024) {
            final float kamAjAK = kajjkka.amAJAkk.KamAjAK;
            this.kamAJAk.AMAJAkk(kajjkka.aMAJAKK, (float)(int)(kajjkka.amAJAkk.kaMAjAK / 65536.0f - kamAjAK * 0.5f), (float)(int)(kajjkka.amAJAkk.KAMAjAK / 65536.0f - kamAjAK * 0.5f), kamAjAK, kamAjAK);
            return;
        }
        if (kajjkka.amAJAKK == 4096) {
            this.kAmAJAk.KaMaJAk(kajjkka);
            return;
        }
        this.KAmAJAk.amAjAKK(kajjkka);
    }
    
    public void AKKaMaJ(final Graphics graphics, final int n, final int n2) {
        this.kamAJAk.publishFrame();
        this.kamAJAk.drawImage(graphics, n, n2);
    }
    
    public void aKkaMaJ(final Graphics graphics, final int n, final int n2) {
        if (SurfacePresenter.JAkKamA) {
            this.kamAJAk.publishFrame();
            this.kamAJAk.drawImage(this.kaMajAk, 0, 0);
            graphics.drawImage(this.KaMajAk, n, n2, super.jaKKamA, super.JAKKamA, Color.black, null);
            return;
        }
        this.kamAJAk.publishFrame();
        this.kamAJAk.drawScaledImage(graphics, n, n2, super.jaKKamA, super.JAKKamA);
    }
    
    public void KaMAJAk(final int kaMajAk) {
        this.KAMajAk = kaMajAk;
    }
    
    public void akKaMaJ() {
        this.kAmaJAk(this.KAMajAk);
    }
    
    public void kAmaJAk(int amAJakk) {
        amAJakk = RgbSurface.AmAJakk(amAJakk);
        final int[] amAjakk = this.kamAJAk.AMAjakk;
        for (int length = amAjakk.length, i = 0; i < length; amAjakk[i++] = amAJakk) {}
    }
}
