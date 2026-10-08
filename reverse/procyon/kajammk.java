// 
// Decompiled by Procyon v0.6.0
// 

public class kajammk
{
    int AJAKkaM;
    public static final int aJAKkaM = 0;
    public static final int AjaKkaM = 1;
    public static final int ajaKkaM = 2;
    int AJaKkaM;
    public static final int aJaKkaM = 0;
    public static final int AjAkKAM = 1;
    public static final int ajAkKAM = 2;
    int AJAkKAM;
    int aJAkKAM;
    majjmma[] AjakKAM;
    majjmma ajakKAM;
    majjmma AJakKAM;
    public float aJakKAM;
    float[] AjAKKAM;
    float[] ajAKKAM;
    int[] AJAKKAM;
    int[] aJAKKAM;
    float AjaKKAM;
    float ajaKKAM;
    float AJaKKAM;
    float aJaKKAM;
    public float[] AjAkkAM;
    public int[] ajAkkAM;
    public kajjkkk[] AJAkkAM;
    
    public kajammk(final majjmma[] ajakKAM, final int ajaKkaM, final int aJaKkaM) {
        this.AJAkKAM = -1;
        this.AjakKAM = ajakKAM;
        this.aJakKAM = this.AjakKAM[this.AjakKAM.length - 1].MaJAkkA;
        switch (this.AJaKkaM = aJaKkaM) {
            case 0: {
                this.aJAkKAM = this.AjakKAM[0].MAjAkkA.length;
                this.AjAKKAM = new float[this.aJAkKAM];
                this.ajAKKAM = new float[this.aJAkKAM];
                this.AjAkkAM = new float[this.aJAkKAM];
                break;
            }
            case 1: {
                this.aJAkKAM = this.AjakKAM[0].mAjAkkA.length;
                this.AJAKKAM = new int[this.aJAkKAM];
                this.aJAKKAM = new int[this.aJAkKAM];
                this.ajAkkAM = new int[this.aJAkKAM];
                break;
            }
            case 2: {
                this.aJAkKAM = this.AjakKAM[0].MaJaKKA.length;
                this.AJAkkAM = new kajjkkk[this.aJAkKAM];
                for (int i = 0; i < this.aJAkKAM; ++i) {
                    this.AJAkkAM[i] = new kajjkkk();
                }
                this.AKKamAJ();
                break;
            }
            default: {
                System.err.println("help head! invalid datamode.");
                break;
            }
        }
        this.AJAKkaM = ajaKkaM;
        if (this.AJAKkaM == 0 || this.AJAKkaM == 2) {
            this.ajakKAM = this.akkamAJ(0);
            this.AJakKAM = this.akkamAJ(this.AjakKAM.length - 1);
        }
        else if (this.AJAKkaM == 1) {
            this.ajakKAM = this.akkamAJ(this.AjakKAM.length - 2);
            this.AJakKAM = this.akkamAJ(1);
        }
        else {
            System.err.println("invalid spline mode");
        }
        this.AkkamAJ(0);
    }
    
    majjmma akkamAJ(final int n) {
        if (n < 0) {
            return this.ajakKAM;
        }
        if (n >= this.AjakKAM.length) {
            return this.AJakKAM;
        }
        return this.AjakKAM[n];
    }
    
