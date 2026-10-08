/*
 * Decompiled with CFR 0.152.
 */
public class kmaakkk {
    int[] MAJakKa;
    int mAJakKa;
    maaakkk MajakKa;
    boolean majakKa = false;
    int MAjakKa;
    int mAjakKa;

    public void jAKKama(int n) {
        this.mAJakKa = n;
    }

    public void JAKKama(maaakkk maaakkk2) {
        this.MajakKa = maaakkk2;
    }

    public void jAkKama(byte[] byArray, int n, int n2) {
        this.MAJakKa = new int[n2];
        int n3 = 0;
        while (n3 < n2) {
            this.MAJakKa[n3] = byArray[n3 + n] & 0xFF;
            ++n3;
        }
    }

    public void jaKKama(boolean bl) {
        this.majakKa = bl;
    }

    public void jakKama() {
        this.JaKKama(0);
    }

    public void JaKKama(int n) {
        this.MAjakKa = n < 0 ? 0 : (n < this.MAJakKa.length ? n : this.MAJakKa.length - 1);
        this.mAjakKa = 0;
    }

    public void JAkKama(int n) {
        mmajkmk mmajkmk2 = this.MajakKa.maJAkKa[this.MAJakKa[this.MAjakKa]];
        this.mAjakKa = n < 0 ? 0 : (n < mmajkmk2.akKaMaJ ? n : mmajkmk2.akKaMaJ - 1);
    }

    public void JaKkAMa() {
        if (!this.majakKa) {
            ++this.MAjakKa;
        }
        if (this.MAjakKa < this.MAJakKa.length) {
            this.JaKKama(this.MAjakKa);
            return;
        }
        if (this.mAJakKa >= 0 && this.mAJakKa < this.MAJakKa.length) {
            this.JaKKama(this.mAJakKa);
            return;
        }
        this.JaKKama(0);
    }

    public byte[] JakKama() {
        mmajkmk mmajkmk2 = this.MajakKa.maJAkKa[this.MAJakKa[this.MAjakKa]];
        byte[] byArray = mmajkmk2.kKamAJA(this.mAjakKa);
        ++this.mAjakKa;
        if (this.mAjakKa == mmajkmk2.akKaMaJ) {
            this.JaKkAMa();
        }
        return byArray;
    }

    public kmaakkk() {
        super();
    }
}

