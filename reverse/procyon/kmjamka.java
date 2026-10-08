import java.awt.image.ImageObserver;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kmjamka extends kmjjmmk
{
    public mmajkka kamAJAk;
    public mmaamma KAmAJAk;
    public mmjamka kAmAJAk;
    Image KaMajAk;
    Graphics kaMajAk;
    int KAMajAk;
    
    public void AkKaMaJ(final kmaamma kmaamma) {
        this.kamAJAk = new mmajkka(super.jAkkamA, super.JaKKamA, 2, true);
        this.KAmAJAk = new mmaamma(this.kamAJAk);
        this.kAmAJAk = new mmjamka(this.kamAJAk, super.jAkkamA, super.JaKKamA);
        if (super.jakKamA && kmjjmmk.JAkKamA) {
            this.KaMajAk = kmaamma.createImage(super.jAkkamA, super.JaKKamA);
            this.kaMajAk = this.KaMajAk.getGraphics();
        }
    }
    
    public void AKkaMaJ(final kajjkka kajjkka) {
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
        this.kamAJAk.KAmaJaK();
        this.kamAJAk.kaMAJaK(graphics, n, n2);
    }
    
    public void aKkaMaJ(final Graphics graphics, final int n, final int n2) {
        if (kmjjmmk.JAkKamA) {
            this.kamAJAk.KAmaJaK();
            this.kamAJAk.kaMAJaK(this.kaMajAk, 0, 0);
            graphics.drawImage(this.KaMajAk, n, n2, super.jaKKamA, super.JAKKamA, Color.black, null);
            return;
        }
        this.kamAJAk.KAmaJaK();
        this.kamAJAk.KaMAJaK(graphics, n, n2, super.jaKKamA, super.JAKKamA);
    }
    
    public void KaMAJAk(final int kaMajAk) {
        this.KAMajAk = kaMajAk;
    }
    
    public void akKaMaJ() {
        this.kAmaJAk(this.KAMajAk);
    }
    
    public void kAmaJAk(int amAJakk) {
        amAJakk = mmajkka.AmAJakk(amAJakk);
        final int[] amAjakk = this.kamAJAk.AMAjakk;
        for (int length = amAjakk.length, i = 0; i < length; amAjakk[i++] = amAJakk) {}
    }
}
