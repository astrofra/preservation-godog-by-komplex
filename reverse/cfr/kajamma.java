/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

final class kajamma
extends kmjjmka
implements Runnable {
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
    byte[] MAjAkka = new byte[8];
    boolean mAjAkka;
    boolean MaJaKKa;
    int maJaKKa;
    mmajmmk MAJaKKa = new mmajmmk(false);
    kaajkkk mAJaKKa;
    private mmaakka MajaKKa;
    int[] majaKKa = new int[16];
    int MAjaKKa;
    mmjakka[] mAjaKKa = new mmjakka[64];
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
    private kmjjmka mAJakKa = new kmjjmka();
    private int MajakKa;
    private int majakKa;
    private static int MAjakKa;
    private int mAjakKa;
    private int MaJAkKa;
    private InputStream maJAkKa;
    private boolean MAJAkKa;

    kajamma(mmaakka mmaakka2, kaajkkk kaajkkk2) {
        super();
        this.MajaKKa = mmaakka2;
        this.mAJaKKa = kaajkkk2;
        this.MaJAkka = new kaajmmk(0, 0, 600, 600);
        this.MaJAKKa = new kajakmk(0, 0, null, 0, mmaakka2);
        this.majAKKa = true;
        this.maJAkKa();
    }

    final boolean AmAjakK() {
        return this.maJaKKa < this.MaJakKa + this.maJakKa && this.mAJAKKa;
    }

    final int aMAjAkK() {
        int n = this.maJaKKa - (this.MaJakKa + this.maJakKa);
        if (n > 0 && this.mAJAKKa) {
            return n * this.MAJAkka;
        }
        return 0;
    }

    void amAjAkK(kajakkk kajakkk2, int n) {
        int n2 = kajakkk2.MajAKka;
        if (n2 == n || n != 1 && n2 > n) {
            return;
        }
        if (kajakkk2.MAjaKka.amAjAKk > 0) {
            kmjjmka kmjjmka2 = new kmjjmka();
            byte[] byArray = this.KAMaJAK;
            int n3 = kajakkk2.MAjaKka.amAjAKk;
            kmjjmka2.KAMaJAK = byArray;
            kmjjmka2.kAMaJAK = n3;
            int n4 = 1;
            while (n4 < n) {
                n3 = kmjjmka2.KAmAJak();
                if (n3 > 0) {
                    kmjjmka2.kAmAJak(null, null, true);
                }
                n4 <<= 1;
            }
            n3 = kmjjmka2.KAmAJak();
            if (n3 > 0) {
                mmjakka mmjakka2 = this.amaJAkK(n3);
                if (mmjakka2 == null || mmjakka2.AMaJakk != 5) {
                    return;
                }
                int[] nArray = new int[1];
                int[] nArray2 = new int[1];
                kajakmk kajakmk2 = (kajakmk)mmjakka2.aMAjAKk;
                kmjjmka2.kAmAJak(nArray, nArray2, false);
                if (kajakmk2.kKamaja()) {
                    if ((nArray2[0] & 2) != 0) {
                        kajakmk2.stop();
                        return;
                    }
                    if ((nArray2[0] & 1) != 0 && this.majAKKa) {
                        kajakmk2.kkAmAJa(nArray[0]);
                        return;
                    }
                    if (this.majAKKa) {
                        kajakmk2.KKAmAJa(nArray[0]);
                    }
                }
            }
        }
    }

    void majAkKa(int n) {
        if (!this.mAJAKKa) {
            this.mAjAKKa = this.KamaJAK;
            this.MAjAKKa = false;
            this.MaJakKa = this.maJaKKa + 1;
        }
        this.mAJAKKa = true;
        kajakmk kajakmk2 = new kajakmk(this.maJAKKa, this.MAJAKKa, this.KAMaJAK, n, this.MajaKKa);
        if (kajakmk2.Kkamaja() <= 16 && this.majAKKa && kajakmk2.kKamaja()) {
            ((kajakmk)this.MaJAKKa).kkamaja(kajakmk2, this);
        }
    }

    int AMAjAkK() {
        int n;
        if (this.KAMaJAK == null) {
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
        kmjjmka kmjjmka2 = this.mAJakKa;
        byte[] byArray = this.KAMaJAK;
        int n2 = this.mAjAKKa;
        kmjjmka2.KAMaJAK = byArray;
        kmjjmka2.kAMaJAK = n2;
        int n3 = this.mAjAKKa;
        int n4 = this.mAJakKa.KAmAJak();
        n2 = n4 & 0x3F;
        if (n2 == 63) {
            if (this.MAjakka - this.mAJakKa.kAMaJAK < 4) {
                this.mAjAKKa = n3;
                return 1;
            }
            n2 = this.mAJakKa.kAMAJak();
        }
        if ((n = this.mAJakKa.kAMaJAK + n2) > this.MAjakka) {
            this.mAjAKKa = n3;
            return 1;
        }
        switch (n4 >> 6) {
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
            }
        }
        this.mAjAKKa = n;
        return this.majakka;
    }

    void MAJAkKa(int n) {
        this.maJakKa = n;
    }

    void MAjAkKa() {
        this.MajaKKa.AMAJaKk = true;
        this.mAJAKKa = false;
        ((kajakmk)this.MaJAKKa).stop();
        kajakmk kajakmk2 = (kajakmk)this.MaJAKKa;
        while (kajakmk2 != null) {
            kajakmk2.stop();
            kajakmk2 = kajakmk2.akkamAJ;
        }
    }

    void MajAkKa() {
        int n = this.KAmAJak();
        mmjakka mmjakka2 = this.amaJAkK(n);
        if (mmjakka2 == null || mmjakka2.AMaJakk != 5) {
            return;
        }
        int[] nArray = new int[1];
        int[] nArray2 = new int[1];
        kajakmk kajakmk2 = (kajakmk)mmjakka2.aMAjAKk;
        this.kAmAJak(nArray, nArray2, false);
        if (kajakmk2.kKamaja()) {
            if ((nArray2[0] & 2) != 0) {
                kajakmk2.stop();
                return;
            }
            if ((nArray2[0] & 1) != 0 && this.majAKKa) {
                kajakmk2.kkAmAJa(nArray[0]);
                return;
            }
            if (this.majAKKa) {
                kajakmk2.KKAmAJa(nArray[0]);
            }
        }
    }

    void mAJAkKa() {
        if (this.mAJaKKa != null) {
            this.mAJaKKa.JAKKamA();
        }
        this.mAJAKKa = false;
        ((kajakmk)this.MaJAKKa).stop();
        this.kAMaJAK = this.Majakka;
        this.maJaKKa = -1;
        this.MaJaKKa = false;
    }

    void maJAkKa() {
        this.mAJAkKa();
        this.mAjAkka = false;
        this.maJaKKa = -1;
        this.MaJaKKa = false;
        this.majAkka = 0;
        this.MAjakka = 0;
        this.mAjakka = -1;
        this.kAMaJAK = 0;
        this.KAMaJAK = null;
        this.majakka = 0;
        this.MAjaKKa = 0;
    }

    mmjakka amaJAkK(int n) {
        mmjakka mmjakka2 = this.mAjaKKa[n & 0x3F];
        while (mmjakka2 != null && mmjakka2.amaJakk != n) {
            mmjakka2 = mmjakka2.aMAJakk;
        }
        return mmjakka2;
    }

    private mmjakka AmaJAkK(int n) {
        mmjakka mmjakka2 = new mmjakka();
        if (mmjakka2 != null) {
            mmjakka2.aMAJakk = this.mAjaKKa[n & 0x3F];
            this.mAjaKKa[n & 0x3F] = mmjakka2;
            mmjakka2.AmaJakk = this;
            mmjakka2.amaJakk = n;
        }
        return mmjakka2;
    }

    private void AMAjakK(int n) {
        Object var2_2 = null;
        mmjakka mmjakka2 = this.mAjaKKa[n & 0x3F];
    }

    private void mAjakKa() {
        int n = this.KAmAJak();
        if (this.amaJAkK(n) != null) {
            return;
        }
        mmjakka mmjakka2 = this.AmaJAkK(n);
        mmjakka2.AMaJakk = 0;
        mmjakka2.AmAjAKk = this.KaMajak();
        mmjakka2.aMaJakk = this.kAMaJAK;
    }

    private void AmajakK() {
        int n = this.KAmAJak();
        int n2 = this.KAmAJak();
        mmjakka mmjakka2 = this.amaJAkK(n);
        kmaammk kmaammk2 = this.KaMAJak();
        if (this.kAMaJAK < this.KamaJAK) {
            majjkmk majjkmk2 = new majjkmk(this.mAJaKKa);
            this.kaMAJak(majjkmk2);
            this.mAJaKKa.jAkkAMA(mmjakka2, n << 16 | n2, kmaammk2, majjkmk2);
            return;
        }
        this.mAJaKKa.jAkkAMA(mmjakka2, n << 16 | n2, kmaammk2, null);
    }

    private void amAjakK() {
        int n = this.KAmAJak();
        int n2 = this.KAmAJak();
        this.mAJaKKa.jAKkAMA(n << 16 | n2);
    }

    private void aMaJAkK() {
        int n = this.KAmAJak();
        if (this.amaJAkK(n) != null) {
            return;
        }
        mmjakka mmjakka2 = this.AmaJAkK(n);
        mmjakka2.AMaJakk = 2;
        mmjakka2.aMaJakk = this.kAMaJAK;
        mmjakka2.AmAjAKk = new kaajmmk();
    }

    void MaJAkKa(boolean bl) {
        int n = this.KAmAJak();
        mmjakka mmjakka2 = this.amaJAkK(n);
        if (mmjakka2 == null || mmjakka2.AMaJakk != 2) {
            return;
        }
        if (bl) {
            mmjakka2.amAjAKk = this.kAMaJAK;
            return;
        }
        mmjakka2.AMAjAKk = this.kAMaJAK;
    }

    void aMajAkK(int n) {
        int n2 = this.KAmAJak();
        if (this.amaJAkK(n2) != null) {
            return;
        }
        mmjakka mmjakka2 = this.AmaJAkK(n2);
        if (mmjakka2 == null) {
            return;
        }
        mmjakka2.AMaJakk = 5;
        int n3 = this.KAMaJAK[this.kAMaJAK++] & 0xFF;
        int n4 = this.kAMAJak();
        kajakmk kajakmk2 = new kajakmk(n3, n4, this.KAMaJAK, this.kAMaJAK, this.MajaKKa);
        mmjakka2.aMAjAKk = kajakmk2;
        if (kajakmk2 == null) {
            this.AMAjakK(n2);
            return;
        }
        mmjakka2.aMaJakk = this.kAMaJAK;
        if (kajakmk2.Kkamaja() > 16) {
            this.AMAjakK(n2);
            return;
        }
        kajakmk2.AKkamAJ = n2;
        kajakmk2.akkamAJ = ((kajakmk)this.MaJAKKa).akkamAJ;
        ((kajakmk)this.MaJAKKa).akkamAJ = kajakmk2;
    }

    private void aMAJAkK() {
        int n = this.KAmAJak();
        if (this.amaJAkK(n) != null) {
            return;
        }
        mmjakka mmjakka2 = this.AmaJAkK(n);
        mmjakka2.AMaJakk = 3;
        mmjakka2.AmAjAKk = new kaajmmk();
        mmjakka2.aMaJakk = this.kAMaJAK;
    }

    private void AMAJAkK() {
        int n = this.KAmAJak();
        if (this.amaJAkK(n) != null) {
            return;
        }
        mmjakka mmjakka2 = this.AmaJAkK(n);
        mmjakka2.AMaJakk = 4;
        mmjakka2.AmAjAKk = this.KaMajak();
        mmjakka2.aMaJakk = this.kAMaJAK;
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
        this.MaJAkKa = this.Majakka = this.kAMaJAK;
        this.maJaKKa = -1;
        this.mAjAkka = true;
    }

    void amajAkK(byte[] byArray, int n) {
        if (this.majakka != 0) {
            return;
        }
        int n2 = 0;
        if (this.mAjakka < 0) {
            int n3 = Math.min(8 - this.majAkka, n);
            System.arraycopy(byArray, n2, this.MAjAkka, this.majAkka, n3);
            n2 += n3;
            n -= n3;
            this.majAkka += n3;
            if (this.majAkka == 8) {
                if (this.MAjAkka[0] != 70 || this.MAjAkka[1] != 87 || this.MAjAkka[2] != 83) {
                    this.majakka = -1;
                    return;
                }
                this.MajAkka = this.MAjAkka[3];
                this.mAjakka = this.MAjAkka[4] & 0xFF | (this.MAjAkka[5] & 0xFF) << 8 | (this.MAjAkka[6] & 0xFF) << 16 | (this.MAjAkka[7] & 0xFF) << 24;
                this.mAjakka -= 8;
                this.KAMaJAK = new byte[this.mAjakka];
                if (this.KAMaJAK == null) {
                    this.majakka = -2;
                    return;
                }
            } else {
                return;
            }
        }
        if (this.MAjakka + n > this.mAjakka) {
            n = Math.min(n, this.mAjakka - this.MAjakka);
        }
        System.arraycopy(byArray, n2, this.KAMaJAK, this.MAjakka, n);
        this.MAjakka += n;
        if (!this.mAjAkka) {
            this.AMajAkK();
        }
        this.MAJaKKa.aKKAMaJ();
    }

    private int aMAjakK() {
        if (MAjakKa == 0) {
            if (("SLAV" + System.getProperty("java.version")).indexOf("SLAV1.0") == -1) {
                MAjakKa = 1;
            } else {
                MAjakKa = 3;
                try {
                    Class.forName("sun.awt.image.ImageDecoder");
                    MAjakKa = 2;
                }
                catch (ClassNotFoundException classNotFoundException) {}
            }
        }
        return MAjakKa;
    }

    private void AmajAkK(int n, int n2) {
        block16: {
            int n3 = this.KAmAJak();
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            if (this.amaJAkK(n3) != null) {
                return;
            }
            mmjakka mmjakka2 = this.AmaJAkK(n3);
            if (mmjakka2 == null) {
                return;
            }
            mmjakka2.AMaJakk = 1;
            mmjakka2.aMaJakk = this.kAMaJAK - 8;
            if (n2 == 6) {
                n6 = this.kAMaJAK + 2;
                n7 = n - 4;
                n4 = this.MajakKa;
                n5 = this.majakKa;
            } else {
                int n8 = n4 = this.kAMaJAK;
                while (n8 < this.KamaJAK) {
                    if ((this.KAMaJAK[n8] & 0xFF) == 255 && (this.KAMaJAK[n8 + 1] & 0xFF) == 217) {
                        n5 = n8 - n4;
                        break;
                    }
                    ++n8;
                }
                int n9 = n4 + n5;
                while (n9 < this.KamaJAK) {
                    if ((this.KAMaJAK[n9] & 0xFF) == 255 && (this.KAMaJAK[n9 + 1] & 0xFF) == 216) {
                        n6 = n9 + 2;
                        n7 = n - 6 - n5;
                        break;
                    }
                    ++n9;
                }
            }
            byte[] byArray = new byte[n5 + n7];
            if (byArray != null) {
                System.arraycopy(this.KAMaJAK, n4, byArray, 0, n5);
                System.arraycopy(this.KAMaJAK, n6, byArray, n5, n7);
                switch (this.aMAjakK()) {
                    case 1: {
                        mmjakka2.aMAjAKk = new kmjjkka(this.MajaKKa.getToolkit().createImage(byArray), this.mAJaKKa);
                        return;
                    }
                    case 2: {
                        try {
                            Object obj = Class.forName("ImageSource").newInstance();
                            if (obj != null) {
                                Object object = (mmjjkmk)obj;
                                ((mmjjkmk)object).kkAMAJa = byArray;
                                object = (mmjjkmk)obj;
                                ((mmjjkmk)object).KkAMAJa = new ByteArrayInputStream(((mmjjkmk)object).kkAMAJa);
                                object = new kmjjkka((mmjjkmk)obj, this.mAJaKKa);
                                ((mmjjkmk)obj).KKaMajA();
                                mmjakka2.aMAjAKk = object;
                                return;
                            }
                            break block16;
                        }
                        catch (Exception exception) {
                            mmjakka2.aMAjAKk = null;
                            return;
                        }
                    }
                    default: {
                        mmjakka2.aMAjAKk = null;
                        return;
                    }
                }
            }
            mmjakka2.aMAjAKk = null;
        }
    }

    private int AMaJAkK() {
        int n;
        if (this.KAMaJAK == null) {
            return -3;
        }
        if (this.majakka != 0) {
            return this.majakka;
        }
        if (this.MaJaKKa) {
            return 2;
        }
        if (this.MAjakka - this.kAMaJAK < 2) {
            return 1;
        }
        int n2 = this.kAMaJAK;
        int n3 = this.KAmAJak();
        int n4 = n3 & 0x3F;
        if (n4 == 63) {
            if (this.MAjakka - this.kAMaJAK < 4) {
                this.kAMaJAK = n2;
                return 1;
            }
            n4 = this.kAMAJak();
        }
        this.KamaJAK = n = this.kAMaJAK + n4;
        if (n > this.MAjakka) {
            this.kAMaJAK = n2;
            return 1;
        }
        switch (n3 >> 6) {
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
                this.AmajAkK(n4, n3 >> 6);
                break;
            }
            case 8: {
                this.majakKa = n4 - 2;
                this.MajakKa = this.kAMaJAK;
                break;
            }
            case 14: {
                this.aMajAkK(n4);
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
                if (this.MAjaKKa >= 16) break;
                this.majaKKa[this.MAjaKKa] = this.kAMaJAK;
                ++this.MAjaKKa;
                break;
            }
            case 23: {
                this.MaJAkKa(false);
            }
        }
        this.kAMaJAK = n;
        return this.majakka;
    }

    int amAJAkK(int n) {
        if (this.majakka != 0) {
            return this.majakka;
        }
        if (!this.mAjAkka) {
            return 1;
        }
        if (this.maJaKKa > n) {
            this.mAJAkKa();
        }
        int n2 = 0;
        while (this.maJaKKa < n && n2 == 0) {
            n2 = this.AMaJAkK();
        }
        return n2;
    }

    boolean mAjAkKa(int n) {
        if (this.mAjakKa >= n) {
            return true;
        }
        if (this.MAJAkKa) {
            return true;
        }
        if (this.KAMaJAK == null || this.majakka != -3) {
            return false;
        }
        kmjjmka kmjjmka2 = new kmjjmka();
        byte[] byArray = this.KAMaJAK;
        int n2 = this.MaJAkKa;
        kmjjmka2.KAMaJAK = byArray;
        kmjjmka2.kAMaJAK = n2;
        while (true) {
            if (this.MAjakka - kmjjmka2.kAMaJAK < 2) {
                return false;
            }
            int n3 = kmjjmka2.KAmAJak();
            n2 = n3 & 0x3F;
            if (n2 == 63) {
                if (this.MAjakka - this.kAMaJAK < 4) {
                    return false;
                }
                n2 = kmjjmka2.kAMAJak();
            }
            kmjjmka2.kAMaJAK += n2;
            if (kmjjmka2.kAMaJAK > this.MAjakka) {
                return false;
            }
            this.MaJAkKa = kmjjmka2.kAMaJAK;
            if (n3 >> 6 != 1) continue;
            ++this.mAjakKa;
            if (this.mAjakKa >= n) break;
        }
        return true;
    }

    void AmAjAkK(InputStream inputStream) {
        this.maJAkKa();
        this.maJAkKa = inputStream;
        Thread thread = new Thread(this);
        thread.setPriority(6);
        thread.start();
    }

    public void run() {
        try {
            int n;
            byte[] byArray = new byte[512];
            while ((n = this.maJAkKa.read(byArray)) >= 0) {
                this.amajAkK(byArray, n);
            }
            this.maJAkKa.close();
        }
        catch (IOException iOException) {}
        this.maJAkKa = null;
        this.MAJAkKa = true;
    }

    int AmAJAkK() {
        if (this.MAJAkKa || this.MAjakka >= this.mAjakka && this.KAMaJAK != null) {
            return 100;
        }
        return this.MAjakka / this.mAjakka;
    }
}

