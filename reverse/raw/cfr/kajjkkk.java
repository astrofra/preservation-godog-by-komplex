/*
 * Decompiled with CFR 0.152.
 */
public class kajjkkk {
    public float AJakKAm;
    public float aJakKAm;
    public float AjAKKAm;
    public float ajAKKAm;
    static final double AJAKKAm = 1.0E-6;

    /*
     * Exception decompiling
     */
    public kajjkkk(float var1_1, float var2_2, float var3_3, float var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Attempt to fetch element 0 from constant pool
         *     at org.benf.cfr.reader.entities.constantpool.ConstantPool.getEntry(ConstantPool.java:155)
         *     at org.benf.cfr.reader.entities.constantpool.ConstantPool.getUTF8Entry(ConstantPool.java:164)
         *     at org.benf.cfr.reader.bytecode.analysis.variables.VariableNamerHinted.getName(VariableNamerHinted.java:60)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.lvalue.LocalVariable.<init>(LocalVariable.java:34)
         *     at org.benf.cfr.reader.bytecode.analysis.variables.VariableFactory.localVariable(VariableFactory.java:81)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.mkRetrieve(Op02WithProcessedDataAndRefs.java:935)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.createStatement(Op02WithProcessedDataAndRefs.java:983)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.access$100(Op02WithProcessedDataAndRefs.java:57)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs$11.call(Op02WithProcessedDataAndRefs.java:2080)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs$11.call(Op02WithProcessedDataAndRefs.java:2077)
         *     at org.benf.cfr.reader.util.graph.AbstractGraphVisitorFI.process(AbstractGraphVisitorFI.java:60)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.convertToOp03List(Op02WithProcessedDataAndRefs.java:2089)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:469)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public kajjkkk(double d, double d2, double d3, double d4) {
        super();
        this.AJakKAm = (float)d;
        this.aJakKAm = (float)d2;
        this.AjAKKAm = (float)d3;
        this.ajAKKAm = (float)d4;
    }

    public kajjkkk(kaajmma kaajmma2, float f) {
        super();
        this.AJakKAm = kaajmma2.MajaKka;
        this.aJakKAm = kaajmma2.majaKka;
        this.AjAKKAm = kaajmma2.MAjaKka;
        this.ajAKKAm = f;
    }

    public kajjkkk(kaajmma kaajmma2) {
        super();
        this.AJakKAm = kaajmma2.MajaKka;
        this.aJakKAm = kaajmma2.majaKka;
        this.AjAKKAm = kaajmma2.MAjaKka;
        this.ajAKKAm = 0.0f;
    }

    public kajjkkk(kajjkkk kajjkkk2) {
        super();
        this.AJakKAm = kajjkkk2.AJakKAm;
        this.aJakKAm = kajjkkk2.aJakKAm;
        this.AjAKKAm = kajjkkk2.AjAKKAm;
        this.ajAKKAm = kajjkkk2.ajAKKAm;
    }

    public kajjkkk() {
        super();
    }

    public void aKkAMAj(kajjkkk kajjkkk2) {
        this.AJakKAm = kajjkkk2.AJakKAm;
        this.aJakKAm = kajjkkk2.aJakKAm;
        this.AjAKKAm = kajjkkk2.AjAKKAm;
        this.ajAKKAm = kajjkkk2.ajAKKAm;
    }

    public void akkaMAj(float f, float f2, float f3, float f4) {
        this.AJakKAm = f;
        this.aJakKAm = f2;
        this.AjAKKAm = f3;
        this.ajAKKAm = f4;
    }

    public void AKKamAj(double d, double d2, double d3, double d4) {
        this.AJakKAm = (float)d;
        this.aJakKAm = (float)d2;
        this.AjAKKAm = (float)d3;
        this.ajAKKAm = (float)d4;
    }

    public float AkKamAj() {
        float f = (float)Math.sqrt(this.AJakKAm * this.AJakKAm + this.aJakKAm * this.aJakKAm + this.AjAKKAm * this.AjAKKAm + this.ajAKKAm * this.ajAKKAm);
        if (f == 0.0f) {
            f = 1.0f;
        }
        return f;
    }

