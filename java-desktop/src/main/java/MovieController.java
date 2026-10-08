import java.awt.Event;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Component;
import java.io.InputStream;
import java.awt.Rectangle;

// 
// Decompiled by Procyon v0.6.0
// 

public class MovieController
{
    public static final int aKKAmaJ = 0;
    public static final int AkkAmaJ = 1;
    public static final int akkAmaJ = 2;
    public static final int AKkAmaJ = 3;
    public static final int aKkAmaJ = 4;
    public static final int AkKaMAJ = 0;
    public static final int akKaMAJ = 1;
    private MoviePlayer AKKaMAJ;
    
    public MovieController(final MoviePlayer akKaMAJ) {
        this.AKKaMAJ = akKaMAJ;
    }
    
    public synchronized void KkamAja(final int n) {
        this.AKKaMAJ.AMAJaKk(n);
    }
    
    public void KkaMAja() {
        this.KkamAja(0);
    }
    
    public void KkAmaja() {
        this.KkamAja(this.kKAMAja() - 1);
    }
    
    public void KKAmaja() {
        this.KkamAja(this.kKAMAja() + 1);
    }
    
    public boolean kkAmAja() {
        return this.AKKaMAJ.AmAJaKk.isSignalled();
    }
    
    public void kkAMAja() {
        this.AKKaMAJ.AmAJaKk.signal();
    }
    
    public int KKAMaJA() {
        return 131073;
    }
    
    public int kKAMAja() {
        return this.AKKaMAJ.kaMaJaK();
    }
    
    public int KKamaJA() {
        return this.AKKaMAJ.AMajaKk.mAJAkka;
    }
    
    public boolean KKAmAja(final int n) {
        return this.AKKaMAJ.AMajaKk.mAjAkKa(n);
    }
    
    public int kKAmaJA() {
        return this.AKKaMAJ.AMajaKk.AmAJAkK();
    }
    
    public void KKamAja() {
        this.AKKaMAJ.aMajaKk();
    }
    
    private void kKaMaJA(final int n, final int n2) {
        final Rectangle kkaMaJA = this.kKAMaJA();
        final int n3 = kkaMaJA.width * n / 100;
        final int n4 = kkaMaJA.height * n2 / 100;
        final MoviePlayer akKaMAJ = this.AKKaMAJ;
        akKaMAJ.KaMaJaK += n3;
        final MoviePlayer akKaMAJ2 = this.AKKaMAJ;
        akKaMAJ2.kaMaJaK += n4;
    }
    
    public void KkAMAja(final int n, final int n2, final int n3) {
        if (n3 == 0) {
            final MoviePlayer akKaMAJ = this.AKKaMAJ;
            akKaMAJ.KaMaJaK += n;
            final MoviePlayer akKaMAJ2 = this.AKKaMAJ;
            akKaMAJ2.kaMaJaK += n2;
            return;
        }
        this.kKaMaJA(n, n2);
    }
    
    public void kkAmaja(final int n) {
        if (n == 0) {
            final MoviePlayer akKaMAJ = this.AKKaMAJ;
            final MoviePlayer akKaMAJ2 = this.AKKaMAJ;
            final double n2 = 1.0;
            akKaMAJ2.kAMaJaK = n2;
            akKaMAJ.KAMaJaK = n2;
            final MoviePlayer akKaMAJ3 = this.AKKaMAJ;
            final MoviePlayer akKaMAJ4 = this.AKKaMAJ;
            final int n3 = 0;
            akKaMAJ4.kaMaJaK = n3;
            akKaMAJ3.KaMaJaK = n3;
        }
        else {
            this.AKKaMAJ.KAMaJaK = this.AKKaMAJ.KAMaJaK * 100.0 / n;
            this.AKKaMAJ.kAMaJaK = this.AKKaMAJ.kAMaJaK * 100.0 / n;
        }
        final Rectangle bounds = this.AKKaMAJ.AmajaKk.bounds();
        this.AKKaMAJ.KAMaJaK((int)(bounds.width * this.AKKaMAJ.KAMaJaK), (int)(bounds.height * this.AKKaMAJ.kAMaJaK));
    }
    
