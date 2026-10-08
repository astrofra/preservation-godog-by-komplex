// 
// Decompiled by Procyon v0.6.0
// 

class MovieBitReader
{
    byte[] KAMaJAK;
    int kAMaJAK;
    int KamaJAK;
    int kamaJAK;
    int KAmaJAK;
    
    final int KAmAJak() {
        final int n = (this.KAMaJAK[this.kAMaJAK] & 0xFF) | (this.KAMaJAK[this.kAMaJAK + 1] & 0xFF) << 8;
        this.kAMaJAK += 2;
        return n;
    }
    
    final int kamAJak() {
        int kAmAJak = this.KAmAJak();
        if ((kAmAJak & 0x8000) != 0x0) {
            kAmAJak |= 0xFFFF0000;
        }
        return kAmAJak;
    }
    
    final int kAMAJak() {
        final int n = (this.KAMaJAK[this.kAMaJAK] & 0xFF) | (this.KAMaJAK[this.kAMaJAK + 1] & 0xFF) << 8 | (this.KAMaJAK[this.kAMaJAK + 2] & 0xFF) << 16 | (this.KAMaJAK[this.kAMaJAK + 3] & 0xFF) << 24;
        this.kAMaJAK += 4;
        return n;
    }
    
    void kaMAJak(final MovieColorTransform majjkmk) {
        this.KAmaJAK = 0;
        this.kamaJAK = 0;
        majjkmk.kkAmaJa = this.kAmaJak(2);
        final int kAmaJak = this.kAmaJak(4);
        if ((majjkmk.kkAmaJa & 0x1) != 0x0) {
            majjkmk.KKAmaJa = this.KAmaJak(kAmaJak);
            majjkmk.KkamaJa = this.KAmaJak(kAmaJak);
            majjkmk.KKamaJa = this.KAmaJak(kAmaJak);
        }
        else {
            final int kkAmaJa = 256;
            majjkmk.KKamaJa = kkAmaJa;
            majjkmk.KkamaJa = kkAmaJa;
            majjkmk.KKAmaJa = kkAmaJa;
        }
        if ((majjkmk.kkAmaJa & 0x2) != 0x0) {
            majjkmk.kKAmaJa = this.KAmaJak(kAmaJak);
            majjkmk.kkamaJa = this.KAmaJak(kAmaJak);
            majjkmk.kKamaJa = this.KAmaJak(kAmaJak);
            return;
        }
        final int kkAmaJa2 = 0;
        majjkmk.kKamaJa = kkAmaJa2;
        majjkmk.kkamaJa = kkAmaJa2;
        majjkmk.kKAmaJa = kkAmaJa2;
    }
    
    final int KAMAJak() {
        return 0xFF000000 | (this.KAMaJAK[this.kAMaJAK++] & 0xFF) << 16 | (this.KAMaJAK[this.kAMaJAK++] & 0xFF) << 8 | (this.KAMaJAK[this.kAMaJAK++] & 0xFF);
    }
    
    final MovieBounds KaMajak() {
        this.KAmaJAK = 0;
        this.kamaJAK = 0;
        final int kAmaJak = this.kAmaJak(5);
        final MovieBounds kaajmmk = new MovieBounds();
        kaajmmk.minX = this.KAmaJak(kAmaJak);
        kaajmmk.maxX = this.KAmaJak(kAmaJak);
        kaajmmk.minY = this.KAmaJak(kAmaJak);
        kaajmmk.maxY = this.KAmaJak(kAmaJak);
        return kaajmmk;
    }
    
