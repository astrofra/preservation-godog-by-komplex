import java.awt.Point;

// 
// Decompiled by Procyon v0.6.0
// 

final class MovieShapeDecoder extends MovieBitReader
{
    MovieRasterizer JaKKaMA;
    MovieTimeline jaKKaMA;
    MovieColorTransform JAKKaMA;
    MovieTransform jAKKaMA;
    int JakKaMA;
    int jakKaMA;
    int JAkKaMA;
    MovieFillStyle[] jAkKaMA;
    MovieFillStyle[] JaKkAma;
    int[] jaKkAma;
    int JAKkAma;
    int jAKkAma;
    int JakkAma;
    int jakkAma;
    int JAkkAma;
    Point jAkkAma;
    Point JaKKAma;
    Point jaKKAma;
    Point JAKKAma;
    final int jAKKAma = 1;
    final int JakKAma = 2;
    final int jakKAma = 4;
    final int JAkKAma = 8;
    final int jAkKAma = 16;
    final int JaKkama = 128;
    boolean jaKkama;
    int JAKkama;
    MovieDisplayObject jAKkama;
    int Jakkama;
    MovieFillStyle jakkama;
    MovieFillStyle JAkkama;
    MovieFillStyle jAkkama;
    boolean JaKKama;
    int jaKKama;
    boolean JAKKama;
    int jAKKama;
    Point JakKama;
    Point jakKama;
    Point JAkKama;
    Point jAkKama;
    Point JaKkAMa;
    Point jaKkAMa;
    Point JAKkAMa;
    
    MovieShapeDecoder(final MovieTimeline jaKKaMA, final int kaMaJAK, final MovieTransform jakKaMA, final MovieColorTransform jakKaMA2) {
        this.jAkkAma = new Point(0, 0);
        this.JaKKAma = new Point(0, 0);
        this.jaKKAma = new Point(0, 0);
        this.JAKKAma = new Point(0, 0);
        this.jaKkama = false;
        this.JakKama = new Point(0, 0);
        this.jakKama = new Point(0, 0);
        this.JAkKama = new Point(0, 0);
        this.jAkKama = new Point(0, 0);
        this.JaKkAMa = new Point(0, 0);
        this.jaKkAMa = new Point(0, 0);
        this.JAKkAMa = new Point(0, 0);
        this.jAKKaMA = jakKaMA;
        this.JAKKaMA = jakKaMA2;
        this.JakKaMA = 0;
        final int n = 0;
        this.JAkKaMA = n;
        this.jakKaMA = n;
        final int jakkAma = 0;
        this.JAkkAma = jakkAma;
        this.jakkAma = jakkAma;
        this.JakkAma = jakkAma;
        final Point jAkkAma = this.jAkkAma;
        final Point jAkkAma2 = this.jAkkAma;
        final int n2 = 0;
        jAkkAma2.y = n2;
        jAkkAma.x = n2;
        this.jAKKaMA.akKaMaj(this.jAkkAma, this.JaKKAma);
        this.jaKKaMA = jaKKaMA;
        this.JaKKaMA = jaKKaMA.mAJaKKa;
        super.KAMaJAK = this.jaKKaMA.KAMaJAK;
        super.kAMaJAK = kaMaJAK;
    }
    
    private void akKamaJ(final MovieFillStyle kaaammk) {
        if (kaaammk.AjAkkam) {
            return;
        }
        switch (kaaammk.ajakKam) {
            case 64:
            case 65:
            case 66: {
                if (kaaammk.AJaKKam == null) {
                    kaaammk.ajakKam = 0;
                    return;
                }
                kaaammk.AJAkkam = true;
                kaaammk.aJAkkam = kaaammk.ajaKKam.ajakkAM;
                kaaammk.Ajakkam = kaaammk.ajaKKam.AJakkAM;
                if (this.JAKKaMA != null) {
                    this.JAKKaMA.kkamAJA();
                    kaaammk.aJaKKam = this.JAKKaMA;
                    kaaammk.AJAkkam = false;
                    return;
                }
                break;
            }
        }
    }
    
