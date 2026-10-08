/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

final class maajmmk
extends kmjjmka {
    kaajkkk JaKKaMA;
    kajamma jaKKaMA;
    majjkmk JAKKaMA;
    kmaammk jAKKaMA;
    int JakKaMA;
    int jakKaMA;
    int JAkKaMA;
    kaaammk[] jAkKaMA;
    kaaammk[] JaKkAma;
    int[] jaKkAma;
    int JAKkAma;
    int jAKkAma;
    int JakkAma;
    int jakkAma;
    int JAkkAma;
    Point jAkkAma = new Point(0, 0);
    Point JaKKAma = new Point(0, 0);
    Point jaKKAma = new Point(0, 0);
    Point JAKKAma = new Point(0, 0);
    final int jAKKAma = 1;
    final int JakKAma = 2;
    final int jakKAma = 4;
    final int JAkKAma = 8;
    final int jAkKAma = 16;
    final int JaKkama = 128;
    boolean jaKkama = false;
    int JAKkama;
    kajakkk jAKkama;
    int Jakkama;
    kaaammk jakkama;
    kaaammk JAkkama;
    kaaammk jAkkama;
    boolean JaKKama;
    int jaKKama;
    boolean JAKKama;
    int jAKKama;
    Point JakKama = new Point(0, 0);
    Point jakKama = new Point(0, 0);
    Point JAkKama = new Point(0, 0);
    Point jAkKama = new Point(0, 0);
    Point JaKkAMa = new Point(0, 0);
    Point jaKkAMa = new Point(0, 0);
    Point JAKkAMa = new Point(0, 0);

    maajmmk(kajamma kajamma2, int n, kmaammk kmaammk2, majjkmk majjkmk2) {
        super();
        byte[] byArray;
        this.jAKKaMA = kmaammk2;
        this.JAKKaMA = majjkmk2;
        this.JakKaMA = 0;
        this.JAkKaMA = 0;
        this.jakKaMA = 0;
        this.JAkkAma = 0;
        this.jakkAma = 0;
        this.JakkAma = 0;
        this.jAkkAma.y = 0;
        this.jAkkAma.x = 0;
        this.jAKKaMA.akKaMaj(this.jAkkAma, this.JaKKAma);
        this.jaKKaMA = kajamma2;
        this.JaKKaMA = kajamma2.mAJaKKa;
        this.KAMaJAK = byArray = this.jaKKaMA.KAMaJAK;
        this.kAMaJAK = n;
    }

    private void akKamaJ(kaaammk kaaammk2) {
        if (kaaammk2.AjAkkam) {
            return;
        }
        switch (kaaammk2.ajakKam) {
            case 64: 
            case 65: 
            case 66: {
                if (kaaammk2.AJaKKam == null) {
                    kaaammk2.ajakKam = 0;
                    return;
                }
                kaaammk2.AJAkkam = true;
                kaaammk2.aJAkkam = kaaammk2.ajaKKam.ajakkAM;
                kaaammk2.Ajakkam = kaaammk2.ajaKKam.AJakkAM;
                if (this.JAKKaMA == null) break;
                this.JAKKaMA.kkamAJA();
                kaaammk2.aJaKKam = this.JAKKaMA;
                kaaammk2.AJAkkam = false;
                return;
            }
        }
    }

    boolean akKAmaJ() {
        this.JAkKaMA = this.KAMaJAK[this.kAMaJAK++] & 0xFF;
        if (this.JAkKaMA == 255) {
            this.JAkKaMA = this.KAmAJak();
        }
        if ((this.jAkKaMA = new kaaammk[this.JAkKaMA + 1]) == null) {
            return false;
        }
        int n = 1;
        while (n <= this.JAkKaMA) {
            Object object;
            Object object2;
            int n2;
            kaaammk kaaammk2 = null;
            if (((n2 = this.KAMaJAK[this.kAMaJAK++] & 0xFF) & 0x10) != 0) {
                kmaammk kmaammk2 = this.KaMAJak();
                int n3 = this.KAMaJAK[this.kAMaJAK++] & 0xFF;
                object2 = new int[n3];
                object = new int[n3];
                int n4 = 0;
                while (n4 < n3) {
                    object[n4] = this.KAMaJAK[this.kAMaJAK++] & 0xFF;
                    object2[n4] = this.KAMAJak();
                    ++n4;
                }
                kaaammk2 = new kaaammk(this.JaKKaMA, n2, n3, (int[])object2, (int[])object, kmaammk2, this.jAKKaMA);
                if (this.JAKKaMA != null) {
                    this.JAKKaMA.kkAmAJA(kaaammk2);
                }
            } else if ((n2 & 0x40) != 0) {
                int n5 = this.KAmAJak();
                kmaammk kmaammk3 = this.KaMAJak();
                kaaammk2 = new kaaammk(this.JaKKaMA, -65281);
                object2 = this.jaKKaMA.amaJAkK(n5);
                if (object2 != null && object2.AMaJakk == 1) {
                    if (object2.aMAjAKk != null && object2.aMAjAKk instanceof kmjjkka) {
                        kaaammk2.AJaKKam = (kmjjkka)object2.aMAjAKk;
                        kaaammk2.ajakKam = n2;
                        if (this.JaKKaMA.mAJAKkA != null) {
                            if (this.JaKKaMA.mAJaKkA) {
                                kmaammk kmaammk4 = new kmaammk();
                                kmaammk4.aKKAmAJ(16384, 16384);
                                object = kmaammk.aKKaMaj(this.jAKKaMA, kmaammk4);
                            } else {
                                object = new kmaammk(this.jAKKaMA);
                            }
                            kmaammk3.ajAKkAM <<= 16;
                            kmaammk3.AJAKkAM <<= 16;
                            object.ajAKkAM <<= 16;
                            object.AJAKkAM <<= 16;
                            kmaammk3 = kmaammk.aKKaMaj(kmaammk3, (kmaammk)object);
                            kaaammk2.ajaKKam = kmaammk3.AkkaMaj();
                            this.akKamaJ(kaaammk2);
                        }
                    }
                } else {
                    kaaammk2 = new kaaammk(this.JaKKaMA, -65536);
                }
            } else {
                kaaammk2 = new kaaammk(this.JaKKaMA, this.KAMAJak());
                if (this.JAKKaMA != null) {
                    this.JAKKaMA.kKAmAJA(kaaammk2);
                }
            }
            this.jAkKaMA[n] = kaaammk2;
            kaaammk2.AjakKam = this.JakKaMA + n;
            ++n;
        }
        this.jakKaMA = this.KAMaJAK[this.kAMaJAK++] & 0xFF;
        if (this.jakKaMA == 255) {
            this.jakKaMA = this.KAmAJak();
        }
        this.JaKkAma = new kaaammk[this.jakKaMA + 1];
        this.jaKkAma = new int[this.jakKaMA + 1];
        if (this.JaKkAma == null || this.jaKkAma == null) {
            this.JaKkAma = null;
            this.jaKkAma = null;
            return false;
        }
        int n6 = 1;
        while (n6 <= this.jakKaMA) {
            this.jaKkAma[n6] = this.jAKKaMA.AKKAmAJ(this.KAmAJak());
            kaaammk kaaammk3 = new kaaammk(this.JaKKaMA, this.KAMAJak());
            if (this.JAKKaMA != null) {
                this.JAKKaMA.kKAmAJA(kaaammk3);
            }
            this.JaKkAma[n6] = kaaammk3;
            kaaammk3.AjakKam = this.JakKaMA | n6 + this.JAkKaMA;
            ++n6;
        }
        this.KAmaJAK = 0;
        this.kamaJAK = 0;
        this.JAKkAma = this.kAmaJak(4);
        this.jAKkAma = this.kAmaJak(4);
        return true;
    }

    int akkamaJ(majjkkk majjkkk2) {
        boolean bl;
        boolean bl2 = bl = this.kAmaJak(1) != 0;
        if (!bl) {
            int n = this.kAmaJak(5);
            if (n == 0) {
                return 128;
            }
            if ((n & 1) != 0) {
                int n2 = this.kAmaJak(5);
                this.jAkkAma.x = this.KAmaJak(n2);
                this.jAkkAma.y = this.KAmaJak(n2);
                this.jAKKaMA.akKaMaj(this.jAkkAma, this.JaKKAma);
            }
            if ((n & 2) != 0) {
                this.jakkAma = this.kAmaJak(this.JAKkAma);
            }
            if ((n & 4) != 0) {
                this.JAkkAma = this.kAmaJak(this.JAKkAma);
            }
            if ((n & 8) != 0) {
                this.JakkAma = this.kAmaJak(this.jAKkAma);
            }
            if ((n & 0x10) != 0) {
                this.JakKaMA += this.JAkKaMA + this.jakKaMA;
                this.akKAmaJ();
            }
            return n;
        }
        boolean bl3 = majjkkk2.ajakKAm = this.kAmaJak(1) != 0;
        if (majjkkk2.ajakKAm) {
            boolean bl4;
            int n = this.kAmaJak(4) + 2;
            boolean bl5 = bl4 = this.kAmaJak(1) != 0;
            if (bl4) {
                this.jAkkAma.x += this.KAmaJak(n);
                this.jAkkAma.y += this.KAmaJak(n);
            } else {
                boolean bl6;
                boolean bl7 = bl6 = this.kAmaJak(1) != 0;
                if (bl6) {
                    this.jAkkAma.y += this.KAmaJak(n);
                } else {
                    this.jAkkAma.x += this.KAmaJak(n);
                }
            }
            this.jAKKaMA.akKaMaj(this.jAkkAma, this.JAKKAma);
            majjkkk2.aKkAmaj(this.JaKKAma, this.JAKKAma);
        } else {
            int n = this.kAmaJak(4) + 2;
            this.jAkkAma.x += this.KAmaJak(n);
            this.jAkkAma.y += this.KAmaJak(n);
            this.jAKKaMA.akKaMaj(this.jAkkAma, this.jaKKAma);
            this.jAkkAma.x += this.KAmaJak(n);
            this.jAkkAma.y += this.KAmaJak(n);
            this.jAKKaMA.akKaMaj(this.jAkkAma, this.JAKKAma);
            majjkkk2.aKKaMAj(this.JaKKAma, this.jaKKAma, this.JAKKAma);
        }
        this.JaKKAma.x = this.JAKKAma.x;
        this.JaKKAma.y = this.JAKKAma.y;
        return 0;
    }

    void AkKAmaJ(majjkkk majjkkk2, boolean bl) {
        maajkkk maajkkk2 = new maajkkk();
        if (majjkkk2.AjAkKAm <= majjkkk2.AjakKAm) {
            maajkkk2.aJaKkam = majjkkk2.aJaKkam;
            maajkkk2.AjAkKAm = majjkkk2.AjAkKAm;
            maajkkk2.aJAkKAm = majjkkk2.aJAkKAm;
            maajkkk2.AjakKAm = majjkkk2.AjakKAm;
            maajkkk2.aJAkkAm = 1;
        } else {
            maajkkk2.aJaKkam = majjkkk2.aJAkKAm;
            maajkkk2.AjAkKAm = majjkkk2.AjakKAm;
            maajkkk2.aJAkKAm = majjkkk2.aJaKkam;
            maajkkk2.AjakKAm = majjkkk2.AjAkKAm;
            maajkkk2.aJAkkAm = -1;
        }
        maajkkk2.ajakKAm = majjkkk2.ajakKAm;
        maajkkk2.ajAkKAm = majjkkk2.ajAkKAm;
        maajkkk2.AJAkKAm = majjkkk2.AJAkKAm;
        if (!maajkkk2.ajakKAm) {
            if (maajkkk2.AJAkKAm < maajkkk2.AjAkKAm || maajkkk2.AJAkKAm > maajkkk2.AjakKAm) {
                if (maajkkk2.AJAkKAm < maajkkk2.AjAkKAm && maajkkk2.AjAkKAm - maajkkk2.AJAkKAm < 3) {
                    maajkkk2.AJAkKAm = maajkkk2.AjAkKAm;
                } else if (majjkkk2.AJAkKAm > maajkkk2.AjakKAm && majjkkk2.AJAkKAm - maajkkk2.AjakKAm < 3) {
                    maajkkk2.AJAkKAm = maajkkk2.AjakKAm;
                } else {
                    int n = majjkkk2.AjAkKAm - 2 * majjkkk2.AJAkKAm + majjkkk2.AjakKAm;
                    int n2 = majjkkk2.AjAkKAm - majjkkk2.AJAkKAm;
                    if (++this.JAKkama > 16) {
                        return;
                    }
                    majjkkk majjkkk3 = new majjkkk(majjkkk2);
                    majjkkk majjkkk4 = majjkkk3.AKKaMAj(n != 0 ? (int)(((long)n2 << 16) / (long)n) : Integer.MAX_VALUE);
                    this.AkKAmaJ(majjkkk3, bl);
                    this.AkKAmaJ(majjkkk4, bl);
                    --this.JAKkama;
                    return;
                }
            }
            if (maajkkk2.AjakKAm - maajkkk2.AjAkKAm > 256) {
                if (++this.JAKkama > 16) {
                    return;
                }
                majjkkk majjkkk5 = new majjkkk(majjkkk2);
                majjkkk majjkkk6 = majjkkk5.AKKaMAj(32768);
                this.AkKAmaJ(majjkkk5, bl);
                this.AkKAmaJ(majjkkk6, bl);
                --this.JAKkama;
                return;
            }
        }
        if (maajkkk2.AjAkKAm == maajkkk2.AjakKAm) {
            return;
        }
        if (bl) {
            maajkkk2.AJAkkAm = 2;
            maajkkk2.AJakkAm = this.jAkkama;
        } else {
            maajkkk2.AJAkkAm = this.Jakkama;
            maajkkk2.AJakkAm = this.jakkama;
            maajkkk2.aJakkAm = this.JAkkama;
        }
        maajkkk2.AjakkAm = this.jAKkama.majAKka;
        this.jAKkama.majAKka = maajkkk2;
    }

    void AKkamaJ(boolean bl) {
        this.JAKkama = 0;
        this.JakKaMA = this.jAKkama.mAjaKka << 16;
        if (bl) {
            if (!this.akKAmaJ()) {
                return;
            }
        } else {
            this.KAmaJAK = 0;
            this.kamaJAK = 0;
            this.JAKkAma = this.kAmaJak(4);
            this.jAKkAma = this.kAmaJak(4);
        }
        boolean bl2 = false;
        boolean bl3 = false;
        majjkkk majjkkk2 = new majjkkk();
        this.JAkkama = null;
        this.jakkama = null;
        while (true) {
            int n;
            if ((n = this.akkamaJ(majjkkk2)) != 0) {
                if (n == 128) {
                    if (!bl3) break;
                    this.AKKAmaJ();
                    return;
                }
                if ((n & 6) != 0) {
                    this.jakkama = this.jAkKaMA[this.jakkAma];
                    this.JAkkama = this.jAkKaMA[this.JAkkAma];
                    if (this.jakkama == null && this.JAkkama != null) {
                        this.jakkama = this.JAkkama;
                        this.JAkkama = null;
                    }
                    this.Jakkama = this.JAkkama != null ? 0 : (this.jaKkama ? 2 : 1);
                    boolean bl4 = bl2 = this.jakkama != null;
                }
                if ((n & 9) == 0) continue;
                if (bl3) {
                    this.AKKAmaJ();
                }
                if (this.JakkAma != 0) {
                    this.aKKamaJ(this.jaKkAma[this.JakkAma], this.JaKkAma[this.JakkAma]);
                    bl3 = true;
                    continue;
                }
                bl3 = false;
                continue;
            }
            if (bl3) {
                this.aKKAmaJ(majjkkk2);
            }
            if (!bl2) continue;
            this.AkKAmaJ(majjkkk2, false);
        }
    }

    final void aKkamaJ(Point point, Point point2) {
        if (point.y == point2.y) {
            return;
        }
        maajkkk maajkkk2 = new maajkkk();
        if (point.y > point2.y) {
            maajkkk2.aJAkkAm = -1;
            maajkkk2.aKkAmaj(point2, point);
        } else {
            maajkkk2.aJAkkAm = 1;
            maajkkk2.aKkAmaj(point, point2);
        }
        maajkkk2.AJAkkAm = 2;
        maajkkk2.AJakkAm = this.jAkkama;
        maajkkk2.AjakkAm = this.jAKkama.majAKka;
        this.jAKkama.majAKka = maajkkk2;
    }

    /*
     * Unable to fully structure code
     */
    final void AkkamaJ(Point var1_1, Point var2_2, Point var3_3) {
        block3: {
            block4: {
                var4_4 = kmaammk.aKkAmAJ(var1_1.x - var2_2.x, var1_1.y - var2_2.y);
                if (var4_4 <= 3) break block3;
                var5_5 = Math.atan2(var1_1.y - var3_3.y, var1_1.x - var3_3.x);
                var7_6 = Math.atan2(var2_2.y - var3_3.y, var2_2.x - var3_3.x);
                while (var5_5 < var7_6) {
                    var5_5 += 6.283185307179586;
                }
                var9_7 = var5_5 - var7_6;
                if (!(var9_7 > 0.1) || !(var9_7 <= 3.141592653589793)) break block3;
                var11_8 = this.jaKKama / 2;
                var13_9 = (int)(var11_8 * var9_7) / 3;
                var14_10 = new Point(var1_1.x, var1_1.y);
                var15_11 = new Point(0, 0);
                if (var13_9 <= 1) break block4;
                if (var13_9 > 16) {
                    var13_9 = 16;
                }
                var16_12 = -var9_7 / (double)var13_9;
                var18_13 = var5_5 + var16_12;
                if (true) ** GOTO lbl27
                do {
                    var15_11.x = (int)(var11_8 * Math.cos(var18_13)) + var3_3.x;
                    var15_11.y = (int)(var11_8 * Math.sin(var18_13)) + var3_3.y;
                    this.aKkamaJ(var14_10, var15_11);
                    var14_10.x = var15_11.x;
                    var14_10.y = var15_11.y;
                    var18_13 += var16_12;
lbl27:
                    // 2 sources

                    v0 = --var13_9;
                    --var13_9;
                } while (v0 > 0);
            }
            this.aKkamaJ(var14_10, var2_2);
            return;
        }
        this.aKkamaJ(var1_1, var2_2);
    }

    static final majjkkk AkkAmaJ(majjkkk majjkkk2, Point point, Point point2) {
        int n;
        int n2;
        int n3 = kmaammk.AKkAmAJ(majjkkk2.aJaKkam - majjkkk2.aJAkKAm, majjkkk2.AjAkKAm - majjkkk2.AjakKAm);
        if (n3 > 0) {
            n2 = kmaammk.AKkAmAJ(point.x - point2.x, point.y - point2.y);
            n = n3 != 0 ? (int)(((long)n2 << 16) / (long)n3) : Integer.MAX_VALUE;
        } else {
            n = 65536;
        }
        n2 = majjkkk2.ajAkKAm - majjkkk2.aJaKkam;
        int n4 = majjkkk2.AJAkKAm - majjkkk2.AjAkKAm;
        int n5 = majjkkk2.ajAkKAm - majjkkk2.aJAkKAm;
        int n6 = majjkkk2.AJAkKAm - majjkkk2.AjakKAm;
        majjkkk majjkkk3 = new majjkkk();
        majjkkk3.aJaKkam = point.x;
        majjkkk3.AjAkKAm = point.y;
        majjkkk3.aJAkKAm = point2.x;
        majjkkk3.AjakKAm = point2.y;
        if (kmaammk.aKkAmAJ(n2, n4) > kmaammk.aKkAmAJ(n5, n6)) {
            majjkkk3.ajAkKAm = (int)((long)n * (long)n2 + 32768L >> 16) + point.x;
            majjkkk3.AJAkKAm = (int)((long)n * (long)n4 + 32768L >> 16) + point.y;
        } else {
            majjkkk3.ajAkKAm = (int)((long)n * (long)n5 + 32768L >> 16) + point2.x;
            majjkkk3.AJAkKAm = (int)((long)n * (long)n6 + 32768L >> 16) + point2.y;
        }
        return majjkkk3;
    }

    static final majjkkk AKKamaJ(majjkkk majjkkk2) {
        majjkkk majjkkk3 = new majjkkk();
        majjkkk3.ajakKAm = majjkkk2.ajakKAm;
        majjkkk3.aJaKkam = majjkkk2.aJAkKAm;
        majjkkk3.AjAkKAm = majjkkk2.AjakKAm;
        majjkkk3.ajAkKAm = majjkkk2.ajAkKAm;
        majjkkk3.AJAkKAm = majjkkk2.AJAkKAm;
        majjkkk3.aJAkKAm = majjkkk2.aJaKkam;
        majjkkk3.AjakKAm = majjkkk2.AjAkKAm;
        return majjkkk3;
    }

    final void aKkAmaJ(majjkkk majjkkk2) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        if (!majjkkk2.ajakKAm && this.jAKKama < 5 && (n5 = majjkkk2.AkKaMAj()) > 6 && 2 * n5 > (n4 = kmaammk.aKkAmAJ(majjkkk2.aJaKkam - majjkkk2.aJAkKAm, majjkkk2.AjAkKAm - majjkkk2.AjakKAm))) {
            majjkkk majjkkk3 = new majjkkk(majjkkk2);
            majjkkk majjkkk4 = majjkkk3.AKKaMAj(32768);
            ++this.jAKKama;
            this.aKkAmaJ(majjkkk3);
            this.aKkAmaJ(majjkkk4);
            --this.jAKKama;
            return;
        }
        n5 = this.jaKKama / 2;
        n4 = majjkkk2.AJAkKAm - majjkkk2.AjAkKAm;
        int n6 = majjkkk2.aJaKkam - majjkkk2.ajAkKAm;
        if (n4 == 0 && n6 == 0) {
            n4 = majjkkk2.AjakKAm - majjkkk2.AjAkKAm;
            n6 = majjkkk2.aJaKkam - majjkkk2.aJAkKAm;
        }
        if ((n3 = kmaammk.AKkAmAJ(n4, n6)) > 0) {
            n3 = n3 != 0 ? (int)(((long)n5 << 16) / (long)n3) : Integer.MAX_VALUE;
            n4 = (int)((long)n3 * (long)n4 + 32768L >> 16);
            n6 = (int)((long)n3 * (long)n6 + 32768L >> 16);
        }
        if (majjkkk2.ajakKAm) {
            n2 = n4;
            n = n6;
        } else {
            n2 = majjkkk2.AjakKAm - majjkkk2.AJAkKAm;
            n = majjkkk2.ajAkKAm - majjkkk2.aJAkKAm;
            if (n2 == 0 && n == 0) {
                n2 = majjkkk2.AjakKAm - majjkkk2.AjAkKAm;
                n = majjkkk2.aJaKkam - majjkkk2.aJAkKAm;
            }
            if ((n3 = kmaammk.AKkAmAJ(n2, n)) > 0) {
                n3 = n3 != 0 ? (int)(((long)n5 << 16) / (long)n3) : Integer.MAX_VALUE;
                n2 = (int)((long)n3 * (long)n2 + 32768L >> 16);
                n = (int)((long)n3 * (long)n + 32768L >> 16);
            }
        }
        Point point = new Point(majjkkk2.aJaKkam + n4, majjkkk2.AjAkKAm + n6);
        Point point2 = new Point(majjkkk2.aJAkKAm + n2, majjkkk2.AjakKAm + n);
        Point point3 = new Point(majjkkk2.aJaKkam - n4, majjkkk2.AjAkKAm - n6);
        Point point4 = new Point(majjkkk2.aJAkKAm - n2, majjkkk2.AjakKAm - n);
        if (majjkkk2.ajakKAm) {
            this.aKkamaJ(point2, point);
            this.aKkamaJ(point3, point4);
        } else {
            this.AkKAmaJ(maajmmk.AKKamaJ(maajmmk.AkkAmaJ(majjkkk2, point, point2)), true);
            this.AkKAmaJ(maajmmk.AkkAmaJ(majjkkk2, point3, point4), true);
        }
        if (!this.JAKKama) {
            this.JakKama.x = point.x;
            this.JakKama.y = point.y;
            this.jakKama.x = majjkkk2.aJaKkam;
            this.jakKama.y = majjkkk2.AjAkKAm;
            this.JAkKama.x = point3.x;
            this.JAkKama.y = point3.y;
            this.JAKKama = true;
        } else {
            this.AkkamaJ(point, this.jAkKama, this.JaKkAMa);
            this.AkkamaJ(this.jaKkAMa, point3, this.JaKkAMa);
        }
        this.jAkKama.x = point2.x;
        this.jAkKama.y = point2.y;
        this.JaKkAMa.x = majjkkk2.aJAkKAm;
        this.JaKkAMa.y = majjkkk2.AjakKAm;
        this.jaKkAMa.x = point4.x;
        this.jaKkAMa.y = point4.y;
    }

    final void AKkAmaJ(majjkkk majjkkk2) {
        int n = majjkkk2.AjakKAm - majjkkk2.AjAkKAm;
        int n2 = majjkkk2.aJaKkam - majjkkk2.aJAkKAm;
        Point point = new Point(majjkkk2.aJaKkam, majjkkk2.AjAkKAm);
        Point point2 = new Point(majjkkk2.aJaKkam, majjkkk2.AjAkKAm);
        Point point3 = new Point(majjkkk2.aJAkKAm, majjkkk2.AjakKAm);
        Point point4 = new Point(majjkkk2.aJAkKAm, majjkkk2.AjakKAm);
        boolean bl = (n > 0 ? n : -n) > (n2 > 0 ? n2 : -n2);
        switch (this.jaKKama) {
            case 1: {
                int n3;
                if (bl) {
                    int n4;
                    int n5 = n < 0 ? -1 : (n4 = n > 0 ? 1 : 0);
                    if (n4 > 0) {
                        point.x += n4;
                        point3.x += n4;
                        break;
                    }
                    point2.x -= n4;
                    point4.x -= n4;
                    break;
                }
                int n6 = n2 < 0 ? -1 : (n3 = n2 > 0 ? 1 : 0);
                if (n3 > 0) {
                    point.y += n3;
                    point3.y += n3;
                    break;
                }
                point2.y -= n3;
                point4.y -= n3;
                break;
            }
            case 2: {
                if (bl) {
                    int n7 = n < 0 ? -1 : (n > 0 ? 1 : 0);
                    point.x += n7;
                    point3.x += n7;
                    point2.x -= n7;
                    point4.x -= n7;
                    break;
                }
                int n8 = n2 < 0 ? -1 : (n2 > 0 ? 1 : 0);
                point.y += n8;
                point3.y += n8;
                point2.y -= n8;
                point4.y -= n8;
                break;
            }
            case 3: {
                if (bl) {
                    int n9 = n < 0 ? -1 : (n > 0 ? 1 : 0);
                    point.x += n9;
                    point3.x += n9;
                    point2.x -= (n9 *= 2);
                    point4.x -= n9;
                    break;
                }
                int n10 = n2 < 0 ? -1 : (n2 > 0 ? 1 : 0);
                point.y += n10;
                point3.y += n10;
                point2.y -= (n10 *= 2);
                point4.y -= n10;
            }
        }
        this.aKkamaJ(point3, point);
        this.aKkamaJ(point2, point4);
        if (!this.JAKKama) {
            this.JakKama.x = point.x;
            this.JakKama.y = point.y;
            this.jakKama.x = majjkkk2.aJaKkam;
            this.jakKama.y = majjkkk2.AjAkKAm;
            this.JAkKama.x = point2.x;
            this.JAkKama.y = point2.y;
            this.JAKKama = true;
        } else {
            this.aKkamaJ(point, this.jAkKama);
            this.aKkamaJ(this.jaKkAMa, point2);
        }
        this.jAkKama.x = point3.x;
        this.jAkKama.y = point3.y;
        this.JaKkAMa.x = majjkkk2.aJAkKAm;
        this.JaKkAMa.y = majjkkk2.AjakKAm;
        this.jaKkAMa.x = point4.x;
        this.jaKkAMa.y = point4.y;
    }

    final void akkAmaJ(majjkkk majjkkk2) {
        int n;
        int n2;
        int n3;
        int n4;
        block15: {
            block16: {
                boolean bl;
                block22: {
                    int n5;
                    block23: {
                        block21: {
                            block20: {
                                boolean bl2;
                                block18: {
                                    int n6;
                                    block19: {
                                        block17: {
                                            if (majjkkk2.ajakKAm || majjkkk2.AkKaMAj() <= 2) break block15;
                                            n4 = majjkkk2.AJAkKAm - majjkkk2.AjAkKAm;
                                            n3 = majjkkk2.aJaKkam - majjkkk2.ajAkKAm;
                                            n6 = majjkkk2.AjakKAm - majjkkk2.AJAkKAm;
                                            n5 = majjkkk2.ajAkKAm - majjkkk2.aJAkKAm;
                                            n2 = (n4 > 0 ? n4 : -n4) <= (n3 > 0 ? n3 : -n3) ? 0 : 1;
                                            int n7 = n = (n6 > 0 ? n6 : -n6) <= (n5 > 0 ? n5 : -n5) ? 0 : 1;
                                            if (n2 != n) break block16;
                                            if (n4 != 0) break block17;
                                            bl2 = true;
                                            break block18;
                                        }
                                        if (n4 <= 0) break block19;
                                        if (n6 >= 0) break block20;
                                        bl2 = false;
                                        break block18;
                                    }
                                    if (n6 <= 0) break block20;
                                    bl2 = false;
                                }
                                if (!bl2) break block16;
                            }
                            if (n3 != 0) break block21;
                            bl = true;
                            break block22;
                        }
                        if (n3 <= 0) break block23;
                        if (n5 >= 0) break block15;
                        bl = false;
                        break block22;
                    }
                    if (n5 <= 0) break block15;
                    bl = false;
                }
                if (bl) break block15;
            }
            majjkkk majjkkk3 = new majjkkk(majjkkk2);
            majjkkk majjkkk4 = majjkkk3.AKKaMAj(32768);
            this.akkAmaJ(majjkkk3);
            this.akkAmaJ(majjkkk4);
            return;
        }
        n4 = majjkkk2.AjakKAm - majjkkk2.AjAkKAm;
        n3 = majjkkk2.aJaKkam - majjkkk2.aJAkKAm;
        majjkkk majjkkk5 = new majjkkk(majjkkk2);
        majjkkk majjkkk6 = new majjkkk(majjkkk2);
        n2 = (n4 > 0 ? n4 : -n4) <= (n3 > 0 ? n3 : -n3) ? 0 : 1;
        switch (this.jaKKama) {
            case 1: {
                if (n2 != 0) {
                    int n8 = n4 < 0 ? -1 : (n = n4 > 0 ? 1 : 0);
                    if (n > 0) {
                        majjkkk5.aJaKkam += n;
                        majjkkk5.ajAkKAm += n;
                        majjkkk5.aJAkKAm += n;
                        break;
                    }
                    int n9 = -n;
                    majjkkk6.aJaKkam += n9;
                    majjkkk6.ajAkKAm += n9;
                    majjkkk6.aJAkKAm += n9;
                    break;
                }
                int n10 = n3 < 0 ? -1 : (n = n3 > 0 ? 1 : 0);
                if (n > 0) {
                    majjkkk5.AjAkKAm += n;
                    majjkkk5.AJAkKAm += n;
                    majjkkk5.AjakKAm += n;
                    break;
                }
                int n11 = -n;
                majjkkk6.AjAkKAm += n11;
                majjkkk6.AJAkKAm += n11;
                majjkkk6.AjakKAm += n11;
                break;
            }
            case 2: {
                if (n2 != 0) {
                    n = n4 < 0 ? -1 : (n4 > 0 ? 1 : 0);
                    majjkkk5.aJaKkam += n;
                    majjkkk5.ajAkKAm += n;
                    majjkkk5.aJAkKAm += n;
                    int n12 = -n;
                    majjkkk6.aJaKkam += n12;
                    majjkkk6.ajAkKAm += n12;
                    majjkkk6.aJAkKAm += n12;
                    break;
                }
                n = n3 < 0 ? -1 : (n3 > 0 ? 1 : 0);
                majjkkk5.AjAkKAm += n;
                majjkkk5.AJAkKAm += n;
                majjkkk5.AjakKAm += n;
                int n13 = -n;
                majjkkk6.AjAkKAm += n13;
                majjkkk6.AJAkKAm += n13;
                majjkkk6.AjakKAm += n13;
                break;
            }
            case 3: {
                if (n2 != 0) {
                    n = n4 < 0 ? -1 : (n4 > 0 ? 1 : 0);
                    majjkkk5.aJaKkam += n;
                    majjkkk5.ajAkKAm += n;
                    majjkkk5.aJAkKAm += n;
                    int n14 = -2 * n;
                    majjkkk6.aJaKkam += n14;
                    majjkkk6.ajAkKAm += n14;
                    majjkkk6.aJAkKAm += n14;
                    break;
                }
                n = n3 < 0 ? -1 : (n3 > 0 ? 1 : 0);
                majjkkk5.AjAkKAm += n;
                majjkkk5.AJAkKAm += n;
                majjkkk5.AjakKAm += n;
                int n15 = -2 * n;
                majjkkk6.AjAkKAm += n15;
                majjkkk6.AJAkKAm += n15;
                majjkkk6.AjakKAm += n15;
            }
        }
        this.AkKAmaJ(maajmmk.AKKamaJ(majjkkk5), true);
        this.AkKAmaJ(majjkkk6, true);
        if (!this.JAKKama) {
            this.JakKama.x = majjkkk5.aJaKkam;
            this.JakKama.y = majjkkk5.AjAkKAm;
            this.jakKama.x = majjkkk2.aJaKkam;
            this.jakKama.y = majjkkk2.AjAkKAm;
            this.JAkKama.x = majjkkk6.aJaKkam;
            this.JAkKama.y = majjkkk6.AjAkKAm;
            this.JAKKama = true;
        } else {
            this.aKkamaJ(new Point(majjkkk5.aJaKkam, majjkkk5.AjAkKAm), this.jAkKama);
            this.aKkamaJ(this.jaKkAMa, new Point(majjkkk6.aJaKkam, majjkkk6.AjAkKAm));
        }
        this.jAkKama.x = majjkkk5.aJAkKAm;
        this.jAkKama.y = majjkkk5.AjakKAm;
        this.JaKkAMa.x = majjkkk2.aJAkKAm;
        this.JaKkAMa.y = majjkkk2.AjakKAm;
        this.jaKkAMa.x = majjkkk6.aJAkKAm;
        this.jaKkAMa.y = majjkkk6.AjakKAm;
    }

    final void aKKamaJ(int n, kaaammk kaaammk2) {
        this.JAKKama = false;
        this.jaKKama = Math.max(this.JaKKaMA.mAJaKkA ? 4 : 1, n);
        this.JaKKama = this.jaKKama > 3;
        this.jAkkama = kaaammk2;
        this.JAKkAMa.y = Integer.MIN_VALUE;
        this.JAKkAMa.x = Integer.MIN_VALUE;
    }

    final void aKKAmaJ(majjkkk majjkkk2) {
        this.JAKkAMa.x = majjkkk2.aJAkKAm;
        this.JAKkAMa.y = majjkkk2.AjakKAm;
        if (majjkkk2.aJaKkam == majjkkk2.aJAkKAm && majjkkk2.AjAkKAm == majjkkk2.AjakKAm && majjkkk2.aJaKkam == majjkkk2.ajAkKAm && majjkkk2.AjAkKAm == majjkkk2.AJAkKAm) {
            return;
        }
        if (!this.JaKKama) {
            if (majjkkk2.ajakKAm) {
                this.AKkAmaJ(majjkkk2);
                return;
            }
            this.akkAmaJ(majjkkk2);
            return;
        }
        if (this.JaKKaMA.mAJaKkA && majjkkk2.ajakKAm) {
            if (this.jaKKama == 4 || this.jaKKama == 12) {
                int n;
                majjkkk majjkkk3 = new majjkkk(majjkkk2);
                if (majjkkk3.aJaKkam == majjkkk3.aJAkKAm && ((n = majjkkk3.AjAkKAm - majjkkk3.AjakKAm) > 0 ? n : -n) > 12) {
                    majjkkk3.aJaKkam = majjkkk3.aJAkKAm = (majjkkk3.aJaKkam & 0xFFFFFFFC) + 2;
                } else if (majjkkk3.AjAkKAm == majjkkk3.AjakKAm && ((n = majjkkk3.aJaKkam - majjkkk3.aJAkKAm) > 0 ? n : -n) > 12) {
                    majjkkk3.AjAkKAm = majjkkk3.AjakKAm = (majjkkk3.AjAkKAm & 0xFFFFFFFC) + 2;
                }
                this.aKkAmaJ(majjkkk3);
                return;
            }
            if (this.jaKKama == 8) {
                int n;
                majjkkk majjkkk4 = new majjkkk(majjkkk2);
                if (majjkkk4.aJaKkam == majjkkk4.aJAkKAm && ((n = majjkkk4.AjAkKAm - majjkkk4.AjakKAm) > 0 ? n : -n) > 12) {
                    majjkkk4.aJaKkam = majjkkk4.aJAkKAm = majjkkk4.aJaKkam + 2 & 0xFFFFFFFC;
                } else if (majjkkk4.AjAkKAm == majjkkk4.AjakKAm && ((n = majjkkk4.aJaKkam - majjkkk4.aJAkKAm) > 0 ? n : -n) > 12) {
                    majjkkk4.AjAkKAm = majjkkk4.AjakKAm = majjkkk4.AjAkKAm + 2 & 0xFFFFFFFC;
                }
                this.aKkAmaJ(majjkkk4);
                return;
            }
            this.aKkAmaJ(majjkkk2);
            return;
        }
        this.aKkAmaJ(majjkkk2);
    }

    final void AKKAmaJ() {
        if (this.JAKKama) {
            if (this.jakKama.x == this.JaKkAMa.x && this.jakKama.y == this.JaKkAMa.y) {
                if (!this.JaKKama) {
                    this.aKkamaJ(this.JakKama, this.jAkKama);
                    this.aKkamaJ(this.jaKkAMa, this.JAkKama);
                    return;
                }
                this.AkkamaJ(this.JakKama, this.jAkKama, this.JaKkAMa);
                this.AkkamaJ(this.jaKkAMa, this.JAkKama, this.JaKkAMa);
                return;
            }
            if (!this.JaKKama) {
                this.aKkamaJ(this.JakKama, this.JAkKama);
                this.aKkamaJ(this.jaKkAMa, this.jAkKama);
                return;
            }
            this.AkkamaJ(this.JakKama, this.JAkKama, this.jakKama);
            this.AkkamaJ(this.jaKkAMa, this.jAkKama, this.JaKkAMa);
            return;
        }
        if (this.JAKkAMa.x != Integer.MIN_VALUE) {
            int n = this.jaKKama / 2;
            Point point = new Point(this.JAKkAMa.x, this.JAKkAMa.y);
            Point point2 = new Point(this.JAKkAMa.x, this.JAKkAMa.y);
            point.y -= n;
            point2.y += this.jaKKama - n;
            if (!this.JaKKama) {
                point.x -= n;
                point2.x -= n;
                this.aKkamaJ(point, point2);
                point.x += this.jaKKama - n;
                point2.x += this.jaKKama - n;
                this.aKkamaJ(point2, point);
                return;
            }
            this.AkkamaJ(point, point2, this.JAKkAMa);
            this.AkkamaJ(point2, point, this.JAKkAMa);
        }
    }
}

