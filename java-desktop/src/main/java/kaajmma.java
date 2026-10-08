// 
// Decompiled by Procyon v0.6.0
// 

public class kaajmma
{
    public static final kaajmma MaJaKka;
    public static final kaajmma maJaKka;
    public static final kaajmma MAJaKka;
    public static final kaajmma mAJaKka;
    public float MajaKka;
    public float majaKka;
    public float MAjaKka;
    
    public kaajmma() {
    }
    
    public kaajmma(final kaajmma kaajmma) {
        this.MajaKka = kaajmma.MajaKka;
        this.majaKka = kaajmma.majaKka;
        this.MAjaKka = kaajmma.MAjaKka;
    }
    
    public kaajmma(final float majaKka, final float majaKka2, final float mAjaKka) {
        this.MajaKka = majaKka;
        this.majaKka = majaKka2;
        this.MAjaKka = mAjaKka;
    }
    
    public kaajmma(final double n, final double n2, final double n3) {
        this.MajaKka = (float)n;
        this.majaKka = (float)n2;
        this.MAjaKka = (float)n3;
    }
    
    public final void MAJAkKA(final kaajmma kaajmma) {
        this.MajaKka = kaajmma.MajaKka;
        this.majaKka = kaajmma.majaKka;
        this.MAjaKka = kaajmma.MAjaKka;
    }
    
    public final void mAJaKka(final float majaKka, final float majaKka2, final float mAjaKka) {
        this.MajaKka = majaKka;
        this.majaKka = majaKka2;
        this.MAjaKka = mAjaKka;
    }
    
    public final void MajAkKA(final double n, final double n2, final double n3) {
        this.MajaKka = (float)n;
        this.majaKka = (float)n2;
        this.MAjaKka = (float)n3;
    }
    
    public final void mAJAKKA(final float mAjaKka) {
        this.MajaKka = mAjaKka;
        this.majaKka = mAjaKka;
        this.MAjaKka = mAjaKka;
    }
    
    public final void mAjaKka(final double n) {
        this.MajaKka = (float)n;
        this.majaKka = (float)n;
        this.MAjaKka = (float)n;
    }
    
    public final float MaJakKA(final kaajmma kaajmma) {
        return this.MajaKka * kaajmma.MajaKka + this.majaKka * kaajmma.majaKka + this.MAjaKka * kaajmma.MAjaKka;
    }
    
    public final float maJAKka() {
        return (float)Math.sqrt(this.MajaKka * this.MajaKka + this.majaKka * this.majaKka + this.MAjaKka * this.MAjaKka);
    }
    
    public final float maJAKKA() {
        return this.MajaKka * this.MajaKka + this.majaKka * this.majaKka + this.MAjaKka * this.MAjaKka;
    }
    
    public final float MAJaKka() {
        return (float)Math.atan2(this.MAjaKka, this.majaKka);
    }
    
    public final float maJaKka() {
        return (float)Math.atan2(this.MajaKka, this.MAjaKka);
    }
    
    public final float MAjAkKA() {
        return (float)Math.atan2(this.majaKka, this.MajaKka);
    }
    
    public final void MAJAKKA() {
        this.MajaKka = -this.MajaKka;
        this.majaKka = -this.majaKka;
        this.MAjaKka = -this.MAjaKka;
    }
    
    public final void MaJaKka(final kaajmma kaajmma) {
        this.MajaKka += kaajmma.MajaKka;
        this.majaKka += kaajmma.majaKka;
        this.MAjaKka += kaajmma.MAjaKka;
    }
    
    public final void MajAKKA(final kaajmma kaajmma) {
        this.MajaKka -= kaajmma.MajaKka;
        this.majaKka -= kaajmma.majaKka;
        this.MAjaKka -= kaajmma.MAjaKka;
    }
    
    public final void MajaKKA(final float n, final float n2, final float n3) {
        this.MajaKka += n;
        this.majaKka += n2;
        this.MAjaKka += n3;
    }
    
    public final void MAjakKA(final float n, final float n2, final float n3) {
        this.MajaKka -= n;
        this.majaKka -= n2;
        this.MAjaKka -= n3;
    }
    
    public final void mAjakKA(final float n) {
        this.MajaKka *= n;
        this.majaKka *= n;
        this.MAjaKka *= n;
    }
    
    public final void mAJaKKA(final float n) {
        this.MajaKka /= n;
        this.majaKka /= n;
        this.MAjaKka /= n;
    }
    
    public final void MAJAKka(final kaajmma kaajmma) {
        this.MajaKka *= kaajmma.MajaKka;
        this.majaKka *= kaajmma.majaKka;
        this.MAjaKka *= kaajmma.MAjaKka;
    }
    
    public final void mAjAKKA(final float n, final float n2, final float n3) {
        this.MajaKka *= n;
        this.majaKka *= n2;
        this.MAjaKka *= n3;
    }
    
    public final void MaJAkKA(final kaajmma kaajmma) {
        final float majaKka = this.majaKka * kaajmma.MAjaKka - this.MAjaKka * kaajmma.majaKka;
        final float majaKka2 = this.MAjaKka * kaajmma.MajaKka - this.MajaKka * kaajmma.MAjaKka;
        final float mAjaKka = this.MajaKka * kaajmma.majaKka - this.majaKka * kaajmma.MajaKka;
        this.MajaKka = majaKka;
        this.majaKka = majaKka2;
        this.MAjaKka = mAjaKka;
    }
    
