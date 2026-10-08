// 
// Decompiled by Procyon v0.6.0
// 

public class mmaamma
{
    public maaakka mAJAkKa;
    public mmajkka MajAkKa;
    public mmajkka majAkKa;
    int MAjAkKa;
    int mAjAkKa;
    int AmAjAkK;
    int amAjAkK;
    int AMAjAkK;
    int aMAjAkK;
    int AmajAkK;
    float amajAkK;
    float AMajAkK;
    float aMajAkK;
    float AmAJAkK;
    float amAJAkK;
    float AMAJAkK;
    float aMAJAkK;
    float AmaJAkK;
    float amaJAkK;
    float AMaJAkK;
    float aMaJAkK;
    int AmAjakK;
    int amAjakK;
    int AMAjakK;
    static final float aMAjakK = 65536.0f;
    static final float AmajakK = 4.2949673E9f;
    int amajakK;
    int AMajakK;
    int aMajakK;
    int AmAJakK;
    int amAJakK;
    static final int AMAJakK = 266598654;
    static final int aMAJakK = 264499452;
    static final int AmaJakK = 264499452;
    
    static final int AmAJakK(final float n) {
        return (int)(n * 4.2949673E9f);
    }
    
    static final int aMAjAKK(final float n) {
        return (int)(n * 65536.0f);
    }
    
    static final int aMaJakK(final double n) {
        return (int)(n * 65536.0);
    }
    
    static final int AMaJakK(final float n) {
        // Preserve f2l; l2i: texture coordinates wrap instead of saturating at Integer.MAX_VALUE.
        return (int)(long)n;
    }
    
    public mmaamma(final mmajkka majAkKa) {
        this.majAkKa = majAkKa;
        this.MAjAkKa = this.majAkKa.kAMAJaK;
        this.mAjAkKa = this.majAkKa.KamAJaK;
    }
    
