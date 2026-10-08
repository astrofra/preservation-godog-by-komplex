import java.awt.image.IndexColorModel;
import java.awt.Point;
import java.awt.image.ImageConsumer;
import java.awt.image.ColorModel;
import java.awt.image.ImageProducer;

// 
// Decompiled by Procyon v0.6.0
// 

final class kaajkkk implements ImageProducer
{
    private kmaammk MaJaKkA;
    private int maJaKkA;
    private int MAJaKkA;
    boolean mAJaKkA;
    private kaajmmk MajaKkA;
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
    boolean majAKKA;
    ImageConsumer MAjAKKA;
    boolean mAjAKKA;
    
    kaajkkk(final mmaakka mAjaKkA) {
        this.MaJaKkA = new kmaammk();
        this.maJaKkA = -1;
        this.mAJaKkA = false;
        this.MajaKkA = new kaajmmk();
        this.majAKKA = false;
        this.MAjaKkA = mAjaKkA;
    }
    
    void JAKKamA() {
        for (kajakkk kajakkk = this.majaKkA; kajakkk != null; kajakkk = kajakkk.majaKka) {
            this.MajaKkA.akKaMAJ(kajakkk.MAJAKka);
        }
        this.majaKkA = null;
        this.mAjaKkA = null;
        if (this.MAJaKkA <= 1) {
            this.maJaKkA = -1;
            this.MAJaKkA = 0;
        }
    }
    
    synchronized void JAkkAMA(final kaajmmk kaajmmk, final boolean maJaKkA, final int n, final boolean b) {
        final kaajmmk kaajmmk2 = new kaajmmk(0, 0, this.MajAKkA, this.majAKkA);
        if (maJaKkA) {
            final kaajmmk kaajmmk3 = kaajmmk2;
            kaajmmk3.jakkAMa *= 4;
            final kaajmmk kaajmmk4 = kaajmmk2;
            kaajmmk4.JAkkAMa *= 4;
        }
        final kmaammk kmaammk;
        final kmaammk maJaKkA2 = kmaammk = new kmaammk();
        final int max = Math.max(kaajmmk2.jakkAMa - kaajmmk2.jAKkAMa, 16);
        final int max2 = Math.max(kaajmmk.jakkAMa - kaajmmk.jAKkAMa, 16);
        kmaammk.ajakkAM = ((max2 != 0) ? ((int)(((long)max << 16) / max2)) : Integer.MAX_VALUE);
        final kmaammk kmaammk2 = maJaKkA2;
        final int max3 = Math.max(kaajmmk2.JAkkAMa - kaajmmk2.JakkAMa, 16);
        final int max4 = Math.max(kaajmmk.JAkkAMa - kaajmmk.JakkAMa, 16);
        kmaammk2.AjAKkAM = ((max4 != 0) ? ((int)(((long)max3 << 16) / max4)) : Integer.MAX_VALUE);
        switch (n & 0xF) {
            default: {
                final kmaammk kmaammk3 = maJaKkA2;
                final kmaammk kmaammk4 = maJaKkA2;
                final int min = Math.min(maJaKkA2.ajakkAM, maJaKkA2.AjAKkAM);
                kmaammk4.AjAKkAM = min;
                kmaammk3.ajakkAM = min;
                break;
            }
            case 1: {
                final kmaammk kmaammk5 = maJaKkA2;
                final kmaammk kmaammk6 = maJaKkA2;
                final int max5 = Math.max(maJaKkA2.ajakkAM, maJaKkA2.AjAKkAM);
                kmaammk6.AjAKkAM = max5;
                kmaammk5.ajakkAM = max5;
                break;
            }
        }
        int n2;
        int n3;
        if ((n & 0x10) != 0x0) {
            n2 = kaajmmk.jAKkAMa;
            n3 = kaajmmk2.jAKkAMa;
        }
        else if ((n & 0x20) != 0x0) {
            n2 = kaajmmk.jakkAMa;
            n3 = kaajmmk2.jakkAMa;
        }
        else {
            n2 = (kaajmmk.jAKkAMa + kaajmmk.jakkAMa) / 2;
            n3 = (kaajmmk2.jAKkAMa + kaajmmk2.jakkAMa) / 2;
        }
        int n4;
        int n5;
        if ((n & 0x40) != 0x0) {
            n4 = kaajmmk.JakkAMa;
            n5 = kaajmmk2.JakkAMa;
        }
        else if ((n & 0x80) != 0x0) {
            n4 = kaajmmk.JAkkAMa;
            n5 = kaajmmk2.JAkkAMa;
        }
        else {
            n4 = (kaajmmk.JakkAMa + kaajmmk.JAkkAMa) / 2;
            n5 = (kaajmmk2.JakkAMa + kaajmmk2.JAkkAMa) / 2;
        }
        maJaKkA2.ajAKkAM = n3 - (int)(n2 * (long)maJaKkA2.ajakkAM + 32768L >> 16);
        maJaKkA2.AJAKkAM = n5 - (int)(n4 * (long)maJaKkA2.ajakkAM + 32768L >> 16);
        if (maJaKkA2.ajakkAM != this.MaJaKkA.ajakkAM || maJaKkA2.AJakkAM != this.MaJaKkA.AJakkAM || maJaKkA2.aJakkAM != this.MaJaKkA.aJakkAM || maJaKkA2.AjAKkAM != this.MaJaKkA.AjAKkAM || maJaKkA2.ajAKkAM != this.MaJaKkA.ajAKkAM || maJaKkA2.AJAKkAM != this.MaJaKkA.AJAKkAM || this.mAJaKkA != maJaKkA) {
            this.mAJaKkA = maJaKkA;
            this.MaJaKkA = maJaKkA2;
            this.jakkamA();
        }
        if (b && this.MajaKkA.jAKkAMa != Integer.MIN_VALUE && !false) {
            this.JAKKAMA(true);
        }
    }
    
