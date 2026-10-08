/*
 * Decompiled with CFR 0.152.
 */
class kmajkkk {
    majjkka ajaKKAm;
    public int AJaKKAm;
    boolean aJaKKAm;
    boolean AjAkkAm;
    int ajAkkAm;

    kmajkkk() {
        super();
        this.JAkkAmA(null);
    }

    kmajkkk(majjkka majjkka2) {
        super();
        this.JAkkAmA(majjkka2);
    }

    void JAkkAmA(majjkka majjkka2) {
        if (majjkka2 == null || !majjkka2.AMajAkk) {
            this.AjAkkAm = false;
            this.ajaKKAm = null;
            this.jakkAmA();
            return;
        }
        this.AjAkkAm = true;
        this.ajaKKAm = majjkka2;
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
        byte by = this.ajaKKAm.amAjAkk(this.AJaKKAm);
        this.AJaKKAm = this.ajaKKAm.aMAjAkk(this.AJaKKAm, this.aJaKKAm);
        if (this.aJaKKAm) {
            this.ajAkkAm -= this.ajaKKAm.amajAkk;
            if (this.ajAkkAm <= 0) {
                this.ajAkkAm = 0;
                return 0;
            }
            byte by2 = (byte)(by * this.ajAkkAm >> 15);
            return by2;
        }
        return by;
    }
}