    boolean akKAmaJ() {
        this.JAkKaMA = (super.KAMaJAK[super.kAMaJAK++] & 0xFF);
        if (this.JAkKaMA == 255) {
            this.JAkKaMA = this.KAmAJak();
        }
        if ((this.jAkKaMA = new MovieFillStyle[this.JAkKaMA + 1]) == null) {
            return false;
        }
        for (int i = 1; i <= this.JAkKaMA; ++i) {
            final int ajakKam = super.KAMaJAK[super.kAMaJAK++] & 0xFF;
            MovieFillStyle kaaammk;
            if ((ajakKam & 0x10) != 0x0) {
                final MovieTransform kaMAJak = this.KaMAJak();
                final int n = super.KAMaJAK[super.kAMaJAK++] & 0xFF;
                final int[] array = new int[n];
                final int[] array2 = new int[n];
                for (int j = 0; j < n; ++j) {
                    array2[j] = (super.KAMaJAK[super.kAMaJAK++] & 0xFF);
                    array[j] = this.KAMAJak();
                }
                kaaammk = new MovieFillStyle(this.JaKKaMA, ajakKam, n, array, array2, kaMAJak, this.jAKKaMA);
                if (this.JAKKaMA != null) {
                    this.JAKKaMA.kkAmAJA(kaaammk);
                }
            }
            else if ((ajakKam & 0x40) != 0x0) {
                final int kAmAJak = this.KAmAJak();
                final MovieTransform kaMAJak2 = this.KaMAJak();
                kaaammk = new MovieFillStyle(this.JaKKaMA, -65281);
                final MovieCharacter amaJAkK = this.jaKKaMA.amaJAkK(kAmAJak);
                if (amaJAkK != null && amaJAkK.AMaJakk == 1) {
                    if (amaJAkK.aMAjAKk != null && amaJAkK.aMAjAKk instanceof MovieBitmap) {
                        kaaammk.AJaKKam = amaJAkK.aMAjAKk;
                        kaaammk.ajakKam = ajakKam;
                        if (this.JaKKaMA.mAJAKkA != null) {
                            MovieTransform akKaMaj;
                            if (this.JaKKaMA.mAJaKkA) {
                                final MovieTransform kmaammk = new MovieTransform();
                                kmaammk.aKKAmAJ(16384, 16384);
                                akKaMaj = kmaammk.aKKaMaj(this.jAKKaMA, kmaammk);
                            }
                            else {
                                akKaMaj = new MovieTransform(this.jAKKaMA);
                            }
                            final MovieTransform kmaammk2 = kaMAJak2;
                            kmaammk2.ajAKkAM <<= 16;
                            final MovieTransform kmaammk3 = kaMAJak2;
                            kmaammk3.AJAKkAM <<= 16;
                            final MovieTransform kmaammk4 = akKaMaj;
                            kmaammk4.ajAKkAM <<= 16;
                            final MovieTransform kmaammk5 = akKaMaj;
                            kmaammk5.AJAKkAM <<= 16;
                            kaaammk.ajaKKam = MovieTransform.aKKaMaj(kaMAJak2, akKaMaj).AkkaMaj();
                            this.akKamaJ(kaaammk);
                        }
                    }
                }
                else {
                    kaaammk = new MovieFillStyle(this.JaKKaMA, -65536);
                }
            }
            else {
                kaaammk = new MovieFillStyle(this.JaKKaMA, this.KAMAJak());
                if (this.JAKKaMA != null) {
                    this.JAKKaMA.kKAmAJA(kaaammk);
                }
            }
            this.jAkKaMA[i] = kaaammk;
            kaaammk.AjakKam = this.JakKaMA + i;
        }
        this.jakKaMA = (super.KAMaJAK[super.kAMaJAK++] & 0xFF);
        if (this.jakKaMA == 255) {
            this.jakKaMA = this.KAmAJak();
        }
        this.JaKkAma = new MovieFillStyle[this.jakKaMA + 1];
        this.jaKkAma = new int[this.jakKaMA + 1];
        if (this.JaKkAma == null || this.jaKkAma == null) {
            this.JaKkAma = null;
            this.jaKkAma = null;
            return false;
        }
        for (int k = 1; k <= this.jakKaMA; ++k) {
            this.jaKkAma[k] = this.jAKKaMA.AKKAmAJ(this.KAmAJak());
            final MovieFillStyle kaaammk2 = new MovieFillStyle(this.JaKKaMA, this.KAMAJak());
            if (this.JAKKaMA != null) {
                this.JAKKaMA.kKAmAJA(kaaammk2);
            }
            this.JaKkAma[k] = kaaammk2;
            kaaammk2.AjakKam = (this.JakKaMA | k + this.JAkKaMA);
        }
        super.KAmaJAK = 0;
        super.kamaJAK = 0;
        this.JAKkAma = this.kAmaJak(4);
        this.jAKkAma = this.kAmaJak(4);
        return true;
    }
    
    int akkamaJ(final QuadraticEdge majjkkk) {
        if (this.kAmaJak(1) != 0) {
            majjkkk.ajakKAm = (this.kAmaJak(1) != 0);
            if (majjkkk.ajakKAm) {
                final int n = this.kAmaJak(4) + 2;
                if (this.kAmaJak(1) != 0) {
                    final Point jAkkAma = this.jAkkAma;
                    jAkkAma.x += this.KAmaJak(n);
                    final Point jAkkAma2 = this.jAkkAma;
                    jAkkAma2.y += this.KAmaJak(n);
                }
                else if (this.kAmaJak(1) != 0) {
                    final Point jAkkAma3 = this.jAkkAma;
                    jAkkAma3.y += this.KAmaJak(n);
                }
                else {
                    final Point jAkkAma4 = this.jAkkAma;
                    jAkkAma4.x += this.KAmaJak(n);
                }
                this.jAKKaMA.akKaMaj(this.jAkkAma, this.JAKKAma);
                majjkkk.aKkAmaj(this.JaKKAma, this.JAKKAma);
            }
            else {
                final int n2 = this.kAmaJak(4) + 2;
                final Point jAkkAma5 = this.jAkkAma;
                jAkkAma5.x += this.KAmaJak(n2);
                final Point jAkkAma6 = this.jAkkAma;
                jAkkAma6.y += this.KAmaJak(n2);
                this.jAKKaMA.akKaMaj(this.jAkkAma, this.jaKKAma);
                final Point jAkkAma7 = this.jAkkAma;
                jAkkAma7.x += this.KAmaJak(n2);
                final Point jAkkAma8 = this.jAkkAma;
                jAkkAma8.y += this.KAmaJak(n2);
                this.jAKKaMA.akKaMaj(this.jAkkAma, this.JAKKAma);
                majjkkk.aKKaMAj(this.JaKKAma, this.jaKKAma, this.JAKKAma);
            }
            this.JaKKAma.x = this.JAKKAma.x;
            this.JaKKAma.y = this.JAKKAma.y;
            return 0;
        }
        final int kAmaJak = this.kAmaJak(5);
        if (kAmaJak == 0) {
            return 128;
        }
        if ((kAmaJak & 0x1) != 0x0) {
            final int kAmaJak2 = this.kAmaJak(5);
            this.jAkkAma.x = this.KAmaJak(kAmaJak2);
            this.jAkkAma.y = this.KAmaJak(kAmaJak2);
            this.jAKKaMA.akKaMaj(this.jAkkAma, this.JaKKAma);
        }
        if ((kAmaJak & 0x2) != 0x0) {
            this.jakkAma = this.kAmaJak(this.JAKkAma);
        }
        if ((kAmaJak & 0x4) != 0x0) {
            this.JAkkAma = this.kAmaJak(this.JAKkAma);
        }
        if ((kAmaJak & 0x8) != 0x0) {
            this.JakkAma = this.kAmaJak(this.jAKkAma);
        }
        if ((kAmaJak & 0x10) != 0x0) {
            this.JakKaMA += this.JAkKaMA + this.jakKaMA;
            this.akKAmaJ();
        }
        return kAmaJak;
    }
    
