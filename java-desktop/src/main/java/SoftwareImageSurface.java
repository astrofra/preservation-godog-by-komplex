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

public abstract class SoftwareImageSurface implements ImageProducer
{
    protected ImageConsumer consumer;
    public Image image;
    protected ColorModel colorModel;
    public int width;
    public int height;
    
    public SoftwareImageSurface(final int kamaJaK, final int kamAJaK) {
        this.width = kamaJaK;
        this.height = kamAJaK;
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
        (this.consumer = kaMAJaK).setDimensions(this.width, this.height);
        this.consumer.setProperties(null);
        this.consumer.setColorModel(this.colorModel);
        this.consumer.setHints(30);
    }
    
    public final void publishFrame() {
        this.publishRegion(0, 0, this.width, this.height);
    }
    
    public abstract void publishRegion(final int p0, final int p1, final int p2, final int p3);
    
    public final void drawImage(final Graphics graphics, final int n, final int n2) {
        graphics.drawImage(this.image, n, n2, null);
    }
    
    public final void drawScaledImage(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        graphics.drawImage(this.image, n, n2, n3, n4, Color.green, null);
    }
    
    public final void setImageEnabled(final boolean b) {
        if (b) {
            if (this.image == null) {
                this.image = Toolkit.getDefaultToolkit().createImage(this);
                Toolkit.getDefaultToolkit().prepareImage(this.image, this.width, this.height, null);
                this.publishFrame();
            }
        }
        else {
            this.image = null;
        }
    }
}
