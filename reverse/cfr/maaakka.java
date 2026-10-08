/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.IndexColorModel;

public final class maaakka
extends kmaakka {
    public byte[] kamAJaK;
    public byte[] KAmAJaK;
    public byte[] kAmAJaK;
    public byte[] KaMajaK;
    public final byte[] kaMajaK = new byte[256];
    public final byte[] KAMajaK = new byte[256];
    public final byte[] kAMajaK = new byte[256];
    public final int[] KamajaK = new int[256];
    int kamajaK;
    final byte[] KAmajaK = new byte[256];
    static final byte[] kAmajaK = new byte[768];

    public maaakka(int n, int n2, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4) {
        this(n, n2, 1, false);
        this.KAmAJaK(byArray, byArray2, byArray3, byArray4);
    }

    public maaakka(int n, int n2, int n3, boolean bl) {
        super(n, n2);
        this.kamajaK = n3;
        if (this.kamajaK == 1) {
            this.KaMajaK = new byte[this.kAMAJaK * this.KamAJaK];
            this.kAmAJaK = this.KaMajaK;
            this.kamAJaK = this.kAmAJaK;
            this.KAmAJaK = this.KaMajaK;
        }
        if (this.kamajaK == 2) {
            this.kAmAJaK = new byte[this.kAMAJaK * this.KamAJaK];
            this.KaMajaK = new byte[this.kAMAJaK * this.KamAJaK];
            this.kamAJaK = this.kAmAJaK;
            this.KAmAJaK = this.KaMajaK;
        }
        int n4 = 0;
        while (n4 < this.kAMAJaK * this.KamAJaK) {
            this.kamAJaK[n4] = (byte)n4;
            ++n4;
        }
        int n5 = 0;
        while (n5 < 256) {
            this.kaMajaK[n5] = (byte)Math.min(255.0, (double)(n5 * 2));
            this.KAMajaK[n5] = (byte)Math.min(255.0, (double)(n5 * 3));
            this.kAMajaK[n5] = (byte)Math.min(255.0, (double)n5);
            ++n5;
        }
        this.kaMAjaK(this.kaMajaK, this.KAMajaK, this.kAMajaK);
        this.kAmaJaK(bl);
    }

    public final void kAmAjaK(maaakka maaakka2) {
        this.KAMAjaK((IndexColorModel)maaakka2.KAMAJaK);
    }

    public final void KAMAjaK(IndexColorModel indexColorModel) {
        int n = 0;
        while (n < 256) {
            this.kaMajaK[n] = 0;
            this.KAMajaK[n] = 0;
            this.kAMajaK[n] = 0;
            ++n;
        }
        indexColorModel.getReds(this.kaMajaK);
        indexColorModel.getGreens(this.KAMajaK);
        indexColorModel.getBlues(this.kAMajaK);
        this.KaMajaK();
    }

    public final void kaMAjaK(byte[] byArray, byte[] byArray2, byte[] byArray3) {
        System.arraycopy(byArray, 0, this.kaMajaK, 0, 256);
        System.arraycopy(byArray2, 0, this.KAMajaK, 0, 256);
        System.arraycopy(byArray3, 0, this.kAMajaK, 0, 256);
        this.KaMajaK();
    }

    public final void KaMajaK() {
        this.KAMAJaK = new IndexColorModel(8, 256, this.kaMajaK, this.KAMajaK, this.kAMajaK);
        int n = 0;
        while (n < 256) {
            this.KamajaK[n] = ((this.kaMajaK[n] & 0xFF) << 20) + ((this.KAMajaK[n] & 0xFF) << 10) + (this.kAMajaK[n] & 0xFF);
            ++n;
        }
    }

    public final void KAmAJaK(byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4) {
        System.arraycopy(byArray, 0, this.kamAJaK, 0, Math.min(byArray.length, this.kamAJaK.length));
        System.arraycopy(byArray2, 0, this.kaMajaK, 0, Math.min(byArray2.length, this.kaMajaK.length));
        System.arraycopy(byArray3, 0, this.KAMajaK, 0, Math.min(byArray3.length, this.KAMajaK.length));
        System.arraycopy(byArray4, 0, this.kAMajaK, 0, Math.min(byArray4.length, this.kAMajaK.length));
        this.KaMajaK();
    }

    public final void kamajaK() {
        if (this.kamAJaK == this.kAmAJaK) {
            this.kamAJaK = this.KaMajaK;
            this.KAmAJaK = this.kAmAJaK;
            return;
        }
        this.kamAJaK = this.kAmAJaK;
        this.KAmAJaK = this.KaMajaK;
    }

    public final void kamaJaK(int n, int n2, int n3, int n4) {
        if (this.KaMAJaK != null) {
            this.KaMAJaK.setPixels(n, n2, n3, n4, this.KAMAJaK, this.kamAJaK, n2 * this.kAMAJaK + n, this.kAMAJaK);
            this.KaMAJaK.imageComplete(3);
        }
    }

    public final void KAMajaK(int n) {
        byte by = (byte)n;
        int n2 = this.kAMAJaK * this.KamAJaK;
        byte[] byArray = this.kAmAJaK;
        byte[] byArray2 = this.KaMajaK;
        int n3 = 0;
        while (n3 < n2) {
            byArray[n3] = by;
            byArray2[n3++] = by;
        }
    }

    public final void kamAJaK() {
        int n = this.kAMAJaK - 1 - 3;
        int n2 = this.KamAJaK - 1;
        byte[] byArray = this.KAmAJaK;
        int n3 = 1;
        while (n3 < n2) {
            int n4 = (n3 - 1) * this.kAMAJaK;
            int n5 = n3 * this.kAMAJaK;
            int n6 = (n3 + 1) * this.kAMAJaK;
            int n7 = this.kamAJaK[n4++] & 0xFF;
            int n8 = this.kamAJaK[n4++] & 0xFF;
            int n9 = this.kamAJaK[n4++] & 0xFF;
            int n10 = this.kamAJaK[n5++] & 0xFF;
            int n11 = this.kamAJaK[n5++] & 0xFF;
            int n12 = this.kamAJaK[n5++] & 0xFF;
            int n13 = this.kamAJaK[n6++] & 0xFF;
            int n14 = this.kamAJaK[n6++] & 0xFF;
            int n15 = this.kamAJaK[n6++] & 0xFF;
            int n16 = n7 + n8 + n9 + n10 + n11 + n12 + n13 + n14 + n15;
            int n17 = n3 * this.kAMAJaK + 1;
            int n18 = 1;
            while (n18 < n) {
                byArray[n17++] = (byte)((n16 + 1) / 9);
                n16 -= n7 + n10 + n13;
                n7 = this.kamAJaK[n4++] & 0xFF;
                n10 = this.kamAJaK[n5++] & 0xFF;
                n13 = this.kamAJaK[n6++] & 0xFF;
                byArray[n17++] = (byte)((n16 += n7 + n10 + n13) / 9);
                n16 -= n8 + n11 + n14;
                n8 = this.kamAJaK[n4++] & 0xFF;
                n11 = this.kamAJaK[n5++] & 0xFF;
                n14 = this.kamAJaK[n6++] & 0xFF;
                byArray[n17++] = (byte)((n16 += n8 + n11 + n14) / 9);
                n16 -= n9 + n12 + n15;
                n9 = this.kamAJaK[n4++] & 0xFF;
                n12 = this.kamAJaK[n5++] & 0xFF;
                n15 = this.kamAJaK[n6++] & 0xFF;
                n16 += n9 + n12 + n15;
                n18 += 3;
            }
            ++n3;
        }
        this.kamajaK();
    }

    public final void kAMajaK() {
        int n = this.kAMAJaK - 1;
        int n2 = this.KamAJaK - 1;
        byte[] byArray = this.KAmAJaK;
        int n3 = 1;
        while (n3 < n2) {
            int n4 = (n3 - 1) * this.kAMAJaK + 1;
            int n5 = n3 * this.kAMAJaK - n4;
            int n6 = n3 * this.kAMAJaK + 2 - n4;
            int n7 = (n3 + 1) * this.kAMAJaK + 1 - n4;
            int n8 = n3 * this.kAMAJaK + 1;
            int n9 = 1;
            while (n9 < n) {
                int n10 = this.kamAJaK[n4] & 0xFF;
                n10 += this.kamAJaK[n4 + n5] & 0xFF;
                n10 += this.kamAJaK[n4 + n6] & 0xFF;
                byArray[n8] = (byte)((n10 += this.kamAJaK[n4 + n7] & 0xFF) >>> 2);
                ++n4;
                ++n8;
                ++n9;
            }
            ++n3;
        }
        this.kamajaK();
    }

    public final void kAMAjaK(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n < 0 || n2 < 0) {
            return;
        }
        if (n + n5 > this.kAMAJaK || n2 + n6 > this.KamAJaK) {
            return;
        }
        byte[] byArray = this.KAmAJaK;
        byte[] byArray2 = this.kamAJaK;
        int n7 = n2 * this.kAMAJaK + n;
        int n8 = n4 * this.kAMAJaK + n3;
        int n9 = this.kAMAJaK - n5;
        int n10 = 0;
        while (n10 < n6) {
            int n11 = 0;
            while (n11 < n5) {
                byArray2[n8++] = byArray[n7++];
                ++n11;
            }
            n8 += n9;
            n7 += n9;
            ++n10;
        }
    }

    public final void KAMAJaK() {
        byte[] byArray = this.KAmAJaK;
        byte[] byArray2 = this.kamAJaK;
        int n = this.kAMAJaK * this.KamAJaK;
        int n2 = 0;
        while (n2 < n) {
            byArray2[n2] = (byte)((byArray[n2] & 0xFF) + (byArray2[n2] & 0xFF) >> 1);
            ++n2;
        }
    }

    public final void KAmajaK(double d) {
        double d2 = this.kAMAJaK / 2;
        double d3 = this.KamAJaK / 2;
        this.KamajaK(d, d2, d3);
    }

    public final void KamajaK(double d, double d2, double d3) {
        double d4 = 1.0 / d;
        this.kAMAJaK(this.kamAJaK, d4, 0.0, 0.0, d4, d2, d3);
    }

    public final void KamAJaK(double d, double d2) {
        double d3 = this.kAMAJaK / 2;
        double d4 = this.KamAJaK / 2;
        this.KAmAjaK(d, d2, d3, d4);
    }

    public final void KAmAjaK(double d, double d2, double d3, double d4) {
        double d5 = 1.0 / d;
        this.kAMAJaK(this.kamAJaK, d5 * Math.cos(d2), d5 * Math.sin(d2), d5 * Math.cos(d2 + 1.5707963267948966), d5 * Math.sin(d2 + 1.5707963267948966), d3, d4);
    }

    public final void kaMajaK(double d, double d2, double d3, double d4, double d5, double d6) {
        this.kAMAJaK(this.kamAJaK, d, d2, d3, d4, d5, d6);
    }

    public final void kAMAJaK(byte[] byArray, double d, double d2, double d3, double d4, double d5, double d6) {
        byte[] byArray2 = this.KAmAJaK;
        int n = (int)(d * 65536.0);
        int n2 = (int)(d2 * 65536.0);
        int n3 = (int)(d3 * 65536.0);
        int n4 = (int)(d4 * 65536.0);
        int n5 = (int)(-(d5 * d + d6 * d3) * 65536.0);
        int n6 = (int)(-(d5 * d2 + d6 * d4) * 65536.0);
        n5 += (int)(d5 * 65536.0);
        n6 += (int)(d6 * 65536.0);
        int n7 = 0;
        if (this.kAMAJaK == 256 && this.KamAJaK == 128) {
            int n8 = 0;
            while (n8 < this.KamAJaK) {
                int n9 = n5;
                int n10 = n6;
                int n11 = n7 + this.kAMAJaK;
                while (n7 < n11) {
                    byArray2[n7] = byArray[n9 << 8 >>> 24 | n10 << 9 >>> 25 << 8];
                    ++n7;
                    n9 += n;
                    n10 += n2;
                }
                n5 += n3;
                n6 += n4;
                ++n8;
            }
        } else if (this.kAMAJaK == 512 && this.KamAJaK == 256) {
            int n12 = 0;
            while (n12 < this.KamAJaK) {
                int n13 = n5;
                int n14 = n6;
                int n15 = n7 + this.kAMAJaK;
                while (n7 < n15) {
                    byArray2[n7] = byArray[n13 << 7 >>> 23 | n14 << 8 >>> 24 << 9];
                    ++n7;
                    n13 += n;
                    n14 += n2;
                }
                n5 += n3;
                n6 += n4;
                ++n12;
            }
        } else if (this.kAMAJaK == 256 && this.KamAJaK == 256) {
            int n16 = 0;
            while (n16 < this.KamAJaK) {
                int n17 = n5;
                int n18 = n6;
                int n19 = n7 + this.kAMAJaK;
                while (n7 < n19) {
                    byArray2[n7] = byArray[n17 << 8 >>> 24 | n18 << 8 >>> 24 << 8];
                    ++n7;
                    n17 += n;
                    n18 += n2;
                }
                n5 += n3;
                n6 += n4;
                ++n16;
            }
        }
        this.kamajaK();
    }

    /*
     * Unable to fully structure code
     */
    public final void kAmajaK(int var1_1) {
        var2_2 = this.kamAJaK;
        var3_3 = this.kAMAJaK * this.KamAJaK;
        var4_4 = 0;
        switch (var3_3 & 7) {
            case 7: {
                var2_2[var4_4] = (byte)((var2_2[var4_4] & 255) >>> var1_1);
                ++var4_4;
            }
            case 6: {
                var2_2[var4_4] = (byte)((var2_2[var4_4] & 255) >>> var1_1);
                ++var4_4;
            }
            case 5: {
                var2_2[var4_4] = (byte)((var2_2[var4_4] & 255) >>> var1_1);
                ++var4_4;
            }
            case 4: {
                var2_2[var4_4] = (byte)((var2_2[var4_4] & 255) >>> var1_1);
                ++var4_4;
            }
            case 3: {
                var2_2[var4_4] = (byte)((var2_2[var4_4] & 255) >>> var1_1);
                ++var4_4;
            }
            case 2: {
                var2_2[var4_4] = (byte)((var2_2[var4_4] & 255) >>> var1_1);
                ++var4_4;
            }
            case 1: {
                var2_2[var4_4] = (byte)((var2_2[var4_4] & 255) >>> var1_1);
                ++var4_4;
                ** GOTO lbl39
            }
            default: {
                if (var4_4 < var3_3) ** continue;
            }
        }
        while (true) lbl-1000:
        // 2 sources

        {
            var2_2[var4_4] = (byte)((var2_2[var4_4] & 255) >>> var1_1);
            var2_2[++var4_4] = (byte)((var2_2[var4_4] & 255) >>> var1_1);
            var2_2[++var4_4] = (byte)((var2_2[var4_4] & 255) >>> var1_1);
            var2_2[++var4_4] = (byte)((var2_2[var4_4] & 255) >>> var1_1);
            var2_2[++var4_4] = (byte)((var2_2[var4_4] & 255) >>> var1_1);
            var2_2[++var4_4] = (byte)((var2_2[var4_4] & 255) >>> var1_1);
            var2_2[++var4_4] = (byte)((var2_2[var4_4] & 255) >>> var1_1);
            var2_2[++var4_4] = (byte)((var2_2[var4_4] & 255) >>> var1_1);
            ++var4_4;
lbl39:
            // 2 sources

            if (var4_4 < var3_3) ** GOTO lbl-1000
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void KaMAjaK(int var1_1) {
        var2_2 = this.KAmajaK;
        var3_3 = this.kamAJaK;
        var4_4 = var1_1 < -256 ? -256 : (var1_1 < 256 ? var1_1 : 256);
        System.arraycopy(maaakka.kAmajaK, var4_4 + 256, var2_2, 128, 128);
        System.arraycopy(maaakka.kAmajaK, var4_4 + 384, var2_2, 0, 128);
        var5_5 = this.kAMAJaK * this.KamAJaK;
        var6_6 = 0;
        switch (var5_5 & 7) {
            case 7: {
                var3_3[var6_6] = var2_2[var3_3[var6_6] + 128];
                ++var6_6;
            }
            case 6: {
                var3_3[var6_6] = var2_2[var3_3[var6_6] + 128];
                ++var6_6;
            }
            case 5: {
                var3_3[var6_6] = var2_2[var3_3[var6_6] + 128];
                ++var6_6;
            }
            case 4: {
                var3_3[var6_6] = var2_2[var3_3[var6_6] + 128];
                ++var6_6;
            }
            case 3: {
                var3_3[var6_6] = var2_2[var3_3[var6_6] + 128];
                ++var6_6;
            }
            case 2: {
                var3_3[var6_6] = var2_2[var3_3[var6_6] + 128];
                ++var6_6;
            }
            case 1: {
                var3_3[var6_6] = var2_2[var3_3[var6_6] + 128];
                ++var6_6;
                ** GOTO lbl43
            }
            default: {
                if (var6_6 < var5_5) ** continue;
            }
        }
        while (true) lbl-1000:
        // 2 sources

        {
            var3_3[var6_6] = var2_2[var3_3[var6_6] + 128];
            var3_3[++var6_6] = var2_2[var3_3[var6_6] + 128];
            var3_3[++var6_6] = var2_2[var3_3[var6_6] + 128];
            var3_3[++var6_6] = var2_2[var3_3[var6_6] + 128];
            var3_3[++var6_6] = var2_2[var3_3[var6_6] + 128];
            var3_3[++var6_6] = var2_2[var3_3[var6_6] + 128];
            var3_3[++var6_6] = var2_2[var3_3[var6_6] + 128];
            var3_3[++var6_6] = var2_2[var3_3[var6_6] + 128];
            ++var6_6;
lbl43:
            // 2 sources

            if (var6_6 < var5_5) ** GOTO lbl-1000
            break;
        }
    }

    public void kAmAJaK(maaakka maaakka2, int n, int n2) {
        this.KamAjaK(maaakka2, n, n2, 0, 0, maaakka2.kAMAJaK, maaakka2.KamAJaK);
    }

    public void KamAjaK(maaakka maaakka2, int n, int n2, int n3, int n4, int n5, int n6) {
        if (n < 0) {
            n5 += n;
            n3 -= n;
            n = 0;
        }
        if (n5 <= 0) {
            return;
        }
        if (n + n5 > this.kAMAJaK) {
            n5 = this.kAMAJaK - n;
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
        if (n2 + n6 > this.KamAJaK) {
            n6 = this.KamAJaK - n2;
        }
        if (n6 <= 0) {
            return;
        }
        int n7 = n4 * maaakka2.kAMAJaK + n3;
        int n8 = n2 * this.kAMAJaK + n;
        byte[] byArray = maaakka2.kamAJaK;
        byte[] byArray2 = this.kamAJaK;
        if (maaakka2.kAMAJaK == this.kAMAJaK && this.kAMAJaK == n5) {
            System.arraycopy(byArray, n7, byArray2, n8, n5 * n6);
            return;
        }
        int n9 = 0;
        while (n9 < n6) {
            System.arraycopy(byArray, n7, byArray2, n8, n5);
            n7 += maaakka2.kAMAJaK;
            n8 += this.kAMAJaK;
            ++n9;
        }
    }

    public final void kamAjaK(mmajkka mmajkka2, byte by) {
        int[] nArray = mmajkka2.AMAjakk;
        byte[] byArray = this.kamAJaK;
        int n = this.kAMAJaK * this.KamAJaK;
        int n2 = 0;
        while (n2 < n) {
            if (nArray[n2] < 0) {
                byArray[n2] = by;
            }
            ++n2;
        }
    }

    static {
        int n = 0;
        while (n < 768) {
            int n2 = n - 256;
            int n3 = n2 < 0 ? 0 : (n2 < 256 ? n2 : 255);
            maaakka.kAmajaK[n] = (byte)n3;
            ++n;
        }
    }
}

