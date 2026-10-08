import java.awt.Toolkit;
import java.awt.Image;
import java.applet.AudioClip;
import java.util.Enumeration;
import java.applet.Applet;
import java.net.URL;
import java.applet.AppletContext;

// 
// Decompiled by Procyon v0.6.0
// 

class kajjmka implements AppletContext
{
    public static URL kamajak() {
        return Kamajak();
    }
    
    public static URL Kamajak() {
        String s = System.getProperty("user.dir").replace('\\', '/');
        if (s.charAt(s.length() - 1) != '/') {
            s = String.valueOf(s) + "/";
        }
        try {
            return new URL("file:///" + s);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public Applet getApplet(final String s) {
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