    public void AkKAmAj(float f) {
        this.AJakKAm *= f;
        this.aJakKAm *= f;
        this.AjAKKAm *= f;
        this.ajAKKAm *= f;
    }

    public void AkKAMAj() {
        float f = 1.0f / this.AkKamAj();
        this.AkKAmAj(f);
    }

    public float AkkAMAj(kajjkkk kajjkkk2) {
        float f = (this.AJakKAm * kajjkkk2.AJakKAm + this.aJakKAm * kajjkkk2.aJakKAm + this.AjAKKAm * kajjkkk2.AjAKKAm + this.ajAKKAm * kajjkkk2.ajAKKAm) / (this.AkKamAj() * kajjkkk2.AkKamAj());
        return f;
    }

    public float AkkamAj(kajjkkk kajjkkk2) {
        float f = this.AJakKAm * kajjkkk2.AJakKAm + this.aJakKAm * kajjkkk2.aJakKAm + this.AjAKKAm * kajjkkk2.AjAKKAm + this.ajAKKAm * kajjkkk2.ajAKKAm;
        return f;
    }

    public void AkkaMAj(kajjkkk kajjkkk2) {
        float f = this.ajAKKAm * kajjkkk2.ajAKKAm - this.AJakKAm * kajjkkk2.AJakKAm - this.aJakKAm * kajjkkk2.aJakKAm - this.AjAKKAm * kajjkkk2.AjAKKAm;
        float f2 = this.ajAKKAm * kajjkkk2.AJakKAm + this.AJakKAm * kajjkkk2.ajAKKAm + this.aJakKAm * kajjkkk2.AjAKKAm - this.AjAKKAm * kajjkkk2.aJakKAm;
        float f3 = this.ajAKKAm * kajjkkk2.aJakKAm + this.aJakKAm * kajjkkk2.ajAKKAm + this.AjAKKAm * kajjkkk2.AJakKAm - this.AJakKAm * kajjkkk2.AjAKKAm;
        float f4 = this.ajAKKAm * kajjkkk2.AjAKKAm + this.AjAKKAm * kajjkkk2.ajAKKAm + this.AJakKAm * kajjkkk2.aJakKAm - this.aJakKAm * kajjkkk2.AJakKAm;
        this.ajAKKAm = f;
        this.AJakKAm = f2;
        this.aJakKAm = f3;
        this.AjAKKAm = f4;
    }

    public void akkamAj() {
        float f = this.AJakKAm * this.AJakKAm + this.aJakKAm * this.aJakKAm + this.AjAKKAm * this.AjAKKAm + this.ajAKKAm * this.ajAKKAm;
        f = f != 0.0f ? 1.0f / f : 1.0f;
        this.ajAKKAm *= f;
        this.AJakKAm = -this.AJakKAm * f;
        this.aJakKAm = -this.aJakKAm * f;
        this.AjAKKAm = -this.AjAKKAm * f;
    }

    public void AKKAmAj() {
        float f = 1.0f / this.AkKamAj();
        this.ajAKKAm *= f;
        this.AJakKAm *= -f;
        this.aJakKAm *= -f;
        this.AjAKKAm *= -f;
    }

    public void akKAMAj() {
        double d = Math.sqrt(this.AJakKAm * this.AJakKAm + this.aJakKAm * this.aJakKAm + this.AjAKKAm * this.AjAKKAm);
        float f = d > 0.0 ? (float)(Math.sin(d) / d) : 1.0f;
        this.ajAKKAm = (float)Math.cos(d);
        this.AJakKAm *= f;
        this.aJakKAm *= f;
        this.AjAKKAm *= f;
    }

    public void aKkaMAj() {
        float f = (float)Math.sqrt(this.AJakKAm * this.AJakKAm + this.aJakKAm * this.aJakKAm + this.AjAKKAm * this.AjAKKAm);
        f = this.ajAKKAm != 0.0f ? (float)Math.atan(f / this.ajAKKAm) : 1.5707964f;
        this.ajAKKAm = 0.0f;
        this.AJakKAm *= f;
        this.aJakKAm *= f;
        this.AjAKKAm *= f;
    }

