/*
 * Decompiled with CFR 0.152.
 */
public class kmaakkk {
    int[] MAJakKa;
    int mAJakKa;
    maaakkk MajakKa;
    boolean majakKa = false;
    int MAjakKa;
    int mAjakKa;

    /*
     * Exception decompiling
     */
    public void jAKKama(int var1_1) {
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

    public void JAKKama(maaakkk maaakkk2) {
        this.MajakKa = maaakkk2;
    }

    public void jAkKama(byte[] byArray, int n, int n2) {
        this.MAJakKa = new int[n2];
        int n3 = 0;
        while (n3 < n2) {
            this.MAJakKa[n3] = byArray[n3 + n] & 0xFF;
            ++n3;
        }
    }

    public void jaKKama(boolean bl) {
        this.majakKa = bl;
    }

    public void jakKama() {
        this.JaKKama(0);
    }

    public void JaKKama(int n) {
        this.MAjakKa = n < 0 ? 0 : (n < this.MAJakKa.length ? n : this.MAJakKa.length - 1);
        this.mAjakKa = 0;
    }

    public void JAkKama(int n) {
        mmajkmk mmajkmk2 = this.MajakKa.maJAkKa[this.MAJakKa[this.MAjakKa]];
        this.mAjakKa = n < 0 ? 0 : (n < mmajkmk2.akKaMaJ ? n : mmajkmk2.akKaMaJ - 1);
    }

    public void JaKkAMa() {
        if (!this.majakKa) {
            ++this.MAjakKa;
        }
        if (this.MAjakKa < this.MAJakKa.length) {
            this.JaKKama(this.MAjakKa);
            return;
        }
        if (this.mAJakKa >= 0 && this.mAJakKa < this.MAJakKa.length) {
            this.JaKKama(this.mAJakKa);
            return;
        }
        this.JaKKama(0);
    }

    public byte[] JakKama() {
        mmajkmk mmajkmk2 = this.MajakKa.maJAkKa[this.MAJakKa[this.MAjakKa]];
        byte[] byArray = mmajkmk2.kKamAJA(this.mAjakKa);
        ++this.mAjakKa;
        if (this.mAjakKa == mmajkmk2.akKaMaJ) {
            this.JaKkAMa();
        }
        return byArray;
    }

    public kmaakkk() {
        super();
    }
}

