// 
// Decompiled by Procyon v0.6.0
// 

public class mmjamma
{
    public static final mmjamma mAjaKka;
    public static final mmjamma MaJAKka;
    public static final mmjamma maJAKka;
    public static final mmjamma MAJAKka;
    public double mAJAKka;
    public double MajAKka;
    public double majAKka;
    
    public mmjamma() {
    }
    
    public mmjamma(final mmjamma mmjamma) {
        this.mAJAKka = mmjamma.mAJAKka;
        this.MajAKka = mmjamma.MajAKka;
        this.majAKka = mmjamma.majAKka;
    }
    
    public mmjamma(final double majaKka, final double majAKka, final double majAKka2) {
        this.mAJAKka = majaKka;
        this.MajAKka = majAKka;
        this.majAKka = majAKka2;
    }
    
    public final void mAjAKKa(final mmjamma mmjamma) {
        this.mAJAKka = mmjamma.mAJAKka;
        this.MajAKka = mmjamma.MajAKka;
        this.majAKka = mmjamma.majAKka;
    }
    
    public final void majaKKa(final double majaKka, final double majAKka, final double majAKka2) {
        this.mAJAKka = majaKka;
        this.MajAKka = majAKka;
        this.majAKka = majAKka2;
    }
    
    public final void maJakKa(final double majAKka) {
        this.mAJAKka = majAKka;
        this.MajAKka = majAKka;
        this.majAKka = majAKka;
    }
    
    public final double mAjaKKa(final mmjamma mmjamma) {
        return this.mAJAKka * mmjamma.mAJAKka + this.MajAKka * mmjamma.MajAKka + this.majAKka * mmjamma.majAKka;
    }
    
    public final double MaJaKKa() {
        return Math.sqrt(this.mAJAKka * this.mAJAKka + this.MajAKka * this.MajAKka + this.majAKka * this.majAKka);
    }
    
    public final double MaJAKKa() {
        return this.mAJAKka * this.mAJAKka + this.MajAKka * this.MajAKka + this.majAKka * this.majAKka;
    }
    
    public final double MAJAkka() {
        return Math.atan2(this.majAKka, this.MajAKka);
    }
    
    public final double maJAkka() {
        return Math.atan2(this.mAJAKka, this.majAKka);
    }
    
    public final double MaJAkka() {
        return Math.atan2(this.MajAKka, this.mAJAKka);
    }
    
    public final void MaJakka() {
        this.mAJAKka = -this.mAJAKka;
        this.MajAKka = -this.MajAKka;
        this.majAKka = -this.majAKka;
    }
    
    public final void maJakka(final mmjamma mmjamma) {
        this.mAJAKka += mmjamma.mAJAKka;
        this.MajAKka += mmjamma.MajAKka;
        this.majAKka += mmjamma.majAKka;
    }
    
    public final void MAJaKKa(final mmjamma mmjamma) {
        this.mAJAKka -= mmjamma.mAJAKka;
        this.MajAKka -= mmjamma.MajAKka;
        this.majAKka -= mmjamma.majAKka;
    }
    
    public final void MAjAKKa(final double n, final double n2, final double n3) {
        this.mAJAKka += n;
        this.MajAKka += n2;
        this.majAKka += n3;
    }
    
    public final void mAJAkka(final double n, final double n2, final double n3) {
        this.mAJAKka -= n;
        this.MajAKka -= n2;
        this.majAKka -= n3;
    }
    
    public final void Majakka(final double n) {
        this.mAJAKka *= n;
        this.MajAKka *= n;
        this.majAKka *= n;
    }
    
    public final void MAJAKKa(final double n) {
        this.mAJAKka /= n;
        this.MajAKka /= n;
        this.majAKka /= n;
    }
    
    public final void MajAkka(final mmjamma mmjamma) {
        this.mAJAKka *= mmjamma.mAJAKka;
        this.MajAKka *= mmjamma.MajAKka;
        this.majAKka *= mmjamma.majAKka;
    }
    
    public final void majAKka(final double n, final double n2, final double n3) {
        this.mAJAKka *= n;
        this.MajAKka *= n2;
        this.majAKka *= n3;
    }
    
    public final void majAKKa(final mmjamma mmjamma) {
        final double majaKka = this.MajAKka * mmjamma.majAKka - this.majAKka * mmjamma.MajAKka;
        final double majAKka = this.majAKka * mmjamma.mAJAKka - this.mAJAKka * mmjamma.majAKka;
        final double majAKka2 = this.mAJAKka * mmjamma.MajAKka - this.MajAKka * mmjamma.mAJAKka;
        this.mAJAKka = majaKka;
        this.MajAKka = majAKka;
        this.majAKka = majAKka2;
    }
    
    public final void mAjAKka() {
        final double sqrt = Math.sqrt(this.mAJAKka * this.mAJAKka + this.MajAKka * this.MajAKka + this.majAKka * this.majAKka);
        this.mAJAKka /= sqrt;
        this.MajAKka /= sqrt;
        this.majAKka /= sqrt;
    }
    
