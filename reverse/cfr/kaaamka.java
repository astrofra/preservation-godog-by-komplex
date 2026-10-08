/*
 * Decompiled with CFR 0.152.
 */
public class kaaamka {
    kaajmma KkaMaja = new kaajmma();
    kaajmma kkaMaja = new kaajmma();
    kaajmma KKaMaja = new kaajmma();
    kaajmma kKaMaja = new kaajmma();
    kaajmma KkAmAJa = new kaajmma();
    kaajmma kkAmAJa = new kaajmma();
    kaajmma KKAmAJa = new kaajmma();
    kaajmma kKAmAJa = new kaajmma();
    kaajmma KkamAJa = new kaajmma();
    kaajmma kkamAJa = new kaajmma();
    float KKamAJa;
    float kKamAJa;

    public void kKAMajA(mmjjmkk mmjjmkk2, mmaakkk mmaakkk2) {
        kaaakka kaaakka2 = new kaaakka(mmjjmkk2.aMaJAkK);
        this.kkamAJa.MAJAkKA(mmjjmkk2.AMaJAkK);
        this.kkamAJa.MAJAKKA();
        this.KKamAJa = mmjjmkk2.AMAjakK;
        this.kKamAJa = mmjjmkk2.aMAjakK;
        if (mmaakkk2 != null) {
            kaaakka kaaakka3 = mmaakkk2.mAjakka.kamaJAK();
            kaaakka2.kAmaJAK(kaaakka3);
            this.kkamAJa.mAjAkKA(mmaakkk2.Majakka);
            mmaakkk2.mAjakka.kamaJAK().KAmAjAK(this.kkamAJa);
        }
        float f = (float)Math.tan(mmjjmkk2.amaJAkK / 2.0f);
        float f2 = f * (float)mmjjmkk2.aMAJAkK / (float)mmjjmkk2.AMAJAkK;
        this.KkaMaja.mAJaKka(-(f *= this.kKamAJa), f2 *= this.kKamAJa, this.kKamAJa);
        this.kkaMaja.mAJaKka(f, f2, this.kKamAJa);
        this.KKaMaja.mAJaKka(-f, -f2, this.kKamAJa);
        this.kKaMaja.mAJaKka(f, -f2, this.kKamAJa);
        this.KkamAJa.mAJaKka(0.0f, 0.0f, 1.0f);
        kaaakka2.KAmAjAK(this.KkamAJa);
        kaaakka2.KAmAjAK(this.KkaMaja);
        kaaakka2.KAmAjAK(this.kkaMaja);
        kaaakka2.KAmAjAK(this.KKaMaja);
        kaaakka2.KAmAjAK(this.kKaMaja);
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

    public boolean KKAMajA(kaajmma kaajmma2) {
        kaajmma kaajmma3 = kaajmma2.mAjAkKA(this.kkamAJa);
        if (kaajmma3.MaJakKA(this.KkAmAJa) > 0.0f) {
            return false;
        }
        if (kaajmma3.MaJakKA(this.kkAmAJa) > 0.0f) {
            return false;
        }
        if (kaajmma3.MaJakKA(this.KKAmAJa) > 0.0f) {
            return false;
        }
        if (kaajmma3.MaJakKA(this.kKAmAJa) > 0.0f) {
            return false;
        }
        float f = kaajmma3.MaJakKA(this.KkamAJa);
        if (f < this.KKamAJa) {
            return false;
        }
        return !(f > this.kKamAJa);
    }

    public int KkaMajA(mmaakkk mmaakkk2) {
        float f;
        float f2;
        float f3;
        float f4;
        kaajmma kaajmma2 = mmaakkk2.Majakka.mAjAkKA(this.kkamAJa);
        float f5 = mmaakkk2.MaJAkka * mmaakkk2.majakka.MajaKka;
        int n = 0;
        float f6 = kaajmma2.MaJakKA(this.KkAmAJa);
        if (f4 > -f5) {
            if (f6 > f5) {
                return -1;
            }
            n |= 0x40;
        }
        f6 = kaajmma2.MaJakKA(this.kkAmAJa);
        if (f3 > -f5) {
            if (f6 > f5) {
                return -1;
            }
            n |= 0x200;
        }
        f6 = kaajmma2.MaJakKA(this.KKAmAJa);
        if (f2 > -f5) {
            if (f6 > f5) {
                return -1;
            }
            n |= 1;
        }
        f6 = kaajmma2.MaJakKA(this.kKAmAJa);
        if (f > -f5) {
            if (f6 > f5) {
                return -1;
            }
            n |= 8;
        }
        if ((f6 = kaajmma2.MaJakKA(this.KkamAJa)) - f5 < this.KKamAJa) {
            if (f6 + f5 < this.KKamAJa) {
                return -1;
            }
            n |= 0x8000;
        }
        if (f6 + f5 > this.kKamAJa) {
            if (f6 - f5 > this.kKamAJa) {
                return -1;
            }
            n |= 0x1000;
        }
        return n;
    }

    public kaaamka() {
        super();
    }
}

