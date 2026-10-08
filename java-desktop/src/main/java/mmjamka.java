// 
// Decompiled by Procyon v0.6.0
// 

public class mmjamka
{
    boolean KaMaJAk;
    boolean kaMaJAk;
    int KAMaJAk;
    float kAMaJAk;
    int KamaJAk;
    int kamaJAk;
    mmajkka KAmaJAk;
    int kAmaJAk;
    int KaMAJAk;
    int kaMAJAk;
    int KAMAJAk;
    static final float kAMAJAk = 1.5258789E-5f;
    static final int KamAJAk = 0;
    
    public mmjamka(final mmajkka kAmaJAk, final int kamaJAk, final int kamaJAk2) {
        this.KaMaJAk = true;
        this.kaMaJAk = false;
        this.KAMaJAk = 41984040;
        this.kAMaJAk = -0.18f;
        this.KaMAJAk = 512;
        this.KAMAJAk = 256;
        this.KAmaJAk = kAmaJAk;
        this.KamaJAk = kamaJAk;
        this.kamaJAk = kamaJAk2;
    }
    
    public void KAmaJAk(final int kaMaJAk) {
        this.KAMaJAk = kaMaJAk;
    }
    
    public void KAmAjak(final float kaMaJAk) {
        this.kAMaJAk = kaMaJAk;
    }
    
    public void kamaJAk(final boolean kaMaJAk) {
        this.KaMaJAk = kaMaJAk;
    }
    
    public void KaMaJAk(final kajjkka kajjkka) {
        final int kaMaJAk = this.kAMaJAk(kajjkka.amAJAkk.kaMAjAK * 1.5258789E-5f, kajjkka.amAJAkk.KAMAjAK * 1.5258789E-5f);
        final int kaMaJAk2 = this.kAMaJAk(kajjkka.AMAJAkk.kaMAjAK * 1.5258789E-5f, kajjkka.AMAJAkk.KAMAjAK * 1.5258789E-5f);
        final int kaMaJAk3 = this.kAMaJAk(kajjkka.aMAJAkk.kaMAjAK * 1.5258789E-5f, kajjkka.aMAJAkk.KAMAjAK * 1.5258789E-5f);
        this.kaMaJAk(kaMaJAk, kaMaJAk2, kajjkka.amAJAkk.kaMAjAK * 1.5258789E-5f, kajjkka.amAJAkk.KAMAjAK * 1.5258789E-5f, kajjkka.AMAJAkk.kaMAjAK * 1.5258789E-5f, kajjkka.AMAJAkk.KAMAjAK * 1.5258789E-5f, kajjkka.amAJAkk.KaMAjAK);
        this.kaMaJAk(kaMaJAk2, kaMaJAk3, kajjkka.AMAJAkk.kaMAjAK * 1.5258789E-5f, kajjkka.AMAJAkk.KAMAjAK * 1.5258789E-5f, kajjkka.aMAJAkk.kaMAjAK * 1.5258789E-5f, kajjkka.aMAJAkk.KAMAjAK * 1.5258789E-5f, kajjkka.AMAJAkk.KaMAjAK);
        this.kaMaJAk(kaMaJAk3, kaMaJAk, kajjkka.aMAJAkk.kaMAjAK * 1.5258789E-5f, kajjkka.aMAJAkk.KAMAjAK * 1.5258789E-5f, kajjkka.amAJAkk.kaMAjAK * 1.5258789E-5f, kajjkka.amAJAkk.KAMAjAK * 1.5258789E-5f, kajjkka.aMAJAkk.KaMAjAK);
    }
    
    int kAMaJAk(final float n, final float n2) {
        int n3 = 0;
        if (n2 > this.KAMAJAk) {
            n3 |= 0x8;
        }
        else if (n2 < this.kaMAJAk) {
            n3 |= 0x4;
        }
        if (n > this.KaMAJAk) {
            n3 |= 0x2;
        }
        else if (n < this.kAmaJAk) {
            n3 |= 0x1;
        }
        return n3;
    }
    
