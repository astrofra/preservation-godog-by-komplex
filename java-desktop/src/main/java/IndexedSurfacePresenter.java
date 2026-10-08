import java.awt.image.ImageObserver;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

// 
// Decompiled by Procyon v0.6.0
// 

public class IndexedSurfacePresenter extends SurfacePresenter
{
    public IndexedSurface KkaMaJa;
    public IndexedTriangleSink kkaMaJa;
    Image KKaMaJa;
    Graphics kKaMaJa;
    int AkKaMaJ;
    
    public void aKkaMaJ(final Graphics graphics, final int n, final int n2) {
        if (SurfacePresenter.JAkKamA) {
            this.KkaMaJa.publishFrame();
            this.KkaMaJa.drawImage(this.kKaMaJa, 0, 0);
            graphics.drawImage(this.KKaMaJa, n, n2, super.jaKKamA, super.JAKKamA, Color.green, null);
            return;
        }
        this.KkaMaJa.publishFrame();
        this.KkaMaJa.drawScaledImage(graphics, n, n2, super.jaKKamA, super.JAKKamA);
    }
    
    public IndexedSurfacePresenter() {
        this.AkKaMaJ = 0;
    }
    
    public void AKKaMaJ(final Graphics graphics, final int n, final int n2) {
        this.KkaMaJa.publishFrame();
        this.KkaMaJa.drawImage(graphics, n, n2);
    }
    
    public void akKaMaJ() {
        for (int i = 0; i < this.KkaMaJa.kamAJaK.length; ++i) {
            this.KkaMaJa.kamAJaK[i] = 10;
        }
        ++this.AkKaMaJ;
    }
    
    public void AkKaMaJ(final DesktopDemoBase kmaamma) {
        this.KkaMaJa = new IndexedSurface(super.jAkkamA, super.JaKKamA, 2, true);
        this.kkaMaJa = new IndexedTriangleSink(this.KkaMaJa);
        if (super.jakKamA && SurfacePresenter.JAkKamA) {
            this.KKaMaJa = kmaamma.createImage(super.jAkkamA, super.JaKKamA);
            this.kKaMaJa = this.KKaMaJa.getGraphics();
        }
    }
    
    public void AKkaMaJ(final Triangle kajjkka) {
        this.kkaMaJa.kKamaJa(kajjkka);
    }
}
