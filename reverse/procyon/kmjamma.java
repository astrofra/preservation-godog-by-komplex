import java.util.Hashtable;
import java.awt.image.ColorModel;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.io.InputStream;
import java.awt.image.ImageProducer;
import java.awt.image.ImageConsumer;
import java.awt.Component;

// 
// Decompiled by Procyon v0.6.0
// 

public class kmjamma extends Component implements ImageConsumer
{
    mmaakka MAjAKka;
    mmjakmk mAjAKka;
    mmajkka MaJakka;
    private ImageProducer maJakka;
    public int[] MAJakka;
    int mAJakka;
    
    public void majakKa(final int n) {
        this.mAjAKka.KkamAja(n);
    }
    
    public int MajakKa() {
        return this.mAjAKka.KKamaJA();
    }
    
    public kmjamma(final mmajkka maJakka, final InputStream inputStream) {
        this.MaJakka = maJakka;
        try {
            this.MAjAKka = new mmaakka();
            (this.mAjAKka = new mmjakmk(this.MAjAKka)).KKAmaJA(true);
            this.mAjAKka.kKamaJA(this);
            this.mAjAKka.kKamAja(true);
            this.mAjAKka.kkAMaJA(inputStream);
            this.mAjAKka.KkamaJA();
            this.mAjAKka.kkaMAja(3, false);
            this.mAjAKka.KkamAja(0);
            while (this.maJakka == null) {
                Thread.sleep(100L);
            }
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public Rectangle bounds() {
        return new Rectangle(this.MaJakka.kAMAJaK, this.MaJakka.KamAJaK);
    }
    
    public void update(final Graphics graphics) {
    }
    
    public void mAJakKa(final Graphics graphics) {
    }
    
    public void paint(final Graphics graphics) {
    }
    
    public void repaint() {
    }
    
    public boolean isShowing() {
        return true;
    }
    
    public Graphics getGraphics() {
        return null;
    }
    
    public Image createImage(final ImageProducer maJakka) {
        (this.maJakka = maJakka).startProduction(this);
        return null;
    }
    
    public void imageComplete(final int n) {
    }
    
    public void setColorModel(final ColorModel colorModel) {
    }
    
    public void setDimensions(final int maJakka, final int n) {
        this.MAJakka = new int[maJakka * n];
        for (int i = 0; i < this.MAJakka.length; ++i) {
            this.MAJakka[i] = -16777216;
        }
        this.mAJakka = maJakka;
    }
    
    public void setHints(final int n) {
    }
    
    public void setPixels(final int n, final int n2, final int n3, final int n4, final ColorModel colorModel, final byte[] array, final int n5, final int n6) {
    }
    
    public void setPixels(final int n, final int n2, final int n3, final int n4, final ColorModel colorModel, final int[] array, int n5, final int n6) {
        int n7 = n2 * this.mAJakka + n;
        final int[] amAjakk = this.MaJakka.AMAjakk;
        for (int i = 0; i < n4; ++i) {
            switch (n3 & 0x3) {
                case 3: {
                    amAjakk[n7++] = (array[n5++] & 0xFF) * 1049601;
                }
                case 2: {
                    amAjakk[n7++] = (array[n5++] & 0xFF) * 1049601;
                }
                case 1: {
                    amAjakk[n7++] = (array[n5++] & 0xFF) * 1049601;
                    break;
                }
            }
            int n8 = n3 >> 2;
            while (n8-- > 0) {
                amAjakk[n7++] = (array[n5++] & 0xFF) * 1049601;
                amAjakk[n7++] = (array[n5++] & 0xFF) * 1049601;
                amAjakk[n7++] = (array[n5++] & 0xFF) * 1049601;
                amAjakk[n7++] = (array[n5++] & 0xFF) * 1049601;
            }
            n5 += n6 - n3;
            n7 += this.mAJakka - n3;
        }
    }
    
    public void setProperties(final Hashtable hashtable) {
    }
}
