import java.io.DataInputStream;
import java.util.Vector;
import java.net.URL;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Component;
import java.applet.AppletStub;
import java.applet.Applet;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kmaamma extends Applet
{
    public boolean amaJakK;
    public boolean AMaJakK;
    public Thread aMaJakK;
    kmaamma AmAjAKK;
    
    public kmaamma() {
        this.amaJakK = false;
        kmaakma.majAKkA = this;
    }
    
    public boolean amajAKK() {
        return this.AMaJakK;
    }
    
    public void AmAJAKK() {
        if (this.AMaJakK) {
            this.aMaJakK.resume();
            this.AMaJakK = false;
            return;
        }
        this.aMaJakK.suspend();
        this.AMaJakK = true;
    }
    
    public void aMaJAKK() {
        this.amAJAKK(null);
    }
    
    public void amAJAKK(final String[] array) {
        this.amaJAKK(array, 320, 240);
    }
    
    public void amaJAKK(final String[] array, final int n, final int n2) {
        final kmajmmk stub = new kmajmmk();
        (this.AmAjAKK = this).setStub(stub);
        if (array != null) {
            for (int i = 0; i < array.length - 1; i += 2) {
                stub.AkKamaJ(array[i], array[i + 1]);
            }
        }
        final kaaakmk kaaakmk = new kaaakmk(this.getClass().getName());
        kaaakmk.show();
        final Insets insets = kaaakmk.insets();
        final int width = insets.left + insets.right + n;
        final int height = insets.top + insets.bottom + n2;
        final Dimension screenSize = this.getToolkit().getScreenSize();
        kaaakmk.reshape((screenSize.width - n) / 2, (screenSize.height - n2) / 2, width, height);
        kaaakmk.add("Center", this.AmAjAKK);
        this.AmAjAKK.amaJakK = true;
        this.AmAjAKK.init();
        kaaakmk.show();
        this.AmAjAKK.start();
    }
    
    public void finalize() {
        this.AmAjAKK.stop();
    }
    
    public void start() {
        if (this instanceof Runnable) {
            final Runnable runnable = (Runnable)this;
            if (this.aMaJakK == null) {
                (this.aMaJakK = new Thread(runnable, "Muhmu BaseApplet runner - " + runnable)).start();
            }
        }
    }
    
    public void stop() {
        if (this instanceof Runnable && this.aMaJakK != null) {
            this.aMaJakK.stop();
            this.aMaJakK = null;
            System.out.println("baseapplet: runner stopped");
        }
    }
    
    public byte[] AmaJAKK(final URL url) {
        final Vector vector = new Vector(10);
        final int n = 65536;
        int n2 = 0;
        try {
            final DataInputStream dataInputStream = new DataInputStream(url.openConnection().getInputStream());
            int i = 0;
            while (i != -1) {
                final byte[] array = new byte[n];
                int j = 0;
                vector.addElement(array);
                while (j < n) {
                    i = dataInputStream.read(array, j, n - j);
                    if (i < 0) {
                        break;
                    }
                    j += i;
                    n2 += i;
                }
            }
        }
        catch (final Exception ex) {
            vector.removeAllElements();
            return null;
        }
        int k = 0;
        final byte[] array2 = new byte[n2];
        int n3 = 0;
        while (k < n2) {
            final byte[] array3 = (byte[])vector.elementAt(n3++);
            if (n2 - k >= n) {
                System.arraycopy(array3, 0, array2, k, n);
                k += n;
            }
            else {
                System.arraycopy(array3, 0, array2, k, n2 - k);
                k = n2;
            }
        }
        vector.removeAllElements();
        return array2;
    }
    
    public URL AmAjaKK(final String s) {
        return this.AMAjaKK(this.getCodeBase(), s);
    }
    
    public URL aMajAKK(final String s) {
        return this.AMAjaKK(this.getDocumentBase(), s);
    }
    
    public URL AMAjaKK(final URL url, String replace) {
        if (this.amaJakK) {
            replace = replace.replace('\\', '/');
            if (replace.charAt(0) == '/') {
                if (url.getFile().charAt(2) == ':') {
                    try {
                        return new URL("file:///" + url.getFile().substring(0, 3) + replace);
                    }
                    catch (final Exception ex) {
                        ex.printStackTrace();
                        return null;
                    }
                }
                try {
                    return new URL("file:///" + replace);
                }
                catch (final Exception ex2) {
                    ex2.printStackTrace();
                    return null;
                }
            }
            if (replace.charAt(1) == ':') {
                try {
                    return new URL("file:///" + replace);
                }
                catch (final Exception ex3) {
                    ex3.printStackTrace();
                    return null;
                }
            }
            try {
                return new URL(url, replace);
            }
            catch (final Exception ex4) {
                ex4.printStackTrace();
                return null;
            }
        }
        try {
            return new URL(url, replace);
        }
        catch (final Exception ex5) {
            ex5.printStackTrace();
            return null;
        }
    }
    
    public String getParameter(final String s) {
        return this.AMaJAKK(s, null);
    }
    
    public String AMaJAKK(final String name, final String s) {
        String parameter = super.getParameter(name);
        if (parameter == null) {
            parameter = s;
        }
        return parameter;
    }
    
    public int amAjaKK(final String s, final int n) {
        try {
            return Integer.parseInt(this.AMaJAKK(s, (String)null));
        }
        catch (final Exception ex) {
            return n;
        }
    }
    
    public long AMajAKK(final String s, final long n) {
        try {
            return Long.parseLong(this.AMaJAKK(s, (String)null));
        }
        catch (final Exception ex) {
            return n;
        }
    }
    
    public float AMAJAKK(final String s, final float n) {
        try {
            return Float.valueOf(this.AMaJAKK(s, (String)null));
        }
        catch (final Exception ex) {
            return n;
        }
    }
    
    public double aMAJAKK(final String s, final double n) {
        try {
            return Double.valueOf(this.AMaJAKK(s, (String)null));
        }
        catch (final Exception ex) {
            return n;
        }
    }
}
