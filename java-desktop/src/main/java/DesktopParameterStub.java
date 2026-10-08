import java.net.URL;
import java.util.Hashtable;

// 
// Decompiled by Procyon v0.6.0
// 

class DesktopParameterStub 
{
    DesktopResourceContext JAkkaMA;
    Hashtable jAkkaMA;
    
    DesktopParameterStub() {
        this.jAkkaMA = new Hashtable();
        this.JAkkaMA = new DesktopResourceContext();
    }
    
    public void appletResize(final int n, final int n2) {
    }
    
    public DesktopResourceContext getAppletContext() {
        return this.JAkkaMA;
    }
    
    public URL getCodeBase() {
        return DesktopResourceContext.Kamajak();
    }
    
    public URL getDocumentBase() {
        return DesktopResourceContext.kamajak();
    }
    
    public boolean isActive() {
        return true;
    }
    
    public void AkKamaJ(final String key, final String value) {
        this.jAkkaMA.put(key, value);
    }
    
    public String getParameter(final String key) {
        return (String)this.jAkkaMA.get(key);
    }
}
