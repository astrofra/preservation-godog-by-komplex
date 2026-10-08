import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.io.BufferedInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public class maaamma extends kmjjmma
{
    kmjamma amAjAKK;
    mmajkka AMAjAKK;
    mmajkka aMAjAKK;
    mmajkka AmajAKK;
    mmajkka amajAKK;
    kmaamma AMajAKK;
    int aMajAKK;
    int AmAJAKK;
    
    public String MaJAkkA() {
        return "movieintro";
    }
    
    public void MAjakkA() {
        this.amAjAKK = null;
        this.amajAKK = null;
        this.AmajAKK = null;
        this.AMAjAKK = null;
    }
    
    public void mAjakkA(final kmaamma aMajAKK) {
        this.AMajAKK = aMajAKK;
        this.aMAjAKK = new mmajkka(512, 256, 1, false);
        try {
            this.amAjAKK = new kmjamma(this.aMAjAKK, new BufferedInputStream(new GZIPInputStream(new BufferedInputStream(this.AMajAKK.aMajAKK("data/intro4.swz").openStream(), 8192)), 8192));
        }
        catch (final IOException ex) {}
        this.AMAjAKK = (mmajkka)kmaakma.MAjaKkA(this.AMajAKK.aMajAKK("images/introtausta3.jpg"));
        this.amajAKK = (mmajkka)kmaakma.MAjaKkA(this.AMajAKK.aMajAKK("images/myrkky.jpg"));
    }
    
    public void MajakkA(final mmajkka mmajkka, final float n, final float n2) {
        mmajkka.aMaJAkk();
        final int n3 = 0;
        final int max = Math.max((int)((n - 22.5) * 18.0), 0);
        if (max > 0) {
            mmajkka.amaJAkk(this.amajAKK, n3 % 512, -(max % (this.amajAKK.KamAJaK - 256)));
        }
        else {
            mmajkka.amaJAkk(this.AMAjAKK, n3, max);
        }
        this.amAjAKK.majakKa((int)(n * 10.0f) % this.amAjAKK.MajakKa());
        mmajkka.AMAJakk(this.aMAjAKK, 0, 0);
        mmajkka.aMajAkk();
    }
    
    public void majakkA(final String s, final float n) {
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
