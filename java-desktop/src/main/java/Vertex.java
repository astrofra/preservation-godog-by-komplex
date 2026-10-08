// 
// Decompiled by Procyon v0.6.0
// 

public class Vertex extends Vec3f
{
    public static final int kAmaJAK = 1;
    public static final int KaMAJAK = 8;
    public static final int kaMAJAK = 64;
    public static final int KAMAJAK = 512;
    public static final int kAMAJAK = 4096;
    public static final int KamAJAK = 32768;
    public static final int kamAJAK = 37449;
    public static final int KAmAJAK = 215332;
    public static final int kAmAJAK = 131072;
    public static final int KaMajAK = 196608;
    public static final int kaMajAK = 224694;
    public static final int KAMajAK = 149796;
    public float kAMajAK;
    public float KamajAK;
    public float kamajAK;
    public float KAmajAK;
    public float kAmajAK;
    public float KaMAjAK;
    public float kaMAjAK;
    public float KAMAjAK;
    public int kAMAjAK;
    public float KamAjAK;
    
    public Vertex() {
    }
    
    public Vertex(final float majaKka, final float majaKka2, final float mAjaKka) {
        super.x = majaKka;
        super.y = majaKka2;
        super.z = mAjaKka;
    }
    
    public Vertex(final double n, final double n2, final double n3) {
        super.x = (float)n;
        super.y = (float)n2;
        super.z = (float)n3;
    }
    
    public Vertex(final Vertex majjmka) {
        super.x = majjmka.x;
        super.y = majjmka.y;
        super.z = majjmka.z;
        this.kAMajAK = majjmka.kAMajAK;
        this.KamajAK = majjmka.KamajAK;
        this.kamajAK = majjmka.kamajAK;
        this.KAmajAK = majjmka.KAmajAK;
        this.kAmajAK = majjmka.kAmajAK;
        this.KaMAjAK = majjmka.KaMAjAK;
        this.kaMAjAK = majjmka.kaMAjAK;
        this.KAMAjAK = majjmka.KAMAjAK;
        this.kAMAjAK = majjmka.kAMAjAK;
        this.KamAjAK = majjmka.KamAjAK;
    }
    
    public void KAMajak(final float kaMAjAK, final float kamAjAK) {
        this.kaMAjAK = kaMAjAK;
        this.KAMAjAK = kamAjAK;
    }
    
    public void kAMajak(final float kAmajAK, final float kAmajAK2, final float kaMAjAK) {
        this.KAmajAK = kAmajAK;
        this.kAmajAK = kAmajAK2;
        this.KaMAjAK = kaMAjAK;
    }
    
    public void kaMajak(final Vertex majjmka) {
        super.x = majjmka.x;
        super.y = majjmka.y;
        super.z = majjmka.z;
        this.kAMajAK = majjmka.kAMajAK;
        this.KamajAK = majjmka.KamajAK;
        this.kamajAK = majjmka.kamajAK;
        this.KAmajAK = majjmka.KAmajAK;
        this.kAmajAK = majjmka.kAmajAK;
        this.KaMAjAK = majjmka.KaMAjAK;
        this.kaMAjAK = majjmka.kaMAjAK;
        this.KAMAjAK = majjmka.KAMAjAK;
        this.kAMAjAK = majjmka.kAMAjAK;
        this.KamAjAK = majjmka.KamAjAK;
    }
}
