// 
// Decompiled by Procyon v0.6.0
// 

public class kmaakkk
{
    int[] MAJakKa;
    int mAJakKa;
    maaakkk MajakKa;
    boolean majakKa;
    int MAjakKa;
    int mAjakKa;
    
    public void jAKKama(final int maJakKa) {
        this.mAJakKa = maJakKa;
    }
    
    public void JAKKama(final maaakkk majakKa) {
        this.MajakKa = majakKa;
    }
    
    public void jAkKama(final byte[] array, final int n, final int n2) {
        this.MAJakKa = new int[n2];
        for (int i = 0; i < n2; ++i) {
            this.MAJakKa[i] = (array[i + n] & 0xFF);
        }
    }
    
    public void jaKKama(final boolean majakKa) {
        this.majakKa = majakKa;
    }
    
    public void jakKama() {
        this.JaKKama(0);
    }
    
    public void JaKKama(final int n) {
        this.MAjakKa = ((n < 0) ? 0 : ((n < this.MAJakKa.length) ? n : (this.MAJakKa.length - 1)));
        this.mAjakKa = 0;
    }
    
    public void JAkKama(final int n) {
        final mmajkmk mmajkmk = this.MajakKa.maJAkKa[this.MAJakKa[this.MAjakKa]];
        this.mAjakKa = ((n < 0) ? 0 : ((n < mmajkmk.akKaMaJ) ? n : (mmajkmk.akKaMaJ - 1)));
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
        final mmajkmk mmajkmk = this.MajakKa.maJAkKa[this.MAJakKa[this.MAjakKa]];
        final byte[] kKamAJA = mmajkmk.kKamAJA(this.mAjakKa);
        ++this.mAjakKa;
        if (this.mAjakKa == mmajkmk.akKaMaJ) {
            this.JaKkAMa();
        }
        return kKamAJA;
    }
    
    public kmaakkk() {
        this.majakKa = false;
    }
}
