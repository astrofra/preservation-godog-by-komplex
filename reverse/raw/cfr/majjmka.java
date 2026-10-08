/*
 * Decompiled with CFR 0.152.
 */
public class majjmka
extends kaajmma {
    public static final int kAmaJAK = 1;
    public static final int KaMAJAK = 8;
    public static final int kaMAJAK = 64;
    public static final int KAMAJAK = 512;
    public static final int kAMAJAK = 4096;
    public static final int KamAJAK = 32768;
    public static final int kamAJAK = 37449;
    public static final int KAmAJAK = 215332;
    public static final int kAmAJAK = 131072;
    public static final int KaMajAK = 196608;
    public static final int kaMajAK = 224694;
    public static final int KAMajAK = 149796;
    public float kAMajAK;
    public float KamajAK;
    public float kamajAK;
    public float KAmajAK;
    public float kAmajAK;
    public float KaMAjAK;
    public float kaMAjAK;
    public float KAMAjAK;
    public int kAMAjAK;
    public float KamAjAK;

    /*
     * Exception decompiling
     */
    public majjmka() {
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

    public majjmka(float f, float f2, float f3) {
        super();
        this.MajaKka = f;
        this.majaKka = f2;
        this.MAjaKka = f3;
    }

    public majjmka(double d, double d2, double d3) {
        super();
        this.MajaKka = (float)d;
        this.majaKka = (float)d2;
        this.MAjaKka = (float)d3;
    }

    public majjmka(majjmka majjmka2) {
        super();
        this.MajaKka = majjmka2.MajaKka;
        this.majaKka = majjmka2.majaKka;
        this.MAjaKka = majjmka2.MAjaKka;
        this.kAMajAK = majjmka2.kAMajAK;
        this.KamajAK = majjmka2.KamajAK;
        this.kamajAK = majjmka2.kamajAK;
        this.KAmajAK = majjmka2.KAmajAK;
        this.kAmajAK = majjmka2.kAmajAK;
        this.KaMAjAK = majjmka2.KaMAjAK;
        this.kaMAjAK = majjmka2.kaMAjAK;
        this.KAMAjAK = majjmka2.KAMAjAK;
        this.kAMAjAK = majjmka2.kAMAjAK;
        this.KamAjAK = majjmka2.KamAjAK;
    }

    public void KAMajak(float f, float f2) {
        this.kaMAjAK = f;
        this.KAMAjAK = f2;
    }

    public void kAMajak(float f, float f2, float f3) {
        this.KAmajAK = f;
        this.kAmajAK = f2;
        this.KaMAjAK = f3;
    }

    public void kaMajak(majjmka majjmka2) {
        this.MajaKka = majjmka2.MajaKka;
        this.majaKka = majjmka2.majaKka;
        this.MAjaKka = majjmka2.MAjaKka;
        this.kAMajAK = majjmka2.kAMajAK;
        this.KamajAK = majjmka2.KamajAK;
        this.kamajAK = majjmka2.kamajAK;
        this.KAmajAK = majjmka2.KAmajAK;
        this.kAmajAK = majjmka2.kAmajAK;
        this.KaMAjAK = majjmka2.KaMAjAK;
        this.kaMAjAK = majjmka2.kaMAjAK;
        this.KAMAjAK = majjmka2.KAMAjAK;
        this.kAMAjAK = majjmka2.kAMAjAK;
        this.KamAjAK = majjmka2.KamAjAK;
    }
}