    public void amAjAKK(final kajjkka kajjkka) {
        float n = 0.0f;
        float n2 = 0.0f;
        float n3 = 0.0f;
        majjmka amAJAkk = kajjkka.amAJAkk;
        majjmka amajAkk = kajjkka.AMAJAkk;
        majjmka amajAkk2 = kajjkka.aMAJAkk;
        kajjmmk amaJAkk = kajjkka.AmaJAkk;
        kajjmmk amaJAkk2 = kajjkka.amaJAkk;
        kajjmmk aMaJAkk = kajjkka.AMaJAkk;
        if (amAJAkk.KAMAjAK > amajAkk.KAMAjAK) {
            final majjmka majjmka = amajAkk;
            amajAkk = amAJAkk;
            amAJAkk = majjmka;
            final kajjmmk kajjmmk = amaJAkk2;
            amaJAkk2 = amaJAkk;
            amaJAkk = kajjmmk;
        }
        if (amajAkk.KAMAjAK > amajAkk2.KAMAjAK) {
            final majjmka majjmka2 = amajAkk2;
            amajAkk2 = amajAkk;
            amajAkk = majjmka2;
            final kajjmmk kajjmmk2 = aMaJAkk;
            aMaJAkk = amaJAkk2;
            amaJAkk2 = kajjmmk2;
        }
        if (amAJAkk.KAMAjAK > amajAkk.KAMAjAK) {
            final majjmka majjmka3 = amajAkk;
            amajAkk = amAJAkk;
            amAJAkk = majjmka3;
            final kajjmmk kajjmmk3 = amaJAkk2;
            amaJAkk2 = amaJAkk;
            amaJAkk = kajjmmk3;
        }
        final float kaMAjAK = amAJAkk.kaMAjAK;
        final float kamAjAK = amAJAkk.KAMAjAK;
        final float jaKkaMA = amaJAkk.jAKkaMA;
        final float jakkaMA = amaJAkk.JakkaMA;
        final float kamAjAK2 = amAJAkk.KamAjAK;
        final float kaMAjAK2 = amajAkk.kaMAjAK;
        final float kamAjAK3 = amajAkk.KAMAjAK;
        final float jaKkaMA2 = amaJAkk2.jAKkaMA;
        final float jakkaMA2 = amaJAkk2.JakkaMA;
        final float kamAjAK4 = amajAkk.KamAjAK;
        final float kaMAjAK3 = amajAkk2.kaMAjAK;
        final float kamAjAK5 = amajAkk2.KAMAjAK;
        final float jaKkaMA3 = aMaJAkk.jAKkaMA;
        final float jakkaMA3 = aMaJAkk.JakkaMA;
        final float kamAjAK6 = amajAkk2.KamAjAK;
        final int n4 = (int)kamAjAK;
        int n5 = n4 >> 16;
        final int n6 = (int)kamAjAK3;
        int n7 = n6 >> 16;
        int n8 = (int)kamAjAK5 >> 16;
        final int n9 = 0;
        final int mAjAkKa = this.mAjAkKa;
        if (n5 > mAjAkKa) {
            return;
        }
        if (n8 < n9) {
            return;
        }
        if (n5 < n9) {
            n5 = n9;
        }
        if (n7 < n9) {
            n7 = n9;
        }
        if (n7 > mAjAkKa) {
            n7 = mAjAkKa;
        }
        if (n8 > mAjAkKa) {
            n8 = mAjAkKa;
        }
        final float n10 = kaMAjAK2 - kaMAjAK;
        final float n11 = kaMAjAK3 - kaMAjAK;
        final float n12 = kaMAjAK3 - kaMAjAK2;
        final float n13 = kamAjAK3 - kamAjAK;
        final float n14 = kamAjAK5 - kamAjAK;
        final float n15 = kamAjAK5 - kamAjAK3;
        final float n16 = n11 * n13 - n10 * n14;
        if (n16 == 0.0f) {
            return;
        }
        if (kamAjAK2 <= 0.0f || kamAjAK4 <= 0.0f || kamAjAK6 <= 0.0f) {}
        final float n17 = 65536.0f / n16;
        this.amajAkK = ((jaKkaMA3 - jaKkaMA) * n13 - (jaKkaMA2 - jaKkaMA) * n14) * n17;
        this.AmAJAkK = ((jaKkaMA2 - jaKkaMA) * n11 - (jaKkaMA3 - jaKkaMA) * n10) * n17;
        this.AMajAkK = ((jakkaMA3 - jakkaMA) * n13 - (jakkaMA2 - jakkaMA) * n14) * n17;
        this.amAJAkK = ((jakkaMA2 - jakkaMA) * n11 - (jakkaMA3 - jakkaMA) * n10) * n17;
        this.aMajAkK = ((kamAjAK6 - kamAjAK2) * n13 - (kamAjAK4 - kamAjAK2) * n14) * n17;
        this.AMAJAkK = ((kamAjAK4 - kamAjAK2) * n11 - (kamAjAK6 - kamAjAK2) * n10) * n17;
        this.AmAjakK = (int)(this.amajAkK * 4.2949673E9f);
        this.amAjakK = (int)(this.AMajAkK * 4.2949673E9f);
        this.AMAjakK = (int)(this.aMajAkK * 4.2949673E9f);
        if (kamAjAK3 > kamAjAK) {
            n = n10 / n13;
        }
        if (kamAjAK5 > kamAjAK) {
            n2 = n11 / n14;
        }
        if (kamAjAK5 > kamAjAK3) {
            n3 = n12 / n15;
        }
        boolean b = n2 > n;
        if (kamAjAK == kamAjAK3) {
            b = (kaMAjAK > kaMAjAK2);
        }
        if (kamAjAK3 == kamAjAK5) {
            b = (kaMAjAK3 > kaMAjAK2);
        }
        if (!b) {
            this.aMAJAkK = n2;
            this.amaJAkK = this.aMAJAkK * this.amajAkK + this.AmAJAkK;
            this.AMaJAkK = this.aMAJAkK * this.AMajAkK + this.amAJAkK;
            this.aMaJAkK = this.aMAJAkK * this.aMajAkK + this.AMAJAkK;
            final float n18 = (float)(65536 - (n4 - (n5 << 16)));
            this.AmAjAkK = (int)(kaMAjAK + n18 * this.aMAJAkK);
            this.AMAjAkK = AMaJakK((jaKkaMA * 65536.0f + n18 * this.amaJAkK) * 65536.0f);
            this.aMAjAkK = AMaJakK((jakkaMA * 65536.0f + n18 * this.AMaJAkK) * 65536.0f);
            this.AmajAkK = AMaJakK((kamAjAK2 * 65536.0f + n18 * this.aMaJAkK) * 65536.0f);
            if (n5 < n7) {
                this.AmaJAkK = n;
                this.amAjAkK = (int)(kaMAjAK + n18 * this.AmaJAkK);
                this.aMajakK(kajjkka, n5, n7);
            }
            if (n7 < n8) {
                this.AmaJAkK = n3;
                this.amAjAkK = (int)(kaMAjAK2 + (65536 - (n6 - (n7 << 16))) * this.AmaJAkK);
                this.aMajakK(kajjkka, n7, n8);
            }
        }
        else {
            this.AmaJAkK = n2;
            final float n19 = (float)(65536 - (n4 - (n5 << 16)));
            this.amAjAkK = (int)(kaMAjAK + n19 * this.AmaJAkK);
            if (n5 < n7) {
                this.aMAJAkK = n;
                this.amaJAkK = this.aMAJAkK * this.amajAkK + this.AmAJAkK;
                this.AMaJAkK = this.aMAJAkK * this.AMajAkK + this.amAJAkK;
                this.aMaJAkK = this.aMAJAkK * this.aMajAkK + this.AMAJAkK;
                this.AmAjAkK = (int)(kaMAjAK + n19 * this.aMAJAkK);
                this.AMAjAkK = AMaJakK((jaKkaMA * 65536.0f + n19 * this.amaJAkK) * 65536.0f);
                this.aMAjAkK = AMaJakK((jakkaMA * 65536.0f + n19 * this.AMaJAkK) * 65536.0f);
                this.AmajAkK = AMaJakK((kamAjAK2 * 65536.0f + n19 * this.aMaJAkK) * 65536.0f);
                this.aMajakK(kajjkka, n5, n7);
            }
            if (n7 < n8) {
                this.aMAJAkK = n3;
                this.amaJAkK = this.aMAJAkK * this.amajAkK + this.AmAJAkK;
                this.AMaJAkK = this.aMAJAkK * this.AMajAkK + this.amAJAkK;
                this.aMaJAkK = this.aMAJAkK * this.aMajAkK + this.AMAJAkK;
                final float n20 = (float)(65536 - (n6 - (n7 << 16)));
                this.AmAjAkK = (int)(kaMAjAK2 + n20 * this.aMAJAkK);
                this.AMAjAkK = AMaJakK((jaKkaMA2 * 65536.0f + n20 * this.amaJAkK) * 65536.0f);
                this.aMAjAkK = AMaJakK((jakkaMA2 * 65536.0f + n20 * this.AMaJAkK) * 65536.0f);
                this.AmajAkK = AMaJakK((kamAjAK4 * 65536.0f + n20 * this.aMaJAkK) * 65536.0f);
                this.aMajakK(kajjkka, n7, n8);
            }
        }
    }
    