    public final void MajAKka(final double n) {
        final double majAKka = this.MajAKka * Math.cos(n) - Math.sin(n) * this.majAKka;
        final double majAKka2 = this.majAKka * Math.cos(n) + Math.sin(n) * this.MajAKka;
        this.MajAKka = majAKka;
        this.majAKka = majAKka2;
    }
    
    public final void maJaKKa(final double n) {
        final double majaKka = this.mAJAKka * Math.cos(n) + Math.sin(n) * this.majAKka;
        final double majAKka = this.majAKka * Math.cos(n) - Math.sin(n) * this.mAJAKka;
        this.mAJAKka = majaKka;
        this.majAKka = majAKka;
    }
    
    public final void MAJakka(final double n) {
        final double majaKka = this.mAJAKka * Math.cos(n) - Math.sin(n) * this.MajAKka;
        final double majAKka = this.MajAKka * Math.cos(n) + Math.sin(n) * this.mAJAKka;
        this.mAJAKka = majaKka;
        this.MajAKka = majAKka;
    }
    
    public final void MAjAKka(final mmjamma mmjamma) {
        this.mAJakka(mmjamma.mAJAKka, mmjamma.MajAKka, mmjamma.majAKka);
    }
    
    public final void MajAKKa(final double n, final double n2, final double n3) {
        this.mAJaKKa(n);
        this.MAjaKKa(n2);
        this.MajaKKa(n3);
    }
    
    public final mmjamma maJAKKa(final mmjamma mmjamma) {
        final mmjamma mmjamma2 = new mmjamma(this);
        mmjamma2.maJakka(mmjamma);
        return mmjamma2;
    }
    
    public final mmjamma mAjakka(final mmjamma mmjamma) {
        final mmjamma mmjamma2 = new mmjamma(this);
        mmjamma2.MAJaKKa(mmjamma);
        return mmjamma2;
    }
    
    public final mmjamma MAJakKa(final double n, final double n2, final double n3) {
        return new mmjamma(this.mAJAKka + n, this.MajAKka + n2, this.majAKka + n3);
    }
    
    public final mmjamma MAjAkka(final double n, final double n2, final double n3) {
        return new mmjamma(this.mAJAKka - n, this.MajAKka - n2, this.majAKka - n3);
    }
    
    public final mmjamma majakka() {
        return new mmjamma(-this.mAJAKka, -this.MajAKka, -this.majAKka);
    }
    
    public final mmjamma MaJakKa(final double n) {
        final mmjamma mmjamma = new mmjamma(this);
        mmjamma.Majakka(n);
        return mmjamma;
    }
    
    public final mmjamma mAjAkka(final double n) {
        final mmjamma mmjamma = new mmjamma(this);
        mmjamma.MAJAKKa(n);
        return mmjamma;
    }
    
    public final mmjamma majAkka(final mmjamma mmjamma) {
        final mmjamma mmjamma2 = new mmjamma(this);
        mmjamma2.MajAkka(mmjamma);
        return mmjamma2;
    }
    
    public final mmjamma mAJAKKa(final mmjamma mmjamma) {
        final mmjamma mmjamma2 = new mmjamma(this);
        mmjamma2.majAKKa(mmjamma);
        return mmjamma2;
    }
    
    public final mmjamma MAjakka() {
        final mmjamma mmjamma = new mmjamma(this);
        mmjamma.mAjAKka();
        return mmjamma;
    }
    
    public final mmjamma MAjaKKa(final double n) {
        final mmjamma mmjamma = new mmjamma(this);
        mmjamma.MajAKka(n);
        return mmjamma;
    }
    
    public final mmjamma MajaKKa(final double n) {
        final mmjamma mmjamma = new mmjamma(this);
        mmjamma.maJaKKa(n);
        return mmjamma;
    }
    
    public final mmjamma mAJaKKa(final double n) {
        final mmjamma mmjamma = new mmjamma(this);
        mmjamma.MAJakka(n);
        return mmjamma;
    }
    
    public final mmjamma mAJAKka(final mmjamma mmjamma) {
        final mmjamma mmjamma2 = new mmjamma(this);
        mmjamma2.MAJakka(mmjamma.mAJAKka);
        mmjamma2.MajAKka(mmjamma.MajAKka);
        mmjamma2.maJaKKa(mmjamma.majAKka);
        return mmjamma2;
    }
    
    public final mmjamma mAJakka(final double n, final double n2, final double n3) {
        final mmjamma mmjamma = new mmjamma(this);
        mmjamma.MAJakka(n);
        mmjamma.MajAKka(n2);
        mmjamma.maJaKKa(n3);
        return mmjamma;
    }
    
    public final String toString() {
        return "{" + this.mAJAKka + "; " + this.MajAKka + "; " + this.majAKka + "} ";
    }
    
    static {
        mAjaKka = new mmjamma(0.0, 0.0, 0.0);
        MaJAKka = new mmjamma(1.0, 0.0, 0.0);
        maJAKka = new mmjamma(0.0, 1.0, 0.0);
        MAJAKka = new mmjamma(0.0, 0.0, 1.0);
    }
}
