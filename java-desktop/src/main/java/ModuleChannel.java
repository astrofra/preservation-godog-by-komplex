// 
// Decompiled by Procyon v0.6.0
// 

public class ModuleChannel extends ModuleVoice
{
    ModuleInstrument amajAKk;
    EnvelopeCursor AMajAKk;
    EnvelopeCursor aMajAKk;
    int AmAJAKk;
    int amAJAKk;
    int AMAJAKk;
    boolean aMAJAKk;
    
    ModuleChannel() {
        this.aMAJAKk = false;
        this.AMajAKk = new EnvelopeCursor();
        this.aMajAKk = new EnvelopeCursor();
    }
    
    public void AMaJAKk(final ModuleInstrument amajAKk, final int n) {
        this.amajAKk = amajAKk;
        if (this.amajAKk == null) {
            this.AMajAKk.setEnvelope(null);
            this.aMajAKk.setEnvelope(null);
            this.KKAmaJa();
            return;
        }
        this.AMajAKk.setEnvelope(this.amajAKk.volumeEnvelope);
        this.aMajAKk.setEnvelope(this.amajAKk.panningEnvelope);
        this.aMaJAKk();
        super.KKaMAJa(this.amajAKk.sampleByNote[(n < 0) ? 0 : ((n > 95) ? 95 : n)], n);
    }
    
    public void kkAMAJa() {
        if (this.amajAKk == null) {
            return;
        }
        super.kkAMAJa();
    }
    
    public void KKAmaJa() {
        if (this.amajAKk != null && this.AMajAKk.enabled) {
            this.AMajAKk.release();
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
                n = ModuleVoice.aKKAmAj[this.AmAJAKk & 0xFF];
                break;
            }
        }
        this.AmAJAKk += this.amajAKk.JAKKAMa >> 2;
        return n * this.amAJAKk >> 10;
    }
    
    public void AmAjaKk() {
        if (this.AMajAKk.enabled) {
            this.KKamaJa(this.AMajAKk.nextValue() * super.aKkAMaj >> 6);
        }
        if (this.aMajAKk.enabled) {
            this.kkamaJa(super.akKamaj + ((this.aMajAKk.nextValue() - 32) * ((super.AkKamaj < 128) ? super.AkKamaj : (255 - super.AkKamaj)) >> 5));
        }
        if (this.aMAJAKk) {
            this.KKamAJa(this.AMAJAKk = this.amaJAKk());
        }
    }
}
