/*
 * Decompiled with CFR 0.152.
 */
public class mmjamma {
    public static final mmjamma mAjaKka = new mmjamma(0.0, 0.0, 0.0);
    public static final mmjamma MaJAKka = new mmjamma(1.0, 0.0, 0.0);
    public static final mmjamma maJAKka = new mmjamma(0.0, 1.0, 0.0);
    public static final mmjamma MAJAKka = new mmjamma(0.0, 0.0, 1.0);
    public double mAJAKka;
    public double MajAKka;
    public double majAKka;

    public mmjamma() {
        super();
    }

    public mmjamma(mmjamma mmjamma2) {
        super();
        this.mAJAKka = mmjamma2.mAJAKka;
        this.MajAKka = mmjamma2.MajAKka;
        this.majAKka = mmjamma2.majAKka;
    }

    public mmjamma(double d, double d2, double d3) {
        super();
        this.mAJAKka = d;
        this.MajAKka = d2;
        this.majAKka = d3;
    }

    public final void mAjAKKa(mmjamma mmjamma2) {
        this.mAJAKka = mmjamma2.mAJAKka;
        this.MajAKka = mmjamma2.MajAKka;
        this.majAKka = mmjamma2.majAKka;
    }

    public final void majaKKa(double d, double d2, double d3) {
        this.mAJAKka = d;
        this.MajAKka = d2;
        this.majAKka = d3;
    }

    public final void maJakKa(double d) {
        this.mAJAKka = d;
        this.MajAKka = d;
        this.majAKka = d;
    }