    final MovieTransform KaMAJak() {
        this.KAmaJAK = 0;
        this.kamaJAK = 0;
        final MovieTransform kmaammk = new MovieTransform();
        if (this.kAmaJak(1) != 0) {
            final int kAmaJak = this.kAmaJak(5);
            kmaammk.ajakkAM = this.KAmaJak(kAmaJak);
            kmaammk.AjAKkAM = this.KAmaJak(kAmaJak);
        }
        else {
            final MovieTransform kmaammk2 = kmaammk;
            final MovieTransform kmaammk3 = kmaammk;
            final int n = 65536;
            kmaammk3.AjAKkAM = n;
            kmaammk2.ajakkAM = n;
        }
        if (this.kAmaJak(1) != 0) {
            final int kAmaJak2 = this.kAmaJak(5);
            kmaammk.AJakkAM = this.KAmaJak(kAmaJak2);
            kmaammk.aJakkAM = this.KAmaJak(kAmaJak2);
        }
        else {
            final MovieTransform kmaammk4 = kmaammk;
            final MovieTransform kmaammk5 = kmaammk;
            final int n2 = 0;
            kmaammk5.aJakkAM = n2;
            kmaammk4.AJakkAM = n2;
        }
        final int kAmaJak3 = this.kAmaJak(5);
        kmaammk.ajAKkAM = this.KAmaJak(kAmaJak3);
        kmaammk.AJAKkAM = this.KAmaJak(kAmaJak3);
        return kmaammk;
    }
    
    final String KamAJak() {
        int n = 0;
        final int kaMaJAK = this.kAMaJAK;
        while ((char)(this.KAMaJAK[this.kAMaJAK++] & 0xFF) != '\0') {
            ++n;
        }
        this.kAMaJAK = kaMaJAK;
        final char[] value = new char[n];
        int n2 = 0;
        while (true) {
            final char c = (char)(this.KAMaJAK[this.kAMaJAK++] & 0xFF);
            if (n2 == n) {
                break;
            }
            value[n2++] = c;
        }
        return new String(value);
    }
    
    final int kAmaJak(int n) {
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n - this.KAmaJAK;
            if (n3 <= 0) {
                break;
            }
            n2 |= this.kamaJAK << n3;
            n -= this.KAmaJAK;
            this.kamaJAK = (this.KAMaJAK[this.kAMaJAK++] & 0xFF);
            this.KAmaJAK = 8;
        }
        final int n4 = n2 | this.kamaJAK >>> -n3;
        this.KAmaJAK -= n;
        this.kamaJAK &= 255 >>> 8 - this.KAmaJAK;
        return n4;
    }
    
    final int KAmaJak(final int n) {
        int kAmaJak = this.kAmaJak(n);
        if ((kAmaJak & 1 << n - 1) != 0x0) {
            kAmaJak |= -1 << n;
        }
        return kAmaJak;
    }
    
    final void kAmAJak(final int[] array, final int[] array2, final boolean b) {
        final int n = this.KAMaJAK[this.kAMaJAK++] & 0xFF;
        if (b) {
            if ((n & 0x1) != 0x0) {
                this.kAMAJak();
            }
            if ((n & 0x2) != 0x0) {
                this.kAMAJak();
            }
            if ((n & 0x4) != 0x0) {
                this.KAmAJak();
            }
            if ((n & 0x8) != 0x0) {
                for (int n2 = this.KAMaJAK[this.kAMaJAK++] & 0xFF, i = 0; i < n2; ++i) {
                    this.kAMAJak();
                    this.KAmAJak();
                    this.KAmAJak();
                }
            }
        }
        else {
            array2[0] = n >> 4;
            if ((n & 0x1) != 0x0) {
                this.kAMAJak();
            }
            if ((n & 0x2) != 0x0) {
                this.kAMAJak();
            }
            if ((n & 0x4) != 0x0) {
                array[0] = this.KAmAJak();
            }
            else {
                array[0] = 1;
            }
            if ((n & 0x8) != 0x0) {
                for (int n3 = this.KAMaJAK[this.kAMaJAK++] & 0xFF, j = 0; j < n3; ++j) {
                    this.kAMAJak();
                    this.KAmAJak();
                    this.KAmAJak();
                }
            }
        }
    }
}
