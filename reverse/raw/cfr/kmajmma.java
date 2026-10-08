/*
 * Decompiled with CFR 0.152.
 */
public class kmajmma
extends mmaakkk {
    mmajkka MAjAKKA;
    maaakka mAjAKKA;
    public float MaJakKA;
    public float maJakKA;
    public float MAJakKA;
    public float mAJakKA;
    public float MajakKA;

    /*
     * Exception decompiling
     */
    public kmajmma(mmajkka var1_1, maaakka var2_2) {
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

    public void JaKkama(mmjjmkk mmjjmkk2, int n) {
        if (this.MaJakKA <= 0.0f) {
            return;
        }
        if (this.MAJakKA >= 1.0f) {
            return;
        }
        if (!this.MaJakka) {
            return;
        }
        this.MajAkka = mmjjmkk2;
        this.MAjAkka = kaaamma.AmAjaKK;
        this.jakkAma();
        this.JAKkaMA();
        this.JAKKAma(this.maJakka, this.maJakka.length);
    }

    public void JAKKAma(kajjkka[] kajjkkaArray, int n) {
        kajjkka[] kajjkkaArray2 = kaaamma.aMaJAKK;
        int n2 = kaaamma.AmAjaKK;
        int n3 = 0;
        while (n3 < n) {
            kajjkka kajjkka2 = kajjkkaArray[n3];
            majjmka majjmka2 = kajjkka2.amAJAkk;
            majjmka majjmka3 = kajjkka2.AMAJAkk;
            majjmka majjmka4 = kajjkka2.aMAJAkk;
            kajjkka2.aMajakk = -(majjmka2.KaMAjAK + majjmka3.KaMAjAK + majjmka4.KaMAjAK) - this.maJakKA;
            kajjkkaArray2[n2++] = kajjkka2;
            ++n3;
        }
        kaaamma.AmAjaKK = n2;
    }

    public void JAKkaMA() {
        float f = this.mAjaKKa;
        float f2 = this.MaJAKKa;
        float f3 = this.maJAKKa;
        float f4 = this.maJaKKa;
        float f5 = this.MAJaKKa;
        majjmka[] majjmkaArray = this.MAJakka;
        int n = this.mAjAKKA.kAMAJaK;
        float f6 = 0.0f;
        float f7 = 6.28f / (float)n;
        float f8 = f3;
        float f9 = this.MaJaKKa / f8;
        float f10 = f9 * this.MajakKA;
        majjmkaArray[n].kaMAjAK = f * f9 + f4;
        majjmkaArray[n].KAMAjAK = -f2 * f9 + f5;
        this.mAJakka[n].jAKkaMA = this.MAJakKA;
        float f11 = this.mAJAKKa * this.mAJakKA;
        int n2 = (int)f11 % this.mAjAKKA.KamAJaK;
        int n3 = (n2 + 1) % this.mAjAKKA.KamAJaK;
        float f12 = f11 - (float)Math.floor(f11);
        float f13 = 1.0f - f12;
        float f14 = f12;
        float f15 = this.MaJakKA * 0.00390625f;
        f13 *= f15;
        f14 *= f15;
        n2 *= this.mAjAKKA.kAMAJaK;
        n3 *= this.mAjAKKA.kAMAJaK;
        byte[] byArray = this.mAjAKKA.kamAJaK;
        int n4 = 0;
        while (n4 < n) {
            majjmka majjmka2 = majjmkaArray[n4];
            float f16 = (float)(byArray[n2 + n4] & 0xFF) * f13 + (float)(byArray[n3 + n4] & 0xFF) * f14;
            float f17 = (float)((double)f + Math.cos(f6) * (double)f16);
            float f18 = (float)((double)f2 + Math.sin(f6) * (double)f16);
            majjmka2.kaMAjAK = f17 * f9 + f4;
            majjmka2.KAMAjAK = -(f18 * f10) + f5;
            majjmka2.KaMAjAK = f8;
            f6 += f7;
            ++n4;
        }
    }
}