    void aMajakK(final kajjkka kajjkka, int n, int n2) {
        this.mAJAkKa = kajjkka.AMAJAKK;
        this.MajAkKa = kajjkka.aMAJAKK;
        this.amajakK = (int)(this.aMAJAkK * 65536.0f);
        this.aMajakK = (int)(long)(this.amaJAkK * 4.2949673E9f);
        this.AmAJakK = (int)(long)(this.AMaJAkK * 4.2949673E9f);
        this.amAJakK = (int)(long)(this.aMaJAkK * 4.2949673E9f);
        this.AMajakK = (int)(this.AmaJAkK * 65536.0f);
        n *= this.MAjAkKa;
        n2 *= this.MAjAkKa;
        switch (kajjkka.amAJAKK) {
            default: {
                this.amAJakK(n, n2);
                return;
            }
            case 51: {
                this.AMAjAKK(n, n2);
                return;
            }
            case 35: {
                this.amajakK(n, n2);
                return;
            }
            case 19: {
                this.AMajakK(n, n2);
                return;
            }
            case 259: {
                this.AMAJakK(n, n2);
                return;
            }
            case 3: {
                this.AmAjAKK(n, n2);
                return;
            }
            case 49: {
                this.aMAJakK(n, n2);
                return;
            }
            case 33: {
                this.AmaJakK(n, n2);
                return;
            }
            case 17: {
                this.amaJakK(n, n2);
                return;
            }
            case 2048: {
                this.AmajAKK(n, n2);
            }
        }
    }
    