    void kaMaJAk(final int n, final int n2, float n3, float n4, float n5, float n6, final float n7) {
        if ((n & n2) == 0x0) {
            float n8 = n3;
            float n9 = n4;
            float n10 = n5;
            float n11 = n6;
            boolean b = false;
            if ((n | n2) != 0x0) {
                if ((n & 0x8) == 0x8) {
                    n8 = n3 + (n5 - n3) * (this.KAMAJAk - n4) / (n6 - n4);
                    n9 = (float)this.KAMAJAk;
                    b = true;
                }
                else if ((n & 0x4) == 0x4) {
                    n8 = n3 + (n5 - n3) * (this.kaMAJAk - n4) / (n6 - n4);
                    n9 = (float)this.kaMAJAk;
                    b = true;
                }
                if ((n & 0x2) == 0x2) {
                    if (!b) {
                        n9 = n4 + (n6 - n4) * (this.KaMAJAk - n3) / (n5 - n3);
                    }
                    n8 = (float)this.KaMAJAk;
                }
                else if ((n & 0x1) == 0x1) {
                    if (!b) {
                        n9 = n4 + (n6 - n4) * (this.kAmaJAk - n3) / (n5 - n3);
                    }
                    n8 = (float)this.kAmaJAk;
                }
                n3 = n10;
                n4 = n11;
                n5 = n8;
                n6 = n9;
                boolean b2 = false;
                if ((n2 & 0x8) == 0x8) {
                    n10 = n3 + (n5 - n3) * (this.KAMAJAk - n4) / (n6 - n4);
                    n11 = (float)this.KAMAJAk;
                    b2 = true;
                }
                else if ((n2 & 0x4) == 0x4) {
                    n10 = n3 + (n5 - n3) * (this.kaMAJAk - n4) / (n6 - n4);
                    n11 = (float)this.kaMAJAk;
                    b2 = true;
                }
                if ((n2 & 0x2) == 0x2) {
                    if (!b2) {
                        n11 = n4 + (n6 - n4) * (this.KaMAJAk - n3) / (n5 - n3);
                    }
                    n10 = (float)this.KaMAJAk;
                }
                else if ((n2 & 0x1) == 0x1) {
                    if (!b2) {
                        n11 = n4 + (n6 - n4) * (this.kAmaJAk - n3) / (n5 - n3);
                    }
                    n10 = (float)this.kAmaJAk;
                }
            }
            if (this.KaMaJAk) {
                this.KamaJAk(n8, n9, n10, n11, this.KAMaJAk, 32, 5);
                return;
            }
            if (this.kaMaJAk) {
                this.kamAjak(n8, n9, n10, n11, (int)(this.kAMaJAk * n7), 32, 5);
                return;
            }
            this.KamAjak(n8, n9, n10, n11, (int)(this.kAMaJAk * n7), 32, 5);
        }
    }
    
    void kAmAjak(final int n, final int n2, float n3, float n4, float n5, float n6, final float n7) {
        if ((n & n2) == 0x0) {
            float n8 = n3;
            float n9 = n4;
            float n10 = n5;
            float n11 = n6;
            boolean b = false;
            if ((n | n2) != 0x0) {
                if ((n & 0x8) == 0x8) {
                    n8 = n3 + (n5 - n3) * (this.KAMAJAk - n4) / (n6 - n4);
                    n9 = (float)this.KAMAJAk;
                    b = true;
                }
                else if ((n & 0x4) == 0x4) {
                    n8 = n3 + (n5 - n3) * (this.kaMAJAk - n4) / (n6 - n4);
                    n9 = (float)this.kaMAJAk;
                    b = true;
                }
                if ((n & 0x2) == 0x2) {
                    if (!b) {
                        n9 = n4 + (n6 - n4) * (this.KaMAJAk - n3) / (n5 - n3);
                    }
                    n8 = (float)this.KaMAJAk;
                }
                else if ((n & 0x1) == 0x1) {
                    if (!b) {
                        n9 = n4 + (n6 - n4) * (this.kAmaJAk - n3) / (n5 - n3);
                    }
                    n8 = (float)this.kAmaJAk;
                }
                n3 = n10;
                n4 = n11;
                n5 = n8;
                n6 = n9;
                boolean b2 = false;
                if ((n2 & 0x8) == 0x8) {
                    n10 = n3 + (n5 - n3) * (this.KAMAJAk - n4) / (n6 - n4);
                    n11 = (float)this.KAMAJAk;
                    b2 = true;
                }
                else if ((n2 & 0x4) == 0x4) {
                    n10 = n3 + (n5 - n3) * (this.kaMAJAk - n4) / (n6 - n4);
                    n11 = (float)this.kaMAJAk;
                    b2 = true;
                }
                if ((n2 & 0x2) == 0x2) {
                    if (!b2) {
                        n11 = n4 + (n6 - n4) * (this.KaMAJAk - n3) / (n5 - n3);
                    }
                    n10 = (float)this.KaMAJAk;
                }
                else if ((n2 & 0x1) == 0x1) {
                    if (!b2) {
                        n11 = n4 + (n6 - n4) * (this.kAmaJAk - n3) / (n5 - n3);
                    }
                    n10 = (float)this.kAmaJAk;
                }
                this.KamAjak(n8, n9, n10, n11, -(int)(5.0 * n7), 32, 5);
            }
        }
    }
    