    void AkKAmaJ(final QuadraticEdge majjkkk, final boolean b) {
        final MovieScanlineEdge majAKka = new MovieScanlineEdge();
        if (majjkkk.AjAkKAm <= majjkkk.AjakKAm) {
            majAKka.aJaKkam = majjkkk.aJaKkam;
            majAKka.AjAkKAm = majjkkk.AjAkKAm;
            majAKka.aJAkKAm = majjkkk.aJAkKAm;
            majAKka.AjakKAm = majjkkk.AjakKAm;
            majAKka.aJAkkAm = 1;
        }
        else {
            majAKka.aJaKkam = majjkkk.aJAkKAm;
            majAKka.AjAkKAm = majjkkk.AjakKAm;
            majAKka.aJAkKAm = majjkkk.aJaKkam;
            majAKka.AjakKAm = majjkkk.AjAkKAm;
            majAKka.aJAkkAm = -1;
        }
        majAKka.ajakKAm = majjkkk.ajakKAm;
        majAKka.ajAkKAm = majjkkk.ajAkKAm;
        majAKka.AJAkKAm = majjkkk.AJAkKAm;
        if (!majAKka.ajakKAm) {
            if (majAKka.AJAkKAm < majAKka.AjAkKAm || majAKka.AJAkKAm > majAKka.AjakKAm) {
                if (majAKka.AJAkKAm < majAKka.AjAkKAm && majAKka.AjAkKAm - majAKka.AJAkKAm < 3) {
                    majAKka.AJAkKAm = majAKka.AjAkKAm;
                }
                else if (majjkkk.AJAkKAm > majAKka.AjakKAm && majjkkk.AJAkKAm - majAKka.AjakKAm < 3) {
                    majAKka.AJAkKAm = majAKka.AjakKAm;
                }
                else {
                    final int n = majjkkk.AjAkKAm - 2 * majjkkk.AJAkKAm + majjkkk.AjakKAm;
                    final int n2 = majjkkk.AjAkKAm - majjkkk.AJAkKAm;
                    if (++this.JAKkama > 16) {
                        return;
                    }
                    final QuadraticEdge majjkkk2 = new QuadraticEdge(majjkkk);
                    final QuadraticEdge akKaMAj = majjkkk2.AKKaMAj((n != 0) ? ((int)(((long)n2 << 16) / n)) : Integer.MAX_VALUE);
                    this.AkKAmaJ(majjkkk2, b);
                    this.AkKAmaJ(akKaMAj, b);
                    --this.JAKkama;
                    return;
                }
            }
            if (majAKka.AjakKAm - majAKka.AjAkKAm > 256) {
                if (++this.JAKkama > 16) {
                    return;
                }
                final QuadraticEdge majjkkk3 = new QuadraticEdge(majjkkk);
                final QuadraticEdge akKaMAj2 = majjkkk3.AKKaMAj(32768);
                this.AkKAmaJ(majjkkk3, b);
                this.AkKAmaJ(akKaMAj2, b);
                --this.JAKkama;
                return;
            }
        }
        if (majAKka.AjAkKAm == majAKka.AjakKAm) {
            return;
        }
        if (b) {
            majAKka.AJAkkAm = 2;
            majAKka.AJakkAm = this.jAkkama;
        }
        else {
            majAKka.AJAkkAm = this.Jakkama;
            majAKka.AJakkAm = this.jakkama;
            majAKka.aJakkAm = this.JAkkama;
        }
        majAKka.AjakkAm = this.jAKkama.majAKka;
        this.jAKkama.majAKka = majAKka;
    }
    
    void AKkamaJ(final boolean b) {
        this.JAKkama = 0;
        this.JakKaMA = this.jAKkama.mAjaKka << 16;
        if (b) {
            if (!this.akKAmaJ()) {
                return;
            }
        }
        else {
            super.KAmaJAK = 0;
            super.kamaJAK = 0;
            this.JAKkAma = this.kAmaJak(4);
            this.jAKkAma = this.kAmaJak(4);
        }
        int n = 0;
        int n2 = 0;
        final QuadraticEdge majjkkk = new QuadraticEdge();
        final MovieFillStyle kaaammk = null;
        this.JAkkama = kaaammk;
        this.jakkama = kaaammk;
        while (true) {
            final int akkamaJ = this.akkamaJ(majjkkk);
            if (akkamaJ != 0) {
                if (akkamaJ == 128) {
                    break;
                }
                if ((akkamaJ & 0x6) != 0x0) {
                    this.jakkama = this.jAkKaMA[this.jakkAma];
                    this.JAkkama = this.jAkKaMA[this.JAkkAma];
                    if (this.jakkama == null && this.JAkkama != null) {
                        this.jakkama = this.JAkkama;
                        this.JAkkama = null;
                    }
                    this.Jakkama = ((this.JAkkama != null) ? 0 : (this.jaKkama ? 2 : 1));
                    n = ((this.jakkama != null) ? 1 : 0);
                }
                if ((akkamaJ & 0x9) == 0x0) {
                    continue;
                }
                if (n2 != 0) {
                    this.AKKAmaJ();
                }
                if (this.JakkAma != 0) {
                    this.aKKamaJ(this.jaKkAma[this.JakkAma], this.JaKkAma[this.JakkAma]);
                    n2 = 1;
                }
                else {
                    n2 = 0;
                }
            }
            else {
                if (n2 != 0) {
                    this.aKKAmaJ(majjkkk);
                }
                if (n == 0) {
                    continue;
                }
                this.AkKAmaJ(majjkkk, false);
            }
        }
        if (n2 != 0) {
            this.AKKAmaJ();
        }
    }
    
