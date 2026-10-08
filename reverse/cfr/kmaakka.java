/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;

public abstract class kmaakka
implements ImageProducer {
    protected ImageConsumer KaMAJaK;
    public Image kaMAJaK;
    protected ColorModel KAMAJaK;
    public int kAMAJaK;
    public int KamAJaK;

    public kmaakka(int n, int n2) {
        super();
        this.kAMAJaK = n;
        this.KamAJaK = n2;
    }

    public final void addConsumer(ImageConsumer imageConsumer) {
    }

    public final boolean isConsumer(ImageConsumer imageConsumer) {
        return false;
    }

    public final void removeConsumer(ImageConsumer imageConsumer) {
    }

    public final void requestTopDownLeftRightResend(ImageConsumer imageConsumer) {
    }

    public final void startProduction(ImageConsumer imageConsumer) {
        this.KaMAJaK = imageConsumer;
        this.KaMAJaK.setDimensions(this.kAMAJaK, this.KamAJaK);
        this.KaMAJaK.setProperties(null);
        this.KaMAJaK.setColorModel(this.KAMAJaK);
        this.KaMAJaK.setHints(30);
    }

    public final void KAmaJaK() {
        this.kamaJaK(0, 0, this.kAMAJaK, this.KamAJaK);
    }

    public abstract void kamaJaK(int var1, int var2, int var3, int var4);

    public final void kaMAJaK(Graphics graphics, int n, int n2) {
        graphics.drawImage(this.kaMAJaK, n, n2, null);
    }

    public final void KaMAJaK(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.drawImage(this.kaMAJaK, n, n2, n3, n4, Color.green, null);
    }

    public final void kAmaJaK(boolean bl) {
        if (bl) {
            if (this.kaMAJaK == null) {
                this.kaMAJaK = Toolkit.getDefaultToolkit().createImage(this);
                Toolkit.getDefaultToolkit().prepareImage(this.kaMAJaK, this.kAMAJaK, this.KamAJaK, null);
                this.KAmaJaK();
                return;
            }
        } else {
            this.kaMAJaK = null;
        }
    }
}

