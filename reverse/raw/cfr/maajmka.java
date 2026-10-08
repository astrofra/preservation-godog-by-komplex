/*
 * Decompiled with CFR 0.152.
 */
public class maajmka {
    private int KAMAjak;
    private long[] kAMAjak;
    private long KamAjak;
    private long kamAjak;
    private long KAmAjak;

    /*
     * Exception decompiling
     */
    public maajmka(int var1_1) {
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

    public maajmka(int n, int n2) {
        super();
        this.KAMAjak = n2;
        this.KAmAjak = n;
        this.kAMAjak = new long[this.KAMAjak];
        this.kaMAjak(this.KAmAjak);
    }

    public void KAMAjak() {
        this.kaMAjak(this.KAmAjak);
    }

    public void kaMAjak(long l) {
        this.KAmAjak = l;
        this.kamAjak = System.currentTimeMillis();
        int n = 0;
        while (n < this.KAMAjak) {
            this.kAMAjak[this.KAMAjak - 1 - n] = this.kamAjak;
            this.kamAjak -= l;
            ++n;
        }
        this.kamAjak = 0L;
        this.KaMAjak();
        this.kamAjak = this.KamAjak;
        this.KamAjak = 0L;
    }

    public long kAmajak() {
        return this.KamAjak;
    }

    public void KaMAjak() {
        int n = 0;
        while (n < this.KAMAjak - 1) {
            this.kAMAjak[n] = this.kAMAjak[n + 1];
            ++n;
        }
        this.kAMAjak[this.KAMAjak - 1] = System.currentTimeMillis();
        long l = 0L;
        int n2 = 0;
        while (n2 < this.KAMAjak) {
            l += this.kAMAjak[n2] / (long)this.KAMAjak;
            ++n2;
        }
        this.KamAjak = l;
        this.KamAjak -= this.kamAjak;
    }

    public float kAMAjak() {
        return (this.kAMAjak[this.KAMAjak - 1] - this.kAMAjak[0]) / (long)(this.KAMAjak - 2);
    }
}

