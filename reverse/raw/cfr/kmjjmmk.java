/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Graphics;

public abstract class kmjjmmk {
    public int jAkkamA;
    public int JaKKamA;
    public int jaKKamA;
    public int JAKKamA;
    public int jAKKamA;
    public int JakKamA;
    public boolean jakKamA;
    public static boolean JAkKamA = true;
    public static final int jAkKamA = 1;
    public static final int JaKkAMA = 2;
    public static final int jaKkAMA = 16;
    public static final int JAKkAMA = 32;
    public static final int jAKkAMA = 48;
    public static final int JakkAMA = 128;
    public static final int jakkAMA = 256;
    public static final int JAkkAMA = 1024;
    public static final int jAkkAMA = 2048;
    public static final int JaKKAMA = 4096;
    public static final int jaKKAMA = 17;
    public static final int JAKKAMA = 33;
    public static final int jAKKAMA = 49;

    /*
     * Exception decompiling
     */
    public final void akkaMaJ(kmaamma var1_1, int var2_2, int var3_3) {
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

    public final void kKaMaJa(kmaamma kmaamma2, int n, int n2, int n3) {
        this.KKaMaJa(kmaamma2, n, n2, n3, n3);
    }

    public final void KKaMaJa(kmaamma kmaamma2, int n, int n2, int n3, int n4) {
        this.jAKKamA = n3;
        this.JakKamA = n4;
        this.jaKKamA = n;
        this.JAKKamA = n2;
        this.jAkkamA = n / this.jAKKamA;
        this.JaKKamA = n2 / this.JakKamA;
        this.jakKamA = this.jAKKamA != 1 || this.JakKamA != 1;
        this.AkKaMaJ(kmaamma2);
    }

    public final void aKKaMaJ(Graphics graphics, int n, int n2) {
        if (!this.jakKamA) {
            this.AKKaMaJ(graphics, n, n2);
            return;
        }
        this.aKkaMaJ(graphics, n, n2);
    }

    public final void AkkaMaJ(kajjkka[] kajjkkaArray, int n) {
        int n2 = 0;
        while (n2 < n) {
            this.AKkaMaJ(kajjkkaArray[n2++]);
        }
    }

    public abstract void AkKaMaJ(kmaamma var1);

    public abstract void AKKaMaJ(Graphics var1, int var2, int var3);

    public abstract void aKkaMaJ(Graphics var1, int var2, int var3);

    public abstract void AKkaMaJ(kajjkka var1);

    public abstract void akKaMaJ();

    public kmjjmmk() {
        super();
    }

    static {
    }
}

