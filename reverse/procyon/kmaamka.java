// 
// Decompiled by Procyon v0.6.0
// 

final class kmaamka
{
    static final byte KKAmAja = 0;
    static final byte kKAmAja = 1;
    static final byte KkamAja = 2;
    String kkamAja;
    byte[] KKamAja;
    int kKamAja;
    int KkAMAja;
    int kkAMAja;
    int KKAMAja;
    byte kKAMAja;
    int KkaMAja;
    int kkaMAja;
    int KKaMAja;
    int kKaMAja;
    static final int KkAmaja = 12;
    static final int kkAmaja = 4096;
    static final int KKAmaja = 4095;
    
    final int KkaMAjA(int n) {
        n += this.KkAMAja;
        if (--n < 0) {
            n = 0;
        }
        if (n > 118) {
            n = 118;
        }
        return 7680 - n * 16 * 4 - this.kkAMAja / 2;
    }
    
    static final int kKaMAjA(final int n) {
        if (n < 0) {
            return 1111111;
        }
        return mmaakmk.akKAmAj[n % 768] >> n / 768 << 12;
    }
    
    public void kKAMAjA(final byte[] array, final int n, final int kKamAja) {
        this.kKamAja = kKamAja;
        System.arraycopy(array, n, this.KKamAja = new byte[kKamAja], 0, kKamAja);
    }
    
    public void kKamAjA(final String kkamAja) {
        this.kkamAja = kkamAja;
    }
    
    public void kkAMAjA(final int n, final int n2, final int n3) {
        this.kKAMAja = (byte)n;
        this.KkaMAja = n2 << 12;
        this.KKaMAja = n3 << 12;
        this.kkaMAja = this.KkaMAja + this.KKaMAja;
    }
    
    public void KKamAjA(final int kkAMAja) {
        this.KkAMAja = kkAMAja;
    }
    
    public void KKAMAjA(final int kkAMAja) {
        this.kkAMAja = kkAMAja;
    }
    
    public void KkAMAjA(final int kkamAja) {
        this.KKAMAja = kkamAja;
    }
    
    public void KKaMAjA(final int kKaMAja) {
        this.kKaMAja = kKaMAja;
    }
    
