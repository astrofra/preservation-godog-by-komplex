/*
 * Decompiled with CFR 0.152.
 */
import java.util.Enumeration;
import java.util.Vector;

class kmjakka {
    Vector AmajAKk = new Vector(100);

    synchronized void AmAJAKk(int n, long l) {
        Vector vector = this.AmajAKk;
        synchronized (vector) {
            majakmk majakmk2 = new majakmk(n, l);
            this.AmajAKk.addElement(majakmk2);
            long l2 = System.currentTimeMillis();
            Enumeration enumeration = this.AmajAKk.elements();
            if (enumeration != null) {
                while (enumeration.hasMoreElements()) {
                    majakmk majakmk3 = (majakmk)enumeration.nextElement();
                    if (majakmk3.akKAMAJ > l2) continue;
                    this.AmajAKk.removeElement(majakmk3);
                }
            }
        }
        this.notify();
    }

    int aMAJAKk(int n) {
        majakmk majakmk2 = this.AMAJAKk(n);
        long l = majakmk2.akKAMAJ - System.currentTimeMillis();
        if (l > 0L) {
            try {
                Thread.sleep(l);
            }
            catch (Exception exception) {
                return majakmk2.AkKAMAJ;
            }
        }
        return majakmk2.AkKAMAJ;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean AmaJAKk(int n, int n2) {
        long l = System.currentTimeMillis();
        l += (long)n2;
        Vector vector = this.AmajAKk;
        synchronized (vector) {
            Enumeration enumeration = this.AmajAKk.elements();
            if (enumeration == null) return false;
            int n3 = 0;
            while (enumeration.hasMoreElements()) {
                majakmk majakmk2 = (majakmk)enumeration.nextElement();
                if (n3 == 0 && majakmk2.AkKAMAJ > n) {
                    return true;
                }
                if (majakmk2.AkKAMAJ >= n && majakmk2.akKAMAJ <= l) {
                    return true;
                }
                ++n3;
            }
            return false;
        }
    }

    /*
     * Unable to fully structure code
     */
    synchronized majakmk AMAJAKk(int var1_1) {
        var3_2 = this.AmajAKk;
        synchronized (var3_2) {
            var5_3 = this.AmajAKk.elements();
            if (var5_3 != null) {
                while (var5_3.hasMoreElements()) {
                    var6_4 = (majakmk)var5_3.nextElement();
                    if (var6_4.AkKAMAJ < var1_1) continue;
                    var2_5 = var6_4;
                    var4_7 = null;
                    return var2_5;
                }
            }
        }
        block6: while (true) {
            try {
                this.wait();
            }
            catch (Exception v1) {
                return null;
            }
            var2_6 = this.AmajAKk.elements();
            if (var2_6 == null) continue;
            do {
                if (var2_6.hasMoreElements()) ** break;
                continue block6;
                var3_2 = (majakmk)var2_6.nextElement();
            } while (var3_2.AkKAMAJ < var1_1);
            break;
        }
        return var3_2;
    }

    public void amAJAKk() {
        Vector vector = this.AmajAKk;
        synchronized (vector) {
            Enumeration enumeration = this.AmajAKk.elements();
            if (enumeration != null) {
                while (enumeration.hasMoreElements()) {
                    majakmk majakmk2 = (majakmk)enumeration.nextElement();
                    System.out.println(majakmk2);
                }
            }
            return;
        }
    }

    kmjakka() {
        super();
    }
}

