import java.net.URL;
import java.applet.AppletContext;
import java.util.Hashtable;
import java.applet.AppletStub;

// 
// Decompiled by Procyon v0.6.0
// 

class kmajmmk implements AppletStub
{
    kajjmka JAkkaMA;
    Hashtable jAkkaMA;
    
    kmajmmk() {
        this.jAkkaMA = new Hashtable();
        this.JAkkaMA = new kajjmka();
    }
    
    public void appletResize(final int n, final int n2) {
    }
    
    public AppletContext getAppletContext() {
        return this.JAkkaMA;
    }
    
    public URL getCodeBase() {
        return kajjmka.Kamajak();
    }
    
    public URL getDocumentBase() {
        return kajjmka.kamajak();
    }
    
    public boolean isActive() {
        return true;
    }
    
    public void AkKamaJ(final String key, final String value) {
        this.jAkkaMA.put(key, value);
    }
    
    public String getParameter(final String key) {
        return this.jAkkaMA.get(key);
    }
}