    void KAMaJAk(final int n, final int n2, int n3) {
        n3 += 255;
        try {
            this.KAmaJAk.AMAjakk[n2 * this.KamaJAk + n] = (n3 & 0xFF);
        }
        catch (final Exception ex) {}
    }
    
    void KamAjak(float n, float n2, float n3, float n4, final int n5, final int n6, final int n7) {
        final int[] amAjakk = this.KAmaJAk.AMAjakk;
        if (n2 > n4) {
            final float n8 = n2;
            n2 = n4;
            n4 = n8;
            final float n9 = n;
            n = n3;
            n3 = n9;
        }
        try {
            amAjakk[(int)n2 * this.KamaJAk + (int)n] = (n5 & 0xFF);
        }
        catch (final Exception ex) {}
        float n10;
        int n11;
        if ((n10 = n3 - n) >= 0.0f) {
            n11 = 1;
        }
        else {
            n11 = -1;
            n10 = -n10;
        }
        float n12;
        if ((n12 = n4 - n2) == 0.0f) {
            while (n10-- > 0.0f) {
                    n += (float)n11;
                    try {
                        amAjakk[(int)n2 * this.KamaJAk + (int)n] = (n5 & 0xFF);
                    }
                    catch (final Exception ex2) {}
            }
            return;
        }
        if (n10 == 0.0f) {
            do {
                ++n2;
                try {
                    amAjakk[(int)n2 * this.KamaJAk + (int)n] = (n5 & 0xFF);
                }
                catch (final Exception ex3) {}
            } while (--n12 > 0.0f);
            return;
        }
        if (n10 == n12) {
            do {
                n += (float)n11;
                ++n2;
                try {
                    amAjakk[(int)n2 * this.KamaJAk + (int)n] = (n5 & 0xFF);
                }
                catch (final Exception ex4) {}
            } while (--n12 > 0.0f);
            return;
        }
        int n14 = 0;
        final int n15 = 16 - n7;
        final int n16 = n6 - 1;
        if (n12 > n10) {
            final int n17 = (int)(((int)n10 << 16) / n12);
            float n18 = n10 / n12;
            float n19 = n + n18 * ((int)(n2 + 0.5) - n2) + n18;
            if (n11 < 0) {
                n18 = -n18;
            }
            while (--n12 > 0.0f) {
                n14 = (n14 + n17 & 0xFFFF);
                ++n2;
                final int n20 = n14 >> n15;
                try {
                    amAjakk[(int)n2 * this.KamaJAk + (int)n19] = (n5 + n20 & 0xFF);
                    amAjakk[((int)n2 + n11) * this.KamaJAk + (int)n19] = (n5 + (n20 ^ n16) & 0xFF);
                }
                catch (final Exception ex5) {}
                n19 += n18;
            }
            try {
                amAjakk[(int)n4 * this.KamaJAk + (int)n3] = (n5 & 0xFF);
                return;
            }
            catch (final Exception ex6) {
                return;
            }
        }
        final int n21 = (int)(((int)n12 << 16) / n10);
        final float n22 = n12 / n10;
        float n23 = n2 + n22 * ((int)(n + 0.5) - n) + n22;
        while (--n10 > 0.0f) {
            n14 = (n14 + n21 & 0xFFFF);
            n += (float)n11;
            final int n24 = n14 >> n15;
            try {
                amAjakk[(int)n23 * this.KamaJAk + (int)n] = (n5 + n24 & 0xFF);
                amAjakk[((int)n23 + 1) * this.KamaJAk + (int)n] = (n5 + (n24 ^ n16) & 0xFF);
            }
            catch (final Exception ex7) {}
            n23 += n22;
        }
        try {
            amAjakk[(int)n4 * this.KamaJAk + (int)n3] = (n5 & 0xFF);
        }
        catch (final Exception ex8) {}
    }
    
