/*
 * Decompiled with CFR 0.152.
 */
final class maajkkk
extends majjkkk {
    int AJAkkAm;
    int aJAkkAm = 1;
    maajkkk AjakkAm;
    maajkkk ajakkAm;
    kaaammk AJakkAm;
    kaaammk aJakkAm;
    int AjAKkAm;
    int ajAKkAm;
    int AJAKkAm;
    int aJAKkAm;
    int AjaKkAm;
    int ajaKkAm;
    int AJaKkAm;
    int aJaKkAm;

    final void jaKKAmA(int n) {
        if (this.ajakKAm) {
            this.AjAKkAm = (this.aJAkKAm - this.aJaKkam << 16) / (this.AjakKAm - this.AjAkKAm);
            this.ajaKkAm = this.aJaKkam << 16;
            int n2 = n - this.AjAkKAm;
            if (n2 != 0) {
                this.ajaKkAm += this.AjAKkAm * n2;
            }
            this.AjaKkAm = this.ajaKkAm + 32768 >> 16;
            return;
        }
        int n3 = this.aJaKkam - 2 * this.ajAkKAm + this.aJAkKAm;
        int n4 = 2 * (this.ajAkKAm - this.aJaKkam);
        int n5 = this.AjAkKAm - 2 * this.AJAkKAm + this.AjakKAm;
        int n6 = 2 * (this.AJAkKAm - this.AjAkKAm);
        this.aJaKkAm = 2 * (this.AjakKAm - this.AjAkKAm);
        int n7 = 0x1000000 / this.aJaKkAm;
        int n8 = (int)((long)n7 * (long)n7 >> 24);
        this.AjAKkAm = n4 * n7;
        this.AJAKkAm = 2 * n3 * n8;
        this.ajAKkAm = n6 * n7;
        this.aJAKkAm = 2 * n5 * n8;
        this.ajaKkAm = this.aJaKkam << 16;
        this.AJaKkAm = this.AjAkKAm << 16;
        this.AjaKkAm = this.aJaKkam;
        if (n > this.AjAkKAm) {
            this.JaKKAmA(n);
        }
    }

    final void JaKKAmA(int n) {
        if (this.ajakKAm) {
            this.ajaKkAm += this.AjAKkAm;
            this.AjaKkAm = this.ajaKkAm + 32768 >> 16;
            return;
        }
        int n2 = n << 16;
        while (this.AJaKkAm < n2 && this.aJaKkAm >= 0) {
            this.AJaKkAm += this.ajAKkAm >> 8;
            this.ajAKkAm += this.aJAKkAm;
            this.ajaKkAm += this.AjAKkAm >> 8;
            this.AjAKkAm += this.AJAKkAm;
            --this.aJaKkAm;
        }
        this.AjaKkAm = this.ajaKkAm + 32768 >> 16;
    }

    maajkkk() {
        super();
    }
}

