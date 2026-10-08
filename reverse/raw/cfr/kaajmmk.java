/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

final class kaajmmk {
    int jAKkAMa;
    int JakkAMa;
    int jakkAMa;
    int JAkkAMa;

    /*
     * Exception decompiling
     */
    kaajmmk() {
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

    kaajmmk(kaajmmk kaajmmk2) {
        super();
        this.jAKkAMa = kaajmmk2.jAKkAMa;
        this.JakkAMa = kaajmmk2.JakkAMa;
        this.jakkAMa = kaajmmk2.jakkAMa;
        this.JAkkAMa = kaajmmk2.JAkkAMa;
    }

    kaajmmk(int n, int n2, int n3, int n4) {
        super();
        if (n < n3) {
            this.jAKkAMa = n;
            this.jakkAMa = n3;
        } else {
            this.jAKkAMa = n3;
            this.jakkAMa = n;
        }
        if (n2 < n4) {
            this.JakkAMa = n2;
            this.JAkkAMa = n4;
            return;
        }
        this.JakkAMa = n4;
        this.JAkkAMa = n2;
    }

    final void akKaMAJ(kaajmmk kaajmmk2) {
        if (kaajmmk2.jAKkAMa != Integer.MIN_VALUE) {
            if (this.jAKkAMa == Integer.MIN_VALUE) {
                this.jAKkAMa = kaajmmk2.jAKkAMa;
                this.jakkAMa = kaajmmk2.jakkAMa;
                this.JakkAMa = kaajmmk2.JakkAMa;
                this.JAkkAMa = kaajmmk2.JAkkAMa;
                return;
            }
            this.jAKkAMa = Math.min(this.jAKkAMa, kaajmmk2.jAKkAMa);
            this.jakkAMa = Math.max(this.jakkAMa, kaajmmk2.jakkAMa);
            this.JakkAMa = Math.min(this.JakkAMa, kaajmmk2.JakkAMa);
            this.JAkkAMa = Math.max(this.JAkkAMa, kaajmmk2.JAkkAMa);
        }
    }

    final void AKKaMAJ(Point point) {
        if (this.jAKkAMa == Integer.MIN_VALUE) {
            this.jAKkAMa = this.jakkAMa = point.x;
            this.JakkAMa = this.JAkkAMa = point.y;
            return;
        }
        if (point.x < this.jAKkAMa) {
            this.jAKkAMa = point.x;
        } else if (point.x > this.jakkAMa) {
            this.jakkAMa = point.x;
        }
        if (point.y < this.JakkAMa) {
            this.JakkAMa = point.y;
            return;
        }
        if (point.y > this.JAkkAMa) {
            this.JAkkAMa = point.y;
        }
    }

    final boolean aKKaMAJ(kaajmmk kaajmmk2) {
        return this.jAKkAMa <= kaajmmk2.jakkAMa && kaajmmk2.jAKkAMa <= this.jakkAMa && this.JakkAMa <= kaajmmk2.JAkkAMa && kaajmmk2.JakkAMa <= this.JAkkAMa;
    }

    final boolean AkKaMAJ(Point point) {
        return this.jAKkAMa <= point.x && point.x <= this.jakkAMa && this.JakkAMa <= point.y && point.y <= this.JAkkAMa;
    }
}

