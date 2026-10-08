// 
// Decompiled by Procyon v0.6.0
// 

public class ModulePattern
{
    public int rowCount;
    int channelCount;
    byte[][] rows;
    static final int NOTE_OFFSET = 0;
    static final int INSTRUMENT_OFFSET = 1;
    static final int VOLUME_OFFSET = 2;
    static final int EFFECT_OFFSET = 3;
    static final int EFFECT_PARAMETER_OFFSET = 4;
    
    ModulePattern(final int akKaMaJ, final int akKaMaJ2) {
        this.rowCount = akKaMaJ;
        this.channelCount = akKaMaJ2;
        this.rows = new byte[akKaMaJ][akKaMaJ2 * 5];
    }
    
    void setCell(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        final byte[] array = this.rows[n];
        final int n8 = n2 * 5;
        array[n8] = (byte)n3;
        array[n8 + 1] = (byte)n4;
        array[n8 + 2] = (byte)n5;
        array[n8 + 3] = (byte)n6;
        array[n8 + 4] = (byte)n7;
    }
    
    byte[] getRow(final int n) {
        return this.rows[n];
    }
}
