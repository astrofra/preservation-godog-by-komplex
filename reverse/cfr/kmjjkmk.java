/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.ColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.IndexColorModel;
import java.util.Hashtable;

class kmjjkmk
implements ImageConsumer {
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
            while (true) {
                if (this.kKaMAJa) {
                    return;
                }
                this.wait(500L);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public synchronized void imageComplete(int n) {
        if (!this.kKaMAJa) {
            if (this.KKaMAJa == null || n == 1 || n == 4) {
                this.KkAmaJa = true;
            } else if (this.kkaMAJa) {
                ((mmajkka)this.KKaMAJa).Amajakk();
            } else {
                ((maaakka)this.KKaMAJa).KAMAjaK((IndexColorModel)this.KKAMAJa);
            }
            this.kKaMAJa = true;
            this.notify();
        }
    }

    public void setColorModel(ColorModel colorModel) {
        this.KKAMAJa = colorModel;
    }

    public void setDimensions(int n, int n2) {
        this.kKAMAJa = n;
        this.KkaMAJa = n2;
    }

    public void setHints(int n) {
        if (this.KKAMAJa instanceof IndexColorModel) {
            this.kkaMAJa = false;
            this.KKaMAJa = new maaakka(this.kKAMAJa, this.KkaMAJa, 1, false);
            return;
        }
        this.kkaMAJa = true;
        this.KKaMAJa = new mmajkka(this.kKAMAJa, this.KkaMAJa, 1, false);
    }

    public void setPixels(int n, int n2, int n3, int n4, ColorModel colorModel, byte[] byArray, int n5, int n6) {
        int n7 = n2 * this.kKAMAJa + n;
        int n8 = 0;
        while (n8 < n4) {
            System.arraycopy(byArray, n5, ((maaakka)this.KKaMAJa).kamAJaK, n7, n3);
            n5 += n6;
            n7 += this.kKAMAJa;
            ++n8;
        }
    }

    public void setPixels(int n, int n2, int n3, int n4, ColorModel colorModel, int[] nArray, int n5, int n6) {
        int n7 = n2 * this.kKAMAJa + n;
        int n8 = 0;
        while (n8 < n4) {
            System.arraycopy(nArray, n5, ((mmajkka)this.KKaMAJa).AMAjakk, n7, n3);
            n5 += n6;
            n7 += this.kKAMAJa;
            ++n8;
        }
    }

    public void setProperties(Hashtable hashtable) {
    }

    kmjjkmk() {
        super();
    }
}