    void AkkamAJ(final int ajAkKAM) {
        if (this.AJAkKAM == ajAkKAM) {
            return;
        }
        this.AJAkKAM = ajAkKAM;
        final majjmma akkamAJ = this.akkamAJ(ajAkKAM - 1);
        final majjmma akkamAJ2 = this.akkamAJ(ajAkKAM);
        final majjmma akkamAJ3 = this.akkamAJ(ajAkKAM + 1);
        final majjmma akkamAJ4 = this.akkamAJ(ajAkKAM + 2);
        this.AjaKKAM = 0.5f * (1.0f - akkamAJ2.maJAkkA) * (1.0f + akkamAJ2.MAJAkkA) * (1.0f + akkamAJ2.mAJAkkA);
        this.ajaKKAM = 0.5f * (1.0f - akkamAJ2.maJAkkA) * (1.0f - akkamAJ2.MAJAkkA) * (1.0f - akkamAJ2.mAJAkkA);
        this.AJaKKAM = 0.5f * (1.0f - akkamAJ3.maJAkkA) * (1.0f + akkamAJ3.MAJAkkA) * (1.0f - akkamAJ3.mAJAkkA);
        this.aJaKKAM = 0.5f * (1.0f - akkamAJ3.maJAkkA) * (1.0f - akkamAJ3.MAJAkkA) * (1.0f + akkamAJ3.mAJAkkA);
        switch (this.AJaKkaM) {
            case 0: {
                final float[] mAjAkkA = akkamAJ.MAjAkkA;
                final float[] mAjAkkA2 = akkamAJ2.MAjAkkA;
                final float[] mAjAkkA3 = akkamAJ3.MAjAkkA;
                final float[] mAjAkkA4 = akkamAJ4.MAjAkkA;
                for (int i = 0; i < this.aJAkKAM; ++i) {
                    this.AjAKKAM[i] = (mAjAkkA2[i] - mAjAkkA[i]) * this.AjaKKAM + (mAjAkkA3[i] - mAjAkkA2[i]) * this.ajaKKAM;
                    this.ajAKKAM[i] = (mAjAkkA4[i] - mAjAkkA3[i]) * this.AJaKKAM + (mAjAkkA3[i] - mAjAkkA2[i]) * this.aJaKKAM;
                }
                return;
            }
            case 2: {
                for (int j = 0; j < this.aJAkKAM; ++j) {}
                break;
            }
        }
    }
    
    void AKKamAJ() {
        for (int i = 0; i < this.AjakKAM.length; ++i) {
            final majjmma majjmma = this.AjakKAM[i];
            majjmma.maJaKKA = new kajjkkk[this.aJAkKAM];
            majjmma.MAJaKKA = new kajjkkk[this.aJAkKAM];
            for (int j = 0; j < this.aJAkKAM; ++j) {
                majjmma.maJaKKA[j] = new kajjkkk();
                majjmma.MAJaKKA[j] = new kajjkkk();
            }
        }
        final int n = this.AjakKAM.length - 1;
        for (int k = 1; k < n; ++k) {
            for (int l = 0; l < this.aJAkKAM; ++l) {
                this.AKkamAJ(this.AjakKAM[k - 1], this.AjakKAM[k], this.AjakKAM[k + 1], l);
            }
        }
        for (int n2 = 0; n2 < this.aJAkKAM; ++n2) {
            this.AKkamAJ(null, this.AjakKAM[0], this.AjakKAM[1], n2);
            this.AKkamAJ(this.AjakKAM[0], this.AjakKAM[n], null, n2);
        }
    }
    