    synchronized void JAkkamA() {
        final kaajmmk majaKkA = this.MajaKkA;
        final kaajmmk majaKkA2 = this.MajaKkA;
        final int n = 0;
        majaKkA2.JakkAMa = n;
        majaKkA.jAKkAMa = n;
        this.MajaKkA.jakkAMa = this.MajAKkA;
        this.MajaKkA.JAkkAMa = this.majAKkA;
        if (this.mAJaKkA) {
            final kaajmmk majaKkA3 = this.MajaKkA;
            majaKkA3.jakkAMa *= 4;
            final kaajmmk majaKkA4 = this.MajaKkA;
            majaKkA4.JAkkAMa *= 4;
        }
    }
    
    private void jakkamA() {
        this.JAkkamA();
        for (kajakkk kajakkk = this.majaKkA; kajakkk != null; kajakkk = kajakkk.majaKka) {
            kajakkk.majAKka = null;
            kajakkk.maJAKka = kmaammk.aKKaMaj(kajakkk.MaJAKka, this.MaJaKkA);
            kajakkk.MAJAKka = kajakkk.maJAKka.AKKaMaj(kajakkk.MAjaKka.AmAjAKk);
        }
    }
    
    synchronized void JakkamA(final int maJaKkA, final int maJaKkA2) {
        if (maJaKkA2 >= this.MAJaKkA) {
            if (this.maJaKkA == maJaKkA && maJaKkA2 == this.MAJaKkA) {
                return;
            }
            this.JAkkamA();
            this.maJaKkA = maJaKkA;
            this.MAJaKkA = maJaKkA2;
        }
    }
    
    synchronized void jAkkAMA(final mmjakka mAjaKka, final int mAjaKka2, final kmaammk maJAKka, final majjkmk mAjAKka) {
        final kajakkk kajakkk = new kajakkk();
        kajakkk.majaKka = this.majaKkA;
        this.majaKkA = kajakkk;
        kajakkk.MajaKka = this;
        kajakkk.MAjaKka = mAjaKka;
        kajakkk.mAjaKka = mAjaKka2;
        kajakkk.MaJAKka = maJAKka;
        kajakkk.MAjAKka = mAjAKka;
        if (mAjaKka.AMaJakk == 2) {
            int maJAKkA = 1;
            if (mAjaKka2 == this.maJAKkA) {
                this.mAjaKkA = kajakkk;
                maJAKkA = this.MaJAKkA;
            }
            this.JaKkAMA(kajakkk, maJAKkA);
            kajakkk.MAJAKka = new kaajmmk();
            return;
        }
        kajakkk.maJAKka = kmaammk.aKKaMaj(kajakkk.MaJAKka, this.MaJaKkA);
        kajakkk.MAJAKka = kajakkk.maJAKka.AKKaMaj(mAjaKka.AmAjAKk);
        this.MajaKkA.akKaMAJ(kajakkk.MAJAKka);
    }
    
    synchronized void jAKkAMA(final int n) {
        kajakkk kajakkk = null;
        for (kajakkk kajakkk2 = this.majaKkA; kajakkk2 != null; kajakkk2 = kajakkk2.majaKka) {
            if (kajakkk2.mAjaKka == n) {
                if (kajakkk2.MajAKka != 0) {
                    this.JaKkAMA(kajakkk2, 0);
                    this.jAKkAMA(n);
                    if (this.mAjaKkA == kajakkk2) {
                        this.mAjaKkA = null;
                    }
                }
                else {
                    if (kajakkk2.mAJAKka) {
                        this.MajaKkA.akKaMAJ(kajakkk2.MAJAKka);
                    }
                    if (kajakkk != null) {
                        kajakkk.majaKka = kajakkk2.majaKka;
                        return;
                    }
                    this.majaKkA = kajakkk2.majaKka;
                }
                return;
            }
            kajakkk = kajakkk2;
        }
    }
    
    private void JaKkAMA(final kajakkk kajakkk, final int majAKka) {
        final int majAKka2 = kajakkk.MajAKka;
        if (majAKka2 == majAKka) {
            return;
        }
        final kajamma amaJakk = kajakkk.MAjaKka.AmaJakk;
        final kmjjmka kmjjmka = new kmjjmka();
        final int amAjAKk = kajakkk.MAjaKka.AMAjAKk;
        majjkmk majjkmk = null;
        kmjjmka kmjjmka2 = null;
        if (amAjAKk > 0) {
            kmjjmka2 = new kmjjmka();
        }
        for (int i = 0; i < 2; ++i) {
            final byte[] kaMaJAK = amaJakk.KAMaJAK;
            final int aMaJakk = kajakkk.MAjaKka.aMaJakk;
            kmjjmka.KAMaJAK = kaMaJAK;
            kmjjmka.kAMaJAK = aMaJakk;
            if (kmjjmka2 != null) {
                kmjjmka2.KAMaJAK = amaJakk.KAMaJAK;
                kmjjmka2.kAMaJAK = amAjAKk;
            }
            while (true) {
                final int n = kmjjmka.KAMaJAK[kmjjmka.kAMaJAK++] & 0xFF;
                if (n == 0) {
                    break;
                }
                final int kAmAJak = kmjjmka.KAmAJak();
                final int n2 = (kajakkk.mAjaKka & 0xFFFF) + kmjjmka.KAmAJak();
                final kmaammk kaMAJak = kmjjmka.KaMAJak();
                final int n3 = kAmAJak << 16 | n2;
                if (amAjAKk > 0) {
                    majjkmk = new majjkmk(this);
                    kmjjmka2.kaMAJak(majjkmk);
                }
                final boolean b = (n & majAKka) != 0x0;
                final boolean b2 = (n & majAKka2) != 0x0;
                if (i == 1 && b && !b2) {
                    final mmjakka amaJAkK = amaJakk.amaJAkK(kAmAJak);
                    if (amaJAkK == null) {
                        continue;
                    }
                    this.jAkkAMA(amaJAkK, n3, kmaammk.aKKaMaj(kaMAJak, kajakkk.MaJAKka), majjkmk);
                }
                else {
                    if (i != 0 || b || !b2) {
                        continue;
                    }
                    this.jAKkAMA(n3);
                }
            }
            kajakkk.MajAKka = majAKka;
        }
    }
    
