/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

class majjkka {
    byte[] amAjAkk;
    int AMAjAkk;
    int aMAjAkk;
    int AmajAkk;
    int amajAkk;
    public boolean AMajAkk = true;
    public boolean aMajAkk = false;
    public boolean AmAJAkk = false;

    majjkka(byte[] byArray, int n, int n2, int n3) {
        super();
        this.amAjAkk = byArray;
        this.AMAjAkk = n;
        this.aMAjAkk = n2;
        this.AmajAkk = n3;
    }

    majjkka(Point[] pointArray, int n, int n2, int n3) {
        super();
        if (n < pointArray.length) {
            this.AMAjAkk = pointArray[n].x;
        }
        if (n2 < pointArray.length) {
            this.aMAjAkk = pointArray[n2].x;
        }
        if (n3 < pointArray.length) {
            this.AmajAkk = pointArray[n3].x;
        }
        if (pointArray.length < 1) {
            this.amAjAkk = null;
            return;
        }
        this.amAjAkk = new byte[pointArray[pointArray.length - 1].x + 1];
        int n4 = 0;
        int n5 = 0;
        while (n5 < pointArray.length - 1) {
            int n6 = pointArray[n5].x;
            int n7 = pointArray[n5].y;
            int n8 = pointArray[n5 + 1].x;
            int n9 = pointArray[n5 + 1].y;
            int n10 = n7 <<= 8;
            int n11 = ((n9 <<= 8) - n7) / (n8 - n6);
            n4 = n6;
            while (n4 < n8) {
                if (n4 >= this.amAjAkk.length) {
                    return;
                }
                this.amAjAkk[n4] = (byte)(n10 >> 8);
                n10 += n11;
                ++n4;
            }
            ++n5;
        }
        this.amAjAkk[n4] = (byte)pointArray[pointArray.length - 1].y;
    }

    public void AMAjAkk(int n) {
        this.amajAkk = n;
    }

    public byte amAjAkk(int n) {
        if (n > this.amAjAkk.length) {
            return this.amAjAkk[this.amAjAkk.length - 1];
        }
        return this.amAjAkk[n];
    }

    public int aMAjAkk(int n, boolean bl) {
        ++n;
        if (bl) {
            if (this.aMajAkk && n != this.AMAjAkk && n >= this.AmajAkk) {
                n = this.aMAjAkk;
            }
        } else {
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
        String string = "[" + this.amAjAkk.length + "] {";
        int n = 0;
        while (n < this.amAjAkk.length) {
            string = String.valueOf(string) + this.amAjAkk[n] + ", ";
            ++n;
        }
        return string;
    }
}

