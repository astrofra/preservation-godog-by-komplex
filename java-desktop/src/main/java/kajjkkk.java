// 
// Decompiled by Procyon v0.6.0
// 

public class kajjkkk
{
    public float AJakKAm;
    public float aJakKAm;
    public float AjAKKAm;
    public float ajAKKAm;
    static final double AJAKKAm = 1.0E-6;
    
    public kajjkkk(final float aJakKAm, final float aJakKAm2, final float ajAKKAm, final float ajAKKAm2) {
        this.AJakKAm = aJakKAm;
        this.aJakKAm = aJakKAm2;
        this.AjAKKAm = ajAKKAm;
        this.ajAKKAm = ajAKKAm2;
    }
    
    public kajjkkk(final double n, final double n2, final double n3, final double n4) {
        this.AJakKAm = (float)n;
        this.aJakKAm = (float)n2;
        this.AjAKKAm = (float)n3;
        this.ajAKKAm = (float)n4;
    }
    
    public kajjkkk(final kaajmma kaajmma, final float ajAKKAm) {
        this.AJakKAm = kaajmma.MajaKka;
        this.aJakKAm = kaajmma.majaKka;
        this.AjAKKAm = kaajmma.MAjaKka;
        this.ajAKKAm = ajAKKAm;
    }
    
    public kajjkkk(final kaajmma kaajmma) {
        this.AJakKAm = kaajmma.MajaKka;
        this.aJakKAm = kaajmma.majaKka;
        this.AjAKKAm = kaajmma.MAjaKka;
        this.ajAKKAm = 0.0f;
    }
    
    public kajjkkk(final kajjkkk kajjkkk) {
        this.AJakKAm = kajjkkk.AJakKAm;
        this.aJakKAm = kajjkkk.aJakKAm;
        this.AjAKKAm = kajjkkk.AjAKKAm;
        this.ajAKKAm = kajjkkk.ajAKKAm;
    }
    
    public kajjkkk() {
    }
    
    public void aKkAMAj(final kajjkkk kajjkkk) {
        this.AJakKAm = kajjkkk.AJakKAm;
        this.aJakKAm = kajjkkk.aJakKAm;
        this.AjAKKAm = kajjkkk.AjAKKAm;
        this.ajAKKAm = kajjkkk.ajAKKAm;
    }
    
    public void akkaMAj(final float aJakKAm, final float aJakKAm2, final float ajAKKAm, final float ajAKKAm2) {
        this.AJakKAm = aJakKAm;
        this.aJakKAm = aJakKAm2;
        this.AjAKKAm = ajAKKAm;
        this.ajAKKAm = ajAKKAm2;
    }
    
    public void AKKamAj(final double n, final double n2, final double n3, final double n4) {
        this.AJakKAm = (float)n;
        this.aJakKAm = (float)n2;
        this.AjAKKAm = (float)n3;
        this.ajAKKAm = (float)n4;
    }
    
    public float AkKamAj() {
        float n = (float)Math.sqrt(this.AJakKAm * this.AJakKAm + this.aJakKAm * this.aJakKAm + this.AjAKKAm * this.AjAKKAm + this.ajAKKAm * this.ajAKKAm);
        if (n == 0.0f) {
            n = 1.0f;
        }
        return n;
    }
    
    public void AkKAmAj(final float n) {
        this.AJakKAm *= n;
        this.aJakKAm *= n;
        this.AjAKKAm *= n;
        this.ajAKKAm *= n;
    }
    
    public void AkKAMAj() {
        this.AkKAmAj(1.0f / this.AkKamAj());
    }
    
    public float AkkAMAj(final kajjkkk kajjkkk) {
        return (this.AJakKAm * kajjkkk.AJakKAm + this.aJakKAm * kajjkkk.aJakKAm + this.AjAKKAm * kajjkkk.AjAKKAm + this.ajAKKAm * kajjkkk.ajAKKAm) / (this.AkKamAj() * kajjkkk.AkKamAj());
    }
    
    public float AkkamAj(final kajjkkk kajjkkk) {
        return this.AJakKAm * kajjkkk.AJakKAm + this.aJakKAm * kajjkkk.aJakKAm + this.AjAKKAm * kajjkkk.AjAKKAm + this.ajAKKAm * kajjkkk.ajAKKAm;
    }
    
