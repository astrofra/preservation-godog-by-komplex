import java.util.Enumeration;
import java.util.Vector;

// 
// Decompiled by Procyon v0.6.0
// 

class kmjakka
{
    Vector AmajAKk;
    
    synchronized void AmAJAKk(final int n, final long n2) {
        synchronized (this.AmajAKk) {
            this.AmajAKk.addElement(new majakmk(n, n2));
            final long currentTimeMillis = System.currentTimeMillis();
            final Enumeration elements = this.AmajAKk.elements();
            if (elements != null) {
                while (elements.hasMoreElements()) {
                    final majakmk obj = (majakmk)elements.nextElement();
                    if (obj.akKAMAJ <= currentTimeMillis) {
                        this.AmajAKk.removeElement(obj);
                    }
                }
            }
            monitorexit(this.AmajAKk);
        }
        this.notify();
    }
    
    int aMAJAKk(final int n) {
        final majakmk amajaKk = this.AMAJAKk(n);
        final long millis = amajaKk.akKAMAJ - System.currentTimeMillis();
        if (millis > 0L) {
            try {
                Thread.sleep(millis);
            }
            catch (final Exception ex) {
                return amajaKk.AkKAMAJ;
            }
        }
        return amajaKk.AkKAMAJ;
    }
    
    boolean AmaJAKk(final int n, final int n2) {
        final long n3 = System.currentTimeMillis() + n2;
        synchronized (this.AmajAKk) {
            final Enumeration elements = this.AmajAKk.elements();
            if (elements == null) {
                final boolean b = false;
                monitorexit(this.AmajAKk);
                return b;
            }
            int n4 = 0;
            while (elements.hasMoreElements()) {
                final majakmk majakmk = (majakmk)elements.nextElement();
                if (n4 == 0 && majakmk.AkKAMAJ > n) {
                    final boolean b2 = true;
                    monitorexit(this.AmajAKk);
                    return b2;
                }
                if (majakmk.AkKAMAJ >= n && majakmk.akKAMAJ <= n3) {
                    final boolean b3 = true;
                    monitorexit(this.AmajAKk);
                    return b3;
                }
                ++n4;
            }
            monitorexit(this.AmajAKk);
        }
        return false;
    }
    
    synchronized majakmk AMAJAKk(final int n) {
        synchronized (this.AmajAKk) {
            final Enumeration elements = this.AmajAKk.elements();
            if (elements != null) {
                while (elements.hasMoreElements()) {
                    final majakmk majakmk = (majakmk)elements.nextElement();
                    if (majakmk.AkKAMAJ >= n) {
                        final majakmk majakmk2 = majakmk;
                        monitorexit(this.AmajAKk);
                        return majakmk2;
                    }
                }
            }
            monitorexit(this.AmajAKk);
        }
        majakmk majakmk3 = null;
    Block_4:
        while (true) {
            try {
                this.wait();
            }
            catch (final Exception ex) {
                return null;
            }
            final Enumeration elements2 = this.AmajAKk.elements();
            if (elements2 != null) {
                while (elements2.hasMoreElements()) {
                    majakmk3 = (majakmk)elements2.nextElement();
                    if (majakmk3.AkKAMAJ >= n) {
                        break Block_4;
                    }
                }
            }
        }
        return majakmk3;
    }
    
    public void amAJAKk() {
        synchronized (this.AmajAKk) {
            final Enumeration elements = this.AmajAKk.elements();
            if (elements != null) {
                while (elements.hasMoreElements()) {
                    System.out.println(elements.nextElement());
                }
            }
            monitorexit(this.AmajAKk);
        }
    }
    
    kmjakka() {
        this.AmajAKk = new Vector(100);
    }
}
