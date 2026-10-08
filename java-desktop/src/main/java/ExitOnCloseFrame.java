import java.awt.Event;
import java.awt.Frame;

// 
// Decompiled by Procyon v0.6.0
// 

class ExitOnCloseFrame extends Frame
{
    public ExitOnCloseFrame(final String title) {
        super(title);
    }
    
    public boolean handleEvent(final Event evt) {
        switch (evt.id) {
            case 201: {
                this.dispose();
                System.exit(0);
                return true;
            }
            default: {
                return super.handleEvent(evt);
            }
        }
    }
}