    void amAJakK(int i, final int n) {
        final int amajakK = this.amajakK;
        final int aMajakK = this.AMajakK;
        final int aMajakK2 = this.aMajakK;
        final int amAJakK = this.AmAJakK;
        int amAjAkK = this.AMAjAkK;
        int amAjAkK2 = this.aMAjAkK;
        final int amAjakK = this.AmAjakK;
        final int amAjakK2 = this.amAjakK;
        final int n2 = amAjakK >> 8;
        final int n3 = amAjakK2 >> 8;
        final int[] amAjakk = this.MajAkKa.AMAjakk;
        final int[] amAjakk2 = this.majAkKa.AMAjakk;
        while (i < n) {
            int mAjAkKa = this.AmAjAkK >> 16;
            int mAjAkKa2 = this.amAjAkK >> 16;
            if (mAjAkKa < 0) {
                mAjAkKa = 0;
            }
            else if (mAjAkKa > this.MAjAkKa) {
                mAjAkKa = this.MAjAkKa;
            }
            if (mAjAkKa2 < 0) {
                mAjAkKa2 = 0;
            }
            else if (mAjAkKa2 > this.MAjAkKa) {
                mAjAkKa2 = this.MAjAkKa;
            }
            final int n4 = -(this.AmAjAkK - (mAjAkKa << 16) + 255 >> 8);
            int n5 = amAjAkK + n4 * n2;
            int n6 = amAjAkK2 + n4 * n3;
            int j = i + mAjAkKa;
            final int n7 = i + mAjAkKa2;
            switch (n7 - j & 0x3) {
                case 3: {
                    amAjakk2[j++] = amAjakk[((n6 += amAjakK2) >>> 24 << 8) + ((n5 += amAjakK) >>> 24)];
                }
                case 2: {
                    amAjakk2[j++] = amAjakk[((n6 += amAjakK2) >>> 24 << 8) + ((n5 += amAjakK) >>> 24)];
                }
                case 1: {
                    amAjakk2[j++] = amAjakk[((n6 += amAjakK2) >>> 24 << 8) + ((n5 += amAjakK) >>> 24)];
                    break;
                }
            }
            while (j < n7) {
                final int n8;
                final int n9;
                amAjakk2[j] = amAjakk[((n8 = n6 + amAjakK2) >>> 24 << 8) + ((n9 = n5 + amAjakK) >>> 24)];
                final int n10;
                final int n11;
                amAjakk2[j + 1] = amAjakk[((n10 = n8 + amAjakK2) >>> 24 << 8) + ((n11 = n9 + amAjakK) >>> 24)];
                final int n12;
                final int n13;
                amAjakk2[j + 2] = amAjakk[((n12 = n10 + amAjakK2) >>> 24 << 8) + ((n13 = n11 + amAjakK) >>> 24)];
                amAjakk2[j + 3] = amAjakk[((n6 = n12 + amAjakK2) >>> 24 << 8) + ((n5 = n13 + amAjakK) >>> 24)];
                j += 4;
            }
            this.AmAjAkK += amajakK;
            this.amAjAkK += aMajakK;
            amAjAkK += aMajakK2;
            amAjAkK2 += amAJakK;
            i += this.MAjAkKa;
        }
        this.AMAjAkK = amAjAkK;
        this.aMAjAkK = amAjAkK2;
    }
    
    void aMAJakK(int i, final int n) {
        final int amajakK = this.amajakK;
        final int aMajakK = this.AMajakK;
        final int aMajakK2 = this.aMajakK;
        final int amAJakK = this.AmAJakK;
        int amAjAkK = this.AMAjAkK;
        int amAjAkK2 = this.aMAjAkK;
        final int amAjakK = this.AmAjakK;
        final int amAjakK2 = this.amAjakK;
        final int n2 = amAjakK >> 8;
        final int n3 = amAjakK2 >> 8;
        final int[] amAjakk = this.MajAkKa.AMAjakk;
        final int[] amAjakk2 = this.majAkKa.AMAjakk;
        while (i < n) {
            int mAjAkKa = this.AmAjAkK >> 16;
            int mAjAkKa2 = this.amAjAkK >> 16;
            if (mAjAkKa < 0) {
                mAjAkKa = 0;
            }
            else if (mAjAkKa > this.MAjAkKa) {
                mAjAkKa = this.MAjAkKa;
            }
            if (mAjAkKa2 < 0) {
                mAjAkKa2 = 0;
            }
            else if (mAjAkKa2 > this.MAjAkKa) {
                mAjAkKa2 = this.MAjAkKa;
            }
            final int n4 = -(this.AmAjAkK - (mAjAkKa << 16) >> 8);
            int n5 = amAjAkK + n4 * n2;
            int n6 = amAjAkK2 + n4 * n3;
            int n7;
            int n8;
            for (int j = i + mAjAkKa; j < i + mAjAkKa2; amAjakk2[j++] = (n7 - n8 | n8 - (n8 >> 8))) {
                n7 = amAjakk[((n6 += amAjakK2) >>> 24 << 8) + ((n5 += amAjakK) >>> 24)] + amAjakk2[j];
                n8 = (n7 & 0x10040100);
            }
            this.AmAjAkK += amajakK;
            this.amAjAkK += aMajakK;
            amAjAkK += aMajakK2;
            amAjAkK2 += amAJakK;
            i += this.MAjAkKa;
        }
        this.AMAjAkK = amAjAkK;
        this.aMAjAkK = amAjAkK2;
    }
    
