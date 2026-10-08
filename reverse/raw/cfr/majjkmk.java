/*
 * Decompiled with CFR 0.152.
 */
final class majjkmk {
    int kkAmaJa;
    int KKAmaJa;
    int kKAmaJa;
    int KkamaJa;
    int kkamaJa;
    int KKamaJa;
    int kKamaJa;
    private byte[] KkAMaJa;
    private byte[] kkAMaJa;
    private byte[] KKAMaJa;
    private kaajkkk kKAMaJa;

    /*
     * Exception decompiling
     */
    majjkmk(kaajkkk var1_1) {
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

    private static void KKAmAJA(int n, int n2, byte[] byArray) {
        int n3 = n2 << 8;
        int n4 = 256;
        int n5 = 0;
        while (n4-- != 0) {
            byArray[n5++] = (n3 & 0xFFFF0000) == 0 ? (int)(n3 >> 8) : (n3 > 0 ? -1 : 0);
            n3 += n;
        }
    }

    void kkamAJA() {
        this.KkAMaJa = new byte[256];
        this.kkAMaJa = new byte[256];
        this.KKAMaJa = new byte[256];
        if (this.KkAMaJa == null || this.kkAMaJa == null || this.KKAMaJa == null) {
            this.KKAMaJa = null;
            this.kkAMaJa = null;
            this.KkAMaJa = null;
            return;
        }
        majjkmk.KKAmAJA(this.KKAmaJa, this.kKAmaJa, this.KkAMaJa);
        majjkmk.KKAmAJA(this.KkamaJa, this.kkamaJa, this.kkAMaJa);
        majjkmk.KKAmAJA(this.KKamaJa, this.kKamaJa, this.KKAMaJa);
    }

    void KKamAJA(int[] nArray, int n) {
        if (this.kkAmaJa == 0 || this.KkAMaJa == null) {
            return;
        }
        int n2 = 0;
        while (n2 < n) {
            int n3 = nArray[n2];
            int n4 = this.KkAMaJa[n3 >> 16 & 0xFF] & 0xFF;
            int n5 = this.kkAMaJa[n3 >> 8 & 0xFF] & 0xFF;
            int n6 = this.KKAMaJa[n3 & 0xFF] & 0xFF;
            nArray[n2] = 0xFF000000 | n4 << 16 | n5 << 8 | n6;
            ++n2;
        }
    }

    int KkamAJA(int n) {
        if (this.kkAmaJa == 0 || this.KkAMaJa == null) {
            return n;
        }
        int n2 = this.KkAMaJa[n >> 16 & 0xFF] & 0xFF;
        int n3 = this.kkAMaJa[n >> 8 & 0xFF] & 0xFF;
        int n4 = this.KKAMaJa[n & 0xFF] & 0xFF;
        return 0xFF000000 | n2 << 16 | n3 << 8 | n4;
    }

    void kKAmAJA(kaaammk kaaammk2) {
        if (this.kkAmaJa == 0) {
            return;
        }
        int n = kaaammk2.AJAKKam;
        int n2 = n >> 16 & 0xFF;
        int n3 = this.KKAmaJa;
        int n4 = this.kKAmaJa;
        int n5 = ((n2 = (n2 * n3 >> 8) + n4) & 0xFF00) == 0 ? n2 : (n2 > 0 ? 255 : 0);
        n2 = n >> 8 & 0xFF;
        n3 = this.KkamaJa;
        n4 = this.kkamaJa;
        n2 = (n2 * n3 >> 8) + n4;
        int n6 = (n2 & 0xFF00) == 0 ? n2 : (n2 > 0 ? 255 : 0);
        n2 = n & 0xFF;
        n3 = this.KKamaJa;
        n4 = this.kKamaJa;
        n2 = (n2 * n3 >> 8) + n4;
        int n7 = (n2 & 0xFF00) == 0 ? n2 : (n2 > 0 ? 255 : 0);
        n = 0xFF000000 | n5 << 16 | n6 << 8 | n7;
        kaaammk2.AkKAMaj(this.kKAMaJa, n);
    }

    void kkAmAJA(kaaammk kaaammk2) {
        if (this.kkAmaJa == 0 || kaaammk2.AjaKKam == null) {
            return;
        }
        int[] nArray = kaaammk2.AjaKKam;
        int n = nArray.length - 1;
        while (n >= 0) {
            int n2 = nArray[n] >> 16 & 0xFF;
            int n3 = this.KKAmaJa;
            int n4 = this.kKAmaJa;
            int n5 = ((n2 = (n2 * n3 >> 8) + n4) & 0xFF00) == 0 ? n2 : (n2 > 0 ? 255 : 0);
            n2 = nArray[n] >> 8 & 0xFF;
            n3 = this.KkamaJa;
            n4 = this.kkamaJa;
            n2 = (n2 * n3 >> 8) + n4;
            int n6 = (n2 & 0xFF00) == 0 ? n2 : (n2 > 0 ? 255 : 0);
            n2 = nArray[n] & 0xFF;
            n3 = this.KKamaJa;
            n4 = this.kKamaJa;
            n2 = (n2 * n3 >> 8) + n4;
            int n7 = (n2 & 0xFF00) == 0 ? n2 : (n2 > 0 ? 255 : 0);
            nArray[n] = 0xFF000000 | n5 << 16 | n6 << 8 | n7;
            --n;
        }
    }
}

