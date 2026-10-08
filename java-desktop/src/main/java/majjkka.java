import java.awt.Point;

// 
// Decompiled by Procyon v0.6.0
// 

class majjkka
{
    byte[] amAjAkk;
    int AMAjAkk;
    int aMAjAkk;
    int AmajAkk;
    int amajAkk;
    public boolean AMajAkk;
    public boolean aMajAkk;
    public boolean AmAJAkk;
    
    majjkka(final byte[] amAjAkk, final int amAjAkk2, final int amAjAkk3, final int amajAkk) {
        this.AMajAkk = true;
        this.aMajAkk = false;
        this.AmAJAkk = false;
        this.amAjAkk = amAjAkk;
        this.AMAjAkk = amAjAkk2;
        this.aMAjAkk = amAjAkk3;
        this.AmajAkk = amajAkk;
    }
    
    majjkka(final Point[] array, final int n, final int n2, final int n3) {
        this.AMajAkk = true;
        this.aMajAkk = false;
        this.AmAJAkk = false;
        if (n < array.length) {
            this.AMAjAkk = array[n].x;
        }
        if (n2 < array.length) {
            this.aMAjAkk = array[n2].x;
        }
        if (n3 < array.length) {
            this.AmajAkk = array[n3].x;
        }
        if (array.length < 1) {
            this.amAjAkk = null;
            return;
        }
        this.amAjAkk = new byte[array[array.length - 1].x + 1];
        int i = 0;
        for (int j = 0; j < array.length - 1; ++j) {
            final int x = array[j].x;
            final int y = array[j].y;
            final int x2 = array[j + 1].x;
            final int y2 = array[j + 1].y;
            final int n4 = y << 8;
            final int n5 = y2 << 8;
            int n6 = n4;
            final int n7 = (n5 - n4) / (x2 - x);
            for (i = x; i < x2; ++i) {
                if (i >= this.amAjAkk.length) {
                    return;
                }
                this.amAjAkk[i] = (byte)(n6 >> 8);
                n6 += n7;
            }
        }
        this.amAjAkk[i] = (byte)array[array.length - 1].y;
    }
    
    public void AMAjAkk(final int amajAkk) {
        this.amajAkk = amajAkk;
    }
    
    public byte amAjAkk(final int n) {
        if (n > this.amAjAkk.length) {
            return this.amAjAkk[this.amAjAkk.length - 1];
        }
        return this.amAjAkk[n];
    }
    
    public int aMAjAkk(int n, final boolean b) {
        ++n;
        if (b) {
            if (this.aMajAkk && n != this.AMAjAkk && n >= this.AmajAkk) {
                n = this.aMAjAkk;
            }
        }
        else {
            if (this.AmAJAkk && n >= this.AMAjAkk) {
                n = this.AMAjAkk;
            }
            if (this.aMajAkk && n >= this.AmajAkk) {
                n = this.aMAjAkk;
            }
        }
        if (n >= this.amAjAkk.length) {
            n = this.amAjAkk.length - 1;
        }
        return n;
    }
    
    public String toString() {
        String obj = "[" + this.amAjAkk.length + "] {";
        for (int i = 0; i < this.amAjAkk.length; ++i) {
            obj = String.valueOf(obj) + this.amAjAkk[i] + ", ";
        }
        return obj;
    }
}