    synchronized boolean jAkKamA(final kajakkk mAjaKkA, final int maJAKkA) {
        boolean b = false;
        if (mAjaKkA != this.mAjaKkA) {
            if (this.mAjaKkA != null) {
                this.mAjaKkA.MAjaKka.AmaJakk.amAjAkK(this.mAjaKkA, 1);
                this.JaKkAMA(this.mAjaKkA, 1);
                b = true;
            }
            this.mAjaKkA = mAjaKkA;
            if (this.mAjaKkA != null) {
                this.mAjaKkA.MAjaKka.AmaJakk.amAjAkK(this.mAjaKkA, maJAKkA);
                this.JaKkAMA(this.mAjaKkA, maJAKkA);
                b = true;
            }
        }
        else if (this.mAjaKkA != null && this.mAjaKkA.MajAKka != maJAKkA) {
            this.mAjaKkA.MAjaKka.AmaJakk.amAjAkK(this.mAjaKkA, maJAKkA);
            this.JaKkAMA(this.mAjaKkA, maJAKkA);
            b = true;
        }
        if (this.mAjaKkA != null) {
            this.MaJAKkA = maJAKkA;
            this.maJAKkA = this.mAjaKkA.mAjaKka;
        }
        else {
            this.maJAKkA = 0;
        }
        return b;
    }
    
    synchronized kajakkk JakkAMA(final int n, final int n2) {
        kajakkk kajakkk = null;
        int mAjaKka = 0;
        for (kajakkk kajakkk2 = this.majaKkA; kajakkk2 != null; kajakkk2 = kajakkk2.majaKka) {
            if (kajakkk2.MAjaKka.AMaJakk == 2 && kajakkk2.mAjaKka > mAjaKka && this.jAKKamA(kajakkk2, n, n2)) {
                kajakkk = kajakkk2;
                mAjaKka = kajakkk2.mAjaKka;
            }
        }
        return kajakkk;
    }
    
    synchronized boolean jAKKamA(final kajakkk kajakkk, final int x, final int y) {
        final Point point = new Point(x, y);
        if (this.mAJaKkA) {
            final Point point2 = point;
            point2.x *= 4;
            final Point point3 = point;
            point3.y *= 4;
        }
        final kajamma amaJakk = kajakkk.MAjaKka.AmaJakk;
        final kmjjmka kmjjmka = new kmjjmka();
        final byte[] kaMaJAK = amaJakk.KAMaJAK;
        final int aMaJakk = kajakkk.MAjaKka.aMaJakk;
        kmjjmka.KAMaJAK = kaMaJAK;
        kmjjmka.kAMaJAK = aMaJakk;
        while (true) {
            final int n = kmjjmka.KAMaJAK[kmjjmka.kAMaJAK++] & 0xFF;
            if (n == 0) {
                return false;
            }
            final int kAmAJak = kmjjmka.KAmAJak();
            final int n2 = kajakkk.mAjaKka + kmjjmka.KAmAJak();
            final kmaammk kaMAJak = kmjjmka.KaMAJak();
            final int mAjaKka = kAmAJak << 16 | n2;
            if ((n & 0x8) == 0x0) {
                continue;
            }
            final mmjakka amaJAkK = amaJakk.amaJAkK(kAmAJak);
            if (amaJAkK == null) {
                continue;
            }
            final kajakkk kajakkk2 = new kajakkk();
            kajakkk2.MajaKka = this;
            kajakkk2.MAjaKka = amaJAkK;
            kajakkk2.mAjaKka = mAjaKka;
            kajakkk2.MaJAKka = kmaammk.aKKaMaj(kaMAJak, kajakkk.MaJAKka);
            kajakkk2.maJAKka = kmaammk.aKKaMaj(kajakkk2.MaJAKka, this.MaJaKkA);
            kajakkk2.MAJAKka = kajakkk2.maJAKka.AKKaMaj(amaJAkK.AmAjAKk);
            if (kajakkk2.JaKkaMA(point)) {
                return true;
            }
        }
    }
    
    private final void jakKamA(final long n, final int n2, final int maJaKKA, final int n3) {
        if (this.MAJaKKA != maJaKKA) {
            if (this.mAJaKKA > 0) {
                final int maJaKKA2 = this.MAJaKKA;
                final long maJaKKA3 = this.maJaKKA;
                final int n4 = maJaKKA2;
                final long n5 = maJaKKA3 / 16L;
                this.JAKkamA(n4, ((int)(n5 >> 24) & 0xFF000000) | ((int)(n5 >> 16) & 0xFF0000) | ((int)(n5 >> 8) & 0xFF00) | ((int)n5 & 0xFF));
                this.maJaKKA = 0L;
                this.mAJaKKA = 0;
            }
            this.MAJaKKA = maJaKKA;
        }
        this.maJaKKA += n3 * n;
        this.mAJaKKA += n3 * n2;
    }
    
    private final void JAKkamA(final int n, final int n2) {
        if (this.MAJAKkA) {
            this.MAJakkA[n + this.maJakkA] = (byte)this.JaKKamA(n2);
            return;
        }
        this.mAJakkA[n + this.maJakkA] = n2;
    }
    
