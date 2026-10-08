import java.awt.Point;

// 
// Decompiled by Procyon v0.6.0
// 

class majjkkk
{
    int aJaKkam;
    int AjAkKAm;
    int ajAkKAm;
    int AJAkKAm;
    int aJAkKAm;
    int AjakKAm;
    boolean ajakKAm;
    
    majjkkk() {
        this.ajakKAm = false;
    }
    
    majjkkk(final majjkkk majjkkk) {
        this.ajakKAm = false;
        this.aJaKkam = majjkkk.aJaKkam;
        this.AjAkKAm = majjkkk.AjAkKAm;
        this.aJAkKAm = majjkkk.aJAkKAm;
        this.AjakKAm = majjkkk.AjakKAm;
        this.ajAkKAm = majjkkk.ajAkKAm;
        this.AJAkKAm = majjkkk.AJAkKAm;
        this.ajakKAm = majjkkk.ajakKAm;
    }
    
    final void aKkAmaj(final Point point, final Point point2) {
        this.aJaKkam = point.x;
        this.AjAkKAm = point.y;
        this.aJAkKAm = point2.x;
        this.AjakKAm = point2.y;
        this.ajAkKAm = (this.aJaKkam + this.aJAkKAm) / 2;
        this.AJAkKAm = (this.AjAkKAm + this.AjakKAm) / 2;
        this.ajakKAm = true;
    }
    
    final void aKKaMAj(final Point point, final Point point2, final Point point3) {
        this.aJaKkam = point.x;
        this.AjAkKAm = point.y;
        this.aJAkKAm = point3.x;
        this.AjakKAm = point3.y;
        this.ajAkKAm = point2.x;
        this.AJAkKAm = point2.y;
        this.ajakKAm = false;
    }
    
    final majjkkk AKKaMAj(final int n) {
        final majjkkk majjkkk = new majjkkk();
        majjkkk.aJAkKAm = this.aJAkKAm;
        majjkkk.AjakKAm = this.AjakKAm;
        majjkkk.ajAkKAm = (int)(n * (long)(this.aJAkKAm - this.ajAkKAm) + 32768L >> 16) + this.ajAkKAm;
        majjkkk.AJAkKAm = (int)(n * (long)(this.AjakKAm - this.AJAkKAm) + 32768L >> 16) + this.AJAkKAm;
        this.ajAkKAm = (int)(n * (long)(this.ajAkKAm - this.aJaKkam) + 32768L >> 16) + this.aJaKkam;
        this.AJAkKAm = (int)(n * (long)(this.AJAkKAm - this.AjAkKAm) + 32768L >> 16) + this.AjAkKAm;
        final majjkkk majjkkk2 = majjkkk;
        final int n2 = (int)(n * (long)(majjkkk.ajAkKAm - this.ajAkKAm) + 32768L >> 16) + this.ajAkKAm;
        majjkkk2.aJaKkam = n2;
        this.aJAkKAm = n2;
        final majjkkk majjkkk3 = majjkkk;
        final int n3 = (int)(n * (long)(majjkkk.AJAkKAm - this.AJAkKAm) + 32768L >> 16) + this.AJAkKAm;
        majjkkk3.AjAkKAm = n3;
        this.AjakKAm = n3;
        majjkkk.ajakKAm = this.ajakKAm;
        return majjkkk;
    }
    
    final int AkKaMAj() {
        return kmaammk.aKkAmAJ(this.ajAkKAm - (this.aJaKkam + this.aJAkKAm) / 2, this.AJAkKAm - (this.AjAkKAm + this.AjakKAm) / 2);
    }
    
    final int akKaMAj(final Point point, int n) {
        final kaajmmk kaajmmk = new kaajmmk(this.aJaKkam, this.AjAkKAm, this.aJAkKAm, this.AjakKAm);
        if (this.ajAkKAm < kaajmmk.jAKkAMa) {
            kaajmmk.jAKkAMa = this.ajAkKAm;
        }
        else if (this.ajAkKAm > kaajmmk.jakkAMa) {
            kaajmmk.jakkAMa = this.ajAkKAm;
        }
        if (this.AJAkKAm < kaajmmk.JakkAMa) {
            kaajmmk.JakkAMa = this.AJAkKAm;
        }
        else if (this.AJAkKAm > kaajmmk.JAkkAMa) {
            kaajmmk.JAkkAMa = this.AJAkKAm;
        }
        if (kaajmmk.jakkAMa < point.x || kaajmmk.JakkAMa > point.y || kaajmmk.JAkkAMa <= point.y) {
            return 0;
        }
        if (kaajmmk.AkKaMAJ(point) && n < 12 && kmaammk.aKkAmAJ(kaajmmk.jakkAMa - kaajmmk.jAKkAMa, kaajmmk.JAkkAMa - kaajmmk.JakkAMa) > 4) {
            final majjkkk majjkkk = new majjkkk(this);
            final majjkkk akKaMAj = majjkkk.AKKaMAj(32768);
            ++n;
            return majjkkk.akKaMAj(point, n) + akKaMAj.akKaMAj(point, n);
        }
        int ajAkKAm = this.AjAkKAm;
        int ajakKAm = this.AjakKAm;
        if (ajAkKAm == ajakKAm) {
            return 0;
        }
        if (ajAkKAm > ajakKAm) {
            final int n2 = ajAkKAm;
            ajAkKAm = ajakKAm;
            ajakKAm = n2;
        }
        if (point.y >= ajAkKAm && point.y < ajakKAm) {
            return 1;
        }
        return 0;
    }
}
