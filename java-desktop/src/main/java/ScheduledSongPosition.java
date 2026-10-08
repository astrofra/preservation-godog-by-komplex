// 
// Decompiled by Procyon v0.6.0
// 

class ScheduledSongPosition
{
    public int position;
    public long timestampMillis;
    
    ScheduledSongPosition(final int akKAMAJ, final long akKAMAJ2) {
        this.position = akKAMAJ;
        this.timestampMillis = akKAMAJ2;
    }
    
    public String toString() {
        return "pos=0x" + Integer.toHexString(this.position) + " time=" + this.timestampMillis;
    }
}