    void AKkamAJ(final majjmma majjmma, final majjmma majjmma2, final majjmma majjmma3, final int n) {
        kajjkkk kajjkkk = null;
        kajjkkk kajjkkk2 = null;
        final kajjkkk kajjkkk3 = new kajjkkk();
        final kajjkkk kajjkkk4 = new kajjkkk();
        final kajjkkk kajjkkk5 = new kajjkkk(majjmma2.MaJaKKA[n]);
        final kajjkkk kajjkkk6 = new kajjkkk(majjmma2.MaJaKKA[n]);
        kajjkkk6.AKKAMAj();
        if (majjmma != null) {
            final kajjkkk kajjkkk7 = new kajjkkk(majjmma.MaJaKKA[n]);
            final kajjkkk kajjkkk8 = new kajjkkk(majjmma.MaJaKKA[n]);
            kajjkkk8.AKKAMAj();
            if (Math.abs(kajjkkk5.ajAKKAm - kajjkkk7.ajAKKAm) > 6.283175307179587) {
                kajjkkk2 = new kajjkkk(kajjkkk5);
                kajjkkk2.ajAKKAm = 0.0f;
                kajjkkk2.aKkaMAj();
            }
            else {
                final kajjkkk kajjkkk9 = new kajjkkk(kajjkkk8);
                if (kajjkkk9.AkkamAj(kajjkkk6) < 0.0f) {
                    kajjkkk9.AKKAmAj();
                }
                kajjkkk2 = new kajjkkk(kajjkkk9);
                kajjkkk2.aKKAMAj(kajjkkk6);
            }
        }
        if (majjmma3 != null) {
            final kajjkkk kajjkkk10 = new kajjkkk(majjmma3.MaJaKKA[n]);
            final kajjkkk kajjkkk11 = new kajjkkk(majjmma3.MaJaKKA[n]);
            kajjkkk11.AKKAMAj();
            if (Math.abs(kajjkkk10.ajAKKAm - kajjkkk5.ajAKKAm) > 6.283175307179587) {
                kajjkkk = new kajjkkk(kajjkkk10);
                kajjkkk.ajAKKAm = 0.0f;
                kajjkkk.aKkaMAj();
            }
            else {
                final kajjkkk kajjkkk12 = new kajjkkk(kajjkkk11);
                if (kajjkkk12.AkkamAj(kajjkkk6) < 0.0f) {
                    kajjkkk12.AKKAmAj();
                }
                kajjkkk = new kajjkkk(kajjkkk6);
                kajjkkk.aKKAMAj(kajjkkk12);
            }
        }
        if (majjmma == null) {
            kajjkkk2 = new kajjkkk(kajjkkk);
        }
        if (majjmma3 == null) {
            kajjkkk = new kajjkkk(kajjkkk2);
        }
        float n3;
        float n2 = n3 = 1.0f;
        final float n4 = 1.0f - majjmma2.mAJAkkA;
        if (majjmma != null && majjmma3 != null) {
            final float n5 = 0.5f * (majjmma3.MaJAkkA - majjmma.MaJAkkA);
            final float n6 = (majjmma2.MaJAkkA - majjmma.MaJAkkA) / n5;
            final float n7 = (majjmma3.MaJAkkA - majjmma2.MaJAkkA) / n5;
            final float abs = Math.abs(majjmma2.mAJAkkA);
            n3 = n6 + abs - abs * n6;
            n2 = n7 + abs - abs * n7;
        }
        final float n8 = 0.5f * (1.0f - majjmma2.maJAkkA);
        final float n9 = 2.0f - n4;
        final float n10 = 1.0f - majjmma2.MAJAkkA;
        final float n11 = 2.0f - n10;
        final float n12 = n8 * n4;
        final float n13 = n8 * n9;
        final float n14 = 1.0f - n12 * n11 * n3;
        final float n15 = -n13 * n10 * n3;
        final float n16 = n13 * n11 * n2;
        final float n17 = n12 * n10 * n2 - 1.0f;
        kajjkkk3.AJakKAm = 0.5f * (n16 * kajjkkk2.AJakKAm + n17 * kajjkkk.AJakKAm);
        kajjkkk4.AJakKAm = 0.5f * (n14 * kajjkkk2.AJakKAm + n15 * kajjkkk.AJakKAm);
        kajjkkk3.aJakKAm = 0.5f * (n16 * kajjkkk2.aJakKAm + n17 * kajjkkk.aJakKAm);
        kajjkkk4.aJakKAm = 0.5f * (n14 * kajjkkk2.aJakKAm + n15 * kajjkkk.aJakKAm);
        kajjkkk3.AjAKKAm = 0.5f * (n16 * kajjkkk2.AjAKKAm + n17 * kajjkkk.AjAKKAm);
        kajjkkk4.AjAKKAm = 0.5f * (n14 * kajjkkk2.AjAKKAm + n15 * kajjkkk.AjAKKAm);
        kajjkkk3.ajAKKAm = 0.5f * (n16 * kajjkkk2.ajAKKAm + n17 * kajjkkk.ajAKKAm);
        kajjkkk4.ajAKKAm = 0.5f * (n14 * kajjkkk2.ajAKKAm + n15 * kajjkkk.ajAKKAm);
        final kajjkkk kajjkkk13 = new kajjkkk(kajjkkk3);
        kajjkkk13.akKAMAj();
        final kajjkkk kajjkkk14 = new kajjkkk(kajjkkk4);
        kajjkkk14.akKAMAj();
        final kajjkkk kajjkkk15 = majjmma2.maJaKKA[n];
        final kajjkkk kajjkkk16 = majjmma2.MAJaKKA[n];
        kajjkkk15.aKkAMAj(kajjkkk6);
        kajjkkk15.AkkaMAj(kajjkkk13);
        kajjkkk16.aKkAMAj(kajjkkk6);
        kajjkkk16.AkkaMAj(kajjkkk14);
    }
    
