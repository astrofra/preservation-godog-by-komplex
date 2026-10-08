/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;
import java.awt.image.ColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.awt.image.IndexColorModel;

final class kaajkkk
implements ImageProducer {
    private kmaammk MaJaKkA = new kmaammk();
    private int maJaKkA = -1;
    private int MAJaKkA;
    boolean mAJaKkA = false;
    private kaajmmk MajaKkA = new kaajmmk();
    private kajakkk majaKkA;
    private mmaakka MAjaKkA;
    kajakkk mAjaKkA;
    int MaJAKkA;
    private int maJAKkA;
    boolean MAJAKkA;
    ColorModel mAJAKkA;
    int MajAKkA;
    int majAKkA;
    private kaajmmk MAjAKkA;
    private kaajmmk mAjAKkA;
    private int MaJakkA;
    private int maJakkA;
    byte[] MAJakkA;
    int[] mAJakkA;
    private int MajakkA;
    private kaaammk majakkA;
    private kaaammk MAjakkA;
    private maajkkk[] mAjakkA;
    private int MaJAkkA;
    private int maJAkkA;
    private maajkkk[] MAJAkkA;
    private int mAJAkkA;
    private int MajAkkA;
    int majAkkA;
    private maaammk MAjAkkA;
    private maaammk mAjAkkA;
    maaammk MaJaKKA;
    private long maJaKKA;
    private int MAJaKKA;
    private int mAJaKKA;
    private int MajaKKA;
    private int majaKKA;
    private int MAjaKKA;
    private int mAjaKKA;
    private int MaJAKKA;
    private int[] maJAKKA;
    private byte[] MAJAKKA;
    private int mAJAKKA;
    private int[] MajAKKA;
    boolean majAKKA = false;
    ImageConsumer MAjAKKA;
    boolean mAjAKKA;

    kaajkkk(mmaakka mmaakka2) {
        super();
        this.MAjaKkA = mmaakka2;
    }

    void JAKKamA() {
        kajakkk kajakkk2 = this.majaKkA;
        while (kajakkk2 != null) {
            this.MajaKkA.akKaMAJ(kajakkk2.MAJAKka);
            kajakkk2 = kajakkk2.majaKka;
        }
        this.majaKkA = null;
        this.mAjaKkA = null;
        if (this.MAJaKkA <= 1) {
            this.maJaKkA = -1;
            this.MAJaKkA = 0;
        }
    }

    synchronized void JAkkAMA(kaajmmk kaajmmk2, boolean bl, int n, boolean bl2) {
        int n2;
        int n3;
        kaajmmk kaajmmk3 = new kaajmmk(0, 0, this.MajAKkA, this.majAKkA);
        if (bl) {
            kaajmmk3.jakkAMa *= 4;
            kaajmmk3.JAkkAMa *= 4;
        }
        kmaammk kmaammk2 = new kmaammk();
        int n4 = Math.max(kaajmmk3.jakkAMa - kaajmmk3.jAKkAMa, 16);
        int n5 = Math.max(kaajmmk2.jakkAMa - kaajmmk2.jAKkAMa, 16);
        kmaammk2.ajakkAM = n5 != 0 ? (int)(((long)n4 << 16) / (long)n5) : Integer.MAX_VALUE;
        n4 = Math.max(kaajmmk3.JAkkAMa - kaajmmk3.JakkAMa, 16);
        n5 = Math.max(kaajmmk2.JAkkAMa - kaajmmk2.JakkAMa, 16);
        kmaammk2.AjAKkAM = n5 != 0 ? (int)(((long)n4 << 16) / (long)n5) : Integer.MAX_VALUE;
        switch (n & 0xF) {
            default: {
                kmaammk2.ajakkAM = kmaammk2.AjAKkAM = Math.min(kmaammk2.ajakkAM, kmaammk2.AjAKkAM);
                break;
            }
            case 1: {
                kmaammk2.ajakkAM = kmaammk2.AjAKkAM = Math.max(kmaammk2.ajakkAM, kmaammk2.AjAKkAM);
            }
        }
        if ((n & 0x10) != 0) {
            n4 = kaajmmk2.jAKkAMa;
            n3 = kaajmmk3.jAKkAMa;
        } else if ((n & 0x20) != 0) {
            n4 = kaajmmk2.jakkAMa;
            n3 = kaajmmk3.jakkAMa;
        } else {
            n4 = (kaajmmk2.jAKkAMa + kaajmmk2.jakkAMa) / 2;
            n3 = (kaajmmk3.jAKkAMa + kaajmmk3.jakkAMa) / 2;
        }
        if ((n & 0x40) != 0) {
            n5 = kaajmmk2.JakkAMa;
            n2 = kaajmmk3.JakkAMa;
        } else if ((n & 0x80) != 0) {
            n5 = kaajmmk2.JAkkAMa;
            n2 = kaajmmk3.JAkkAMa;
        } else {
            n5 = (kaajmmk2.JakkAMa + kaajmmk2.JAkkAMa) / 2;
            n2 = (kaajmmk3.JakkAMa + kaajmmk3.JAkkAMa) / 2;
        }
        int n6 = kmaammk2.ajakkAM;
        kmaammk2.ajAKkAM = n3 - (int)((long)n4 * (long)n6 + 32768L >> 16);
        n6 = kmaammk2.ajakkAM;
        kmaammk2.AJAKkAM = n2 - (int)((long)n5 * (long)n6 + 32768L >> 16);
        if (kmaammk2.ajakkAM != this.MaJaKkA.ajakkAM || kmaammk2.AJakkAM != this.MaJaKkA.AJakkAM || kmaammk2.aJakkAM != this.MaJaKkA.aJakkAM || kmaammk2.AjAKkAM != this.MaJaKkA.AjAKkAM || kmaammk2.ajAKkAM != this.MaJaKkA.ajAKkAM || kmaammk2.AJAKkAM != this.MaJaKkA.AJAKkAM || this.mAJaKkA != bl) {
            this.mAJaKkA = bl;
            this.MaJaKkA = kmaammk2;
            this.jakkamA();
        }
        if (bl2) {
            kaajmmk kaajmmk4 = this.MajaKkA;
            if (kaajmmk4.jAKkAMa != Integer.MIN_VALUE && !false) {
                this.JAKKAMA(true);
                return;
            }
        }
    }

    synchronized void JAkkamA() {
        this.MajaKkA.JakkAMa = 0;
        this.MajaKkA.jAKkAMa = 0;
        this.MajaKkA.jakkAMa = this.MajAKkA;
        this.MajaKkA.JAkkAMa = this.majAKkA;
        if (this.mAJaKkA) {
            this.MajaKkA.jakkAMa *= 4;
            this.MajaKkA.JAkkAMa *= 4;
        }
    }

    private void jakkamA() {
        this.JAkkamA();
        kajakkk kajakkk2 = this.majaKkA;
        while (kajakkk2 != null) {
            kajakkk2.majAKka = null;
            kajakkk2.maJAKka = kmaammk.aKKaMaj(kajakkk2.MaJAKka, this.MaJaKkA);
            kajakkk2.MAJAKka = kajakkk2.maJAKka.AKKaMaj(kajakkk2.MAjaKka.AmAjAKk);
            kajakkk2 = kajakkk2.majaKka;
        }
    }

    synchronized void JakkamA(int n, int n2) {
        if (n2 >= this.MAJaKkA) {
            if (this.maJaKkA == n && n2 == this.MAJaKkA) {
                return;
            }
            this.JAkkamA();
            this.maJaKkA = n;
            this.MAJaKkA = n2;
        }
    }

    synchronized void jAkkAMA(mmjakka mmjakka2, int n, kmaammk kmaammk2, majjkmk majjkmk2) {
        kajakkk kajakkk2 = new kajakkk();
        kajakkk2.majaKka = this.majaKkA;
        this.majaKkA = kajakkk2;
        kajakkk2.MajaKka = this;
        kajakkk2.MAjaKka = mmjakka2;
        kajakkk2.mAjaKka = n;
        kajakkk2.MaJAKka = kmaammk2;
        kajakkk2.MAjAKka = majjkmk2;
        if (mmjakka2.AMaJakk == 2) {
            int n2 = 1;
            if (n == this.maJAKkA) {
                this.mAjaKkA = kajakkk2;
                n2 = this.MaJAKkA;
            }
            this.JaKkAMA(kajakkk2, n2);
            kajakkk2.MAJAKka = new kaajmmk();
            return;
        }
        kajakkk2.maJAKka = kmaammk.aKKaMaj(kajakkk2.MaJAKka, this.MaJaKkA);
        kajakkk2.MAJAKka = kajakkk2.maJAKka.AKKaMaj(mmjakka2.AmAjAKk);
        this.MajaKkA.akKaMAJ(kajakkk2.MAJAKka);
    }

    synchronized void jAKkAMA(int n) {
        kajakkk kajakkk2 = null;
        kajakkk kajakkk3 = this.majaKkA;
        while (kajakkk3 != null) {
            if (kajakkk3.mAjaKka == n) {
                if (kajakkk3.MajAKka != 0) {
                    this.JaKkAMA(kajakkk3, 0);
                    this.jAKkAMA(n);
                    if (this.mAjaKkA == kajakkk3) {
                        this.mAjaKkA = null;
                        return;
                    }
                } else {
                    if (kajakkk3.mAJAKka) {
                        this.MajaKkA.akKaMAJ(kajakkk3.MAJAKka);
                    }
                    if (kajakkk2 != null) {
                        kajakkk2.majaKka = kajakkk3.majaKka;
                        return;
                    }
                    this.majaKkA = kajakkk3.majaKka;
                }
                return;
            }
            kajakkk2 = kajakkk3;
            kajakkk3 = kajakkk3.majaKka;
        }
    }

    private void JaKkAMA(kajakkk kajakkk2, int n) {
        int n2 = kajakkk2.MajAKka;
        if (n2 == n) {
            return;
        }
        kajamma kajamma2 = kajakkk2.MAjaKka.AmaJakk;
        kmjjmka kmjjmka2 = new kmjjmka();
        int n3 = kajakkk2.MAjaKka.AMAjAKk;
        majjkmk majjkmk2 = null;
        kmjjmka kmjjmka3 = null;
        if (n3 > 0) {
            kmjjmka3 = new kmjjmka();
        }
        int n4 = 0;
        while (n4 < 2) {
            int n5;
            byte[] byArray = kajamma2.KAMaJAK;
            int n6 = kajakkk2.MAjaKka.aMaJakk;
            kmjjmka2.KAMaJAK = byArray;
            kmjjmka2.kAMaJAK = n6;
            if (kmjjmka3 != null) {
                kmjjmka3.KAMaJAK = byArray = kajamma2.KAMaJAK;
                kmjjmka3.kAMaJAK = n3;
            }
            while ((n5 = kmjjmka2.KAMaJAK[kmjjmka2.kAMaJAK++] & 0xFF) != 0) {
                boolean bl;
                n6 = kmjjmka2.KAmAJak();
                int n7 = (kajakkk2.mAjaKka & 0xFFFF) + kmjjmka2.KAmAJak();
                kmaammk kmaammk2 = kmjjmka2.KaMAJak();
                int n8 = n6 << 16 | n7;
                if (n3 > 0) {
                    majjkmk2 = new majjkmk(this);
                    kmjjmka3.kaMAJak(majjkmk2);
                }
                boolean bl2 = (n5 & n) != 0;
                boolean bl3 = bl = (n5 & n2) != 0;
                if (n4 == 1 && bl2 && !bl) {
                    mmjakka mmjakka2 = kajamma2.amaJAkK(n6);
                    if (mmjakka2 == null) continue;
                    this.jAkkAMA(mmjakka2, n8, kmaammk.aKKaMaj(kmaammk2, kajakkk2.MaJAKka), majjkmk2);
                    continue;
                }
                if (n4 != 0 || bl2 || !bl) continue;
                this.jAKkAMA(n8);
            }
            kajakkk2.MajAKka = n;
            ++n4;
        }
    }

    synchronized boolean jAkKamA(kajakkk kajakkk2, int n) {
        boolean bl = false;
        if (kajakkk2 != this.mAjaKkA) {
            if (this.mAjaKkA != null) {
                this.mAjaKkA.MAjaKka.AmaJakk.amAjAkK(this.mAjaKkA, 1);
                this.JaKkAMA(this.mAjaKkA, 1);
                bl = true;
            }
            this.mAjaKkA = kajakkk2;
            if (this.mAjaKkA != null) {
                this.mAjaKkA.MAjaKka.AmaJakk.amAjAkK(this.mAjaKkA, n);
                this.JaKkAMA(this.mAjaKkA, n);
                bl = true;
            }
        } else if (this.mAjaKkA != null && this.mAjaKkA.MajAKka != n) {
            this.mAjaKkA.MAjaKka.AmaJakk.amAjAkK(this.mAjaKkA, n);
            this.JaKkAMA(this.mAjaKkA, n);
            bl = true;
        }
        if (this.mAjaKkA != null) {
            this.MaJAKkA = n;
            this.maJAKkA = this.mAjaKkA.mAjaKka;
        } else {
            this.maJAKkA = 0;
        }
        return bl;
    }

    synchronized kajakkk JakkAMA(int n, int n2) {
        kajakkk kajakkk2 = null;
        int n3 = 0;
        kajakkk kajakkk3 = this.majaKkA;
        while (kajakkk3 != null) {
            if (kajakkk3.MAjaKka.AMaJakk == 2 && kajakkk3.mAjaKka > n3 && this.jAKKamA(kajakkk3, n, n2)) {
                kajakkk2 = kajakkk3;
                n3 = kajakkk3.mAjaKka;
            }
            kajakkk3 = kajakkk3.majaKka;
        }
        return kajakkk2;
    }

    synchronized boolean jAKKamA(kajakkk kajakkk2, int n, int n2) {
        int n3;
        Point point = new Point(n, n2);
        if (this.mAJaKkA) {
            point.x *= 4;
            point.y *= 4;
        }
        kajamma kajamma2 = kajakkk2.MAjaKka.AmaJakk;
        kmjjmka kmjjmka2 = new kmjjmka();
        byte[] byArray = kajamma2.KAMaJAK;
        int n4 = kajakkk2.MAjaKka.aMaJakk;
        kmjjmka2.KAMaJAK = byArray;
        kmjjmka2.kAMaJAK = n4;
        while ((n3 = kmjjmka2.KAMaJAK[kmjjmka2.kAMaJAK++] & 0xFF) != 0) {
            mmjakka mmjakka2;
            n4 = kmjjmka2.KAmAJak();
            int n5 = kajakkk2.mAjaKka + kmjjmka2.KAmAJak();
            kmaammk kmaammk2 = kmjjmka2.KaMAJak();
            int n6 = n4 << 16 | n5;
            if ((n3 & 8) == 0 || (mmjakka2 = kajamma2.amaJAkK(n4)) == null) continue;
            kajakkk kajakkk3 = new kajakkk();
            kajakkk3.MajaKka = this;
            kajakkk3.MAjaKka = mmjakka2;
            kajakkk3.mAjaKka = n6;
            kajakkk3.MaJAKka = kmaammk.aKKaMaj(kmaammk2, kajakkk2.MaJAKka);
            kajakkk3.maJAKka = kmaammk.aKKaMaj(kajakkk3.MaJAKka, this.MaJaKkA);
            kajakkk3.MAJAKka = kajakkk3.maJAKka.AKKaMaj(mmjakka2.AmAjAKk);
            if (!kajakkk3.JaKkaMA(point)) continue;
            return true;
        }
        return false;
    }

    private final void jakKamA(long l, int n, int n2, int n3) {
        if (this.MAJaKKA != n2) {
            if (this.mAJaKKA > 0) {
                int n4 = this.MAJaKKA;
                long l2 = this.maJaKKA;
                long l3 = l2 / 16L;
                this.JAKkamA(n4, (int)(l3 >> 24) & 0xFF000000 | (int)(l3 >> 16) & 0xFF0000 | (int)(l3 >> 8) & 0xFF00 | (int)l3 & 0xFF);
                this.maJaKKA = 0L;
                this.mAJaKKA = 0;
            }
            this.MAJaKKA = n2;
        }
        this.maJaKKA += (long)n3 * l;
        this.mAJaKKA += n3 * n;
    }

    private final void JAKkamA(int n, int n2) {
        if (this.MAJAKkA) {
            this.MAJakkA[n + this.maJakkA] = (byte)this.JaKKamA(n2);
            return;
        }
        this.mAJakkA[n + this.maJakkA] = n2;
    }

    /*
     * Unable to fully structure code
     */
    private final void jAKKAmA(int var1_1, int var2_2, kaaammk var3_3) {
        if (var1_1 < this.MAjAKkA.jAKkAMa) {
            var1_1 = this.MAjAKkA.jAKkAMa;
        }
        if (var2_2 > this.MAjAKkA.jakkAMa) {
            var2_2 = this.MAjAKkA.jakkAMa;
        }
        switch (var3_3.ajakKam) {
            case 64: 
            case 65: 
            case 66: {
                ((kmjjkka)var3_3.AJaKKam).AMajaKK(this.maJakkA, var1_1, var2_2, var3_3);
                return;
            }
            case 0: {
                var4_4 = var1_1 + this.maJakkA;
                var5_7 = var2_2 - var1_1;
                if (var4_4 + var5_7 > this.MaJakkA) {
                    return;
                }
                if (!this.MAJAKkA) ** GOTO lbl20
                while (var5_7-- > 0) {
                    this.MAJakkA[var4_4++] = var3_3.AjAKKam;
                }
                return;
lbl-1000:
                // 1 sources

                {
                    this.mAJakkA[var4_4++] = var3_3.AJAKKam;
lbl20:
                    // 2 sources

                    ** while (var5_7-- > 0)
                }
lbl21:
                // 1 sources

                return;
            }
            case 16: {
                var4_5 = new Point(var1_1 << 8, this.majAkkA << 8);
                var3_3.aJAKKam.akkAmAJ(var4_5);
                var5_8 = var3_3.aJAKKam.ajakkAM >> 8;
                var6_10 = var3_3.aJAKKam.AJakkAM >> 8;
                var7_12 = var1_1;
                while (var7_12 < var2_2) {
                    var8_14 = (var4_5.x >> 15) + 128;
                    if (var8_14 > 256) {
                        var8_14 = 256;
                    } else if (var8_14 < 0) {
                        var8_14 = 0;
                    }
                    this.JAKkamA(var7_12, var3_3.AjaKKam[var8_14]);
                    var4_5.x += var5_8;
                    var4_5.y += var6_10;
                    ++var7_12;
                }
                return;
            }
            case 18: {
                var4_6 = new Point(var1_1 << 8, this.majAkkA << 8);
                var3_3.aJAKKam.akkAmAJ(var4_6);
                var5_9 = var3_3.aJAKKam.ajakkAM >> 8;
                var6_11 = var3_3.aJAKKam.AJakkAM >> 8;
                var7_13 = 0;
                var8_15 = kmaammk.AKkAmAJ(var4_6.x, var4_6.y) >> 14;
                if (var8_15 > 256) {
                    var8_15 = 256;
                }
                var9_16 = var1_1;
                while (var9_16 < var2_2) {
                    var10_17 = var4_6.x >> 14;
                    var11_18 = var10_17 * var10_17;
                    var10_17 = var4_6.y >> 14;
                    var11_18 += var10_17 * var10_17;
                    var12_19 = var8_15;
                    if ((var8_15 += var7_13) < 0) {
                        var8_15 = 0;
                    } else if (var8_15 > 256) {
                        var8_15 = 256;
                    }
                    while (true) {
                        if (var11_18 < var8_15 * var8_15) {
                            --var8_15;
                            continue;
                        }
                        if (var11_18 <= (var8_15 + 1) * (var8_15 + 1) || var8_15 >= 256) break;
                        ++var8_15;
                    }
                    var7_13 = var8_15 - var12_19;
                    this.JAKkamA(var9_16, var3_3.AjaKKam[var8_15]);
                    var4_6.x += var5_9;
                    var4_6.y += var6_11;
                    ++var9_16;
                }
                return;
            }
        }
    }

    private final void jaKkAMA(int n) {
        kaaammk kaaammk2 = null;
        kaaammk kaaammk3 = null;
        kaaammk kaaammk4 = this.MAjakkA;
        while (kaaammk4 != null) {
            if (kaaammk4.AJakKam != 0) {
                if (kaaammk2 == null || kaaammk4.AjakKam > kaaammk2.AjakKam) {
                    kaaammk2 = kaaammk4;
                }
                kaaammk3 = kaaammk4;
            } else {
                if (kaaammk3 != null) {
                    kaaammk3.aJAkKam = kaaammk4.aJAkKam;
                } else {
                    this.MAjakkA = kaaammk4.aJAkKam;
                }
                kaaammk4.aJakKam = false;
            }
            kaaammk4 = kaaammk4.aJAkKam;
        }
        if (this.majakkA != kaaammk2) {
            if (this.majakkA != null) {
                if (this.mAJaKkA) {
                    this.jAkKAmA(this.MajakkA, n);
                } else {
                    this.jAKKAmA(this.MajakkA, n, this.majakkA);
                }
            }
            this.majakkA = kaaammk2;
            this.MajakkA = n;
        }
    }

    private final void jAKkamA(kaaammk kaaammk2, int n) {
        if (this.majakkA != null) {
            if (kaaammk2.AjakKam > this.majakkA.AjakKam) {
                if (this.mAJaKkA) {
                    this.jAkKAmA(this.MajakkA, n);
                } else {
                    this.jAKKAmA(this.MajakkA, n, this.majakkA);
                }
                this.majakkA = kaaammk2;
                this.MajakkA = n;
            }
        } else {
            this.majakkA = kaaammk2;
            this.MajakkA = n;
        }
        if (!kaaammk2.aJakKam) {
            kaaammk2.aJakKam = true;
            kaaammk2.aJAkKam = this.MAjakkA;
            this.MAjakkA = kaaammk2;
        }
    }

    /*
     * Unable to fully structure code
     */
    private final void jAkKAmA(int var1_1, int var2_2) {
        var3_3 = this.mAjAkkA;
        if (var3_3 != null && var3_3.ajaKkAM < var2_2) ** GOTO lbl8
        return;
lbl-1000:
        // 1 sources

        {
            var3_3 = var3_3.AjaKkAM;
            if (var3_3 != null) continue;
            this.mAjAkkA = null;
            return;
lbl8:
            // 2 sources

            ** while (var3_3.AJaKkAM < var1_1)
        }
lbl9:
        // 1 sources

        if (var3_3.ajaKkAM < var1_1) {
            var3_3 = var3_3.AKkaMaj(this, var1_1);
        }
        while (var3_3 != null && var3_3.ajaKkAM < var2_2) {
            if (var3_3.AJaKkAM > var2_2) {
                this.mAjAkkA = var3_3.AKkaMaj(this, var2_2);
                var3_3.aKkaMaj(this.majakkA);
                return;
            }
            var3_3.aKkaMaj(this.majakkA);
            var3_3 = var3_3.AjaKkAM;
        }
        this.mAjAkkA = var3_3;
    }

    private final void jaKkamA() {
        int n;
        this.majAkkA = this.MajAkkA / 4;
        this.maJaKKA = 0L;
        this.mAJaKKA = 0;
        this.MAJaKKA = -32000;
        maaammk maaammk2 = this.MAjAkkA;
        while (true) {
            if (maaammk2.AjAkKam > 0) {
                if (maaammk2.AJAkKam && maaammk2.AjAkKam == 4) {
                    maaammk maaammk3;
                    while ((maaammk3 = maaammk2.AjaKkAM) != null && maaammk3.AJAkKam && maaammk3.aJaKkAM[0] == maaammk2.aJaKkAM[0] && maaammk3.AjAkKam >= 4) {
                        maaammk2.AJaKkAM = maaammk3.AJaKkAM;
                        maaammk2.AjaKkAM = maaammk3.AjaKkAM;
                    }
                }
                n = maaammk2.ajaKkAM / 4;
                int n2 = maaammk2.ajaKkAM & 3;
                int n3 = maaammk2.AJaKkAM / 4;
                int n4 = maaammk2.AJaKkAM & 3;
                long l = maaammk2.akkaMaj(n, this.majAkkA);
                if (n == n3) {
                    this.jakKamA(l, maaammk2.AjAkKam, n, n4 - n2);
                } else {
                    if (n2 > 0) {
                        this.jakKamA(l, maaammk2.AjAkKam, n, 4 - n2);
                        ++n;
                    }
                    if (n < n3) {
                        long l2;
                        long l3;
                        int n5;
                        int n6;
                        if (maaammk2.AJAkKam && maaammk2.AjAkKam == 4) {
                            this.jAKKAmA(n, n3, maaammk2.aJaKkAM[0]);
                        } else if (maaammk2.ajAkKam) {
                            n6 = 4 * maaammk2.AjAkKam;
                            n5 = n;
                            while (n5 < n3) {
                                l3 = maaammk2.akkaMaj(n5, this.majAkkA) * 4L;
                                l2 = l3 / 16L;
                                this.JAKkamA(n5, (int)(l2 >> 24) & 0xFF000000 | (int)(l2 >> 16) & 0xFF0000 | (int)(l2 >> 8) & 0xFF00 | (int)l2 & 0xFF);
                                ++n5;
                            }
                        } else {
                            l3 = 4L * l;
                            n6 = 4 * maaammk2.AjAkKam;
                            n5 = n;
                            while (n5 < n3) {
                                l2 = l3 / 16L;
                                this.JAKkamA(n5, (int)(l2 >> 24) & 0xFF000000 | (int)(l2 >> 16) & 0xFF0000 | (int)(l2 >> 8) & 0xFF00 | (int)l2 & 0xFF);
                                ++n5;
                            }
                        }
                    }
                    if (n4 > 0) {
                        if (maaammk2.ajAkKam) {
                            l = maaammk2.akkaMaj(n3, this.majAkkA);
                        }
                        this.jakKamA(l, maaammk2.AjAkKam, n3, n4);
                    }
                }
            }
            if (maaammk2.AjaKkAM == null) break;
            maaammk2 = maaammk2.AjaKkAM;
        }
        maaammk2.AjaKkAM = this.MaJaKKA;
        this.MaJaKKA = this.MAjAkkA;
        this.MAjAkkA = null;
        if (this.mAJaKKA > 0) {
            n = this.MAJaKKA;
            long l = this.maJaKKA;
            long l4 = l / 16L;
            this.JAKkamA(n, (int)(l4 >> 24) & 0xFF000000 | (int)(l4 >> 16) & 0xFF0000 | (int)(l4 >> 8) & 0xFF00 | (int)l4 & 0xFF);
            this.maJaKKA = 0L;
            this.mAJaKKA = 0;
        }
    }

    private final void JakKamA(maajkkk maajkkk2) {
        while (maajkkk2 != null) {
            if (maajkkk2.AjAkKAm <= this.mAjAKkA.JAkkAMa && maajkkk2.AjakKAm > this.mAjAKkA.JakkAMa) {
                int n = maajkkk2.AjAkKAm - this.mAjAKkA.JakkAMa;
                if (n < 0) {
                    n = 0;
                }
                maajkkk2.ajakkAm = this.MAJAkkA[n];
                this.MAJAkkA[n] = maajkkk2;
            }
            maajkkk2 = maajkkk2.AjakkAm;
        }
    }

    private final void JaKkamA() {
        this.maJakkA = -this.MAjAKkA.jAKkAMa;
        this.MajaKKA = this.MAjAKkA.jakkAMa - this.MAjAKkA.jAKkAMa;
        this.MAjaKKA = 0;
        this.mAjaKKA = this.MaJakkA / this.MajaKKA;
        this.majaKKA = this.MAjAKkA.JakkAMa;
    }

    private final void JAkKAmA() {
        ++this.MAjaKKA;
        if (this.MAjaKKA >= this.mAjaKKA) {
            this.jakKAmA();
        }
        this.maJakkA = this.MAjaKKA * this.MajaKKA - this.MAjAKkA.jAKkAMa;
    }

    private final void jakKAmA() {
        if (this.MAjaKKA > 0) {
            if (this.MAJAKkA) {
                this.MAjAKKA.setPixels(this.MAjAKkA.jAKkAMa, this.majaKKA, this.MajaKKA, this.MAjaKKA, this.mAJAKkA, this.MAJakkA, 0, this.MajaKKA);
            } else {
                this.MAjAKKA.setPixels(this.MAjAKkA.jAKkAMa, this.majaKKA, this.MajaKKA, this.MAjaKKA, this.mAJAKkA, this.mAJakkA, 0, this.MajaKKA);
            }
        }
        this.majaKKA += this.MAjaKKA;
        this.MAjaKKA = 0;
    }

    private final void JakKAmA() {
        this.JaKkamA();
        this.MajAkkA = this.mAjAKkA.JakkAMa;
        while (this.MajAkkA < this.mAjAKkA.JAkkAMa) {
            int n;
            boolean bl;
            int n2;
            maajkkk maajkkk2 = this.MAJAkkA[this.MajAkkA - this.mAjAKkA.JakkAMa];
            while (maajkkk2 != null) {
                maajkkk2.jaKKAmA(this.MajAkkA);
                if (this.MaJAkkA == this.maJAkkA) {
                    this.maJAkkA *= 2;
                    maajkkk[] maajkkkArray = new maajkkk[this.maJAkkA];
                    System.arraycopy(this.mAjakkA, 0, maajkkkArray, 0, this.MaJAkkA);
                    this.mAjakkA = maajkkkArray;
                }
                n2 = this.MaJAkkA;
                while (true) {
                    if (n2 == 0 || this.mAjakkA[n2 - 1].AjaKkAm < maajkkk2.AjaKkAm) break;
                    this.mAjakkA[n2] = this.mAjakkA[n2 - 1];
                    --n2;
                }
                this.mAjakkA[n2] = maajkkk2;
                ++this.MaJAkkA;
                maajkkk2 = maajkkk2.ajakkAm;
            }
            n2 = this.MaJAkkA - 1;
            do {
                bl = false;
                n = 0;
                while (n < n2) {
                    if (this.mAjakkA[n].AjaKkAm > this.mAjakkA[n + 1].AjaKkAm) {
                        maajkkk maajkkk3 = this.mAjakkA[n];
                        this.mAjakkA[n] = this.mAjakkA[n + 1];
                        this.mAjakkA[n + 1] = maajkkk3;
                        if (!bl && n > 0 && this.mAjakkA[n - 1].AjaKkAm > this.mAjakkA[n].AjaKkAm) {
                            bl = true;
                        }
                    }
                    ++n;
                }
            } while (bl && --n2 > 0);
            if (this.mAJaKkA) {
                if (this.MAjAkkA == null) {
                    if (this.MaJaKKA != null) {
                        this.MAjAkkA = this.MaJaKKA;
                        this.MaJaKKA = this.MAjAkkA.AjaKkAM;
                        this.MAjAkkA.AjaKkAM = null;
                        this.MAjAkkA.AjAkKam = 0;
                        this.MAjAkkA.ajAkKam = false;
                        this.MAjAkkA.AJAkKam = true;
                    } else {
                        this.MAjAkkA = new maaammk();
                    }
                    this.MAjAkkA.ajaKkAM = this.mAjAKkA.jAKkAMa;
                    this.MAjAkkA.AJaKkAM = this.mAjAKkA.jakkAMa;
                }
                this.mAjAkkA = this.MAjAkkA;
            } else {
                this.majAkkA = this.MajAkkA;
            }
            n = 0;
            int n3 = this.MajAkkA + 1;
            int n4 = 0;
            while (n4 < this.MaJAkkA) {
                maajkkk maajkkk4 = this.mAjakkA[n4];
                switch (maajkkk4.AJAkkAm) {
                    case 0: {
                        int n5;
                        kaaammk kaaammk2 = maajkkk4.AJakkAm;
                        if (kaaammk2.AJakKam != 0) {
                            kaaammk2.AJakKam = 0;
                            n5 = maajkkk4.AjaKkAm;
                            if (kaaammk2 == this.majakkA) {
                                this.jaKkAMA(n5);
                            }
                        } else {
                            kaaammk2.AJakKam = 1;
                            this.jAKkamA(kaaammk2, maajkkk4.AjaKkAm);
                        }
                        kaaammk2 = maajkkk4.aJakkAm;
                        if (kaaammk2.AJakKam != 0) {
                            kaaammk2.AJakKam = 0;
                            n5 = maajkkk4.AjaKkAm;
                            if (kaaammk2 != this.majakkA) break;
                            this.jaKkAMA(n5);
                            break;
                        }
                        kaaammk2.AJakKam = 1;
                        this.jAKkamA(kaaammk2, maajkkk4.AjaKkAm);
                        break;
                    }
                    case 1: {
                        int n5;
                        kaaammk kaaammk2 = maajkkk4.AJakkAm;
                        if (kaaammk2.AJakKam != 0) {
                            kaaammk2.AJakKam = 0;
                            n5 = maajkkk4.AjaKkAm;
                            if (kaaammk2 != this.majakkA) break;
                            this.jaKkAMA(n5);
                            break;
                        }
                        kaaammk2.AJakKam = 1;
                        this.jAKkamA(kaaammk2, maajkkk4.AjaKkAm);
                        break;
                    }
                    case 2: {
                        kaaammk kaaammk2 = maajkkk4.AJakkAm;
                        if (kaaammk2.AJakKam == 0) {
                            kaaammk2.AJakKam += maajkkk4.aJAkkAm;
                            this.jAKkamA(kaaammk2, maajkkk4.AjaKkAm);
                            break;
                        }
                        kaaammk2.AJakKam += maajkkk4.aJAkkAm;
                        if (kaaammk2.AJakKam != 0) break;
                        int n5 = maajkkk4.AjaKkAm;
                        if (kaaammk2 != this.majakkA) break;
                        this.jaKkAMA(n5);
                    }
                }
                if (maajkkk4.AjakKAm > n3) {
                    maajkkk4.JaKKAmA(n3);
                    this.mAjakkA[n] = maajkkk4;
                    ++n;
                }
                ++n4;
            }
            this.MaJAkkA = n;
            if (this.mAJaKkA) {
                if ((this.MajAkkA & 3) == 3) {
                    this.jaKkamA();
                    if (this.MAjAKKA == null) {
                        return;
                    }
                    this.JAkKAmA();
                }
            } else {
                if (this.MAjAKKA == null) {
                    return;
                }
                this.JAkKAmA();
            }
            ++this.MajAkkA;
        }
        if (this.MAjAKKA != null) {
            this.jakKAmA();
        }
        this.MaJaKKA = null;
    }

    final int jaKKamA(int n) {
        return this.maJAKKA[n];
    }

    final int JaKKamA(int n) {
        int n2 = (n & 0xF00000) >> 12 | (n & 0xF000) >> 8 | (n & 0xF0) >> 4;
        return this.MAJAKKA[n2] & 0xFF;
    }

    private final int JAKkAMA(int n, int n2) {
        int n3 = n - n2;
        if (n3 < 0) {
            return -n3;
        }
        return n3;
    }

    private final void jAKKAMA(int n, int n2, int n3) {
        int n4 = n >> 16 & 0xFF;
        int n5 = n >> 8 & 0xFF;
        int n6 = n & 0xFF;
        int n7 = n4 >> 4;
        int n8 = n5 >> 4;
        int n9 = n6 >> 4;
        int n10 = Math.max(0, n7 - n3);
        int n11 = Math.min(15, n7 + n3);
        int n12 = Math.max(0, n8 - n3);
        int n13 = Math.min(15, n8 + n3);
        int n14 = Math.max(0, n9 - n3);
        int n15 = Math.min(15, n9 + n3);
        n7 = n10;
        while (n7 <= n11) {
            int n16 = n7 == 15 ? 255 : n7 << 4;
            n8 = n12;
            while (n8 <= n13) {
                int n17 = n8 == 15 ? 255 : n8 << 4;
                int n18 = this.JAKkAMA(n16, n4) + this.JAKkAMA(n17, n5);
                int n19 = n7 << 8 | n8 << 4;
                n9 = n14;
                while (n9 <= n15) {
                    int n20 = n9 == 15 ? 255 : n9 << 4;
                    int n21 = n19 | n9;
                    int n22 = n18 + this.JAKkAMA(n20, n6);
                    if (n22 < this.MajAKKA[n21]) {
                        if (this.MajAKKA[n21] == 50000) {
                            --this.mAJAKKA;
                        }
                        this.MajAKKA[n21] = n22;
                        this.MAJAKKA[n21] = (byte)n2;
                    }
                    ++n9;
                }
                ++n8;
            }
            ++n7;
        }
    }

    private final void JAKKAmA() {
        if (this.MAJAKKA == null || this.MajAKKA == null) {
            this.MAJAKKA = new byte[4096];
            this.MajAKKA = new int[4096];
        }
        int n = 0;
        while (n < 4096) {
            this.MajAKKA[n] = 50000;
            ++n;
        }
        this.mAJAKKA = 4096;
        int n2 = 3;
        while (n2 < 16 && this.mAJAKKA > 0) {
            int n3 = 0;
            while (n3 < this.MaJAKKA) {
                this.jAKKAMA(this.maJAKKA[n3], n3, n2);
                ++n3;
            }
            ++n2;
        }
        this.MajAKKA = null;
    }

    synchronized boolean jakkAMA(int n, int n2) {
        if (n != this.MajAKkA || n2 != this.majAKkA) {
            this.jAkkamA(n, n2, this.mAJAKkA);
            return true;
        }
        return false;
    }

    synchronized void jAkkamA(int n, int n2, ColorModel colorModel) {
        this.mAJAKkA = colorModel;
        this.MajAKkA = n;
        this.majAKkA = n2;
        this.JAkkamA();
        if (this.mAJAKkA instanceof IndexColorModel) {
            IndexColorModel indexColorModel = (IndexColorModel)this.mAJAKkA;
            this.MaJAKKA = indexColorModel.getMapSize();
            byte[] byArray = new byte[this.MaJAKKA];
            byte[] byArray2 = new byte[this.MaJAKKA];
            byte[] byArray3 = new byte[this.MaJAKKA];
            indexColorModel.getReds(byArray);
            indexColorModel.getGreens(byArray2);
            indexColorModel.getBlues(byArray3);
            this.maJAKKA = new int[this.MaJAKKA];
            int n3 = 0;
            int n4 = 0;
            while (n4 < this.MaJAKKA) {
                this.maJAKKA[n4] = 0xFF000000 | (byArray[n4] & 0xFF) << 16 | (byArray2[n4] & 0xFF) << 8 | byArray3[n4] & 0xFF;
                if (this.maJAKKA[n4] == -1) {
                    ++n3;
                }
                ++n4;
            }
            if (n3 > 100) {
                this.majAKKA = true;
                this.jAkkamA(n, n2, ColorModel.getRGBdefault());
                return;
            }
            this.MAJAKkA = true;
            this.JAKKAmA();
            if (this.MAJakkA == null || this.MaJakkA < 4 * this.MajAKkA) {
                this.MaJakkA = this.MajAKkA * this.majAKkA;
                if (this.MaJakkA > 100000 && !this.MAjaKkA.aMAjaKk) {
                    this.MaJakkA = 100000;
                }
                this.MAJakkA = new byte[this.MaJakkA];
                this.mAJakkA = null;
            }
            return;
        }
        this.mAJAKkA = ColorModel.getRGBdefault();
        this.MAJAKkA = false;
        if (this.mAJakkA == null || this.MaJakkA < 4 * this.MajAKkA) {
            this.MaJakkA = this.MajAKkA * this.majAKkA;
            if (this.MaJakkA > 50000 && !this.MAjaKkA.aMAjaKk) {
                this.MaJakkA = 50000;
            }
            this.MAJakkA = null;
            this.mAJakkA = new int[this.MaJakkA];
        }
        this.maJAKKA = null;
        this.MAJAKKA = null;
    }

    boolean JAkKamA() {
        kaajmmk kaajmmk2 = this.MajaKkA;
        if (kaajmmk2.jAKkAMa != Integer.MIN_VALUE && !false) {
            this.JAKKAMA(true);
            return true;
        }
        return false;
    }

    synchronized void jaKKAMA(kajamma kajamma2, int n) {
        kajamma2.mAJAKKa = false;
        ((kajakmk)kajamma2.MaJAKKa).stop();
        kajamma2.majAKKa = false;
        kajamma2.MAjaKKa = 0;
        kajamma2.amAJAkK(n - 1);
        kajamma2.majAKKa = true;
        kajamma2.MAjaKKa = 0;
        kajamma2.amAJAkK(n);
    }

    synchronized int JaKKAMA(kajamma kajamma2, int n) {
        return kajamma2.amAJAkK(n);
    }

    public synchronized void addConsumer(ImageConsumer imageConsumer) {
        if (imageConsumer != this.MAjAKKA) {
            this.MAjAKKA = imageConsumer;
            this.mAjAKKA = true;
        }
    }

    public boolean isConsumer(ImageConsumer imageConsumer) {
        return this.MAjAKKA == imageConsumer;
    }

    public synchronized void removeConsumer(ImageConsumer imageConsumer) {
        if (this.MAjAKKA == imageConsumer) {
            this.MAjAKKA = null;
        }
    }

    public void startProduction(ImageConsumer imageConsumer) {
        this.addConsumer(imageConsumer);
        this.JAKKAMA(false);
    }

    public void requestTopDownLeftRightResend(ImageConsumer imageConsumer) {
    }

    private synchronized void JAKKAMA(boolean bl) {
        Object object;
        if (this.MAjAKKA == null) {
            this.MAjaKkA.AmajaKk.repaint();
            return;
        }
        if (this.mAjAKKA) {
            this.MAjAKKA.setDimensions(this.MajAKkA, this.majAKkA);
            if (this.MAjAKKA == null) {
                return;
            }
            this.MAjAKKA.setColorModel(this.mAJAKkA);
            if (this.MAjAKKA == null) {
                return;
            }
            this.MAjAKKA.setHints(10);
            this.mAjAKKA = false;
        }
        if (this.MAjAKKA == null) {
            return;
        }
        if (!bl) {
            this.MAjAKkA = new kaajmmk(0, 0, this.MajAKkA, this.majAKkA);
        } else {
            this.MAjAKkA = new kaajmmk(this.MajaKkA);
            if (this.mAJaKkA) {
                this.MAjAKkA.jAKkAMa /= 4;
                this.MAjAKkA.JakkAMa /= 4;
                this.MAjAKkA.jakkAMa /= 4;
                this.MAjAKkA.JAkkAMa /= 4;
            }
            this.MAjAKkA.jAKkAMa -= 2;
            this.MAjAKkA.jakkAMa += 2;
            this.MAjAKkA.JakkAMa -= 2;
            this.MAjAKkA.JAkkAMa += 2;
            this.MAjAKkA.jAKkAMa = Math.max(this.MAjAKkA.jAKkAMa, 0);
            this.MAjAKkA.jakkAMa = Math.min(this.MAjAKkA.jakkAMa, this.MajAKkA);
            this.MAjAKkA.JakkAMa = Math.max(this.MAjAKkA.JakkAMa, 0);
            this.MAjAKkA.JAkkAMa = Math.min(this.MAjAKkA.JAkkAMa, this.majAKkA);
            if (this.MAjAKkA.jAKkAMa >= this.MAjAKkA.jakkAMa || this.MAjAKkA.JakkAMa >= this.MAjAKkA.JAkkAMa) {
                object = this.MAjAKkA;
                ((kaajmmk)object).JAkkAMa = Integer.MIN_VALUE;
                ((kaajmmk)object).JakkAMa = Integer.MIN_VALUE;
                ((kaajmmk)object).jakkAMa = Integer.MIN_VALUE;
                ((kaajmmk)object).jAKkAMa = Integer.MIN_VALUE;
            }
        }
        object = this.MajaKkA;
        ((kaajmmk)object).JAkkAMa = Integer.MIN_VALUE;
        ((kaajmmk)object).JakkAMa = Integer.MIN_VALUE;
        ((kaajmmk)object).jakkAMa = Integer.MIN_VALUE;
        ((kaajmmk)object).jAKkAMa = Integer.MIN_VALUE;
        object = this.MAjAKkA;
        if (((kaajmmk)object).jAKkAMa != Integer.MIN_VALUE && !false) {
            if (this.majAKKA) {
                this.MAjAKkA.jAKkAMa = 0;
                this.MAjAKkA.jakkAMa = this.MajAKkA;
            }
            if (this.mAJaKkA) {
                this.mAjAKkA = new kaajmmk(this.MAjAKkA);
                this.mAjAKkA.jAKkAMa *= 4;
                this.mAjAKkA.jakkAMa *= 4;
                this.mAjAKkA.JakkAMa *= 4;
                this.mAjAKkA.JAkkAMa *= 4;
            } else {
                this.mAjAKkA = this.MAjAKkA;
            }
            this.mAJAkkA = this.mAjAKkA.JAkkAMa - this.mAjAKkA.JakkAMa + 1;
            this.MAJAkkA = new maajkkk[this.mAJAkkA];
            if (this.mAjakkA == null) {
                this.maJAkkA = 250;
                this.mAjakkA = new maajkkk[this.maJAkkA];
            }
            this.MaJAkkA = 0;
            this.MAjakkA = null;
            this.majakkA = null;
            this.MajakkA = 0;
            object = this.majaKkA;
            while (object != null) {
                if (((kajakkk)object).MAJAKka.aKKaMAJ(this.mAjAKkA)) {
                    ((kajakkk)object).jaKkaMA();
                    ((kajakkk)object).mAJAKka = true;
                    this.JakKamA(((kajakkk)object).majAKka);
                }
                object = ((kajakkk)object).majaKka;
            }
            if (this.maJaKkA != 0) {
                maajkkk maajkkk2 = new maajkkk();
                maajkkk maajkkk3 = new maajkkk();
                kaaammk kaaammk2 = new kaaammk(this, this.maJaKkA);
                kaaammk2.AjakKam = 0;
                maajkkk2.AjakkAm = maajkkk3;
                Point point = new Point(this.mAjAKkA.jAKkAMa, this.mAjAKkA.JakkAMa);
                Point point2 = new Point(this.mAjAKkA.jAKkAMa, this.mAjAKkA.JAkkAMa);
                maajkkk2.aKkAmaj(point, point2);
                point.x = point2.x = this.mAjAKkA.jakkAMa;
                maajkkk3.aKkAmaj(point, point2);
                maajkkk3.AJAkkAm = 1;
                maajkkk2.AJAkkAm = 1;
                maajkkk2.AJakkAm = maajkkk3.AJakkAm = kaaammk2;
                this.JakKamA(maajkkk2);
            }
            this.JakKAmA();
            this.MAjAKKA.imageComplete(2);
            this.MAjaKkA.aMAJaKk(true, this.MAjAKkA.jAKkAMa, this.MAjAKkA.JakkAMa, this.MAjAKkA.jakkAMa - this.MAjAKkA.jAKkAMa + 1, this.MAjAKkA.JAkkAMa - this.MAjAKkA.JakkAMa + 1);
        }
    }
}