    public void AkkaMAj(final kajjkkk kajjkkk) {
        final float ajAKKAm = this.ajAKKAm * kajjkkk.ajAKKAm - this.AJakKAm * kajjkkk.AJakKAm - this.aJakKAm * kajjkkk.aJakKAm - this.AjAKKAm * kajjkkk.AjAKKAm;
        final float aJakKAm = this.ajAKKAm * kajjkkk.AJakKAm + this.AJakKAm * kajjkkk.ajAKKAm + this.aJakKAm * kajjkkk.AjAKKAm - this.AjAKKAm * kajjkkk.aJakKAm;
        final float aJakKAm2 = this.ajAKKAm * kajjkkk.aJakKAm + this.aJakKAm * kajjkkk.ajAKKAm + this.AjAKKAm * kajjkkk.AJakKAm - this.AJakKAm * kajjkkk.AjAKKAm;
        final float ajAKKAm2 = this.ajAKKAm * kajjkkk.AjAKKAm + this.AjAKKAm * kajjkkk.ajAKKAm + this.AJakKAm * kajjkkk.aJakKAm - this.aJakKAm * kajjkkk.AJakKAm;
        this.ajAKKAm = ajAKKAm;
        this.AJakKAm = aJakKAm;
        this.aJakKAm = aJakKAm2;
        this.AjAKKAm = ajAKKAm2;
    }
    
    public void akkamAj() {
        final float n = this.AJakKAm * this.AJakKAm + this.aJakKAm * this.aJakKAm + this.AjAKKAm * this.AjAKKAm + this.ajAKKAm * this.ajAKKAm;
        float n2;
        if (n != 0.0f) {
            n2 = 1.0f / n;
        }
        else {
            n2 = 1.0f;
        }
        this.ajAKKAm *= n2;
        this.AJakKAm = -this.AJakKAm * n2;
        this.aJakKAm = -this.aJakKAm * n2;
        this.AjAKKAm = -this.AjAKKAm * n2;
    }
    
    public void AKKAmAj() {
        final float n = 1.0f / this.AkKamAj();
        this.ajAKKAm *= n;
        this.AJakKAm *= -n;
        this.aJakKAm *= -n;
        this.AjAKKAm *= -n;
    }
    
    public void akKAMAj() {
        final double sqrt = Math.sqrt(this.AJakKAm * this.AJakKAm + this.aJakKAm * this.aJakKAm + this.AjAKKAm * this.AjAKKAm);
        float n;
        if (sqrt > 0.0) {
            n = (float)(Math.sin(sqrt) / sqrt);
        }
        else {
            n = 1.0f;
        }
        this.ajAKKAm = (float)Math.cos(sqrt);
        this.AJakKAm *= n;
        this.aJakKAm *= n;
        this.AjAKKAm *= n;
    }
    
    public void aKkaMAj() {
        final float n = (float)Math.sqrt(this.AJakKAm * this.AJakKAm + this.aJakKAm * this.aJakKAm + this.AjAKKAm * this.AjAKKAm);
        float n2;
        if (this.ajAKKAm != 0.0f) {
            n2 = (float)Math.atan(n / this.ajAKKAm);
        }
        else {
            n2 = 1.5707964f;
        }
        this.ajAKKAm = 0.0f;
        this.AJakKAm *= n2;
        this.aJakKAm *= n2;
        this.AjAKKAm *= n2;
    }
    
    public void aKKAMAj(final kajjkkk kajjkkk) {
        final kajjkkk kajjkkk2 = new kajjkkk(this);
        kajjkkk2.akkamAj();
        final kajjkkk kajjkkk3 = new kajjkkk(kajjkkk2);
        kajjkkk3.AkkaMAj(kajjkkk);
        final double sqrt = Math.sqrt(kajjkkk3.AJakKAm * kajjkkk3.AJakKAm + kajjkkk3.aJakKAm * kajjkkk3.aJakKAm + kajjkkk3.AjAKKAm * kajjkkk3.AjAKKAm);
        final float n = this.AJakKAm * kajjkkk.AJakKAm + this.aJakKAm * kajjkkk.aJakKAm + this.AjAKKAm * kajjkkk.AjAKKAm + this.ajAKKAm * kajjkkk.ajAKKAm;
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
        this.ajAKKAm = 0.0f;
        this.AJakKAm = kajjkkk3.AJakKAm * n2;
        this.aJakKAm = kajjkkk3.aJakKAm * n2;
        this.AjAKKAm = kajjkkk3.AjAKKAm * n2;
    }
    
