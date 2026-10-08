// 
// Decompiled by Procyon v0.6.0
// 

public class Quaternionf
{
    public float x;
    public float y;
    public float z;
    public float w;
    static final double AJAKKAm = 1.0E-6;
    
    public Quaternionf(final float aJakKAm, final float aJakKAm2, final float ajAKKAm, final float ajAKKAm2) {
        this.x = aJakKAm;
        this.y = aJakKAm2;
        this.z = ajAKKAm;
        this.w = ajAKKAm2;
    }
    
    public Quaternionf(final double n, final double n2, final double n3, final double n4) {
        this.x = (float)n;
        this.y = (float)n2;
        this.z = (float)n3;
        this.w = (float)n4;
    }
    
    public Quaternionf(final Vec3f kaajmma, final float ajAKKAm) {
        this.x = kaajmma.x;
        this.y = kaajmma.y;
        this.z = kaajmma.z;
        this.w = ajAKKAm;
    }
    
    public Quaternionf(final Vec3f kaajmma) {
        this.x = kaajmma.x;
        this.y = kaajmma.y;
        this.z = kaajmma.z;
        this.w = 0.0f;
    }
    
    public Quaternionf(final Quaternionf kajjkkk) {
        this.x = kajjkkk.x;
        this.y = kajjkkk.y;
        this.z = kajjkkk.z;
        this.w = kajjkkk.w;
    }
    
    public Quaternionf() {
    }
    
    public void aKkAMAj(final Quaternionf kajjkkk) {
        this.x = kajjkkk.x;
        this.y = kajjkkk.y;
        this.z = kajjkkk.z;
        this.w = kajjkkk.w;
    }
    
    public void akkaMAj(final float aJakKAm, final float aJakKAm2, final float ajAKKAm, final float ajAKKAm2) {
        this.x = aJakKAm;
        this.y = aJakKAm2;
        this.z = ajAKKAm;
        this.w = ajAKKAm2;
    }
    
    public void AKKamAj(final double n, final double n2, final double n3, final double n4) {
        this.x = (float)n;
        this.y = (float)n2;
        this.z = (float)n3;
        this.w = (float)n4;
    }
    
