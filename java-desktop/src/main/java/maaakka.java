import java.awt.image.IndexColorModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class maaakka extends kmaakka
{
    public byte[] kamAJaK;
    public byte[] KAmAJaK;
    public byte[] kAmAJaK;
    public byte[] KaMajaK;
    public final byte[] kaMajaK;
    public final byte[] KAMajaK;
    public final byte[] kAMajaK;
    public final int[] KamajaK;
    int kamajaK;
    final byte[] KAmajaK;
    static final byte[] kAmajaK;
    
    public maaakka(final int n, final int n2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        this(n, n2, 1, false);
        this.KAmAJaK(array, array2, array3, array4);
    }
    
    public maaakka(final int n, final int n2, final int kamajaK, final boolean b) {
        super(n, n2);
        this.kaMajaK = new byte[256];
        this.KAMajaK = new byte[256];
        this.kAMajaK = new byte[256];
        this.KamajaK = new int[256];
        this.KAmajaK = new byte[256];
        this.kamajaK = kamajaK;
        if (this.kamajaK == 1) {
            final byte[] array = new byte[super.kAMAJaK * super.KamAJaK];
            this.KaMajaK = array;
            this.kAmAJaK = array;
            this.kamAJaK = this.kAmAJaK;
            this.KAmAJaK = this.KaMajaK;
        }
        if (this.kamajaK == 2) {
            this.kAmAJaK = new byte[super.kAMAJaK * super.KamAJaK];
            this.KaMajaK = new byte[super.kAMAJaK * super.KamAJaK];
            this.kamAJaK = this.kAmAJaK;
            this.KAmAJaK = this.KaMajaK;
        }
        for (int i = 0; i < super.kAMAJaK * super.KamAJaK; ++i) {
            this.kamAJaK[i] = (byte)i;
        }
        for (int j = 0; j < 256; ++j) {
            this.kaMajaK[j] = (byte)Math.min(255.0, j * 2);
            this.KAMajaK[j] = (byte)Math.min(255.0, j * 3);
            this.kAMajaK[j] = (byte)Math.min(255.0, j);
        }
        this.kaMAjaK(this.kaMajaK, this.KAMajaK, this.kAMajaK);
        this.kAmaJaK(b);
    }
    
    public final void kAmAjaK(final maaakka maaakka) {
        this.KAMAjaK((IndexColorModel)maaakka.KAMAJaK);
    }
    
    public final void KAMAjaK(final IndexColorModel indexColorModel) {
        for (int i = 0; i < 256; ++i) {
            this.kaMajaK[i] = 0;
            this.KAMajaK[i] = 0;
            this.kAMajaK[i] = 0;
        }
        indexColorModel.getReds(this.kaMajaK);
        indexColorModel.getGreens(this.KAMajaK);
        indexColorModel.getBlues(this.kAMajaK);
        this.KaMajaK();
    }
    
    public final void kaMAjaK(final byte[] array, final byte[] array2, final byte[] array3) {
        System.arraycopy(array, 0, this.kaMajaK, 0, 256);
        System.arraycopy(array2, 0, this.KAMajaK, 0, 256);
        System.arraycopy(array3, 0, this.kAMajaK, 0, 256);
        this.KaMajaK();
    }
    
    public final void KaMajaK() {
        super.KAMAJaK = new IndexColorModel(8, 256, this.kaMajaK, this.KAMajaK, this.kAMajaK);
        for (int i = 0; i < 256; ++i) {
            this.KamajaK[i] = ((this.kaMajaK[i] & 0xFF) << 20) + ((this.KAMajaK[i] & 0xFF) << 10) + (this.kAMajaK[i] & 0xFF);
        }
    }
    
    public final void KAmAJaK(final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4) {
        System.arraycopy(array, 0, this.kamAJaK, 0, Math.min(array.length, this.kamAJaK.length));
        System.arraycopy(array2, 0, this.kaMajaK, 0, Math.min(array2.length, this.kaMajaK.length));
        System.arraycopy(array3, 0, this.KAMajaK, 0, Math.min(array3.length, this.KAMajaK.length));
        System.arraycopy(array4, 0, this.kAMajaK, 0, Math.min(array4.length, this.kAMajaK.length));
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
    
    public final void kamaJaK(final int n, final int n2, final int n3, final int n4) {
        if (super.KaMAJaK != null) {
            super.KaMAJaK.setPixels(n, n2, n3, n4, super.KAMAJaK, this.kamAJaK, n2 * super.kAMAJaK + n, super.kAMAJaK);
            super.KaMAJaK.imageComplete(3);
        }
    }
    
    public final void KAMajaK(final int n) {
        final byte b = (byte)n;
        final int n2 = super.kAMAJaK * super.KamAJaK;
        final byte[] kAmAJaK = this.kAmAJaK;
        final byte[] kaMajaK = this.KaMajaK;
        for (int i = 0; i < n2; kaMajaK[i++] = b) {
            kAmAJaK[i] = b;
        }
    }
    
    public final void kamAJaK() {
        final int n = super.kAMAJaK - 1 - 3;
        final int n2 = super.KamAJaK - 1;
        final byte[] kAmAJaK = this.KAmAJaK;
        for (int i = 1; i < n2; ++i) {
            int n3 = (i - 1) * super.kAMAJaK;
            int n4 = i * super.kAMAJaK;
            int n5 = (i + 1) * super.kAMAJaK;
            int n6 = this.kamAJaK[n3++] & 0xFF;
            int n7 = this.kamAJaK[n3++] & 0xFF;
            int n8 = this.kamAJaK[n3++] & 0xFF;
            int n9 = this.kamAJaK[n4++] & 0xFF;
            int n10 = this.kamAJaK[n4++] & 0xFF;
            int n11 = this.kamAJaK[n4++] & 0xFF;
            int n12 = this.kamAJaK[n5++] & 0xFF;
            int n13 = this.kamAJaK[n5++] & 0xFF;
            int n14 = this.kamAJaK[n5++] & 0xFF;
            int n15 = n6 + n7 + n8 + n9 + n10 + n11 + n12 + n13 + n14;
            int n16 = i * super.kAMAJaK + 1;
            for (int j = 1; j < n; j += 3) {
                kAmAJaK[n16++] = (byte)((n15 + 1) / 9);
                final int n17 = n15 - (n6 + n9 + n12);
                n6 = (this.kamAJaK[n3++] & 0xFF);
                n9 = (this.kamAJaK[n4++] & 0xFF);
                n12 = (this.kamAJaK[n5++] & 0xFF);
                final int n18 = n17 + (n6 + n9 + n12);
                kAmAJaK[n16++] = (byte)(n18 / 9);
                final int n19 = n18 - (n7 + n10 + n13);
                n7 = (this.kamAJaK[n3++] & 0xFF);
                n10 = (this.kamAJaK[n4++] & 0xFF);
                n13 = (this.kamAJaK[n5++] & 0xFF);
                final int n20 = n19 + (n7 + n10 + n13);
                kAmAJaK[n16++] = (byte)(n20 / 9);
                final int n21 = n20 - (n8 + n11 + n14);
                n8 = (this.kamAJaK[n3++] & 0xFF);
                n11 = (this.kamAJaK[n4++] & 0xFF);
                n14 = (this.kamAJaK[n5++] & 0xFF);
                n15 = n21 + (n8 + n11 + n14);
            }
        }
        this.kamajaK();
    }
    
    public final void kAMajaK() {
        final int n = super.kAMAJaK - 1;
        final int n2 = super.KamAJaK - 1;
        final byte[] kAmAJaK = this.KAmAJaK;
        for (int i = 1; i < n2; ++i) {
            int n3 = (i - 1) * super.kAMAJaK + 1;
            final int n4 = i * super.kAMAJaK - n3;
            final int n5 = i * super.kAMAJaK + 2 - n3;
            final int n6 = (i + 1) * super.kAMAJaK + 1 - n3;
            int n7 = i * super.kAMAJaK + 1;
            for (int j = 1; j < n; ++j) {
                kAmAJaK[n7] = (byte)((this.kamAJaK[n3] & 0xFF) + (this.kamAJaK[n3 + n4] & 0xFF) + (this.kamAJaK[n3 + n5] & 0xFF) + (this.kamAJaK[n3 + n6] & 0xFF) >>> 2);
                ++n3;
                ++n7;
            }
        }
        this.kamajaK();
    }
    
    public final void kAMAjaK(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n < 0 || n2 < 0) {
            return;
        }
        if (n + n5 > super.kAMAJaK || n2 + n6 > super.KamAJaK) {
            return;
        }
        final byte[] kAmAJaK = this.KAmAJaK;
        final byte[] kamAJaK = this.kamAJaK;
        int n7 = n2 * super.kAMAJaK + n;
        int n8 = n4 * super.kAMAJaK + n3;
        final int n9 = super.kAMAJaK - n5;
        for (int i = 0; i < n6; ++i) {
            for (int j = 0; j < n5; ++j) {
                kamAJaK[n8++] = kAmAJaK[n7++];
            }
            n8 += n9;
            n7 += n9;
        }
    }
    
    public final void KAMAJaK() {
        final byte[] kAmAJaK = this.KAmAJaK;
        final byte[] kamAJaK = this.kamAJaK;
        for (int n = super.kAMAJaK * super.KamAJaK, i = 0; i < n; ++i) {
            kamAJaK[i] = (byte)((kAmAJaK[i] & 0xFF) + (kamAJaK[i] & 0xFF) >> 1);
        }
    }
    
    public final void KAmajaK(final double n) {
        this.KamajaK(n, super.kAMAJaK / 2, super.KamAJaK / 2);
    }
    
    public final void KamajaK(final double n, final double n2, final double n3) {
        final double n4 = 1.0 / n;
        this.kAMAJaK(this.kamAJaK, n4, 0.0, 0.0, n4, n2, n3);
    }
    
    public final void KamAJaK(final double n, final double n2) {
        this.KAmAjaK(n, n2, super.kAMAJaK / 2, super.KamAJaK / 2);
    }
    
    public final void KAmAjaK(final double n, final double n2, final double n3, final double n4) {
        final double n5 = 1.0 / n;
        this.kAMAJaK(this.kamAJaK, n5 * Math.cos(n2), n5 * Math.sin(n2), n5 * Math.cos(n2 + 1.5707963267948966), n5 * Math.sin(n2 + 1.5707963267948966), n3, n4);
    }
    
    public final void kaMajaK(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        this.kAMAJaK(this.kamAJaK, n, n2, n3, n4, n5, n6);
    }
    
    public final void kAMAJaK(final byte[] array, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        final byte[] kAmAJaK = this.KAmAJaK;
        final int n7 = (int)(n * 65536.0);
        final int n8 = (int)(n2 * 65536.0);
        final int n9 = (int)(n3 * 65536.0);
        final int n10 = (int)(n4 * 65536.0);
        final int n11 = (int)(-(n5 * n + n6 * n3) * 65536.0);
        final int n12 = (int)(-(n5 * n2 + n6 * n4) * 65536.0);
        int n13 = n11 + (int)(n5 * 65536.0);
        int n14 = n12 + (int)(n6 * 65536.0);
        int i = 0;
        if (super.kAMAJaK == 256 && super.KamAJaK == 128) {
            for (int j = 0; j < super.KamAJaK; ++j) {
                for (int n15 = n13, n16 = n14; i < i + super.kAMAJaK; ++i, n15 += n7, n16 += n8) {
                    kAmAJaK[i] = array[n15 << 8 >>> 24 | n16 << 9 >>> 25 << 8];
                }
                n13 += n9;
                n14 += n10;
            }
        }
        else if (super.kAMAJaK == 512 && super.KamAJaK == 256) {
            for (int k = 0; k < super.KamAJaK; ++k) {
                for (int n17 = n13, n18 = n14; i < i + super.kAMAJaK; ++i, n17 += n7, n18 += n8) {
                    kAmAJaK[i] = array[n17 << 7 >>> 23 | n18 << 8 >>> 24 << 9];
                }
                n13 += n9;
                n14 += n10;
            }
        }
        else if (super.kAMAJaK == 256 && super.KamAJaK == 256) {
            for (int l = 0; l < super.KamAJaK; ++l) {
                for (int n19 = n13, n20 = n14; i < i + super.kAMAJaK; ++i, n19 += n7, n20 += n8) {
                    kAmAJaK[i] = array[n19 << 8 >>> 24 | n20 << 8 >>> 24 << 8];
                }
                n13 += n9;
                n14 += n10;
            }
        }
        this.kamajaK();
    }
    
    public final void kAmajaK(final int n) {
        final byte[] kamAJaK = this.kamAJaK;
        final int n2 = super.kAMAJaK * super.KamAJaK;
        int i = 0;
        switch (n2 & 0x7) {
            case 7: {
                kamAJaK[i] = (byte)((kamAJaK[i] & 0xFF) >>> n);
                ++i;
            }
            case 6: {
                kamAJaK[i] = (byte)((kamAJaK[i] & 0xFF) >>> n);
                ++i;
            }
            case 5: {
                kamAJaK[i] = (byte)((kamAJaK[i] & 0xFF) >>> n);
                ++i;
            }
            case 4: {
                kamAJaK[i] = (byte)((kamAJaK[i] & 0xFF) >>> n);
                ++i;
            }
            case 3: {
                kamAJaK[i] = (byte)((kamAJaK[i] & 0xFF) >>> n);
                ++i;
            }
            case 2: {
                kamAJaK[i] = (byte)((kamAJaK[i] & 0xFF) >>> n);
                ++i;
            }
            case 1: {
                kamAJaK[i] = (byte)((kamAJaK[i] & 0xFF) >>> n);
                ++i;
                break;
            }
        }
        while (i < n2) {
            kamAJaK[i] = (byte)((kamAJaK[i] & 0xFF) >>> n);
            ++i;
            kamAJaK[i] = (byte)((kamAJaK[i] & 0xFF) >>> n);
            ++i;
            kamAJaK[i] = (byte)((kamAJaK[i] & 0xFF) >>> n);
            ++i;
            kamAJaK[i] = (byte)((kamAJaK[i] & 0xFF) >>> n);
            ++i;
            kamAJaK[i] = (byte)((kamAJaK[i] & 0xFF) >>> n);
            ++i;
            kamAJaK[i] = (byte)((kamAJaK[i] & 0xFF) >>> n);
            ++i;
            kamAJaK[i] = (byte)((kamAJaK[i] & 0xFF) >>> n);
            ++i;
            kamAJaK[i] = (byte)((kamAJaK[i] & 0xFF) >>> n);
            ++i;
        }
    }
    
    public final void KaMAjaK(final int n) {
        final byte[] kAmajaK = this.KAmajaK;
        final byte[] kamAJaK = this.kamAJaK;
        final int n2 = (n < -256) ? -256 : ((n < 256) ? n : 256);
        System.arraycopy(maaakka.kAmajaK, n2 + 256, kAmajaK, 128, 128);
        System.arraycopy(maaakka.kAmajaK, n2 + 384, kAmajaK, 0, 128);
        final int n3 = super.kAMAJaK * super.KamAJaK;
        int i = 0;
        switch (n3 & 0x7) {
            case 7: {
                kamAJaK[i] = kAmajaK[kamAJaK[i] + 128];
                ++i;
            }
            case 6: {
                kamAJaK[i] = kAmajaK[kamAJaK[i] + 128];
                ++i;
            }
            case 5: {
                kamAJaK[i] = kAmajaK[kamAJaK[i] + 128];
                ++i;
            }
            case 4: {
                kamAJaK[i] = kAmajaK[kamAJaK[i] + 128];
                ++i;
            }
            case 3: {
                kamAJaK[i] = kAmajaK[kamAJaK[i] + 128];
                ++i;
            }
            case 2: {
                kamAJaK[i] = kAmajaK[kamAJaK[i] + 128];
                ++i;
            }
            case 1: {
                kamAJaK[i] = kAmajaK[kamAJaK[i] + 128];
                ++i;
                break;
            }
        }
        while (i < n3) {
            kamAJaK[i] = kAmajaK[kamAJaK[i] + 128];
            ++i;
            kamAJaK[i] = kAmajaK[kamAJaK[i] + 128];
            ++i;
            kamAJaK[i] = kAmajaK[kamAJaK[i] + 128];
            ++i;
            kamAJaK[i] = kAmajaK[kamAJaK[i] + 128];
            ++i;
            kamAJaK[i] = kAmajaK[kamAJaK[i] + 128];
            ++i;
            kamAJaK[i] = kAmajaK[kamAJaK[i] + 128];
            ++i;
            kamAJaK[i] = kAmajaK[kamAJaK[i] + 128];
            ++i;
            kamAJaK[i] = kAmajaK[kamAJaK[i] + 128];
            ++i;
        }
    }
    
    public void kAmAJaK(final maaakka maaakka, final int n, final int n2) {
        this.KamAjaK(maaakka, n, n2, 0, 0, maaakka.kAMAJaK, maaakka.KamAJaK);
    }
    
    public void KamAjaK(final maaakka maaakka, int n, int n2, int n3, int n4, int n5, int n6) {
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
        int n7 = n4 * maaakka.kAMAJaK + n3;
        int n8 = n2 * super.kAMAJaK + n;
        final byte[] kamAJaK = maaakka.kamAJaK;
        final byte[] kamAJaK2 = this.kamAJaK;
        if (maaakka.kAMAJaK == super.kAMAJaK && super.kAMAJaK == n5) {
            System.arraycopy(kamAJaK, n7, kamAJaK2, n8, n5 * n6);
            return;
        }
        for (int i = 0; i < n6; ++i) {
            System.arraycopy(kamAJaK, n7, kamAJaK2, n8, n5);
            n7 += maaakka.kAMAJaK;
            n8 += super.kAMAJaK;
        }
    }
    
    public final void kamAjaK(final mmajkka mmajkka, final byte b) {
        final int[] amAjakk = mmajkka.AMAjakk;
        final byte[] kamAJaK = this.kamAJaK;
        for (int n = super.kAMAJaK * super.KamAJaK, i = 0; i < n; ++i) {
            if (amAjakk[i] < 0) {
                kamAJaK[i] = b;
            }
        }
    }
    
    static {
        kAmajaK = new byte[768];
        for (int i = 0; i < 768; ++i) {
            final int n = i - 256;
            maaakka.kAmajaK[i] = (byte)((n < 0) ? 0 : ((n < 256) ? n : 255));
        }
    }
}
