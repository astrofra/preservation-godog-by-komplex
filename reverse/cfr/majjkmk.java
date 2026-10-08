/*
 * Decompiled with CFR 0.152.
 */
final class majjkmk {
    int kkAmaJa;
    int KKAmaJa;
    int kKAmaJa;
    int KkamaJa;
    int kkamaJa;
    int KKamaJa;
    int kKamaJa;
    private byte[] KkAMaJa;
    private byte[] kkAMaJa;
    private byte[] KKAMaJa;
    private kaajkkk kKAMaJa;

    majjkmk(kaajkkk kaajkkk2) {
        super();
        this.kKAMaJa = kaajkkk2;
    }

    private static void KKAmAJA(int n, int n2, byte[] byArray) {
        int n3 = n2 << 8;
        int n4 = 256;
        int n5 = 0;
        while (n4-- != 0) {
            byArray[n5++] = (n3 & 0xFFFF0000) == 0 ? (int)(n3 >> 8) : (n3 > 0 ? -1 : 0);
            n3 += n;
        }
    }

    void kkamAJA() {
        this.KkAMaJa = new byte[256];
        this.kkAMaJa = new byte[256];
        this.KKAMaJa = new byte[256];
        if (this.KkAMaJa == null || this.kkAMaJa == null || this.KKAMaJa == null) {
            this.KKAMaJa = null;
            this.kkAMaJa = null;
            this.KkAMaJa = null;
            return;
        }
        majjkmk.KKAmAJA(this.KKAmaJa, this.kKAmaJa, this.KkAMaJa);
        majjkmk.KKAmAJA(this.KkamaJa, this.kkamaJa, this.kkAMaJa);
        majjkmk.KKAmAJA(this.KKamaJa, this.kKamaJa, this.KKAMaJa);
    }

    void KKamAJA(int[] nArray, int n) {
        if (this.kkAmaJa == 0 || this.KkAMaJa == null) {
            return;
        }
        int n2 = 0;
        while (n2 < n) {
            int n3 = nArray[n2];
            int n4 = this.KkAMaJa[n3 >> 16 & 0xFF] & 0xFF;
            int n5 = this.kkAMaJa[n3 >> 8 & 0xFF] & 0xFF;
            int n6 = this.KKAMaJa[n3 & 0xFF] & 0xFF;
            nArray[n2] = 0xFF000000 | n4 << 16 | n5 << 8 | n6;
            ++n2;
        }
    }

    int KkamAJA(int n) {
        if (this.kkAmaJa == 0 || this.KkAMaJa == null) {
            return n;
        }
        int n2 = this.KkAMaJa[n >> 16 & 0xFF] & 0xFF;
        int n3 = this.kkAMaJa[n >> 8 & 0xFF] & 0xFF;
        int n4 = this.KKAMaJa[n & 0xFF] & 0xFF;
        return 0xFF000000 | n2 << 16 | n3 << 8 | n4;
    }

    void kKAmAJA(kaaammk kaaammk2) {
        if (this.kkAmaJa == 0) {
            return;
        }
        int n = kaaammk2.AJAKKam;
        int n2 = n >> 16 & 0xFF;
        int n3 = this.KKAmaJa;
        int n4 = this.kKAmaJa;
        int n5 = ((n2 = (n2 * n3 >> 8) + n4) & 0xFF00) == 0 ? n2 : (n2 > 0 ? 255 : 0);
        n2 = n >> 8 & 0xFF;
        n3 = this.KkamaJa;
        n4 = this.kkamaJa;
        n2 = (n2 * n3 >> 8) + n4;
        int n6 = (n2 & 0xFF00) == 0 ? n2 : (n2 > 0 ? 255 : 0);
        n2 = n & 0xFF;
        n3 = this.KKamaJa;
        n4 = this.kKamaJa;
        n2 = (n2 * n3 >> 8) + n4;
        int n7 = (n2 & 0xFF00) == 0 ? n2 : (n2 > 0 ? 255 : 0);
        n = 0xFF000000 | n5 << 16 | n6 << 8 | n7;
        kaaammk2.AkKAMaj(this.kKAMaJa, n);
    }

    void kkAmAJA(kaaammk kaaammk2) {
        if (this.kkAmaJa == 0 || kaaammk2.AjaKKam == null) {
            return;
        }
        int[] nArray = kaaammk2.AjaKKam;
        int n = nArray.length - 1;
        while (n >= 0) {
            int n2 = nArray[n] >> 16 & 0xFF;
            int n3 = this.KKAmaJa;
            int n4 = this.kKAmaJa;
            int n5 = ((n2 = (n2 * n3 >> 8) + n4) & 0xFF00) == 0 ? n2 : (n2 > 0 ? 255 : 0);
            n2 = nArray[n] >> 8 & 0xFF;
            n3 = this.KkamaJa;
            n4 = this.kkamaJa;
            n2 = (n2 * n3 >> 8) + n4;
            int n6 = (n2 & 0xFF00) == 0 ? n2 : (n2 > 0 ? 255 : 0);
            n2 = nArray[n] & 0xFF;
            n3 = this.KKamaJa;
            n4 = this.kKamaJa;
            n2 = (n2 * n3 >> 8) + n4;
            int n7 = (n2 & 0xFF00) == 0 ? n2 : (n2 > 0 ? 255 : 0);
            nArray[n] = 0xFF000000 | n5 << 16 | n6 << 8 | n7;
            --n;
        }
    }
}