    public int kkaMAjA(final int[] array, int i, final int n, int n2, final int n3, final int n4, final int n5) {
        final int n6 = (255 - n5 + (n5 << 16)) * n4 >> 8 & 0xFF00FF;
        final byte[] kKamAja = this.KKamAja;
        switch (this.kKAMAja) {
            case 0: {
                final int n7 = this.kKamAja << 12;
                int n8 = (n7 - 1 - n2) / n3 + 1;
                if (n8 > n - i) {
                    n8 = n - i;
                }
                switch (n8 & 0x3) {
                    case 3: {
                        final int n9 = i++;
                        array[n9] += kKamAja[n2 >>> 12] * n6;
                        n2 += n3;
                    }
                    case 2: {
                        final int n10 = i++;
                        array[n10] += kKamAja[n2 >>> 12] * n6;
                        n2 += n3;
                    }
                    case 1: {
                        final int n11 = i++;
                        array[n11] += kKamAja[n2 >>> 12] * n6;
                        n2 += n3;
                    }
                    case 0: {
                        int n12 = n8 >>> 2;
                        while (n12-- > 0) {
                            final int n13 = i++;
                            array[n13] += kKamAja[n2 >>> 12] * n6;
                            n2 += n3;
                            final int n14 = i++;
                            array[n14] += kKamAja[n2 >>> 12] * n6;
                            n2 += n3;
                            final int n15 = i++;
                            array[n15] += kKamAja[n2 >>> 12] * n6;
                            n2 += n3;
                            final int n16 = i++;
                            array[n16] += kKamAja[n2 >>> 12] * n6;
                            n2 += n3;
                        }
                        break;
                    }
                }
                if (n2 >= n7) {
                    n2 = -1;
                    break;
                }
                break;
            }
            case 1: {
                final int kkaMAja = this.kkaMAja;
                int n17 = (kkaMAja - 1 - n2) / n3 + 1;
                while (i < n) {
                    if (n17 > n - i) {
                        n17 = n - i;
                    }
                    switch (n17 & 0x3) {
                        case 3: {
                            final int n18 = i++;
                            array[n18] += kKamAja[n2 >>> 12] * n6;
                            n2 += n3;
                        }
                        case 2: {
                            final int n19 = i++;
                            array[n19] += kKamAja[n2 >>> 12] * n6;
                            n2 += n3;
                        }
                        case 1: {
                            final int n20 = i++;
                            array[n20] += kKamAja[n2 >>> 12] * n6;
                            n2 += n3;
                        }
                        case 0: {
                            n17 >>>= 2;
                            while (n17-- > 0) {
                                final int n21 = i++;
                                array[n21] += kKamAja[n2 >>> 12] * n6;
                                n2 += n3;
                                final int n22 = i++;
                                array[n22] += kKamAja[n2 >>> 12] * n6;
                                n2 += n3;
                                final int n23 = i++;
                                array[n23] += kKamAja[n2 >>> 12] * n6;
                                n2 += n3;
                                final int n24 = i++;
                                array[n24] += kKamAja[n2 >>> 12] * n6;
                                n2 += n3;
                            }
                            break;
                        }
                    }
                    if (n2 >= kkaMAja) {
                        n2 = this.KkaMAja + (n2 - this.KkaMAja) % this.KKaMAja;
                        n17 = (kkaMAja - 1 - n2) / n3 + 1;
                    }
                }
                break;
            }
            case 2: {
                int n25;
                if (n2 >= this.kkaMAja) {
                    n25 = this.kkaMAja + this.KKaMAja;
                }
                else {
                    n25 = this.kkaMAja;
                }
                int n26 = (n25 - 1 - n2) / n3 + 1;
                while (i < n) {
                    if (n26 > n - i) {
                        n26 = n - i;
                    }
                    if (n2 >= this.kkaMAja) {
                        n2 = this.kkaMAja + (this.kkaMAja - n2) - 1;
                        switch (n26 & 0x3) {
                            case 3: {
                                final int n27 = i++;
                                array[n27] += kKamAja[n2 >>> 12] * n6;
                                n2 -= n3;
                            }
                            case 2: {
                                final int n28 = i++;
                                array[n28] += kKamAja[n2 >>> 12] * n6;
                                n2 -= n3;
                            }
                            case 1: {
                                final int n29 = i++;
                                array[n29] += kKamAja[n2 >>> 12] * n6;
                                n2 -= n3;
                            }
                            case 0: {
                                n26 >>>= 2;
                                while (n26-- > 0) {
                                    final int n30 = i++;
                                    array[n30] += kKamAja[n2 >>> 12] * n6;
                                    n2 -= n3;
                                    final int n31 = i++;
                                    array[n31] += kKamAja[n2 >>> 12] * n6;
                                    n2 -= n3;
                                    final int n32 = i++;
                                    array[n32] += kKamAja[n2 >>> 12] * n6;
                                    n2 -= n3;
                                    final int n33 = i++;
                                    array[n33] += kKamAja[n2 >>> 12] * n6;
                                    n2 -= n3;
                                }
                                break;
                            }
                        }
                        n2 = this.kkaMAja + (this.kkaMAja - n2) + 1;
                    }
                    else {
                        switch (n26 & 0x3) {
                            case 3: {
                                final int n34 = i++;
                                array[n34] += kKamAja[n2 >>> 12] * n6;
                                n2 += n3;
                            }
                            case 2: {
                                final int n35 = i++;
                                array[n35] += kKamAja[n2 >>> 12] * n6;
                                n2 += n3;
                            }
                            case 1: {
                                final int n36 = i++;
                                array[n36] += kKamAja[n2 >>> 12] * n6;
                                n2 += n3;
                            }
                            case 0: {
                                n26 >>>= 2;
                                while (n26-- > 0) {
                                    final int n37 = i++;
                                    array[n37] += kKamAja[n2 >>> 12] * n6;
                                    n2 += n3;
                                    final int n38 = i++;
                                    array[n38] += kKamAja[n2 >>> 12] * n6;
                                    n2 += n3;
                                    final int n39 = i++;
                                    array[n39] += kKamAja[n2 >>> 12] * n6;
                                    n2 += n3;
                                    final int n40 = i++;
                                    array[n40] += kKamAja[n2 >>> 12] * n6;
                                    n2 += n3;
                                }
                                break;
                            }
                        }
                    }
                    if (n2 >= n25) {
                        n2 = this.KkaMAja + (n2 - this.KkaMAja) % (this.KKaMAja << 1);
                        if (n2 >= this.kkaMAja) {
                            n25 = this.kkaMAja + this.KKaMAja;
                            n26 = (n25 - 1 - n2) / n3 + 1;
                        }
                        else {
                            n25 = this.kkaMAja;
                            n26 = (n25 - 1 - n2) / n3 + 1;
                        }
                    }
                }
                break;
            }
        }
        return n2;
    }
    
    kmaamka() {
        this.kkamAja = "unnamed";
        this.KkAMAja = 32;
        this.kKAMAja = 0;
        this.kKaMAja = 128;
    }
}