    public void aKKAMAj(kajjkkk kajjkkk2) {
        kajjkkk kajjkkk3 = new kajjkkk(this);
        kajjkkk3.akkamAj();
        kajjkkk kajjkkk4 = new kajjkkk(kajjkkk3);
        kajjkkk4.AkkaMAj(kajjkkk2);
        double d = Math.sqrt(kajjkkk4.AJakKAm * kajjkkk4.AJakKAm + kajjkkk4.aJakKAm * kajjkkk4.aJakKAm + kajjkkk4.AjAKKAm * kajjkkk4.AjAKKAm);
        float f = this.AJakKAm * kajjkkk2.AJakKAm + this.aJakKAm * kajjkkk2.aJakKAm + this.AjAKKAm * kajjkkk2.AjAKKAm + this.ajAKKAm * kajjkkk2.ajAKKAm;
        float f2 = f != 0.0f ? (float)Math.atan(d / (double)f) : 1.5707964f;
        if (d != 0.0) {
            f2 /= (float)d;
        }
        this.ajAKKAm = 0.0f;
        this.AJakKAm = kajjkkk4.AJakKAm * f2;
        this.aJakKAm = kajjkkk4.aJakKAm * f2;
        this.AjAKKAm = kajjkkk4.AjAKKAm * f2;
    }

    public void aKKamAj(kaaakka kaaakka2) {
        float f = this.AJakKAm * this.AJakKAm + this.aJakKAm * this.aJakKAm + this.AjAKKAm * this.AjAKKAm + this.ajAKKAm * this.ajAKKAm;
        float f2 = f == 0.0f ? 1.0f : 2.0f / f;
        float f3 = this.AJakKAm * f2;
        float f4 = this.aJakKAm * f2;
        float f5 = this.AjAKKAm * f2;
        float f6 = this.ajAKKAm * f3;
        float f7 = this.ajAKKAm * f4;
        float f8 = this.ajAKKAm * f5;
        float f9 = this.AJakKAm * f3;
        float f10 = this.AJakKAm * f4;
        float f11 = this.AJakKAm * f5;
        float f12 = this.aJakKAm * f4;
        float f13 = this.aJakKAm * f5;
        float f14 = this.AjAKKAm * f5;
        kaaakka2.KaMAjaK = 1.0f - (f12 + f14);
        kaaakka2.kaMAjaK = f10 - f8;
        kaaakka2.KAMAjaK = f11 + f7;
        kaaakka2.kAMAjaK = f10 + f8;
        kaaakka2.KamAjaK = 1.0f - (f9 + f14);
        kaaakka2.kamAjaK = f13 - f6;
        kaaakka2.KAmAjaK = f11 - f7;
        kaaakka2.kAmAjaK = f13 + f6;
        kaaakka2.KaMaJAK = 1.0f - (f9 + f12);
    }

    public void aKkamAj(kaaakka kaaakka2) {
        float f = this.AJakKAm * this.AJakKAm + this.aJakKAm * this.aJakKAm + this.AjAKKAm * this.AjAKKAm + this.ajAKKAm * this.ajAKKAm;
        float f2 = f == 0.0f ? 1.0f : 2.0f / f;
        float f3 = this.AJakKAm * f2;
        float f4 = this.aJakKAm * f2;
        float f5 = this.AjAKKAm * f2;
        float f6 = this.ajAKKAm * f3;
        float f7 = this.ajAKKAm * f4;
        float f8 = this.ajAKKAm * f5;
        float f9 = this.AJakKAm * f3;
        float f10 = this.AJakKAm * f4;
        float f11 = this.AJakKAm * f5;
        float f12 = this.aJakKAm * f4;
        float f13 = this.aJakKAm * f5;
        float f14 = this.AjAKKAm * f5;
        kaaakka2.KaMAjaK = 1.0f - (f12 + f14);
        kaaakka2.kaMAjaK = f10 + f8;
        kaaakka2.KAMAjaK = f11 - f7;
        kaaakka2.kAMAjaK = f10 - f8;
        kaaakka2.KamAjaK = 1.0f - (f9 + f14);
        kaaakka2.kamAjaK = f13 + f6;
        kaaakka2.KAmAjaK = f11 + f7;
        kaaakka2.kAmAjaK = f13 - f6;
        kaaakka2.KaMaJAK = 1.0f - (f9 + f12);
    }

