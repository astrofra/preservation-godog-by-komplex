/*
 * Decompiled with CFR 0.152.
 */
final class kaaammk {
    kaaammk aJAkKam;
    int AjakKam;
    int ajakKam;
    int AJakKam;
    boolean aJakKam;
    byte AjAKKam;
    long ajAKKam;
    int AJAKKam;
    kmaammk aJAKKam;
    int[] AjaKKam;
    kmaammk ajaKKam;
    Object AJaKKam;
    majjkmk aJaKKam;
    boolean AjAkkam;
    boolean ajAkkam;
    boolean AJAkkam;
    int aJAkkam;
    int Ajakkam;

    kaaammk(kaajkkk kaajkkk2, int n) {
        super();
        this.ajakKam = 0;
        this.AJAKKam = n;
        if (kaajkkk2.MAJAKkA) {
            this.AjAKKam = (byte)kaajkkk2.JaKKamA(this.AJAKKam);
        }
        int n2 = this.AJAKKam;
        this.ajAKKam = ((long)n2 & 0xFF000000L) << 24 | ((long)n2 & 0xFF0000L) << 16 | ((long)n2 & 0xFF00L) << 8 | (long)n2 & 0xFFL;
    }

    kaaammk(kaajkkk kaajkkk2, int n, int n2, int[] nArray, int[] nArray2, kmaammk kmaammk2, kmaammk kmaammk3) {
        super();
        int n3;
        this.ajakKam = n;
        kmaammk kmaammk4 = new kmaammk(kmaammk3);
        if (kaajkkk2.mAJaKkA) {
            kmaammk4.ajakkAM /= 4;
            kmaammk4.AjAKkAM /= 4;
            kmaammk4.AJakkAM /= 4;
            kmaammk4.aJakkAM /= 4;
            kmaammk4.ajAKkAM /= 4;
            kmaammk4.AJAKkAM /= 4;
        }
        kmaammk kmaammk5 = new kmaammk(kmaammk2);
        kmaammk4.ajAKkAM <<= 8;
        kmaammk4.AJAKkAM <<= 8;
        kmaammk5.ajAKkAM <<= 8;
        kmaammk5.AJAKkAM <<= 8;
        this.aJAKKam = kmaammk.aKKaMaj(kmaammk5, kmaammk4).AkkaMaj();
        this.AjaKKam = new int[257];
        int n4 = 0;
        int n5 = nArray2[0];
        int n6 = n3 = nArray[0];
        int n7 = 1;
        int n8 = 0;
        while (n8 <= 256) {
            int n9;
            int n10;
            int n11;
            if (n8 > n5) {
                n4 = n5;
                n6 = n3;
                if (n7 < n2) {
                    n5 = nArray2[n7];
                    n3 = nArray[n7];
                    ++n7;
                } else {
                    n5 = 256;
                }
            }
            if ((n11 = (n10 = (n5 - n8) / 8) + (n9 = (n8 - n4) / 8)) > 0) {
                int n12 = ((n6 >> 16 & 0xFF) * n10 + (n3 >> 16 & 0xFF) * n9) / n11;
                int n13 = ((n6 >> 8 & 0xFF) * n10 + (n3 >> 8 & 0xFF) * n9) / n11;
                int n14 = ((n6 & 0xFF) * n10 + (n3 & 0xFF) * n9) / n11;
                this.AjaKKam[n8] = 0xFF000000 | n12 << 16 | n13 << 8 | n14;
            } else {
                this.AjaKKam[n8] = n6;
            }
            ++n8;
        }
    }

    void AkKAMaj(kaajkkk kaajkkk2, int n) {
        this.ajakKam = 0;
        this.AJAKKam = n;
        if (kaajkkk2.MAJAKkA) {
            this.AjAKKam = (byte)kaajkkk2.JaKKamA(this.AJAKKam);
        }
        int n2 = this.AJAKKam;
        this.ajAKKam = ((long)n2 & 0xFF000000L) << 24 | ((long)n2 & 0xFF0000L) << 16 | ((long)n2 & 0xFF00L) << 8 | (long)n2 & 0xFFL;
    }
}

