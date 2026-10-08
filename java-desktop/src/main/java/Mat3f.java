// 
// Decompiled by Procyon v0.6.0
// 

public class Mat3f
{
    public float KaMAjaK;
    public float kaMAjaK;
    public float KAMAjaK;
    public float kAMAjaK;
    public float KamAjaK;
    public float kamAjaK;
    public float KAmAjaK;
    public float kAmAjaK;
    public float KaMaJAK;
    
    public Mat3f() {
        this.KamajAK();
    }
    
    public Mat3f(final Vec3f kaajmma, final Vec3f kaajmma2, final Vec3f kaajmma3) {
        this.kamAjAK(kaajmma, kaajmma2, kaajmma3);
    }
    
    public Mat3f(final Vec3f kaajmma) {
        this.kamajAK(kaajmma);
    }
    
    public Mat3f(final Mat3f kaaakka) {
        this.KaMAjAK(kaaakka);
    }
    
    public final void KamajAK() {
        this.KaMAjaK = 1.0f;
        this.kaMAjaK = 0.0f;
        this.KAMAjaK = 0.0f;
        this.kAMAjaK = 0.0f;
        this.KamAjaK = 1.0f;
        this.kamAjaK = 0.0f;
        this.KAmAjaK = 0.0f;
        this.kAmAjaK = 0.0f;
        this.KaMaJAK = 1.0f;
    }
    
    public final void kamAjAK(final Vec3f kaajmma, final Vec3f kaajmma2, final Vec3f kaajmma3) {
        this.KamaJAK(kaajmma);
        this.KAMaJAK(kaajmma2);
        this.kaMaJAK(kaajmma3);
    }
    
    public final void kamajAK(final Vec3f kaajmma) {
        this.KamAjAK(kaajmma.x, kaajmma.y, kaajmma.z);
    }
    
    public final void KamAjAK(final float n, final float n2, final float n3) {
        final Vec3f kaajmma = new Vec3f();
        kaajmma.MAJAkKA(kaajmma.maJaKka);
        kaajmma.MAJaKKA(n, n2, n3);
        this.KamaJAK(kaajmma);
        kaajmma.MAJAkKA(kaajmma.MAJaKka);
        kaajmma.MAJaKKA(n, n2, n3);
        this.KAMaJAK(kaajmma);
        kaajmma.MAJAkKA(kaajmma.mAJaKka);
        kaajmma.MAJaKKA(n, n2, n3);
        this.kaMaJAK(kaajmma);
    }
    
    public final void KamaJAK(final Vec3f kaajmma) {
        this.KAMajAK(kaajmma.x, kaajmma.y, kaajmma.z);
    }
    
    public final void KAMajAK(final float kaMAjaK, final float kaMAjaK2, final float kamAjaK) {
        this.KaMAjaK = kaMAjaK;
        this.kaMAjaK = kaMAjaK2;
        this.KAMAjaK = kamAjaK;
    }
    
    public final void KAMaJAK(final Vec3f kaajmma) {
        this.kaMajAK(kaajmma.x, kaajmma.y, kaajmma.z);
    }
    
    public final void kaMajAK(final float kamAjaK, final float kamAjaK2, final float kamAjaK3) {
        this.kAMAjaK = kamAjaK;
        this.KamAjaK = kamAjaK2;
        this.kamAjaK = kamAjaK3;
    }
    
    public final void kaMaJAK(final Vec3f kaajmma) {
        this.KaMajAK(kaajmma.x, kaajmma.y, kaajmma.z);
    }
    
    public final void KaMajAK(final float kAmAjaK, final float kAmAjaK2, final float kaMaJAK) {
        this.KAmAjaK = kAmAjaK;
        this.kAmAjaK = kAmAjaK2;
        this.KaMaJAK = kaMaJAK;
    }
    
    public final void KaMAjAK(final Mat3f kaaakka) {
        this.KaMAjaK = kaaakka.KaMAjaK;
        this.kaMAjaK = kaaakka.kaMAjaK;
        this.KAMAjaK = kaaakka.KAMAjaK;
        this.kAMAjaK = kaaakka.kAMAjaK;
        this.KamAjaK = kaaakka.KamAjaK;
        this.kamAjaK = kaaakka.kamAjaK;
        this.KAmAjaK = kaaakka.KAmAjaK;
        this.kAmAjaK = kaaakka.kAmAjaK;
        this.KaMaJAK = kaaakka.KaMaJAK;
    }
    
    public final void kAMAjAK(final Vec3f kaajmma) {
        kaajmma.mAJaKka(this.KaMAjaK, this.kaMAjaK, this.KAMAjaK);
    }
    
