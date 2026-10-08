// 
// Decompiled by Procyon v0.6.0
// 

public class kaaamka
{
    kaajmma KkaMaja;
    kaajmma kkaMaja;
    kaajmma KKaMaja;
    kaajmma kKaMaja;
    kaajmma KkAmAJa;
    kaajmma kkAmAJa;
    kaajmma KKAmAJa;
    kaajmma kKAmAJa;
    kaajmma KkamAJa;
    kaajmma kkamAJa;
    float KKamAJa;
    float kKamAJa;
    
    public void kKAMajA(final mmjjmkk mmjjmkk, final mmaakkk mmaakkk) {
        final kaaakka kaaakka = new kaaakka(mmjjmkk.aMaJAkK);
        this.kkamAJa.MAJAkKA(mmjjmkk.AMaJAkK);
        this.kkamAJa.MAJAKKA();
        this.KKamAJa = mmjjmkk.AMAjakK;
        this.kKamAJa = mmjjmkk.aMAjakK;
        if (mmaakkk != null) {
            kaaakka.kAmaJAK(mmaakkk.mAjakka.kamaJAK());
            this.kkamAJa.mAjAkKA(mmaakkk.Majakka);
            mmaakkk.mAjakka.kamaJAK().KAmAjAK(this.kkamAJa);
        }
        final float n = (float)Math.tan(mmjjmkk.amaJAkK / 2.0f);
        final float n2 = n * mmjjmkk.aMAJAkK / mmjjmkk.AMAJAkK;
        final float n3 = n * this.kKamAJa;
        final float n4 = n2 * this.kKamAJa;
        this.KkaMaja.mAJaKka(-n3, n4, this.kKamAJa);
        this.kkaMaja.mAJaKka(n3, n4, this.kKamAJa);
        this.KKaMaja.mAJaKka(-n3, -n4, this.kKamAJa);
        this.kKaMaja.mAJaKka(n3, -n4, this.kKamAJa);
        this.KkamAJa.mAJaKka(0.0f, 0.0f, 1.0f);
        kaaakka.KAmAjAK(this.KkamAJa);
        kaaakka.KAmAjAK(this.KkaMaja);
        kaaakka.KAmAjAK(this.kkaMaja);
        kaaakka.KAmAjAK(this.KKaMaja);
        kaaakka.KAmAjAK(this.kKaMaja);
        this.KkAmAJa.MAJAkKA(this.KkaMaja);
        this.KkAmAJa.MaJAkKA(this.kkaMaja);
        this.KkAmAJa.MaJAKKA();
        this.kKAmAJa.MAJAkKA(this.kkaMaja);
        this.kKAmAJa.MaJAkKA(this.kKaMaja);
        this.kKAmAJa.MaJAKKA();
        this.kkAmAJa.MAJAkKA(this.kKaMaja);
        this.kkAmAJa.MaJAkKA(this.KKaMaja);
        this.kkAmAJa.MaJAKKA();
        this.KKAmAJa.MAJAkKA(this.KKaMaja);
        this.KKAmAJa.MaJAkKA(this.KkaMaja);
        this.KKAmAJa.MaJAKKA();
    }
    
    public boolean KKAMajA(final kaajmma kaajmma) {
        final kaajmma mAjAkKA = kaajmma.mAjAkKA(this.kkamAJa);
        if (mAjAkKA.MaJakKA(this.KkAmAJa) > 0.0f) {
            return false;
        }
        if (mAjAkKA.MaJakKA(this.kkAmAJa) > 0.0f) {
            return false;
        }
        if (mAjAkKA.MaJakKA(this.KKAmAJa) > 0.0f) {
            return false;
        }
        if (mAjAkKA.MaJakKA(this.kKAmAJa) > 0.0f) {
            return false;
        }
        final float maJakKA = mAjAkKA.MaJakKA(this.KkamAJa);
        return maJakKA >= this.KKamAJa && maJakKA <= this.kKamAJa;
    }
    
    public int KkaMajA(final mmaakkk mmaakkk) {
        final kaajmma mAjAkKA = mmaakkk.Majakka.mAjAkKA(this.kkamAJa);
        final float n = mmaakkk.MaJAkka * mmaakkk.majakka.MajaKka;
        int n2 = 0;
        final float maJakKA;
        if ((maJakKA = mAjAkKA.MaJakKA(this.KkAmAJa)) > -n) {
            if (maJakKA > n) {
                return -1;
            }
            n2 |= 0x40;
        }
        final float maJakKA2;
        if ((maJakKA2 = mAjAkKA.MaJakKA(this.kkAmAJa)) > -n) {
            if (maJakKA2 > n) {
                return -1;
            }
            n2 |= 0x200;
        }
        final float maJakKA3;
        if ((maJakKA3 = mAjAkKA.MaJakKA(this.KKAmAJa)) > -n) {
            if (maJakKA3 > n) {
                return -1;
            }
            n2 |= 0x1;
        }
        final float maJakKA4;
        if ((maJakKA4 = mAjAkKA.MaJakKA(this.kKAmAJa)) > -n) {
            if (maJakKA4 > n) {
                return -1;
            }
            n2 |= 0x8;
        }
        final float maJakKA5 = mAjAkKA.MaJakKA(this.KkamAJa);
        if (maJakKA5 - n < this.KKamAJa) {
            if (maJakKA5 + n < this.KKamAJa) {
                return -1;
            }
            n2 |= 0x8000;
        }
        if (maJakKA5 + n > this.kKamAJa) {
            if (maJakKA5 - n > this.kKamAJa) {
                return -1;
            }
            n2 |= 0x1000;
        }
        return n2;
    }
    
    public kaaamka() {
        this.KkaMaja = new kaajmma();
        this.kkaMaja = new kaajmma();
        this.KKaMaja = new kaajmma();
        this.kKaMaja = new kaajmma();
        this.KkAmAJa = new kaajmma();
        this.kkAmAJa = new kaajmma();
        this.KKAmAJa = new kaajmma();
        this.kKAmAJa = new kaajmma();
        this.KkamAJa = new kaajmma();
        this.kkamAJa = new kaajmma();
    }
}
