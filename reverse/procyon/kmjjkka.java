import java.awt.Point;
import java.util.Hashtable;
import java.awt.Image;
import java.awt.image.ImageProducer;
import java.awt.image.ColorModel;
import java.awt.image.ImageConsumer;

// 
// Decompiled by Procyon v0.6.0
// 

final class kmjjkka implements ImageConsumer
{
    int AMAjaKK;
    int aMAjaKK;
    int AmajaKK;
    byte[] amajaKK;
    int[] AMajaKK;
    ColorModel aMajaKK;
    kaajkkk AmAJaKK;
    private boolean amAJaKK;
    private boolean AMAJaKK;
    private int aMAJaKK;
    private ImageProducer AmaJaKK;
    private static int[][][] amaJaKK;
    private static int[] AMaJaKK;
    private int aMaJaKK;
    private int[] AmAjAkk;
    
    kmjjkka(final ImageProducer amaJaKK, final kaajkkk amAJaKK) {
        this.AmAjAkk = new int[4];
        this.AmaJaKK = amaJaKK;
        this.AmAJaKK = amAJaKK;
        amaJaKK.startProduction(this);
        this.AMaJaKK();
    }
    
    kmjjkka(final Image image, final kaajkkk kaajkkk) {
        this(image.getSource(), kaajkkk);
        image.flush();
    }
    
    kmjjkka(final int[] aMajaKK, final int amAjaKK, final int amAjaKK2, final kaajkkk amAJaKK) {
        this.AmAjAkk = new int[4];
        this.AMajaKK = aMajaKK;
        this.AMAjaKK = amAjaKK;
        this.aMAjaKK = amAjaKK2;
        this.AmAJaKK = amAJaKK;
        this.AmajaKK = 32;
    }
    
    kmjjkka(final byte[] amajaKK, final int amAjaKK, final int amAjaKK2, final kaajkkk amAJaKK) {
        this.AmAjAkk = new int[4];
        this.amajaKK = amajaKK;
        this.AMAjaKK = amAjaKK;
        this.aMAjaKK = amAjaKK2;
        this.AmAJaKK = amAJaKK;
        this.AmajaKK = 8;
    }
    
    synchronized void AMaJaKK() {
        this.AMAJaKK = true;
        try {
            while (this.AMAJaKK) {
                if (this.AmaJaKK == null) {
                    break;
                }
                this.wait();
            }
        }
        catch (final InterruptedException ex) {
            this.amajaKK = null;
            this.AMajaKK = null;
            final int n = 0;
            this.aMAjaKK = n;
            this.AMAjaKK = n;
            this.amAJaKK = false;
        }
        finally {
            this.AMAJaKK = false;
            this.AmaJaKK = null;
            if (this.amAJaKK && this.AMajaKK != null) {
                int[] aMajaKK;
                int n2;
                for (int i = this.AMAjaKK * this.aMAjaKK; i > 0; --i, aMajaKK = this.AMajaKK, n2 = i, aMajaKK[n2] |= 0xFF000000) {}
            }
        }
    }
    
    public synchronized void imageComplete(final int n) {
        this.amAJaKK = (n == 3);
        this.AMAJaKK = false;
        switch (n) {
            default: {
                this.aMAJaKK |= 0xC0;
                break;
            }
            case 4: {
                this.aMAJaKK |= 0x80;
                break;
            }
            case 3: {
                this.aMAJaKK |= 0x20;
                break;
            }
            case 2: {
                this.aMAJaKK |= 0x10;
                break;
            }
        }
        if (this.AmaJaKK != null) {
            this.AmaJaKK.removeConsumer(this);
        }
        this.AmaJaKK = null;
        this.notify();
    }
    
    public void setColorModel(final ColorModel aMajaKK) {
        this.aMajaKK = aMajaKK;
    }
    
    public void setDimensions(final int amAjaKK, final int amAjaKK2) {
        this.AMAjaKK = amAjaKK;
        this.aMAjaKK = amAjaKK2;
    }
    
