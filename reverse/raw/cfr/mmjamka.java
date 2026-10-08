/*
 * Decompiled with CFR 0.152.
 */
public class mmjamka {
    boolean KaMaJAk;
    boolean kaMaJAk;
    int KAMaJAk;
    float kAMaJAk;
    int KamaJAk;
    int kamaJAk;
    mmajkka KAmaJAk;
    int kAmaJAk;
    int KaMAJAk;
    int kaMAJAk;
    int KAMAJAk;
    static final float kAMAJAk = 1.5258789E-5f;
    static final int KamAJAk = 0;

    /*
     * Exception decompiling
     */
    public mmjamka(mmajkka var1_1, int var2_2, int var3_3) {
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

    public void KAmaJAk(int n) {
        this.KAMaJAk = n;
    }

    public void KAmAjak(float f) {
        this.kAMaJAk = f;
    }

    public void kamaJAk(boolean bl) {
        this.KaMaJAk = bl;
    }

    public void KaMaJAk(kajjkka kajjkka2) {
        int n = this.kAMaJAk(kajjkka2.amAJAkk.kaMAjAK * 1.5258789E-5f, kajjkka2.amAJAkk.KAMAjAK * 1.5258789E-5f);
        int n2 = this.kAMaJAk(kajjkka2.AMAJAkk.kaMAjAK * 1.5258789E-5f, kajjkka2.AMAJAkk.KAMAjAK * 1.5258789E-5f);
        int n3 = this.kAMaJAk(kajjkka2.aMAJAkk.kaMAjAK * 1.5258789E-5f, kajjkka2.aMAJAkk.KAMAjAK * 1.5258789E-5f);
        this.kaMaJAk(n, n2, kajjkka2.amAJAkk.kaMAjAK * 1.5258789E-5f, kajjkka2.amAJAkk.KAMAjAK * 1.5258789E-5f, kajjkka2.AMAJAkk.kaMAjAK * 1.5258789E-5f, kajjkka2.AMAJAkk.KAMAjAK * 1.5258789E-5f, kajjkka2.amAJAkk.KaMAjAK);
        this.kaMaJAk(n2, n3, kajjkka2.AMAJAkk.kaMAjAK * 1.5258789E-5f, kajjkka2.AMAJAkk.KAMAjAK * 1.5258789E-5f, kajjkka2.aMAJAkk.kaMAjAK * 1.5258789E-5f, kajjkka2.aMAJAkk.KAMAjAK * 1.5258789E-5f, kajjkka2.AMAJAkk.KaMAjAK);
        this.kaMaJAk(n3, n, kajjkka2.aMAJAkk.kaMAjAK * 1.5258789E-5f, kajjkka2.aMAJAkk.KAMAjAK * 1.5258789E-5f, kajjkka2.amAJAkk.kaMAjAK * 1.5258789E-5f, kajjkka2.amAJAkk.KAMAjAK * 1.5258789E-5f, kajjkka2.aMAJAkk.KaMAjAK);
    }

    int kAMaJAk(float f, float f2) {
        int n = 0;
        if (f2 > (float)this.KAMAJAk) {
            n |= 8;
        } else if (f2 < (float)this.kaMAJAk) {
            n |= 4;
        }
        if (f > (float)this.KaMAJAk) {
            n |= 2;
        } else if (f < (float)this.kAmaJAk) {
            n |= 1;
        }
        return n;
    }

    void kaMaJAk(int n, int n2, float f, float f2, float f3, float f4, float f5) {
        if ((n & n2) == 0) {
            float f6 = f;
            float f7 = f2;
            float f8 = f3;
            float f9 = f4;
            boolean bl = false;
            if ((n | n2) != 0) {
                if ((n & 8) == 8) {
                    f6 = f + (f3 - f) * ((float)this.KAMAJAk - f2) / (f4 - f2);
                    f7 = this.KAMAJAk;
                    bl = true;
                } else if ((n & 4) == 4) {
                    f6 = f + (f3 - f) * ((float)this.kaMAJAk - f2) / (f4 - f2);
                    f7 = this.kaMAJAk;
                    bl = true;
                }
                if ((n & 2) == 2) {
                    if (!bl) {
                        f7 = f2 + (f4 - f2) * ((float)this.KaMAJAk - f) / (f3 - f);
                    }
                    f6 = this.KaMAJAk;
                } else if ((n & 1) == 1) {
                    if (!bl) {
                        f7 = f2 + (f4 - f2) * ((float)this.kAmaJAk - f) / (f3 - f);
                    }
                    f6 = this.kAmaJAk;
                }
                f = f8;
                f2 = f9;
                f3 = f6;
                f4 = f7;
                bl = false;
                if ((n2 & 8) == 8) {
                    f8 = f + (f3 - f) * ((float)this.KAMAJAk - f2) / (f4 - f2);
                    f9 = this.KAMAJAk;
                    bl = true;
                } else if ((n2 & 4) == 4) {
                    f8 = f + (f3 - f) * ((float)this.kaMAJAk - f2) / (f4 - f2);
                    f9 = this.kaMAJAk;
                    bl = true;
                }
                if ((n2 & 2) == 2) {
                    if (!bl) {
                        f9 = f2 + (f4 - f2) * ((float)this.KaMAJAk - f) / (f3 - f);
                    }
                    f8 = this.KaMAJAk;
                } else if ((n2 & 1) == 1) {
                    if (!bl) {
                        f9 = f2 + (f4 - f2) * ((float)this.kAmaJAk - f) / (f3 - f);
                    }
                    f8 = this.kAmaJAk;
                }
            }
            if (this.KaMaJAk) {
                this.KamaJAk(f6, f7, f8, f9, this.KAMaJAk, 32, 5);
                return;
            }
            if (this.kaMaJAk) {
                this.kamAjak(f6, f7, f8, f9, (int)(this.kAMaJAk * f5), 32, 5);
                return;
            }
            this.KamAjak(f6, f7, f8, f9, (int)(this.kAMaJAk * f5), 32, 5);
        }
    }

    void kAmAjak(int n, int n2, float f, float f2, float f3, float f4, float f5) {
        if ((n & n2) == 0) {
            float f6 = f;
            float f7 = f2;
            float f8 = f3;
            float f9 = f4;
            boolean bl = false;
            if ((n | n2) != 0) {
                if ((n & 8) == 8) {
                    f6 = f + (f3 - f) * ((float)this.KAMAJAk - f2) / (f4 - f2);
                    f7 = this.KAMAJAk;
                    bl = true;
                } else if ((n & 4) == 4) {
                    f6 = f + (f3 - f) * ((float)this.kaMAJAk - f2) / (f4 - f2);
                    f7 = this.kaMAJAk;
                    bl = true;
                }
                if ((n & 2) == 2) {
                    if (!bl) {
                        f7 = f2 + (f4 - f2) * ((float)this.KaMAJAk - f) / (f3 - f);
                    }
                    f6 = this.KaMAJAk;
                } else if ((n & 1) == 1) {
                    if (!bl) {
                        f7 = f2 + (f4 - f2) * ((float)this.kAmaJAk - f) / (f3 - f);
                    }
                    f6 = this.kAmaJAk;
                }
                f = f8;
                f2 = f9;
                f3 = f6;
                f4 = f7;
                bl = false;
                if ((n2 & 8) == 8) {
                    f8 = f + (f3 - f) * ((float)this.KAMAJAk - f2) / (f4 - f2);
                    f9 = this.KAMAJAk;
                    bl = true;
                } else if ((n2 & 4) == 4) {
                    f8 = f + (f3 - f) * ((float)this.kaMAJAk - f2) / (f4 - f2);
                    f9 = this.kaMAJAk;
                    bl = true;
                }
                if ((n2 & 2) == 2) {
                    if (!bl) {
                        f9 = f2 + (f4 - f2) * ((float)this.KaMAJAk - f) / (f3 - f);
                    }
                    f8 = this.KaMAJAk;
                } else if ((n2 & 1) == 1) {
                    if (!bl) {
                        f9 = f2 + (f4 - f2) * ((float)this.kAmaJAk - f) / (f3 - f);
                    }
                    f8 = this.kAmaJAk;
                }
                this.KamAjak(f6, f7, f8, f9, -((int)(5.0 * (double)f5)), 32, 5);
            }
        }
    }

    void KAMaJAk(int n, int n2, int n3) {
        n3 += 255;
        try {
            this.KAmaJAk.AMAjakk[n2 * this.KamaJAk + n] = n3 & 0xFF;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    void KamAjak(float var1_1, float var2_2, float var3_3, float var4_4, int var5_5, int var6_6, int var7_7) {
        block28: {
            var8_8 = this.KAmaJAk.AMAjakk;
            if (var2_2 > var4_4) {
                var14_9 = var2_2;
                var2_2 = var4_4;
                var4_4 = var14_9;
                var14_9 = var1_1;
                var1_1 = var3_3;
                var3_3 = var14_9;
            }
            try {
                var8_8[(int)var2_2 * this.KamaJAk + (int)var1_1] = var5_5 & 255;
            }
            catch (Exception v0) {}
            var12_10 = var3_3 - var1_1;
            if (v1 >= 0.0f) {
                var15_11 = 1;
            } else {
                var15_11 = -1;
                var12_10 = -var12_10;
            }
            var13_12 = var4_4 - var2_2;
            if (var13_12 != 0.0f) break block28;
            if (true) ** GOTO lbl28
            do {
                var1_1 += (float)var15_11;
                try {
                    var8_8[(int)var2_2 * this.KamaJAk + (int)var1_1] = var5_5 & 255;
                }
                catch (Exception v2) {}
lbl28:
                // 3 sources

                v3 = var12_10;
                var12_10 = v3 - 1.0f;
            } while (v3 > 0.0f);
            return;
        }
        if (var12_10 == 0.0f) {
            do {
                var2_2 += 1.0f;
                try {
                    var8_8[(int)var2_2 * this.KamaJAk + (int)var1_1] = var5_5 & 255;
                }
                catch (Exception v4) {}
            } while ((var13_12 -= 1.0f) > 0.0f);
            return;
        }
        if (var12_10 == var13_12) {
            do {
                var1_1 += (float)var15_11;
                var2_2 += 1.0f;
                try {
                    var8_8[(int)var2_2 * this.KamaJAk + (int)var1_1] = var5_5 & 255;
                }
                catch (Exception v5) {}
            } while ((var13_12 -= 1.0f) > 0.0f);
            return;
        }
        var18_13 = 0;
        var9_14 = 16 - var7_7;
        var11_15 = var6_6 - 1;
        if (var13_12 > var12_10) {
            var17_16 = (int)((float)((int)var12_10 << 16) / var13_12);
            var19_18 = var12_10 / var13_12;
            var21_20 = var1_1 + var19_18 * ((float)((int)((double)var2_2 + 0.5)) - var2_2) + var19_18;
            if (var15_11 < 0) {
                var19_18 = -var19_18;
            }
            while ((var13_12 -= 1.0f) > 0.0f) {
                var16_23 = var18_13;
                var18_13 += var17_16;
                var2_2 += 1.0f;
                var10_21 = (var18_13 &= 65535) >> var9_14;
                try {
                    var8_8[(int)var2_2 * this.KamaJAk + (int)var21_20] = var5_5 + var10_21 & 255;
                    var8_8[((int)var2_2 + var15_11) * this.KamaJAk + (int)var21_20] = var5_5 + (var10_21 ^ var11_15) & 255;
                }
                catch (Exception v6) {}
                var21_20 += var19_18;
            }
            try {
                var8_8[(int)var4_4 * this.KamaJAk + (int)var3_3] = var5_5 & 255;
                return;
            }
            catch (Exception v7) {
                return;
            }
        }
        var17_17 = (int)((float)((int)var13_12 << 16) / var12_10);
        var19_19 = var13_12 / var12_10;
        var20_25 = var2_2 + var19_19 * ((float)((int)((double)var1_1 + 0.5)) - var1_1) + var19_19;
        while ((var12_10 -= 1.0f) > 0.0f) {
            var16_24 = var18_13;
            var18_13 += var17_17;
            var1_1 += (float)var15_11;
            var10_22 = (var18_13 &= 65535) >> var9_14;
            try {
                var8_8[(int)var20_25 * this.KamaJAk + (int)var1_1] = var5_5 + var10_22 & 255;
                var8_8[((int)var20_25 + 1) * this.KamaJAk + (int)var1_1] = var5_5 + (var10_22 ^ var11_15) & 255;
            }
            catch (Exception v8) {}
            var20_25 += var19_19;
        }
        try {
            var8_8[(int)var4_4 * this.KamaJAk + (int)var3_3] = var5_5 & 255;
            return;
        }
        catch (Exception v9) {
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    void kamAjak(float var1_1, float var2_2, float var3_3, float var4_4, int var5_5, int var6_6, int var7_7) {
        block28: {
            var8_8 = this.KAmaJAk.AMAjakk;
            if (var2_2 > var4_4) {
                var14_9 = var2_2;
                var2_2 = var4_4;
                var4_4 = var14_9;
                var14_9 = var1_1;
                var1_1 = var3_3;
                var3_3 = var14_9;
            }
            try {
                var8_8[(int)var2_2 * this.KamaJAk + (int)var1_1] = (var5_5 & 255) << 20 | (var5_5 & 255) << 10 | var5_5 & 255;
            }
            catch (Exception v0) {}
            var12_10 = var3_3 - var1_1;
            if (v1 >= 0.0f) {
                var15_11 = 1;
            } else {
                var15_11 = -1;
                var12_10 = -var12_10;
            }
            var13_12 = var4_4 - var2_2;
            if (var13_12 != 0.0f) break block28;
            if (true) ** GOTO lbl28
            do {
                var1_1 += (float)var15_11;
                try {
                    var8_8[(int)var2_2 * this.KamaJAk + (int)var1_1] = (var5_5 & 255) << 20 | (var5_5 & 255) << 10 | var5_5 & 255;
                }
                catch (Exception v2) {}
lbl28:
                // 3 sources

                v3 = var12_10;
                var12_10 = v3 - 1.0f;
            } while (v3 > 0.0f);
            return;
        }
        if (var12_10 == 0.0f) {
            do {
                var2_2 += 1.0f;
                try {
                    var8_8[(int)var2_2 * this.KamaJAk + (int)var1_1] = (var5_5 & 255) << 20 | (var5_5 & 255) << 10 | var5_5 & 255;
                }
                catch (Exception v4) {}
            } while ((var13_12 -= 1.0f) > 0.0f);
            return;
        }
        if (var12_10 == var13_12) {
            do {
                var1_1 += (float)var15_11;
                var2_2 += 1.0f;
                try {
                    var8_8[(int)var2_2 * this.KamaJAk + (int)var1_1] = (var5_5 & 255) << 20 | (var5_5 & 255) << 10 | var5_5 & 255;
                }
                catch (Exception v5) {}
            } while ((var13_12 -= 1.0f) > 0.0f);
            return;
        }
        var18_13 = 0;
        var9_14 = 16 - var7_7;
        var11_15 = var6_6 - 1;
        if (var13_12 > var12_10) {
            var17_16 = (int)((float)((int)var12_10 << 16) / var13_12);
            var19_18 = var12_10 / var13_12;
            var21_20 = var1_1 + var19_18 * ((float)((int)((double)var2_2 + 0.5)) - var2_2) + var19_18;
            if (var15_11 < 0) {
                var19_18 = -var19_18;
            }
            while ((var13_12 -= 1.0f) > 0.0f) {
                var16_23 = var18_13;
                var18_13 += var17_16;
                var2_2 += 1.0f;
                var10_21 = (var18_13 &= 65535) >> var9_14;
                try {
                    var22_25 = var5_5 + var10_21;
                    var8_8[(int)var2_2 * this.KamaJAk + (int)var21_20] = (var22_25 & 255) << 20 | (var22_25 & 255) << 10 | var22_25 & 255;
                    var22_25 = var5_5 + (var10_21 ^ var11_15);
                    var8_8[((int)var2_2 + var15_11) * this.KamaJAk + (int)var21_20] = (var22_25 & 255) << 20 | (var22_25 & 255) << 10 | var22_25 & 255;
                }
                catch (Exception v6) {}
                var21_20 += var19_18;
            }
            try {
                var8_8[(int)var4_4 * this.KamaJAk + (int)var3_3] = (var5_5 & 255) << 20 | (var5_5 & 255) << 10 | var5_5 & 255;
                return;
            }
            catch (Exception v7) {
                return;
            }
        }
        var17_17 = (int)((float)((int)var13_12 << 16) / var12_10);
        var19_19 = var13_12 / var12_10;
        var20_27 = var2_2 + var19_19 * ((float)((int)((double)var1_1 + 0.5)) - var1_1) + var19_19;
        while ((var12_10 -= 1.0f) > 0.0f) {
            var16_24 = var18_13;
            var18_13 += var17_17;
            var1_1 += (float)var15_11;
            var10_22 = (var18_13 &= 65535) >> var9_14;
            try {
                var22_26 = var5_5 + var10_22;
                var8_8[(int)var20_27 * this.KamaJAk + (int)var1_1] = (var22_26 & 255) << 20 | (var22_26 & 255) << 10 | var22_26 & 255;
                var22_26 = var5_5 + (var10_22 ^ var11_15);
                var8_8[((int)var20_27 + 1) * this.KamaJAk + (int)var1_1] = (var22_26 & 255) << 20 | (var22_26 & 255) << 10 | var22_26 & 255;
            }
            catch (Exception v8) {}
            var20_27 += var19_19;
        }
        try {
            var8_8[(int)var4_4 * this.KamaJAk + (int)var3_3] = (var5_5 & 255) << 20 | (var5_5 & 255) << 10 | var5_5 & 255;
            return;
        }
        catch (Exception v9) {
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    void KamaJAk(float var1_1, float var2_2, float var3_3, float var4_4, int var5_5, int var6_6, int var7_7) {
        block28: {
            var8_8 = this.KAmaJAk.AMAjakk;
            var10_9 = 0;
            var11_10 = 0;
            var12_11 = 0;
            var22_12 = (int)var2_2 * this.KamaJAk + (int)var1_1;
            var23_13 = 0;
            if (var2_2 > var4_4) {
                var17_14 = var2_2;
                var2_2 = var4_4;
                var4_4 = var17_14;
                var17_14 = var1_1;
                var1_1 = var3_3;
                var3_3 = var17_14;
            }
            try {
                var11_10 = var8_8[var22_12] + this.KAMaJAk;
                var12_11 = var11_10 & 0x10040100;
                var8_8[var22_12] = var11_10 - var12_11 | var12_11 - (var12_11 >> 8);
            }
            catch (Exception v0) {}
            var15_15 = var3_3 - var1_1;
            if (v1 >= 0.0f) {
                var18_16 = 1;
            } else {
                var18_16 = -1;
                var15_15 = -var15_15;
            }
            var16_17 = var4_4 - var2_2;
            if (var16_17 != 0.0f) break block28;
            var23_13 = var22_12;
            if (true) ** GOTO lbl38
            do {
                var23_13 += var18_16;
                try {
                    var11_10 = var8_8[var23_13] + this.KAMaJAk;
                    var12_11 = var11_10 & 0x10040100;
                    var8_8[var23_13] = var11_10 - var12_11 | var12_11 - (var12_11 >> 8);
                }
                catch (Exception v2) {}
lbl38:
                // 3 sources

                v3 = var15_15;
                var15_15 = v3 - 1.0f;
            } while (v3 > 0.0f);
            return;
        }
        if (var15_15 == 0.0f) {
            var23_13 = var22_12;
            do {
                var23_13 += this.KamaJAk;
                try {
                    var11_10 = var8_8[var23_13] + this.KAMaJAk;
                    var12_11 = var11_10 & 0x10040100;
                    var8_8[var23_13] = var11_10 - var12_11 | var12_11 - (var12_11 >> 8);
                }
                catch (Exception v4) {}
            } while ((var16_17 -= 1.0f) > 0.0f);
            return;
        }
        if (var15_15 == var16_17) {
            var23_13 = var22_12;
            do {
                var23_13 += this.KamaJAk + var18_16;
                try {
                    var11_10 = var8_8[var23_13] + this.KAMaJAk;
                    var12_11 = var11_10 & 0x10040100;
                    var8_8[var23_13] = var11_10 - var12_11 | var12_11 - (var12_11 >> 8);
                }
                catch (Exception v5) {}
            } while ((var16_17 -= 1.0f) > 0.0f);
            return;
        }
        var21_18 = 0;
        var9_19 = 16 - var7_7;
        var14_20 = var6_6 - 1;
        var27_21 = 0.0f;
        if (var16_17 > var15_15) {
            var20_22 = (int)((float)((int)var15_15 << 16) / var16_17);
            var24_24 = var15_15 / var16_17;
            var26_26 = var1_1 + var24_24 * ((float)((int)((double)var2_2 + 0.5)) - var2_2) + var24_24;
            var28_27 = this.KamaJAk;
            if (var18_16 < 0) {
                var24_24 = -var24_24;
                var28_27 = -this.KamaJAk;
            }
            var22_12 = (int)var2_2 * this.KamaJAk + (int)var26_26;
            var27_21 = (float)((int)var2_2 * this.KamaJAk) + var26_26;
            while ((var16_17 -= 1.0f) > 0.0f) {
                var19_31 = var21_18;
                var21_18 += var20_22;
                var2_2 += 1.0f;
                var27_21 += (float)this.KamaJAk;
                var13_29 = (var21_18 &= 65535) >> var9_19 & 255;
                var29_33 = (var13_29 ^ var14_20) & 255;
                try {
                    var10_9 = var13_29 << 20 | var13_29 << 10 | var13_29;
                    var11_10 = var8_8[(int)var27_21] + this.KAMaJAk;
                    var12_11 = var11_10 & 0x10040100;
                    var8_8[(int)var27_21] = var11_10 - var12_11 | var12_11 - (var12_11 >> 8);
                    var10_9 = var29_33 << 20 | var29_33 << 10 | var29_33;
                    var11_10 = var8_8[(int)var27_21 + var28_27] + this.KAMaJAk;
                    var12_11 = var11_10 & 0x10040100;
                    var8_8[(int)var27_21 + var28_27] = var11_10 - var12_11 | var12_11 - (var12_11 >> 8);
                }
                catch (Exception v6) {}
                var27_21 += var24_24;
            }
            try {
                var11_10 = var8_8[(int)var4_4 * this.KamaJAk + (int)var3_3] + this.KAMaJAk;
                var12_11 = var11_10 & 0x10040100;
                var8_8[(int)var4_4 * this.KamaJAk + (int)var3_3] = var11_10 - var12_11 | var12_11 - (var12_11 >> 8);
                return;
            }
            catch (Exception v7) {
                return;
            }
        }
        var20_23 = (int)((float)((int)var16_17 << 16) / var15_15);
        var24_25 = var16_17 / var15_15;
        var25_34 = var2_2 + var24_25 * ((float)((int)((double)var1_1 + 0.5)) - var1_1) + var24_25;
        var22_12 = (int)var25_34 * this.KamaJAk + (int)var1_1;
        var28_28 = 0;
        while ((var15_15 -= 1.0f) > 0.0f) {
            var19_32 = var21_18;
            var21_18 += var20_23;
            var27_21 = (int)var25_34 * this.KamaJAk + (int)(var1_1 += (float)var18_16);
            var27_21 += (float)var18_16;
            var13_30 = (var21_18 &= 65535) >> var9_19 & 255;
            var28_28 = (var13_30 ^ var14_20) & 255;
            try {
                var10_9 = (var13_30 << 20) + (var13_30 << 10) + var13_30;
                var11_10 = var8_8[(int)var27_21] + this.KAMaJAk;
                var12_11 = var11_10 & 0x10040100;
                var8_8[(int)var27_21] = var11_10 - var12_11 | var12_11 - (var12_11 >> 8);
                var10_9 = (var28_28 << 20) + (var28_28 << 10) + var28_28;
                var11_10 = var8_8[(int)var27_21 + this.KamaJAk] + this.KAMaJAk;
                var12_11 = var11_10 & 0x10040100;
                var8_8[(int)var27_21 + this.KamaJAk] = var11_10 - var12_11 | var12_11 - (var12_11 >> 8);
            }
            catch (Exception v8) {}
            var25_34 += var24_25;
        }
        try {
            var11_10 = var8_8[(int)var4_4 * this.KamaJAk + (int)var3_3] + this.KAMaJAk;
            var12_11 = var11_10 & 0x10040100;
            var8_8[(int)var4_4 * this.KamaJAk + (int)var3_3] = var11_10 - var12_11 | var12_11 - (var12_11 >> 8);
            return;
        }
        catch (Exception v9) {
            return;
        }
    }
}