    public final void kAMAJAK(final Vec3f kaajmma) {
        kaajmma.mAJaKka(this.kAMAjaK, this.KamAjaK, this.kamAjaK);
    }
    
    public final void kAMaJak(final Vec3f kaajmma) {
        kaajmma.mAJaKka(this.KAmAjaK, this.kAmAjaK, this.KaMaJAK);
    }
    
    public final Vec3f KAMaJak() {
        return new Vec3f(this.KaMAjaK, this.kaMAjaK, this.KAMAjaK);
    }
    
    public final Vec3f kaMaJak() {
        return new Vec3f(this.kAMAjaK, this.KamAjaK, this.kamAjaK);
    }
    
    public final Vec3f kAmAjAK() {
        return new Vec3f(this.KAmAjaK, this.kAmAjaK, this.KaMaJAK);
    }
    
    public final void KAmajAK(final float n) {
        this.KaMAjaK *= n;
        this.kaMAjaK *= n;
        this.KAMAjaK *= n;
        this.kAMAjaK *= n;
        this.KamAjaK *= n;
        this.kamAjaK *= n;
        this.KAmAjaK *= n;
        this.kAmAjaK *= n;
        this.KaMaJAK *= n;
    }
    
    public final Mat3f kAmajAK(final float n) {
        final Mat3f kaaakka = new Mat3f(this);
        kaaakka.KAmajAK(n);
        return kaaakka;
    }
    
    public final void KAmAjAK(final Vec3f kaajmma) {
        final float majaKka = kaajmma.x;
        final float majaKka2 = kaajmma.y;
        final float mAjaKka = kaajmma.z;
        kaajmma.x = this.KaMAjaK * majaKka + this.kAMAjaK * majaKka2 + this.KAmAjaK * mAjaKka;
        kaajmma.y = this.kaMAjaK * majaKka + this.KamAjaK * majaKka2 + this.kAmAjaK * mAjaKka;
        kaajmma.z = this.KAMAjaK * majaKka + this.kamAjaK * majaKka2 + this.KaMaJAK * mAjaKka;
    }
    
    public final Vec3f kaMAjAK(final Vec3f kaajmma) {
        final Vec3f kaajmma2 = new Vec3f(kaajmma);
        this.KAmAjAK(kaajmma2);
        return kaajmma2;
    }
    
    public final void kAmaJAK(final Mat3f kaaakka) {
        final float kaMAjaK = this.KaMAjaK * kaaakka.KaMAjaK + this.kaMAjaK * kaaakka.kAMAjaK + this.KAMAjaK * kaaakka.KAmAjaK;
        final float kaMAjaK2 = this.KaMAjaK * kaaakka.kaMAjaK + this.kaMAjaK * kaaakka.KamAjaK + this.KAMAjaK * kaaakka.kAmAjaK;
        final float kamAjaK = this.KaMAjaK * kaaakka.KAMAjaK + this.kaMAjaK * kaaakka.kamAjaK + this.KAMAjaK * kaaakka.KaMaJAK;
        final float kamAjaK2 = this.kAMAjaK * kaaakka.KaMAjaK + this.KamAjaK * kaaakka.kAMAjaK + this.kamAjaK * kaaakka.KAmAjaK;
        final float kamAjaK3 = this.kAMAjaK * kaaakka.kaMAjaK + this.KamAjaK * kaaakka.KamAjaK + this.kamAjaK * kaaakka.kAmAjaK;
        final float kamAjaK4 = this.kAMAjaK * kaaakka.KAMAjaK + this.KamAjaK * kaaakka.kamAjaK + this.kamAjaK * kaaakka.KaMaJAK;
        final float kAmAjaK = this.KAmAjaK * kaaakka.KaMAjaK + this.kAmAjaK * kaaakka.kAMAjaK + this.KaMaJAK * kaaakka.KAmAjaK;
        final float kAmAjaK2 = this.KAmAjaK * kaaakka.kaMAjaK + this.kAmAjaK * kaaakka.KamAjaK + this.KaMaJAK * kaaakka.kAmAjaK;
        final float kaMaJAK = this.KAmAjaK * kaaakka.KAMAjaK + this.kAmAjaK * kaaakka.kamAjaK + this.KaMaJAK * kaaakka.KaMaJAK;
        this.KaMAjaK = kaMAjaK;
        this.kaMAjaK = kaMAjaK2;
        this.KAMAjaK = kamAjaK;
        this.kAMAjaK = kamAjaK2;
        this.KamAjaK = kamAjaK3;
        this.kamAjaK = kamAjaK4;
        this.KAmAjaK = kAmAjaK;
        this.kAmAjaK = kAmAjaK2;
        this.KaMaJAK = kaMaJAK;
    }
    
