/*
 * Decompiled with CFR 0.152.
 */
public class kajammk {
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

    /*
     * Exception decompiling
     */
    public kajammk(majjmma[] var1_1, int var2_2, int var3_3) {
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

    majjmma akkamAJ(int n) {
        if (n < 0) {
            return this.ajakKAM;
        }
        if (n >= this.AjakKAM.length) {
            return this.AJakKAM;
        }
        return this.AjakKAM[n];
    }

    void AkkamAJ(int n) {
        if (this.AJAkKAM == n) {
            return;
        }
        this.AJAkKAM = n;
        majjmma majjmma2 = this.akkamAJ(n - 1);
        majjmma majjmma3 = this.akkamAJ(n);
        majjmma majjmma4 = this.akkamAJ(n + 1);
        majjmma majjmma5 = this.akkamAJ(n + 2);
        this.AjaKKAM = 0.5f * (1.0f - majjmma3.maJAkkA) * (1.0f + majjmma3.MAJAkkA) * (1.0f + majjmma3.mAJAkkA);
        this.ajaKKAM = 0.5f * (1.0f - majjmma3.maJAkkA) * (1.0f - majjmma3.MAJAkkA) * (1.0f - majjmma3.mAJAkkA);
        this.AJaKKAM = 0.5f * (1.0f - majjmma4.maJAkkA) * (1.0f + majjmma4.MAJAkkA) * (1.0f - majjmma4.mAJAkkA);
        this.aJaKKAM = 0.5f * (1.0f - majjmma4.maJAkkA) * (1.0f - majjmma4.MAJAkkA) * (1.0f + majjmma4.mAJAkkA);
        switch (this.AJaKkaM) {
            case 0: {
                float[] fArray = majjmma2.MAjAkkA;
                float[] fArray2 = majjmma3.MAjAkkA;
                float[] fArray3 = majjmma4.MAjAkkA;
                float[] fArray4 = majjmma5.MAjAkkA;
                int n2 = 0;
                while (n2 < this.aJAkKAM) {
                    this.AjAKKAM[n2] = (fArray2[n2] - fArray[n2]) * this.AjaKKAM + (fArray3[n2] - fArray2[n2]) * this.ajaKKAM;
                    this.ajAKKAM[n2] = (fArray4[n2] - fArray3[n2]) * this.AJaKKAM + (fArray3[n2] - fArray2[n2]) * this.aJaKKAM;
                    ++n2;
                }
                return;
            }
            case 2: {
                int n3 = 0;
                while (n3 < this.aJAkKAM) {
                    ++n3;
                }
                break;
            }
        }
    }

    void AKKamAJ() {
        int n;
        int n2;
        int n3 = 0;
        while (n3 < this.AjakKAM.length) {
            majjmma majjmma2 = this.AjakKAM[n3];
            majjmma2.maJaKKA = new kajjkkk[this.aJAkKAM];
            majjmma2.MAJaKKA = new kajjkkk[this.aJAkKAM];
            n2 = 0;
            while (n2 < this.aJAkKAM) {
                majjmma2.maJaKKA[n2] = new kajjkkk();
                majjmma2.MAJaKKA[n2] = new kajjkkk();
                ++n2;
            }
            ++n3;
        }
        int n4 = this.AjakKAM.length - 1;
        n2 = 1;
        while (n2 < n4) {
            n = 0;
            while (n < this.aJAkKAM) {
                this.AKkamAJ(this.AjakKAM[n2 - 1], this.AjakKAM[n2], this.AjakKAM[n2 + 1], n);
                ++n;
            }
            ++n2;
        }
        n = 0;
        while (n < this.aJAkKAM) {
            this.AKkamAJ(null, this.AjakKAM[0], this.AjakKAM[1], n);
            this.AKkamAJ(this.AjakKAM[0], this.AjakKAM[n4], null, n);
            ++n;
        }
    }

    void AKkamAJ(majjmma majjmma2, majjmma majjmma3, majjmma majjmma4, int n) {
        kajjkkk kajjkkk2 = null;
        kajjkkk kajjkkk3 = null;
        kajjkkk kajjkkk4 = new kajjkkk();
        kajjkkk kajjkkk5 = new kajjkkk();
        kajjkkk kajjkkk6 = new kajjkkk(majjmma3.MaJaKKA[n]);
        kajjkkk kajjkkk7 = new kajjkkk(majjmma3.MaJaKKA[n]);
        kajjkkk7.AKKAMAj();
        kajjkkk kajjkkk8 = null;
        kajjkkk kajjkkk9 = null;
        kajjkkk kajjkkk10 = null;
        kajjkkk kajjkkk11 = null;
        if (majjmma2 != null) {
            kajjkkk8 = new kajjkkk(majjmma2.MaJaKKA[n]);
            kajjkkk9 = new kajjkkk(majjmma2.MaJaKKA[n]);
            kajjkkk9.AKKAMAj();
            if ((double)Math.abs(kajjkkk6.ajAKKAm - kajjkkk8.ajAKKAm) > 6.283175307179587) {
                kajjkkk3 = new kajjkkk(kajjkkk6);
                kajjkkk3.ajAKKAm = 0.0f;
                kajjkkk3.aKkaMAj();
            } else {
                kajjkkk kajjkkk12 = new kajjkkk(kajjkkk9);
                if (kajjkkk12.AkkamAj(kajjkkk7) < 0.0f) {
                    kajjkkk12.AKKAmAj();
                }
                kajjkkk3 = new kajjkkk(kajjkkk12);
                kajjkkk3.aKKAMAj(kajjkkk7);
            }
        }
        if (majjmma4 != null) {
            kajjkkk10 = new kajjkkk(majjmma4.MaJaKKA[n]);
            kajjkkk11 = new kajjkkk(majjmma4.MaJaKKA[n]);
            kajjkkk11.AKKAMAj();
            if ((double)Math.abs(kajjkkk10.ajAKKAm - kajjkkk6.ajAKKAm) > 6.283175307179587) {
                kajjkkk2 = new kajjkkk(kajjkkk10);
                kajjkkk2.ajAKKAm = 0.0f;
                kajjkkk2.aKkaMAj();
            } else {
                kajjkkk kajjkkk13 = new kajjkkk(kajjkkk11);
                if (kajjkkk13.AkkamAj(kajjkkk7) < 0.0f) {
                    kajjkkk13.AKKAmAj();
                }
                kajjkkk2 = new kajjkkk(kajjkkk7);
                kajjkkk2.aKKAMAj(kajjkkk13);
            }
        }
        if (majjmma2 == null) {
            kajjkkk3 = new kajjkkk(kajjkkk2);
        }
        if (majjmma4 == null) {
            kajjkkk2 = new kajjkkk(kajjkkk3);
        }
        float f = 1.0f;
        float f2 = 1.0f;
        float f3 = 1.0f - majjmma3.mAJAkkA;
        if (majjmma2 != null && majjmma4 != null) {
            float f4 = 0.5f * (majjmma4.MaJAkkA - majjmma2.MaJAkkA);
            f2 = (majjmma3.MaJAkkA - majjmma2.MaJAkkA) / f4;
            f = (majjmma4.MaJAkkA - majjmma3.MaJAkkA) / f4;
            float f5 = Math.abs(majjmma3.mAJAkkA);
            f2 = f2 + f5 - f5 * f2;
            f = f + f5 - f5 * f;
        }
        float f6 = 0.5f * (1.0f - majjmma3.maJAkkA);
        float f7 = 2.0f - f3;
        float f8 = 1.0f - majjmma3.MAJAkkA;
        float f9 = 2.0f - f8;
        float f10 = f6 * f3;
        float f11 = f6 * f7;
        float f12 = 1.0f - f10 * f9 * f2;
        float f13 = -f11 * f8 * f2;
        float f14 = f11 * f9 * f;
        float f15 = f10 * f8 * f - 1.0f;
        kajjkkk4.AJakKAm = 0.5f * (f14 * kajjkkk3.AJakKAm + f15 * kajjkkk2.AJakKAm);
        kajjkkk5.AJakKAm = 0.5f * (f12 * kajjkkk3.AJakKAm + f13 * kajjkkk2.AJakKAm);
        kajjkkk4.aJakKAm = 0.5f * (f14 * kajjkkk3.aJakKAm + f15 * kajjkkk2.aJakKAm);
        kajjkkk5.aJakKAm = 0.5f * (f12 * kajjkkk3.aJakKAm + f13 * kajjkkk2.aJakKAm);
        kajjkkk4.AjAKKAm = 0.5f * (f14 * kajjkkk3.AjAKKAm + f15 * kajjkkk2.AjAKKAm);
        kajjkkk5.AjAKKAm = 0.5f * (f12 * kajjkkk3.AjAKKAm + f13 * kajjkkk2.AjAKKAm);
        kajjkkk4.ajAKKAm = 0.5f * (f14 * kajjkkk3.ajAKKAm + f15 * kajjkkk2.ajAKKAm);
        kajjkkk5.ajAKKAm = 0.5f * (f12 * kajjkkk3.ajAKKAm + f13 * kajjkkk2.ajAKKAm);
        kajjkkk kajjkkk14 = new kajjkkk(kajjkkk4);
        kajjkkk14.akKAMAj();
        kajjkkk kajjkkk15 = new kajjkkk(kajjkkk5);
        kajjkkk15.akKAMAj();
        kajjkkk kajjkkk16 = majjmma3.maJaKKA[n];
        kajjkkk kajjkkk17 = majjmma3.MAJaKKA[n];
        kajjkkk16.aKkAMAj(kajjkkk7);
        kajjkkk16.AkkaMAj(kajjkkk14);
        kajjkkk17.aKkAMAj(kajjkkk7);
        kajjkkk17.AkkaMAj(kajjkkk15);
    }

    public void aKKamAJ(float f) {
        if (this.AJAKkaM == 0) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > this.aJakKAM) {
                f = this.aJakKAM;
            }
        } else if ((this.AJAKkaM == 1 || this.AJAKkaM == 2) && (f %= this.aJakKAM) < 0.0f) {
            f += this.aJakKAM;
        }
        majjmma majjmma2 = this.akkamAJ(this.AJAkKAM);
        majjmma majjmma3 = this.akkamAJ(this.AJAkKAM + 1);
        int n = this.AJAkKAM;
        while (f < majjmma2.MaJAkkA && n > 0) {
            majjmma2 = this.akkamAJ(--n);
            majjmma3 = this.akkamAJ(n + 1);
        }
        while (f >= majjmma3.MaJAkkA && n < this.AjakKAM.length - 2) {
            majjmma2 = this.akkamAJ(++n);
            majjmma3 = this.akkamAJ(n + 1);
        }
        if (n != this.AJAkKAM) {
            this.AkkamAJ(n);
        }
        float f2 = (f - majjmma2.MaJAkkA) / (majjmma3.MaJAkkA - majjmma2.MaJAkkA);
        float f3 = f2 * f2;
        float f4 = f3 * f2;
        float f5 = 2.0f * f4 - 3.0f * f3 + 1.0f;
        float f6 = -2.0f * f4 + 3.0f * f3;
        float f7 = f4 - 2.0f * f3 + f2;
        float f8 = f4 - f3;
        int n2 = this.aJAkKAM;
        switch (this.AJaKkaM) {
            case 0: {
                float[] fArray = this.AjAKKAM;
                float[] fArray2 = this.ajAKKAM;
                float[] fArray3 = majjmma2.MAjAkkA;
                float[] fArray4 = majjmma3.MAjAkkA;
                float[] fArray5 = this.AjAkkAM;
                int n3 = 0;
                while (n3 < n2) {
                    fArray5[n3] = fArray3[n3] * f5 + fArray4[n3] * f6 + fArray[n3] * f7 + fArray2[n3] * f8;
                    ++n3;
                }
                return;
            }
            case 2: {
                float f9 = (1.0f - f2) * 2.0f * f2;
                int n4 = 0;
                while (n4 < n2) {
                    kajjkkk kajjkkk2;
                    kajjkkk kajjkkk3;
                    kajjkkk kajjkkk4 = new kajjkkk(majjmma2.MaJaKKA[n4]);
                    kajjkkk4.AKKAMAj();
                    kajjkkk kajjkkk5 = new kajjkkk(majjmma3.MaJaKKA[n4]);
                    kajjkkk5.AKKAMAj();
                    float f10 = majjmma3.MaJaKKA[n4].ajAKKAm - majjmma2.MaJaKKA[n4].ajAKKAm;
                    float f11 = f10 > 0.0f ? (float)Math.floor((double)f10 / (Math.PI * 2)) : (float)Math.ceil((double)f10 / (Math.PI * 2));
                    f10 -= (float)Math.PI * 2 * f11;
                    kajjkkk kajjkkk6 = new kajjkkk();
                    if ((double)Math.abs(f10) > Math.PI) {
                        kajjkkk3 = new kajjkkk();
                        kajjkkk3.akkAMAj(kajjkkk4, kajjkkk5, f2, f11);
                        kajjkkk2 = new kajjkkk();
                        kajjkkk2.akkAMAj(majjmma2.MAJaKKA[n4], majjmma3.maJaKKA[n4], f2, f11);
                        kajjkkk6.akkAMAj(kajjkkk3, kajjkkk2, f9, 0.0f);
                    } else {
                        kajjkkk3 = new kajjkkk();
                        kajjkkk3.akKamAj(kajjkkk4, kajjkkk5, f2, f11);
                        kajjkkk2 = new kajjkkk();
                        kajjkkk2.akKamAj(majjmma2.MAJaKKA[n4], majjmma3.maJaKKA[n4], f2, f11);
                        kajjkkk6.akKamAj(kajjkkk3, kajjkkk2, f9, 0.0f);
                    }
                    this.AJAkkAM[n4].aKkAMAj(kajjkkk6);
                    ++n4;
                }
                return;
            }
        }
    }
}