    void AmajAKK(int i, final int n) {
        final int amajakK = this.amajakK;
        final int aMajakK = this.AMajakK;
        final int aMajakK2 = this.aMajakK;
        int amAjAkK = this.AMAjAkK;
        final int amAjakK = this.AmAjakK;
        final int n2 = amAjakK >> 8;
        final int[] amAjakk = this.MajAkKa.AMAjakk;
        final int[] amAjakk2 = this.majAkKa.AMAjakk;
        while (i < n) {
            int mAjAkKa = this.AmAjAkK >> 16;
            int mAjAkKa2 = this.amAjAkK >> 16;
            if (mAjAkKa < 0) {
                mAjAkKa = 0;
            }
            else if (mAjAkKa > this.MAjAkKa) {
                mAjAkKa = this.MAjAkKa;
            }
            if (mAjAkKa2 < 0) {
                mAjAkKa2 = 0;
            }
            else if (mAjAkKa2 > this.MAjAkKa) {
                mAjAkKa2 = this.MAjAkKa;
            }
            int n3 = amAjAkK + -(this.AmAjAkK - (mAjAkKa << 16) >> 8) * n2;
            int n4;
            int n5;
            for (int j = i + mAjAkKa; j < i + mAjAkKa2; amAjakk2[j++] = (n4 - n5 | n5 - (n5 >> 8))) {
                n4 = amAjakk[(n3 += amAjakK) >>> 24] + amAjakk2[j];
                n5 = (n4 & 0x10040100);
            }
            this.AmAjAkK += amajakK;
            this.amAjAkK += aMajakK;
            amAjAkK += aMajakK2;
            i += this.MAjAkKa;
        }
        this.AMAjAkK = amAjAkK;
    }
    
    void AmaJakK(int i, final int n) {
        final int amajakK = this.amajakK;
        final int aMajakK = this.AMajakK;
        final int aMajakK2 = this.aMajakK;
        final int amAJakK = this.AmAJakK;
        int amAjAkK = this.AMAjAkK;
        int amAjAkK2 = this.aMAjAkK;
        final int amAjakK = this.AmAjakK;
        final int amAjakK2 = this.amAjakK;
        final int n2 = amAjakK >> 8;
        final int n3 = amAjakK2 >> 8;
        final int[] amAjakk = this.MajAkKa.AMAjakk;
        final int[] amAjakk2 = this.majAkKa.AMAjakk;
        while (i < n) {
            int mAjAkKa = this.AmAjAkK >> 16;
            int mAjAkKa2 = this.amAjAkK >> 16;
            if (mAjAkKa < 0) {
                mAjAkKa = 0;
            }
            else if (mAjAkKa > this.MAjAkKa) {
                mAjAkKa = this.MAjAkKa;
            }
            if (mAjAkKa2 < 0) {
                mAjAkKa2 = 0;
            }
            else if (mAjAkKa2 > this.MAjAkKa) {
                mAjAkKa2 = this.MAjAkKa;
            }
            final int n4 = -(this.AmAjAkK - (mAjAkKa << 16) + 255 >> 8);
            int n5 = amAjAkK + n4 * n2;
            int n6 = amAjAkK2 + n4 * n3;
            int n7;
            int n8;
            for (int j = i + mAjAkKa; j < i + mAjAkKa2; amAjakk2[j++] = (n7 - n8 | n8 - (n8 >> 8))) {
                n7 = amAjakk[((n6 += amAjakK2) >>> 24 << 8) + ((n5 += amAjakK) >>> 24)] + ((amAjakk2[j] & 0xFE3F8FE) >> 1);
                n8 = (n7 & 0x10040100);
            }
            this.AmAjAkK += amajakK;
            this.amAjAkK += aMajakK;
            amAjAkK += aMajakK2;
            amAjAkK2 += amAJakK;
            i += this.MAjAkKa;
        }
        this.AMAjAkK = amAjAkK;
        this.aMAjAkK = amAjAkK2;
    }
    
    void amaJakK(int i, final int n) {
        final int amajakK = this.amajakK;
        final int aMajakK = this.AMajakK;
        final int aMajakK2 = this.aMajakK;
        final int amAJakK = this.AmAJakK;
        int amAjAkK = this.AMAjAkK;
        int amAjAkK2 = this.aMAjAkK;
        final int amAjakK = this.AmAjakK;
        final int amAjakK2 = this.amAjakK;
        final int n2 = amAjakK >> 8;
        final int n3 = amAjakK2 >> 8;
        final int[] amAjakk = this.MajAkKa.AMAjakk;
        final int[] amAjakk2 = this.majAkKa.AMAjakk;
        while (i < n) {
            int mAjAkKa = this.AmAjAkK >> 16;
            int mAjAkKa2 = this.amAjAkK >> 16;
            if (mAjAkKa < 0) {
                mAjAkKa = 0;
            }
            else if (mAjAkKa > this.MAjAkKa) {
                mAjAkKa = this.MAjAkKa;
            }
            if (mAjAkKa2 < 0) {
                mAjAkKa2 = 0;
            }
            else if (mAjAkKa2 > this.MAjAkKa) {
                mAjAkKa2 = this.MAjAkKa;
            }
            final int n4 = -(this.AmAjAkK - (mAjAkKa << 16) + 255 >> 8);
            int n5 = amAjAkK + n4 * n2;
            int n6 = amAjAkK2 + n4 * n3;
            int n7;
            int n8;
            for (int j = i + mAjAkKa; j < i + mAjAkKa2; amAjakk2[j++] = (n7 - n8 | n8 - (n8 >> 8))) {
                n7 = amAjakk[((n6 += amAjakK2) >>> 24 << 8) + ((n5 += amAjakK) >>> 24)] + ((amAjakk2[j] & 0xFC3F0FC) >> 2);
                n8 = (n7 & 0x10040100);
            }
            this.AmAjAkK += amajakK;
            this.amAjAkK += aMajakK;
            amAjAkK += aMajakK2;
            amAjAkK2 += amAJakK;
            i += this.MAjAkKa;
        }
        this.AMAjAkK = amAjAkK;
        this.aMAjAkK = amAjAkK2;
    }
    
