// 
// Decompiled by Procyon v0.6.0
// 

public final class DepthSorter
{
    public SortableItem[] mAjakkA;
    
    public DepthSorter(final int n) {
        this(n, false);
    }
    
    public DepthSorter(final int n, final boolean b) {
        this.mAjakkA = new SortableItem[n];
        if (b) {
            for (int i = 0; i < n; ++i) {
                this.mAjakkA[i] = new ObjectSortEntry();
                this.mAjakkA[i].sortKey = 100.0f;
            }
        }
    }
    
    public DepthSorter(final SortableItem[] mAjakkA) {
        this.mAjakkA = mAjakkA;
    }
    
    public final void mAJakkA(final int n) {
        if (n < 2) {
            return;
        }
        this.maJakkA(0, n - 1);
    }
    
    final void maJakkA(final int n, final int n2) {
        final SortableItem[] mAjakkA = this.mAjakkA;
        final int n3 = n2 - n;
        if (n3 > 4) {
            final int maJakkA = this.MaJakkA(n, n2);
            if (maJakkA != n2) {
                final SortableItem kmajkka = mAjakkA[maJakkA];
                mAjakkA[maJakkA] = mAjakkA[n2];
                mAjakkA[n2] = kmajkka;
            }
        }
        else if (n3 == 1) {
            if (mAjakkA[n].sortKey > mAjakkA[n2].sortKey) {
                final SortableItem kmajkka2 = mAjakkA[n];
                mAjakkA[n] = mAjakkA[n2];
                mAjakkA[n2] = kmajkka2;
            }
            return;
        }
        final float aMajakk = mAjakkA[n2].sortKey;
        int n4 = n - 1;
        int n5 = n2;
        while (true) {
            if (mAjakkA[++n4].sortKey >= aMajakk) {
                while (mAjakkA[--n5].sortKey > aMajakk && n5 > 0) {}
                if (n4 >= n5) {
                    break;
                }
                final SortableItem kmajkka3 = mAjakkA[n4];
                mAjakkA[n4] = mAjakkA[n5];
                mAjakkA[n5] = kmajkka3;
            }
        }
        final SortableItem kmajkka4 = mAjakkA[n4];
        mAjakkA[n4] = mAjakkA[n2];
        mAjakkA[n2] = kmajkka4;
        if (n4 - 1 > n) {
            this.maJakkA(n, n4 - 1);
        }
        if (n2 > n4 + 1) {
            this.maJakkA(n4 + 1, n2);
        }
    }
    
    final void MAJakkA(final int n, final int n2) {
        final SortableItem kmajkka = this.mAjakkA[n];
        this.mAjakkA[n] = this.mAjakkA[n2];
        this.mAjakkA[n2] = kmajkka;
    }
    
    final int MaJakkA(final int n, final int n2) {
        final int n3 = n + n2 >> 1;
        final float aMajakk = this.mAjakkA[n].sortKey;
        final float aMajakk2 = this.mAjakkA[n2].sortKey;
        final float aMajakk3 = this.mAjakkA[n3].sortKey;
        if (aMajakk2 > aMajakk) {
            if (aMajakk3 > aMajakk2) {
                return n2;
            }
            if (aMajakk3 > aMajakk) {
                return n3;
            }
            return n;
        }
        else {
            if (aMajakk3 > aMajakk) {
                return n;
            }
            if (aMajakk3 > aMajakk2) {
                return n3;
            }
            return n2;
        }
    }
}
