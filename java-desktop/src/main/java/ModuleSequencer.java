// 
// Decompiled by Procyon v0.6.0
// 

public class ModuleSequencer
{
    int[] orderTable;
    int restartOrder;
    ModuleSong song;
    boolean repeatCurrentOrder;
    int orderIndex;
    int rowIndex;
    
    public void setRestartOrder(final int maJakKa) {
        this.restartOrder = maJakKa;
    }
    
    public void setSong(final ModuleSong majakKa) {
        this.song = majakKa;
    }
    
    public void loadOrderTable(final byte[] array, final int n, final int n2) {
        this.orderTable = new int[n2];
        for (int i = 0; i < n2; ++i) {
            this.orderTable[i] = (array[i + n] & 0xFF);
        }
    }
    
    public void setRepeatCurrentOrder(final boolean majakKa) {
        this.repeatCurrentOrder = majakKa;
    }
    
    public void rewind() {
        this.seekOrder(0);
    }
    
    public void seekOrder(final int n) {
        this.orderIndex = ((n < 0) ? 0 : ((n < this.orderTable.length) ? n : (this.orderTable.length - 1)));
        this.rowIndex = 0;
    }
    
    public void seekRow(final int n) {
        final ModulePattern mmajkmk = this.song.maJAkKa[this.orderTable[this.orderIndex]];
        this.rowIndex = ((n < 0) ? 0 : ((n < mmajkmk.rowCount) ? n : (mmajkmk.rowCount - 1)));
    }
    
    public void advanceOrder() {
        if (!this.repeatCurrentOrder) {
            ++this.orderIndex;
        }
        if (this.orderIndex < this.orderTable.length) {
            this.seekOrder(this.orderIndex);
            return;
        }
        if (this.restartOrder >= 0 && this.restartOrder < this.orderTable.length) {
            this.seekOrder(this.restartOrder);
            return;
        }
        this.seekOrder(0);
    }
    
    public byte[] nextRow() {
        final ModulePattern mmajkmk = this.song.maJAkKa[this.orderTable[this.orderIndex]];
        final byte[] kKamAJA = mmajkmk.getRow(this.rowIndex);
        ++this.rowIndex;
        if (this.rowIndex == mmajkmk.rowCount) {
            this.advanceOrder();
        }
        return kKamAJA;
    }
    
    public ModuleSequencer() {
        this.repeatCurrentOrder = false;
    }
}
