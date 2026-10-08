/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

class majjkkk {
    int aJaKkam;
    int AjAkKAm;
    int ajAkKAm;
    int AJAkKAm;
    int aJAkKAm;
    int AjakKAm;
    boolean ajakKAm;

    /*
     * Exception decompiling
     */
    majjkkk() {
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

    majjkkk(majjkkk majjkkk2) {
        super();
        this.ajakKAm = false;
        this.aJaKkam = majjkkk2.aJaKkam;
        this.AjAkKAm = majjkkk2.AjAkKAm;
        this.aJAkKAm = majjkkk2.aJAkKAm;
        this.AjakKAm = majjkkk2.AjakKAm;
        this.ajAkKAm = majjkkk2.ajAkKAm;
        this.AJAkKAm = majjkkk2.AJAkKAm;
        this.ajakKAm = majjkkk2.ajakKAm;
    }

    final void aKkAmaj(Point point, Point point2) {
        this.aJaKkam = point.x;
        this.AjAkKAm = point.y;
        this.aJAkKAm = point2.x;
        this.AjakKAm = point2.y;
        this.ajAkKAm = (this.aJaKkam + this.aJAkKAm) / 2;
        this.AJAkKAm = (this.AjAkKAm + this.AjakKAm) / 2;
        this.ajakKAm = true;
    }

    final void aKKaMAj(Point point, Point point2, Point point3) {
        this.aJaKkam = point.x;
        this.AjAkKAm = point.y;
        this.aJAkKAm = point3.x;
        this.AjakKAm = point3.y;
        this.ajAkKAm = point2.x;
        this.AJAkKAm = point2.y;
        this.ajakKAm = false;
    }

    final majjkkk AKKaMAj(int n) {
        majjkkk majjkkk2 = new majjkkk();
        majjkkk2.aJAkKAm = this.aJAkKAm;
        majjkkk2.AjakKAm = this.AjakKAm;
        int n2 = this.aJAkKAm - this.ajAkKAm;
        majjkkk2.ajAkKAm = (int)((long)n * (long)n2 + 32768L >> 16) + this.ajAkKAm;
        n2 = this.AjakKAm - this.AJAkKAm;
        majjkkk2.AJAkKAm = (int)((long)n * (long)n2 + 32768L >> 16) + this.AJAkKAm;
        n2 = this.ajAkKAm - this.aJaKkam;
        this.ajAkKAm = (int)((long)n * (long)n2 + 32768L >> 16) + this.aJaKkam;
        n2 = this.AJAkKAm - this.AjAkKAm;
        this.AJAkKAm = (int)((long)n * (long)n2 + 32768L >> 16) + this.AjAkKAm;
        n2 = majjkkk2.ajAkKAm - this.ajAkKAm;
        this.aJAkKAm = majjkkk2.aJaKkam = (int)((long)n * (long)n2 + 32768L >> 16) + this.ajAkKAm;
        n2 = majjkkk2.AJAkKAm - this.AJAkKAm;
        this.AjakKAm = majjkkk2.AjAkKAm = (int)((long)n * (long)n2 + 32768L >> 16) + this.AJAkKAm;
        majjkkk2.ajakKAm = this.ajakKAm;
        return majjkkk2;
    }

    final int AkKaMAj() {
        return kmaammk.aKkAmAJ(this.ajAkKAm - (this.aJaKkam + this.aJAkKAm) / 2, this.AJAkKAm - (this.AjAkKAm + this.AjakKAm) / 2);
    }

    final int akKaMAj(Point point, int n) {
        kaajmmk kaajmmk2 = new kaajmmk(this.aJaKkam, this.AjAkKAm, this.aJAkKAm, this.AjakKAm);
        if (this.ajAkKAm < kaajmmk2.jAKkAMa) {
            kaajmmk2.jAKkAMa = this.ajAkKAm;
        } else if (this.ajAkKAm > kaajmmk2.jakkAMa) {
            kaajmmk2.jakkAMa = this.ajAkKAm;
        }
        if (this.AJAkKAm < kaajmmk2.JakkAMa) {
            kaajmmk2.JakkAMa = this.AJAkKAm;
        } else if (this.AJAkKAm > kaajmmk2.JAkkAMa) {
            kaajmmk2.JAkkAMa = this.AJAkKAm;
        }
        if (kaajmmk2.jakkAMa < point.x || kaajmmk2.JakkAMa > point.y || kaajmmk2.JAkkAMa <= point.y) {
            return 0;
        }
        if (kaajmmk2.AkKaMAJ(point) && n < 12 && kmaammk.aKkAmAJ(kaajmmk2.jakkAMa - kaajmmk2.jAKkAMa, kaajmmk2.JAkkAMa - kaajmmk2.JakkAMa) > 4) {
            majjkkk majjkkk2 = new majjkkk(this);
            majjkkk majjkkk3 = majjkkk2.AKKaMAj(32768);
            return majjkkk2.akKaMAj(point, ++n) + majjkkk3.akKaMAj(point, n);
        }
        int n2 = this.AjAkKAm;
        int n3 = this.AjakKAm;
        if (n2 == n3) {
            return 0;
        }
        if (n2 > n3) {
            int n4 = n2;
            n2 = n3;
            n3 = n4;
        }
        if (point.y >= n2 && point.y < n3) {
            return 1;
        }
        return 0;
    }
}

