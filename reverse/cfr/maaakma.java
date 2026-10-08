/*
 * Decompiled with CFR 0.152.
 */
import java.util.Enumeration;
import java.util.Vector;

public class maaakma {
    public Vector mAjAKkA = new Vector(10);
    kajjkka[] MaJakkA;
    mmjjmma maJakkA;
    public static boolean MAJakkA = true;
    public static boolean mAJakkA = true;
    public static boolean MajakkA = true;
    public static boolean majakkA = true;

    public void MAjAKkA() {
        int n = 0;
        Enumeration enumeration = this.mAjAKkA.elements();
        if (enumeration != null) {
            while (enumeration.hasMoreElements()) {
                mmaakkk mmaakkk2 = (mmaakkk)enumeration.nextElement();
                n += mmaakkk2.maJakka.length;
            }
        }
        this.MaJakkA = new kajjkka[n];
        this.maJakkA = new mmjjmma(this.MaJakkA);
    }

    public void mAjAKkA(mmjjmkk mmjjmkk2, kmjjmmk kmjjmmk2) {
        kaaamma.aMaJAKK = this.MaJakkA;
        kaaamma.AmAjaKK = 0;
        mmjjmkk2.AMAJAkK = kmjjmmk2.jAkkamA;
        mmjjmkk2.aMAJAkK = kmjjmmk2.JaKKamA;
        kaaamka kaaamka2 = new kaaamka();
        kaaamka2.kKAMajA(mmjjmkk2, null);
        Enumeration enumeration = this.mAjAKkA.elements();
        if (enumeration != null) {
            while (enumeration.hasMoreElements()) {
                mmaakkk mmaakkk2 = (mmaakkk)enumeration.nextElement();
                int n = kaaamka2.KkaMajA(mmaakkk2);
                if (n != -1) {
                    mmaakkk2.JaKkama(mmjjmkk2, n);
                }
                if (!mmaakkk2.mAJAkka) continue;
                mmaakkk mmaakkk3 = mmaakkk2.majAkka;
                mmaakkk3.Majakka.MAJAkKA(mmaakkk2.Majakka);
                mmaakkk3.mAjakka.KaMAjAK(mmaakkk2.mAjakka);
                mmaakkk3.Majakka.MAjaKka *= -1.0f;
                kaaakka kaaakka2 = mmaakkk3.mAjakka;
                kaaakka2.KAMAjaK *= -1.0f;
                kaaakka2.kamAjaK *= -1.0f;
                kaaakka2.KaMaJAK *= -1.0f;
                int n2 = kaaamma.AmAjaKK;
                n = kaaamka2.KkaMajA(mmaakkk3);
                if (n != -1) {
                    mmaakkk3.JaKkama(mmjjmkk2, n);
                }
                int n3 = n2;
                while (n3 < kaaamma.AmAjaKK) {
                    kaaamma.aMaJAKK[n3].aMajakk *= -1.0f;
                    ++n3;
                }
            }
        }
        if (mAJakkA) {
            this.maJakkA.mAJakkA(kaaamma.AmAjaKK);
        }
    }

    public void MajAKkA(kmjjmmk kmjjmmk2) {
        if (majakkA) {
            kmjjmmk2.AkkaMaJ(kaaamma.aMaJAKK, kaaamma.AmAjaKK);
        }
    }

    public void mAJAKkA(mmaakkk mmaakkk2) {
        this.mAjAKkA.addElement(mmaakkk2);
    }

    public void majAKkA(float f) {
        this.MAJAKkA(f, null);
    }

    public void MAJAKkA(float f, mmjjmkk mmjjmkk2) {
        int n = 0;
        while (n < this.mAjAKkA.size()) {
            mmaakkk mmaakkk2 = (mmaakkk)this.mAjAKkA.elementAt(n);
            mmaakkk2.mAJAKKa = f;
            ++n;
        }
    }

    public maaakma() {
        super();
    }

    static {
    }
}