    public void AKkAMAj(float f, float f2, float f3, float f4) {
        float f5 = (float)Math.sin(f4 / 2.0f);
        this.AJakKAm = f * f5;
        this.aJakKAm = f2 * f5;
        this.AjAKKAm = f3 * f5;
        this.ajAKKAm = (float)Math.cos(f4 / 2.0f);
    }

    public void AKkaMAj(kaajmma kaajmma2, float f) {
        float f2 = (float)Math.sin(f / 2.0f);
        this.AJakKAm = kaajmma2.MajaKka * f2;
        this.aJakKAm = kaajmma2.majaKka * f2;
        this.AjAKKAm = kaajmma2.MAjaKka * f2;
        this.ajAKKAm = (float)Math.cos(f / 2.0f);
    }

    public void AKKAMAj() {
        float f = (float)Math.sin(this.ajAKKAm / 2.0f);
        this.AJakKAm *= f;
        this.aJakKAm *= f;
        this.AjAKKAm *= f;
        this.ajAKKAm = (float)Math.cos(this.ajAKKAm / 2.0f);
    }

    public float akKAmAj(kaajmma kaajmma2) {
        kajjkkk kajjkkk2 = new kajjkkk(this);
        kajjkkk2.AkKAMAj();
        double d = Math.acos(kajjkkk2.ajAKKAm);
        float f = (float)Math.sin(d);
        kaajmma2.MajaKka = kajjkkk2.AJakKAm / f;
        kaajmma2.majaKka = kajjkkk2.aJakKAm / f;
        kaajmma2.MAjaKka = kajjkkk2.AjAKKAm / f;
        return 2.0f * (float)d;
    }

    public void AKkamAj(kaaakka kaaakka2) {
        float f = kaaakka2.KaMAjaK + kaaakka2.KamAjaK + kaaakka2.KaMaJAK;
        if (f > 0.0f) {
            float f2 = (float)Math.sqrt((double)f + 1.0);
            this.ajAKKAm = 0.5f * f2;
            f2 = 0.5f / f2;
            this.AJakKAm = (kaaakka2.kAmAjaK - kaaakka2.kamAjaK) * f2;
            this.aJakKAm = (kaaakka2.KAMAjaK - kaaakka2.KAmAjaK) * f2;
            this.AjAKKAm = (kaaakka2.kAMAjaK - kaaakka2.kaMAjaK) * f2;
            return;
        }
        if (kaaakka2.KamAjaK > kaaakka2.KaMAjaK) {
            if (kaaakka2.KaMaJAK > kaaakka2.KamAjaK) {
                float f3 = (float)Math.sqrt((double)(kaaakka2.KaMaJAK - (kaaakka2.KaMAjaK + kaaakka2.KamAjaK)) + 1.0);
                this.AjAKKAm = f3 * 0.5f;
                if (f3 != 0.0f) {
                    f3 = 0.5f / f3;
                }
                this.ajAKKAm = (kaaakka2.kAMAjaK - kaaakka2.kaMAjaK) * f3;
                this.AJakKAm = (kaaakka2.KAMAjaK + kaaakka2.KAmAjaK) * f3;
                this.aJakKAm = (kaaakka2.kamAjaK + kaaakka2.kAmAjaK) * f3;
                return;
            }
            float f4 = (float)Math.sqrt((double)(kaaakka2.KamAjaK - (kaaakka2.KaMaJAK + kaaakka2.KaMAjaK)) + 1.0);
            this.aJakKAm = f4 * 0.5f;
            if (f4 != 0.0f) {
                f4 = 0.5f / f4;
            }
            this.ajAKKAm = (kaaakka2.KAMAjaK - kaaakka2.KAmAjaK) * f4;
            this.AjAKKAm = (kaaakka2.kAmAjaK + kaaakka2.kamAjaK) * f4;
            this.AJakKAm = (kaaakka2.kaMAjaK + kaaakka2.kAMAjaK) * f4;
            return;
        }
        if (kaaakka2.KaMaJAK > kaaakka2.KaMAjaK) {
            float f5 = (float)Math.sqrt((double)(kaaakka2.KaMaJAK - (kaaakka2.KaMAjaK + kaaakka2.KamAjaK)) + 1.0);
            this.AjAKKAm = f5 * 0.5f;
            if (f5 != 0.0f) {
                f5 = 0.5f / f5;
            }
            this.ajAKKAm = (kaaakka2.kAMAjaK - kaaakka2.kaMAjaK) * f5;
            this.AJakKAm = (kaaakka2.KAMAjaK + kaaakka2.KAmAjaK) * f5;
            this.aJakKAm = (kaaakka2.kamAjaK + kaaakka2.kAmAjaK) * f5;
            return;
        }
        float f6 = (float)Math.sqrt((double)(kaaakka2.KaMAjaK - (kaaakka2.KamAjaK + kaaakka2.KaMaJAK)) + 1.0);
        this.AJakKAm = f6 * 0.5f;
        if (f6 != 0.0f) {
            f6 = 0.5f / f6;
        }
        this.ajAKKAm = (kaaakka2.kAmAjaK - kaaakka2.kamAjaK) * f6;
        this.aJakKAm = (kaaakka2.kAMAjaK + kaaakka2.kaMAjaK) * f6;
        this.AjAKKAm = (kaaakka2.KAmAjaK + kaaakka2.KAMAjaK) * f6;
    }

