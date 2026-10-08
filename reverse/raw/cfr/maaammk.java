/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

final class maaammk {
    maaammk AjaKkAM;
    int ajaKkAM;
    int AJaKkAM;
    kaaammk[] aJaKkAM = new kaaammk[4];
    int AjAkKam;
    boolean ajAkKam;
    boolean AJAkKam = true;

    /*
     * Exception decompiling
     */
    final void aKkaMaj(kaaammk var1_1) {
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

    final long akkaMaj(int n, int n2) {
        if (this.ajAkKam) {
            long l = 0L;
            kaaammk kaaammk2 = null;
            long l2 = 0L;
            int n3 = 0;
            while (n3 < this.AjAkKam) {
                kaaammk kaaammk3 = this.aJaKkAM[n3];
                if (kaaammk3.ajakKam != 0) {
                    if (kaaammk2 != kaaammk3) {
                        switch (kaaammk3.ajakKam) {
                            case 64: 
                            case 65: 
                            case 66: {
                                int n4;
                                Object object = (kmjjkka)kaaammk3.AJaKKam;
                                Point point = new Point(n << 16, n2 << 16);
                                kaaammk3.ajaKKam.akkAmAJ(point);
                                if (kaaammk3.ajakKam == 65) {
                                    if (kaaammk3.ajAkkam) {
                                        n4 = ((kmjjkka)object).AMAJaKK(point.x - 32768, point.y - 32768);
                                        l2 = ((long)n4 & 0xFF000000L) << 24 | ((long)n4 & 0xFF0000L) << 16 | ((long)n4 & 0xFF00L) << 8 | (long)n4 & 0xFFL;
                                    } else {
                                        n4 = ((kmjjkka)object).aMAJaKK(point.x >> 16, point.y >> 16);
                                        l2 = ((long)n4 & 0xFF000000L) << 24 | ((long)n4 & 0xFF0000L) << 16 | ((long)n4 & 0xFF00L) << 8 | (long)n4 & 0xFFL;
                                    }
                                } else {
                                    n4 = ((kmjjkka)object).aMAJaKK(kmjjkka.amaJaKK(point.x >> 16, ((kmjjkka)object).AMAjaKK), kmjjkka.amaJaKK(point.y >> 16, ((kmjjkka)object).aMAjaKK));
                                    l2 = ((long)n4 & 0xFF000000L) << 24 | ((long)n4 & 0xFF0000L) << 16 | ((long)n4 & 0xFF00L) << 8 | (long)n4 & 0xFFL;
                                }
                                kaaammk2 = kaaammk3;
                                break;
                            }
                            case 16: {
                                Object object = new Point(n << 8, n2 << 8);
                                kaaammk3.aJAKKam.akkAmAJ((Point)object);
                                int n5 = (((Point)object).x >> 15) + 128;
                                if (n5 > 256) {
                                    n5 = 256;
                                } else if (n5 < 0) {
                                    n5 = 0;
                                }
                                int n4 = kaaammk3.AjaKKam[n5];
                                l2 = ((long)n4 & 0xFF000000L) << 24 | ((long)n4 & 0xFF0000L) << 16 | ((long)n4 & 0xFF00L) << 8 | (long)n4 & 0xFFL;
                                kaaammk2 = kaaammk3;
                                break;
                            }
                            case 18: {
                                Object object = new Point(n << 8, n2 << 8);
                                kaaammk3.aJAKKam.akkAmAJ((Point)object);
                                int n6 = kmaammk.AKkAmAJ(((Point)object).x, ((Point)object).y) >> 14;
                                if (n6 > 256) {
                                    n6 = 256;
                                }
                                int n4 = kaaammk3.AjaKKam[n6];
                                l2 = ((long)n4 & 0xFF000000L) << 24 | ((long)n4 & 0xFF0000L) << 16 | ((long)n4 & 0xFF00L) << 8 | (long)n4 & 0xFFL;
                                kaaammk2 = kaaammk3;
                            }
                        }
                    }
                    l += l2;
                } else {
                    l += kaaammk3.ajAKKam;
                }
                ++n3;
            }
            return l;
        }
        if (this.AJAkKam) {
            if (this.AjAkKam == 4) {
                return 4L * this.aJaKkAM[0].ajAKKam;
            }
            return (long)this.AjAkKam * this.aJaKkAM[0].ajAKKam;
        }
        long l = 0L;
        int n7 = 0;
        while (n7 < this.AjAkKam) {
            l += this.aJaKkAM[n7].ajAKKam;
            ++n7;
        }
        return l;
    }

    final maaammk AKkaMaj(kaajkkk kaajkkk2, int n) {
        maaammk maaammk2 = kaajkkk2.MaJaKKA;
        if (maaammk2 != null) {
            kaajkkk2.MaJaKKA = maaammk2.AjaKkAM;
        } else {
            maaammk2 = new maaammk();
        }
        maaammk2.ajaKkAM = n;
        maaammk2.AJaKkAM = this.AJaKkAM;
        this.AJaKkAM = n;
        maaammk2.AjaKkAM = this.AjaKkAM;
        this.AjaKkAM = maaammk2;
        maaammk2.aJaKkAM[0] = this.aJaKkAM[0];
        maaammk2.aJaKkAM[1] = this.aJaKkAM[1];
        maaammk2.aJaKkAM[2] = this.aJaKkAM[2];
        maaammk2.aJaKkAM[3] = this.aJaKkAM[3];
        maaammk2.AjAkKam = this.AjAkKam;
        maaammk2.ajAkKam = this.ajAkKam;
        maaammk2.AJAkKam = this.AJAkKam;
        return maaammk2;
    }

    maaammk() {
        super();
    }
}

