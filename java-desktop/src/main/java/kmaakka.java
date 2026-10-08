import java.awt.Toolkit;
import java.awt.Color;
import java.awt.image.ImageObserver;
import java.awt.Graphics;
import java.util.Hashtable;
import java.awt.image.ColorModel;
import java.awt.Image;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kmaakka implements ImageProducer
{
    protected ImageConsumer KaMAJaK;
    public Image kaMAJaK;
    protected ColorModel KAMAJaK;
    public int kAMAJaK;
    public int KamAJaK;
    
    public kmaakka(final int kamaJaK, final int kamAJaK) {
        this.kAMAJaK = kamaJaK;
        this.KamAJaK = kamAJaK;
    }
    
    public final void addConsumer(final ImageConsumer imageConsumer) {
    }
    
    public final boolean isConsumer(final ImageConsumer imageConsumer) {
        return false;
    }
    
    public final void removeConsumer(final ImageConsumer imageConsumer) {
    }
    
    public final void requestTopDownLeftRightResend(final ImageConsumer imageConsumer) {
    }
    
    public final void startProduction(final ImageConsumer kaMAJaK) {
        (this.KaMAJaK = kaMAJaK).setDimensions(this.kAMAJaK, this.KamAJaK);
        this.KaMAJaK.setProperties(null);
        this.KaMAJaK.setColorModel(this.KAMAJaK);
        this.KaMAJaK.setHints(30);
    }
    
    public final void KAmaJaK() {
        this.kamaJaK(0, 0, this.kAMAJaK, this.KamAJaK);
    }
    
    public abstract void kamaJaK(final int p0, final int p1, final int p2, final int p3);
    
    public final void kaMAJaK(final Graphics graphics, final int n, final int n2) {
        graphics.drawImage(this.kaMAJaK, n, n2, null);
    }
    
    public final void KaMAJaK(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        graphics.drawImage(this.kaMAJaK, n, n2, n3, n4, Color.green, null);
    }
    
    public final void kAmaJaK(final boolean b) {
        if (b) {
            if (this.kaMAJaK == null) {
                this.kaMAJaK = Toolkit.getDefaultToolkit().createImage(this);
                Toolkit.getDefaultToolkit().prepareImage(this.kaMAJaK, this.kAMAJaK, this.KamAJaK, null);
                this.KAmaJaK();
            }
        }
        else {
            this.kaMAJaK = null;
        }
    }
}