    public void akKamAj(kajjkkk kajjkkk2, kajjkkk kajjkkk3, float f, float f2) {
        float f3;
        float f4;
        float f5;
        double d = kajjkkk2.AkkamAj(kajjkkk3);
        if (d < 0.0) {
            d = -d;
            f5 = -1.0f;
        } else {
            f5 = 1.0f;
        }
        if (1.0 - d < 1.0E-6) {
            f4 = 1.0f - f;
            f3 = f;
        } else {
            double d2 = Math.acos(d);
            double d3 = Math.sin(d2);
            double d4 = d2 + (double)f2 * Math.PI;
            f4 = (float)(Math.sin(d2 - (double)f * d4) / d3);
            f3 = (float)(Math.sin((double)f * d4) / d3);
        }
        this.AJakKAm = f4 * kajjkkk2.AJakKAm + (f3 *= f5) * kajjkkk3.AJakKAm;
        this.aJakKAm = f4 * kajjkkk2.aJakKAm + f3 * kajjkkk3.aJakKAm;
        this.AjAKKAm = f4 * kajjkkk2.AjAKKAm + f3 * kajjkkk3.AjAKKAm;
        this.ajAKKAm = f4 * kajjkkk2.ajAKKAm + f3 * kajjkkk3.ajAKKAm;
    }

    public void akkAMAj(kajjkkk kajjkkk2, kajjkkk kajjkkk3, float f, float f2) {
        float f3;
        float f4;
        double d = kajjkkk2.AkkamAj(kajjkkk3);
        if (1.0 - Math.abs(d) < 1.0E-6) {
            f4 = 1.0f - f;
            f3 = f;
        } else {
            double d2 = Math.acos(d);
            double d3 = Math.sin(d2);
            double d4 = d2 + (double)f2 * Math.PI;
            f4 = (float)(Math.sin(d2 - (double)f * d4) / d3);
            f3 = (float)(Math.sin((double)f * d4) / d3);
        }
        this.AJakKAm = f4 * kajjkkk2.AJakKAm + f3 * kajjkkk3.AJakKAm;
        this.aJakKAm = f4 * kajjkkk2.aJakKAm + f3 * kajjkkk3.aJakKAm;
        this.AjAKKAm = f4 * kajjkkk2.AjAKKAm + f3 * kajjkkk3.AjAKKAm;
        this.ajAKKAm = f4 * kajjkkk2.ajAKKAm + f3 * kajjkkk3.ajAKKAm;
    }

    public String toString() {
        return "quat (" + this.AJakKAm + " ," + this.aJakKAm + " ," + this.AjAKKAm + " / " + this.ajAKKAm + ")";
    }
}

