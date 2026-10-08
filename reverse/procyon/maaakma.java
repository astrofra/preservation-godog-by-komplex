import java.util.Enumeration;
import java.util.Vector;

// 
// Decompiled by Procyon v0.6.0
// 

public class maaakma
{
    public Vector mAjAKkA;
    kajjkka[] MaJakkA;
    mmjjmma maJakkA;
    public static boolean MAJakkA;
    public static boolean mAJakkA;
    public static boolean MajakkA;
    public static boolean majakkA;
    
    public void MAjAKkA() {
        int n = 0;
        final Enumeration elements = this.mAjAKkA.elements();
        if (elements != null) {
            while (elements.hasMoreElements()) {
                n += ((mmaakkk)elements.nextElement()).maJakka.length;
            }
        }
        this.MaJakkA = new kajjkka[n];
        this.maJakkA = new mmjjmma(this.MaJakkA);
    }
    
    public void mAjAKkA(final mmjjmkk mmjjmkk, final kmjjmmk kmjjmmk) {
        kaaamma.aMaJAKK = this.MaJakkA;
        kaaamma.AmAjaKK = 0;
        mmjjmkk.AMAJAkK = kmjjmmk.jAkkamA;
        mmjjmkk.aMAJAkK = kmjjmmk.JaKKamA;
        final kaaamka kaaamka = new kaaamka();
        kaaamka.kKAMajA(mmjjmkk, null);
        final Enumeration elements = this.mAjAKkA.elements();
        if (elements != null) {
            while (elements.hasMoreElements()) {
                final mmaakkk mmaakkk = (mmaakkk)elements.nextElement();
                final int kkaMajA = kaaamka.KkaMajA(mmaakkk);
                if (kkaMajA != -1) {
                    mmaakkk.JaKkama(mmjjmkk, kkaMajA);
                }
                if (mmaakkk.mAJAkka) {
                    final mmaakkk majAkka = mmaakkk.majAkka;
                    majAkka.Majakka.MAJAkKA(mmaakkk.Majakka);
                    majAkka.mAjakka.KaMAjAK(mmaakkk.mAjakka);
                    final kaajmma majakka = majAkka.Majakka;
                    majakka.MAjaKka *= -1.0f;
                    final kaaakka mAjakka;
                    final kaaakka kaaakka = mAjakka = majAkka.mAjakka;
                    mAjakka.KAMAjaK *= -1.0f;
                    final kaaakka kaaakka2 = kaaakka;
                    kaaakka2.kamAjaK *= -1.0f;
                    final kaaakka kaaakka3 = kaaakka;
                    kaaakka3.KaMaJAK *= -1.0f;
                    final int amAjaKK = kaaamma.AmAjaKK;
                    final int kkaMajA2 = kaaamka.KkaMajA(majAkka);
                    if (kkaMajA2 != -1) {
                        majAkka.JaKkama(mmjjmkk, kkaMajA2);
                    }
                    for (int i = amAjaKK; i < kaaamma.AmAjaKK; ++i) {
                        final kajjkka kajjkka = kaaamma.aMaJAKK[i];
                        kajjkka.aMajakk *= -1.0f;
                    }
                }
            }
        }
        if (maaakma.mAJakkA) {
            this.maJakkA.mAJakkA(kaaamma.AmAjaKK);
        }
    }
    
    public void MajAKkA(final kmjjmmk kmjjmmk) {
        if (maaakma.majakkA) {
            kmjjmmk.AkkaMaJ(kaaamma.aMaJAKK, kaaamma.AmAjaKK);
        }
    }
    
    public void mAJAKkA(final mmaakkk obj) {
        this.mAjAKkA.addElement(obj);
    }
    
    public void majAKkA(final float n) {
        this.MAJAKkA(n, null);
    }
    
    public void MAJAKkA(final float majakKa, final mmjjmkk mmjjmkk) {
        for (int i = 0; i < this.mAjAKkA.size(); ++i) {
            ((mmaakkk)this.mAjAKkA.elementAt(i)).mAJAKKa = majakKa;
        }
    }
    
    public maaakma() {
        this.mAjAKkA = new Vector(10);
    }
    
    static {
        maaakma.MAJakkA = true;
        maaakma.mAJakkA = true;
        maaakma.MajakkA = true;
        maaakma.majakkA = true;
    }
}
