/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

final class kaajmmk {
    int jAKkAMa;
    int JakkAMa;
    int jakkAMa;
    int JAkkAMa;

    kaajmmk() {
        super();
        this.JAkkAMa = Integer.MIN_VALUE;
        this.jakkAMa = Integer.MIN_VALUE;
        this.JakkAMa = Integer.MIN_VALUE;
        this.jAKkAMa = Integer.MIN_VALUE;
    }

    kaajmmk(kaajmmk kaajmmk2) {
        super();
        this.jAKkAMa = kaajmmk2.jAKkAMa;
        this.JakkAMa = kaajmmk2.JakkAMa;
        this.jakkAMa = kaajmmk2.jakkAMa;
        this.JAkkAMa = kaajmmk2.JAkkAMa;
    }

    kaajmmk(int n, int n2, int n3, int n4) {
        super();
        if (n < n3) {
            this.jAKkAMa = n;
            this.jakkAMa = n3;
        } else {
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

    final void akKaMAJ(kaajmmk kaajmmk2) {
        if (kaajmmk2.jAKkAMa != Integer.MIN_VALUE) {
            if (this.jAKkAMa == Integer.MIN_VALUE) {
                this.jAKkAMa = kaajmmk2.jAKkAMa;
                this.jakkAMa = kaajmmk2.jakkAMa;
                this.JakkAMa = kaajmmk2.JakkAMa;
                this.JAkkAMa = kaajmmk2.JAkkAMa;
                return;
            }
            this.jAKkAMa = Math.min(this.jAKkAMa, kaajmmk2.jAKkAMa);
            this.jakkAMa = Math.max(this.jakkAMa, kaajmmk2.jakkAMa);
            this.JakkAMa = Math.min(this.JakkAMa, kaajmmk2.JakkAMa);
            this.JAkkAMa = Math.max(this.JAkkAMa, kaajmmk2.JAkkAMa);
        }
    }

    final void AKKaMAJ(Point point) {
        if (this.jAKkAMa == Integer.MIN_VALUE) {
            this.jAKkAMa = this.jakkAMa = point.x;
            this.JakkAMa = this.JAkkAMa = point.y;
            return;
        }
        if (point.x < this.jAKkAMa) {
            this.jAKkAMa = point.x;
        } else if (point.x > this.jakkAMa) {
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

    final boolean aKKaMAJ(kaajmmk kaajmmk2) {
        return this.jAKkAMa <= kaajmmk2.jakkAMa && kaajmmk2.jAKkAMa <= this.jakkAMa && this.JakkAMa <= kaajmmk2.JAkkAMa && kaajmmk2.JakkAMa <= this.JAkkAMa;
    }

    final boolean AkKaMAJ(Point point) {
        return this.jAKkAMa <= point.x && point.x <= this.jakkAMa && this.JakkAMa <= point.y && point.y <= this.JAkkAMa;
    }
}

