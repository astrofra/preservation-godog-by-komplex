import java.io.IOException;
import java.awt.image.ImageProducer;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class kajamma extends kmjjmka implements Runnable
{
    int Majakka;
    int majakka;
    int MAjakka;
    int mAjakka;
    kaajmmk MaJAkka;
    int maJAkka;
    int MAJAkka;
    int mAJAkka;
    int MajAkka;
    int majAkka;
    byte[] MAjAkka;
    boolean mAjAkka;
    boolean MaJaKKa;
    int maJaKKa;
    mmajmmk MAJaKKa;
    kaajkkk mAJaKKa;
    private mmaakka MajaKKa;
    int[] majaKKa;
    int MAjaKKa;
    mmjakka[] mAjaKKa;
    Object MaJAKKa;
    int maJAKKa;
    int MAJAKKa;
    boolean mAJAKKa;
    int MajAKKa;
    boolean majAKKa;
    private boolean MAjAKKa;
    private int mAjAKKa;
    private int MaJakKa;
    private int maJakKa;
    private boolean MAJakKa;
    private kmjjmka mAJakKa;
    private int MajakKa;
    private int majakKa;
    private static int MAjakKa;
    private int mAjakKa;
    private int MaJAkKa;
    private InputStream maJAkKa;
    private boolean MAJAkKa;
    
    kajamma(final mmaakka majaKKa, final kaajkkk maJaKKa) {
        this.MAjAkka = new byte[8];
        this.MAJaKKa = new mmajmmk(false);
        this.majaKKa = new int[16];
        this.mAjaKKa = new mmjakka[64];
        this.mAJakKa = new kmjjmka();
        this.MajaKKa = majaKKa;
        this.mAJaKKa = maJaKKa;
        this.MaJAkka = new kaajmmk(0, 0, 600, 600);
        this.MaJAKKa = new kajakmk(0, 0, null, 0, majaKKa);
        this.majAKKa = true;
        this.maJAkKa();
    }
    
    final boolean AmAjakK() {
        return this.maJaKKa < this.MaJakKa + this.maJakKa && this.mAJAKKa;
    }
    
    final int aMAjAkK() {
        final int n = this.maJaKKa - (this.MaJakKa + this.maJakKa);
        if (n > 0 && this.mAJAKKa) {
            return n * this.MAJAkka;
        }
        return 0;
    }
    
    void amAjAkK(final kajakkk kajakkk, final int n) {
        final int majAKka = kajakkk.MajAKka;
        if (majAKka == n || (n != 1 && majAKka > n)) {
            return;
        }
        if (kajakkk.MAjaKka.amAjAKk > 0) {
            final kmjjmka kmjjmka = new kmjjmka();
            final byte[] kaMaJAK = super.KAMaJAK;
            final int amAjAKk = kajakkk.MAjaKka.amAjAKk;
            kmjjmka.KAMaJAK = kaMaJAK;
            kmjjmka.kAMaJAK = amAjAKk;
            for (int i = 1; i < n; i <<= 1) {
                if (kmjjmka.KAmAJak() > 0) {
                    kmjjmka.kAmAJak(null, null, true);
                }
            }
            final int kAmAJak = kmjjmka.KAmAJak();
            if (kAmAJak > 0) {
                final mmjakka amaJAkK = this.amaJAkK(kAmAJak);
                if (amaJAkK == null || amaJAkK.AMaJakk != 5) {
                    return;
                }
                final int[] array = { 0 };
                final int[] array2 = { 0 };
                final kajakmk kajakmk = (kajakmk)amaJAkK.aMAjAKk;
                kmjjmka.kAmAJak(array, array2, false);
                if (kajakmk.kKamaja()) {
                    if ((array2[0] & 0x2) != 0x0) {
                        kajakmk.stop();
                        return;
                    }
                    if ((array2[0] & 0x1) != 0x0 && this.majAKKa) {
                        kajakmk.kkAmAJa(array[0]);
                        return;
                    }
                    if (this.majAKKa) {
                        kajakmk.KKAmAJa(array[0]);
                    }
                }
            }
        }
    }
    
    void majAkKa(final int n) {
        if (!this.mAJAKKa) {
            this.mAjAKKa = super.KamaJAK;
            this.MAjAKKa = false;
            this.MaJakKa = this.maJaKKa + 1;
        }
        this.mAJAKKa = true;
        final kajakmk kajakmk = new kajakmk(this.maJAKKa, this.MAJAKKa, super.KAMaJAK, n, this.MajaKKa);
        if (kajakmk.Kkamaja() <= 16 && this.majAKKa && kajakmk.kKamaja()) {
            ((kajakmk)this.MaJAKKa).kkamaja(kajakmk, this);
        }
    }
    
    int AMAjAkK() {
        if (super.KAMaJAK == null) {
            return -3;
        }
        if (this.majakka != 0) {
            return this.majakka;
        }
        if (this.MAjAKKa) {
            return 2;
        }
        if (this.MAjakka - this.mAjAKKa < 2) {
            return 1;
        }
        final kmjjmka maJakKa = this.mAJakKa;
        final byte[] kaMaJAK = super.KAMaJAK;
        final int mAjAKKa = this.mAjAKKa;
        maJakKa.KAMaJAK = kaMaJAK;
        maJakKa.kAMaJAK = mAjAKKa;
        final int mAjAKKa2 = this.mAjAKKa;
        final int kAmAJak = this.mAJakKa.KAmAJak();
        int kamaJak = kAmAJak & 0x3F;
        if (kamaJak == 63) {
            if (this.MAjakka - this.mAJakKa.kAMaJAK < 4) {
                this.mAjAKKa = mAjAKKa2;
                return 1;
            }
            kamaJak = this.mAJakKa.kAMAJak();
        }
        final int mAjAKKa3 = this.mAJakKa.kAMaJAK + kamaJak;
        if (mAjAKKa3 > this.MAjakka) {
            this.mAjAKKa = mAjAKKa2;
            return 1;
        }
        switch (kAmAJak >> 6) {
            case 1: {
                if (!this.MAJakKa) {
                    ((kajakmk)this.MaJAKKa).kKAMaja(this);
                }
                this.MAJakKa = false;
                break;
            }
            case 0: {
                this.MAjAKKa = true;
                break;
            }
            case 19: {
                this.MAJakKa = true;
                this.majAkKa(this.mAJakKa.kAMaJAK);
                break;
            }
        }
        this.mAjAKKa = mAjAKKa3;
        return this.majakka;
    }
    
    void MAJAkKa(final int maJakKa) {
        this.maJakKa = maJakKa;
    }
    
    void MAjAkKa() {
        this.MajaKKa.AMAJaKk = true;
        this.mAJAKKa = false;
        ((kajakmk)this.MaJAKKa).stop();
        for (kajakmk akkamAJ = (kajakmk)this.MaJAKKa; akkamAJ != null; akkamAJ = akkamAJ.akkamAJ) {
            akkamAJ.stop();
        }
    }
    
    void MajAkKa() {
        final mmjakka amaJAkK = this.amaJAkK(this.KAmAJak());
        if (amaJAkK == null || amaJAkK.AMaJakk != 5) {
            return;
        }
        final int[] array = { 0 };
        final int[] array2 = { 0 };
        final kajakmk kajakmk = (kajakmk)amaJAkK.aMAjAKk;
        this.kAmAJak(array, array2, false);
        if (kajakmk.kKamaja()) {
            if ((array2[0] & 0x2) != 0x0) {
                kajakmk.stop();
                return;
            }
            if ((array2[0] & 0x1) != 0x0 && this.majAKKa) {
                kajakmk.kkAmAJa(array[0]);
                return;
            }
            if (this.majAKKa) {
                kajakmk.KKAmAJa(array[0]);
            }
        }
    }
    
    void mAJAkKa() {
        if (this.mAJaKKa != null) {
            this.mAJaKKa.JAKKamA();
        }
        this.mAJAKKa = false;
        ((kajakmk)this.MaJAKKa).stop();
        super.kAMaJAK = this.Majakka;
        this.maJaKKa = -1;
        this.MaJaKKa = false;
    }
    
    void maJAkKa() {
        this.mAJAkKa();
        this.mAjAkka = false;
        this.maJaKKa = -1;
        this.MaJaKKa = false;
        final int n = 0;
        this.majAkka = n;
        this.MAjakka = n;
        this.mAjakka = -1;
        super.kAMaJAK = 0;
        super.KAMaJAK = null;
        this.majakka = 0;
        this.MAjaKKa = 0;
    }
    
    mmjakka amaJAkK(final int n) {
        mmjakka amaJakk;
        for (amaJakk = this.mAjaKKa[n & 0x3F]; amaJakk != null && amaJakk.amaJakk != n; amaJakk = amaJakk.aMAJakk) {}
        return amaJakk;
    }
    
    private mmjakka AmaJAkK(final int amaJakk) {
        final mmjakka mmjakka = new mmjakka();
        if (mmjakka != null) {
            mmjakka.aMAJakk = this.mAjaKKa[amaJakk & 0x3F];
            this.mAjaKKa[amaJakk & 0x3F] = mmjakka;
            mmjakka.AmaJakk = this;
            mmjakka.amaJakk = amaJakk;
        }
        return mmjakka;
    }
    
    private void AMAjakK(final int n) {
        final mmjakka mmjakka = this.mAjaKKa[n & 0x3F];
    }
    
    private void mAjakKa() {
        final int kAmAJak = this.KAmAJak();
        if (this.amaJAkK(kAmAJak) != null) {
            return;
        }
        final mmjakka amaJAkK = this.AmaJAkK(kAmAJak);
        amaJAkK.AMaJakk = 0;
        amaJAkK.AmAjAKk = this.KaMajak();
        amaJAkK.aMaJakk = super.kAMaJAK;
    }
    
    private void AmajakK() {
        final int kAmAJak = this.KAmAJak();
        final int kAmAJak2 = this.KAmAJak();
        final mmjakka amaJAkK = this.amaJAkK(kAmAJak);
        final kmaammk kaMAJak = this.KaMAJak();
        if (super.kAMaJAK < super.KamaJAK) {
            final majjkmk majjkmk = new majjkmk(this.mAJaKKa);
            this.kaMAJak(majjkmk);
            this.mAJaKKa.jAkkAMA(amaJAkK, kAmAJak << 16 | kAmAJak2, kaMAJak, majjkmk);
            return;
        }
        this.mAJaKKa.jAkkAMA(amaJAkK, kAmAJak << 16 | kAmAJak2, kaMAJak, null);
    }
    
    private void amAjakK() {
        this.mAJaKKa.jAKkAMA(this.KAmAJak() << 16 | this.KAmAJak());
    }
    
    private void aMaJAkK() {
        final int kAmAJak = this.KAmAJak();
        if (this.amaJAkK(kAmAJak) != null) {
            return;
        }
        final mmjakka amaJAkK = this.AmaJAkK(kAmAJak);
        amaJAkK.AMaJakk = 2;
        amaJAkK.aMaJakk = super.kAMaJAK;
        amaJAkK.AmAjAKk = new kaajmmk();
    }
    
    void MaJAkKa(final boolean b) {
        final mmjakka amaJAkK = this.amaJAkK(this.KAmAJak());
        if (amaJAkK == null || amaJAkK.AMaJakk != 2) {
            return;
        }
        if (b) {
            amaJAkK.amAjAKk = super.kAMaJAK;
            return;
        }
        amaJAkK.AMAjAKk = super.kAMaJAK;
    }
    
    void aMajAkK(final int n) {
        final int kAmAJak = this.KAmAJak();
        if (this.amaJAkK(kAmAJak) != null) {
            return;
        }
        final mmjakka amaJAkK = this.AmaJAkK(kAmAJak);
        if (amaJAkK == null) {
            return;
        }
        amaJAkK.AMaJakk = 5;
        final Object akkamAJ = amaJAkK.aMAjAKk = new kajakmk(super.KAMaJAK[super.kAMaJAK++] & 0xFF, this.kAMAJak(), super.KAMaJAK, super.kAMaJAK, this.MajaKKa);
        if (akkamAJ == null) {
            this.AMAjakK(kAmAJak);
            return;
        }
        amaJAkK.aMaJakk = super.kAMaJAK;
        if (((kajakmk)akkamAJ).Kkamaja() > 16) {
            this.AMAjakK(kAmAJak);
            return;
        }
        ((kajakmk)akkamAJ).AKkamAJ = kAmAJak;
        ((kajakmk)akkamAJ).akkamAJ = ((kajakmk)this.MaJAKKa).akkamAJ;
        ((kajakmk)this.MaJAKKa).akkamAJ = (kajakmk)akkamAJ;
    }
    
    private void aMAJAkK() {
        final int kAmAJak = this.KAmAJak();
        if (this.amaJAkK(kAmAJak) != null) {
            return;
        }
        final mmjakka amaJAkK = this.AmaJAkK(kAmAJak);
        amaJAkK.AMaJakk = 3;
        amaJAkK.AmAjAKk = new kaajmmk();
        amaJAkK.aMaJakk = super.kAMaJAK;
    }
    
    private void AMAJAkK() {
        final int kAmAJak = this.KAmAJak();
        if (this.amaJAkK(kAmAJak) != null) {
            return;
        }
        final mmjakka amaJAkK = this.AmaJAkK(kAmAJak);
        amaJAkK.AMaJakk = 4;
        amaJAkK.AmAjAKk = this.KaMajak();
        amaJAkK.aMaJakk = super.kAMaJAK;
    }
    
    private void AMajAkK() {
        if (this.majakka != 0) {
            return;
        }
        if (this.mAjAkka) {
            return;
        }
        if (this.MAjakka < 21) {
            return;
        }
        this.MaJAkka = this.KaMajak();
        this.maJAkka = this.KAmAJak() << 8;
        this.MAJAkka = 65536000 / this.maJAkka;
        this.mAJAkka = this.KAmAJak();
        final int kaMaJAK = super.kAMaJAK;
        this.Majakka = kaMaJAK;
        this.MaJAkKa = kaMaJAK;
        this.maJaKKa = -1;
        this.mAjAkka = true;
    }
    
    void amajAkK(final byte[] array, int min) {
        if (this.majakka != 0) {
            return;
        }
        int n = 0;
        if (this.mAjakka < 0) {
            final int min2 = Math.min(8 - this.majAkka, min);
            System.arraycopy(array, n, this.MAjAkka, this.majAkka, min2);
            n += min2;
            min -= min2;
            this.majAkka += min2;
            if (this.majAkka != 8) {
                return;
            }
            if (this.MAjAkka[0] != 70 || this.MAjAkka[1] != 87 || this.MAjAkka[2] != 83) {
                this.majakka = -1;
                return;
            }
            this.MajAkka = this.MAjAkka[3];
            this.mAjakka = ((this.MAjAkka[4] & 0xFF) | (this.MAjAkka[5] & 0xFF) << 8 | (this.MAjAkka[6] & 0xFF) << 16 | (this.MAjAkka[7] & 0xFF) << 24);
            this.mAjakka -= 8;
            super.KAMaJAK = new byte[this.mAjakka];
            if (super.KAMaJAK == null) {
                this.majakka = -2;
                return;
            }
        }
        if (this.MAjakka + min > this.mAjakka) {
            min = Math.min(min, this.mAjakka - this.MAjakka);
        }
        System.arraycopy(array, n, super.KAMaJAK, this.MAjakka, min);
        this.MAjakka += min;
        if (!this.mAjAkka) {
            this.AMajAkK();
        }
        this.MAJaKKa.aKKAMaJ();
    }
    
    private int aMAjakK() {
        if (kajamma.MAjakKa == 0) {
            if (("SLAV" + System.getProperty("java.version")).indexOf("SLAV1.0") == -1) {
                kajamma.MAjakKa = 1;
            }
            else {
                kajamma.MAjakKa = 3;
                try {
                    Class.forName("sun.awt.image.ImageDecoder");
                    kajamma.MAjakKa = 2;
                }
                catch (final ClassNotFoundException ex) {}
            }
        }
        return kajamma.MAjakKa;
    }
    
    private void AmajAkK(final int n, final int n2) {
        final int kAmAJak = this.KAmAJak();
        int majakKa = 0;
        int n3 = 0;
        int n4 = 0;
        if (this.amaJAkK(kAmAJak) != null) {
            return;
        }
        final mmjakka amaJAkK = this.AmaJAkK(kAmAJak);
        if (amaJAkK == null) {
            return;
        }
        amaJAkK.AMaJakk = 1;
        amaJAkK.aMaJakk = super.kAMaJAK - 8;
        int majakKa2;
        if (n2 == 6) {
            n3 = super.kAMaJAK + 2;
            n4 = n - 4;
            majakKa2 = this.MajakKa;
            majakKa = this.majakKa;
        }
        else {
            int i;
            for (majakKa2 = (i = super.kAMaJAK); i < super.KamaJAK; ++i) {
                if ((super.KAMaJAK[i] & 0xFF) == 0xFF && (super.KAMaJAK[i + 1] & 0xFF) == 0xD9) {
                    majakKa = i - majakKa2;
                    break;
                }
            }
            for (int j = majakKa2 + majakKa; j < super.KamaJAK; ++j) {
                if ((super.KAMaJAK[j] & 0xFF) == 0xFF && (super.KAMaJAK[j + 1] & 0xFF) == 0xD8) {
                    n3 = j + 2;
                    n4 = n - 6 - majakKa;
                    break;
                }
            }
        }
        final byte[] array = new byte[majakKa + n4];
        if (array != null) {
            System.arraycopy(super.KAMaJAK, majakKa2, array, 0, majakKa);
            System.arraycopy(super.KAMaJAK, n3, array, majakKa, n4);
            switch (this.aMAjakK()) {
                case 1: {
                    amaJAkK.aMAjAKk = new kmjjkka(this.MajaKKa.getToolkit().createImage(array), this.mAJaKKa);
                    return;
                }
                case 2: {
                    try {
                        final Object instance = Class.forName("ImageSource").newInstance();
                        if (instance != null) {
                            ((mmjjkmk)instance).kkAMAJa = array;
                            final mmjjkmk mmjjkmk = (mmjjkmk)instance;
                            mmjjkmk.KkAMAJa = new ByteArrayInputStream(mmjjkmk.kkAMAJa);
                            final kmjjkka amAjAKk = new kmjjkka((ImageProducer)instance, this.mAJaKKa);
                            ((mmjjkmk)instance).KKaMajA();
                            amaJAkK.aMAjAKk = amAjAKk;
                        }
                        return;
                    }
                    catch (final Exception ex) {
                        amaJAkK.aMAjAKk = null;
                        return;
                    }
                    break;
                }
            }
            amaJAkK.aMAjAKk = null;
            return;
        }
        amaJAkK.aMAjAKk = null;
    }
    
    private int AMaJAkK() {
        if (super.KAMaJAK == null) {
            return -3;
        }
        if (this.majakka != 0) {
            return this.majakka;
        }
        if (this.MaJaKKa) {
            return 2;
        }
        if (this.MAjakka - super.kAMaJAK < 2) {
            return 1;
        }
        final int kaMaJAK = super.kAMaJAK;
        final int kAmAJak = this.KAmAJak();
        int kamaJak = kAmAJak & 0x3F;
        if (kamaJak == 63) {
            if (this.MAjakka - super.kAMaJAK < 4) {
                super.kAMaJAK = kaMaJAK;
                return 1;
            }
            kamaJak = this.kAMAJak();
        }
        final int n = super.kAMaJAK + kamaJak;
        if ((super.KamaJAK = n) > this.MAjakka) {
            super.kAMaJAK = kaMaJAK;
            return 1;
        }
        switch (kAmAJak >> 6) {
            case 0: {
                this.MaJaKKa = true;
                break;
            }
            case 1: {
                ++this.maJaKKa;
                break;
            }
            case 2:
            case 22: {
                this.mAjakKa();
                break;
            }
            case 3: {
                this.AMAjakK(this.KAmAJak());
                break;
            }
            case 4: {
                this.AmajakK();
                break;
            }
            case 5:
            case 28: {
                this.amAjakK();
                break;
            }
            case 6:
            case 21: {
                this.AmajAkK(kamaJak, kAmAJak >> 6);
                break;
            }
            case 8: {
                this.majakKa = kamaJak - 2;
                this.MajakKa = super.kAMaJAK;
                break;
            }
            case 14: {
                this.aMajAkK(kamaJak);
                break;
            }
            case 15: {
                this.MajAkKa();
                break;
            }
            case 17: {
                this.MaJAkKa(true);
                break;
            }
            case 7: {
                this.aMaJAkK();
                break;
            }
            case 10: {
                this.aMAJAkK();
                break;
            }
            case 11: {
                this.AMAJAkK();
                break;
            }
            case 9: {
                this.mAJaKKa.JakkamA(this.KAMAJak(), 3);
                break;
            }
            case 12: {
                if (this.MAjaKKa < 16) {
                    this.majaKKa[this.MAjaKKa] = super.kAMaJAK;
                    ++this.MAjaKKa;
                    break;
                }
                break;
            }
            case 23: {
                this.MaJAkKa(false);
                break;
            }
        }
        super.kAMaJAK = n;
        return this.majakka;
    }
    
    int amAJAkK(final int n) {
        if (this.majakka != 0) {
            return this.majakka;
        }
        if (!this.mAjAkka) {
            return 1;
        }
        if (this.maJaKKa > n) {
            this.mAJAkKa();
        }
        int aMaJAkK;
        for (aMaJAkK = 0; this.maJaKKa < n && aMaJAkK == 0; aMaJAkK = this.AMaJAkK()) {}
        return aMaJAkK;
    }
    
    boolean mAjAkKa(final int n) {
        if (this.mAjakKa >= n) {
            return true;
        }
        if (this.MAJAkKa) {
            return true;
        }
        if (super.KAMaJAK == null || this.majakka != -3) {
            return false;
        }
        final kmjjmka kmjjmka = new kmjjmka();
        final byte[] kaMaJAK = super.KAMaJAK;
        final int maJAkKa = this.MaJAkKa;
        kmjjmka.KAMaJAK = kaMaJAK;
        kmjjmka.kAMaJAK = maJAkKa;
        while (this.MAjakka - kmjjmka.kAMaJAK >= 2) {
            final int kAmAJak = kmjjmka.KAmAJak();
            int kamaJak = kAmAJak & 0x3F;
            if (kamaJak == 63) {
                if (this.MAjakka - super.kAMaJAK < 4) {
                    return false;
                }
                kamaJak = kmjjmka.kAMAJak();
            }
            final kmjjmka kmjjmka2 = kmjjmka;
            kmjjmka2.kAMaJAK += kamaJak;
            if (kmjjmka.kAMaJAK > this.MAjakka) {
                return false;
            }
            this.MaJAkKa = kmjjmka.kAMaJAK;
            if (kAmAJak >> 6 != 1) {
                continue;
            }
            ++this.mAjakKa;
            if (this.mAjakKa >= n) {
                return true;
            }
        }
        return false;
    }
    
    void AmAjAkK(final InputStream maJAkKa) {
        this.maJAkKa();
        this.maJAkKa = maJAkKa;
        final Thread thread = new Thread(this);
        thread.setPriority(6);
        thread.start();
    }
    
    public void run() {
        try {
            final byte[] b = new byte[512];
            while (true) {
                final int read = this.maJAkKa.read(b);
                if (read < 0) {
                    break;
                }
                this.amajAkK(b, read);
            }
            this.maJAkKa.close();
        }
        catch (final IOException ex) {}
        this.maJAkKa = null;
        this.MAJAkKa = true;
    }
    
    int AmAJAkK() {
        if (this.MAJAkKa || (this.MAjakka >= this.mAjakka && super.KAMaJAK != null)) {
            return 100;
        }
        return this.MAjakka / this.mAjakka;
    }
}