    public void KKAMAja(int n, int n2, int n3, int n4) {
        n /= 20;
        n2 /= 20;
        n3 /= 20;
        n4 /= 20;
        final int abs = Math.abs(n3 - n);
        final int abs2 = Math.abs(n4 - n2);
        final Rectangle bounds = this.AKKaMAJ.AmajaKk.bounds();
        this.KKaMaJA(-(int)(n * this.AKKaMAJ.KAMaJaK), -(int)(n2 * this.AKKaMAJ.kAMaJaK));
        this.AKKaMAJ.KAMaJaK = bounds.width / (double)abs;
        this.AKKaMAJ.kAMaJaK = bounds.height / (double)abs2;
        this.AKKaMAJ.KAMaJaK((int)(bounds.width * this.AKKaMAJ.KAMaJaK), (int)(bounds.height * this.AKKaMAJ.kAMaJaK));
    }
    
    public synchronized void KkamaJA() {
        synchronized (this.AKKaMAJ.kamaJaK) {
            this.AKKaMAJ.amaJaKk(false);
            this.AKKaMAJ.aMajaKk = new Thread(this.AKKaMAJ);
            this.KkamAja(0);
            if (this.AKKaMAJ.amaJAKk) {
                this.kkAMAja();
            }
            this.AKKaMAJ.aMajaKk.start();

        }
    }
    
    public void KkAmAja() {
        this.AKKaMAJ.stop();
    }
    
    public void kkAMaJA(final InputStream inputStream) {
        this.AKKaMAJ.AMajaKk.AmAjAkK(inputStream);
    }
    
    public void kKamaJA(final Component amajaKk) {
        this.AKKaMAJ.AmajaKk = amajaKk;
    }
    
    public Component kkamaJA() {
        return this.AKKaMAJ.AmajaKk;
    }
    
    public void kkaMaJA() {
        this.AKKaMAJ.AMajaKk.MAjAkKa();
    }
    
    public void KKAmaJA(final boolean amaJaKk) {
        this.AKKaMAJ.aMAJaKk = amaJaKk;
    }
    
    public void KKaMaJA(final int kaMaJaK, final int kaMaJaK2) {
        this.AKKaMAJ.KaMaJaK = kaMaJaK;
        this.AKKaMAJ.kaMaJaK = kaMaJaK2;
    }
    
    public Point kKaMAja() {
        return new Point(this.AKKaMAJ.KaMaJaK, this.AKKaMAJ.kaMaJaK);
    }
    
    public Rectangle kKAMaJA() {
        if (this.AKKaMAJ.amajaKk != null) {
            return new Rectangle(this.AKKaMAJ.KaMaJaK, this.AKKaMAJ.kaMaJaK, this.AKKaMAJ.amajaKk.MajAKkA, this.AKKaMAJ.amajaKk.majAKkA);
        }
        return new Rectangle(this.AKKaMAJ.KaMaJaK, this.AKKaMAJ.kaMaJaK, 0, 0);
    }
    
    public void kKamAja(final boolean amaJAKk) {
        this.AKKaMAJ.AmaJAKk = amaJAKk;
    }
    
    public void kkaMAja(final int n, final boolean b) {
        switch (n) {
            case 0: {
                this.AKKaMAJ.AMaJAKk = false;
                this.AKKaMAJ.aMaJAKk = false;
                break;
            }
            case 1: {
                this.AKKaMAJ.AMaJAKk = false;
                this.AKKaMAJ.aMaJAKk = true;
                break;
            }
            case 2: {
                this.AKKaMAJ.AMaJAKk = true;
                this.AKKaMAJ.aMaJAKk = true;
                break;
            }
            case 3:
            case 4: {
                this.AKKaMAJ.AMaJAKk = true;
                this.AKKaMAJ.aMaJAKk = false;
                break;
            }
            default: {
                return;
            }
        }
        this.AKKaMAJ.AmaJaKk(b);
    }
    
    public void kkamAja(final int amAjaKk) {
        this.AKKaMAJ.AMAjaKk = amAjaKk;
        this.AKKaMAJ.amajaKk.JakkamA(this.AKKaMAJ.AMAjaKk | 0xFF000000, 4);
    }
    
    public int KkAMaJA() {
        return this.AKKaMAJ.AMAjaKk;
    }
    
    public void KKaMAja(final Graphics graphics) {
        this.AKKaMAJ.update(graphics);
    }
    
    public void kKAmAja(final Graphics graphics) {
        this.AKKaMAJ.paint(graphics);
    }
    
    public boolean KkaMaJA(final Event event) {
        return this.AKKaMAJ.handleEvent(event);
    }
}
