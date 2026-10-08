/*
 * Decompiled with CFR 0.152.
 */
public class majakka
extends mmaakmk {
    mmjammk amajAKk;
    kmajkkk AMajAKk = new kmajkkk();
    kmajkkk aMajAKk = new kmajkkk();
    int AmAJAKk;
    int amAJAKk;
    int AMAJAKk;
    boolean aMAJAKk = false;

    majakka() {
        super();
    }

    public void AMaJAKk(mmjammk mmjammk2, int n) {
        this.amajAKk = mmjammk2;
        if (this.amajAKk == null) {
            this.AMajAKk.JAkkAmA(null);
            this.aMajAKk.JAkkAmA(null);
            this.KKAmaJa();
            return;
        }
        this.AMajAKk.JAkkAmA(this.amajAKk.JaKKAMa);
        this.aMajAKk.JAkkAmA(this.amajAKk.jaKKAMa);
        this.aMaJAKk();
        int n2 = n < 0 ? 0 : (n > 95 ? 95 : n);
        kmaamka kmaamka2 = this.amajAKk.jAkkAMa[n2];
        super.KKaMAJa(kmaamka2, n);
    }

    public void kkAMAJa() {
        if (this.amajAKk == null) {
            return;
        }
        super.kkAMAJa();
    }

    public void KKAmaJa() {
        if (this.amajAKk != null && this.AMajAKk.AjAkkAm) {
            this.AMajAKk.JakkAmA();
            return;
        }
        super.KKAmaJa();
    }

    void aMaJAKk() {
        if (this.amajAKk.jAKKAMa > 0) {
            this.aMAJAKk = true;
            this.AmAJAKk = 0;
            this.amAJAKk = this.amajAKk.JakKAMa == 0 ? this.amajAKk.jAKKAMa : 0;
            this.amaJAKk();
            return;
        }
        this.aMAJAKk = false;
    }

    int amaJAKk() {
        if (this.amajAKk.JakKAMa != 0) {
            this.amAJAKk += this.amajAKk.jAKKAMa / this.amajAKk.JakKAMa;
            if (this.amAJAKk > this.amajAKk.jAKKAMa) {
                this.amAJAKk = this.amajAKk.jAKKAMa;
            }
        }
        int n = 0;
        switch (this.amajAKk.jakKAMa) {
            case 3: {
                n = (64 - (this.AmAJAKk >> 1) & 0x7F) - 64;
                break;
            }
            case 2: {
                n = (64 + (this.AmAJAKk >> 1) & 0x7F) - 64;
                break;
            }
            case 1: {
                n = (this.AmAJAKk & 0x80) != 0 ? 64 : -64;
                break;
            }
            case 0: {
                n = mmaakmk.aKKAmAj[this.AmAJAKk & 0xFF];
                break;
            }
        }
        this.AmAJAKk += this.amajAKk.JAKKAMa >> 2;
        return n * this.amAJAKk >> 10;
    }

    public void AmAjaKk() {
        byte by;
        if (this.AMajAKk.AjAkkAm) {
            by = this.AMajAKk.jAkkAmA();
            this.KKamaJa(by * this.aKkAMaj >> 6);
        }
        if (this.aMajAKk.AjAkkAm) {
            by = this.aMajAKk.jAkkAmA();
            int n = this.AkKamaj < 128 ? this.AkKamaj : 255 - this.AkKamaj;
            n = (by - 32) * n >> 5;
            this.kkamaJa(this.akKamaj + n);
        }
        if (this.aMAJAKk) {
            this.AMAJAKk = this.amaJAKk();
            this.KKamAJa(this.AMAJAKk);
        }
    }
}