    final void aKkamaJ(final Point point, final Point point2) {
        if (point.y == point2.y) {
            return;
        }
        final MovieScanlineEdge majAKka = new MovieScanlineEdge();
        if (point.y > point2.y) {
            majAKka.aJAkkAm = -1;
            majAKka.aKkAmaj(point2, point);
        }
        else {
            majAKka.aJAkkAm = 1;
            majAKka.aKkAmaj(point, point2);
        }
        majAKka.AJAkkAm = 2;
        majAKka.AJakkAm = this.jAkkama;
        majAKka.AjakkAm = this.jAKkama.majAKka;
        this.jAKkama.majAKka = majAKka;
    }
    
    final void AkkamaJ(final Point point, final Point point2, final Point point3) {
        if (MovieTransform.aKkAmAJ(point.x - point2.x, point.y - point2.y) > 3) {
            double atan2;
            double atan3;
            for (atan2 = Math.atan2(point.y - point3.y, point.x - point3.x), atan3 = Math.atan2(point2.y - point3.y, point2.x - point3.x); atan2 < atan3; atan2 += 6.283185307179586) {}
            final double n = atan2 - atan3;
            if (n > 0.1 && n <= 3.141592653589793) {
                final double n2 = (double)(this.jaKKama / 2);
                int n3 = (int)(n2 * n) / 3;
                final Point point4 = new Point(point.x, point.y);
                final Point point5 = new Point(0, 0);
                if (n3 > 1) {
                    if (n3 > 16) {
                        n3 = 16;
                    }
                    final double n4 = -n / n3;
                    double n5 = atan2 + n4;
                    --n3;
                    while (n3-- > 0) {
                        point5.x = (int)(n2 * Math.cos(n5)) + point3.x;
                        point5.y = (int)(n2 * Math.sin(n5)) + point3.y;
                        this.aKkamaJ(point4, point5);
                        point4.x = point5.x;
                        point4.y = point5.y;
                        n5 += n4;
                    }
                }
                this.aKkamaJ(point4, point2);
                return;
            }
        }
        this.aKkamaJ(point, point2);
    }
    
    static final QuadraticEdge AkkAmaJ(final QuadraticEdge majjkkk, final Point point, final Point point2) {
        final int aKkAmAJ = MovieTransform.AKkAmAJ(majjkkk.aJaKkam - majjkkk.aJAkKAm, majjkkk.AjAkKAm - majjkkk.AjakKAm);
        int n;
        if (aKkAmAJ > 0) {
            final int aKkAmAJ2 = MovieTransform.AKkAmAJ(point.x - point2.x, point.y - point2.y);
            n = ((aKkAmAJ != 0) ? ((int)(((long)aKkAmAJ2 << 16) / aKkAmAJ)) : Integer.MAX_VALUE);
        }
        else {
            n = 65536;
        }
        final int n2 = majjkkk.ajAkKAm - majjkkk.aJaKkam;
        final int n3 = majjkkk.AJAkKAm - majjkkk.AjAkKAm;
        final int n4 = majjkkk.ajAkKAm - majjkkk.aJAkKAm;
        final int n5 = majjkkk.AJAkKAm - majjkkk.AjakKAm;
        final QuadraticEdge majjkkk2 = new QuadraticEdge();
        majjkkk2.aJaKkam = point.x;
        majjkkk2.AjAkKAm = point.y;
        majjkkk2.aJAkKAm = point2.x;
        majjkkk2.AjakKAm = point2.y;
        if (MovieTransform.aKkAmAJ(n2, n3) > MovieTransform.aKkAmAJ(n4, n5)) {
            majjkkk2.ajAkKAm = (int)(n * (long)n2 + 32768L >> 16) + point.x;
            majjkkk2.AJAkKAm = (int)(n * (long)n3 + 32768L >> 16) + point.y;
        }
        else {
            majjkkk2.ajAkKAm = (int)(n * (long)n4 + 32768L >> 16) + point2.x;
            majjkkk2.AJAkKAm = (int)(n * (long)n5 + 32768L >> 16) + point2.y;
        }
        return majjkkk2;
    }
    
    static final QuadraticEdge AKKamaJ(final QuadraticEdge majjkkk) {
        final QuadraticEdge majjkkk2 = new QuadraticEdge();
        majjkkk2.ajakKAm = majjkkk.ajakKAm;
        majjkkk2.aJaKkam = majjkkk.aJAkKAm;
        majjkkk2.AjAkKAm = majjkkk.AjakKAm;
        majjkkk2.ajAkKAm = majjkkk.ajAkKAm;
        majjkkk2.AJAkKAm = majjkkk.AJAkKAm;
        majjkkk2.aJAkKAm = majjkkk.aJaKkam;
        majjkkk2.AjakKAm = majjkkk.AjAkKAm;
        return majjkkk2;
    }
    
