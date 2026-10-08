import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.io.BufferedInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public class MovieIntroScene extends Scene
{
    MovieSurfaceBridge amAjAKK;
    RgbSurface AMAjAKK;
    RgbSurface aMAjAKK;
    RgbSurface AmajAKK;
    RgbSurface amajAKK;
    kmaamma AMajAKK;
    int aMajAKK;
    int AmAJAKK;
    
    public String getSceneId() {
        return "movieintro";
    }
    
    public void dispose() {
        this.amAjAKK = null;
        this.amajAKK = null;
        this.AmajAKK = null;
        this.AMAjAKK = null;
    }
    
    public void load(final kmaamma aMajAKK) {
        this.AMajAKK = aMajAKK;
        this.aMAjAKK = new RgbSurface(512, 256, 1, false);
        try {
            this.amAjAKK = new MovieSurfaceBridge(this.aMAjAKK, new BufferedInputStream(new GZIPInputStream(new BufferedInputStream(this.AMajAKK.aMajAKK("data/intro4.swz").openStream(), 8192)), 8192));
        }
        catch (final IOException ex) {}
        this.AMAjAKK = (RgbSurface)ImageMathSupport.MAjaKkA(this.AMajAKK.aMajAKK("images/introtausta3.jpg"));
        this.amajAKK = (RgbSurface)ImageMathSupport.MAjaKkA(this.AMajAKK.aMajAKK("images/myrkky.jpg"));
    }
    
    public void render(final RgbSurface mmajkka, final float n, final float n2) {
        mmajkka.aMaJAkk();
        final int n3 = 0;
        final int max = Math.max((int)((n - 22.5) * 18.0), 0);
        if (max > 0) {
            mmajkka.amaJAkk(this.amajAKK, n3 % 512, -(max % (this.amajAKK.height - 256)));
        }
        else {
            mmajkka.amaJAkk(this.AMAjAKK, n3, max);
        }
        this.amAjAKK.majakKa((int)(n * 10.0f) % this.amAjAKK.MajakKa());
        mmajkka.AMAJakk(this.aMAjAKK, 0, 0);
        mmajkka.aMajAkk();
    }
    
    public void handleMessage(final String s, final float n) {
        if (s.equals("phase")) {
            this.aMajAKK = 50;
            this.AmAJAKK = 200;
        }
        if (s.equals("suh")) {
            this.aMajAKK = 50;
            this.AmAJAKK = 200;
        }
        if (s.equals("suh0")) {
            this.aMajAKK = 100;
            this.AmAJAKK = 150;
        }
        if (s.equals("suh1")) {
            this.aMajAKK = 128;
            this.AmAJAKK = 50;
        }
        if (s.equals("suh2")) {
            this.aMajAKK = 256;
            this.AmAJAKK = 70;
        }
    }
}
