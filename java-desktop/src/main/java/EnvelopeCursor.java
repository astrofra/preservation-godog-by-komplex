// 
// Decompiled by Procyon v0.6.0
// 

class EnvelopeCursor
{
    Envelope envelope;
    public int position;
    boolean released;
    boolean enabled;
    int fadeoutLevel;
    
    EnvelopeCursor() {
        this.setEnvelope(null);
    }
    
    EnvelopeCursor(final Envelope majjkka) {
        this.setEnvelope(majjkka);
    }
    
    void setEnvelope(final Envelope ajaKKAm) {
        if (ajaKKAm == null || !ajaKKAm.enabled) {
            this.enabled = false;
            this.envelope = null;
            this.reset();
            return;
        }
        this.enabled = true;
        this.envelope = ajaKKAm;
        this.reset();
    }
    
    void reset() {
        this.position = 0;
        this.released = false;
    }
    
    void release() {
        this.released = true;
        this.fadeoutLevel = 32768;
    }
    
    byte nextValue() {
        final byte amAjAkk = this.envelope.valueAt(this.position);
        this.position = this.envelope.advancePosition(this.position, this.released);
        if (!this.released) {
            return amAjAkk;
        }
        this.fadeoutLevel -= this.envelope.fadeoutStep;
        if (this.fadeoutLevel <= 0) {
            this.fadeoutLevel = 0;
            return 0;
        }
        return (byte)(amAjAkk * this.fadeoutLevel >> 15);
    }
}
