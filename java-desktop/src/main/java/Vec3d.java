// 
// Decompiled by Procyon v0.6.0
// 

public class Vec3d
{
    public static final Vec3d mAjaKka;
    public static final Vec3d MaJAKka;
    public static final Vec3d maJAKka;
    public static final Vec3d MAJAKka;
    public double x;
    public double y;
    public double z;
    
    public Vec3d() {
    }
    
    public Vec3d(final Vec3d mmjamma) {
        this.x = mmjamma.x;
        this.y = mmjamma.y;
        this.z = mmjamma.z;
    }
    
    public Vec3d(final double majaKka, final double majAKka, final double majAKka2) {
        this.x = majaKka;
        this.y = majAKka;
        this.z = majAKka2;
    }
    
    public final void mAjAKKa(final Vec3d mmjamma) {
        this.x = mmjamma.x;
        this.y = mmjamma.y;
        this.z = mmjamma.z;
    }
    
    public final void majaKKa(final double majaKka, final double majAKka, final double majAKka2) {
        this.x = majaKka;
        this.y = majAKka;
        this.z = majAKka2;
    }
    
    public final void maJakKa(final double majAKka) {
        this.x = majAKka;
        this.y = majAKka;
        this.z = majAKka;
    }
    
    public final double mAjaKKa(final Vec3d mmjamma) {
        return this.x * mmjamma.x + this.y * mmjamma.y + this.z * mmjamma.z;
    }
    
