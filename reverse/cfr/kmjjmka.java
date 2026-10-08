/*
 * Decompiled with CFR 0.152.
 */
class kmjjmka {
    byte[] KAMaJAK;
    int kAMaJAK;
    int KamaJAK;
    int kamaJAK;
    int KAmaJAK;

    final int KAmAJak() {
        int n = this.KAMaJAK[this.kAMaJAK] & 0xFF | (this.KAMaJAK[this.kAMaJAK + 1] & 0xFF) << 8;
        this.kAMaJAK += 2;
        return n;
    }

    final int kamAJak() {
        int n = this.KAmAJak();
        if ((n & 0x8000) != 0) {
            n |= 0xFFFF0000;
        }
        return n;
    }

    final int kAMAJak() {
        int n = this.KAMaJAK[this.kAMaJAK] & 0xFF | (this.KAMaJAK[this.kAMaJAK + 1] & 0xFF) << 8 | (this.KAMaJAK[this.kAMaJAK + 2] & 0xFF) << 16 | (this.KAMaJAK[this.kAMaJAK + 3] & 0xFF) << 24;
        this.kAMaJAK += 4;
        return n;
    }

    void kaMAJak(majjkmk majjkmk2) {
        this.KAmaJAK = 0;
        this.kamaJAK = 0;
        majjkmk2.kkAmaJa = this.kAmaJak(2);
        int n = this.kAmaJak(4);
        if ((majjkmk2.kkAmaJa & 1) != 0) {
            majjkmk2.KKAmaJa = this.KAmaJak(n);
            majjkmk2.KkamaJa = this.KAmaJak(n);
            majjkmk2.KKamaJa = this.KAmaJak(n);
        } else {
            majjkmk2.KKamaJa = 256;
            majjkmk2.KkamaJa = 256;
            majjkmk2.KKAmaJa = 256;
        }
        if ((majjkmk2.kkAmaJa & 2) != 0) {
            majjkmk2.kKAmaJa = this.KAmaJak(n);
            majjkmk2.kkamaJa = this.KAmaJak(n);
            majjkmk2.kKamaJa = this.KAmaJak(n);
            return;
        }
        majjkmk2.kKamaJa = 0;
        majjkmk2.kkamaJa = 0;
        majjkmk2.kKAmaJa = 0;
    }

    final int KAMAJak() {
        int n = -16777216;
        n |= (this.KAMaJAK[this.kAMaJAK++] & 0xFF) << 16;
        n |= (this.KAMaJAK[this.kAMaJAK++] & 0xFF) << 8;
        return n |= this.KAMaJAK[this.kAMaJAK++] & 0xFF;
    }

    final kaajmmk KaMajak() {
        this.KAmaJAK = 0;
        this.kamaJAK = 0;
        int n = this.kAmaJak(5);
        kaajmmk kaajmmk2 = new kaajmmk();
        kaajmmk2.jAKkAMa = this.KAmaJak(n);
        kaajmmk2.jakkAMa = this.KAmaJak(n);
        kaajmmk2.JakkAMa = this.KAmaJak(n);
        kaajmmk2.JAkkAMa = this.KAmaJak(n);
        return kaajmmk2;
    }

    final kmaammk KaMAJak() {
        int n;
        this.KAmaJAK = 0;
        this.kamaJAK = 0;
        kmaammk kmaammk2 = new kmaammk();
        if (this.kAmaJak(1) != 0) {
            n = this.kAmaJak(5);
            kmaammk2.ajakkAM = this.KAmaJak(n);
            kmaammk2.AjAKkAM = this.KAmaJak(n);
        } else {
            kmaammk2.AjAKkAM = 65536;
            kmaammk2.ajakkAM = 65536;
        }
        if (this.kAmaJak(1) != 0) {
            n = this.kAmaJak(5);
            kmaammk2.AJakkAM = this.KAmaJak(n);
            kmaammk2.aJakkAM = this.KAmaJak(n);
        } else {
            kmaammk2.aJakkAM = 0;
            kmaammk2.AJakkAM = 0;
        }
        n = this.kAmaJak(5);
        kmaammk2.ajAKkAM = this.KAmaJak(n);
        kmaammk2.AJAKkAM = this.KAmaJak(n);
        return kmaammk2;
    }

    final String KamAJak() {
        char c;
        int n = 0;
        int n2 = this.kAMaJAK;
        while ((c = (char)(this.KAMaJAK[this.kAMaJAK++] & 0xFF)) != '\u0000') {
            ++n;
        }
        this.kAMaJAK = n2;
        char[] cArray = new char[n];
        int n3 = 0;
        while (true) {
            char c2 = (char)(this.KAMaJAK[this.kAMaJAK++] & 0xFF);
            if (n3 == n) break;
            cArray[n3++] = c2;
        }
        return new String(cArray);
    }

    final int kAmaJak(int n) {
        int n2;
        int n3 = 0;
        while ((n2 = n - this.KAmaJAK) > 0) {
            n3 |= this.kamaJAK << n2;
            n -= this.KAmaJAK;
            this.kamaJAK = this.KAMaJAK[this.kAMaJAK++] & 0xFF;
            this.KAmaJAK = 8;
        }
        this.KAmaJAK -= n;
        this.kamaJAK &= 255 >>> 8 - this.KAmaJAK;
        return n3 |= this.kamaJAK >>> -n2;
    }

    final int KAmaJak(int n) {
        int n2 = this.kAmaJak(n);
        if ((n2 & 1 << n - 1) != 0) {
            n2 |= -1 << n;
        }
        return n2;
    }

    final void kAmAJak(int[] nArray, int[] nArray2, boolean bl) {
        int n = this.KAMaJAK[this.kAMaJAK++] & 0xFF;
        if (bl) {
            if ((n & 1) != 0) {
                this.kAMAJak();
            }
            if ((n & 2) != 0) {
                this.kAMAJak();
            }
            if ((n & 4) != 0) {
                this.KAmAJak();
            }
            if ((n & 8) != 0) {
                int n2 = this.KAMaJAK[this.kAMaJAK++] & 0xFF;
                int n3 = 0;
                while (n3 < n2) {
                    this.kAMAJak();
                    this.KAmAJak();
                    this.KAmAJak();
                    ++n3;
                }
                return;
            }
        } else {
            nArray2[0] = n >> 4;
            if ((n & 1) != 0) {
                this.kAMAJak();
            }
            if ((n & 2) != 0) {
                this.kAMAJak();
            }
            nArray[0] = (n & 4) != 0 ? this.KAmAJak() : 1;
            if ((n & 8) != 0) {
                int n4 = this.KAMaJAK[this.kAMaJAK++] & 0xFF;
                int n5 = 0;
                while (n5 < n4) {
                    this.kAMAJak();
                    this.KAmAJak();
                    this.KAmAJak();
                    ++n5;
                }
            }
        }
    }

    kmjjmka() {
        super();
    }
}