    private final void jAKKAmA(int jaKkAMa, int jakkAMa, final kaaammk kaaammk) {
        if (jaKkAMa < this.MAjAKkA.jAKkAMa) {
            jaKkAMa = this.MAjAKkA.jAKkAMa;
        }
        if (jakkAMa > this.MAjAKkA.jakkAMa) {
            jakkAMa = this.MAjAKkA.jakkAMa;
        }
        switch (kaaammk.ajakKam) {
            case 64:
            case 65:
            case 66: {
                ((kmjjkka)kaaammk.AJaKKam).AMajaKK(this.maJakkA, jaKkAMa, jakkAMa, kaaammk);
                return;
            }
            case 0: {
                int n = jaKkAMa + this.maJakkA;
                int n2 = jakkAMa - jaKkAMa;
                if (n + n2 > this.MaJakkA) {
                    return;
                }
                if (this.MAJAKkA) {
                    while (n2-- > 0) {
                        this.MAJakkA[n++] = kaaammk.AjAKKam;
                    }
                    return;
                }
                while (n2-- > 0) {
                    this.mAJakkA[n++] = kaaammk.AJAKKam;
                }
                return;
            }
            case 16: {
                final Point point = new Point(jaKkAMa << 8, this.majAkkA << 8);
                kaaammk.aJAKKam.akkAmAJ(point);
                final int n3 = kaaammk.aJAKKam.ajakkAM >> 8;
                final int n4 = kaaammk.aJAKKam.AJakkAM >> 8;
                for (int i = jaKkAMa; i < jakkAMa; ++i) {
                    int n5 = (point.x >> 15) + 128;
                    if (n5 > 256) {
                        n5 = 256;
                    }
                    else if (n5 < 0) {
                        n5 = 0;
                    }
                    this.JAKkamA(i, kaaammk.AjaKKam[n5]);
                    final Point point2 = point;
                    point2.x += n3;
                    final Point point3 = point;
                    point3.y += n4;
                }
                return;
            }
            case 18: {
                final Point point4 = new Point(jaKkAMa << 8, this.majAkkA << 8);
                kaaammk.aJAKKam.akkAmAJ(point4);
                final int n6 = kaaammk.aJAKKam.ajakkAM >> 8;
                final int n7 = kaaammk.aJAKKam.AJakkAM >> 8;
                int n8 = 0;
                int n9 = kmaammk.AKkAmAJ(point4.x, point4.y) >> 14;
                if (n9 > 256) {
                    n9 = 256;
                }
                for (int j = jaKkAMa; j < jakkAMa; ++j) {
                    final int n10 = point4.x >> 14;
                    final int n11 = n10 * n10;
                    final int n12 = point4.y >> 14;
                    final int n13 = n11 + n12 * n12;
                    final int n14 = n9;
                    n9 += n8;
                    if (n9 < 0) {
                        n9 = 0;
                    }
                    else if (n9 > 256) {
                        n9 = 256;
                    }
                    while (true) {
                        if (n13 < n9 * n9) {
                            --n9;
                        }
                        else {
                            if (n13 <= (n9 + 1) * (n9 + 1) || n9 >= 256) {
                                break;
                            }
                            ++n9;
                        }
                    }
                    n8 = n9 - n14;
                    this.JAKkamA(j, kaaammk.AjaKKam[n9]);
                    final Point point5 = point4;
                    point5.x += n6;
                    final Point point6 = point4;
                    point6.y += n7;
                }
            }
            default: {}
        }
    }
    
    private final void jaKkAMA(final int majakkA) {
        kaaammk majakkA2 = null;
        kaaammk kaaammk = null;
        for (kaaammk kaaammk2 = this.MAjakkA; kaaammk2 != null; kaaammk2 = kaaammk2.aJAkKam) {
            if (kaaammk2.AJakKam != 0) {
                if (majakkA2 == null || kaaammk2.AjakKam > majakkA2.AjakKam) {
                    majakkA2 = kaaammk2;
                }
                kaaammk = kaaammk2;
            }
            else {
                if (kaaammk != null) {
                    kaaammk.aJAkKam = kaaammk2.aJAkKam;
                }
                else {
                    this.MAjakkA = kaaammk2.aJAkKam;
                }
                kaaammk2.aJakKam = false;
            }
        }
        if (this.majakkA != majakkA2) {
            if (this.majakkA != null) {
                if (this.mAJaKkA) {
                    this.jAkKAmA(this.MajakkA, majakkA);
                }
                else {
                    this.jAKKAmA(this.MajakkA, majakkA, this.majakkA);
                }
            }
            this.majakkA = majakkA2;
            this.MajakkA = majakkA;
        }
    }
    
    private final void jAKkamA(final kaaammk mAjakkA, final int n) {
        if (this.majakkA != null) {
            if (mAjakkA.AjakKam > this.majakkA.AjakKam) {
                if (this.mAJaKkA) {
                    this.jAkKAmA(this.MajakkA, n);
                }
                else {
                    this.jAKKAmA(this.MajakkA, n, this.majakkA);
                }
                this.majakkA = mAjakkA;
                this.MajakkA = n;
            }
        }
        else {
            this.majakkA = mAjakkA;
            this.MajakkA = n;
        }
        if (!mAjakkA.aJakKam) {
            mAjakkA.aJakKam = true;
            mAjakkA.aJAkKam = this.MAjakkA;
            this.MAjakkA = mAjakkA;
        }
    }
    