    public final double mAjaKKa(mmjamma mmjamma2) {
        return this.mAJAKka * mmjamma2.mAJAKka + this.MajAKka * mmjamma2.MajAKka + this.majAKka * mmjamma2.majAKka;
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

    public final void maJakka(mmjamma mmjamma2) {
        this.mAJAKka += mmjamma2.mAJAKka;
        this.MajAKka += mmjamma2.MajAKka;
        this.majAKka += mmjamma2.majAKka;
    }

    public final void MAJaKKa(mmjamma mmjamma2) {
        this.mAJAKka -= mmjamma2.mAJAKka;
        this.MajAKka -= mmjamma2.MajAKka;
        this.majAKka -= mmjamma2.majAKka;
    }

    public final void MAjAKKa(double d, double d2, double d3) {
        this.mAJAKka += d;
        this.MajAKka += d2;
        this.majAKka += d3;
    }

    public final void mAJAkka(double d, double d2, double d3) {
        this.mAJAKka -= d;
        this.MajAKka -= d2;
        this.majAKka -= d3;
    }

    public final void Majakka(double d) {
        this.mAJAKka *= d;
        this.MajAKka *= d;
        this.majAKka *= d;
    }

    public final void MAJAKKa(double d) {
        this.mAJAKka /= d;
        this.MajAKka /= d;
        this.majAKka /= d;
    }

    public final void MajAkka(mmjamma mmjamma2) {
        this.mAJAKka *= mmjamma2.mAJAKka;
        this.MajAKka *= mmjamma2.MajAKka;
        this.majAKka *= mmjamma2.majAKka;
    }

    public final void majAKka(double d, double d2, double d3) {
        this.mAJAKka *= d;
        this.MajAKka *= d2;
        this.majAKka *= d3;
    }

    public final void majAKKa(mmjamma mmjamma2) {
        double d = this.MajAKka * mmjamma2.majAKka - this.majAKka * mmjamma2.MajAKka;
        double d2 = this.majAKka * mmjamma2.mAJAKka - this.mAJAKka * mmjamma2.majAKka;
        double d3 = this.mAJAKka * mmjamma2.MajAKka - this.MajAKka * mmjamma2.mAJAKka;
        this.mAJAKka = d;
        this.MajAKka = d2;
        this.majAKka = d3;
    }

    public final void mAjAKka() {
        double d = Math.sqrt(this.mAJAKka * this.mAJAKka + this.MajAKka * this.MajAKka + this.majAKka * this.majAKka);
        this.mAJAKka /= d;
        this.MajAKka /= d;
        this.majAKka /= d;
    }

    public final void MajAKka(double d) {
        double d2 = this.MajAKka * Math.cos(d) - Math.sin(d) * this.majAKka;
        double d3 = this.majAKka * Math.cos(d) + Math.sin(d) * this.MajAKka;
        this.MajAKka = d2;
        this.majAKka = d3;
    }

    public final void maJaKKa(double d) {
        double d2 = this.mAJAKka * Math.cos(d) + Math.sin(d) * this.majAKka;
        double d3 = this.majAKka * Math.cos(d) - Math.sin(d) * this.mAJAKka;
        this.mAJAKka = d2;
        this.majAKka = d3;
    }

    public final void MAJakka(double d) {
        double d2 = this.mAJAKka * Math.cos(d) - Math.sin(d) * this.MajAKka;
        double d3 = this.MajAKka * Math.cos(d) + Math.sin(d) * this.mAJAKka;
        this.mAJAKka = d2;
        this.MajAKka = d3;
    }

    public final void MAjAKka(mmjamma mmjamma2) {
        this.mAJakka(mmjamma2.mAJAKka, mmjamma2.MajAKka, mmjamma2.majAKka);
    }

    public final void MajAKKa(double d, double d2, double d3) {
        this.mAJaKKa(d);
        this.MAjaKKa(d2);
        this.MajaKKa(d3);
    }

    public final mmjamma maJAKKa(mmjamma mmjamma2) {
        mmjamma mmjamma3 = new mmjamma(this);
        mmjamma3.maJakka(mmjamma2);
        return mmjamma3;
    }

    public final mmjamma mAjakka(mmjamma mmjamma2) {
        mmjamma mmjamma3 = new mmjamma(this);
        mmjamma3.MAJaKKa(mmjamma2);
        return mmjamma3;
    }

    public final mmjamma MAJakKa(double d, double d2, double d3) {
        return new mmjamma(this.mAJAKka + d, this.MajAKka + d2, this.majAKka + d3);
    }

    public final mmjamma MAjAkka(double d, double d2, double d3) {
        return new mmjamma(this.mAJAKka - d, this.MajAKka - d2, this.majAKka - d3);
    }

    public final mmjamma majakka() {
        return new mmjamma(-this.mAJAKka, -this.MajAKka, -this.majAKka);
    }

    public final mmjamma MaJakKa(double d) {
        mmjamma mmjamma2 = new mmjamma(this);
        mmjamma2.Majakka(d);
        return mmjamma2;
    }

    public final mmjamma mAjAkka(double d) {
        mmjamma mmjamma2 = new mmjamma(this);
        mmjamma2.MAJAKKa(d);
        return mmjamma2;
    }

    public final mmjamma majAkka(mmjamma mmjamma2) {
        mmjamma mmjamma3 = new mmjamma(this);
        mmjamma3.MajAkka(mmjamma2);
        return mmjamma3;
    }

    public final mmjamma mAJAKKa(mmjamma mmjamma2) {
        mmjamma mmjamma3 = new mmjamma(this);
        mmjamma3.majAKKa(mmjamma2);
        return mmjamma3;
    }

    public final mmjamma MAjakka() {
        mmjamma mmjamma2 = new mmjamma(this);
        mmjamma2.mAjAKka();
        return mmjamma2;
    }

    public final mmjamma MAjaKKa(double d) {
        mmjamma mmjamma2 = new mmjamma(this);
        mmjamma2.MajAKka(d);
        return mmjamma2;
    }

    public final mmjamma MajaKKa(double d) {
        mmjamma mmjamma2 = new mmjamma(this);
        mmjamma2.maJaKKa(d);
        return mmjamma2;
    }

    public final mmjamma mAJaKKa(double d) {
        mmjamma mmjamma2 = new mmjamma(this);
        mmjamma2.MAJakka(d);
        return mmjamma2;
    }

    public final mmjamma mAJAKka(mmjamma mmjamma2) {
        mmjamma mmjamma3 = new mmjamma(this);
        mmjamma3.MAJakka(mmjamma2.mAJAKka);
        mmjamma3.MajAKka(mmjamma2.MajAKka);
        mmjamma3.maJaKKa(mmjamma2.majAKka);
        return mmjamma3;
    }

    public final mmjamma mAJakka(double d, double d2, double d3) {
        mmjamma mmjamma2 = new mmjamma(this);
        mmjamma2.MAJakka(d);
        mmjamma2.MajAKka(d2);
        mmjamma2.maJaKKa(d3);
        return mmjamma2;
    }

    public final String toString() {
        return "{" + this.mAJAKka + "; " + this.MajAKka + "; " + this.majAKka + "} ";
    }

    static {
    }
}

