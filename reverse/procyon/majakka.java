// 
// Decompiled by Procyon v0.6.0
// 

public class majakka extends mmaakmk
{
    mmjammk amajAKk;
    kmajkkk AMajAKk;
    kmajkkk aMajAKk;
    int AmAJAKk;
    int amAJAKk;
    int AMAJAKk;
    boolean aMAJAKk;
    
    majakka() {
        this.aMAJAKk = false;
        this.AMajAKk = new kmajkkk();
        this.aMajAKk = new kmajkkk();
    }
    
    public void AMaJAKk(final mmjammk amajAKk, final int n) {
        this.amajAKk = amajAKk;
        if (this.amajAKk == null) {
            this.AMajAKk.JAkkAmA(null);
            this.aMajAKk.JAkkAmA(null);
            this.KKAmaJa();
            return;
        }
        this.AMajAKk.JAkkAmA(this.amajAKk.JaKKAMa);
        this.aMajAKk.JAkkAmA(this.amajAKk.jaKKAMa);
        this.aMaJAKk();
        super.KKaMAJa(this.amajAKk.jAkkAMa[(n < 0) ? 0 : ((n > 95) ? 95 : n)], n);
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
            this.amAJAKk = ((this.amajAKk.JakKAMa == 0) ? this.amajAKk.jAKKAMa : 0);
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
                n = (((this.AmAJAKk & 0x80) != 0x0) ? 64 : -64);
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
        if (this.AMajAKk.AjAkkAm) {
            this.KKamaJa(this.AMajAKk.jAkkAmA() * super.aKkAMaj >> 6);
        }
        if (this.aMajAKk.AjAkkAm) {
            this.kkamaJa(super.akKamaj + ((this.aMajAKk.jAkkAmA() - 32) * ((super.AkKamaj < 128) ? super.AkKamaj : (255 - super.AkKamaj)) >> 5));
        }
        if (this.aMAJAKk) {
            this.KKamAJa(this.AMAJAKk = this.amaJAKk());
        }
    }
}