    final void aKkAmaJ(final QuadraticEdge majjkkk) {
        if (!majjkkk.ajakKAm && this.jAKKama < 5) {
            final int akKaMAj = majjkkk.AkKaMAj();
            if (akKaMAj > 6 && 2 * akKaMAj > MovieTransform.aKkAmAJ(majjkkk.aJaKkam - majjkkk.aJAkKAm, majjkkk.AjAkKAm - majjkkk.AjakKAm)) {
                final QuadraticEdge majjkkk2 = new QuadraticEdge(majjkkk);
                final QuadraticEdge akKaMAj2 = majjkkk2.AKKaMAj(32768);
                ++this.jAKKama;
                this.aKkAmaJ(majjkkk2);
                this.aKkAmaJ(akKaMAj2);
                --this.jAKKama;
                return;
            }
        }
        final int n = this.jaKKama / 2;
        int n2 = majjkkk.AJAkKAm - majjkkk.AjAkKAm;
        int n3 = majjkkk.aJaKkam - majjkkk.ajAkKAm;
        if (n2 == 0 && n3 == 0) {
            n2 = majjkkk.AjakKAm - majjkkk.AjAkKAm;
            n3 = majjkkk.aJaKkam - majjkkk.aJAkKAm;
        }
        final int aKkAmAJ = MovieTransform.AKkAmAJ(n2, n3);
        if (aKkAmAJ > 0) {
            final int n4 = (aKkAmAJ != 0) ? ((int)(((long)n << 16) / aKkAmAJ)) : Integer.MAX_VALUE;
            n2 = (int)(n4 * (long)n2 + 32768L >> 16);
            n3 = (int)(n4 * (long)n3 + 32768L >> 16);
        }
        int n5;
        int n6;
        if (majjkkk.ajakKAm) {
            n5 = n2;
            n6 = n3;
        }
        else {
            n5 = majjkkk.AjakKAm - majjkkk.AJAkKAm;
            n6 = majjkkk.ajAkKAm - majjkkk.aJAkKAm;
            if (n5 == 0 && n6 == 0) {
                n5 = majjkkk.AjakKAm - majjkkk.AjAkKAm;
                n6 = majjkkk.aJaKkam - majjkkk.aJAkKAm;
            }
            final int aKkAmAJ2 = MovieTransform.AKkAmAJ(n5, n6);
            if (aKkAmAJ2 > 0) {
                final int n7 = (aKkAmAJ2 != 0) ? ((int)(((long)n << 16) / aKkAmAJ2)) : Integer.MAX_VALUE;
                n5 = (int)(n7 * (long)n5 + 32768L >> 16);
                n6 = (int)(n7 * (long)n6 + 32768L >> 16);
            }
        }
        final Point point = new Point(majjkkk.aJaKkam + n2, majjkkk.AjAkKAm + n3);
        final Point point2 = new Point(majjkkk.aJAkKAm + n5, majjkkk.AjakKAm + n6);
        final Point point3 = new Point(majjkkk.aJaKkam - n2, majjkkk.AjAkKAm - n3);
        final Point point4 = new Point(majjkkk.aJAkKAm - n5, majjkkk.AjakKAm - n6);
        if (majjkkk.ajakKAm) {
            this.aKkamaJ(point2, point);
            this.aKkamaJ(point3, point4);
        }
        else {
            this.AkKAmaJ(AKKamaJ(AkkAmaJ(majjkkk, point, point2)), true);
            this.AkKAmaJ(AkkAmaJ(majjkkk, point3, point4), true);
        }
        if (!this.JAKKama) {
            this.JakKama.x = point.x;
            this.JakKama.y = point.y;
            this.jakKama.x = majjkkk.aJaKkam;
            this.jakKama.y = majjkkk.AjAkKAm;
            this.JAkKama.x = point3.x;
            this.JAkKama.y = point3.y;
            this.JAKKama = true;
        }
        else {
            this.AkkamaJ(point, this.jAkKama, this.JaKkAMa);
            this.AkkamaJ(this.jaKkAMa, point3, this.JaKkAMa);
        }
        this.jAkKama.x = point2.x;
        this.jAkKama.y = point2.y;
        this.JaKkAMa.x = majjkkk.aJAkKAm;
        this.JaKkAMa.y = majjkkk.AjakKAm;
        this.jaKkAMa.x = point4.x;
        this.jaKkAMa.y = point4.y;
    }
    
    final void AKkAmaJ(final QuadraticEdge majjkkk) {
        final int n = majjkkk.AjakKAm - majjkkk.AjAkKAm;
        final int n2 = majjkkk.aJaKkam - majjkkk.aJAkKAm;
        final Point point = new Point(majjkkk.aJaKkam, majjkkk.AjAkKAm);
        final Point point2 = new Point(majjkkk.aJaKkam, majjkkk.AjAkKAm);
        final Point point3 = new Point(majjkkk.aJAkKAm, majjkkk.AjakKAm);
        final Point point4 = new Point(majjkkk.aJAkKAm, majjkkk.AjakKAm);
        final boolean b = ((n > 0) ? n : (-n)) > ((n2 > 0) ? n2 : (-n2));
        switch (this.jaKKama) {
            case 1: {
                if (b) {
                    final int n3 = (n < 0) ? -1 : ((n > 0) ? 1 : 0);
                    if (n3 > 0) {
                        final Point point5 = point;
                        point5.x += n3;
                        final Point point6 = point3;
                        point6.x += n3;
                        break;
                    }
                    final Point point7 = point2;
                    point7.x -= n3;
                    final Point point8 = point4;
                    point8.x -= n3;
                    break;
                }
                else {
                    final int n4 = (n2 < 0) ? -1 : ((n2 > 0) ? 1 : 0);
                    if (n4 > 0) {
                        final Point point9 = point;
                        point9.y += n4;
                        final Point point10 = point3;
                        point10.y += n4;
                        break;
                    }
                    final Point point11 = point2;
                    point11.y -= n4;
                    final Point point12 = point4;
                    point12.y -= n4;
                    break;
                }
            }
            case 2: {
                if (b) {
                    final int n5 = (n < 0) ? -1 : ((n > 0) ? 1 : 0);
                    final Point point13 = point;
                    point13.x += n5;
                    final Point point14 = point3;
                    point14.x += n5;
                    final Point point15 = point2;
                    point15.x -= n5;
                    final Point point16 = point4;
                    point16.x -= n5;
                    break;
                }
                final int n6 = (n2 < 0) ? -1 : ((n2 > 0) ? 1 : 0);
                final Point point17 = point;
                point17.y += n6;
                final Point point18 = point3;
                point18.y += n6;
                final Point point19 = point2;
                point19.y -= n6;
                final Point point20 = point4;
                point20.y -= n6;
                break;
            }
            case 3: {
                if (b) {
                    final int n7 = (n < 0) ? -1 : ((n > 0) ? 1 : 0);
                    final Point point21 = point;
                    point21.x += n7;
                    final Point point22 = point3;
                    point22.x += n7;
                    final int n8 = n7 * 2;
                    final Point point23 = point2;
                    point23.x -= n8;
                    final Point point24 = point4;
                    point24.x -= n8;
                    break;
                }
                final int n9 = (n2 < 0) ? -1 : ((n2 > 0) ? 1 : 0);
                final Point point25 = point;
                point25.y += n9;
                final Point point26 = point3;
                point26.y += n9;
                final int n10 = n9 * 2;
                final Point point27 = point2;
                point27.y -= n10;
                final Point point28 = point4;
                point28.y -= n10;
                break;
            }
        }
        this.aKkamaJ(point3, point);
        this.aKkamaJ(point2, point4);
        if (!this.JAKKama) {
            this.JakKama.x = point.x;
            this.JakKama.y = point.y;
            this.jakKama.x = majjkkk.aJaKkam;
            this.jakKama.y = majjkkk.AjAkKAm;
            this.JAkKama.x = point2.x;
            this.JAkKama.y = point2.y;
            this.JAKKama = true;
        }
        else {
            this.aKkamaJ(point, this.jAkKama);
            this.aKkamaJ(this.jaKkAMa, point2);
        }
        this.jAkKama.x = point3.x;
        this.jAkKama.y = point3.y;
        this.JaKkAMa.x = majjkkk.aJAkKAm;
        this.JaKkAMa.y = majjkkk.AjakKAm;
        this.jaKkAMa.x = point4.x;
        this.jaKkAMa.y = point4.y;
    }
    
