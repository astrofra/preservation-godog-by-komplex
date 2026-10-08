/*
 * Decompiled with CFR 0.152.
 */
public class maajmka {
    private int KAMAjak;
    private long[] kAMAjak;
    private long KamAjak;
    private long kamAjak;
    private long KAmAjak;

    public maajmka(int n) {
        this(n, 10);
    }

    public maajmka(int n, int n2) {
        super();
        this.KAMAjak = n2;
        this.KAmAjak = n;
        this.kAMAjak = new long[this.KAMAjak];
        this.kaMAjak(this.KAmAjak);
    }

    public void KAMAjak() {
        this.kaMAjak(this.KAmAjak);
    }

    public void kaMAjak(long l) {
        this.KAmAjak = l;
        this.kamAjak = System.currentTimeMillis();
        int n = 0;
        while (n < this.KAMAjak) {
            this.kAMAjak[this.KAMAjak - 1 - n] = this.kamAjak;
            this.kamAjak -= l;
            ++n;
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
        int n = 0;
        while (n < this.KAMAjak - 1) {
            this.kAMAjak[n] = this.kAMAjak[n + 1];
            ++n;
        }
        this.kAMAjak[this.KAMAjak - 1] = System.currentTimeMillis();
        long l = 0L;
        int n2 = 0;
        while (n2 < this.KAMAjak) {
            l += this.kAMAjak[n2] / (long)this.KAMAjak;
            ++n2;
        }
        this.KamAjak = l;
        this.KamAjak -= this.kamAjak;
    }

    public float kAMAjak() {
        return (this.kAMAjak[this.KAMAjak - 1] - this.kAMAjak[0]) / (long)(this.KAMAjak - 2);
    }
}

