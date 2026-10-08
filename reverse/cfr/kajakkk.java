/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

final class kajakkk {
    kaajkkk MajaKka;
    kajakkk majaKka;
    mmjakka MAjaKka;
    int mAjaKka;
    kmaammk MaJAKka;
    kmaammk maJAKka;
    kaajmmk MAJAKka;
    boolean mAJAKka;
    int MajAKka;
    maajkkk majAKka;
    majjkmk MAjAKka;

    final void jaKkaMA() {
        kajamma kajamma2 = this.MAjaKka.AmaJakk;
        if (this.majAKka != null || kajamma2.majakka != 0) {
            return;
        }
        switch (this.MAjaKka.AMaJakk) {
            case 0: {
                maajmmk maajmmk2 = new maajmmk(kajamma2, this.MAjaKka.aMaJakk, this.maJAKka, this.MAjAKka);
                maajmmk2.jAKkama = this;
                maajmmk2.AKkamaJ(true);
                return;
            }
            case 4: {
                kmjjmka kmjjmka2 = new kmjjmka();
                Object object = kajamma2.KAMaJAK;
                int n = this.MAjaKka.aMaJakk;
                kmjjmka2.KAMaJAK = object;
                kmjjmka2.kAMaJAK = n;
                object = kmaammk.aKKaMaj(kmjjmka2.KaMAJak(), this.maJAKka);
                n = kmjjmka2.KAMaJAK[kmjjmka2.kAMaJAK++] & 0xFF;
                int n2 = kmjjmka2.KAMaJAK[kmjjmka2.kAMaJAK++] & 0xFF;
                int n3 = this.mAjaKka << 16;
                int n4 = 0;
                kaaammk kaaammk2 = null;
                kmaammk kmaammk2 = new kmaammk();
                mmjakka mmjakka2 = null;
                while (true) {
                    int n5;
                    if (n4 == 0) {
                        if ((n5 = kmjjmka2.KAMaJAK[kmjjmka2.kAMaJAK++] & 0xFF) == 0) break;
                        if ((n5 & 8) != 0) {
                            mmjakka2 = kajamma2.amaJAkK(kmjjmka2.KAmAJak());
                        }
                        if ((n5 & 4) != 0) {
                            kaaammk2 = new kaaammk(this.MajaKka, kmjjmka2.KAMAJak());
                            kaaammk2.AjakKam = n3++;
                            if (this.MAjAKka != null) {
                                this.MAjAKka.kKAmAJA(kaaammk2);
                            }
                        }
                        if ((n5 & 1) != 0) {
                            kmaammk2.ajAKkAM = kmjjmka2.kamAJak();
                        }
                        if ((n5 & 2) != 0) {
                            kmaammk2.AJAKkAM = kmjjmka2.kamAJak();
                        }
                        if ((n5 & 8) != 0) {
                            kmaammk2.ajakkAM = kmaammk2.AjAKkAM = kmjjmka2.KAmAJak() * 64;
                        }
                        n4 = kmjjmka2.KAMaJAK[kmjjmka2.kAMaJAK++] & 0xFF;
                        kmjjmka2.KAmaJAK = 0;
                        kmjjmka2.kamaJAK = 0;
                    }
                    n5 = kmjjmka2.kAmaJak(n);
                    int n6 = kmjjmka2.KAmaJak(n2);
                    if (mmjakka2 != null) {
                        int n7 = mmjakka2.aMaJakk + 2 * n5;
                        int n8 = kajamma2.KAMaJAK[n7] & 0xFF | (kajamma2.KAMaJAK[n7 + 1] & 0xFF) << 8;
                        maajmmk maajmmk3 = new maajmmk(kajamma2, mmjakka2.aMaJakk + n8, kmaammk.aKKaMaj(kmaammk2, (kmaammk)object), this.MAjAKka);
                        maajmmk3.jaKkama = true;
                        maajmmk3.jAKkama = this;
                        maajmmk3.JAkKaMA = 1;
                        maajmmk3.jAkKaMA = new kaaammk[2];
                        maajmmk3.jAkKaMA[1] = kaaammk2;
                        maajmmk3.AKkamaJ(false);
                    }
                    kmaammk2.ajAKkAM += n6;
                    --n4;
                }
                return;
            }
        }
    }

    boolean JaKkaMA(Point point) {
        boolean bl = false;
        if (this.MAJAKka != null && this.MAJAKka.AkKaMAJ(point)) {
            if (this.majAKka == null) {
                this.jaKkaMA();
            }
            boolean bl2 = false;
            maajkkk maajkkk2 = this.majAKka;
            while (maajkkk2 != null) {
                if (maajkkk2.AjAkKAm <= point.y && point.y < maajkkk2.AjakKAm && maajkkk2.akKaMAj(point, 0) > 0) {
                    bl2 = true;
                    switch (maajkkk2.AJAkkAm) {
                        case 0: {
                            maajkkk2.AJakkAm.AJakKam ^= 1;
                            maajkkk2.aJakkAm.AJakKam ^= 1;
                            break;
                        }
                        case 1: {
                            maajkkk2.AJakkAm.AJakKam ^= 1;
                            break;
                        }
                        case 2: {
                            maajkkk2.AJakkAm.AJakKam += maajkkk2.aJAkkAm;
                        }
                    }
                }
                maajkkk2 = maajkkk2.AjakkAm;
            }
            if (bl2) {
                maajkkk maajkkk3 = this.majAKka;
                while (maajkkk3 != null) {
                    if (maajkkk3.AJakkAm != null) {
                        if (maajkkk3.AJakkAm.AJakKam != 0) {
                            bl = true;
                        }
                        maajkkk3.AJakkAm.AJakKam = 0;
                    }
                    if (maajkkk3.aJakkAm != null) {
                        if (maajkkk3.aJakkAm.AJakKam != 0) {
                            bl = true;
                        }
                        maajkkk3.aJakkAm.AJakKam = 0;
                    }
                    maajkkk3 = maajkkk3.AjakkAm;
                }
            }
        }
        return bl;
    }

    kajakkk() {
        super();
    }
}

