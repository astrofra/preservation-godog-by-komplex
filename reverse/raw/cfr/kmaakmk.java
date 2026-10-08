/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;

public class kmaakmk
extends kajakka {
    kmaamma AkkAmAj;
    Image akkAmAj;

    public String amajaKk() {
        return "endscreen";
    }

    public void AmajaKk(kmaamma kmaamma2) {
        this.AkkAmAj = kmaamma2;
        this.akkAmAj = this.AkkAmAj.getImage(this.AkkAmAj.aMajAKK("images/endscreen.gif"));
        MediaTracker mediaTracker = new MediaTracker(this.AkkAmAj);
        mediaTracker.addImage(this.akkAmAj, 1);
        try {
            mediaTracker.waitForAll();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public void amAjaKk(Graphics graphics, float f, float f2) {
        graphics.drawImage(this.akkAmAj, 0, 0, null);
    }

    public kmaakmk() {
        super();
    }
}

