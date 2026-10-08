import java.awt.Rectangle;
import java.awt.image.DirectColorModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mmajkka extends kmaakka
{
    public int[] AmAjakk;
    public int[] amAjakk;
    public int[] AMAjakk;
    public int[] aMAjakk;
    static final int Amajakk = 32537631;
    static final int amajakk = 260301048;
    static final int AMajakk = 267648255;
    
    public mmajkka(final int n, final int n2, final int[] array) {
        this(n, n2, 1, false);
        this.AMaJAkk(array);
    }
    
    public mmajkka(final int n, final int n2, final int n3, final boolean b) {
        super(n, n2);
        if (n3 == 1) {
            final int[] array = new int[super.kAMAJaK * super.KamAJaK];
            this.amAjakk = array;
            this.AmAjakk = array;
            this.AMAjakk = this.AmAjakk;
            this.aMAjakk = this.amAjakk;
        }
        if (n3 == 2) {
            this.AmAjakk = new int[super.kAMAJaK * super.KamAJaK];
            this.amAjakk = new int[super.kAMAJaK * super.KamAJaK];
            this.AMAjakk = this.AmAjakk;
            this.aMAjakk = this.amAjakk;
        }
        super.KAMAJaK = new DirectColorModel(28, 267386880, 261120, 255);
        this.kAmaJaK(b);
    }
    
    public final void kamaJaK(final int n, final int n2, final int n3, final int n4) {
        super.KaMAJaK.setPixels(n, n2, n3, n4, super.KAMAJaK, this.AMAjakk, n2 * super.kAMAJaK + n, super.kAMAJaK);
        super.KaMAJaK.imageComplete(3);
    }
    
    public final void Amajakk() {
        this.AMaJAkk(this.AMAjakk);
    }
    
    public final void AMaJAkk(final int[] array) {
        final int[] amAjakk = this.AMAjakk;
        for (int min = Math.min(this.AMAjakk.length, array.length), i = 0; i < min; ++i) {
            final int n = array[i];
            amAjakk[i] = ((n & 0xFF) | (n & 0xFF00) << 2 | (n & 0xFF0000) << 4);
        }
    }
    
    public static final int AmAJakk(final int n) {
        return (n & 0xFF) | (n & 0xFF00) << 2 | (n & 0xFF0000) << 4;
    }
    
    public static final int AMaJakk(final int n, final int n2, final int n3) {
        return ((n & 0xFF) << 20) + ((n2 & 0xFF) << 10) + (n3 & 0xFF);
    }
    
    public final void aMaJAkk() {
        if (this.AMAjakk == this.AmAjakk) {
            this.AMAjakk = this.amAjakk;
            this.aMAjakk = this.AmAjakk;
            return;
        }
        this.AMAjakk = this.AmAjakk;
        this.aMAjakk = this.amAjakk;
    }
    
    public final void aMAjakk(final int n) {
        final int n2 = super.kAMAJaK * super.KamAJaK;
        final int[] amAjakk = this.AMAjakk;
        final int n3 = 255 - ((1 << n) - 1);
        final int n4 = n3 | n3 << 10 | n3 << 20;
        int i = 0;
        switch (n2 & 0x7) {
            case 7: {
                amAjakk[i] = (amAjakk[i] & n4) >>> n;
                ++i;
            }
            case 6: {
                amAjakk[i] = (amAjakk[i] & n4) >>> n;
                ++i;
            }
            case 5: {
                amAjakk[i] = (amAjakk[i] & n4) >>> n;
                ++i;
            }
            case 4: {
                amAjakk[i] = (amAjakk[i] & n4) >>> n;
                ++i;
            }
            case 3: {
                amAjakk[i] = (amAjakk[i] & n4) >>> n;
                ++i;
            }
            case 2: {
                amAjakk[i] = (amAjakk[i] & n4) >>> n;
                ++i;
            }
            case 1: {
                amAjakk[i] = (amAjakk[i] & n4) >>> n;
                ++i;
                break;
            }
        }
        while (i < n2) {
            amAjakk[i] = (amAjakk[i] & n4) >>> n;
            ++i;
            amAjakk[i] = (amAjakk[i] & n4) >>> n;
            ++i;
            amAjakk[i] = (amAjakk[i] & n4) >>> n;
            ++i;
            amAjakk[i] = (amAjakk[i] & n4) >>> n;
            ++i;
            amAjakk[i] = (amAjakk[i] & n4) >>> n;
            ++i;
            amAjakk[i] = (amAjakk[i] & n4) >>> n;
            ++i;
            amAjakk[i] = (amAjakk[i] & n4) >>> n;
            ++i;
            amAjakk[i] = (amAjakk[i] & n4) >>> n;
            ++i;
        }
    }
    
    public final void amajakk(int n) {
        if (n < 0) {
            n &= 0xFF;
            this.AMajakk((n << 16) + (n << 8) + n);
        }
        if (n > 0) {
            this.aMAJAkk((n << 16) + (n << 8) + n);
        }
    }
    
    public final void AMajakk(int n) {
        n = (n & 0xFF) + ((n & 0xFF00) << 2) + ((n & 0xFF0000) << 4);
        final int[] amAjakk = this.AMAjakk;
        int n3;
        int n4;
        for (int n2 = super.kAMAJaK * super.KamAJaK, i = 0; i < n2; amAjakk[i++] = (n3 & n4 - (n4 >> 8))) {
            n3 = amAjakk[i] + 268697856 - n;
            n4 = (n3 & 0x10040100);
        }
    }
    
    public final void aMAJAkk(int n) {
        n = (n & 0xFF) + ((n & 0xFF00) << 2) + ((n & 0xFF0000) << 4);
        final int[] amAjakk = this.AMAjakk;
        int n3;
        int n4;
        for (int n2 = super.kAMAJaK * super.KamAJaK, i = 0; i < n2; amAjakk[i++] = (n3 - n4 | n4 - (n4 >> 8))) {
            n3 = amAjakk[i] + n;
            n4 = (n3 & 0x10040100);
        }
    }
    
    public final void amaJakk(final mmajkka mmajkka, final int n, final int n2, final mmajkka mmajkka2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, double n9) {
        if (n9 < 0.0) {
            n9 = 0.0;
        }
        if (n9 > 1.0) {
            n9 = 1.0;
        }
        final int n10 = 32 - (int)(n9 * 32.9);
        int n11 = n2 * mmajkka.kAMAJaK + n;
        int n12 = n4 * mmajkka2.kAMAJaK + n3;
        int n13 = n8 * super.kAMAJaK + n7;
        final int[] amAjakk = this.AMAjakk;
        final int[] amAjakk2 = mmajkka.AMAjakk;
        final int[] amAjakk3 = mmajkka2.AMAjakk;
        for (int i = 0; i < n6; ++i) {
            final int n14 = n11 + n5;
            int n15 = n12;
            int n16 = n13;
            int j = n11;
            while (j < n14) {
                final int n17 = amAjakk2[j++] & 0xF83E0F8;
                if (n17 >= 0) {
                    amAjakk[n16++] = (((amAjakk3[n15++] & 0xF83E0F8) - n17 >> 3) * n10 >>> 2) + n17;
                }
                else {
                    amAjakk[n16++] = amAjakk3[n15++];
                }
            }
            n11 += mmajkka.kAMAJaK;
            n12 += mmajkka2.kAMAJaK;
            n13 += super.kAMAJaK;
        }
    }
    
    public final void amAjakk(final mmajkka mmajkka, final int n, final int n2, final mmajkka mmajkka2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, double n9, double n10) {
        if (n9 < 0.0) {
            n9 = 0.0;
        }
        if (n9 > 1.0) {
            n9 = 1.0;
        }
        if (n10 < 0.0) {
            n10 = 0.0;
        }
        if (n10 > 1.0) {
            n10 = 1.0;
        }
        final int n11 = (int)(n9 * 32.9);
        final int n12 = (int)(n10 * 32.9);
        int n13 = n2 * mmajkka.kAMAJaK + n;
        int n14 = n4 * mmajkka2.kAMAJaK + n3;
        int n15 = n8 * super.kAMAJaK + n7;
        final int[] amAjakk = this.AMAjakk;
        final int[] amAjakk2 = mmajkka.AMAjakk;
        final int[] amAjakk3 = mmajkka2.AMAjakk;
        for (int i = 0; i < n6; ++i) {
            int n19;
            int n20;
            int n21;
            int n22;
            for (int n16 = n13 + n5, n17 = n14, n18 = n15, j = n13; j < n16; n19 = (((amAjakk2[j++] & 0xF83E0F8) >>> 3) * n11 >>> 2 & 0xF83E0F8) + (((amAjakk3[n17++] & 0xF83E0F8) >>> 3) * n12 >>> 2 & 0xF83E0F8), n20 = (n19 & 0x10040100), n21 = amAjakk[n18] + (n19 - n20 | n20 - (n20 >> 8)), n22 = (n21 & 0x10040100), amAjakk[n18] = (n21 - n22 | n22 - (n22 >> 8)), ++n18) {}
            n13 += mmajkka.kAMAJaK;
            n14 += mmajkka2.kAMAJaK;
            n15 += super.kAMAJaK;
        }
    }
    
    public void amaJAkk(final mmajkka mmajkka, final int n, final int n2) {
        this.amajAkk(mmajkka, n, n2, 0, 0, mmajkka.kAMAJaK, mmajkka.KamAJaK);
    }
    
    public void amajAkk(final mmajkka mmajkka, int n, int n2, int n3, int n4, int n5, int n6) {
        if (n < 0) {
            n5 += n;
            n3 -= n;
            n = 0;
        }
        if (n5 <= 0) {
            return;
        }
        if (n + n5 > super.kAMAJaK) {
            n5 = super.kAMAJaK - n;
        }
        if (n5 <= 0) {
            return;
        }
        if (n2 < 0) {
            n6 += n2;
            n4 -= n2;
            n2 = 0;
        }
        if (n6 <= 0) {
            return;
        }
        if (n2 + n6 > super.KamAJaK) {
            n6 = super.KamAJaK - n2;
        }
        if (n6 <= 0) {
            return;
        }
        int n7 = n4 * mmajkka.kAMAJaK + n3;
        int n8 = n2 * super.kAMAJaK + n;
        final int[] amAjakk = mmajkka.AMAjakk;
        final int[] amAjakk2 = this.AMAjakk;
        if (mmajkka.kAMAJaK == super.kAMAJaK && super.kAMAJaK == n5) {
            System.arraycopy(amAjakk, n7, amAjakk2, n8, n5 * n6);
            return;
        }
        for (int i = 0; i < n6; ++i) {
            System.arraycopy(amAjakk, n7, amAjakk2, n8, n5);
            n7 += mmajkka.kAMAJaK;
            n8 += super.kAMAJaK;
        }
    }
    
    public void AmAJAkk(final maaakka maaakka) {
        final int n = super.kAMAJaK * super.KamAJaK;
        final int[] amAjakk = this.AMAjakk;
        final byte[] kamAJaK = maaakka.kamAJaK;
        final int[] kamajaK = maaakka.KamajaK;
        for (int i = 0; i < n; amAjakk[i] = kamajaK[kamAJaK[i++] & 0xFF]) {}
    }
    
    public void AMAjakk(final maaakka maaakka) {
        final int n = super.kAMAJaK * super.KamAJaK;
        final int[] amAjakk = this.AMAjakk;
        final byte[] kamAJaK = maaakka.kamAJaK;
        final int[] kamajaK = maaakka.KamajaK;
        int n2;
        int n3;
        for (int i = 0; i < n; amAjakk[i++] = (n2 - n3 | n3 - (n3 >> 8))) {
            n2 = amAjakk[i] + kamajaK[kamAJaK[i] & 0xFF];
            n3 = (n2 & 0x10040100);
        }
    }
    
    public void AMAJakk(final mmajkka mmajkka, int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        int kamaJaK = mmajkka.kAMAJaK;
        int kamAJaK = mmajkka.KamAJaK;
        if (n < 0) {
            kamaJaK += n;
            n3 = -n;
            n = 0;
        }
        if (kamaJaK <= 0) {
            return;
        }
        if (n + kamaJaK > super.kAMAJaK) {
            kamaJaK = super.kAMAJaK - n;
        }
        if (kamaJaK <= 0) {
            return;
        }
        if (n2 < 0) {
            kamAJaK += n2;
            n4 = -n2;
            n2 = 0;
        }
        if (kamAJaK <= 0) {
            return;
        }
        if (n2 + kamAJaK > super.KamAJaK) {
            kamAJaK = super.KamAJaK - n2;
        }
        if (kamAJaK <= 0) {
            return;
        }
        int n5 = n3 + n4 * mmajkka.kAMAJaK;
        int n6 = n2 * super.kAMAJaK + n;
        final int[] amAjakk = this.AMAjakk;
        final int[] amAjakk2 = mmajkka.AMAjakk;
        for (int i = 0; i < kamAJaK; ++i) {
            int n7 = n5;
            int n8 = n6;
            final int n9 = kamaJaK;
            switch (n9 & 0x3) {
                case 3: {
                    final int n10 = amAjakk[n8] + amAjakk2[n7++];
                    final int n11 = n10 & 0x10040100;
                    amAjakk[n8++] = (n10 - n11 | n11 - (n11 >> 8));
                }
                case 2: {
                    final int n12 = amAjakk[n8] + amAjakk2[n7++];
                    final int n13 = n12 & 0x10040100;
                    amAjakk[n8++] = (n12 - n13 | n13 - (n13 >> 8));
                }
                case 1: {
                    final int n14 = amAjakk[n8] + amAjakk2[n7++];
                    final int n15 = n14 & 0x10040100;
                    amAjakk[n8++] = (n14 - n15 | n15 - (n15 >> 8));
                    break;
                }
            }
            int n16 = n9 >> 2;
            while (n16-- > 0) {
                final int n17 = amAjakk[n8] + amAjakk2[n7++];
                final int n18 = n17 & 0x10040100;
                amAjakk[n8++] = (n17 - n18 | n18 - (n18 >> 8));
                final int n19 = amAjakk[n8] + amAjakk2[n7++];
                final int n20 = n19 & 0x10040100;
                amAjakk[n8++] = (n19 - n20 | n20 - (n20 >> 8));
                final int n21 = amAjakk[n8] + amAjakk2[n7++];
                final int n22 = n21 & 0x10040100;
                amAjakk[n8++] = (n21 - n22 | n22 - (n22 >> 8));
                final int n23 = amAjakk[n8] + amAjakk2[n7++];
                final int n24 = n23 & 0x10040100;
                amAjakk[n8++] = (n23 - n24 | n24 - (n24 >> 8));
            }
            n6 += super.kAMAJaK;
            n5 += mmajkka.kAMAJaK;
        }
    }
    
    public void amAJAkk(final mmajkka mmajkka, final int x, final int y) {
        final Rectangle intersection = new Rectangle(x, y, mmajkka.kAMAJaK, mmajkka.KamAJaK).intersection(new Rectangle(0, 0, super.kAMAJaK, super.KamAJaK));
        if (intersection.isEmpty()) {
            return;
        }
        int n = intersection.x - x + (intersection.y - y) * mmajkka.kAMAJaK;
        int n2 = intersection.y * super.kAMAJaK + intersection.x;
        final int[] amAjakk = this.AMAjakk;
        final int[] amAjakk2 = mmajkka.AMAjakk;
        for (int i = 0; i < intersection.height; ++i) {
            int n3 = n;
            int n4 = n2;
            final int width = intersection.width;
            switch (width & 0x3) {
                case 3: {
                    final int n5 = amAjakk[n4] + 268697856 - amAjakk2[n3++];
                    final int n6 = n5 & 0x10040100;
                    amAjakk[n4++] = (n5 & n6 - (n6 >> 8));
                }
                case 2: {
                    final int n7 = amAjakk[n4] + 268697856 - amAjakk2[n3++];
                    final int n8 = n7 & 0x10040100;
                    amAjakk[n4++] = (n7 & n8 - (n8 >> 8));
                }
                case 1: {
                    final int n9 = amAjakk[n4] + 268697856 - amAjakk2[n3++];
                    final int n10 = n9 & 0x10040100;
                    amAjakk[n4++] = (n9 & n10 - (n10 >> 8));
                    break;
                }
            }
            int n11 = width >> 2;
            while (n11-- > 0) {
                final int n12 = amAjakk[n4] + 268697856 - amAjakk2[n3++];
                final int n13 = n12 & 0x10040100;
                amAjakk[n4++] = (n12 & n13 - (n13 >> 8));
                final int n14 = amAjakk[n4] + 268697856 - amAjakk2[n3++];
                final int n15 = n14 & 0x10040100;
                amAjakk[n4++] = (n14 & n15 - (n15 >> 8));
                final int n16 = amAjakk[n4] + 268697856 - amAjakk2[n3++];
                final int n17 = n16 & 0x10040100;
                amAjakk[n4++] = (n16 & n17 - (n17 >> 8));
                final int n18 = amAjakk[n4] + 268697856 - amAjakk2[n3++];
                final int n19 = n18 & 0x10040100;
                amAjakk[n4++] = (n18 & n19 - (n19 >> 8));
            }
            n2 += super.kAMAJaK;
            n += mmajkka.kAMAJaK;
        }
    }
    
    public void amAJakk(final float n) {
        final int n2 = (int)(31.0f * n);
        final int n3 = 32 - n2;
        int n4 = 0;
        final int[] amAjakk = this.AMAjakk;
        final int kamaJaK = super.kAMAJaK;
        for (int kamAJaK = super.KamAJaK, i = 0; i < kamAJaK; ++i) {
            int n5 = amAjakk[n4] >> 1 & 0x7E1F87E;
            for (int j = 0; j < kamaJaK; ++j) {
                n5 = (n5 >> 3 & 0x1F07C1F) * n2 + (amAjakk[n4] >> 3 & 0x1F07C1F) * n3 >> 2;
                amAjakk[n4++] = (n5 & 0xFF3FCFF);
            }
        }
    }
    
    public void AmaJakk(final float n) {
        final int n2 = (int)(31.0f * n);
        final int n3 = 32 - n2;
        final int[] amAjakk = this.AMAjakk;
        final int kamaJaK = super.kAMAJaK;
        final int kamAJaK = super.KamAJaK;
        for (int i = 0; i < kamaJaK; ++i) {
            int n4 = i;
            int n5 = amAjakk[n4];
            for (int j = 0; j < kamAJaK; ++j) {
                n5 = (n5 >> 3 & 0x1F07C1F) * n2 + (amAjakk[n4] >> 3 & 0x1F07C1F) * n3 >> 2;
                amAjakk[n4] = (n5 & 0xFF3FCFF);
                n4 += kamaJaK;
            }
        }
    }
    
    public void aMajAkk() {
        final int[] amAjakk = this.AMAjakk;
        final int[] amAjakk2 = this.aMAjakk;
        final int n = super.kAMAJaK * super.KamAJaK;
        int n2 = 0;
        int n3 = 0;
        switch (n & 0x3) {
            case 3: {
                amAjakk[n2] = (amAjakk[n2++] + amAjakk2[n3++] >> 1 & 0xFF3FCFF);
            }
            case 2: {
                amAjakk[n2] = (amAjakk[n2++] + amAjakk2[n3++] >> 1 & 0xFF3FCFF);
            }
            case 1: {
                amAjakk[n2] = (amAjakk[n2++] + amAjakk2[n3++] >> 1 & 0xFF3FCFF);
                break;
            }
        }
        int n4 = n >> 2;
        while (n4-- > 0) {
            amAjakk[n2] = (amAjakk[n2++] + amAjakk2[n3++] >> 1 & 0xFF3FCFF);
            amAjakk[n2] = (amAjakk[n2++] + amAjakk2[n3++] >> 1 & 0xFF3FCFF);
            amAjakk[n2] = (amAjakk[n2++] + amAjakk2[n3++] >> 1 & 0xFF3FCFF);
            amAjakk[n2] = (amAjakk[n2++] + amAjakk2[n3++] >> 1 & 0xFF3FCFF);
        }
    }
    
    public void aMAJakk() {
        final int[] amAjakk = this.AMAjakk;
        final int[] amAjakk2 = this.aMAjakk;
        final int n = super.kAMAJaK * super.KamAJaK;
        int n2 = 0;
        int n3 = 0;
        int n4 = n >> 2;
        while (n4-- > 0) {
            amAjakk[n2] = (amAjakk[n2++] + 3 * amAjakk2[n3++] >> 2 & 0xFF3FCFF);
            amAjakk[n2] = (amAjakk[n2++] + 3 * amAjakk2[n3++] >> 2 & 0xFF3FCFF);
            amAjakk[n2] = (amAjakk[n2++] + 3 * amAjakk2[n3++] >> 2 & 0xFF3FCFF);
            amAjakk[n2] = (amAjakk[n2++] + 3 * amAjakk2[n3++] >> 2 & 0xFF3FCFF);
        }
    }
    
    public void AMajAkk() {
        final int[] amAjakk = this.AMAjakk;
        final int[] amAjakk2 = this.aMAjakk;
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        for (int i = 0; i < super.kAMAJaK * super.KamAJaK; amAjakk[i++] = (n - n2 | n2 - (n2 >> 8)), n3 = amAjakk[i] + (amAjakk2[i] >> 1 & 0xFF3FCFF), n4 = (n3 & 0x10040100), amAjakk[i++] = (n3 - n4 | n4 - (n4 >> 8)), n5 = amAjakk[i] + (amAjakk2[i] >> 1 & 0xFF3FCFF), n6 = (n5 & 0x10040100), amAjakk[i++] = (n5 - n6 | n6 - (n6 >> 8)), n7 = amAjakk[i] + (amAjakk2[i] >> 1 & 0xFF3FCFF), n8 = (n7 & 0x10040100), amAjakk[i++] = (n7 - n8 | n8 - (n8 >> 8))) {
            n = amAjakk[i] + (amAjakk2[i] >> 1 & 0xFF3FCFF);
            n2 = (n & 0x10040100);
        }
    }
    
    public void AmAjakk(final int n) {
        final int[] amAjakk = this.AMAjakk;
        final int n2 = super.kAMAJaK * super.KamAJaK;
        int n3 = 0;
        switch (n2 & 0x3) {
            case 3: {
                final int[] array = amAjakk;
                final int n4 = n3++;
                array[n4] ^= n;
            }
            case 2: {
                final int[] array2 = amAjakk;
                final int n5 = n3++;
                array2[n5] ^= n;
            }
            case 1: {
                final int[] array3 = amAjakk;
                final int n6 = n3++;
                array3[n6] ^= n;
                break;
            }
        }
        int n7 = n2 >> 2;
        while (n7-- > 0) {
            final int[] array4 = amAjakk;
            final int n8 = n3++;
            array4[n8] ^= n;
            final int[] array5 = amAjakk;
            final int n9 = n3++;
            array5[n9] ^= n;
            final int[] array6 = amAjakk;
            final int n10 = n3++;
            array6[n10] ^= n;
            final int[] array7 = amAjakk;
            final int n11 = n3++;
            array7[n11] ^= n;
        }
    }
    
    public void aMajakk(final int[] array, final int[] array2, final int[] array3) {
        final int[] amAjakk = this.AMAjakk;
        for (int n = super.kAMAJaK * super.KamAJaK, i = 0; i < n; ++i) {
            final int n2 = amAjakk[i];
            amAjakk[i] = array[n2 >> 20 & 0xFF] + array2[n2 >> 10 & 0xFF] + array3[n2 & 0xFF];
        }
    }
    
    public void AMAJAkk(final mmajkka mmajkka, final float n, final float n2, final float n3, final float n4) {
        int n5 = (int)n;
        int n6 = (int)n2;
        int n7 = (int)n3;
        int n8 = (int)n4;
        final int kamaJaK = mmajkka.kAMAJaK;
        final int kamAJaK = mmajkka.KamAJaK;
        int n9 = 0;
        int n10 = 0;
        if (n5 < 0) {
            n7 += n5;
            n9 = -n5;
            n5 = 0;
        }
        if (n7 <= 0) {
            return;
        }
        if (n5 + n7 > super.kAMAJaK) {
            n7 = super.kAMAJaK - n5;
        }
        if (n7 <= 0) {
            return;
        }
        if (n6 < 0) {
            n8 += n6;
            n10 = -n6;
            n6 = 0;
        }
        if (n8 <= 0) {
            return;
        }
        if (n6 + n8 > super.KamAJaK) {
            n8 = super.KamAJaK - n6;
        }
        if (n8 <= 0) {
            return;
        }
        int n11 = n6 * super.kAMAJaK + n5;
        final int[] amAjakk = this.AMAjakk;
        final int[] amAjakk2 = mmajkka.AMAjakk;
        final int n12 = (int)(1024 * kamaJaK / n3);
        final int n13 = (int)(1024 * kamAJaK / n4);
        final int n14 = n12 * n9;
        int n15 = n13 * n10;
        for (int i = 0; i < n8; ++i) {
            int n16 = n11;
            int n17 = n7;
            int n18 = n14 + (n15 & 0xFFFFFC00) * kamaJaK;
            while (n17-- > 0) {
                final int n19 = amAjakk[n16] + amAjakk2[n18 >> 10];
                final int n20 = n19 & 0x10040100;
                amAjakk[n16++] = (n19 - n20 | n20 - (n20 >> 8));
                n18 += n12;
            }
            n11 += super.kAMAJaK;
            n15 += n13;
        }
    }
    
    public final void AmaJAkk(int n, int n2) {
        n = (n & 0xFF) + ((n & 0xFF00) << 2) + ((n & 0xFF0000) << 4);
        n2 = (n2 & 0xFF) + ((n2 & 0xFF00) << 2) + ((n2 & 0xFF0000) << 4);
        final int[] amAjakk = this.AMAjakk;
        final int n3 = super.kAMAJaK * super.KamAJaK;
        int i = 0;
        while (i < n3) {
            final int n4 = amAjakk[i];
            if ((n4 & Integer.MIN_VALUE) != 0x0) {
                final int n5 = (n4 & Integer.MAX_VALUE) + 268697856 - n;
                final int n6 = n5 & 0x10040100;
                amAjakk[i++] = (n5 & n6 - (n6 >> 8));
            }
            else {
                final int n7 = n4 + 268697856 - n2;
                final int n8 = n7 & 0x10040100;
                amAjakk[i++] = (n7 & n8 - (n8 >> 8));
            }
        }
    }
}
