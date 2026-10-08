/*
 * Decompiled with CFR 0.152.
 */
import java.util.Enumeration;
import java.util.Hashtable;
import muhmu.hifi.device.MAD;
import muhmu.hifi.device.Mixable;

public class mmajmma
implements Mixable {
    Hashtable MaJAKKA = new Hashtable(32);
    int maJAKKA = -1;
    majamma MAJAKKA;
    float mAJAKKA;
    float MajAKKA = 1.0f;
    public long majAKKA;

    public mmajmma() {
        super();
        this.MAJAkkA(3.0f);
    }

    public synchronized void MAjAkkA() {
        this.MaJAKKA.clear();
    }

    public void mAjAkkA(majamma majamma2) {
        this.MAJAKKA = majamma2;
    }

    void MAJAkkA(float f) {
        this.MajAKKA = 1.0f / f;
    }

    void MaJaKKA(float f) {
        this.MajAKKA = f;
    }

    synchronized void MajAkkA(int n, Mixable mixable) {
        this.MaJAKKA.put(new Integer(n), mixable);
    }

    synchronized void majAkkA(Mixable mixable) {
        this.MaJAKKA.put(new Integer(this.maJAKKA), mixable);
        --this.maJAKKA;
        if (this.maJAKKA == Integer.MIN_VALUE) {
            this.maJAKKA = -1;
        }
    }

    public synchronized boolean mix(MAD mAD, int[] nArray, int n, int n2) {
        int n3 = (int)this.mAJAKKA;
        if (n3 >= nArray.length) {
            this.mAJAkkA(mAD, nArray, 0, nArray.length);
        } else {
            int n4 = 0;
            while (n4 < nArray.length) {
                if (n3 > nArray.length) {
                    this.mAJAkkA(mAD, nArray, n4, nArray.length);
                    n4 = nArray.length;
                    continue;
                }
                this.mAJAkkA(mAD, nArray, n4, n3);
                n4 = n3;
                this.majAKKA = mAD.bufferStartTime + (long)(n4 * 1000 / mAD.frequency);
                if (this.MAJAKKA != null) {
                    this.MAJAKKA.MAjakKa(this);
                }
                this.mAJAKKA += this.MajAKKA * (float)mAD.frequency;
                n3 = (int)this.mAJAKKA;
            }
        }
        this.mAJAKKA -= (float)nArray.length;
        return true;
    }

    public synchronized void mAJAkkA(MAD mAD, int[] nArray, int n, int n2) {
        Enumeration enumeration = this.MaJAKKA.elements();
        if (enumeration == null) {
            return;
        }
        Enumeration enumeration2 = this.MaJAKKA.keys();
        while (enumeration.hasMoreElements()) {
            Mixable mixable = (Mixable)enumeration.nextElement();
            Object k = enumeration2.nextElement();
            boolean bl = mixable.mix(mAD, nArray, n, n2);
            if (bl) continue;
            this.MaJAKKA.remove(k);
        }
    }
}