    public void aKKamAJ(float aJakKAM) {
        if (this.AJAKkaM == 0) {
            if (aJakKAM < 0.0f) {
                aJakKAM = 0.0f;
            }
            if (aJakKAM > this.aJakKAM) {
                aJakKAM = this.aJakKAM;
            }
        }
        else if (this.AJAKkaM == 1 || this.AJAKkaM == 2) {
            aJakKAM %= this.aJakKAM;
            if (aJakKAM < 0.0f) {
                aJakKAM += this.aJakKAM;
            }
        }
        majjmma majjmma = this.akkamAJ(this.AJAkKAM);
        majjmma majjmma2 = this.akkamAJ(this.AJAkKAM + 1);
        int ajAkKAM;
        for (ajAkKAM = this.AJAkKAM; aJakKAM < majjmma.MaJAkkA; majjmma = this.akkamAJ(ajAkKAM), majjmma2 = this.akkamAJ(ajAkKAM + 1)) {
            if (ajAkKAM <= 0) {
                break;
            }
            --ajAkKAM;
        }
        while (aJakKAM >= majjmma2.MaJAkkA && ajAkKAM < this.AjakKAM.length - 2) {
            ++ajAkKAM;
            majjmma = this.akkamAJ(ajAkKAM);
            majjmma2 = this.akkamAJ(ajAkKAM + 1);
        }
        if (ajAkKAM != this.AJAkKAM) {
            this.AkkamAJ(ajAkKAM);
        }
        final float n = (aJakKAM - majjmma.MaJAkkA) / (majjmma2.MaJAkkA - majjmma.MaJAkkA);
        final float n2 = n * n;
        final float n3 = n2 * n;
        final float n4 = 2.0f * n3 - 3.0f * n2 + 1.0f;
        final float n5 = -2.0f * n3 + 3.0f * n2;
        final float n6 = n3 - 2.0f * n2 + n;
        final float n7 = n3 - n2;
        final int ajAkKAM2 = this.aJAkKAM;
        switch (this.AJaKkaM) {
            case 0: {
                final float[] ajAKKAM = this.AjAKKAM;
                final float[] ajAKKAM2 = this.ajAKKAM;
                final float[] mAjAkkA = majjmma.MAjAkkA;
                final float[] mAjAkkA2 = majjmma2.MAjAkkA;
                final float[] ajAkkAM = this.AjAkkAM;
                for (int i = 0; i < ajAkKAM2; ++i) {
                    ajAkkAM[i] = mAjAkkA[i] * n4 + mAjAkkA2[i] * n5 + ajAKKAM[i] * n6 + ajAKKAM2[i] * n7;
                }
                return;
            }
            case 2: {
                final float n8 = (1.0f - n) * 2.0f * n;
                for (int j = 0; j < ajAkKAM2; ++j) {
                    final kajjkkk kajjkkk = new kajjkkk(majjmma.MaJaKKA[j]);
                    kajjkkk.AKKAMAj();
                    final kajjkkk kajjkkk2 = new kajjkkk(majjmma2.MaJaKKA[j]);
                    kajjkkk2.AKKAMAj();
                    final float n9 = majjmma2.MaJaKKA[j].ajAKKAm - majjmma.MaJaKKA[j].ajAKKAm;
                    float n10;
                    if (n9 > 0.0f) {
                        n10 = (float)Math.floor((double)n9 / 6.283185307179586);
                    }
                    else {
                        n10 = (float)Math.ceil((double)n9 / 6.283185307179586);
                    }
                    final float a = n9 - 6.2831855f * n10;
                    final kajjkkk kajjkkk3 = new kajjkkk();
                    if (Math.abs(a) > 3.141592653589793) {
                        final kajjkkk kajjkkk4 = new kajjkkk();
                        kajjkkk4.akkAMAj(kajjkkk, kajjkkk2, n, n10);
                        final kajjkkk kajjkkk5 = new kajjkkk();
                        kajjkkk5.akkAMAj(majjmma.MAJaKKA[j], majjmma2.maJaKKA[j], n, n10);
                        kajjkkk3.akkAMAj(kajjkkk4, kajjkkk5, n8, 0.0f);
                    }
                    else {
                        final kajjkkk kajjkkk6 = new kajjkkk();
                        kajjkkk6.akKamAj(kajjkkk, kajjkkk2, n, n10);
                        final kajjkkk kajjkkk7 = new kajjkkk();
                        kajjkkk7.akKamAj(majjmma.MAJaKKA[j], majjmma2.maJaKKA[j], n, n10);
                        kajjkkk3.akKamAj(kajjkkk6, kajjkkk7, n8, 0.0f);
                    }
                    this.AJAkkAM[j].aKkAMAj(kajjkkk3);
                }
            }
            default: {}
        }
    }
}
