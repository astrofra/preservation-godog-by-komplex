// 
// Decompiled by Procyon v0.6.0
// 

final class MovieColorTransform
{
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
    private MovieRasterizer kKAMaJa;
    
    MovieColorTransform(final MovieRasterizer kkaMaJa) {
        this.kKAMaJa = kkaMaJa;
    }
    
    private static void KKAmAJA(final int n, final int n2, final byte[] array) {
        int n3 = n2 << 8;
        int n4 = 256;
        int n5 = 0;
        while (n4-- != 0) {
            if ((n3 & 0xFFFF0000) == 0x0) {
                array[n5++] = (byte)(n3 >> 8);
            }
            else if (n3 > 0) {
                array[n5++] = -1;
            }
            else {
                array[n5++] = 0;
            }
            n3 += n;
        }
    }
    
    void kkamAJA() {
        this.KkAMaJa = new byte[256];
        this.kkAMaJa = new byte[256];
        this.KKAMaJa = new byte[256];
        if (this.KkAMaJa == null || this.kkAMaJa == null || this.KKAMaJa == null) {
            final byte[] kkAMaJa = null;
            this.KKAMaJa = kkAMaJa;
            this.kkAMaJa = kkAMaJa;
            this.KkAMaJa = kkAMaJa;
            return;
        }
        KKAmAJA(this.KKAmaJa, this.kKAmaJa, this.KkAMaJa);
        KKAmAJA(this.KkamaJa, this.kkamaJa, this.kkAMaJa);
        KKAmAJA(this.KKamaJa, this.kKamaJa, this.KKAMaJa);
    }
    
    void KKamAJA(final int[] array, final int n) {
        if (this.kkAmaJa == 0 || this.KkAMaJa == null) {
            return;
        }
        for (int i = 0; i < n; ++i) {
            final int n2 = array[i];
            array[i] = (0xFF000000 | (this.KkAMaJa[n2 >> 16 & 0xFF] & 0xFF) << 16 | (this.kkAMaJa[n2 >> 8 & 0xFF] & 0xFF) << 8 | (this.KKAMaJa[n2 & 0xFF] & 0xFF));
        }
    }
    
    int KkamAJA(final int n) {
        if (this.kkAmaJa == 0 || this.KkAMaJa == null) {
            return n;
        }
        return 0xFF000000 | (this.KkAMaJa[n >> 16 & 0xFF] & 0xFF) << 16 | (this.kkAMaJa[n >> 8 & 0xFF] & 0xFF) << 8 | (this.KKAMaJa[n & 0xFF] & 0xFF);
    }
    
    void kKAmAJA(final MovieFillStyle kaaammk) {
        if (this.kkAmaJa == 0) {
            return;
        }
        final int ajakKam = kaaammk.AJAKKam;
        final int n = ((ajakKam >> 16 & 0xFF) * this.KKAmaJa >> 8) + this.kKAmaJa;
        final int n2 = ((n & 0xFF00) == 0x0) ? n : ((n > 0) ? 255 : 0);
        final int n3 = ((ajakKam >> 8 & 0xFF) * this.KkamaJa >> 8) + this.kkamaJa;
        final int n4 = ((n3 & 0xFF00) == 0x0) ? n3 : ((n3 > 0) ? 255 : 0);
        final int n5 = ((ajakKam & 0xFF) * this.KKamaJa >> 8) + this.kKamaJa;
        kaaammk.AkKAMaj(this.kKAMaJa, 0xFF000000 | n2 << 16 | n4 << 8 | (((n5 & 0xFF00) == 0x0) ? n5 : ((n5 > 0) ? 255 : 0)));
    }
    
    void kkAmAJA(final MovieFillStyle kaaammk) {
        if (this.kkAmaJa == 0 || kaaammk.AjaKKam == null) {
            return;
        }
        final int[] ajaKKam = kaaammk.AjaKKam;
        for (int i = ajaKKam.length - 1; i >= 0; --i) {
            final int n = ((ajaKKam[i] >> 16 & 0xFF) * this.KKAmaJa >> 8) + this.kKAmaJa;
            final int n2 = ((n & 0xFF00) == 0x0) ? n : ((n > 0) ? 255 : 0);
            final int n3 = ((ajaKKam[i] >> 8 & 0xFF) * this.KkamaJa >> 8) + this.kkamaJa;
            final int n4 = ((n3 & 0xFF00) == 0x0) ? n3 : ((n3 > 0) ? 255 : 0);
            final int n5 = ((ajaKKam[i] & 0xFF) * this.KKamaJa >> 8) + this.kKamaJa;
            ajaKKam[i] = (0xFF000000 | n2 << 16 | n4 << 8 | (((n5 & 0xFF00) == 0x0) ? n5 : ((n5 > 0) ? 255 : 0)));
        }
    }
}
