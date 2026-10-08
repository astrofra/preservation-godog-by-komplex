/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Image;
import java.awt.Point;
import java.awt.image.ColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

final class kmjjkka
implements ImageConsumer {
    int AMAjaKK;
    int aMAjaKK;
    int AmajaKK;
    byte[] amajaKK;
    int[] AMajaKK;
    ColorModel aMajaKK;
    kaajkkk AmAJaKK;
    private boolean amAJaKK;
    private boolean AMAJaKK;
    private int aMAJaKK;
    private ImageProducer AmaJaKK;
    private static int[][][] amaJaKK = new int[8][8][4];
    private static int[] AMaJaKK;
    private int aMaJaKK;
    private int[] AmAjAkk;

    /*
     * Exception decompiling
     */
    kmjjkka(ImageProducer var1_1, kaajkkk var2_2) {
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

    kmjjkka(Image image, kaajkkk kaajkkk2) {
        this(image.getSource(), kaajkkk2);
        image.flush();
    }

    kmjjkka(int[] nArray, int n, int n2, kaajkkk kaajkkk2) {
        super();
        this.AmAjAkk = new int[4];
        this.AMajaKK = nArray;
        this.AMAjaKK = n;
        this.aMAjaKK = n2;
        this.AmAJaKK = kaajkkk2;
        this.AmajaKK = 32;
    }

    kmjjkka(byte[] byArray, int n, int n2, kaajkkk kaajkkk2) {
        super();
        this.AmAjAkk = new int[4];
        this.amajaKK = byArray;
        this.AMAjaKK = n;
        this.aMAjaKK = n2;
        this.AmAJaKK = kaajkkk2;
        this.AmajaKK = 8;
    }

    /*
     * Unable to fully structure code
     */
    synchronized void AMaJaKK() {
        block8: {
            block7: {
                this.AMAJaKK = true;
                try {
                    try {
                        while (this.AMAJaKK && this.AmaJaKK != null) {
                            this.wait();
                        }
                    }
                    catch (InterruptedException v0) {
                        this.amajaKK = null;
                        this.AMajaKK = null;
                        this.aMAjaKK = 0;
                        this.AMAjaKK = 0;
                        this.amAJaKK = false;
                    }
                    var2_1 = null;
                    this.AMAJaKK = false;
                    this.AmaJaKK = null;
                    if (!this.amAJaKK || this.AMajaKK == null) break block7;
                    var3_3 = this.AMAjaKK * this.aMAjaKK;
                    ** while (var3_3 > 0)
                }
                catch (Throwable var1_5) {
                    var2_2 = null;
                    this.AMAJaKK = false;
                    this.AmaJaKK = null;
                    if (!this.amAJaKK || this.AMajaKK == null) break block8;
                    var3_4 = this.AMAjaKK * this.aMAjaKK;
                    ** while (var3_4 > 0)
                }
lbl-1000:
                // 1 sources

                {
                    v1 = --var3_3;
                    this.AMajaKK[v1] = this.AMajaKK[v1] | -16777216;
                    continue;
                }
            }
            return;
lbl-1000:
            // 1 sources

            {
                v2 = --var3_4;
                this.AMajaKK[v2] = this.AMajaKK[v2] | -16777216;
                continue;
            }
        }
        throw var1_5;
    }

    public synchronized void imageComplete(int n) {
        this.amAJaKK = n == 3;
        this.AMAJaKK = false;
        switch (n) {
            default: {
                this.aMAJaKK |= 0xC0;
                break;
            }
            case 4: {
                this.aMAJaKK |= 0x80;
                break;
            }
            case 3: {
                this.aMAJaKK |= 0x20;
                break;
            }
            case 2: {
                this.aMAJaKK |= 0x10;
            }
        }
        if (this.AmaJaKK != null) {
            this.AmaJaKK.removeConsumer(this);
        }
        this.AmaJaKK = null;
        this.notify();
    }

    public void setColorModel(ColorModel colorModel) {
        this.aMajaKK = colorModel;
    }

    public void setDimensions(int n, int n2) {
        this.AMAjaKK = n;
        this.aMAjaKK = n2;
    }

    public void setHints(int n) {
    }

    public void setPixels(int n, int n2, int n3, int n4, ColorModel colorModel, byte[] byArray, int n5, int n6) {
        if (this.amajaKK == null) {
            this.amajaKK = new byte[this.AMAjaKK * this.aMAjaKK];
            this.AmajaKK = 8;
        }
        System.arraycopy(byArray, n5, this.amajaKK, this.AMAjaKK * n2 + n, n6);
    }

    public void setPixels(int n, int n2, int n3, int n4, ColorModel colorModel, int[] nArray, int n5, int n6) {
        if (this.AMajaKK == null) {
            this.AMajaKK = new int[this.AMAjaKK * this.aMAjaKK];
            this.AmajaKK = 32;
        }
        System.arraycopy(nArray, n5, this.AMajaKK, this.AMAjaKK * n2 + n, n6);
    }

    public void setProperties(Hashtable hashtable) {
    }

    private static void AmaJaKK() {
        int n = 0;
        while (n < 8) {
            int n2 = 0;
            while (n2 < 8) {
                kmjjkka.amaJaKK[n][n2][0] = (8 - n) * (8 - n2);
                kmjjkka.amaJaKK[n][n2][1] = n * (8 - n2);
                kmjjkka.amaJaKK[n][n2][2] = (8 - n) * n2;
                kmjjkka.amaJaKK[n][n2][3] = n * n2;
                int n3 = 0;
                int n4 = 0;
                int n5 = 0;
                while (n5 <= 3) {
                    kmjjkka.amaJaKK[n][n2][n5] = (amaJaKK[n][n2][n5] + 4) / 8;
                    n4 += amaJaKK[n][n2][n5];
                    if (amaJaKK[n][n2][n5] > amaJaKK[n][n2][n3]) {
                        n3 = n5;
                    }
                    ++n5;
                }
                int n6 = 8 - n4;
                int[] nArray = amaJaKK[n][n2];
                int n7 = n3;
                nArray[n7] = nArray[n7] + n6;
                ++n2;
            }
            ++n;
        }
    }

    static int aMaJaKK(int n, int n2) {
        int n3 = n / n2;
        if (n < 0) {
            --n3;
        }
        return n - n3 * n2;
    }

    static int amaJaKK(int n, int n2) {
        int n3 = n / n2;
        if (n < 0) {
            --n3;
        }
        return n - n3 * n2;
    }

    private int AmAjAkk(int n, int n2, int n3) {
        if (n2 > 0) {
            while (n > n3) {
                n -= n3;
            }
            int n4 = (n3 - n + n2 - 1) / n2;
            if (this.aMaJaKK > n4) {
                this.aMaJaKK = n4;
            }
        } else if (n2 < 0) {
            while (n < 0) {
                n += n3;
            }
            int n5 = (n - n2 - 1) / -n2;
            if (this.aMaJaKK > n5) {
                this.aMaJaKK = n5;
            }
        }
        return n;
    }

    int aMAJaKK(int n, int n2) {
        if (n < 0) {
            n = 0;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n2 >= this.aMAjaKK) {
            n2 = this.aMAjaKK - 1;
        }
        if (n >= this.AMAjaKK) {
            n = this.AMAjaKK - 1;
        }
        int n3 = n2 * this.AMAjaKK;
        if (this.AmajaKK == 8) {
            return this.AmAJaKK.jaKKamA(this.amajaKK[n3 + n]);
        }
        return this.AMajaKK[n3 + n];
    }

    int AMAJaKK(int n, int n2) {
        int n3;
        int n4 = n >> 16;
        int n5 = n2 >> 16;
        int n6 = (n & 0xFFFF) >> 13;
        int n7 = (n2 & 0xFFFF) >> 13;
        this.AmAjAkk[0] = amaJaKK[n6][n7][0];
        this.AmAjAkk[1] = amaJaKK[n6][n7][1];
        this.AmAjAkk[2] = amaJaKK[n6][n7][2];
        this.AmAjAkk[3] = amaJaKK[n6][n7][3];
        if (n4 < 0) {
            n4 = 0;
            this.AmAjAkk[0] = this.AmAjAkk[0] + this.AmAjAkk[1];
            this.AmAjAkk[1] = 0;
            this.AmAjAkk[2] = this.AmAjAkk[2] + this.AmAjAkk[3];
            this.AmAjAkk[3] = 0;
        } else if (n4 >= this.AMAjaKK - 1) {
            n4 = this.AMAjaKK - 2;
            this.AmAjAkk[1] = this.AmAjAkk[1] + this.AmAjAkk[0];
            this.AmAjAkk[0] = 0;
            this.AmAjAkk[3] = this.AmAjAkk[3] + this.AmAjAkk[2];
            this.AmAjAkk[2] = 0;
        }
        if (n5 < 0) {
            n5 = 0;
            this.AmAjAkk[0] = this.AmAjAkk[0] + this.AmAjAkk[2];
            this.AmAjAkk[2] = 0;
            this.AmAjAkk[1] = this.AmAjAkk[1] + this.AmAjAkk[3];
            this.AmAjAkk[3] = 0;
        } else if (n5 >= this.aMAjaKK - 1) {
            n5 = this.aMAjaKK - 2;
            this.AmAjAkk[2] = this.AmAjAkk[2] + this.AmAjAkk[0];
            this.AmAjAkk[0] = 0;
            this.AmAjAkk[3] = this.AmAjAkk[3] + this.AmAjAkk[1];
            this.AmAjAkk[1] = 0;
        }
        long l = 0L;
        int n8 = n5 * this.AMAjaKK;
        if (this.AmajaKK != 8) {
            n3 = n8 + n4;
            int n9 = this.AMajaKK[n3];
            l = (long)((n9 & 0xFF0000) << 5 | (n9 & 0xFF00) << 2 | (n9 & 0xFF) >>> 1) * (long)this.AmAjAkk[0];
            n9 = this.AMajaKK[n3 + 1];
            l += (long)((n9 & 0xFF0000) << 5 | (n9 & 0xFF00) << 2 | (n9 & 0xFF) >>> 1) * (long)this.AmAjAkk[1];
            n9 = this.AMajaKK[n3 += this.AMAjaKK];
            l += (long)((n9 & 0xFF0000) << 5 | (n9 & 0xFF00) << 2 | (n9 & 0xFF) >>> 1) * (long)this.AmAjAkk[2];
            n9 = this.AMajaKK[n3 + 1];
            l += (long)((n9 & 0xFF0000) << 5 | (n9 & 0xFF00) << 2 | (n9 & 0xFF) >>> 1) * (long)this.AmAjAkk[3];
        }
        n3 = (int)l;
        return n3 >>> 8 & 0xFF0000 | n3 >>> 5 & 0xFF00 | n3 >>> 2 & 0xFF;
    }

    /*
     * Unable to fully structure code
     */
    void aMajaKK(kaaammk var1_1, Point var2_2, int var3_3, byte[] var4_4, int var5_5) {
        if (var1_1.Ajakkam != 0) ** GOTO lbl17
        var6_6 = (var2_2.y >> 16) * this.AMAjaKK;
        if (Math.abs(var1_1.aJAkkam - 65536) >= 256) ** GOTO lbl12
        var6_6 += var2_2.x >> 16;
        var2_2.x += var3_3 * var1_1.aJAkkam;
        while (var3_3-- > 0) {
            var4_4[var5_5++] = (byte)this.AmAJaKK.JaKKamA(this.AMajaKK[var6_6++]);
        }
        return;
lbl-1000:
        // 1 sources

        {
            var4_4[var5_5++] = (byte)this.AmAJaKK.JaKKamA(this.AMajaKK[var6_6 + (var2_2.x >> 16)]);
            var2_2.x += var1_1.aJAkkam;
lbl12:
            // 2 sources

            ** while (var3_3-- > 0)
        }
lbl13:
        // 1 sources

        return;
lbl-1000:
        // 1 sources

        {
            var4_4[var5_5++] = (byte)this.AmAJaKK.JaKKamA(this.AMajaKK[(var2_2.y >> 16) * this.AMAjaKK + (var2_2.x >> 16)]);
            var2_2.x += var1_1.aJAkkam;
            var2_2.y += var1_1.Ajakkam;
lbl17:
            // 2 sources

            ** while (var3_3-- > 0)
        }
lbl18:
        // 1 sources

    }

    /*
     * Unable to fully structure code
     */
    void amAJaKK(kaaammk var1_1, Point var2_2, int var3_3, int[] var4_4, int var5_5) {
        if (var1_1.Ajakkam != 0) ** GOTO lbl17
        var6_6 = (var2_2.y >> 16) * this.AMAjaKK;
        if (Math.abs(var1_1.aJAkkam - 65536) >= 256) ** GOTO lbl12
        var6_6 += var2_2.x >> 16;
        var2_2.x += var3_3 * var1_1.aJAkkam;
        while (var3_3-- > 0) {
            var4_4[var5_5++] = this.AMajaKK[var6_6++];
        }
        return;
lbl-1000:
        // 1 sources

        {
            var4_4[var5_5++] = this.AMajaKK[var6_6 + (var2_2.x >> 16)];
            var2_2.x += var1_1.aJAkkam;
lbl12:
            // 2 sources

            ** while (var3_3-- > 0)
        }
lbl13:
        // 1 sources

        return;
lbl-1000:
        // 1 sources

        {
            var4_4[var5_5++] = this.AMajaKK[(var2_2.y >> 16) * this.AMAjaKK + (var2_2.x >> 16)];
            var2_2.x += var1_1.aJAkkam;
            var2_2.y += var1_1.Ajakkam;
lbl17:
            // 2 sources

            ** while (var3_3-- > 0)
        }
lbl18:
        // 1 sources

    }

    private void AmAJaKK(kaaammk kaaammk2, Point point, int n, int[] nArray) {
        int n2 = 0;
        if (kaaammk2.Ajakkam == 0) {
            int n3 = (point.y >> 16) * this.AMAjaKK;
            int n4 = n;
            while (n4 > 0) {
                nArray[n2] = this.AMajaKK[n3 + (point.x >> 16)];
                ++n2;
                point.x += kaaammk2.aJAkkam;
                --n4;
            }
            return;
        }
        int n5 = n;
        while (n5 > 0) {
            nArray[n2] = this.AMajaKK[(point.y >> 16) * this.AMAjaKK + (point.x >> 16)];
            ++n2;
            point.x += kaaammk2.aJAkkam;
            point.y += kaaammk2.Ajakkam;
            --n5;
        }
    }

    /*
     * Unable to fully structure code
     */
    void AMajaKK(int var1_1, int var2_2, int var3_3, kaaammk var4_4) {
        var5_5 = new Point(0, 0);
        var6_6 = this.AmAJaKK.MAJakkA;
        var7_7 = this.AmAJaKK.mAJakkA;
        var5_5.x = var2_2 << 16;
        var5_5.y = this.AmAJaKK.majAkkA << 16;
        var4_4.ajaKKam.akKaMaj(var5_5, var5_5);
        var8_8 = this.AMAjaKK << 16;
        var9_9 = this.aMAjaKK << 16;
        if (var4_4.ajakKam == 65) {
            var13_10 = this.AMAjaKK;
            var14_11 = this.aMAjaKK;
            if (var4_4.ajAkkam) {
                --var14_11;
                --var13_10;
            }
            var15_12 = new Point(0, 0);
            var16_13 = var3_3 - var2_2;
            var15_12.x = var5_5.x + var4_4.aJAkkam * var16_13;
            var15_12.y = var5_5.y + var4_4.Ajakkam * var16_13;
            while (true) {
                var10_14 = var5_5.x >> 16;
                var11_15 = var5_5.y >> 16;
                if (var10_14 >= 0 && var11_15 >= 0 && var10_14 < var13_10 && var11_15 < var14_11 || var2_2 >= var3_3) break;
                var12_16 = var4_4.ajAkkam != false ? this.AMAJaKK(var5_5.x, var5_5.y) : this.aMAJaKK(var10_14, var11_15);
                if (var4_4.aJaKKam != null) {
                    var12_16 = var4_4.aJaKKam.KkamAJA(var12_16);
                }
                if (var6_6 != null) {
                    var6_6[var2_2 + var1_1] = (byte)this.AmAJaKK.JaKKamA(var12_16);
                } else {
                    var7_7[var2_2 + var1_1] = var12_16;
                }
                var5_5.x += var4_4.aJAkkam;
                var5_5.y += var4_4.Ajakkam;
                ++var2_2;
            }
            while (true) {
                var10_14 = var15_12.x >> 16;
                var11_15 = var15_12.y >> 16;
                if ((var10_14 < 0 || var11_15 < 0 || var10_14 >= var13_10 || var11_15 >= var14_11) && var2_2 < var3_3) {
                    var12_16 = var4_4.ajAkkam != false ? this.AMAJaKK(var15_12.x, var15_12.y) : this.aMAJaKK(var10_14, var11_15);
                    --var3_3;
                    if (var4_4.aJaKKam != null) {
                        var12_16 = var4_4.aJaKKam.KkamAJA(var12_16);
                    }
                    if (var6_6 != null) {
                        var6_6[var3_3 + var1_1] = (byte)var12_16;
                    } else {
                        var7_7[var3_3 + var1_1] = var12_16;
                    }
                    var15_12.x -= var4_4.aJAkkam;
                    var15_12.y -= var4_4.Ajakkam;
                    continue;
                }
                break;
            }
        } else {
            var5_5.x = kmjjkka.aMaJaKK(var5_5.x, var8_8);
            var5_5.y = kmjjkka.aMaJaKK(var5_5.y, var9_9);
        }
        if (!var4_4.AJAkkam) ** GOTO lbl94
        while (var2_2 < var3_3) {
            this.aMaJaKK = Math.min(var3_3 - var2_2, 256);
            var5_5.x = this.AmAjAkk(var5_5.x, var4_4.aJAkkam, var8_8);
            var5_5.y = this.AmAjAkk(var5_5.y, var4_4.Ajakkam, var9_9);
            if (var6_6 != null) {
                this.aMajaKK(var4_4, var5_5, this.aMaJaKK, var6_6, var2_2 + var1_1);
            } else {
                this.amAJaKK(var4_4, var5_5, this.aMaJaKK, var7_7, var2_2 + var1_1);
            }
            var2_2 += this.aMaJaKK;
        }
        return;
lbl-1000:
        // 1 sources

        {
            this.aMaJaKK = Math.min(var3_3 - var2_2, 256);
            var5_5.x = this.AmAjAkk(var5_5.x, var4_4.aJAkkam, var8_8);
            var5_5.y = this.AmAjAkk(var5_5.y, var4_4.Ajakkam, var9_9);
            if (var6_6 != null) {
                this.AmAJaKK(var4_4, var5_5, this.aMaJaKK, kmjjkka.AMaJaKK);
            } else {
                this.AmAJaKK(var4_4, var5_5, this.aMaJaKK, kmjjkka.AMaJaKK);
            }
            if (var4_4.aJaKKam != null) {
                var4_4.aJaKKam.KKamAJA(kmjjkka.AMaJaKK, this.aMaJaKK);
            }
            if (var6_6 != null) {
                var10_14 = var2_2 + var1_1;
                var11_15 = 0;
                var12_16 = this.aMaJaKK;
                while (var12_16 > 0) {
                    var6_6[var10_14] = (byte)this.AmAJaKK.JaKKamA(kmjjkka.AMaJaKK[var11_15]);
                    --var12_16;
                    ++var10_14;
                    ++var11_15;
                }
            } else {
                var10_14 = var2_2 + var1_1;
                var11_15 = 0;
                var12_16 = this.aMaJaKK;
                while (var12_16 > 0) {
                    var7_7[var10_14] = kmjjkka.AMaJaKK[var11_15];
                    --var12_16;
                    ++var10_14;
                    ++var11_15;
                }
            }
            var2_2 += this.aMaJaKK;
lbl94:
            // 2 sources

            ** while (var2_2 < var3_3)
        }
lbl95:
        // 1 sources

    }

    static {
        kmjjkka.AmaJaKK();
        AMaJaKK = new int[256];
    }
}

