// 
// Decompiled by Procyon v0.6.0
// 

public class maajmka
{
    private int KAMAjak;
    private long[] kAMAjak;
    private long KamAjak;
    private long kamAjak;
    private long KAmAjak;
    
    public maajmka(final int n) {
        this(n, 10);
    }
    
    public maajmka(final int n, final int kamAjak) {
        this.KAMAjak = kamAjak;
        this.KAmAjak = n;
        this.kAMAjak = new long[this.KAMAjak];
        this.kaMAjak(this.KAmAjak);
    }
    
    public void KAMAjak() {
        this.kaMAjak(this.KAmAjak);
    }
    
    public void kaMAjak(final long kAmAjak) {
        this.KAmAjak = kAmAjak;
        this.kamAjak = System.currentTimeMillis();
        for (int i = 0; i < this.KAMAjak; ++i) {
            this.kAMAjak[this.KAMAjak - 1 - i] = this.kamAjak;
            this.kamAjak -= kAmAjak;
        }
        this.kamAjak = 0L;
        this.KaMAjak();
        this.kamAjak = this.KamAjak;
        this.KamAjak = 0L;
    }
    
    public long kAmajak() {
        return this.KamAjak;
    }
    
    public void KaMAjak() {
        for (int i = 0; i < this.KAMAjak - 1; ++i) {
            this.kAMAjak[i] = this.kAMAjak[i + 1];
        }
        this.kAMAjak[this.KAMAjak - 1] = System.currentTimeMillis();
        long kamAjak = 0L;
        for (int j = 0; j < this.KAMAjak; ++j) {
            kamAjak += this.kAMAjak[j] / this.KAMAjak;
        }
        this.KamAjak = kamAjak;
        this.KamAjak -= this.kamAjak;
    }
    
    public float kAMAjak() {
        return (float)((this.kAMAjak[this.KAMAjak - 1] - this.kAMAjak[0]) / (this.KAMAjak - 2));
    }
}
