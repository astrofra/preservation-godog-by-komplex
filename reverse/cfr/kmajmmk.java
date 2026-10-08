/*
 * Decompiled with CFR 0.152.
 */
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.net.URL;
import java.util.Hashtable;

class kmajmmk
implements AppletStub {
    kajjmka JAkkaMA;
    Hashtable jAkkaMA = new Hashtable();

    kmajmmk() {
        super();
        this.JAkkaMA = new kajjmka();
    }

    public void appletResize(int n, int n2) {
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

    public void AkKamaJ(String string, String string2) {
        this.jAkkaMA.put(string, string2);
    }

    public String getParameter(String string) {
        return (String)this.jAkkaMA.get(string);
    }
}

