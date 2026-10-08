import java.awt.Point;

// 
// Decompiled by Procyon v0.6.0
// 

class Envelope
{
    byte[] values;
    int sustainPosition;
    int loopStart;
    int loopEnd;
    int fadeoutStep;
    public boolean enabled;
    public boolean loopEnabled;
    public boolean sustainEnabled;
    
    Envelope(final byte[] amAjAkk, final int amAjAkk2, final int amAjAkk3, final int amajAkk) {
        this.enabled = true;
        this.loopEnabled = false;
        this.sustainEnabled = false;
        this.values = amAjAkk;
        this.sustainPosition = amAjAkk2;
        this.loopStart = amAjAkk3;
        this.loopEnd = amajAkk;
    }
    
    Envelope(final Point[] array, final int n, final int n2, final int n3) {
        this.enabled = true;
        this.loopEnabled = false;
        this.sustainEnabled = false;
        if (n < array.length) {
            this.sustainPosition = array[n].x;
        }
        if (n2 < array.length) {
            this.loopStart = array[n2].x;
        }
        if (n3 < array.length) {
            this.loopEnd = array[n3].x;
        }
        if (array.length < 1) {
            this.values = null;
            return;
        }
        this.values = new byte[array[array.length - 1].x + 1];
        int i = 0;
        for (int j = 0; j < array.length - 1; ++j) {
            final int x = array[j].x;
            final int y = array[j].y;
            final int x2 = array[j + 1].x;
            final int y2 = array[j + 1].y;
            final int n4 = y << 8;
            final int n5 = y2 << 8;
            int n6 = n4;
            final int n7 = (n5 - n4) / (x2 - x);
            for (i = x; i < x2; ++i) {
                if (i >= this.values.length) {
                    return;
                }
                this.values[i] = (byte)(n6 >> 8);
                n6 += n7;
            }
        }
        this.values[i] = (byte)array[array.length - 1].y;
    }
    
    public void setFadeoutStep(final int amajAkk) {
        this.fadeoutStep = amajAkk;
    }
    
    public byte valueAt(final int n) {
        if (n > this.values.length) {
            return this.values[this.values.length - 1];
        }
        return this.values[n];
    }
    
    public int advancePosition(int n, final boolean b) {
        ++n;
        if (b) {
            if (this.loopEnabled && n != this.sustainPosition && n >= this.loopEnd) {
                n = this.loopStart;
            }
        }
        else {
            if (this.sustainEnabled && n >= this.sustainPosition) {
                n = this.sustainPosition;
            }
            if (this.loopEnabled && n >= this.loopEnd) {
                n = this.loopStart;
            }
        }
        if (n >= this.values.length) {
            n = this.values.length - 1;
        }
        return n;
    }
    
    public String toString() {
        String obj = "[" + this.values.length + "] {";
        for (int i = 0; i < this.values.length; ++i) {
            obj = String.valueOf(obj) + this.values[i] + ", ";
        }
        return obj;
    }
}
