// 
// Decompiled by Procyon v0.6.0
// 

class kmajkkk
{
    majjkka ajaKKAm;
    public int AJaKKAm;
    boolean aJaKKAm;
    boolean AjAkkAm;
    int ajAkkAm;
    
    kmajkkk() {
        this.JAkkAmA(null);
    }
    
    kmajkkk(final majjkka majjkka) {
        this.JAkkAmA(majjkka);
    }
    
    void JAkkAmA(final majjkka ajaKKAm) {
        if (ajaKKAm == null || !ajaKKAm.AMajAkk) {
            this.AjAkkAm = false;
            this.ajaKKAm = null;
            this.jakkAmA();
            return;
        }
        this.AjAkkAm = true;
        this.ajaKKAm = ajaKKAm;
        this.jakkAmA();
    }
    
    void jakkAmA() {
        this.AJaKKAm = 0;
        this.aJaKKAm = false;
    }
    
    void JakkAmA() {
        this.aJaKKAm = true;
        this.ajAkkAm = 32768;
    }
    
    byte jAkkAmA() {
        final byte amAjAkk = this.ajaKKAm.amAjAkk(this.AJaKKAm);
        this.AJaKKAm = this.ajaKKAm.aMAjAkk(this.AJaKKAm, this.aJaKKAm);
        if (!this.aJaKKAm) {
            return amAjAkk;
        }
        this.ajAkkAm -= this.ajaKKAm.amajAkk;
        if (this.ajAkkAm <= 0) {
            this.ajAkkAm = 0;
            return 0;
        }
        return (byte)(amAjAkk * this.ajAkkAm >> 15);
    }
}
