// 
// Decompiled by Procyon v0.6.0
// 

public class SmoothedFrameTimer
{
    private int sampleCount;
    private long[] timestamps;
    private long elapsedMillis;
    private long originMillis;
    private long initialFrameMillis;
    
    public SmoothedFrameTimer(final int n) {
        this(n, 10);
    }
    
    public SmoothedFrameTimer(final int n, final int kamAjak) {
        this.sampleCount = kamAjak;
        this.initialFrameMillis = n;
        this.timestamps = new long[this.sampleCount];
        this.resetWithFrameDuration(this.initialFrameMillis);
    }
    
    public void reset() {
        this.resetWithFrameDuration(this.initialFrameMillis);
    }
    
    public void resetWithFrameDuration(final long kAmAjak) {
        this.initialFrameMillis = kAmAjak;
        this.originMillis = System.currentTimeMillis();
        for (int i = 0; i < this.sampleCount; ++i) {
            this.timestamps[this.sampleCount - 1 - i] = this.originMillis;
            this.originMillis -= kAmAjak;
        }
        this.originMillis = 0L;
        this.recordFrame();
        this.originMillis = this.elapsedMillis;
        this.elapsedMillis = 0L;
    }
    
    public long getElapsedMillis() {
        return this.elapsedMillis;
    }
    
    public void recordFrame() {
        for (int i = 0; i < this.sampleCount - 1; ++i) {
            this.timestamps[i] = this.timestamps[i + 1];
        }
        this.timestamps[this.sampleCount - 1] = System.currentTimeMillis();
        long kamAjak = 0L;
        for (int j = 0; j < this.sampleCount; ++j) {
            kamAjak += this.timestamps[j] / this.sampleCount;
        }
        this.elapsedMillis = kamAjak;
        this.elapsedMillis -= this.originMillis;
    }
    
    public float getAverageFrameMillis() {
        return (float)((this.timestamps[this.sampleCount - 1] - this.timestamps[0]) / (this.sampleCount - 2));
    }
}