    void kamAjak(float n, float n2, float n3, float n4, final int n5, final int n6, final int n7) {
        final int[] amAjakk = this.KAmaJAk.AMAjakk;
        if (n2 > n4) {
            final float n8 = n2;
            n2 = n4;
            n4 = n8;
            final float n9 = n;
            n = n3;
            n3 = n9;
        }
        try {
            amAjakk[(int)n2 * this.KamaJAk + (int)n] = ((n5 & 0xFF) << 20 | (n5 & 0xFF) << 10 | (n5 & 0xFF));
        }
        catch (final Exception ex) {}
        float n10;
        int n11;
        if ((n10 = n3 - n) >= 0.0f) {
            n11 = 1;
        }
        else {
            n11 = -1;
            n10 = -n10;
        }
        float n12;
        if ((n12 = n4 - n2) == 0.0f) {
            while (n10-- > 0.0f) {
                    n += (float)n11;
                    try {
                        amAjakk[(int)n2 * this.KamaJAk + (int)n] = ((n5 & 0xFF) << 20 | (n5 & 0xFF) << 10 | (n5 & 0xFF));
                    }
                    catch (final Exception ex2) {}
            }
            return;
        }
        if (n10 == 0.0f) {
            do {
                ++n2;
                try {
                    amAjakk[(int)n2 * this.KamaJAk + (int)n] = ((n5 & 0xFF) << 20 | (n5 & 0xFF) << 10 | (n5 & 0xFF));
                }
                catch (final Exception ex3) {}
            } while (--n12 > 0.0f);
            return;
        }
        if (n10 == n12) {
            do {
                n += (float)n11;
                ++n2;
                try {
                    amAjakk[(int)n2 * this.KamaJAk + (int)n] = ((n5 & 0xFF) << 20 | (n5 & 0xFF) << 10 | (n5 & 0xFF));
                }
                catch (final Exception ex4) {}
            } while (--n12 > 0.0f);
            return;
        }
        int n14 = 0;
        final int n15 = 16 - n7;
        final int n16 = n6 - 1;
        if (n12 > n10) {
            final int n17 = (int)(((int)n10 << 16) / n12);
            float n18 = n10 / n12;
            float n19 = n + n18 * ((int)(n2 + 0.5) - n2) + n18;
            if (n11 < 0) {
                n18 = -n18;
            }
            while (--n12 > 0.0f) {
                n14 = (n14 + n17 & 0xFFFF);
                ++n2;
                final int n20 = n14 >> n15;
                try {
                    final int n21 = n5 + n20;
                    amAjakk[(int)n2 * this.KamaJAk + (int)n19] = ((n21 & 0xFF) << 20 | (n21 & 0xFF) << 10 | (n21 & 0xFF));
                    final int n22 = n5 + (n20 ^ n16);
                    amAjakk[((int)n2 + n11) * this.KamaJAk + (int)n19] = ((n22 & 0xFF) << 20 | (n22 & 0xFF) << 10 | (n22 & 0xFF));
                }
                catch (final Exception ex5) {}
                n19 += n18;
            }
            try {
                amAjakk[(int)n4 * this.KamaJAk + (int)n3] = ((n5 & 0xFF) << 20 | (n5 & 0xFF) << 10 | (n5 & 0xFF));
                return;
            }
            catch (final Exception ex6) {
                return;
            }
        }
        final int n23 = (int)(((int)n12 << 16) / n10);
        final float n24 = n12 / n10;
        float n25 = n2 + n24 * ((int)(n + 0.5) - n) + n24;
        while (--n10 > 0.0f) {
            n14 = (n14 + n23 & 0xFFFF);
            n += (float)n11;
            final int n26 = n14 >> n15;
            try {
                final int n27 = n5 + n26;
                amAjakk[(int)n25 * this.KamaJAk + (int)n] = ((n27 & 0xFF) << 20 | (n27 & 0xFF) << 10 | (n27 & 0xFF));
                final int n28 = n5 + (n26 ^ n16);
                amAjakk[((int)n25 + 1) * this.KamaJAk + (int)n] = ((n28 & 0xFF) << 20 | (n28 & 0xFF) << 10 | (n28 & 0xFF));
            }
            catch (final Exception ex7) {}
            n25 += n24;
        }
        try {
            amAjakk[(int)n4 * this.KamaJAk + (int)n3] = ((n5 & 0xFF) << 20 | (n5 & 0xFF) << 10 | (n5 & 0xFF));
        }
        catch (final Exception ex8) {}
    }
    
