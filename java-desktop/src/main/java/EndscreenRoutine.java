import java.awt.image.ImageObserver;
import java.awt.Graphics;
import java.awt.Component;
import java.awt.MediaTracker;
import java.awt.Image;

// 
// Decompiled by Procyon v0.6.0
// 

public class EndscreenRoutine extends GraphicsRoutine
{
    DesktopDemoBase AkkAmAj;
    Image akkAmAj;
    
    public String getRoutineId() {
        return "endscreen";
    }
    
    public void load(final DesktopDemoBase akkAmAj) {
        this.AkkAmAj = akkAmAj;
        this.akkAmAj = this.AkkAmAj.getImage(this.AkkAmAj.aMajAKK("images/endscreen.gif"));
        final MediaTracker mediaTracker = new MediaTracker(this.AkkAmAj);
        mediaTracker.addImage(this.akkAmAj, 1);
        try {
            mediaTracker.waitForAll();
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void render(final Graphics graphics, final float n, final float n2) {
        graphics.drawImage(this.akkAmAj, 0, 0, null);
    }
}
