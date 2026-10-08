// 
// Decompiled by Procyon v0.6.0
// 

public class Vec3f
{
    public static final Vec3f MaJaKka;
    public static final Vec3f maJaKka;
    public static final Vec3f MAJaKka;
    public static final Vec3f mAJaKka;
    public float x;
    public float y;
    public float z;
    
    public Vec3f() {
    }
    
    public Vec3f(final Vec3f kaajmma) {
        this.x = kaajmma.x;
        this.y = kaajmma.y;
        this.z = kaajmma.z;
    }
    
    public Vec3f(final float majaKka, final float majaKka2, final float mAjaKka) {
        this.x = majaKka;
        this.y = majaKka2;
        this.z = mAjaKka;
    }
    
    public Vec3f(final double n, final double n2, final double n3) {
        this.x = (float)n;
        this.y = (float)n2;
        this.z = (float)n3;
    }
    
    public final void MAJAkKA(final Vec3f kaajmma) {
        this.x = kaajmma.x;
        this.y = kaajmma.y;
        this.z = kaajmma.z;
    }
    
    public final void mAJaKka(final float majaKka, final float majaKka2, final float mAjaKka) {
        this.x = majaKka;
        this.y = majaKka2;
        this.z = mAjaKka;
    }
    
    public final void MajAkKA(final double n, final double n2, final double n3) {
        this.x = (float)n;
        this.y = (float)n2;
        this.z = (float)n3;
    }
    
    public final void mAJAKKA(final float mAjaKka) {
        this.x = mAjaKka;
        this.y = mAjaKka;
        this.z = mAjaKka;
    }
    
    public final void mAjaKka(final double n) {
        this.x = (float)n;
        this.y = (float)n;
        this.z = (float)n;
    }
    
    public final float MaJakKA(final Vec3f kaajmma) {
        return this.x * kaajmma.x + this.y * kaajmma.y + this.z * kaajmma.z;
    }
    
    public final float maJAKka() {
        return (float)Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }
    
    public final float maJAKKA() {
        return this.x * this.x + this.y * this.y + this.z * this.z;
    }
    
    public final float MAJaKka() {
        return (float)Math.atan2(this.z, this.y);
    }
    
    public final float maJaKka() {
        return (float)Math.atan2(this.x, this.z);
    }
    
    public final float MAjAkKA() {
        return (float)Math.atan2(this.y, this.x);
    }
    
    public final void MAJAKKA() {
        this.x = -this.x;
        this.y = -this.y;
        this.z = -this.z;
    }
    
    public final void MaJaKka(final Vec3f kaajmma) {
        this.x += kaajmma.x;
        this.y += kaajmma.y;
        this.z += kaajmma.z;
    }
    
    public final void MajAKKA(final Vec3f kaajmma) {
        this.x -= kaajmma.x;
        this.y -= kaajmma.y;
        this.z -= kaajmma.z;
    }
    
    public final void MajaKKA(final float n, final float n2, final float n3) {
        this.x += n;
        this.y += n2;
        this.z += n3;
    }
    
    public final void MAjakKA(final float n, final float n2, final float n3) {
        this.x -= n;
        this.y -= n2;
        this.z -= n3;
    }
    
    public final void mAjakKA(final float n) {
        this.x *= n;
        this.y *= n;
        this.z *= n;
    }
    
    public final void mAJaKKA(final float n) {
        this.x /= n;
        this.y /= n;
        this.z /= n;
    }
    
    public final void MAJAKka(final Vec3f kaajmma) {
        this.x *= kaajmma.x;
        this.y *= kaajmma.y;
        this.z *= kaajmma.z;
    }
    
    public final void mAjAKKA(final float n, final float n2, final float n3) {
        this.x *= n;
        this.y *= n2;
        this.z *= n3;
    }
    
    public final void MaJAkKA(final Vec3f kaajmma) {
        final float majaKka = this.y * kaajmma.z - this.z * kaajmma.y;
        final float majaKka2 = this.z * kaajmma.x - this.x * kaajmma.z;
        final float mAjaKka = this.x * kaajmma.y - this.y * kaajmma.x;
        this.x = majaKka;
        this.y = majaKka2;
        this.z = mAjaKka;
    }
    
    public final void MaJAKKA() {
        final float n = (float)Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
        this.x /= n;
        this.y /= n;
        this.z /= n;
    }
    
    public final void majAKKA(final float n) {
        final float majaKka = this.y * (float)Math.cos(n) - (float)Math.sin(n) * this.z;
        final float mAjaKka = this.z * (float)Math.cos(n) + (float)Math.sin(n) * this.y;
        this.y = majaKka;
        this.z = mAjaKka;
    }
    
