/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

final class maaammk {
    maaammk AjaKkAM;
    int ajaKkAM;
    int AJaKkAM;
    kaaammk[] aJaKkAM = new kaaammk[4];
    int AjAkKam;
    boolean ajAkKam;
    boolean AJAkKam = true;

    final void aKkaMaj(kaaammk kaaammk2) {
        this.aJaKkAM[this.AjAkKam] = kaaammk2;
        ++this.AjAkKam;
        if (kaaammk2 != this.aJaKkAM[0]) {
            this.AJAkKam = false;
        }
        if (kaaammk2.ajakKam != 0) {
            this.ajAkKam = true;
        }
    }

    final long akkaMaj(int n, int n2) {
        if (this.ajAkKam) {
            long l = 0L;
            kaaammk kaaammk2 = null;
            long l2 = 0L;
            int n3 = 0;
            while (n3 < this.AjAkKam) {
                kaaammk kaaammk3 = this.aJaKkAM[n3];
                if (kaaammk3.ajakKam != 0) {
                    if (kaaammk2 != kaaammk3) {
                        switch (kaaammk3.ajakKam) {
                            case 64: 
                            case 65: 
                            case 66: {
                                int n4;
                                Object object = (kmjjkka)kaaammk3.AJaKKam;
                                Point point = new Point(n << 16, n2 << 16);
                                kaaammk3.ajaKKam.akkAmAJ(point);
                                if (kaaammk3.ajakKam == 65) {
                                    if (kaaammk3.ajAkkam) {
                                        n4 = ((kmjjkka)object).AMAJaKK(point.x - 32768, point.y - 32768);
                                        l2 = ((long)n4 & 0xFF000000L) << 24 | ((long)n4 & 0xFF0000L) << 16 | ((long)n4 & 0xFF00L) << 8 | (long)n4 & 0xFFL;
                                    } else {
                                        n4 = ((kmjjkka)object).aMAJaKK(point.x >> 16, point.y >> 16);
                                        l2 = ((long)n4 & 0xFF000000L) << 24 | ((long)n4 & 0xFF0000L) << 16 | ((long)n4 & 0xFF00L) << 8 | (long)n4 & 0xFFL;
                                    }
                                } else {
                                    n4 = ((kmjjkka)object).aMAJaKK(kmjjkka.amaJaKK(point.x >> 16, ((kmjjkka)object).AMAjaKK), kmjjkka.amaJaKK(point.y >> 16, ((kmjjkka)object).aMAjaKK));
                                    l2 = ((long)n4 & 0xFF000000L) << 24 | ((long)n4 & 0xFF0000L) << 16 | ((long)n4 & 0xFF00L) << 8 | (long)n4 & 0xFFL;
                                }
                                kaaammk2 = kaaammk3;
                                break;
                            }
                            case 16: {
                                Object object = new Point(n << 8, n2 << 8);
                                kaaammk3.aJAKKam.akkAmAJ((Point)object);
                                int n5 = (((Point)object).x >> 15) + 128;
                                if (n5 > 256) {
                                    n5 = 256;
                                } else if (n5 < 0) {
                                    n5 = 0;
                                }
                                int n4 = kaaammk3.AjaKKam[n5];
                                l2 = ((long)n4 & 0xFF000000L) << 24 | ((long)n4 & 0xFF0000L) << 16 | ((long)n4 & 0xFF00L) << 8 | (long)n4 & 0xFFL;
                                kaaammk2 = kaaammk3;
                                break;
                            }
                            case 18: {
                                Object object = new Point(n << 8, n2 << 8);
                                kaaammk3.aJAKKam.akkAmAJ((Point)object);
                                int n6 = kmaammk.AKkAmAJ(((Point)object).x, ((Point)object).y) >> 14;
                                if (n6 > 256) {
                                    n6 = 256;
                                }
                                int n4 = kaaammk3.AjaKKam[n6];
                                l2 = ((long)n4 & 0xFF000000L) << 24 | ((long)n4 & 0xFF0000L) << 16 | ((long)n4 & 0xFF00L) << 8 | (long)n4 & 0xFFL;
                                kaaammk2 = kaaammk3;
                            }
                        }
                    }
                    l += l2;
                } else {
                    l += kaaammk3.ajAKKam;
                }
                ++n3;
            }
            return l;
        }
        if (this.AJAkKam) {
            if (this.AjAkKam == 4) {
                return 4L * this.aJaKkAM[0].ajAKKam;
            }
            return (long)this.AjAkKam * this.aJaKkAM[0].ajAKKam;
        }
        long l = 0L;
        int n7 = 0;
        while (n7 < this.AjAkKam) {
            l += this.aJaKkAM[n7].ajAKKam;
            ++n7;
        }
        return l;
    }

    final maaammk AKkaMaj(kaajkkk kaajkkk2, int n) {
        maaammk maaammk2 = kaajkkk2.MaJaKKA;
        if (maaammk2 != null) {
            kaajkkk2.MaJaKKA = maaammk2.AjaKkAM;
        } else {
            maaammk2 = new maaammk();
        }
        maaammk2.ajaKkAM = n;
        maaammk2.AJaKkAM = this.AJaKkAM;
        this.AJaKkAM = n;
        maaammk2.AjaKkAM = this.AjaKkAM;
        this.AjaKkAM = maaammk2;
        maaammk2.aJaKkAM[0] = this.aJaKkAM[0];
        maaammk2.aJaKkAM[1] = this.aJaKkAM[1];
        maaammk2.aJaKkAM[2] = this.aJaKkAM[2];
        maaammk2.aJaKkAM[3] = this.aJaKkAM[3];
        maaammk2.AjAkKam = this.AjAkKam;
        maaammk2.ajAkKam = this.ajAkKam;
        maaammk2.AJAkKam = this.AJAkKam;
        return maaammk2;
    }

    maaammk() {
        super();
    }
}

