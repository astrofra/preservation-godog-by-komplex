/*
 * Decompiled with CFR 0.152.
 */
public final class kajjkka
extends kaaamma {
    public majjmka amAJAkk;
    public majjmka AMAJAkk;
    public majjmka aMAJAkk;
    public kajjmmk AmaJAkk;
    public kajjmmk amaJAkk;
    public kajjmmk AMaJAkk;
    public int aMaJAkk;

    /*
     * Exception decompiling
     */
    public kajjkka(mmaakkk var1_1, int var2_2, int var3_3, int var4_4) {
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

    public kajjkka(mmaakkk mmaakkk2, int n, int n2, int n3, int n4, int n5, int n6) {
        super();
        this.amAJAkk = mmaakkk2.MAJakka[n];
        this.AMAJAkk = mmaakkk2.MAJakka[n2];
        this.aMAJAkk = mmaakkk2.MAJakka[n3];
        this.AmaJAkk = mmaakkk2.mAJakka[n4];
        this.amaJAkk = mmaakkk2.mAJakka[n5];
        this.AMaJAkk = mmaakkk2.mAJakka[n6];
    }

    public kajjkka(majjmka majjmka2, majjmka majjmka3, majjmka majjmka4) {
        super();
        this.amAJAkk = majjmka2;
        this.AMAJAkk = majjmka3;
        this.aMAJAkk = majjmka4;
    }

    public kajjkka(majjmka majjmka2, majjmka majjmka3, majjmka majjmka4, kajjmmk kajjmmk2, kajjmmk kajjmmk3, kajjmmk kajjmmk4) {
        super();
        this.amAJAkk = majjmka2;
        this.AMAJAkk = majjmka3;
        this.aMAJAkk = majjmka4;
        this.AmaJAkk = kajjmmk2;
        this.amaJAkk = kajjmmk3;
        this.AMaJAkk = kajjmmk4;
    }

    public kajjkka(kajjkka kajjkka2) {
        super();
        this.amAJAKK = kajjkka2.amAJAKK;
        this.AMAJAKK = kajjkka2.AMAJAKK;
        this.aMAJAKK = kajjkka2.aMAJAKK;
    }

    public kajjkka(kajjkka kajjkka2, majjmka majjmka2, majjmka majjmka3, majjmka majjmka4) {
        super();
        this.amAJAKK = kajjkka2.amAJAKK;
        this.AMAJAKK = kajjkka2.AMAJAKK;
        this.aMAJAKK = kajjkka2.aMAJAKK;
        this.amAJAkk = majjmka2;
        this.AMAJAkk = majjmka3;
        this.aMAJAkk = majjmka4;
        this.AmaJAkk = new kajjmmk();
        this.amaJAkk = new kajjmmk();
        this.AMaJAkk = new kajjmmk();
    }

    public kajjkka(kajjkka kajjkka2, majjmka majjmka2, majjmka majjmka3, majjmka majjmka4, kajjmmk kajjmmk2, kajjmmk kajjmmk3, kajjmmk kajjmmk4) {
        super();
        this.amAJAKK = kajjkka2.amAJAKK;
        this.AMAJAKK = kajjkka2.AMAJAKK;
        this.aMAJAKK = kajjkka2.aMAJAKK;
        this.amAJAkk = majjmka2;
        this.AMAJAkk = majjmka3;
        this.aMAJAkk = majjmka4;
        this.AmaJAkk = kajjmmk2;
        this.amaJAkk = kajjmmk3;
        this.AMaJAkk = kajjmmk4;
    }

    public void AmajAkk(kajjkka kajjkka2) {
        this.amAJAKK = kajjkka2.amAJAKK;
        this.AMAJAKK = kajjkka2.AMAJAKK;
        this.aMAJAKK = kajjkka2.aMAJAKK;
    }

    public final void aMAjaKK() {
        kaaamma.aMaJAKK[kaaamma.AmAjaKK++] = this;
    }

    public final void amajaKK() {
        kaajmma kaajmma2 = this.AMAJAkk.MAJakKA(this.amAJAkk);
        kaajmma kaajmma3 = this.aMAJAkk.MAJakKA(this.amAJAkk);
        kaajmma2.MaJAkKA(kaajmma3);
        kaajmma2.MaJAKKA();
        this.AmaJAKK = kaajmma2.MajaKka;
        this.amaJAKK = kaajmma2.majaKka;
        this.AMaJAKK = kaajmma2.MAjaKka;
    }

    public final void AmajaKK() {
        this.amAJAkk.kAMajAK += this.AmaJAKK;
        this.amAJAkk.KamajAK += this.amaJAKK;
        this.amAJAkk.kamajAK += this.AMaJAKK;
        this.AMAJAkk.kAMajAK += this.AmaJAKK;
        this.AMAJAkk.KamajAK += this.amaJAKK;
        this.AMAJAkk.kamajAK += this.AMaJAKK;
        this.aMAJAkk.kAMajAK += this.AmaJAKK;
        this.aMAJAkk.KamajAK += this.amaJAKK;
        this.aMAJAkk.kamajAK += this.AMaJAKK;
    }
}

