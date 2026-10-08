// 
// Decompiled by Procyon v0.6.0
// 

final class MovieScanlineEdge extends QuadraticEdge
{
    int AJAkkAm;
    int aJAkkAm;
    MovieScanlineEdge AjakkAm;
    MovieScanlineEdge ajakkAm;
    MovieFillStyle AJakkAm;
    MovieFillStyle aJakkAm;
    int AjAKkAm;
    int ajAKkAm;
    int AJAKkAm;
    int aJAKkAm;
    int AjaKkAm;
    int ajaKkAm;
    int AJaKkAm;
    int aJaKkAm;
    
    final void jaKKAmA(final int n) {
        if (super.ajakKAm) {
            this.AjAKkAm = (super.aJAkKAm - super.aJaKkam << 16) / (super.AjakKAm - super.AjAkKAm);
            this.ajaKkAm = super.aJaKkam << 16;
            final int n2 = n - super.AjAkKAm;
            if (n2 != 0) {
                this.ajaKkAm += this.AjAKkAm * n2;
            }
            this.AjaKkAm = this.ajaKkAm + 32768 >> 16;
            return;
        }
        final int n3 = super.aJaKkam - 2 * super.ajAkKAm + super.aJAkKAm;
        final int n4 = 2 * (super.ajAkKAm - super.aJaKkam);
        final int n5 = super.AjAkKAm - 2 * super.AJAkKAm + super.AjakKAm;
        final int n6 = 2 * (super.AJAkKAm - super.AjAkKAm);
        this.aJaKkAm = 2 * (super.AjakKAm - super.AjAkKAm);
        final int n7 = 16777216 / this.aJaKkAm;
        final int n8 = (int)(n7 * (long)n7 >> 24);
        this.AjAKkAm = n4 * n7;
        this.AJAKkAm = 2 * n3 * n8;
        this.ajAKkAm = n6 * n7;
        this.aJAKkAm = 2 * n5 * n8;
        this.ajaKkAm = super.aJaKkam << 16;
        this.AJaKkAm = super.AjAkKAm << 16;
        this.AjaKkAm = super.aJaKkam;
        if (n > super.AjAkKAm) {
            this.JaKKAmA(n);
        }
    }
    
    final void JaKKAmA(final int n) {
        if (super.ajakKAm) {
            this.ajaKkAm += this.AjAKkAm;
            this.AjaKkAm = this.ajaKkAm + 32768 >> 16;
            return;
        }
        while (this.AJaKkAm < n << 16 && this.aJaKkAm >= 0) {
            this.AJaKkAm += this.ajAKkAm >> 8;
            this.ajAKkAm += this.aJAKkAm;
            this.ajaKkAm += this.AjAKkAm >> 8;
            this.AjAKkAm += this.AJAKkAm;
            --this.aJaKkAm;
        }
        this.AjaKkAm = this.ajaKkAm + 32768 >> 16;
    }
    
    MovieScanlineEdge() {
        this.aJAkkAm = 1;
    }
}
