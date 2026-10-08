/*
 * Decompiled with CFR 0.152.
 */
final class kmaamka {
    static final byte KKAmAja = 0;
    static final byte kKAmAja = 1;
    static final byte KkamAja = 2;
    String kkamAja = "unnamed";
    byte[] KKamAja;
    int kKamAja;
    int KkAMAja = 32;
    int kkAMAja;
    int KKAMAja;
    byte kKAMAja = 0;
    int KkaMAja;
    int kkaMAja;
    int KKaMAja;
    int kKaMAja = 128;
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

    static final int kKaMAjA(int n) {
        if (n < 0) {
            return 1111111;
        }
        int n2 = mmaakmk.akKAmAj[n % 768] >> n / 768;
        int n3 = n2 << 12;
        return n3;
    }

    public void kKAMAjA(byte[] byArray, int n, int n2) {
        this.kKamAja = n2;
        this.KKamAja = new byte[n2];
        System.arraycopy(byArray, n, this.KKamAja, 0, n2);
    }

    public void kKamAjA(String string) {
        this.kkamAja = string;
    }

    public void kkAMAjA(int n, int n2, int n3) {
        this.kKAMAja = (byte)n;
        this.KkaMAja = n2 << 12;
        this.KKaMAja = n3 << 12;
        this.kkaMAja = this.KkaMAja + this.KKaMAja;
    }

    public void KKamAjA(int n) {
        this.KkAMAja = n;
    }

    public void KKAMAjA(int n) {
        this.kkAMAja = n;
    }

    public void KkAMAjA(int n) {
        this.KKAMAja = n;
    }

    public void KKaMAjA(int n) {
        this.kKaMAja = n;
    }

