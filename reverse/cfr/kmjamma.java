/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.ColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.io.InputStream;
import java.util.Hashtable;

public class kmjamma
extends Component
implements ImageConsumer {
    mmaakka MAjAKka;
    mmjakmk mAjAKka;
    mmajkka MaJakka;
    private ImageProducer maJakka;
    public int[] MAJakka;
    int mAJakka;

    public void majakKa(int n) {
        this.mAjAKka.KkamAja(n);
    }

    public int MajakKa() {
        return this.mAjAKka.KKamaJA();
    }

    public kmjamma(mmajkka mmajkka2, InputStream inputStream) {
        super();
        this.MaJakka = mmajkka2;
        try {
            this.MAjAKka = new mmaakka();
            this.mAjAKka = new mmjakmk(this.MAjAKka);
            this.mAjAKka.KKAmaJA(true);
            this.mAjAKka.kKamaJA(this);
            this.mAjAKka.kKamAja(true);
            this.mAjAKka.kkAMaJA(inputStream);
            this.mAjAKka.KkamaJA();
            this.mAjAKka.kkaMAja(3, false);
            this.mAjAKka.KkamAja(0);
            while (this.maJakka == null) {
                Thread.sleep(100L);
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public Rectangle bounds() {
        return new Rectangle(this.MaJakka.kAMAJaK, this.MaJakka.KamAJaK);
    }

    public void update(Graphics graphics) {
    }

    public void mAJakKa(Graphics graphics) {
    }

    public void paint(Graphics graphics) {
    }

    public void repaint() {
    }

    public boolean isShowing() {
        return true;
    }

    public Graphics getGraphics() {
        return null;
    }

    public Image createImage(ImageProducer imageProducer) {
        this.maJakka = imageProducer;
        this.maJakka.startProduction(this);
        return null;
    }

    public void imageComplete(int n) {
    }

    public void setColorModel(ColorModel colorModel) {
    }

    public void setDimensions(int n, int n2) {
        this.MAJakka = new int[n * n2];
        int n3 = 0;
        while (n3 < this.MAJakka.length) {
            this.MAJakka[n3] = -16777216;
            ++n3;
        }
        this.mAJakka = n;
    }

    public void setHints(int n) {
    }

    public void setPixels(int n, int n2, int n3, int n4, ColorModel colorModel, byte[] byArray, int n5, int n6) {
    }

    public void setPixels(int n, int n2, int n3, int n4, ColorModel colorModel, int[] nArray, int n5, int n6) {
        int n7 = n2 * this.mAJakka + n;
        int[] nArray2 = this.MaJakka.AMAjakk;
        int n8 = 0;
        while (n8 < n4) {
            int n9 = n3;
            switch (n9 & 3) {
                case 3: {
                    nArray2[n7++] = (nArray[n5++] & 0xFF) * 0x100401;
                }
                case 2: {
                    nArray2[n7++] = (nArray[n5++] & 0xFF) * 0x100401;
                }
                case 1: {
                    nArray2[n7++] = (nArray[n5++] & 0xFF) * 0x100401;
                }
            }
            n9 >>= 2;
            while (n9-- > 0) {
                nArray2[n7++] = (nArray[n5++] & 0xFF) * 0x100401;
                nArray2[n7++] = (nArray[n5++] & 0xFF) * 0x100401;
                nArray2[n7++] = (nArray[n5++] & 0xFF) * 0x100401;
                nArray2[n7++] = (nArray[n5++] & 0xFF) * 0x100401;
            }
            n5 += n6 - n3;
            n7 += this.mAJakka - n3;
            ++n8;
        }
    }

    public void setProperties(Hashtable hashtable) {
    }
}

