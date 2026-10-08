// 
// Decompiled by Procyon v0.6.0
// 

class mmjjmka extends kaajmma
{
    static final float kaMaJAK = 1024.0f;
    
    void kamaJak(final kaaakkk kaaakkk, final kaaakkk kaaakkk2) {
        final float n = kaaakkk2.amAJAkK - kaaakkk.amAJAkK;
        if (n == 0.0f) {
            super.MajaKka = kaaakkk.MajaKka;
            super.majaKka = kaaakkk.majaKka;
            super.MAjaKka = kaaakkk.MAjaKka;
            return;
        }
        final float n2 = (1024.0f - kaaakkk.amAJAkK) / n;
        super.MajaKka = kaaakkk.MajaKka + n2 * (kaaakkk2.MajaKka - kaaakkk.MajaKka);
        super.majaKka = kaaakkk.majaKka + n2 * (kaaakkk2.majaKka - kaaakkk.majaKka);
        super.MAjaKka = kaaakkk.MAjaKka + n2 * (kaaakkk2.MAjaKka - kaaakkk.MAjaKka);
    }
}