    void AmAjAKK(int i, final int n) {
        final int amajakK = this.amajakK;
        final int aMajakK = this.AMajakK;
        final int aMajakK2 = this.aMajakK;
        final int amAJakK = this.AmAJakK;
        final int amAJakK2 = this.amAJakK;
        int amAjAkK = this.AMAjAkK;
        int amAjAkK2 = this.aMAjAkK;
        int amajAkK = this.AmajAkK;
        final int amAjakK = this.AmAjakK;
        final int amAjakK2 = this.amAjakK;
        final int amAjakK3 = this.AMAjakK;
        final int n2 = amAjakK >> 8;
        final int n3 = amAjakK2 >> 8;
        final int n4 = amAjakK3 >> 8;
        final byte[] kamAJaK = this.mAJAkKa.kamAJaK;
        final int[] amAjakk = this.MajAkKa.AMAjakk;
        final int[] amAjakk2 = this.majAkKa.AMAjakk;
        while (i < n) {
            int mAjAkKa = this.AmAjAkK >> 16;
            int mAjAkKa2 = this.amAjAkK >> 16;
            if (mAjAkKa < 0) {
                mAjAkKa = 0;
            }
            else if (mAjAkKa > this.MAjAkKa) {
                mAjAkKa = this.MAjAkKa;
            }
            if (mAjAkKa2 < 0) {
                mAjAkKa2 = 0;
            }
            else if (mAjAkKa2 > this.MAjAkKa) {
                mAjAkKa2 = this.MAjAkKa;
            }
            final int n5 = -(this.AmAjAkK - (mAjAkKa << 16) + 255 >> 8);
            for (int n6 = amAjAkK + n5 * n2, n7 = amAjAkK2 + n5 * n3, n8 = amajAkK + n5 * n4, j = i + mAjAkKa; j < i + mAjAkKa2; amAjakk2[j++] = amAjakk[((n8 += amAjakK3) >>> 24 << 8) + (kamAJaK[((n7 += amAjakK2) >>> 24 << 8) + ((n6 += amAjakK) >>> 24)] & 0xFF)]) {}
            this.AmAjAkK += amajakK;
            this.amAjAkK += aMajakK;
            amAjAkK += aMajakK2;
            amAjAkK2 += amAJakK;
            amajAkK += amAJakK2;
            i += this.MAjAkKa;
        }
        this.AMAjAkK = amAjAkK;
        this.aMAjAkK = amAjAkK2;
        this.AmajAkK = amajAkK;
    }
    
    void AMAJakK(int i, final int n) {
        final int amajakK = this.amajakK;
        final int aMajakK = this.AMajakK;
        final int aMajakK2 = this.aMajakK;
        final int amAJakK = this.AmAJakK;
        final int amAJakK2 = this.amAJakK;
        int amAjAkK = this.AMAjAkK;
        int amAjAkK2 = this.aMAjAkK;
        int amajAkK = this.AmajAkK;
        final int amAjakK = this.AmAjakK;
        final int amAjakK2 = this.amAjakK;
        final int amAjakK3 = this.AMAjakK;
        final int n2 = amAjakK >> 8;
        final int n3 = amAjakK2 >> 8;
        final int n4 = amAjakK3 >> 8;
        final byte[] kamAJaK = this.mAJAkKa.kamAJaK;
        final int[] amAjakk = this.MajAkKa.AMAjakk;
        final int[] amAjakk2 = this.majAkKa.AMAjakk;
        while (i < n) {
            int mAjAkKa = this.AmAjAkK >> 16;
            int mAjAkKa2 = this.amAjAkK >> 16;
            if (mAjAkKa < 0) {
                mAjAkKa = 0;
            }
            else if (mAjAkKa > this.MAjAkKa) {
                mAjAkKa = this.MAjAkKa;
            }
            if (mAjAkKa2 < 0) {
                mAjAkKa2 = 0;
            }
            else if (mAjAkKa2 > this.MAjAkKa) {
                mAjAkKa2 = this.MAjAkKa;
            }
            final int n5 = -(this.AmAjAkK - (mAjAkKa << 16) + 255 >> 8);
            int n6 = amAjAkK + n5 * n2;
            int n7 = amAjAkK2 + n5 * n3;
            int n8 = amajAkK + n5 * n4;
            for (int j = i + mAjAkKa; j < i + mAjAkKa2; ++j) {
                n8 += amAjakK3;
                n7 += amAjakK2;
                n6 += amAjakK;
                final int n9 = amAjakk2[j];
                if (n9 < 0) {
                    final int n10 = n9 + amAjakk[(n8 >>> 24 << 8) + (kamAJaK[(n7 >>> 24 << 8) + (n6 >>> 24)] & 0xFF)];
                    final int n11 = n10 & 0x10040100;
                    amAjakk2[j] = ((n10 - n11 | n11 - (n11 >> 8)) & Integer.MAX_VALUE);
                }
            }
            this.AmAjAkK += amajakK;
            this.amAjAkK += aMajakK;
            amAjAkK += aMajakK2;
            amAjAkK2 += amAJakK;
            amajAkK += amAJakK2;
            i += this.MAjAkKa;
        }
        this.AMAjAkK = amAjAkK;
        this.aMAjAkK = amAjAkK2;
        this.AmajAkK = amajAkK;
    }
    