    void KamaJAk(float n, float n2, float n3, float n4, final int n5, final int n6, final int n7) {
        final int[] amAjakk = this.KAmaJAk.AMAjakk;
        final int n8 = (int)n2 * this.KamaJAk + (int)n;
        if (n2 > n4) {
            final float n9 = n2;
            n2 = n4;
            n4 = n9;
            final float n10 = n;
            n = n3;
            n3 = n10;
        }
        try {
            final int n11 = amAjakk[n8] + this.KAMaJAk;
            final int n12 = n11 & 0x10040100;
            amAjakk[n8] = (n11 - n12 | n12 - (n12 >> 8));
        }
        catch (final Exception ex) {}
        float n13;
        int n14;
        if ((n13 = n3 - n) >= 0.0f) {
            n14 = 1;
        }
        else {
            n14 = -1;
            n13 = -n13;
        }
        float n15;
        if ((n15 = n4 - n2) == 0.0f) {
            int n16 = n8;
            while (n13-- > 0.0f) {
                    n16 += n14;
                    try {
                        final int n18 = amAjakk[n16] + this.KAMaJAk;
                        final int n19 = n18 & 0x10040100;
                        amAjakk[n16] = (n18 - n19 | n19 - (n19 >> 8));
                    }
                    catch (final Exception ex2) {}
            }
            return;
        }
        if (n13 == 0.0f) {
            int n20 = n8;
            do {
                n20 += this.KamaJAk;
                try {
                    final int n21 = amAjakk[n20] + this.KAMaJAk;
                    final int n22 = n21 & 0x10040100;
                    amAjakk[n20] = (n21 - n22 | n22 - (n22 >> 8));
                }
                catch (final Exception ex3) {}
            } while (--n15 > 0.0f);
            return;
        }
        if (n13 == n15) {
            int n23 = n8;
            do {
                n23 += this.KamaJAk + n14;
                try {
                    final int n24 = amAjakk[n23] + this.KAMaJAk;
                    final int n25 = n24 & 0x10040100;
                    amAjakk[n23] = (n24 - n25 | n25 - (n25 >> 8));
                }
                catch (final Exception ex4) {}
            } while (--n15 > 0.0f);
            return;
        }
        int n26 = 0;
        final int n27 = 16 - n7;
        final int n28 = n6 - 1;
        if (n15 > n13) {
            final int n29 = (int)(((int)n13 << 16) / n15);
            float n30 = n13 / n15;
            final float n31 = n + n30 * ((int)(n2 + 0.5) - n2) + n30;
            int kamaJAk = this.KamaJAk;
            if (n14 < 0) {
                n30 = -n30;
                kamaJAk = -this.KamaJAk;
            }
            final int n32 = (int)n2 * this.KamaJAk + (int)n31;
            float n33 = (int)n2 * this.KamaJAk + n31;
            while (--n15 > 0.0f) {
                n26 = (n26 + n29 & 0xFFFF);
                ++n2;
                final float n34 = n33 + this.KamaJAk;
                try {
                    final int n35 = amAjakk[(int)n34] + this.KAMaJAk;
                    final int n36 = n35 & 0x10040100;
                    amAjakk[(int)n34] = (n35 - n36 | n36 - (n36 >> 8));
                    final int n37 = amAjakk[(int)n34 + kamaJAk] + this.KAMaJAk;
                    final int n38 = n37 & 0x10040100;
                    amAjakk[(int)n34 + kamaJAk] = (n37 - n38 | n38 - (n38 >> 8));
                }
                catch (final Exception ex5) {}
                n33 = n34 + n30;
            }
            try {
                final int n39 = amAjakk[(int)n4 * this.KamaJAk + (int)n3] + this.KAMaJAk;
                final int n40 = n39 & 0x10040100;
                amAjakk[(int)n4 * this.KamaJAk + (int)n3] = (n39 - n40 | n40 - (n40 >> 8));
                return;
            }
            catch (final Exception ex6) {
                return;
            }
        }
        final int n41 = (int)(((int)n15 << 16) / n13);
        final float n42 = n15 / n13;
        float n43 = n2 + n42 * ((int)(n + 0.5) - n) + n42;
        final int n44 = (int)n43 * this.KamaJAk + (int)n;
        while (--n13 > 0.0f) {
            n26 = (n26 + n41 & 0xFFFF);
            n += (float)n14;
            final float n45 = (int)n43 * this.KamaJAk + (int)n + (float)n14;
            try {
                final int n46 = amAjakk[(int)n45] + this.KAMaJAk;
                final int n47 = n46 & 0x10040100;
                amAjakk[(int)n45] = (n46 - n47 | n47 - (n47 >> 8));
                final int n48 = amAjakk[(int)n45 + this.KamaJAk] + this.KAMaJAk;
                final int n49 = n48 & 0x10040100;
                amAjakk[(int)n45 + this.KamaJAk] = (n48 - n49 | n49 - (n49 >> 8));
            }
            catch (final Exception ex7) {}
            n43 += n42;
        }
        try {
            final int n50 = amAjakk[(int)n4 * this.KamaJAk + (int)n3] + this.KAMaJAk;
            final int n51 = n50 & 0x10040100;
            amAjakk[(int)n4 * this.KamaJAk + (int)n3] = (n50 - n51 | n51 - (n51 >> 8));
        }
        catch (final Exception ex8) {}
    }
}
