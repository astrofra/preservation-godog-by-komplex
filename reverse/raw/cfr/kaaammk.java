/*
 * Decompiled with CFR 0.152.
 */
final class kaaammk {
    kaaammk aJAkKam;
    int AjakKam;
    int ajakKam;
    int AJakKam;
    boolean aJakKam;
    byte AjAKKam;
    long ajAKKam;
    int AJAKKam;
    kmaammk aJAKKam;
    int[] AjaKKam;
    kmaammk ajaKKam;
    Object AJaKKam;
    majjkmk aJaKKam;
    boolean AjAkkam;
    boolean ajAkkam;
    boolean AJAkkam;
    int aJAkkam;
    int Ajakkam;

    /*
     * Exception decompiling
     */
    kaaammk(kaajkkk var1_1, int var2_2) {
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

    kaaammk(kaajkkk kaajkkk2, int n, int n2, int[] nArray, int[] nArray2, kmaammk kmaammk2, kmaammk kmaammk3) {
        super();
        int n3;
        this.ajakKam = n;
        kmaammk kmaammk4 = new kmaammk(kmaammk3);
        if (kaajkkk2.mAJaKkA) {
            kmaammk4.ajakkAM /= 4;
            kmaammk4.AjAKkAM /= 4;
            kmaammk4.AJakkAM /= 4;
            kmaammk4.aJakkAM /= 4;
            kmaammk4.ajAKkAM /= 4;
            kmaammk4.AJAKkAM /= 4;
        }
        kmaammk kmaammk5 = new kmaammk(kmaammk2);
        kmaammk4.ajAKkAM <<= 8;
        kmaammk4.AJAKkAM <<= 8;
        kmaammk5.ajAKkAM <<= 8;
        kmaammk5.AJAKkAM <<= 8;
        this.aJAKKam = kmaammk.aKKaMaj(kmaammk5, kmaammk4).AkkaMaj();
        this.AjaKKam = new int[257];
        int n4 = 0;
        int n5 = nArray2[0];
        int n6 = n3 = nArray[0];
        int n7 = 1;
        int n8 = 0;
        while (n8 <= 256) {
            int n9;
            int n10;
            int n11;
            if (n8 > n5) {
                n4 = n5;
                n6 = n3;
                if (n7 < n2) {
                    n5 = nArray2[n7];
                    n3 = nArray[n7];
                    ++n7;
                } else {
                    n5 = 256;
                }
            }
            if ((n11 = (n10 = (n5 - n8) / 8) + (n9 = (n8 - n4) / 8)) > 0) {
                int n12 = ((n6 >> 16 & 0xFF) * n10 + (n3 >> 16 & 0xFF) * n9) / n11;
                int n13 = ((n6 >> 8 & 0xFF) * n10 + (n3 >> 8 & 0xFF) * n9) / n11;
                int n14 = ((n6 & 0xFF) * n10 + (n3 & 0xFF) * n9) / n11;
                this.AjaKKam[n8] = 0xFF000000 | n12 << 16 | n13 << 8 | n14;
            } else {
                this.AjaKKam[n8] = n6;
            }
            ++n8;
        }
    }

    void AkKAMaj(kaajkkk kaajkkk2, int n) {
        this.ajakKam = 0;
        this.AJAKKam = n;
        if (kaajkkk2.MAJAKkA) {
            this.AjAKKam = (byte)kaajkkk2.JaKKamA(this.AJAKKam);
        }
        int n2 = this.AJAKKam;
        this.ajAKKam = ((long)n2 & 0xFF000000L) << 24 | ((long)n2 & 0xFF0000L) << 16 | ((long)n2 & 0xFF00L) << 8 | (long)n2 & 0xFFL;
    }
}