    public final Mat3f KAMAjAK(final Mat3f kaaakka) {
        final Mat3f kaaakka2 = new Mat3f(this);
        kaaakka2.kAmaJAK(kaaakka);
        return kaaakka2;
    }
    
    public final void KAmAJAK() {
        final float kamAjaK = this.kAMAjaK;
        final float kAmAjaK = this.KAmAjaK;
        final float kaMAjaK = this.kaMAjaK;
        final float kAmAjaK2 = this.kAmAjaK;
        final float kamAjaK2 = this.KAMAjaK;
        final float kamAjaK3 = this.kamAjaK;
        this.kaMAjaK = kamAjaK;
        this.KAMAjaK = kAmAjaK;
        this.kAMAjaK = kaMAjaK;
        this.kamAjaK = kAmAjaK2;
        this.KAmAjaK = kamAjaK2;
        this.kAmAjaK = kamAjaK3;
    }
    
    public final Mat3f kamaJAK() {
        final Mat3f kaaakka = new Mat3f();
        kaaakka.KaMAjaK = this.KaMAjaK;
        kaaakka.kaMAjaK = this.kAMAjaK;
        kaaakka.KAMAjaK = this.KAmAjaK;
        kaaakka.kAMAjaK = this.kaMAjaK;
        kaaakka.KamAjaK = this.KamAjaK;
        kaaakka.kamAjaK = this.kAmAjaK;
        kaaakka.KAmAjaK = this.KAMAjaK;
        kaaakka.kAmAjaK = this.kamAjaK;
        kaaakka.KaMaJAK = this.KaMaJAK;
        return kaaakka;
    }
    
    public final void KAMAJAK(final float n) {
        final float n2 = (float)Math.sin(n);
        final float n3 = (float)Math.cos(n);
        final float kaMAjaK = this.kaMAjaK * n3 - n2 * this.KAMAjaK;
        final float kamAjaK = this.KAMAjaK * n3 + n2 * this.kaMAjaK;
        this.kaMAjaK = kaMAjaK;
        this.KAMAjaK = kamAjaK;
        final float kamAjaK2 = this.KamAjaK * n3 - n2 * this.kamAjaK;
        final float kamAjaK3 = this.kamAjaK * n3 + n2 * this.KamAjaK;
        this.KamAjaK = kamAjaK2;
        this.kamAjaK = kamAjaK3;
        final float kAmAjaK = this.kAmAjaK * n3 - n2 * this.KaMaJAK;
        final float kaMaJAK = this.KaMaJAK * n3 + n2 * this.kAmAjaK;
        this.kAmAjaK = kAmAjaK;
        this.KaMaJAK = kaMaJAK;
    }
    
    public final void KaMaJak(final float n) {
        final float n2 = (float)Math.sin(n);
        final float n3 = (float)Math.cos(n);
        final float kaMAjaK = this.KaMAjaK * n3 + n2 * this.KAMAjaK;
        final float kamAjaK = this.KAMAjaK * n3 - n2 * this.KaMAjaK;
        this.KaMAjaK = kaMAjaK;
        this.KAMAjaK = kamAjaK;
        final float kamAjaK2 = this.kAMAjaK * n3 + n2 * this.kamAjaK;
        final float kamAjaK3 = this.kamAjaK * n3 - n2 * this.kAMAjaK;
        this.kAMAjaK = kamAjaK2;
        this.kamAjaK = kamAjaK3;
        final float kAmAjaK = this.KAmAjaK * n3 + n2 * this.KaMaJAK;
        final float kaMaJAK = this.KaMaJAK * n3 - n2 * this.KAmAjaK;
        this.KAmAjaK = kAmAjaK;
        this.KaMaJAK = kaMaJAK;
    }
    
    public final void kAmAJAK(final float n) {
        final float n2 = (float)Math.sin(n);
        final float n3 = (float)Math.cos(n);
        final float kaMAjaK = this.KaMAjaK * n3 - n2 * this.kaMAjaK;
        final float kaMAjaK2 = this.kaMAjaK * n3 + n2 * this.KaMAjaK;
        this.KaMAjaK = kaMAjaK;
        this.kaMAjaK = kaMAjaK2;
        final float kamAjaK = this.kAMAjaK * n3 - n2 * this.KamAjaK;
        final float kamAjaK2 = this.KamAjaK * n3 + n2 * this.kAMAjaK;
        this.kAMAjaK = kamAjaK;
        this.KamAjaK = kamAjaK2;
        final float kAmAjaK = this.KAmAjaK * n3 - n2 * this.kAmAjaK;
        final float kAmAjaK2 = this.kAmAjaK * n3 + n2 * this.KAmAjaK;
        this.KAmAjaK = kAmAjaK;
        this.kAmAjaK = kAmAjaK2;
    }
    