    void AMAjAKK(int i, final int n) {
        final int amajakK = this.amajakK;
        final int aMajakK = this.AMajakK;
        final int aMajakK2 = this.aMajakK;
        final int amAJakK = this.AmAJakK;
        final int amAJakK2 = this.amAJakK;
        int amAjAkK = this.AMAjAkK;
        int amAjAkK2 = this.aMAjAkK;
        int amajAkK = this.AmajAkK;
        final int amAjakK = this.AmAjakK;
        final int amAjakK2 = this.amAjakK;
        final int amAjakK3 = this.AMAjakK;
        final int n2 = amAjakK >> 8;
        final int n3 = amAjakK2 >> 8;
        final int n4 = amAjakK3 >> 8;
        final byte[] kamAJaK = this.mAJAkKa.kamAJaK;
        final int[] amAjakk = this.MajAkKa.AMAjakk;
        final int[] amAjakk2 = this.majAkKa.AMAjakk;
        while (i < n) {
            int mAjAkKa = this.AmAjAkK >> 16;
            int mAjAkKa2 = this.amAjAkK >> 16;
            if (mAjAkKa < 0) {
                mAjAkKa = 0;
            }
            else if (mAjAkKa > this.MAjAkKa) {
                mAjAkKa = this.MAjAkKa;
            }
            if (mAjAkKa2 < 0) {
                mAjAkKa2 = 0;
            }
            else if (mAjAkKa2 > this.MAjAkKa) {
                mAjAkKa2 = this.MAjAkKa;
            }
            final int n5 = -(this.AmAjAkK - (mAjAkKa << 16) + 255 >> 8);
            int n6 = amAjAkK + n5 * n2;
            int n7 = amAjAkK2 + n5 * n3;
            int n8 = amajAkK + n5 * n4;
            int n9;
            int n10;
            for (int j = i + mAjAkKa; j < i + mAjAkKa2; amAjakk2[j++] = (n9 - n10 | n10 - (n10 >> 8))) {
                n9 = amAjakk2[j] + amAjakk[((n8 += amAjakK3) >>> 24 << 8) + (kamAJaK[((n7 += amAjakK2) >>> 24 << 8) + ((n6 += amAjakK) >>> 24)] & 0xFF)];
                n10 = (n9 & 0x10040100);
            }
            this.AmAjAkK += amajakK;
            this.amAjAkK += aMajakK;
            amAjAkK += aMajakK2;
            amAjAkK2 += amAJakK;
            amajAkK += amAJakK2;
            i += this.MAjAkKa;
        }
        this.AMAjAkK = amAjAkK;
        this.aMAjAkK = amAjAkK2;
        this.AmajAkK = amajAkK;
    }
    