    final void akkAmaJ(final QuadraticEdge majjkkk) {
        Label_0223: {
            if (!majjkkk.ajakKAm && majjkkk.AkKaMAj() > 2) {
                final int n = majjkkk.AJAkKAm - majjkkk.AjAkKAm;
                final int n2 = majjkkk.aJaKkam - majjkkk.ajAkKAm;
                final int n3 = majjkkk.AjakKAm - majjkkk.AJAkKAm;
                final int n4 = majjkkk.ajAkKAm - majjkkk.aJAkKAm;
                Label_0190: {
                    if (((n > 0) ? n : (-n)) > ((n2 > 0) ? n2 : (-n2)) == ((n3 > 0) ? n3 : (-n3)) > ((n4 > 0) ? n4 : (-n4))) {
                        Label_0160: {
                            boolean b;
                            if (n == 0) {
                                b = true;
                            }
                            else if (n > 0) {
                                if (n3 >= 0) {
                                    break Label_0160;
                                }
                                b = false;
                            }
                            else {
                                if (n3 <= 0) {
                                    break Label_0160;
                                }
                                b = false;
                            }
                            if (!b) {
                                break Label_0190;
                            }
                        }
                        boolean b2;
                        if (n2 == 0) {
                            b2 = true;
                        }
                        else if (n2 > 0) {
                            if (n4 >= 0) {
                                break Label_0223;
                            }
                            b2 = false;
                        }
                        else {
                            if (n4 <= 0) {
                                break Label_0223;
                            }
                            b2 = false;
                        }
                        if (b2) {
                            break Label_0223;
                        }
                    }
                }
                final QuadraticEdge majjkkk2 = new QuadraticEdge(majjkkk);
                final QuadraticEdge akKaMAj = majjkkk2.AKKaMAj(32768);
                this.akkAmaJ(majjkkk2);
                this.akkAmaJ(akKaMAj);
                return;
            }
        }
        final int n5 = majjkkk.AjakKAm - majjkkk.AjAkKAm;
        final int n6 = majjkkk.aJaKkam - majjkkk.aJAkKAm;
        final QuadraticEdge majjkkk3 = new QuadraticEdge(majjkkk);
        final QuadraticEdge majjkkk4 = new QuadraticEdge(majjkkk);
        final boolean b3 = ((n5 > 0) ? n5 : (-n5)) > ((n6 > 0) ? n6 : (-n6));
        switch (this.jaKKama) {
            case 1: {
                if (b3) {
                    final int n7 = (n5 < 0) ? -1 : ((n5 > 0) ? 1 : 0);
                    if (n7 > 0) {
                        final QuadraticEdge majjkkk5 = majjkkk3;
                        majjkkk5.aJaKkam += n7;
                        final QuadraticEdge majjkkk6 = majjkkk3;
                        majjkkk6.ajAkKAm += n7;
                        final QuadraticEdge majjkkk7 = majjkkk3;
                        majjkkk7.aJAkKAm += n7;
                        break;
                    }
                    final int n8 = -n7;
                    final QuadraticEdge majjkkk8 = majjkkk4;
                    majjkkk8.aJaKkam += n8;
                    final QuadraticEdge majjkkk9 = majjkkk4;
                    majjkkk9.ajAkKAm += n8;
                    final QuadraticEdge majjkkk10 = majjkkk4;
                    majjkkk10.aJAkKAm += n8;
                    break;
                }
                else {
                    final int n9 = (n6 < 0) ? -1 : ((n6 > 0) ? 1 : 0);
                    if (n9 > 0) {
                        final QuadraticEdge majjkkk11 = majjkkk3;
                        majjkkk11.AjAkKAm += n9;
                        final QuadraticEdge majjkkk12 = majjkkk3;
                        majjkkk12.AJAkKAm += n9;
                        final QuadraticEdge majjkkk13 = majjkkk3;
                        majjkkk13.AjakKAm += n9;
                        break;
                    }
                    final int n10 = -n9;
                    final QuadraticEdge majjkkk14 = majjkkk4;
                    majjkkk14.AjAkKAm += n10;
                    final QuadraticEdge majjkkk15 = majjkkk4;
                    majjkkk15.AJAkKAm += n10;
                    final QuadraticEdge majjkkk16 = majjkkk4;
                    majjkkk16.AjakKAm += n10;
                    break;
                }
            }
            case 2: {
                if (b3) {
                    final int n11 = (n5 < 0) ? -1 : ((n5 > 0) ? 1 : 0);
                    final QuadraticEdge majjkkk17 = majjkkk3;
                    majjkkk17.aJaKkam += n11;
                    final QuadraticEdge majjkkk18 = majjkkk3;
                    majjkkk18.ajAkKAm += n11;
                    final QuadraticEdge majjkkk19 = majjkkk3;
                    majjkkk19.aJAkKAm += n11;
                    final int n12 = -n11;
                    final QuadraticEdge majjkkk20 = majjkkk4;
                    majjkkk20.aJaKkam += n12;
                    final QuadraticEdge majjkkk21 = majjkkk4;
                    majjkkk21.ajAkKAm += n12;
                    final QuadraticEdge majjkkk22 = majjkkk4;
                    majjkkk22.aJAkKAm += n12;
                    break;
                }
                final int n13 = (n6 < 0) ? -1 : ((n6 > 0) ? 1 : 0);
                final QuadraticEdge majjkkk23 = majjkkk3;
                majjkkk23.AjAkKAm += n13;
                final QuadraticEdge majjkkk24 = majjkkk3;
                majjkkk24.AJAkKAm += n13;
                final QuadraticEdge majjkkk25 = majjkkk3;
                majjkkk25.AjakKAm += n13;
                final int n14 = -n13;
                final QuadraticEdge majjkkk26 = majjkkk4;
                majjkkk26.AjAkKAm += n14;
                final QuadraticEdge majjkkk27 = majjkkk4;
                majjkkk27.AJAkKAm += n14;
                final QuadraticEdge majjkkk28 = majjkkk4;
                majjkkk28.AjakKAm += n14;
                break;
            }
            case 3: {
                if (b3) {
                    final int n15 = (n5 < 0) ? -1 : ((n5 > 0) ? 1 : 0);
                    final QuadraticEdge majjkkk29 = majjkkk3;
                    majjkkk29.aJaKkam += n15;
                    final QuadraticEdge majjkkk30 = majjkkk3;
                    majjkkk30.ajAkKAm += n15;
                    final QuadraticEdge majjkkk31 = majjkkk3;
                    majjkkk31.aJAkKAm += n15;
                    final int n16 = -2 * n15;
                    final QuadraticEdge majjkkk32 = majjkkk4;
                    majjkkk32.aJaKkam += n16;
                    final QuadraticEdge majjkkk33 = majjkkk4;
                    majjkkk33.ajAkKAm += n16;
                    final QuadraticEdge majjkkk34 = majjkkk4;
                    majjkkk34.aJAkKAm += n16;
                    break;
                }
                final int n17 = (n6 < 0) ? -1 : ((n6 > 0) ? 1 : 0);
                final QuadraticEdge majjkkk35 = majjkkk3;
                majjkkk35.AjAkKAm += n17;
                final QuadraticEdge majjkkk36 = majjkkk3;
                majjkkk36.AJAkKAm += n17;
                final QuadraticEdge majjkkk37 = majjkkk3;
                majjkkk37.AjakKAm += n17;
                final int n18 = -2 * n17;
                final QuadraticEdge majjkkk38 = majjkkk4;
                majjkkk38.AjAkKAm += n18;
                final QuadraticEdge majjkkk39 = majjkkk4;
                majjkkk39.AJAkKAm += n18;
                final QuadraticEdge majjkkk40 = majjkkk4;
                majjkkk40.AjakKAm += n18;
                break;
            }
        }
        this.AkKAmaJ(AKKamaJ(majjkkk3), true);
        this.AkKAmaJ(majjkkk4, true);
        if (!this.JAKKama) {
            this.JakKama.x = majjkkk3.aJaKkam;
            this.JakKama.y = majjkkk3.AjAkKAm;
            this.jakKama.x = majjkkk.aJaKkam;
            this.jakKama.y = majjkkk.AjAkKAm;
            this.JAkKama.x = majjkkk4.aJaKkam;
            this.JAkKama.y = majjkkk4.AjAkKAm;
            this.JAKKama = true;
        }
        else {
            this.aKkamaJ(new Point(majjkkk3.aJaKkam, majjkkk3.AjAkKAm), this.jAkKama);
            this.aKkamaJ(this.jaKkAMa, new Point(majjkkk4.aJaKkam, majjkkk4.AjAkKAm));
        }
        this.jAkKama.x = majjkkk3.aJAkKAm;
        this.jAkKama.y = majjkkk3.AjakKAm;
        this.JaKkAMa.x = majjkkk.aJAkKAm;
        this.JaKkAMa.y = majjkkk.AjakKAm;
        this.jaKkAMa.x = majjkkk4.aJAkKAm;
        this.jaKkAMa.y = majjkkk4.AjakKAm;
    }
    
