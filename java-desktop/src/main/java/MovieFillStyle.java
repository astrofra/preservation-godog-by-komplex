// 
// Decompiled by Procyon v0.6.0
// 

final class MovieFillStyle
{
    MovieFillStyle aJAkKam;
    int AjakKam;
    int ajakKam;
    int AJakKam;
    boolean aJakKam;
    byte AjAKKam;
    long ajAKKam;
    int AJAKKam;
    MovieTransform aJAKKam;
    int[] AjaKKam;
    MovieTransform ajaKKam;
    Object AJaKKam;
    MovieColorTransform aJaKKam;
    boolean AjAkkam;
    boolean ajAkkam;
    boolean AJAkkam;
    int aJAkkam;
    int Ajakkam;
    
    MovieFillStyle(final MovieRasterizer kaajkkk, final int ajakKam) {
        this.ajakKam = 0;
        this.AJAKKam = ajakKam;
        if (kaajkkk.MAJAKkA) {
            this.AjAKKam = (byte)kaajkkk.JaKKamA(this.AJAKKam);
        }
        final int ajakKam2 = this.AJAKKam;
        this.ajAKKam = (((long)ajakKam2 & 0xFF000000L) << 24 | ((long)ajakKam2 & 0xFF0000L) << 16 | ((long)ajakKam2 & 0xFF00L) << 8 | ((long)ajakKam2 & 0xFFL));
    }
    
    MovieFillStyle(final MovieRasterizer kaajkkk, final int ajakKam, final int n, final int[] array, final int[] array2, final MovieTransform kmaammk, final MovieTransform kmaammk2) {
        this.ajakKam = ajakKam;
        final MovieTransform kmaammk3 = new MovieTransform(kmaammk2);
        if (kaajkkk.mAJaKkA) {
            final MovieTransform kmaammk4 = kmaammk3;
            kmaammk4.ajakkAM /= 4;
            final MovieTransform kmaammk5 = kmaammk3;
            kmaammk5.AjAKkAM /= 4;
            final MovieTransform kmaammk6 = kmaammk3;
            kmaammk6.AJakkAM /= 4;
            final MovieTransform kmaammk7 = kmaammk3;
            kmaammk7.aJakkAM /= 4;
            final MovieTransform kmaammk8 = kmaammk3;
            kmaammk8.ajAKkAM /= 4;
            final MovieTransform kmaammk9 = kmaammk3;
            kmaammk9.AJAKkAM /= 4;
        }
        final MovieTransform kmaammk10 = new MovieTransform(kmaammk);
        final MovieTransform kmaammk11 = kmaammk3;
        kmaammk11.ajAKkAM <<= 8;
        final MovieTransform kmaammk12 = kmaammk3;
        kmaammk12.AJAKkAM <<= 8;
        final MovieTransform kmaammk13 = kmaammk10;
        kmaammk13.ajAKkAM <<= 8;
        final MovieTransform kmaammk14 = kmaammk10;
        kmaammk14.AJAKkAM <<= 8;
        this.aJAKKam = kmaammk.aKKaMaj(kmaammk10, kmaammk3).AkkaMaj();
        this.AjaKKam = new int[257];
        int n2 = 0;
        int n3 = array2[0];
        int n5;
        int n4 = n5 = array[0];
        int n6 = 1;
        for (int i = 0; i <= 256; ++i) {
            if (i > n3) {
                n2 = n3;
                n5 = n4;
                if (n6 < n) {
                    n3 = array2[n6];
                    n4 = array[n6];
                    ++n6;
                }
                else {
                    n3 = 256;
                }
            }
            final int n7 = (n3 - i) / 8;
            final int n8 = (i - n2) / 8;
            final int n9 = n7 + n8;
            if (n9 > 0) {
                this.AjaKKam[i] = (0xFF000000 | ((n5 >> 16 & 0xFF) * n7 + (n4 >> 16 & 0xFF) * n8) / n9 << 16 | ((n5 >> 8 & 0xFF) * n7 + (n4 >> 8 & 0xFF) * n8) / n9 << 8 | ((n5 & 0xFF) * n7 + (n4 & 0xFF) * n8) / n9);
            }
            else {
                this.AjaKKam[i] = n5;
            }
        }
    }
    
    void AkKAMaj(final MovieRasterizer kaajkkk, final int ajakKam) {
        this.ajakKam = 0;
        this.AJAKKam = ajakKam;
        if (kaajkkk.MAJAKkA) {
            this.AjAKKam = (byte)kaajkkk.JaKKamA(this.AJAKKam);
        }
        final int ajakKam2 = this.AJAKKam;
        this.ajAKKam = (((long)ajakKam2 & 0xFF000000L) << 24 | ((long)ajakKam2 & 0xFF0000L) << 16 | ((long)ajakKam2 & 0xFF00L) << 8 | ((long)ajakKam2 & 0xFFL));
    }
}