    public void aKKamAj(final kaaakka kaaakka) {
        final float n = this.AJakKAm * this.AJakKAm + this.aJakKAm * this.aJakKAm + this.AjAKKAm * this.AjAKKAm + this.ajAKKAm * this.ajAKKAm;
        float n2;
        if (n == 0.0f) {
            n2 = 1.0f;
        }
        else {
            n2 = 2.0f / n;
        }
        final float n3 = this.AJakKAm * n2;
        final float n4 = this.aJakKAm * n2;
        final float n5 = this.AjAKKAm * n2;
        final float n6 = this.ajAKKAm * n3;
        final float n7 = this.ajAKKAm * n4;
        final float n8 = this.ajAKKAm * n5;
        final float n9 = this.AJakKAm * n3;
        final float n10 = this.AJakKAm * n4;
        final float n11 = this.AJakKAm * n5;
        final float n12 = this.aJakKAm * n4;
        final float n13 = this.aJakKAm * n5;
        final float n14 = this.AjAKKAm * n5;
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
    
    public void aKkamAj(final kaaakka kaaakka) {
        final float n = this.AJakKAm * this.AJakKAm + this.aJakKAm * this.aJakKAm + this.AjAKKAm * this.AjAKKAm + this.ajAKKAm * this.ajAKKAm;
        float n2;
        if (n == 0.0f) {
            n2 = 1.0f;
        }
        else {
            n2 = 2.0f / n;
        }
        final float n3 = this.AJakKAm * n2;
        final float n4 = this.aJakKAm * n2;
        final float n5 = this.AjAKKAm * n2;
        final float n6 = this.ajAKKAm * n3;
        final float n7 = this.ajAKKAm * n4;
        final float n8 = this.ajAKKAm * n5;
        final float n9 = this.AJakKAm * n3;
        final float n10 = this.AJakKAm * n4;
        final float n11 = this.AJakKAm * n5;
        final float n12 = this.aJakKAm * n4;
        final float n13 = this.aJakKAm * n5;
        final float n14 = this.AjAKKAm * n5;
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
        this.AJakKAm = n * n5;
        this.aJakKAm = n2 * n5;
        this.AjAKKAm = n3 * n5;
        this.ajAKKAm = (float)Math.cos(n4 / 2.0f);
    }
    
    public void AKkaMAj(final kaajmma kaajmma, final float n) {
        final float n2 = (float)Math.sin(n / 2.0f);
        this.AJakKAm = kaajmma.MajaKka * n2;
        this.aJakKAm = kaajmma.majaKka * n2;
        this.AjAKKAm = kaajmma.MAjaKka * n2;
        this.ajAKKAm = (float)Math.cos(n / 2.0f);
    }
    
    public void AKKAMAj() {
        final float n = (float)Math.sin(this.ajAKKAm / 2.0f);
        this.AJakKAm *= n;
        this.aJakKAm *= n;
        this.AjAKKAm *= n;
        this.ajAKKAm = (float)Math.cos(this.ajAKKAm / 2.0f);
    }
    
    public float akKAmAj(final kaajmma kaajmma) {
        final kajjkkk kajjkkk = new kajjkkk(this);
        kajjkkk.AkKAMAj();
        final double acos = Math.acos(kajjkkk.ajAKKAm);
        final float n = (float)Math.sin(acos);
        kaajmma.MajaKka = kajjkkk.AJakKAm / n;
        kaajmma.majaKka = kajjkkk.aJakKAm / n;
        kaajmma.MAjaKka = kajjkkk.AjAKKAm / n;
        return 2.0f * (float)acos;
    }
    
    public void AKkamAj(final kaaakka kaaakka) {
        final float n = kaaakka.KaMAjaK + kaaakka.KamAjaK + kaaakka.KaMaJAK;
        if (n > 0.0f) {
            final float n2 = (float)Math.sqrt((double)n + 1.0);
            this.ajAKKAm = 0.5f * n2;
            final float n3 = 0.5f / n2;
            this.AJakKAm = (kaaakka.kAmAjaK - kaaakka.kamAjaK) * n3;
            this.aJakKAm = (kaaakka.KAMAjaK - kaaakka.KAmAjaK) * n3;
            this.AjAKKAm = (kaaakka.kAMAjaK - kaaakka.kaMAjaK) * n3;
            return;
        }
        if (kaaakka.KamAjaK > kaaakka.KaMAjaK) {
            if (kaaakka.KaMaJAK > kaaakka.KamAjaK) {
                float n4 = (float)Math.sqrt((double)(kaaakka.KaMaJAK - (kaaakka.KaMAjaK + kaaakka.KamAjaK)) + 1.0);
                this.AjAKKAm = n4 * 0.5f;
                if (n4 != 0.0f) {
                    n4 = 0.5f / n4;
                }
                this.ajAKKAm = (kaaakka.kAMAjaK - kaaakka.kaMAjaK) * n4;
                this.AJakKAm = (kaaakka.KAMAjaK + kaaakka.KAmAjaK) * n4;
                this.aJakKAm = (kaaakka.kamAjaK + kaaakka.kAmAjaK) * n4;
                return;
            }
            float n5 = (float)Math.sqrt((double)(kaaakka.KamAjaK - (kaaakka.KaMaJAK + kaaakka.KaMAjaK)) + 1.0);
            this.aJakKAm = n5 * 0.5f;
            if (n5 != 0.0f) {
                n5 = 0.5f / n5;
            }
            this.ajAKKAm = (kaaakka.KAMAjaK - kaaakka.KAmAjaK) * n5;
            this.AjAKKAm = (kaaakka.kAmAjaK + kaaakka.kamAjaK) * n5;
            this.AJakKAm = (kaaakka.kaMAjaK + kaaakka.kAMAjaK) * n5;
        }
        else {
            if (kaaakka.KaMaJAK > kaaakka.KaMAjaK) {
                float n6 = (float)Math.sqrt((double)(kaaakka.KaMaJAK - (kaaakka.KaMAjaK + kaaakka.KamAjaK)) + 1.0);
                this.AjAKKAm = n6 * 0.5f;
                if (n6 != 0.0f) {
                    n6 = 0.5f / n6;
                }
                this.ajAKKAm = (kaaakka.kAMAjaK - kaaakka.kaMAjaK) * n6;
                this.AJakKAm = (kaaakka.KAMAjaK + kaaakka.KAmAjaK) * n6;
                this.aJakKAm = (kaaakka.kamAjaK + kaaakka.kAmAjaK) * n6;
                return;
            }
            float n7 = (float)Math.sqrt((double)(kaaakka.KaMAjaK - (kaaakka.KamAjaK + kaaakka.KaMaJAK)) + 1.0);
            this.AJakKAm = n7 * 0.5f;
            if (n7 != 0.0f) {
                n7 = 0.5f / n7;
            }
            this.ajAKKAm = (kaaakka.kAmAjaK - kaaakka.kamAjaK) * n7;
            this.aJakKAm = (kaaakka.kAMAjaK + kaaakka.kaMAjaK) * n7;
            this.AjAKKAm = (kaaakka.KAmAjaK + kaaakka.KAMAjaK) * n7;
        }
    }
    
    public void akKamAj(final kajjkkk kajjkkk, final kajjkkk kajjkkk2, final float n, final float n2) {
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
        this.AJakKAm = n4 * kajjkkk.AJakKAm + n7 * kajjkkk2.AJakKAm;
        this.aJakKAm = n4 * kajjkkk.aJakKAm + n7 * kajjkkk2.aJakKAm;
        this.AjAKKAm = n4 * kajjkkk.AjAKKAm + n7 * kajjkkk2.AjAKKAm;
        this.ajAKKAm = n4 * kajjkkk.ajAKKAm + n7 * kajjkkk2.ajAKKAm;
    }
    
    public void akkAMAj(final kajjkkk kajjkkk, final kajjkkk kajjkkk2, final float n, final float n2) {
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
        this.AJakKAm = n4 * kajjkkk.AJakKAm + n5 * kajjkkk2.AJakKAm;
        this.aJakKAm = n4 * kajjkkk.aJakKAm + n5 * kajjkkk2.aJakKAm;
        this.AjAKKAm = n4 * kajjkkk.AjAKKAm + n5 * kajjkkk2.AjAKKAm;
        this.ajAKKAm = n4 * kajjkkk.ajAKKAm + n5 * kajjkkk2.ajAKKAm;
    }
    
    public String toString() {
        return "quat (" + this.AJakKAm + " ," + this.aJakKAm + " ," + this.AjAKKAm + " / " + this.ajAKKAm + ")";
    }
}
