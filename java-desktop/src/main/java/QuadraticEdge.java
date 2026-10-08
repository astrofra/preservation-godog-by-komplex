import java.awt.Point;

// 
// Decompiled by Procyon v0.6.0
// 

class QuadraticEdge
{
    int aJaKkam;
    int AjAkKAm;
    int ajAkKAm;
    int AJAkKAm;
    int aJAkKAm;
    int AjakKAm;
    boolean ajakKAm;
    
    QuadraticEdge() {
        this.ajakKAm = false;
    }
    
    QuadraticEdge(final QuadraticEdge majjkkk) {
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
    
    final QuadraticEdge AKKaMAj(final int n) {
        final QuadraticEdge majjkkk = new QuadraticEdge();
        majjkkk.aJAkKAm = this.aJAkKAm;
        majjkkk.AjakKAm = this.AjakKAm;
        majjkkk.ajAkKAm = (int)(n * (long)(this.aJAkKAm - this.ajAkKAm) + 32768L >> 16) + this.ajAkKAm;
        majjkkk.AJAkKAm = (int)(n * (long)(this.AjakKAm - this.AJAkKAm) + 32768L >> 16) + this.AJAkKAm;
        this.ajAkKAm = (int)(n * (long)(this.ajAkKAm - this.aJaKkam) + 32768L >> 16) + this.aJaKkam;
        this.AJAkKAm = (int)(n * (long)(this.AJAkKAm - this.AjAkKAm) + 32768L >> 16) + this.AjAkKAm;
        final QuadraticEdge majjkkk2 = majjkkk;
        final int n2 = (int)(n * (long)(majjkkk.ajAkKAm - this.ajAkKAm) + 32768L >> 16) + this.ajAkKAm;
        majjkkk2.aJaKkam = n2;
        this.aJAkKAm = n2;
        final QuadraticEdge majjkkk3 = majjkkk;
        final int n3 = (int)(n * (long)(majjkkk.AJAkKAm - this.AJAkKAm) + 32768L >> 16) + this.AJAkKAm;
        majjkkk3.AjAkKAm = n3;
        this.AjakKAm = n3;
        majjkkk.ajakKAm = this.ajakKAm;
        return majjkkk;
    }
    
    final int AkKaMAj() {
        return MovieTransform.aKkAmAJ(this.ajAkKAm - (this.aJaKkam + this.aJAkKAm) / 2, this.AJAkKAm - (this.AjAkKAm + this.AjakKAm) / 2);
    }
    
    final int akKaMAj(final Point point, int n) {
        final MovieBounds kaajmmk = new MovieBounds(this.aJaKkam, this.AjAkKAm, this.aJAkKAm, this.AjakKAm);
        if (this.ajAkKAm < kaajmmk.minX) {
            kaajmmk.minX = this.ajAkKAm;
        }
        else if (this.ajAkKAm > kaajmmk.maxX) {
            kaajmmk.maxX = this.ajAkKAm;
        }
        if (this.AJAkKAm < kaajmmk.minY) {
            kaajmmk.minY = this.AJAkKAm;
        }
        else if (this.AJAkKAm > kaajmmk.maxY) {
            kaajmmk.maxY = this.AJAkKAm;
        }
        if (kaajmmk.maxX < point.x || kaajmmk.minY > point.y || kaajmmk.maxY <= point.y) {
            return 0;
        }
        if (kaajmmk.contains(point) && n < 12 && MovieTransform.aKkAmAJ(kaajmmk.maxX - kaajmmk.minX, kaajmmk.maxY - kaajmmk.minY) > 4) {
            final QuadraticEdge majjkkk = new QuadraticEdge(this);
            final QuadraticEdge akKaMAj = majjkkk.AKKaMAj(32768);
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
