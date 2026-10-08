// 
// Decompiled by Procyon v0.6.0
// 

public class majakma extends kmjjmma
{
    mmjjmkk MaJaKkA;
    kmjjkkk maJaKkA;
    kmajmma MAJaKkA;
    mmajkka mAJaKkA;
    mmajkka MajaKkA;
    mmajkka majaKkA;
    kmaamma MAjaKkA;
    
    public String MaJAkkA() {
        return "trav";
    }
    
    public void MAjakkA() {
        this.maJaKkA = null;
        this.majaKkA.AMAjakk = null;
        this.majaKkA = null;
        this.MajaKkA = null;
        this.MAJaKkA = null;
        this.mAJaKkA = null;
    }
    
    public void mAjakkA(final kmaamma mAjaKkA) {
        this.MAjaKkA = mAjaKkA;
        this.MaJaKkA = new mmjjmkk();
        this.MaJaKkA.amaJAkK = 1.4f;
        this.MaJaKkA.AMAJAkK = 512;
        this.MaJaKkA.aMAJAkK = 256;
        this.MaJaKkA.AmajakK = 7.0f;
        this.MaJaKkA.aMAjakK = 18.0f;
        this.MajaKkA = (mmajkka)kmaakma.MAjaKkA(this.MAjaKkA.aMajAKK("images/lasitausta.jpg"));
        final maaakka maaakka = (maaakka)kmaakma.MAjaKkA(this.MAjaKkA.aMajAKK("images/envplane.gif"));
        final mmajkka maJaKkA = MaJaKkA(maaakka, 0.0f, 0.0f, 0.0f);
        (this.maJaKkA = new kmjjkkk()).AKKAmaj(this.MAjaKkA.aMajAKK("data/hakkyra4.asz"), null);
        for (int i = 0; i < this.maJaKkA.mAjAKkA.size(); ++i) {
            final mmaakkk mmaakkk = (mmaakkk)this.maJaKkA.mAjAKkA.elementAt(i);
            mmaakkk.MaJakka = true;
            mmaakkk.maJAkka = true;
            mmaakkk.MAJAkka = true;
            mmaakkk.jAKKAma(maJaKkA, maaakka);
            mmaakkk.JAKkAma(19);
            mmaakkk.JakKAma();
            mmaakkk.majakka.mAjaKka(1.0);
        }
        this.MAJaKkA = new kmajmma((mmajkka)kmaakma.MAjaKkA(this.MAjaKkA.aMajAKK("images/lc2.jpg")), (maaakka)kmaakma.MAjaKkA(this.MAjaKkA.aMajAKK("images/kasvu.gif")));
        this.MAJaKkA.maJakKA = -130.0f;
        this.MAJaKkA.MaJakKA = 30.0f;
        this.MAJaKkA.MAJakKA = 0.08f;
        final kmajmma maJaKkA2 = this.MAJaKkA;
        maJaKkA2.mAJakKA *= 0.7f;
        this.MAJaKkA.MajakKA = 0.25f;
        this.maJaKkA.mAJAKkA(this.MAJaKkA);
        this.maJaKkA.MAjAKkA();
    }
    
    public void MajakkA(final mmajkka mmajkka, final float majakKa, final float n) {
        mmajkka.aMaJAkk();
        final int n2 = (int)(majakKa * 20.0f) % this.MajaKkA.kAMAJaK;
        mmajkka.amaJAkk(this.MajaKkA, -n2, 0);
        mmajkka.amaJAkk(this.MajaKkA, -n2 + this.MajaKkA.kAMAJaK, 0);
        this.maJaKkA.MAJAKkA(majakKa, this.MaJaKkA);
        final mmaakkk mmaakkk = (mmaakkk)this.maJaKkA.mAjAKkA.elementAt(0);
        this.MAJaKkA.mAJAKKa = majakKa;
        this.MAJaKkA.Majakka.MAJAkKA(mmaakkk.Majakka);
        this.MAJaKkA.MaJakKA = 30.0f;
        final float n3 = (float)Math.max(0.0, Math.sin((double)majakKa * 0.3));
        this.MAJaKkA.MAJakKA = (float)(0.8100000023841858 - 0.8 * n3 * n3);
        this.maJaKkA.mAjAKkA(this.MaJaKkA, godog.KKAMAjA);
        this.maJaKkA.MajAKkA(godog.KKAMAjA);
        mmajkka.aMajAkk();
    }
    
    public void majakkA(final String s, final float n) {
    }
    
    public static mmajkka MaJaKkA(final maaakka maaakka, final float n, final float n2, final float n3) {
        final mmajkka mmajkka = new mmajkka(256, 256, 1, false);
        for (int i = 0; i < 256; ++i) {
            for (int j = 0; j < 256; ++j) {
                final double n4 = 1.0 - i / 255.0;
                mmajkka.AMAjakk[i * 256 + j] = ((int)Math.min(255.0, (maaakka.kaMajaK[j] & 0xFF) * n4 + (1.0 - n4) * n) << 20 | (int)Math.min(255.0, (maaakka.KAMajaK[j] & 0xFF) * n4 + (1.0 - n4) * n2) << 10 | (int)Math.min(255.0, (maaakka.kAMajaK[j] & 0xFF) * n4 + (1.0 - n4) * n3));
            }
        }
        return mmajkka;
    }
}
