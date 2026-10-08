/*
 * Decompiled with CFR 0.152.
 */
public final class mmjjmma {
    public kmajkka[] mAjakkA;

    public mmjjmma(int n) {
        this(n, false);
    }

    public mmjjmma(int n, boolean bl) {
        super();
        this.mAjakkA = new kmajkka[n];
        if (bl) {
            int n2 = 0;
            while (n2 < n) {
                this.mAjakkA[n2] = new mmjjkka();
                this.mAjakkA[n2].aMajakk = 100.0f;
                ++n2;
            }
        }
    }

    public mmjjmma(kmajkka[] kmajkkaArray) {
        super();
        this.mAjakkA = kmajkkaArray;
    }

    public final void mAJakkA(int n) {
        if (n < 2) {
            return;
        }
        this.maJakkA(0, n - 1);
    }

    final void maJakkA(int n, int n2) {
        kmajkka kmajkka2;
        kmajkka[] kmajkkaArray = this.mAjakkA;
        int n3 = n2 - n;
        if (n3 > 4) {
            int n4 = this.MaJakkA(n, n2);
            if (n4 != n2) {
                kmajkka2 = kmajkkaArray[n4];
                kmajkkaArray[n4] = kmajkkaArray[n2];
                kmajkkaArray[n2] = kmajkka2;
            }
        } else if (n3 == 1) {
            if (kmajkkaArray[n].aMajakk > kmajkkaArray[n2].aMajakk) {
                kmajkka kmajkka3 = kmajkkaArray[n];
                kmajkkaArray[n] = kmajkkaArray[n2];
                kmajkkaArray[n2] = kmajkka3;
            }
            return;
        }
        float f = kmajkkaArray[n2].aMajakk;
        int n5 = n - 1;
        int n6 = n2;
        while (true) {
            if (kmajkkaArray[++n5].aMajakk < f) {
                continue;
            }
            while (kmajkkaArray[--n6].aMajakk > f && n6 > 0) {
            }
            if (n5 >= n6) break;
            kmajkka2 = kmajkkaArray[n5];
            kmajkkaArray[n5] = kmajkkaArray[n6];
            kmajkkaArray[n6] = kmajkka2;
        }
        kmajkka2 = kmajkkaArray[n5];
        kmajkkaArray[n5] = kmajkkaArray[n2];
        kmajkkaArray[n2] = kmajkka2;
        if (n5 - 1 > n) {
            this.maJakkA(n, n5 - 1);
        }
        if (n2 > n5 + 1) {
            this.maJakkA(n5 + 1, n2);
        }
    }

    final void MAJakkA(int n, int n2) {
        kmajkka kmajkka2 = this.mAjakkA[n];
        this.mAjakkA[n] = this.mAjakkA[n2];
        this.mAjakkA[n2] = kmajkka2;
    }

    final int MaJakkA(int n, int n2) {
        int n3 = n + n2 >> 1;
        float f = this.mAjakkA[n].aMajakk;
        float f2 = this.mAjakkA[n2].aMajakk;
        float f3 = this.mAjakkA[n3].aMajakk;
        if (f2 > f) {
            if (f3 > f2) {
                return n2;
            }
            if (f3 > f) {
                return n3;
            }
            return n;
        }
        if (f3 > f) {
            return n;
        }
        if (f3 > f2) {
            return n3;
        }
        return n2;
    }
}

