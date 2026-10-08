import java.util.Hashtable;
import java.awt.image.IndexColorModel;
import java.awt.image.ColorModel;
import java.awt.image.ImageConsumer;

// 
// Decompiled by Procyon v0.6.0
// 

class kmjjkmk implements ImageConsumer
{
    ColorModel KKAMAJa;
    int kKAMAJa;
    int KkaMAJa;
    boolean kkaMAJa;
    kmaakka KKaMAJa;
    boolean kKaMAJa;
    boolean KkAmaJa;
    
    public boolean kKaMajA() {
        return !this.KkAmaJa;
    }
    
    public synchronized void KkAmAJA() {
        try {
            while (!this.kKaMAJa) {
                this.wait(500L);
            }
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public synchronized void imageComplete(final int n) {
        if (!this.kKaMAJa) {
            if (this.KKaMAJa == null || n == 1 || n == 4) {
                this.KkAmaJa = true;
            }
            else if (this.kkaMAJa) {
                ((mmajkka)this.KKaMAJa).Amajakk();
            }
            else {
                ((maaakka)this.KKaMAJa).KAMAjaK((IndexColorModel)this.KKAMAJa);
            }
            this.kKaMAJa = true;
            this.notify();
        }
    }
    
    public void setColorModel(final ColorModel kkamaJa) {
        this.KKAMAJa = kkamaJa;
    }
    
    public void setDimensions(final int kkamaJa, final int kkaMAJa) {
        this.kKAMAJa = kkamaJa;
        this.KkaMAJa = kkaMAJa;
    }
    
    public void setHints(final int n) {
        if (this.KKAMAJa instanceof IndexColorModel) {
            this.kkaMAJa = false;
            this.KKaMAJa = new maaakka(this.kKAMAJa, this.KkaMAJa, 1, false);
            return;
        }
        this.kkaMAJa = true;
        this.KKaMAJa = new mmajkka(this.kKAMAJa, this.KkaMAJa, 1, false);
    }
    
    public void setPixels(final int n, final int n2, final int n3, final int n4, final ColorModel colorModel, final byte[] array, int n5, final int n6) {
        int n7 = n2 * this.kKAMAJa + n;
        for (int i = 0; i < n4; ++i) {
            System.arraycopy(array, n5, ((maaakka)this.KKaMAJa).kamAJaK, n7, n3);
            n5 += n6;
            n7 += this.kKAMAJa;
        }
    }
    
    public void setPixels(final int n, final int n2, final int n3, final int n4, final ColorModel colorModel, final int[] array, int n5, final int n6) {
        int n7 = n2 * this.kKAMAJa + n;
        for (int i = 0; i < n4; ++i) {
            System.arraycopy(array, n5, ((mmajkka)this.KKaMAJa).AMAjakk, n7, n3);
            n5 += n6;
            n7 += this.kKAMAJa;
        }
    }
    
    public void setProperties(final Hashtable hashtable) {
    }
}