    private final void jAkKAmA(final int n, final int n2) {
        maaammk mAjAkkA = this.mAjAkkA;
        if (mAjAkkA == null || mAjAkkA.ajaKkAM >= n2) {
            return;
        }
        while (mAjAkkA.AJaKkAM < n) {
            mAjAkkA = mAjAkkA.AjaKkAM;
            if (mAjAkkA == null) {
                this.mAjAkkA = null;
                return;
            }
        }
        if (mAjAkkA.ajaKkAM < n) {
            mAjAkkA = mAjAkkA.AKkaMaj(this, n);
        }
        while (mAjAkkA != null && mAjAkkA.ajaKkAM < n2) {
            if (mAjAkkA.AJaKkAM > n2) {
                this.mAjAkkA = mAjAkkA.AKkaMaj(this, n2);
                mAjAkkA.aKkaMaj(this.majakkA);
                return;
            }
            mAjAkkA.aKkaMaj(this.majakkA);
            mAjAkkA = mAjAkkA.AjaKkAM;
        }
        this.mAjAkkA = mAjAkkA;
    }
    
    private final void jaKkamA() {
        this.majAkkA = this.MajAkkA / 4;
        this.maJaKKA = 0L;
        this.mAJaKKA = 0;
        this.MAJaKKA = -32000;
        maaammk maaammk = this.MAjAkkA;
        while (true) {
            if (maaammk.AjAkKam > 0) {
                if (maaammk.AJAkKam && maaammk.AjAkKam == 4) {
                    while (true) {
                        final maaammk ajaKkAM = maaammk.AjaKkAM;
                        if (ajaKkAM == null || !ajaKkAM.AJAkKam || ajaKkAM.aJaKkAM[0] != maaammk.aJaKkAM[0] || ajaKkAM.AjAkKam < 4) {
                            break;
                        }
                        maaammk.AJaKkAM = ajaKkAM.AJaKkAM;
                        maaammk.AjaKkAM = ajaKkAM.AjaKkAM;
                    }
                }
                int n = maaammk.ajaKkAM / 4;
                final int n2 = maaammk.ajaKkAM & 0x3;
                final int n3 = maaammk.AJaKkAM / 4;
                final int n4 = maaammk.AJaKkAM & 0x3;
                long n5 = maaammk.akkaMaj(n, this.majAkkA);
                if (n == n3) {
                    this.jakKamA(n5, maaammk.AjAkKam, n, n4 - n2);
                }
                else {
                    if (n2 > 0) {
                        this.jakKamA(n5, maaammk.AjAkKam, n, 4 - n2);
                        ++n;
                    }
                    if (n < n3) {
                        if (maaammk.AJAkKam && maaammk.AjAkKam == 4) {
                            this.jAKKAmA(n, n3, maaammk.aJaKkAM[0]);
                        }
                        else if (maaammk.ajAkKam) {
                            final int n6 = 4 * maaammk.AjAkKam;
                            for (int i = n; i < n3; ++i) {
                                final long n7 = maaammk.akkaMaj(i, this.majAkkA) * 4L;
                                final int n8 = i;
                                final long n9 = n7 / 16L;
                                this.JAKkamA(n8, ((int)(n9 >> 24) & 0xFF000000) | ((int)(n9 >> 16) & 0xFF0000) | ((int)(n9 >> 8) & 0xFF00) | ((int)n9 & 0xFF));
                            }
                        }
                        else {
                            final long n10 = 4L * n5;
                            final int n11 = 4 * maaammk.AjAkKam;
                            for (int j = n; j < n3; ++j) {
                                final int n12 = j;
                                final long n13 = n10 / 16L;
                                this.JAKkamA(n12, ((int)(n13 >> 24) & 0xFF000000) | ((int)(n13 >> 16) & 0xFF0000) | ((int)(n13 >> 8) & 0xFF00) | ((int)n13 & 0xFF));
                            }
                        }
                    }
                    if (n4 > 0) {
                        if (maaammk.ajAkKam) {
                            n5 = maaammk.akkaMaj(n3, this.majAkkA);
                        }
                        this.jakKamA(n5, maaammk.AjAkKam, n3, n4);
                    }
                }
            }
            if (maaammk.AjaKkAM == null) {
                break;
            }
            maaammk = maaammk.AjaKkAM;
        }
        maaammk.AjaKkAM = this.MaJaKKA;
        this.MaJaKKA = this.MAjAkkA;
        this.MAjAkkA = null;
        if (this.mAJaKKA > 0) {
            final int maJaKKA = this.MAJaKKA;
            final long maJaKKA2 = this.maJaKKA;
            final int n14 = maJaKKA;
            final long n15 = maJaKKA2 / 16L;
            this.JAKkamA(n14, ((int)(n15 >> 24) & 0xFF000000) | ((int)(n15 >> 16) & 0xFF0000) | ((int)(n15 >> 8) & 0xFF00) | ((int)n15 & 0xFF));
            this.maJaKKA = 0L;
            this.mAJaKKA = 0;
        }
    }
    
