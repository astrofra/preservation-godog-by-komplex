import java.awt.Point;

// 
// Decompiled by Procyon v0.6.0
// 

final class kajakkk
{
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
        final kajamma amaJakk = this.MAjaKka.AmaJakk;
        if (this.majAKka != null || amaJakk.majakka != 0) {
            return;
        }
        switch (this.MAjaKka.AMaJakk) {
            case 0: {
                final maajmmk maajmmk = new maajmmk(amaJakk, this.MAjaKka.aMaJakk, this.maJAKka, this.MAjAKka);
                maajmmk.jAKkama = this;
                maajmmk.AKkamaJ(true);
                return;
            }
            case 4: {
                final kmjjmka kmjjmka = new kmjjmka();
                final byte[] kaMaJAK = amaJakk.KAMaJAK;
                final int aMaJakk = this.MAjaKka.aMaJakk;
                kmjjmka.KAMaJAK = kaMaJAK;
                kmjjmka.kAMaJAK = aMaJakk;
                final kmaammk akKaMaj = kmaammk.aKKaMaj(kmjjmka.KaMAJak(), this.maJAKka);
                final int n = kmjjmka.KAMaJAK[kmjjmka.kAMaJAK++] & 0xFF;
                final int n2 = kmjjmka.KAMaJAK[kmjjmka.kAMaJAK++] & 0xFF;
                int ajakKam = this.mAjaKka << 16;
                int n3 = 0;
                kaaammk kaaammk = null;
                final kmaammk kmaammk = new kmaammk();
                mmjakka amaJAkK = null;
                while (true) {
                    if (n3 == 0) {
                        final int n4 = kmjjmka.KAMaJAK[kmjjmka.kAMaJAK++] & 0xFF;
                        if (n4 == 0) {
                            break;
                        }
                        if ((n4 & 0x8) != 0x0) {
                            amaJAkK = amaJakk.amaJAkK(kmjjmka.KAmAJak());
                        }
                        if ((n4 & 0x4) != 0x0) {
                            kaaammk = new kaaammk(this.MajaKka, kmjjmka.KAMAJak());
                            kaaammk.AjakKam = ajakKam;
                            ++ajakKam;
                            if (this.MAjAKka != null) {
                                this.MAjAKka.kKAmAJA(kaaammk);
                            }
                        }
                        if ((n4 & 0x1) != 0x0) {
                            kmaammk.ajAKkAM = kmjjmka.kamAJak();
                        }
                        if ((n4 & 0x2) != 0x0) {
                            kmaammk.AJAKkAM = kmjjmka.kamAJak();
                        }
                        if ((n4 & 0x8) != 0x0) {
                            final kmaammk kmaammk2 = kmaammk;
                            final kmaammk kmaammk3 = kmaammk;
                            final int n5 = kmjjmka.KAmAJak() * 64;
                            kmaammk3.AjAKkAM = n5;
                            kmaammk2.ajakkAM = n5;
                        }
                        n3 = (kmjjmka.KAMaJAK[kmjjmka.kAMaJAK++] & 0xFF);
                        kmjjmka.KAmaJAK = 0;
                        kmjjmka.kamaJAK = 0;
                    }
                    final int kAmaJak = kmjjmka.kAmaJak(n);
                    final int kAmaJak2 = kmjjmka.KAmaJak(n2);
                    if (amaJAkK != null) {
                        final int n6 = amaJAkK.aMaJakk + 2 * kAmaJak;
                        final maajmmk maajmmk2 = new maajmmk(amaJakk, amaJAkK.aMaJakk + ((amaJakk.KAMaJAK[n6] & 0xFF) | (amaJakk.KAMaJAK[n6 + 1] & 0xFF) << 8), kmaammk.aKKaMaj(kmaammk, akKaMaj), this.MAjAKka);
                        maajmmk2.jaKkama = true;
                        maajmmk2.jAKkama = this;
                        maajmmk2.JAkKaMA = 1;
                        (maajmmk2.jAkKaMA = new kaaammk[2])[1] = kaaammk;
                        maajmmk2.AKkamaJ(false);
                    }
                    final kmaammk kmaammk4 = kmaammk;
                    kmaammk4.ajAKkAM += kAmaJak2;
                    --n3;
                }
            }
            default: {}
        }
    }
    
    boolean JaKkaMA(final Point point) {
        boolean b = false;
        if (this.MAJAKka != null && this.MAJAKka.AkKaMAJ(point)) {
            if (this.majAKka == null) {
                this.jaKkaMA();
            }
            boolean b2 = false;
            for (maajkkk maajkkk = this.majAKka; maajkkk != null; maajkkk = maajkkk.AjakkAm) {
                if (maajkkk.AjAkKAm <= point.y && point.y < maajkkk.AjakKAm && maajkkk.akKaMAj(point, 0) > 0) {
                    b2 = true;
                    switch (maajkkk.AJAkkAm) {
                        case 0: {
                            final kaaammk aJakkAm = maajkkk.AJakkAm;
                            aJakkAm.AJakKam ^= 0x1;
                            final kaaammk aJakkAm2 = maajkkk.aJakkAm;
                            aJakkAm2.AJakKam ^= 0x1;
                            break;
                        }
                        case 1: {
                            final kaaammk aJakkAm3 = maajkkk.AJakkAm;
                            aJakkAm3.AJakKam ^= 0x1;
                            break;
                        }
                        case 2: {
                            final kaaammk aJakkAm4 = maajkkk.AJakkAm;
                            aJakkAm4.AJakKam += maajkkk.aJAkkAm;
                            break;
                        }
                    }
                }
            }
            if (b2) {
                for (maajkkk maajkkk2 = this.majAKka; maajkkk2 != null; maajkkk2 = maajkkk2.AjakkAm) {
                    if (maajkkk2.AJakkAm != null) {
                        if (maajkkk2.AJakkAm.AJakKam != 0) {
                            b = true;
                        }
                        maajkkk2.AJakkAm.AJakKam = 0;
                    }
                    if (maajkkk2.aJakkAm != null) {
                        if (maajkkk2.aJakkAm.AJakKam != 0) {
                            b = true;
                        }
                        maajkkk2.aJakkAm.AJakKam = 0;
                    }
                }
            }
        }
        return b;
    }
}
