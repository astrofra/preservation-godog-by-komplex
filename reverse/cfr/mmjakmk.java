/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.InputStream;

public class mmjakmk {
    public static final int aKKAmaJ = 0;
    public static final int AkkAmaJ = 1;
    public static final int akkAmaJ = 2;
    public static final int AKkAmaJ = 3;
    public static final int aKkAmaJ = 4;
    public static final int AkKaMAJ = 0;
    public static final int akKaMAJ = 1;
    private mmaakka AKKaMAJ;

    public mmjakmk(mmaakka mmaakka2) {
        super();
        this.AKKaMAJ = mmaakka2;
    }

    public synchronized void KkamAja(int n) {
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
        return this.AKKaMAJ.AmAJaKk.aKkAMaJ();
    }

    public void kkAMAja() {
        this.AKKaMAJ.AmAJaKk.aKKAMaJ();
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

    public boolean KKAmAja(int n) {
        return this.AKKaMAJ.AMajaKk.mAjAkKa(n);
    }

    public int kKAmaJA() {
        return this.AKKaMAJ.AMajaKk.AmAJAkK();
    }

    public void KKamAja() {
        this.AKKaMAJ.aMajaKk();
    }

    private void kKaMaJA(int n, int n2) {
        Rectangle rectangle = this.kKAMaJA();
        int n3 = rectangle.width * n / 100;
        int n4 = rectangle.height * n2 / 100;
        this.AKKaMAJ.KaMaJaK += n3;
        this.AKKaMAJ.kaMaJaK += n4;
    }

    public void KkAMAja(int n, int n2, int n3) {
        if (n3 == 0) {
            this.AKKaMAJ.KaMaJaK += n;
            this.AKKaMAJ.kaMaJaK += n2;
            return;
        }
        this.kKaMaJA(n, n2);
    }

    public void kkAmaja(int n) {
        if (n == 0) {
            this.AKKaMAJ.kAMaJaK = 1.0;
            this.AKKaMAJ.KAMaJaK = 1.0;
            this.AKKaMAJ.kaMaJaK = 0;
            this.AKKaMAJ.KaMaJaK = 0;
        } else {
            this.AKKaMAJ.KAMaJaK = this.AKKaMAJ.KAMaJaK * 100.0 / (double)n;
            this.AKKaMAJ.kAMaJaK = this.AKKaMAJ.kAMaJaK * 100.0 / (double)n;
        }
        Rectangle rectangle = this.AKKaMAJ.AmajaKk.bounds();
        this.AKKaMAJ.KAMaJaK((int)((double)rectangle.width * this.AKKaMAJ.KAMaJaK), (int)((double)rectangle.height * this.AKKaMAJ.kAMaJaK));
    }

    public void KKAMAja(int n, int n2, int n3, int n4) {
        int n5 = Math.abs((n3 /= 20) - (n /= 20));
        int n6 = Math.abs((n4 /= 20) - (n2 /= 20));
        Rectangle rectangle = this.AKKaMAJ.AmajaKk.bounds();
        this.KKaMaJA(-((int)((double)n * this.AKKaMAJ.KAMaJaK)), -((int)((double)n2 * this.AKKaMAJ.kAMaJaK)));
        this.AKKaMAJ.KAMaJaK = (double)rectangle.width / (double)n5;
        this.AKKaMAJ.kAMaJaK = (double)rectangle.height / (double)n6;
        this.AKKaMAJ.KAMaJaK((int)((double)rectangle.width * this.AKKaMAJ.KAMaJaK), (int)((double)rectangle.height * this.AKKaMAJ.kAMaJaK));
    }

    public synchronized void KkamaJA() {
        Object object = this.AKKaMAJ.kamaJaK;
        synchronized (object) {
            this.AKKaMAJ.amaJaKk(false);
            this.AKKaMAJ.aMajaKk = new Thread(this.AKKaMAJ);
            this.KkamAja(0);
            if (this.AKKaMAJ.amaJAKk) {
                this.kkAMAja();
            }
            this.AKKaMAJ.aMajaKk.start();
            return;
        }
    }

    public void KkAmAja() {
        this.AKKaMAJ.stop();
    }

    public void kkAMaJA(InputStream inputStream) {
        this.AKKaMAJ.AMajaKk.AmAjAkK(inputStream);
    }

    public void kKamaJA(Component component) {
        this.AKKaMAJ.AmajaKk = component;
    }

    public Component kkamaJA() {
        return this.AKKaMAJ.AmajaKk;
    }

    public void kkaMaJA() {
        this.AKKaMAJ.AMajaKk.MAjAkKa();
    }

    public void KKAmaJA(boolean bl) {
        this.AKKaMAJ.aMAJaKk = bl;
    }

    public void KKaMaJA(int n, int n2) {
        this.AKKaMAJ.KaMaJaK = n;
        this.AKKaMAJ.kaMaJaK = n2;
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

    public void kKamAja(boolean bl) {
        this.AKKaMAJ.AmaJAKk = bl;
    }

    public void kkaMAja(int n, boolean bl) {
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
        this.AKKaMAJ.AmaJaKk(bl);
    }

    public void kkamAja(int n) {
        this.AKKaMAJ.AMAjaKk = n;
        this.AKKaMAJ.amajaKk.JakkamA(this.AKKaMAJ.AMAjaKk | 0xFF000000, 4);
    }

    public int KkAMaJA() {
        return this.AKKaMAJ.AMAjaKk;
    }

    public void KKaMAja(Graphics graphics) {
        this.AKKaMAJ.update(graphics);
    }

    public void kKAmAja(Graphics graphics) {
        this.AKKaMAJ.paint(graphics);
    }

    public boolean KkaMaJA(Event event) {
        return this.AKKaMAJ.handleEvent(event);
    }
}