    public void setHints(final int n) {
    }
    
    public void setPixels(final int n, final int n2, final int n3, final int n4, final ColorModel colorModel, final byte[] array, final int n5, final int n6) {
        if (this.amajaKK == null) {
            this.amajaKK = new byte[this.AMAjaKK * this.aMAjaKK];
            this.AmajaKK = 8;
        }
        System.arraycopy(array, n5, this.amajaKK, this.AMAjaKK * n2 + n, n6);
    }
    
    public void setPixels(final int n, final int n2, final int n3, final int n4, final ColorModel colorModel, final int[] array, final int n5, final int n6) {
        if (this.AMajaKK == null) {
            this.AMajaKK = new int[this.AMAjaKK * this.aMAjaKK];
            this.AmajaKK = 32;
        }
        System.arraycopy(array, n5, this.AMajaKK, this.AMAjaKK * n2 + n, n6);
    }
    
    public void setProperties(final Hashtable hashtable) {
    }
    
    private static void AmaJaKK() {
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                kmjjkka.amaJaKK[i][j][0] = (8 - i) * (8 - j);
                kmjjkka.amaJaKK[i][j][1] = i * (8 - j);
                kmjjkka.amaJaKK[i][j][2] = (8 - i) * j;
                kmjjkka.amaJaKK[i][j][3] = i * j;
                int n = 0;
                int n2 = 0;
                for (int k = 0; k <= 3; ++k) {
                    kmjjkka.amaJaKK[i][j][k] = (kmjjkka.amaJaKK[i][j][k] + 4) / 8;
                    n2 += kmjjkka.amaJaKK[i][j][k];
                    if (kmjjkka.amaJaKK[i][j][k] > kmjjkka.amaJaKK[i][j][n]) {
                        n = k;
                    }
                }
                final int n3 = 8 - n2;
                final int[] array = kmjjkka.amaJaKK[i][j];
                final int n4 = n;
                array[n4] += n3;
            }
        }
    }
    
    static int aMaJaKK(final int n, final int n2) {
        int n3 = n / n2;
        if (n < 0) {
            --n3;
        }
        return n - n3 * n2;
    }
    
    static int amaJaKK(final int n, final int n2) {
        int n3 = n / n2;
        if (n < 0) {
            --n3;
        }
        return n - n3 * n2;
    }
    
    private int AmAjAkk(int i, final int n, final int n2) {
        if (n > 0) {
            while (i > n2) {
                i -= n2;
            }
            final int aMaJaKK = (n2 - i + n - 1) / n;
            if (this.aMaJaKK > aMaJaKK) {
                this.aMaJaKK = aMaJaKK;
            }
        }
        else if (n < 0) {
            while (i < 0) {
                i += n2;
            }
            final int aMaJaKK2 = (i - n - 1) / -n;
            if (this.aMaJaKK > aMaJaKK2) {
                this.aMaJaKK = aMaJaKK2;
            }
        }
        return i;
    }
    
    int aMAJaKK(int n, int n2) {
        if (n < 0) {
            n = 0;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 >= this.aMAjaKK) {
            n2 = this.aMAjaKK - 1;
        }
        if (n >= this.AMAjaKK) {
            n = this.AMAjaKK - 1;
        }
        final int n3 = n2 * this.AMAjaKK;
        if (this.AmajaKK == 8) {
            return this.AmAJaKK.jaKKamA(this.amajaKK[n3 + n]);
        }
        return this.AMajaKK[n3 + n];
    }
    
    int AMAJaKK(final int n, final int n2) {
        int n3 = n >> 16;
        int n4 = n2 >> 16;
        final int n5 = (n & 0xFFFF) >> 13;
        final int n6 = (n2 & 0xFFFF) >> 13;
        this.AmAjAkk[0] = kmjjkka.amaJaKK[n5][n6][0];
        this.AmAjAkk[1] = kmjjkka.amaJaKK[n5][n6][1];
        this.AmAjAkk[2] = kmjjkka.amaJaKK[n5][n6][2];
        this.AmAjAkk[3] = kmjjkka.amaJaKK[n5][n6][3];
        if (n3 < 0) {
            n3 = 0;
            final int[] amAjAkk = this.AmAjAkk;
            final int n7 = 0;
            amAjAkk[n7] += this.AmAjAkk[1];
            this.AmAjAkk[1] = 0;
            final int[] amAjAkk2 = this.AmAjAkk;
            final int n8 = 2;
            amAjAkk2[n8] += this.AmAjAkk[3];
            this.AmAjAkk[3] = 0;
        }
        else if (n3 >= this.AMAjaKK - 1) {
            n3 = this.AMAjaKK - 2;
            final int[] amAjAkk3 = this.AmAjAkk;
            final int n9 = 1;
            amAjAkk3[n9] += this.AmAjAkk[0];
            this.AmAjAkk[0] = 0;
            final int[] amAjAkk4 = this.AmAjAkk;
            final int n10 = 3;
            amAjAkk4[n10] += this.AmAjAkk[2];
            this.AmAjAkk[2] = 0;
        }
        if (n4 < 0) {
            n4 = 0;
            final int[] amAjAkk5 = this.AmAjAkk;
            final int n11 = 0;
            amAjAkk5[n11] += this.AmAjAkk[2];
            this.AmAjAkk[2] = 0;
            final int[] amAjAkk6 = this.AmAjAkk;
            final int n12 = 1;
            amAjAkk6[n12] += this.AmAjAkk[3];
            this.AmAjAkk[3] = 0;
        }
        else if (n4 >= this.aMAjaKK - 1) {
            n4 = this.aMAjaKK - 2;
            final int[] amAjAkk7 = this.AmAjAkk;
            final int n13 = 2;
            amAjAkk7[n13] += this.AmAjAkk[0];
            this.AmAjAkk[0] = 0;
            final int[] amAjAkk8 = this.AmAjAkk;
            final int n14 = 3;
            amAjAkk8[n14] += this.AmAjAkk[1];
            this.AmAjAkk[1] = 0;
        }
        long n15 = 0L;
        final int n16 = n4 * this.AMAjaKK;
        if (this.AmajaKK != 8) {
            final int n17 = n16 + n3;
            final int n18 = this.AMajaKK[n17];
            final long n19 = ((n18 & 0xFF0000) << 5 | (n18 & 0xFF00) << 2 | (n18 & 0xFF) >>> 1) * (long)this.AmAjAkk[0];
            final int n20 = this.AMajaKK[n17 + 1];
            final long n21 = n19 + ((n20 & 0xFF0000) << 5 | (n20 & 0xFF00) << 2 | (n20 & 0xFF) >>> 1) * (long)this.AmAjAkk[1];
            final int n22 = n17 + this.AMAjaKK;
            final long n23 = n21;
            final int n24 = this.AMajaKK[n22];
            final long n25 = n23 + ((n24 & 0xFF0000) << 5 | (n24 & 0xFF00) << 2 | (n24 & 0xFF) >>> 1) * (long)this.AmAjAkk[2];
            final int n26 = this.AMajaKK[n22 + 1];
            n15 = n25 + ((n26 & 0xFF0000) << 5 | (n26 & 0xFF00) << 2 | (n26 & 0xFF) >>> 1) * (long)this.AmAjAkk[3];
        }
        final int n27 = (int)n15;
        return (n27 >>> 8 & 0xFF0000) | (n27 >>> 5 & 0xFF00) | (n27 >>> 2 & 0xFF);
    }
    
    void aMajaKK(final kaaammk kaaammk, final Point point, int n, final byte[] array, int n2) {
        if (kaaammk.Ajakkam != 0) {
            while (n-- > 0) {
                array[n2++] = (byte)this.AmAJaKK.JaKKamA(this.AMajaKK[(point.y >> 16) * this.AMAjaKK + (point.x >> 16)]);
                point.x += kaaammk.aJAkkam;
                point.y += kaaammk.Ajakkam;
            }
            return;
        }
        final int n3 = (point.y >> 16) * this.AMAjaKK;
        if (Math.abs(kaaammk.aJAkkam - 65536) < 256) {
            int n4 = n3 + (point.x >> 16);
            point.x += n * kaaammk.aJAkkam;
            while (n-- > 0) {
                array[n2++] = (byte)this.AmAJaKK.JaKKamA(this.AMajaKK[n4++]);
            }
            return;
        }
        while (n-- > 0) {
            array[n2++] = (byte)this.AmAJaKK.JaKKamA(this.AMajaKK[n3 + (point.x >> 16)]);
            point.x += kaaammk.aJAkkam;
        }
    }
    
    void amAJaKK(final kaaammk kaaammk, final Point point, int n, final int[] array, int n2) {
        if (kaaammk.Ajakkam != 0) {
            while (n-- > 0) {
                array[n2++] = this.AMajaKK[(point.y >> 16) * this.AMAjaKK + (point.x >> 16)];
                point.x += kaaammk.aJAkkam;
                point.y += kaaammk.Ajakkam;
            }
            return;
        }
        final int n3 = (point.y >> 16) * this.AMAjaKK;
        if (Math.abs(kaaammk.aJAkkam - 65536) < 256) {
            int n4 = n3 + (point.x >> 16);
            point.x += n * kaaammk.aJAkkam;
            while (n-- > 0) {
                array[n2++] = this.AMajaKK[n4++];
            }
            return;
        }
        while (n-- > 0) {
            array[n2++] = this.AMajaKK[n3 + (point.x >> 16)];
            point.x += kaaammk.aJAkkam;
        }
    }
    
    private void AmAJaKK(final kaaammk kaaammk, final Point point, final int n, final int[] array) {
        int n2 = 0;
        if (kaaammk.Ajakkam == 0) {
            final int n3 = (point.y >> 16) * this.AMAjaKK;
            for (int i = n; i > 0; --i) {
                array[n2] = this.AMajaKK[n3 + (point.x >> 16)];
                ++n2;
                point.x += kaaammk.aJAkkam;
            }
            return;
        }
        for (int j = n; j > 0; --j) {
            array[n2] = this.AMajaKK[(point.y >> 16) * this.AMAjaKK + (point.x >> 16)];
            ++n2;
            point.x += kaaammk.aJAkkam;
            point.y += kaaammk.Ajakkam;
        }
    }
    
    void AMajaKK(final int n, int i, int n2, final kaaammk kaaammk) {
        final Point point = new Point(0, 0);
        final byte[] maJakkA = this.AmAJaKK.MAJakkA;
        final int[] maJakkA2 = this.AmAJaKK.mAJakkA;
        point.x = i << 16;
        point.y = this.AmAJaKK.majAkkA << 16;
        kaaammk.ajaKKam.akKaMaj(point, point);
        final int n3 = this.AMAjaKK << 16;
        final int n4 = this.aMAjaKK << 16;
        if (kaaammk.ajakKam == 65) {
            int amAjaKK = this.AMAjaKK;
            int amAjaKK2 = this.aMAjaKK;
            if (kaaammk.ajAkkam) {
                --amAjaKK2;
                --amAjaKK;
            }
            final Point point2 = new Point(0, 0);
            final int n5 = n2 - i;
            point2.x = point.x + kaaammk.aJAkkam * n5;
            point2.y = point.y + kaaammk.Ajakkam * n5;
            while (true) {
                final int n6 = point.x >> 16;
                final int n7 = point.y >> 16;
                if ((n6 >= 0 && n7 >= 0 && n6 < amAjaKK && n7 < amAjaKK2) || i >= n2) {
                    break;
                }
                int n8;
                if (kaaammk.ajAkkam) {
                    n8 = this.AMAJaKK(point.x, point.y);
                }
                else {
                    n8 = this.aMAJaKK(n6, n7);
                }
                if (kaaammk.aJaKKam != null) {
                    n8 = kaaammk.aJaKKam.KkamAJA(n8);
                }
                if (maJakkA != null) {
                    maJakkA[i + n] = (byte)this.AmAJaKK.JaKKamA(n8);
                }
                else {
                    maJakkA2[i + n] = n8;
                }
                final Point point3 = point;
                point3.x += kaaammk.aJAkkam;
                final Point point4 = point;
                point4.y += kaaammk.Ajakkam;
                ++i;
            }
            while (true) {
                final int n9 = point2.x >> 16;
                final int n10 = point2.y >> 16;
                if ((n9 >= 0 && n10 >= 0 && n9 < amAjaKK && n10 < amAjaKK2) || i >= n2) {
                    break;
                }
                int n11;
                if (kaaammk.ajAkkam) {
                    n11 = this.AMAJaKK(point2.x, point2.y);
                }
                else {
                    n11 = this.aMAJaKK(n9, n10);
                }
                --n2;
                if (kaaammk.aJaKKam != null) {
                    n11 = kaaammk.aJaKKam.KkamAJA(n11);
                }
                if (maJakkA != null) {
                    maJakkA[n2 + n] = (byte)n11;
                }
                else {
                    maJakkA2[n2 + n] = n11;
                }
                final Point point5 = point2;
                point5.x -= kaaammk.aJAkkam;
                final Point point6 = point2;
                point6.y -= kaaammk.Ajakkam;
            }
        }
        else {
            point.x = aMaJaKK(point.x, n3);
            point.y = aMaJaKK(point.y, n4);
        }
        if (kaaammk.AJAkkam) {
            while (i < n2) {
                this.aMaJaKK = Math.min(n2 - i, 256);
                point.x = this.AmAjAkk(point.x, kaaammk.aJAkkam, n3);
                point.y = this.AmAjAkk(point.y, kaaammk.Ajakkam, n4);
                if (maJakkA != null) {
                    this.aMajaKK(kaaammk, point, this.aMaJaKK, maJakkA, i + n);
                }
                else {
                    this.amAJaKK(kaaammk, point, this.aMaJaKK, maJakkA2, i + n);
                }
                i += this.aMaJaKK;
            }
            return;
        }
        while (i < n2) {
            this.aMaJaKK = Math.min(n2 - i, 256);
            point.x = this.AmAjAkk(point.x, kaaammk.aJAkkam, n3);
            point.y = this.AmAjAkk(point.y, kaaammk.Ajakkam, n4);
            if (maJakkA != null) {
                this.AmAJaKK(kaaammk, point, this.aMaJaKK, kmjjkka.AMaJaKK);
            }
            else {
                this.AmAJaKK(kaaammk, point, this.aMaJaKK, kmjjkka.AMaJaKK);
            }
            if (kaaammk.aJaKKam != null) {
                kaaammk.aJaKKam.KKamAJA(kmjjkka.AMaJaKK, this.aMaJaKK);
            }
            if (maJakkA != null) {
                for (int n12 = i + n, n13 = 0, j = this.aMaJaKK; j > 0; --j, ++n12, ++n13) {
                    maJakkA[n12] = (byte)this.AmAJaKK.JaKKamA(kmjjkka.AMaJaKK[n13]);
                }
            }
            else {
                for (int n14 = i + n, n15 = 0, k = this.aMaJaKK; k > 0; --k, ++n14, ++n15) {
                    maJakkA2[n14] = kmjjkka.AMaJaKK[n15];
                }
            }
            i += this.aMaJaKK;
        }
    }
    
    static {
        kmjjkka.amaJaKK = new int[8][8][4];
        AmaJaKK();
        kmjjkka.AMaJaKK = new int[256];
    }
}
