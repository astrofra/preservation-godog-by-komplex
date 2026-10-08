import java.awt.Toolkit;
import java.awt.Image;
import desktop.audio.AudioClip;
import java.util.Enumeration;
import java.net.URL;

// 
// Decompiled by Procyon v0.6.0
// 

class kajjmka 
{
    public static URL kamajak() {
        return Kamajak();
    }
    
    public static URL Kamajak() {
        return GodogDesktop.assetBase();
    }
    
    public DesktopSurface getApplet(final String s) {
        return null;
    }
    
    public Enumeration getApplets() {
        return null;
    }
    
    public AudioClip getAudioClip(final URL url) {
        return null;
    }
    
    public Image getImage(final URL url) {
        return Toolkit.getDefaultToolkit().getImage(url);
    }
    
    public void showDocument(final URL url) {
    }
    
    public void showDocument(final URL url, final String s) {
    }
    
    public void showStatus(final String s) {
    }
}