    public int kkaMAjA(int[] nArray, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = 255 - n6 + (n6 << 16);
        n7 = n7 * n5 >> 8;
        n7 &= 0xFF00FF;
        byte[] byArray = this.KKamAja;
        switch (this.kKAMAja) {
            case 0: {
                int n8 = this.kKamAja << 12;
                int n9 = (n8 - 1 - n3) / n4 + 1;
                if (n9 > n2 - n) {
                    n9 = n2 - n;
                }
                switch (n9 & 3) {
                    case 3: {
                        int n10 = n++;
                        nArray[n10] = nArray[n10] + byArray[n3 >>> 12] * n7;
                        n3 += n4;
                    }
                    case 2: {
                        int n11 = n++;
                        nArray[n11] = nArray[n11] + byArray[n3 >>> 12] * n7;
                        n3 += n4;
                    }
                    case 1: {
                        int n12 = n++;
                        nArray[n12] = nArray[n12] + byArray[n3 >>> 12] * n7;
                        n3 += n4;
                    }
                    case 0: {
                        n9 >>>= 2;
                        while (n9-- > 0) {
                            int n13 = n++;
                            nArray[n13] = nArray[n13] + byArray[n3 >>> 12] * n7;
                            int n14 = n++;
                            nArray[n14] = nArray[n14] + byArray[(n3 += n4) >>> 12] * n7;
                            int n15 = n++;
                            nArray[n15] = nArray[n15] + byArray[(n3 += n4) >>> 12] * n7;
                            int n16 = n++;
                            nArray[n16] = nArray[n16] + byArray[(n3 += n4) >>> 12] * n7;
                            n3 += n4;
                        }
                        break;
                    }
                }
                if (n3 < n8) break;
                n3 = -1;
                break;
            }
            case 1: {
                int n17 = this.kkaMAja;
                int n18 = (n17 - 1 - n3) / n4 + 1;
                while (n < n2) {
                    if (n18 > n2 - n) {
                        n18 = n2 - n;
                    }
                    switch (n18 & 3) {
                        case 3: {
                            int n19 = n++;
                            nArray[n19] = nArray[n19] + byArray[n3 >>> 12] * n7;
                            n3 += n4;
                        }
                        case 2: {
                            int n20 = n++;
                            nArray[n20] = nArray[n20] + byArray[n3 >>> 12] * n7;
                            n3 += n4;
                        }
                        case 1: {
                            int n21 = n++;
                            nArray[n21] = nArray[n21] + byArray[n3 >>> 12] * n7;
                            n3 += n4;
                        }
                        case 0: {
                            n18 >>>= 2;
                            while (n18-- > 0) {
                                int n22 = n++;
                                nArray[n22] = nArray[n22] + byArray[n3 >>> 12] * n7;
                                int n23 = n++;
                                nArray[n23] = nArray[n23] + byArray[(n3 += n4) >>> 12] * n7;
                                int n24 = n++;
                                nArray[n24] = nArray[n24] + byArray[(n3 += n4) >>> 12] * n7;
                                int n25 = n++;
                                nArray[n25] = nArray[n25] + byArray[(n3 += n4) >>> 12] * n7;
                                n3 += n4;
                            }
                            break;
                        }
                    }
                    if (n3 < n17) continue;
                    n3 = this.KkaMAja + (n3 - this.KkaMAja) % this.KKaMAja;
                    n18 = (n17 - 1 - n3) / n4 + 1;
                }
                break;
            }
            case 2: {
                int n26 = n3 >= this.kkaMAja ? this.kkaMAja + this.KKaMAja : this.kkaMAja;
                int n27 = (n26 - 1 - n3) / n4 + 1;
                while (n < n2) {
                    if (n27 > n2 - n) {
                        n27 = n2 - n;
                    }
                    if (n3 >= this.kkaMAja) {
                        n3 = this.kkaMAja + (this.kkaMAja - n3) - 1;
                        switch (n27 & 3) {
                            case 3: {
                                int n28 = n++;
                                nArray[n28] = nArray[n28] + byArray[n3 >>> 12] * n7;
                                n3 -= n4;
                            }
                            case 2: {
                                int n29 = n++;
                                nArray[n29] = nArray[n29] + byArray[n3 >>> 12] * n7;
                                n3 -= n4;
                            }
                            case 1: {
                                int n30 = n++;
                                nArray[n30] = nArray[n30] + byArray[n3 >>> 12] * n7;
                                n3 -= n4;
                            }
                            case 0: {
                                n27 >>>= 2;
                                while (n27-- > 0) {
                                    int n31 = n++;
                                    nArray[n31] = nArray[n31] + byArray[n3 >>> 12] * n7;
                                    int n32 = n++;
                                    nArray[n32] = nArray[n32] + byArray[(n3 -= n4) >>> 12] * n7;
                                    int n33 = n++;
                                    nArray[n33] = nArray[n33] + byArray[(n3 -= n4) >>> 12] * n7;
                                    int n34 = n++;
                                    nArray[n34] = nArray[n34] + byArray[(n3 -= n4) >>> 12] * n7;
                                    n3 -= n4;
                                }
                                break;
                            }
                        }
                        n3 = this.kkaMAja + (this.kkaMAja - n3) + 1;
                    } else {
                        switch (n27 & 3) {
                            case 3: {
                                int n35 = n++;
                                nArray[n35] = nArray[n35] + byArray[n3 >>> 12] * n7;
                                n3 += n4;
                            }
                            case 2: {
                                int n36 = n++;
                                nArray[n36] = nArray[n36] + byArray[n3 >>> 12] * n7;
                                n3 += n4;
                            }
                            case 1: {
                                int n37 = n++;
                                nArray[n37] = nArray[n37] + byArray[n3 >>> 12] * n7;
                                n3 += n4;
                            }
                            case 0: {
                                n27 >>>= 2;
                                while (n27-- > 0) {
                                    int n38 = n++;
                                    nArray[n38] = nArray[n38] + byArray[n3 >>> 12] * n7;
                                    int n39 = n++;
                                    nArray[n39] = nArray[n39] + byArray[(n3 += n4) >>> 12] * n7;
                                    int n40 = n++;
                                    nArray[n40] = nArray[n40] + byArray[(n3 += n4) >>> 12] * n7;
                                    int n41 = n++;
                                    nArray[n41] = nArray[n41] + byArray[(n3 += n4) >>> 12] * n7;
                                    n3 += n4;
                                }
                                break;
                            }
                        }
                    }
                    if (n3 < n26) continue;
                    if ((n3 = this.KkaMAja + (n3 - this.KkaMAja) % (this.KKaMAja << 1)) >= this.kkaMAja) {
                        n26 = this.kkaMAja + this.KKaMAja;
                        n27 = (n26 - 1 - n3) / n4 + 1;
                        continue;
                    }
                    n26 = this.kkaMAja;
                    n27 = (n26 - 1 - n3) / n4 + 1;
                }
                break;
            }
        }
        return n3;
    }

    kmaamka() {
        super();
    }
}