    public final void MajaKka(final float n) {
        final float majaKka = this.x * (float)Math.cos(n) + (float)Math.sin(n) * this.z;
        final float mAjaKka = this.z * (float)Math.cos(n) - (float)Math.sin(n) * this.x;
        this.x = majaKka;
        this.z = mAjaKka;
    }
    
    public final void majakKA(final float n) {
        final float majaKka = this.x * (float)Math.cos(n) - (float)Math.sin(n) * this.y;
        final float majaKka2 = this.y * (float)Math.cos(n) + (float)Math.sin(n) * this.x;
        this.x = majaKka;
        this.y = majaKka2;
    }
    
    public final void majAkKA(final Vec3f kaajmma) {
        this.mAJAkKA(kaajmma.x, kaajmma.y, kaajmma.z);
    }
    
    public final void MAJaKKA(final float n, final float n2, final float n3) {
        this.majaKKA(n);
        this.mAjaKKA(n2);
        this.MAjaKKA(n3);
    }
    
    public final Vec3f mAjAkKA(final Vec3f kaajmma) {
        final Vec3f kaajmma2 = new Vec3f(this);
        kaajmma2.MaJaKka(kaajmma);
        return kaajmma2;
    }
    
    public final Vec3f MAJakKA(final Vec3f kaajmma) {
        final Vec3f kaajmma2 = new Vec3f(this);
        kaajmma2.MajAKKA(kaajmma);
        return kaajmma2;
    }
    
    public final Vec3f mAJakKA(final float n, final float n2, final float n3) {
        return new Vec3f(this.x + n, this.y + n2, this.z + n3);
    }
    
    public final Vec3f MAjaKka(final float n, final float n2, final float n3) {
        return new Vec3f(this.x - n, this.y - n2, this.z - n3);
    }
    
    public final Vec3f MAjAKKA() {
        return new Vec3f(-this.x, -this.y, -this.z);
    }
    
    public final Vec3f MajakKA(final float n) {
        final Vec3f kaajmma = new Vec3f(this);
        kaajmma.mAjakKA(n);
        return kaajmma;
    }
    
    public final Vec3f MaJAKka(final float n) {
        final Vec3f kaajmma = new Vec3f(this);
        kaajmma.mAJaKKA(n);
        return kaajmma;
    }
    
    public final Vec3f maJAkKA(final Vec3f kaajmma) {
        final Vec3f kaajmma2 = new Vec3f(this);
        kaajmma2.MAJAKka(kaajmma);
        return kaajmma2;
    }
    
    public final Vec3f majaKka(final Vec3f kaajmma) {
        final Vec3f kaajmma2 = new Vec3f(this);
        kaajmma2.MaJAkKA(kaajmma);
        return kaajmma2;
    }
    
    public final Vec3f maJakKA() {
        final Vec3f kaajmma = new Vec3f(this);
        kaajmma.MaJAKKA();
        return kaajmma;
    }
    
    public final Vec3f mAjaKKA(final float n) {
        final Vec3f kaajmma = new Vec3f(this);
        kaajmma.majAKKA(n);
        return kaajmma;
    }
    
    public final Vec3f MAjaKKA(final float n) {
        final Vec3f kaajmma = new Vec3f(this);
        kaajmma.MajaKka(n);
        return kaajmma;
    }
    
    public final Vec3f majaKKA(final float n) {
        final Vec3f kaajmma = new Vec3f(this);
        kaajmma.majakKA(n);
        return kaajmma;
    }
    
    public final Vec3f maJaKKA(final Vec3f kaajmma) {
        final Vec3f kaajmma2 = new Vec3f(this);
        kaajmma2.majakKA(kaajmma.x);
        kaajmma2.majAKKA(kaajmma.y);
        kaajmma2.MajaKka(kaajmma.z);
        return kaajmma2;
    }
    
    public final Vec3f mAJAkKA(final float n, final float n2, final float n3) {
        final Vec3f kaajmma = new Vec3f(this);
        kaajmma.majakKA(n);
        kaajmma.majAKKA(n2);
        kaajmma.MajaKka(n3);
        return kaajmma;
    }
    
    public final String toString() {
        return "Vector3f:{" + this.x + "; " + this.y + "; " + this.z + "} ";
    }
    
    static {
        MaJaKka = new Vec3f(0.0f, 0.0f, 0.0f);
        maJaKka = new Vec3f(1.0f, 0.0f, 0.0f);
        MAJaKka = new Vec3f(0.0f, 1.0f, 0.0f);
        mAJaKka = new Vec3f(0.0f, 0.0f, 1.0f);
    }
}