    void amajakK(int i, final int n) {
        final int amajakK = this.amajakK;
        final int aMajakK = this.AMajakK;
        final int aMajakK2 = this.aMajakK;
        final int amAJakK = this.AmAJakK;
        final int amAJakK2 = this.amAJakK;
        int amAjAkK = this.AMAjAkK;
        int amAjAkK2 = this.aMAjAkK;
        int amajAkK = this.AmajAkK;
        final int amAjakK = this.AmAjakK;
        final int amAjakK2 = this.amAjakK;
        final int amAjakK3 = this.AMAjakK;
        final int n2 = amAjakK >> 8;
        final int n3 = amAjakK2 >> 8;
        final int n4 = amAjakK3 >> 8;
        final byte[] kamAJaK = this.mAJAkKa.kamAJaK;
        final int[] amAjakk = this.MajAkKa.AMAjakk;
        final int[] amAjakk2 = this.majAkKa.AMAjakk;
        while (i < n) {
            int mAjAkKa = this.AmAjAkK >> 16;
            int mAjAkKa2 = this.amAjAkK >> 16;
            if (mAjAkKa < 0) {
                mAjAkKa = 0;
            }
            else if (mAjAkKa > this.MAjAkKa) {
                mAjAkKa = this.MAjAkKa;
            }
            if (mAjAkKa2 < 0) {
                mAjAkKa2 = 0;
            }
            else if (mAjAkKa2 > this.MAjAkKa) {
                mAjAkKa2 = this.MAjAkKa;
            }
            final int n5 = -(this.AmAjAkK - (mAjAkKa << 16) + 255 >> 8);
            int n6 = amAjAkK + n5 * n2;
            int n7 = amAjAkK2 + n5 * n3;
            int n8 = amajAkK + n5 * n4;
            int n9;
            int n10;
            for (int j = i + mAjAkKa; j < i + mAjAkKa2; amAjakk2[j++] = (n9 - n10 | n10 - (n10 >> 8))) {
                n9 = ((amAjakk2[j] & 0xFE3F8FE) >> 1) + amAjakk[((n8 += amAjakK3) >>> 24 << 8) + (kamAJaK[((n7 += amAjakK2) >>> 24 << 8) + ((n6 += amAjakK) >>> 24)] & 0xFF)];
                n10 = (n9 & 0x10040100);
            }
            this.AmAjAkK += amajakK;
            this.amAjAkK += aMajakK;
            amAjAkK += aMajakK2;
            amAjAkK2 += amAJakK;
            amajAkK += amAJakK2;
            i += this.MAjAkKa;
        }
        this.AMAjAkK = amAjAkK;
        this.aMAjAkK = amAjAkK2;
        this.AmajAkK = amajAkK;
    }
    
    void AMajakK(int i, final int n) {
        final int amajakK = this.amajakK;
        final int aMajakK = this.AMajakK;
        final int aMajakK2 = this.aMajakK;
        final int amAJakK = this.AmAJakK;
        final int amAJakK2 = this.amAJakK;
        int amAjAkK = this.AMAjAkK;
        int amAjAkK2 = this.aMAjAkK;
        int amajAkK = this.AmajAkK;
        final int amAjakK = this.AmAjakK;
        final int amAjakK2 = this.amAjakK;
        final int amAjakK3 = this.AMAjakK;
        final int n2 = amAjakK >> 8;
        final int n3 = amAjakK2 >> 8;
        final int n4 = amAjakK3 >> 8;
        final byte[] kamAJaK = this.mAJAkKa.kamAJaK;
        final int[] amAjakk = this.MajAkKa.AMAjakk;
        final int[] amAjakk2 = this.majAkKa.AMAjakk;
        while (i < n) {
            int mAjAkKa = this.AmAjAkK >> 16;
            int mAjAkKa2 = this.amAjAkK >> 16;
            if (mAjAkKa < 0) {
                mAjAkKa = 0;
            }
            else if (mAjAkKa > this.MAjAkKa) {
                mAjAkKa = this.MAjAkKa;
            }
            if (mAjAkKa2 < 0) {
                mAjAkKa2 = 0;
            }
            else if (mAjAkKa2 > this.MAjAkKa) {
                mAjAkKa2 = this.MAjAkKa;
            }
            final int n5 = -(this.AmAjAkK - (mAjAkKa << 16) + 255 >> 8);
            int n6 = amAjAkK + n5 * n2;
            int n7 = amAjAkK2 + n5 * n3;
            int n8 = amajAkK + n5 * n4;
            int n9;
            int n10;
            for (int j = i + mAjAkKa; j < i + mAjAkKa2; amAjakk2[j++] = (n9 - n10 | n10 - (n10 >> 8))) {
                n9 = ((amAjakk2[j] & 0xFC3F0FC) >> 2) + amAjakk[((n8 += amAjakK3) >>> 24 << 8) + (kamAJaK[((n7 += amAjakK2) >>> 24 << 8) + ((n6 += amAjakK) >>> 24)] & 0xFF)];
                n10 = (n9 & 0x10040100);
            }
            this.AmAjAkK += amajakK;
            this.amAjAkK += aMajakK;
            amAjAkK += aMajakK2;
            amAjAkK2 += amAJakK;
            amajAkK += amAJakK2;
            i += this.MAjAkKa;
        }
        this.AMAjAkK = amAjAkK;
        this.aMAjAkK = amAjAkK2;
        this.AmajAkK = amajAkK;
    }
}