    public final void MaJAKKA() {
        final float n = (float)Math.sqrt(this.MajaKka * this.MajaKka + this.majaKka * this.majaKka + this.MAjaKka * this.MAjaKka);
        this.MajaKka /= n;
        this.majaKka /= n;
        this.MAjaKka /= n;
    }
    
    public final void majAKKA(final float n) {
        final float majaKka = this.majaKka * (float)Math.cos(n) - (float)Math.sin(n) * this.MAjaKka;
        final float mAjaKka = this.MAjaKka * (float)Math.cos(n) + (float)Math.sin(n) * this.majaKka;
        this.majaKka = majaKka;
        this.MAjaKka = mAjaKka;
    }
    
    public final void MajaKka(final float n) {
        final float majaKka = this.MajaKka * (float)Math.cos(n) + (float)Math.sin(n) * this.MAjaKka;
        final float mAjaKka = this.MAjaKka * (float)Math.cos(n) - (float)Math.sin(n) * this.MajaKka;
        this.MajaKka = majaKka;
        this.MAjaKka = mAjaKka;
    }
    
    public final void majakKA(final float n) {
        final float majaKka = this.MajaKka * (float)Math.cos(n) - (float)Math.sin(n) * this.majaKka;
        final float majaKka2 = this.majaKka * (float)Math.cos(n) + (float)Math.sin(n) * this.MajaKka;
        this.MajaKka = majaKka;
        this.majaKka = majaKka2;
    }
    
    public final void majAkKA(final kaajmma kaajmma) {
        this.mAJAkKA(kaajmma.MajaKka, kaajmma.majaKka, kaajmma.MAjaKka);
    }
    
    public final void MAJaKKA(final float n, final float n2, final float n3) {
        this.majaKKA(n);
        this.mAjaKKA(n2);
        this.MAjaKKA(n3);
    }
    
    public final kaajmma mAjAkKA(final kaajmma kaajmma) {
        final kaajmma kaajmma2 = new kaajmma(this);
        kaajmma2.MaJaKka(kaajmma);
        return kaajmma2;
    }
    
    public final kaajmma MAJakKA(final kaajmma kaajmma) {
        final kaajmma kaajmma2 = new kaajmma(this);
        kaajmma2.MajAKKA(kaajmma);
        return kaajmma2;
    }
    
    public final kaajmma mAJakKA(final float n, final float n2, final float n3) {
        return new kaajmma(this.MajaKka + n, this.majaKka + n2, this.MAjaKka + n3);
    }
    
    public final kaajmma MAjaKka(final float n, final float n2, final float n3) {
        return new kaajmma(this.MajaKka - n, this.majaKka - n2, this.MAjaKka - n3);
    }
    
    public final kaajmma MAjAKKA() {
        return new kaajmma(-this.MajaKka, -this.majaKka, -this.MAjaKka);
    }
    
    public final kaajmma MajakKA(final float n) {
        final kaajmma kaajmma = new kaajmma(this);
        kaajmma.mAjakKA(n);
        return kaajmma;
    }
    
    public final kaajmma MaJAKka(final float n) {
        final kaajmma kaajmma = new kaajmma(this);
        kaajmma.mAJaKKA(n);
        return kaajmma;
    }
    
    public final kaajmma maJAkKA(final kaajmma kaajmma) {
        final kaajmma kaajmma2 = new kaajmma(this);
        kaajmma2.MAJAKka(kaajmma);
        return kaajmma2;
    }
    
    public final kaajmma majaKka(final kaajmma kaajmma) {
        final kaajmma kaajmma2 = new kaajmma(this);
        kaajmma2.MaJAkKA(kaajmma);
        return kaajmma2;
    }
    
    public final kaajmma maJakKA() {
        final kaajmma kaajmma = new kaajmma(this);
        kaajmma.MaJAKKA();
        return kaajmma;
    }
    
    public final kaajmma mAjaKKA(final float n) {
        final kaajmma kaajmma = new kaajmma(this);
        kaajmma.majAKKA(n);
        return kaajmma;
    }
    
    public final kaajmma MAjaKKA(final float n) {
        final kaajmma kaajmma = new kaajmma(this);
        kaajmma.MajaKka(n);
        return kaajmma;
    }
    
    public final kaajmma majaKKA(final float n) {
        final kaajmma kaajmma = new kaajmma(this);
        kaajmma.majakKA(n);
        return kaajmma;
    }
    
    public final kaajmma maJaKKA(final kaajmma kaajmma) {
        final kaajmma kaajmma2 = new kaajmma(this);
        kaajmma2.majakKA(kaajmma.MajaKka);
        kaajmma2.majAKKA(kaajmma.majaKka);
        kaajmma2.MajaKka(kaajmma.MAjaKka);
        return kaajmma2;
    }
    
    public final kaajmma mAJAkKA(final float n, final float n2, final float n3) {
        final kaajmma kaajmma = new kaajmma(this);
        kaajmma.majakKA(n);
        kaajmma.majAKKA(n2);
        kaajmma.MajaKka(n3);
        return kaajmma;
    }
    
    public final String toString() {
        return "Vector3f:{" + this.MajaKka + "; " + this.majaKka + "; " + this.MAjaKka + "} ";
    }
    
    static {
        MaJaKka = new kaajmma(0.0f, 0.0f, 0.0f);
        maJaKka = new kaajmma(1.0f, 0.0f, 0.0f);
        MAJaKka = new kaajmma(0.0f, 1.0f, 0.0f);
        mAJaKka = new kaajmma(0.0f, 0.0f, 1.0f);
    }
}
