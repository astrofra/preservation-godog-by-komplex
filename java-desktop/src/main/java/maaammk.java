import java.awt.Point;

// 
// Decompiled by Procyon v0.6.0
// 

final class maaammk
{
    maaammk AjaKkAM;
    int ajaKkAM;
    int AJaKkAM;
    kaaammk[] aJaKkAM;
    int AjAkKam;
    boolean ajAkKam;
    boolean AJAkKam;
    
    final void aKkaMaj(final kaaammk kaaammk) {
        this.aJaKkAM[this.AjAkKam] = kaaammk;
        ++this.AjAkKam;
        if (kaaammk != this.aJaKkAM[0]) {
            this.AJAkKam = false;
        }
        if (kaaammk.ajakKam != 0) {
            this.ajAkKam = true;
        }
    }
    
    final long akkaMaj(final int n, final int n2) {
        if (this.ajAkKam) {
            long n3 = 0L;
            kaaammk kaaammk = null;
            long n4 = 0L;
            for (int i = 0; i < this.AjAkKam; ++i) {
                final kaaammk kaaammk2 = this.aJaKkAM[i];
                if (kaaammk2.ajakKam != 0) {
                    if (kaaammk != kaaammk2) {
                        switch (kaaammk2.ajakKam) {
                            case 64:
                            case 65:
                            case 66: {
                                final kmjjkka kmjjkka = (kmjjkka)kaaammk2.AJaKKam;
                                final Point point = new Point(n << 16, n2 << 16);
                                kaaammk2.ajaKKam.akkAmAJ(point);
                                if (kaaammk2.ajakKam == 65) {
                                    if (kaaammk2.ajAkkam) {
                                        final int amaJaKK = kmjjkka.AMAJaKK(point.x - 32768, point.y - 32768);
                                        n4 = (((long)amaJaKK & 0xFF000000L) << 24 | ((long)amaJaKK & 0xFF0000L) << 16 | ((long)amaJaKK & 0xFF00L) << 8 | ((long)amaJaKK & 0xFFL));
                                    }
                                    else {
                                        final int amaJaKK2 = kmjjkka.aMAJaKK(point.x >> 16, point.y >> 16);
                                        n4 = (((long)amaJaKK2 & 0xFF000000L) << 24 | ((long)amaJaKK2 & 0xFF0000L) << 16 | ((long)amaJaKK2 & 0xFF00L) << 8 | ((long)amaJaKK2 & 0xFFL));
                                    }
                                }
                                else {
                                    final int amaJaKK3 = kmjjkka.aMAJaKK(kmjjkka.amaJaKK(point.x >> 16, kmjjkka.AMAjaKK), kmjjkka.amaJaKK(point.y >> 16, kmjjkka.aMAjaKK));
                                    n4 = (((long)amaJaKK3 & 0xFF000000L) << 24 | ((long)amaJaKK3 & 0xFF0000L) << 16 | ((long)amaJaKK3 & 0xFF00L) << 8 | ((long)amaJaKK3 & 0xFFL));
                                }
                                kaaammk = kaaammk2;
                                break;
                            }
                            case 16: {
                                final Point point2 = new Point(n << 8, n2 << 8);
                                kaaammk2.aJAKKam.akkAmAJ(point2);
                                int n5 = (point2.x >> 15) + 128;
                                if (n5 > 256) {
                                    n5 = 256;
                                }
                                else if (n5 < 0) {
                                    n5 = 0;
                                }
                                final int n6 = kaaammk2.AjaKKam[n5];
                                n4 = (((long)n6 & 0xFF000000L) << 24 | ((long)n6 & 0xFF0000L) << 16 | ((long)n6 & 0xFF00L) << 8 | ((long)n6 & 0xFFL));
                                kaaammk = kaaammk2;
                                break;
                            }
                            case 18: {
                                final Point point3 = new Point(n << 8, n2 << 8);
                                kaaammk2.aJAKKam.akkAmAJ(point3);
                                int n7 = kmaammk.AKkAmAJ(point3.x, point3.y) >> 14;
                                if (n7 > 256) {
                                    n7 = 256;
                                }
                                final int n8 = kaaammk2.AjaKKam[n7];
                                n4 = (((long)n8 & 0xFF000000L) << 24 | ((long)n8 & 0xFF0000L) << 16 | ((long)n8 & 0xFF00L) << 8 | ((long)n8 & 0xFFL));
                                kaaammk = kaaammk2;
                                break;
                            }
                        }
                    }
                    n3 += n4;
                }
                else {
                    n3 += kaaammk2.ajAKKam;
                }
            }
            return n3;
        }
        if (!this.AJAkKam) {
            long n9 = 0L;
            for (int j = 0; j < this.AjAkKam; ++j) {
                n9 += this.aJaKkAM[j].ajAKKam;
            }
            return n9;
        }
        if (this.AjAkKam == 4) {
            return 4L * this.aJaKkAM[0].ajAKKam;
        }
        return this.AjAkKam * this.aJaKkAM[0].ajAKKam;
    }
    
    final maaammk AKkaMaj(final kaajkkk kaajkkk, final int n) {
        maaammk maJaKKA = kaajkkk.MaJaKKA;
        if (maJaKKA != null) {
            kaajkkk.MaJaKKA = maJaKKA.AjaKkAM;
        }
        else {
            maJaKKA = new maaammk();
        }
        maJaKKA.ajaKkAM = n;
        maJaKKA.AJaKkAM = this.AJaKkAM;
        this.AJaKkAM = n;
        maJaKKA.AjaKkAM = this.AjaKkAM;
        this.AjaKkAM = maJaKKA;
        maJaKKA.aJaKkAM[0] = this.aJaKkAM[0];
        maJaKKA.aJaKkAM[1] = this.aJaKkAM[1];
        maJaKKA.aJaKkAM[2] = this.aJaKkAM[2];
        maJaKKA.aJaKkAM[3] = this.aJaKkAM[3];
        maJaKKA.AjAkKam = this.AjAkKam;
        maJaKKA.ajAkKam = this.ajAkKam;
        maJaKKA.AJAkKam = this.AJAkKam;
        return maJaKKA;
    }
    
    maaammk() {
        this.aJaKkAM = new kaaammk[4];
        this.AJAkKam = true;
    }
}