    public float AkKamAj() {
        float n = (float)Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z + this.w * this.w);
        if (n == 0.0f) {
            n = 1.0f;
        }
        return n;
    }
    
    public void AkKAmAj(final float n) {
        this.x *= n;
        this.y *= n;
        this.z *= n;
        this.w *= n;
    }
    
    public void AkKAMAj() {
        this.AkKAmAj(1.0f / this.AkKamAj());
    }
    
    public float AkkAMAj(final Quaternionf kajjkkk) {
        return (this.x * kajjkkk.x + this.y * kajjkkk.y + this.z * kajjkkk.z + this.w * kajjkkk.w) / (this.AkKamAj() * kajjkkk.AkKamAj());
    }
    
    public float AkkamAj(final Quaternionf kajjkkk) {
        return this.x * kajjkkk.x + this.y * kajjkkk.y + this.z * kajjkkk.z + this.w * kajjkkk.w;
    }
    
    public void AkkaMAj(final Quaternionf kajjkkk) {
        final float ajAKKAm = this.w * kajjkkk.w - this.x * kajjkkk.x - this.y * kajjkkk.y - this.z * kajjkkk.z;
        final float aJakKAm = this.w * kajjkkk.x + this.x * kajjkkk.w + this.y * kajjkkk.z - this.z * kajjkkk.y;
        final float aJakKAm2 = this.w * kajjkkk.y + this.y * kajjkkk.w + this.z * kajjkkk.x - this.x * kajjkkk.z;
        final float ajAKKAm2 = this.w * kajjkkk.z + this.z * kajjkkk.w + this.x * kajjkkk.y - this.y * kajjkkk.x;
        this.w = ajAKKAm;
        this.x = aJakKAm;
        this.y = aJakKAm2;
        this.z = ajAKKAm2;
    }
    
    public void akkamAj() {
        final float n = this.x * this.x + this.y * this.y + this.z * this.z + this.w * this.w;
        float n2;
        if (n != 0.0f) {
            n2 = 1.0f / n;
        }
        else {
            n2 = 1.0f;
        }
        this.w *= n2;
        this.x = -this.x * n2;
        this.y = -this.y * n2;
        this.z = -this.z * n2;
    }
    
    public void AKKAmAj() {
        final float n = 1.0f / this.AkKamAj();
        this.w *= n;
        this.x *= -n;
        this.y *= -n;
        this.z *= -n;
    }
    
    public void akKAMAj() {
        final double sqrt = Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
        float n;
        if (sqrt > 0.0) {
            n = (float)(Math.sin(sqrt) / sqrt);
        }
        else {
            n = 1.0f;
        }
        this.w = (float)Math.cos(sqrt);
        this.x *= n;
        this.y *= n;
        this.z *= n;
    }
    
    public void aKkaMAj() {
        final float n = (float)Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
        float n2;
        if (this.w != 0.0f) {
            n2 = (float)Math.atan(n / this.w);
        }
        else {
            n2 = 1.5707964f;
        }
        this.w = 0.0f;
        this.x *= n2;
        this.y *= n2;
        this.z *= n2;
    }
    
    public void aKKAMAj(final Quaternionf kajjkkk) {
        final Quaternionf kajjkkk2 = new Quaternionf(this);
        kajjkkk2.akkamAj();
        final Quaternionf kajjkkk3 = new Quaternionf(kajjkkk2);
        kajjkkk3.AkkaMAj(kajjkkk);
        final double sqrt = Math.sqrt(kajjkkk3.x * kajjkkk3.x + kajjkkk3.y * kajjkkk3.y + kajjkkk3.z * kajjkkk3.z);
        final float n = this.x * kajjkkk.x + this.y * kajjkkk.y + this.z * kajjkkk.z + this.w * kajjkkk.w;
        float n2;
        if (n != 0.0f) {
            n2 = (float)Math.atan(sqrt / (double)n);
        }
        else {
            n2 = 1.5707964f;
        }
        if (sqrt != 0.0) {
            n2 /= (float)sqrt;
        }
        this.w = 0.0f;
        this.x = kajjkkk3.x * n2;
        this.y = kajjkkk3.y * n2;
        this.z = kajjkkk3.z * n2;
    }
    
    public void aKKamAj(final Mat3f kaaakka) {
        final float n = this.x * this.x + this.y * this.y + this.z * this.z + this.w * this.w;
        float n2;
        if (n == 0.0f) {
            n2 = 1.0f;
        }
        else {
            n2 = 2.0f / n;
        }
        final float n3 = this.x * n2;
        final float n4 = this.y * n2;
        final float n5 = this.z * n2;
        final float n6 = this.w * n3;
        final float n7 = this.w * n4;
        final float n8 = this.w * n5;
        final float n9 = this.x * n3;
        final float n10 = this.x * n4;
        final float n11 = this.x * n5;
        final float n12 = this.y * n4;
        final float n13 = this.y * n5;
        final float n14 = this.z * n5;
        kaaakka.KaMAjaK = 1.0f - (n12 + n14);
        kaaakka.kaMAjaK = n10 - n8;
        kaaakka.KAMAjaK = n11 + n7;
        kaaakka.kAMAjaK = n10 + n8;
        kaaakka.KamAjaK = 1.0f - (n9 + n14);
        kaaakka.kamAjaK = n13 - n6;
        kaaakka.KAmAjaK = n11 - n7;
        kaaakka.kAmAjaK = n13 + n6;
        kaaakka.KaMaJAK = 1.0f - (n9 + n12);
    }
    
    public void aKkamAj(final Mat3f kaaakka) {
        final float n = this.x * this.x + this.y * this.y + this.z * this.z + this.w * this.w;
        float n2;
        if (n == 0.0f) {
            n2 = 1.0f;
        }
        else {
            n2 = 2.0f / n;
        }
        final float n3 = this.x * n2;
        final float n4 = this.y * n2;
        final float n5 = this.z * n2;
        final float n6 = this.w * n3;
        final float n7 = this.w * n4;
        final float n8 = this.w * n5;
        final float n9 = this.x * n3;
        final float n10 = this.x * n4;
        final float n11 = this.x * n5;
        final float n12 = this.y * n4;
        final float n13 = this.y * n5;
        final float n14 = this.z * n5;
        kaaakka.KaMAjaK = 1.0f - (n12 + n14);
        kaaakka.kaMAjaK = n10 + n8;
        kaaakka.KAMAjaK = n11 - n7;
        kaaakka.kAMAjaK = n10 - n8;
        kaaakka.KamAjaK = 1.0f - (n9 + n14);
        kaaakka.kamAjaK = n13 + n6;
        kaaakka.KAmAjaK = n11 + n7;
        kaaakka.kAmAjaK = n13 - n6;
        kaaakka.KaMaJAK = 1.0f - (n9 + n12);
    }
    
    public void AKkAMAj(final float n, final float n2, final float n3, final float n4) {
        final float n5 = (float)Math.sin(n4 / 2.0f);
        this.x = n * n5;
        this.y = n2 * n5;
        this.z = n3 * n5;
        this.w = (float)Math.cos(n4 / 2.0f);
    }
    
    public void AKkaMAj(final Vec3f kaajmma, final float n) {
        final float n2 = (float)Math.sin(n / 2.0f);
        this.x = kaajmma.x * n2;
        this.y = kaajmma.y * n2;
        this.z = kaajmma.z * n2;
        this.w = (float)Math.cos(n / 2.0f);
    }
    
    public void AKKAMAj() {
        final float n = (float)Math.sin(this.w / 2.0f);
        this.x *= n;
        this.y *= n;
        this.z *= n;
        this.w = (float)Math.cos(this.w / 2.0f);
    }
    
    public float akKAmAj(final Vec3f kaajmma) {
        final Quaternionf kajjkkk = new Quaternionf(this);
        kajjkkk.AkKAMAj();
        final double acos = Math.acos(kajjkkk.w);
        final float n = (float)Math.sin(acos);
        kaajmma.x = kajjkkk.x / n;
        kaajmma.y = kajjkkk.y / n;
        kaajmma.z = kajjkkk.z / n;
        return 2.0f * (float)acos;
    }
    
    public void AKkamAj(final Mat3f kaaakka) {
        final float n = kaaakka.KaMAjaK + kaaakka.KamAjaK + kaaakka.KaMaJAK;
        if (n > 0.0f) {
            final float n2 = (float)Math.sqrt((double)n + 1.0);
            this.w = 0.5f * n2;
            final float n3 = 0.5f / n2;
            this.x = (kaaakka.kAmAjaK - kaaakka.kamAjaK) * n3;
            this.y = (kaaakka.KAMAjaK - kaaakka.KAmAjaK) * n3;
            this.z = (kaaakka.kAMAjaK - kaaakka.kaMAjaK) * n3;
            return;
        }
        if (kaaakka.KamAjaK > kaaakka.KaMAjaK) {
            if (kaaakka.KaMaJAK > kaaakka.KamAjaK) {
                float n4 = (float)Math.sqrt((double)(kaaakka.KaMaJAK - (kaaakka.KaMAjaK + kaaakka.KamAjaK)) + 1.0);
                this.z = n4 * 0.5f;
                if (n4 != 0.0f) {
                    n4 = 0.5f / n4;
                }
                this.w = (kaaakka.kAMAjaK - kaaakka.kaMAjaK) * n4;
                this.x = (kaaakka.KAMAjaK + kaaakka.KAmAjaK) * n4;
                this.y = (kaaakka.kamAjaK + kaaakka.kAmAjaK) * n4;
                return;
            }
            float n5 = (float)Math.sqrt((double)(kaaakka.KamAjaK - (kaaakka.KaMaJAK + kaaakka.KaMAjaK)) + 1.0);
            this.y = n5 * 0.5f;
            if (n5 != 0.0f) {
                n5 = 0.5f / n5;
            }
            this.w = (kaaakka.KAMAjaK - kaaakka.KAmAjaK) * n5;
            this.z = (kaaakka.kAmAjaK + kaaakka.kamAjaK) * n5;
            this.x = (kaaakka.kaMAjaK + kaaakka.kAMAjaK) * n5;
        }
        else {
            if (kaaakka.KaMaJAK > kaaakka.KaMAjaK) {
                float n6 = (float)Math.sqrt((double)(kaaakka.KaMaJAK - (kaaakka.KaMAjaK + kaaakka.KamAjaK)) + 1.0);
                this.z = n6 * 0.5f;
                if (n6 != 0.0f) {
                    n6 = 0.5f / n6;
                }
                this.w = (kaaakka.kAMAjaK - kaaakka.kaMAjaK) * n6;
                this.x = (kaaakka.KAMAjaK + kaaakka.KAmAjaK) * n6;
                this.y = (kaaakka.kamAjaK + kaaakka.kAmAjaK) * n6;
                return;
            }
            float n7 = (float)Math.sqrt((double)(kaaakka.KaMAjaK - (kaaakka.KamAjaK + kaaakka.KaMaJAK)) + 1.0);
            this.x = n7 * 0.5f;
            if (n7 != 0.0f) {
                n7 = 0.5f / n7;
            }
            this.w = (kaaakka.kAmAjaK - kaaakka.kamAjaK) * n7;
            this.y = (kaaakka.kAMAjaK + kaaakka.kaMAjaK) * n7;
            this.z = (kaaakka.KAmAjaK + kaaakka.KAMAjaK) * n7;
        }
    }
    
    public void akKamAj(final Quaternionf kajjkkk, final Quaternionf kajjkkk2, final float n, final float n2) {
        double a = (double)kajjkkk.AkkamAj(kajjkkk2);
        float n3;
        if (a < 0.0) {
            a = -a;
            n3 = -1.0f;
        }
        else {
            n3 = 1.0f;
        }
        float n4;
        float n5;
        if (1.0 - a < 1.0E-6) {
            n4 = 1.0f - n;
            n5 = n;
        }
        else {
            final double acos = Math.acos(a);
            final double sin = Math.sin(acos);
            final double n6 = acos + n2 * 3.141592653589793;
            n4 = (float)(Math.sin(acos - n * n6) / sin);
            n5 = (float)(Math.sin((double)n * n6) / sin);
        }
        final float n7 = n5 * n3;
        this.x = n4 * kajjkkk.x + n7 * kajjkkk2.x;
        this.y = n4 * kajjkkk.y + n7 * kajjkkk2.y;
        this.z = n4 * kajjkkk.z + n7 * kajjkkk2.z;
        this.w = n4 * kajjkkk.w + n7 * kajjkkk2.w;
    }
    
    public void akkAMAj(final Quaternionf kajjkkk, final Quaternionf kajjkkk2, final float n, final float n2) {
        final double n3 = (double)kajjkkk.AkkamAj(kajjkkk2);
        float n4;
        float n5;
        if (1.0 - Math.abs(n3) < 1.0E-6) {
            n4 = 1.0f - n;
            n5 = n;
        }
        else {
            final double acos = Math.acos(n3);
            final double sin = Math.sin(acos);
            final double n6 = acos + n2 * 3.141592653589793;
            n4 = (float)(Math.sin(acos - n * n6) / sin);
            n5 = (float)(Math.sin((double)n * n6) / sin);
        }
        this.x = n4 * kajjkkk.x + n5 * kajjkkk2.x;
        this.y = n4 * kajjkkk.y + n5 * kajjkkk2.y;
        this.z = n4 * kajjkkk.z + n5 * kajjkkk2.z;
        this.w = n4 * kajjkkk.w + n5 * kajjkkk2.w;
    }
    
    public String toString() {
        return "quat (" + this.x + " ," + this.y + " ," + this.z + " / " + this.w + ")";
    }
}