    final void aKKamaJ(final int b, final MovieFillStyle jAkkama) {
        this.JAKKama = false;
        this.jaKKama = Math.max(this.JaKKaMA.mAJaKkA ? 4 : 1, b);
        this.JaKKama = (this.jaKKama > 3);
        this.jAkkama = jAkkama;
        final Point jaKkAMa = this.JAKkAMa;
        final Point jaKkAMa2 = this.JAKkAMa;
        final int n = Integer.MIN_VALUE;
        jaKkAMa2.y = n;
        jaKkAMa.x = n;
    }
    
    final void aKKAmaJ(final QuadraticEdge majjkkk) {
        this.JAKkAMa.x = majjkkk.aJAkKAm;
        this.JAKkAMa.y = majjkkk.AjakKAm;
        if (majjkkk.aJaKkam == majjkkk.aJAkKAm && majjkkk.AjAkKAm == majjkkk.AjakKAm && majjkkk.aJaKkam == majjkkk.ajAkKAm && majjkkk.AjAkKAm == majjkkk.AJAkKAm) {
            return;
        }
        if (!this.JaKKama) {
            if (majjkkk.ajakKAm) {
                this.AKkAmaJ(majjkkk);
                return;
            }
            this.akkAmaJ(majjkkk);
        }
        else {
            if (!this.JaKKaMA.mAJaKkA || !majjkkk.ajakKAm) {
                this.aKkAmaJ(majjkkk);
                return;
            }
            if (this.jaKKama == 4 || this.jaKKama == 12) {
                final QuadraticEdge majjkkk2 = new QuadraticEdge(majjkkk);
                Label_0247: {
                    if (majjkkk2.aJaKkam == majjkkk2.aJAkKAm) {
                        final int n = majjkkk2.AjAkKAm - majjkkk2.AjakKAm;
                        if (((n > 0) ? n : (-n)) > 12) {
                            final QuadraticEdge majjkkk3 = majjkkk2;
                            final QuadraticEdge majjkkk4 = majjkkk2;
                            final int n2 = (majjkkk2.aJaKkam & 0xFFFFFFFC) + 2;
                            majjkkk4.aJAkKAm = n2;
                            majjkkk3.aJaKkam = n2;
                            break Label_0247;
                        }
                    }
                    if (majjkkk2.AjAkKAm == majjkkk2.AjakKAm) {
                        final int n3 = majjkkk2.aJaKkam - majjkkk2.aJAkKAm;
                        if (((n3 > 0) ? n3 : (-n3)) > 12) {
                            final QuadraticEdge majjkkk5 = majjkkk2;
                            final QuadraticEdge majjkkk6 = majjkkk2;
                            final int n4 = (majjkkk2.AjAkKAm & 0xFFFFFFFC) + 2;
                            majjkkk6.AjakKAm = n4;
                            majjkkk5.AjAkKAm = n4;
                        }
                    }
                }
                this.aKkAmaJ(majjkkk2);
                return;
            }
            if (this.jaKKama == 8) {
                final QuadraticEdge majjkkk7 = new QuadraticEdge(majjkkk);
                Label_0382: {
                    if (majjkkk7.aJaKkam == majjkkk7.aJAkKAm) {
                        final int n5 = majjkkk7.AjAkKAm - majjkkk7.AjakKAm;
                        if (((n5 > 0) ? n5 : (-n5)) > 12) {
                            final QuadraticEdge majjkkk8 = majjkkk7;
                            final QuadraticEdge majjkkk9 = majjkkk7;
                            final int n6 = majjkkk7.aJaKkam + 2 & 0xFFFFFFFC;
                            majjkkk9.aJAkKAm = n6;
                            majjkkk8.aJaKkam = n6;
                            break Label_0382;
                        }
                    }
                    if (majjkkk7.AjAkKAm == majjkkk7.AjakKAm) {
                        final int n7 = majjkkk7.aJaKkam - majjkkk7.aJAkKAm;
                        if (((n7 > 0) ? n7 : (-n7)) > 12) {
                            final QuadraticEdge majjkkk10 = majjkkk7;
                            final QuadraticEdge majjkkk11 = majjkkk7;
                            final int n8 = majjkkk7.AjAkKAm + 2 & 0xFFFFFFFC;
                            majjkkk11.AjakKAm = n8;
                            majjkkk10.AjAkKAm = n8;
                        }
                    }
                }
                this.aKkAmaJ(majjkkk7);
                return;
            }
            this.aKkAmaJ(majjkkk);
        }
    }
    