    public Mat3f kaMAJAK(final float n) {
        final Mat3f kaaakka = new Mat3f(this);
        kaaakka.KAMAJAK(n);
        return kaaakka;
    }
    
    public Mat3f KaMAJAK(final float n) {
        final Mat3f kaaakka = new Mat3f(this);
        kaaakka.KaMaJak(n);
        return kaaakka;
    }
    
    public Mat3f KAmaJAK(final float n) {
        final Mat3f kaaakka = new Mat3f(this);
        kaaakka.kAmAJAK(n);
        return kaaakka;
    }
    
    public void kAMaJAK() {
        final float n = (float)Math.sqrt(this.KaMAjaK * this.KaMAjaK + this.kaMAjaK * this.kaMAjaK + this.KAMAjaK * this.KAMAjaK);
        this.KaMAjaK /= n;
        this.kaMAjaK /= n;
        this.KAMAjaK /= n;
        final float n2 = (float)Math.sqrt(this.kAMAjaK * this.kAMAjaK + this.KamAjaK * this.KamAjaK + this.kamAjaK * this.kamAjaK);
        this.kAMAjaK /= n2;
        this.KamAjaK /= n2;
        this.kamAjaK /= n2;
        final float n3 = (float)Math.sqrt(this.KAmAjaK * this.KAmAjaK + this.kAmAjaK * this.kAmAjaK + this.KaMaJAK * this.KaMaJAK);
        this.KAmAjaK /= n3;
        this.kAmAjaK /= n3;
        this.KaMaJAK /= n3;
    }
    
    public Mat3f KaMaJAK() {
        final Mat3f kaaakka = new Mat3f(this);
        kaaakka.KaMaJAK();
        return kaaakka;
    }
    
    public void kamAJAK(final Vec3f kaajmma) {
        this.KaMAjaK *= kaajmma.x;
        this.kaMAjaK *= kaajmma.x;
        this.KAMAjaK *= kaajmma.x;
        this.kAMAjaK *= kaajmma.y;
        this.KamAjaK *= kaajmma.y;
        this.kamAjaK *= kaajmma.y;
        this.KAmAjaK *= kaajmma.z;
        this.kAmAjaK *= kaajmma.z;
        this.KaMaJAK *= kaajmma.z;
    }
    
    public void KamAJAK(final Vec3f kaajmma) {
        this.KaMAjaK *= kaajmma.x;
        this.kAMAjaK *= kaajmma.x;
        this.KAmAjaK *= kaajmma.x;
        this.kaMAjaK *= kaajmma.y;
        this.KamAjaK *= kaajmma.y;
        this.kAmAjaK *= kaajmma.y;
        this.KAMAjaK *= kaajmma.z;
        this.kamAjaK *= kaajmma.z;
        this.KaMaJAK *= kaajmma.z;
    }
    
    public Mat3f KamaJak(final Vec3f kaajmma) {
        final Mat3f kaaakka = new Mat3f(this);
        kaaakka.kamAJAK(kaajmma);
        return kaaakka;
    }
    
    public Mat3f kAMajAK(final Vec3f kaajmma) {
        final Mat3f kaaakka = new Mat3f(this);
        kaaakka.KamAJAK(kaajmma);
        return kaaakka;
    }
    
    public String toString() {
        final double n = 10000.0;
        return String.valueOf(new StringBuffer(String.valueOf(new StringBuffer(String.valueOf("")).append((double)(int)(this.KaMAjaK * n) / n).append("\t").append((double)(int)(this.kaMAjaK * n) / n).append("\t").append((double)(int)(this.KAMAjaK * n) / n).append("\t \\ X\n").toString())).append((double)(int)(this.kAMAjaK * n) / n).append("\t").append((double)(int)(this.KamAjaK * n) / n).append("\t").append((double)(int)(this.kamAjaK * n) / n).append("\t \\ Y\n").toString()) + (double)(int)(this.KAmAjaK * n) / n + "\t" + (double)(int)(this.kAmAjaK * n) / n + "\t" + (double)(int)(this.KaMaJAK * n) / n + "\t \\ Z\n";
    }
}
