/*
 * Decompiled with CFR 0.152.
 */
class mmjjmka
extends kaajmma {
    static final float kaMaJAK = 1024.0f;

    void kamaJak(kaaakkk kaaakkk2, kaaakkk kaaakkk3) {
        float f = kaaakkk3.amAJAkK - kaaakkk2.amAJAkK;
        if (f == 0.0f) {
            this.MajaKka = kaaakkk2.MajaKka;
            this.majaKka = kaaakkk2.majaKka;
            this.MAjaKka = kaaakkk2.MAjaKka;
            return;
        }
        float f2 = (1024.0f - kaaakkk2.amAJAkK) / f;
        this.MajaKka = kaaakkk2.MajaKka + f2 * (kaaakkk3.MajaKka - kaaakkk2.MajaKka);
        this.majaKka = kaaakkk2.majaKka + f2 * (kaaakkk3.majaKka - kaaakkk2.majaKka);
        this.MAjaKka = kaaakkk2.MAjaKka + f2 * (kaaakkk3.MAjaKka - kaaakkk2.MAjaKka);
    }

    mmjjmka() {
        super();
    }
}

