import java.awt.Point;

// 
// Decompiled by Procyon v0.6.0
// 

final class kaajmmk
{
    int jAKkAMa;
    int JakkAMa;
    int jakkAMa;
    int JAkkAMa;
    
    kaajmmk() {
        final int n = Integer.MIN_VALUE;
        this.JAkkAMa = n;
        this.jakkAMa = n;
        this.JakkAMa = n;
        this.jAKkAMa = n;
    }
    
    kaajmmk(final kaajmmk kaajmmk) {
        this.jAKkAMa = kaajmmk.jAKkAMa;
        this.JakkAMa = kaajmmk.JakkAMa;
        this.jakkAMa = kaajmmk.jakkAMa;
        this.JAkkAMa = kaajmmk.JAkkAMa;
    }
    
    kaajmmk(final int n, final int n2, final int n3, final int n4) {
        if (n < n3) {
            this.jAKkAMa = n;
            this.jakkAMa = n3;
        }
        else {
            this.jAKkAMa = n3;
            this.jakkAMa = n;
        }
        if (n2 < n4) {
            this.JakkAMa = n2;
            this.JAkkAMa = n4;
            return;
        }
        this.JakkAMa = n4;
        this.JAkkAMa = n2;
    }
    
    final void akKaMAJ(final kaajmmk kaajmmk) {
        if (kaajmmk.jAKkAMa != Integer.MIN_VALUE) {
            if (this.jAKkAMa == Integer.MIN_VALUE) {
                this.jAKkAMa = kaajmmk.jAKkAMa;
                this.jakkAMa = kaajmmk.jakkAMa;
                this.JakkAMa = kaajmmk.JakkAMa;
                this.JAkkAMa = kaajmmk.JAkkAMa;
                return;
            }
            this.jAKkAMa = Math.min(this.jAKkAMa, kaajmmk.jAKkAMa);
            this.jakkAMa = Math.max(this.jakkAMa, kaajmmk.jakkAMa);
            this.JakkAMa = Math.min(this.JakkAMa, kaajmmk.JakkAMa);
            this.JAkkAMa = Math.max(this.JAkkAMa, kaajmmk.JAkkAMa);
        }
    }
    
    final void AKKaMAJ(final Point point) {
        if (this.jAKkAMa == Integer.MIN_VALUE) {
            final int x = point.x;
            this.jakkAMa = x;
            this.jAKkAMa = x;
            final int y = point.y;
            this.JAkkAMa = y;
            this.JakkAMa = y;
            return;
        }
        if (point.x < this.jAKkAMa) {
            this.jAKkAMa = point.x;
        }
        else if (point.x > this.jakkAMa) {
            this.jakkAMa = point.x;
        }
        if (point.y < this.JakkAMa) {
            this.JakkAMa = point.y;
            return;
        }
        if (point.y > this.JAkkAMa) {
            this.JAkkAMa = point.y;
        }
    }
    
    final boolean aKKaMAJ(final kaajmmk kaajmmk) {
        return this.jAKkAMa <= kaajmmk.jakkAMa && kaajmmk.jAKkAMa <= this.jakkAMa && this.JakkAMa <= kaajmmk.JAkkAMa && kaajmmk.JakkAMa <= this.JAkkAMa;
    }
    
    final boolean AkKaMAJ(final Point point) {
        return this.jAKkAMa <= point.x && point.x <= this.jakkAMa && this.JakkAMa <= point.y && point.y <= this.JAkkAMa;
    }
}