    public final double MaJaKKa() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }
    
    public final double MaJAKKa() {
        return this.x * this.x + this.y * this.y + this.z * this.z;
    }
    
    public final double MAJAkka() {
        return Math.atan2(this.z, this.y);
    }
    
    public final double maJAkka() {
        return Math.atan2(this.x, this.z);
    }
    
    public final double MaJAkka() {
        return Math.atan2(this.y, this.x);
    }
    
    public final void MaJakka() {
        this.x = -this.x;
        this.y = -this.y;
        this.z = -this.z;
    }
    
    public final void maJakka(final Vec3d mmjamma) {
        this.x += mmjamma.x;
        this.y += mmjamma.y;
        this.z += mmjamma.z;
    }
    
    public final void MAJaKKa(final Vec3d mmjamma) {
        this.x -= mmjamma.x;
        this.y -= mmjamma.y;
        this.z -= mmjamma.z;
    }
    
    public final void MAjAKKa(final double n, final double n2, final double n3) {
        this.x += n;
        this.y += n2;
        this.z += n3;
    }
    
    public final void mAJAkka(final double n, final double n2, final double n3) {
        this.x -= n;
        this.y -= n2;
        this.z -= n3;
    }
    
    public final void Majakka(final double n) {
        this.x *= n;
        this.y *= n;
        this.z *= n;
    }
    
    public final void MAJAKKa(final double n) {
        this.x /= n;
        this.y /= n;
        this.z /= n;
    }
    
    public final void MajAkka(final Vec3d mmjamma) {
        this.x *= mmjamma.x;
        this.y *= mmjamma.y;
        this.z *= mmjamma.z;
    }
    
    public final void majAKka(final double n, final double n2, final double n3) {
        this.x *= n;
        this.y *= n2;
        this.z *= n3;
    }
    
    public final void majAKKa(final Vec3d mmjamma) {
        final double majaKka = this.y * mmjamma.z - this.z * mmjamma.y;
        final double majAKka = this.z * mmjamma.x - this.x * mmjamma.z;
        final double majAKka2 = this.x * mmjamma.y - this.y * mmjamma.x;
        this.x = majaKka;
        this.y = majAKka;
        this.z = majAKka2;
    }
    
    public final void mAjAKka() {
        final double sqrt = Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
        this.x /= sqrt;
        this.y /= sqrt;
        this.z /= sqrt;
    }
    
    public final void MajAKka(final double n) {
        final double majAKka = this.y * Math.cos(n) - Math.sin(n) * this.z;
        final double majAKka2 = this.z * Math.cos(n) + Math.sin(n) * this.y;
        this.y = majAKka;
        this.z = majAKka2;
    }
    
    public final void maJaKKa(final double n) {
        final double majaKka = this.x * Math.cos(n) + Math.sin(n) * this.z;
        final double majAKka = this.z * Math.cos(n) - Math.sin(n) * this.x;
        this.x = majaKka;
        this.z = majAKka;
    }
    
    public final void MAJakka(final double n) {
        final double majaKka = this.x * Math.cos(n) - Math.sin(n) * this.y;
        final double majAKka = this.y * Math.cos(n) + Math.sin(n) * this.x;
        this.x = majaKka;
        this.y = majAKka;
    }
    
    public final void MAjAKka(final Vec3d mmjamma) {
        this.mAJakka(mmjamma.x, mmjamma.y, mmjamma.z);
    }
    
    public final void MajAKKa(final double n, final double n2, final double n3) {
        this.mAJaKKa(n);
        this.MAjaKKa(n2);
        this.MajaKKa(n3);
    }
    
    public final Vec3d maJAKKa(final Vec3d mmjamma) {
        final Vec3d mmjamma2 = new Vec3d(this);
        mmjamma2.maJakka(mmjamma);
        return mmjamma2;
    }
    
    public final Vec3d mAjakka(final Vec3d mmjamma) {
        final Vec3d mmjamma2 = new Vec3d(this);
        mmjamma2.MAJaKKa(mmjamma);
        return mmjamma2;
    }
    
    public final Vec3d MAJakKa(final double n, final double n2, final double n3) {
        return new Vec3d(this.x + n, this.y + n2, this.z + n3);
    }
    
    public final Vec3d MAjAkka(final double n, final double n2, final double n3) {
        return new Vec3d(this.x - n, this.y - n2, this.z - n3);
    }
    
    public final Vec3d majakka() {
        return new Vec3d(-this.x, -this.y, -this.z);
    }
    
    public final Vec3d MaJakKa(final double n) {
        final Vec3d mmjamma = new Vec3d(this);
        mmjamma.Majakka(n);
        return mmjamma;
    }
    
    public final Vec3d mAjAkka(final double n) {
        final Vec3d mmjamma = new Vec3d(this);
        mmjamma.MAJAKKa(n);
        return mmjamma;
    }
    
    public final Vec3d majAkka(final Vec3d mmjamma) {
        final Vec3d mmjamma2 = new Vec3d(this);
        mmjamma2.MajAkka(mmjamma);
        return mmjamma2;
    }
    
    public final Vec3d mAJAKKa(final Vec3d mmjamma) {
        final Vec3d mmjamma2 = new Vec3d(this);
        mmjamma2.majAKKa(mmjamma);
        return mmjamma2;
    }
    
    public final Vec3d MAjakka() {
        final Vec3d mmjamma = new Vec3d(this);
        mmjamma.mAjAKka();
        return mmjamma;
    }
    
    public final Vec3d MAjaKKa(final double n) {
        final Vec3d mmjamma = new Vec3d(this);
        mmjamma.MajAKka(n);
        return mmjamma;
    }
    
    public final Vec3d MajaKKa(final double n) {
        final Vec3d mmjamma = new Vec3d(this);
        mmjamma.maJaKKa(n);
        return mmjamma;
    }
    
    public final Vec3d mAJaKKa(final double n) {
        final Vec3d mmjamma = new Vec3d(this);
        mmjamma.MAJakka(n);
        return mmjamma;
    }
    
    public final Vec3d mAJAKka(final Vec3d mmjamma) {
        final Vec3d mmjamma2 = new Vec3d(this);
        mmjamma2.MAJakka(mmjamma.x);
        mmjamma2.MajAKka(mmjamma.y);
        mmjamma2.maJaKKa(mmjamma.z);
        return mmjamma2;
    }
    
    public final Vec3d mAJakka(final double n, final double n2, final double n3) {
        final Vec3d mmjamma = new Vec3d(this);
        mmjamma.MAJakka(n);
        mmjamma.MajAKka(n2);
        mmjamma.maJaKKa(n3);
        return mmjamma;
    }
    
    public final String toString() {
        return "{" + this.x + "; " + this.y + "; " + this.z + "} ";
    }
    
    static {
        mAjaKka = new Vec3d(0.0, 0.0, 0.0);
        MaJAKka = new Vec3d(1.0, 0.0, 0.0);
        maJAKka = new Vec3d(0.0, 1.0, 0.0);
        MAJAKka = new Vec3d(0.0, 0.0, 1.0);
    }
}