    private final void JakKamA(maajkkk ajakkAm) {
        while (ajakkAm != null) {
            if (ajakkAm.AjAkKAm <= this.mAjAKkA.JAkkAMa && ajakkAm.AjakKAm > this.mAjAKkA.JakkAMa) {
                int n = ajakkAm.AjAkKAm - this.mAjAKkA.JakkAMa;
                if (n < 0) {
                    n = 0;
                }
                ajakkAm.ajakkAm = this.MAJAkkA[n];
                this.MAJAkkA[n] = ajakkAm;
            }
            ajakkAm = ajakkAm.AjakkAm;
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
            }
            else {
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
            for (maajkkk ajakkAm = this.MAJAkkA[this.MajAkkA - this.mAjAKkA.JakkAMa]; ajakkAm != null; ajakkAm = ajakkAm.ajakkAm) {
                ajakkAm.jaKKAmA(this.MajAkkA);
                if (this.MaJAkkA == this.maJAkkA) {
                    this.maJAkkA *= 2;
                    final maajkkk[] mAjakkA = new maajkkk[this.maJAkkA];
                    System.arraycopy(this.mAjakkA, 0, mAjakkA, 0, this.MaJAkkA);
                    this.mAjakkA = mAjakkA;
                }
                int maJAkkA;
                for (maJAkkA = this.MaJAkkA; maJAkkA != 0 && this.mAjakkA[maJAkkA - 1].AjaKkAm >= ajakkAm.AjaKkAm; --maJAkkA) {
                    this.mAjakkA[maJAkkA] = this.mAjakkA[maJAkkA - 1];
                }
                this.mAjakkA[maJAkkA] = ajakkAm;
                ++this.MaJAkkA;
            }
            int n = this.MaJAkkA - 1;
            int n2;
            do {
                n2 = 0;
                for (int i = 0; i < n; ++i) {
                    if (this.mAjakkA[i].AjaKkAm > this.mAjakkA[i + 1].AjaKkAm) {
                        final maajkkk maajkkk = this.mAjakkA[i];
                        this.mAjakkA[i] = this.mAjakkA[i + 1];
                        this.mAjakkA[i + 1] = maajkkk;
                        if (n2 == 0 && i > 0 && this.mAjakkA[i - 1].AjaKkAm > this.mAjakkA[i].AjaKkAm) {
                            n2 = 1;
                        }
                    }
                }
                --n;
            } while (n2 != 0 && n > 0);
            if (this.mAJaKkA) {
                if (this.MAjAkkA == null) {
                    if (this.MaJaKKA != null) {
                        this.MAjAkkA = this.MaJaKKA;
                        this.MaJaKKA = this.MAjAkkA.AjaKkAM;
                        this.MAjAkkA.AjaKkAM = null;
                        this.MAjAkkA.AjAkKam = 0;
                        this.MAjAkkA.ajAkKam = false;
                        this.MAjAkkA.AJAkKam = true;
                    }
                    else {
                        this.MAjAkkA = new maaammk();
                    }
                    this.MAjAkkA.ajaKkAM = this.mAjAKkA.jAKkAMa;
                    this.MAjAkkA.AJaKkAM = this.mAjAKkA.jakkAMa;
                }
                this.mAjAkkA = this.MAjAkkA;
            }
            else {
                this.majAkkA = this.MajAkkA;
            }
            int maJAkkA2 = 0;
            final int n3 = this.MajAkkA + 1;
            for (int j = 0; j < this.MaJAkkA; ++j) {
                final maajkkk maajkkk2 = this.mAjakkA[j];
                switch (maajkkk2.AJAkkAm) {
                    case 0: {
                        final kaaammk aJakkAm = maajkkk2.AJakkAm;
                        if (aJakkAm.AJakKam != 0) {
                            aJakkAm.AJakKam = 0;
                            final int ajaKkAm = maajkkk2.AjaKkAm;
                            if (aJakkAm == this.majakkA) {
                                this.jaKkAMA(ajaKkAm);
                            }
                        }
                        else {
                            aJakkAm.AJakKam = 1;
                            this.jAKkamA(aJakkAm, maajkkk2.AjaKkAm);
                        }
                        final kaaammk aJakkAm2 = maajkkk2.aJakkAm;
                        if (aJakkAm2.AJakKam == 0) {
                            aJakkAm2.AJakKam = 1;
                            this.jAKkamA(aJakkAm2, maajkkk2.AjaKkAm);
                            break;
                        }
                        aJakkAm2.AJakKam = 0;
                        final int ajaKkAm2 = maajkkk2.AjaKkAm;
                        if (aJakkAm2 == this.majakkA) {
                            this.jaKkAMA(ajaKkAm2);
                            break;
                        }
                        break;
                    }
                    case 1: {
                        final kaaammk aJakkAm3 = maajkkk2.AJakkAm;
                        if (aJakkAm3.AJakKam == 0) {
                            aJakkAm3.AJakKam = 1;
                            this.jAKkamA(aJakkAm3, maajkkk2.AjaKkAm);
                            break;
                        }
                        aJakkAm3.AJakKam = 0;
                        final int ajaKkAm3 = maajkkk2.AjaKkAm;
                        if (aJakkAm3 == this.majakkA) {
                            this.jaKkAMA(ajaKkAm3);
                            break;
                        }
                        break;
                    }
                    case 2: {
                        final kaaammk aJakkAm4 = maajkkk2.AJakkAm;
                        if (aJakkAm4.AJakKam == 0) {
                            final kaaammk kaaammk = aJakkAm4;
                            kaaammk.AJakKam += maajkkk2.aJAkkAm;
                            this.jAKkamA(aJakkAm4, maajkkk2.AjaKkAm);
                            break;
                        }
                        final kaaammk kaaammk2 = aJakkAm4;
                        kaaammk2.AJakKam += maajkkk2.aJAkkAm;
                        if (aJakkAm4.AJakKam != 0) {
                            break;
                        }
                        final int ajaKkAm4 = maajkkk2.AjaKkAm;
                        if (aJakkAm4 == this.majakkA) {
                            this.jaKkAMA(ajaKkAm4);
                            break;
                        }
                        break;
                    }
                }
                if (maajkkk2.AjakKAm > n3) {
                    maajkkk2.JaKKAmA(n3);
                    this.mAjakkA[maJAkkA2] = maajkkk2;
                    ++maJAkkA2;
                }
            }
            this.MaJAkkA = maJAkkA2;
            if (this.mAJaKkA) {
                if ((this.MajAkkA & 0x3) == 0x3) {
                    this.jaKkamA();
                    if (this.MAjAKKA == null) {
                        return;
                    }
                    this.JAkKAmA();
                }
            }
            else {
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
    
    final int jaKKamA(final int n) {
        return this.maJAKKA[n];
    }
    
    final int JaKKamA(final int n) {
        return this.MAJAKKA[(n & 0xF00000) >> 12 | (n & 0xF000) >> 8 | (n & 0xF0) >> 4] & 0xFF;
    }
    
    private final int JAKkAMA(final int n, final int n2) {
        final int n3 = n - n2;
        if (n3 < 0) {
            return -n3;
        }
        return n3;
    }
    
    private final void jAKKAMA(final int n, final int n2, final int n3) {
        final int n4 = n >> 16 & 0xFF;
        final int n5 = n >> 8 & 0xFF;
        final int n6 = n & 0xFF;
        final int n7 = n4 >> 4;
        final int n8 = n5 >> 4;
        final int n9 = n6 >> 4;
        final int max = Math.max(0, n7 - n3);
        final int min = Math.min(15, n7 + n3);
        final int max2 = Math.max(0, n8 - n3);
        final int min2 = Math.min(15, n8 + n3);
        final int max3 = Math.max(0, n9 - n3);
        final int min3 = Math.min(15, n9 + n3);
        for (int i = max; i <= min; ++i) {
            final int n10 = (i == 15) ? 255 : (i << 4);
            for (int j = max2; j <= min2; ++j) {
                final int n11 = this.JAKkAMA(n10, n4) + this.JAKkAMA((j == 15) ? 255 : (j << 4), n5);
                final int n12 = i << 8 | j << 4;
                for (int k = max3; k <= min3; ++k) {
                    final int n13 = (k == 15) ? 255 : (k << 4);
                    final int n14 = n12 | k;
                    final int n15 = n11 + this.JAKkAMA(n13, n6);
                    if (n15 < this.MajAKKA[n14]) {
                        if (this.MajAKKA[n14] == 50000) {
                            --this.mAJAKKA;
                        }
                        this.MajAKKA[n14] = n15;
                        this.MAJAKKA[n14] = (byte)n2;
                    }
                }
            }
        }
    }
    
    private final void JAKKAmA() {
        if (this.MAJAKKA == null || this.MajAKKA == null) {
            this.MAJAKKA = new byte[4096];
            this.MajAKKA = new int[4096];
        }
        for (int i = 0; i < 4096; ++i) {
            this.MajAKKA[i] = 50000;
        }
        this.mAJAKKA = 4096;
        for (int n = 3; n < 16 && this.mAJAKKA > 0; ++n) {
            for (int j = 0; j < this.MaJAKKA; ++j) {
                this.jAKKAMA(this.maJAKKA[j], j, n);
            }
        }
        this.MajAKKA = null;
    }
    
    synchronized boolean jakkAMA(final int n, final int n2) {
        if (n != this.MajAKkA || n2 != this.majAKkA) {
            this.jAkkamA(n, n2, this.mAJAKkA);
            return true;
        }
        return false;
    }
    
    synchronized void jAkkamA(final int majAKkA, final int majAKkA2, final ColorModel majaKkA) {
        this.mAJAKkA = majaKkA;
        this.MajAKkA = majAKkA;
        this.majAKkA = majAKkA2;
        this.JAkkamA();
        if (!(this.mAJAKkA instanceof IndexColorModel)) {
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
            return;
        }
        final IndexColorModel indexColorModel = (IndexColorModel)this.mAJAKkA;
        this.MaJAKKA = indexColorModel.getMapSize();
        final byte[] r = new byte[this.MaJAKKA];
        final byte[] g = new byte[this.MaJAKKA];
        final byte[] b = new byte[this.MaJAKKA];
        indexColorModel.getReds(r);
        indexColorModel.getGreens(g);
        indexColorModel.getBlues(b);
        this.maJAKKA = new int[this.MaJAKKA];
        int n = 0;
        for (int i = 0; i < this.MaJAKKA; ++i) {
            this.maJAKKA[i] = (0xFF000000 | (r[i] & 0xFF) << 16 | (g[i] & 0xFF) << 8 | (b[i] & 0xFF));
            if (this.maJAKKA[i] == -1) {
                ++n;
            }
        }
        if (n > 100) {
            this.majAKKA = true;
            this.jAkkamA(majAKkA, majAKkA2, ColorModel.getRGBdefault());
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
    }
    
    boolean JAkKamA() {
        if (this.MajaKkA.jAKkAMa != Integer.MIN_VALUE && !false) {
            this.JAKKAMA(true);
            return true;
        }
        return false;
    }
    
    synchronized void jaKKAMA(final kajamma kajamma, final int n) {
        kajamma.mAJAKKa = false;
        ((kajakmk)kajamma.MaJAKKa).stop();
        kajamma.majAKKa = false;
        kajamma.MAjaKKa = 0;
        kajamma.amAJAkK(n - 1);
        kajamma.majAKKa = true;
        kajamma.MAjaKKa = 0;
        kajamma.amAJAkK(n);
    }
    
    synchronized int JaKKAMA(final kajamma kajamma, final int n) {
        return kajamma.amAJAkK(n);
    }
    
    public synchronized void addConsumer(final ImageConsumer mAjAKKA) {
        if (mAjAKKA != this.MAjAKKA) {
            this.MAjAKKA = mAjAKKA;
            this.mAjAKKA = true;
        }
    }
    
    public boolean isConsumer(final ImageConsumer imageConsumer) {
        return this.MAjAKKA == imageConsumer;
    }
    
    public synchronized void removeConsumer(final ImageConsumer imageConsumer) {
        if (this.MAjAKKA == imageConsumer) {
            this.MAjAKKA = null;
        }
    }
    
    public void startProduction(final ImageConsumer imageConsumer) {
        this.addConsumer(imageConsumer);
        this.JAKKAMA(false);
    }
    
    public void requestTopDownLeftRightResend(final ImageConsumer imageConsumer) {
    }
    
    private synchronized void JAKKAMA(final boolean b) {
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
        if (!b) {
            this.MAjAKkA = new kaajmmk(0, 0, this.MajAKkA, this.majAKkA);
        }
        else {
            this.MAjAKkA = new kaajmmk(this.MajaKkA);
            if (this.mAJaKkA) {
                final kaajmmk mAjAKkA = this.MAjAKkA;
                mAjAKkA.jAKkAMa /= 4;
                final kaajmmk mAjAKkA2 = this.MAjAKkA;
                mAjAKkA2.JakkAMa /= 4;
                final kaajmmk mAjAKkA3 = this.MAjAKkA;
                mAjAKkA3.jakkAMa /= 4;
                final kaajmmk mAjAKkA4 = this.MAjAKkA;
                mAjAKkA4.JAkkAMa /= 4;
            }
            final kaajmmk mAjAKkA5 = this.MAjAKkA;
            mAjAKkA5.jAKkAMa -= 2;
            final kaajmmk mAjAKkA6 = this.MAjAKkA;
            mAjAKkA6.jakkAMa += 2;
            final kaajmmk mAjAKkA7 = this.MAjAKkA;
            mAjAKkA7.JakkAMa -= 2;
            final kaajmmk mAjAKkA8 = this.MAjAKkA;
            mAjAKkA8.JAkkAMa += 2;
            this.MAjAKkA.jAKkAMa = Math.max(this.MAjAKkA.jAKkAMa, 0);
            this.MAjAKkA.jakkAMa = Math.min(this.MAjAKkA.jakkAMa, this.MajAKkA);
            this.MAjAKkA.JakkAMa = Math.max(this.MAjAKkA.JakkAMa, 0);
            this.MAjAKkA.JAkkAMa = Math.min(this.MAjAKkA.JAkkAMa, this.majAKkA);
            if (this.MAjAKkA.jAKkAMa >= this.MAjAKkA.jakkAMa || this.MAjAKkA.JakkAMa >= this.MAjAKkA.JAkkAMa) {
                final kaajmmk mAjAKkA9;
                final kaajmmk kaajmmk2;
                final kaajmmk kaajmmk = kaajmmk2 = (mAjAKkA9 = this.MAjAKkA);
                final int n = Integer.MIN_VALUE;
                kaajmmk.JAkkAMa = n;
                kaajmmk.JakkAMa = n;
                kaajmmk2.jakkAMa = n;
                mAjAKkA9.jAKkAMa = n;
            }
        }
        final kaajmmk majaKkA;
        final kaajmmk kaajmmk4;
        final kaajmmk kaajmmk3 = kaajmmk4 = (majaKkA = this.MajaKkA);
        final int n2 = Integer.MIN_VALUE;
        kaajmmk3.JAkkAMa = n2;
        kaajmmk3.JakkAMa = n2;
        kaajmmk4.jakkAMa = n2;
        majaKkA.jAKkAMa = n2;
        if (this.MAjAKkA.jAKkAMa != Integer.MIN_VALUE && !false) {
            if (this.majAKKA) {
                this.MAjAKkA.jAKkAMa = 0;
                this.MAjAKkA.jakkAMa = this.MajAKkA;
            }
            if (this.mAJaKkA) {
                this.mAjAKkA = new kaajmmk(this.MAjAKkA);
                final kaajmmk mAjAKkA10 = this.mAjAKkA;
                mAjAKkA10.jAKkAMa *= 4;
                final kaajmmk mAjAKkA11 = this.mAjAKkA;
                mAjAKkA11.jakkAMa *= 4;
                final kaajmmk mAjAKkA12 = this.mAjAKkA;
                mAjAKkA12.JakkAMa *= 4;
                final kaajmmk mAjAKkA13 = this.mAjAKkA;
                mAjAKkA13.JAkkAMa *= 4;
            }
            else {
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
            for (kajakkk kajakkk = this.majaKkA; kajakkk != null; kajakkk = kajakkk.majaKka) {
                if (kajakkk.MAJAKka.aKKaMAJ(this.mAjAKkA)) {
                    kajakkk.jaKkaMA();
                    kajakkk.mAJAKka = true;
                    this.JakKamA(kajakkk.majAKka);
                }
            }
            if (this.maJaKkA != 0) {
                final maajkkk maajkkk = new maajkkk();
                final maajkkk ajakkAm = new maajkkk();
                final kaaammk kaaammk = new kaaammk(this, this.maJaKkA);
                kaaammk.AjakKam = 0;
                maajkkk.AjakkAm = ajakkAm;
                final Point point = new Point(this.mAjAKkA.jAKkAMa, this.mAjAKkA.JakkAMa);
                final Point point2 = new Point(this.mAjAKkA.jAKkAMa, this.mAjAKkA.JAkkAMa);
                maajkkk.aKkAmaj(point, point2);
                final Point point3 = point;
                final Point point4 = point2;
                final int jakkAMa = this.mAjAKkA.jakkAMa;
                point4.x = jakkAMa;
                point3.x = jakkAMa;
                ajakkAm.aKkAmaj(point, point2);
                final maajkkk maajkkk2 = maajkkk;
                final maajkkk maajkkk3 = ajakkAm;
                final int n3 = 1;
                maajkkk3.AJAkkAm = n3;
                maajkkk2.AJAkkAm = n3;
                final maajkkk maajkkk4 = maajkkk;
                final maajkkk maajkkk5 = ajakkAm;
                final kaaammk kaaammk2 = kaaammk;
                maajkkk5.AJakkAm = kaaammk2;
                maajkkk4.AJakkAm = kaaammk2;
                this.JakKamA(maajkkk);
            }
            this.JakKAmA();
            this.MAjAKKA.imageComplete(2);
            this.MAjaKkA.aMAJaKk(true, this.MAjAKkA.jAKkAMa, this.MAjAKkA.JakkAMa, this.MAjAKkA.jakkAMa - this.MAjAKkA.jAKkAMa + 1, this.MAjAKkA.JAkkAMa - this.MAjAKkA.JakkAMa + 1);
        }
    }
}
