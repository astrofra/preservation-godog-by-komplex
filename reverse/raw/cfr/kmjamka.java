/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public final class kmjamka
extends kmjjmmk {
    public mmajkka kamAJAk;
    public mmaamma KAmAJAk;
    public mmjamka kAmAJAk;
    Image KaMajAk;
    Graphics kaMajAk;
    int KAMajAk;

    /*
     * Exception decompiling
     */
    public void AkKaMaJ(kmaamma var1_1) {
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

    public void AKkaMaJ(kajjkka kajjkka2) {
        if (kajjkka2.amAJAKK == 1024) {
            float f = kajjkka2.amAJAkk.KamAjAK;
            int n = (int)(kajjkka2.amAJAkk.kaMAjAK / 65536.0f - f * 0.5f);
            int n2 = (int)(kajjkka2.amAJAkk.KAMAjAK / 65536.0f - f * 0.5f);
            this.kamAJAk.AMAJAkk(kajjkka2.aMAJAKK, n, n2, f, f);
            return;
        }
        if (kajjkka2.amAJAKK == 4096) {
            this.kAmAJAk.KaMaJAk(kajjkka2);
            return;
        }
        this.KAmAJAk.amAjAKK(kajjkka2);
    }

    public void AKKaMaJ(Graphics graphics, int n, int n2) {
        this.kamAJAk.KAmaJaK();
        this.kamAJAk.kaMAJaK(graphics, n, n2);
    }

    public void aKkaMaJ(Graphics graphics, int n, int n2) {
        if (kmjjmmk.JAkKamA) {
            this.kamAJAk.KAmaJaK();
            this.kamAJAk.kaMAJaK(this.kaMajAk, 0, 0);
            graphics.drawImage(this.KaMajAk, n, n2, this.jaKKamA, this.JAKKamA, Color.black, null);
            return;
        }
        this.kamAJAk.KAmaJaK();
        this.kamAJAk.KaMAJaK(graphics, n, n2, this.jaKKamA, this.JAKKamA);
    }

    public void KaMAJAk(int n) {
        this.KAMajAk = n;
    }

    public void akKaMaJ() {
        this.kAmaJAk(this.KAMajAk);
    }

    public void kAmaJAk(int n) {
        n = mmajkka.AmAJakk(n);
        int[] nArray = this.kamAJAk.AMAjakk;
        int n2 = nArray.length;
        int n3 = 0;
        while (n3 < n2) {
            nArray[n3++] = n;
        }
    }

    public kmjamka() {
        super();
    }
}