    final void AKKAmaJ() {
        if (!this.JAKKama) {
            if (this.JAKkAMa.x != Integer.MIN_VALUE) {
                final int n = this.jaKKama / 2;
                final Point point = new Point(this.JAKkAMa.x, this.JAKkAMa.y);
                final Point point2 = new Point(this.JAKkAMa.x, this.JAKkAMa.y);
                final Point point3 = point;
                point3.y -= n;
                final Point point4 = point2;
                point4.y += this.jaKKama - n;
                if (!this.JaKKama) {
                    final Point point5 = point;
                    point5.x -= n;
                    final Point point6 = point2;
                    point6.x -= n;
                    this.aKkamaJ(point, point2);
                    final Point point7 = point;
                    point7.x += this.jaKKama - n;
                    final Point point8 = point2;
                    point8.x += this.jaKKama - n;
                    this.aKkamaJ(point2, point);
                    return;
                }
                this.AkkamaJ(point, point2, this.JAKkAMa);
                this.AkkamaJ(point2, point, this.JAKkAMa);
            }
            return;
        }
        if (this.jakKama.x == this.JaKkAMa.x && this.jakKama.y == this.JaKkAMa.y) {
            if (!this.JaKKama) {
                this.aKkamaJ(this.JakKama, this.jAkKama);
                this.aKkamaJ(this.jaKkAMa, this.JAkKama);
                return;
            }
            this.AkkamaJ(this.JakKama, this.jAkKama, this.JaKkAMa);
            this.AkkamaJ(this.jaKkAMa, this.JAkKama, this.JaKkAMa);
        }
        else {
            if (!this.JaKKama) {
                this.aKkamaJ(this.JakKama, this.JAkKama);
                this.aKkamaJ(this.jaKkAMa, this.jAkKama);
                return;
            }
            this.AkkamaJ(this.JakKama, this.JAkKama, this.jakKama);
            this.AkkamaJ(this.jaKkAMa, this.jAkKama, this.JaKkAMa);
        }
    }
}
