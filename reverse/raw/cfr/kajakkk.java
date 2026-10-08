/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

final class kajakkk {
    kaajkkk MajaKka;
    kajakkk majaKka;
    mmjakka MAjaKka;
    int mAjaKka;
    kmaammk MaJAKka;
    kmaammk maJAKka;
    kaajmmk MAJAKka;
    boolean mAJAKka;
    int MajAKka;
    maajkkk majAKka;
    majjkmk MAjAKka;

    /*
     * Exception decompiling
     */
    final void jaKkaMA() {
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

    boolean JaKkaMA(Point point) {
        boolean bl = false;
        if (this.MAJAKka != null && this.MAJAKka.AkKaMAJ(point)) {
            if (this.majAKka == null) {
                this.jaKkaMA();
            }
            boolean bl2 = false;
            maajkkk maajkkk2 = this.majAKka;
            while (maajkkk2 != null) {
                if (maajkkk2.AjAkKAm <= point.y && point.y < maajkkk2.AjakKAm && maajkkk2.akKaMAj(point, 0) > 0) {
                    bl2 = true;
                    switch (maajkkk2.AJAkkAm) {
                        case 0: {
                            maajkkk2.AJakkAm.AJakKam ^= 1;
                            maajkkk2.aJakkAm.AJakKam ^= 1;
                            break;
                        }
                        case 1: {
                            maajkkk2.AJakkAm.AJakKam ^= 1;
                            break;
                        }
                        case 2: {
                            maajkkk2.AJakkAm.AJakKam += maajkkk2.aJAkkAm;
                        }
                    }
                }
                maajkkk2 = maajkkk2.AjakkAm;
            }
            if (bl2) {
                maajkkk maajkkk3 = this.majAKka;
                while (maajkkk3 != null) {
                    if (maajkkk3.AJakkAm != null) {
                        if (maajkkk3.AJakkAm.AJakKam != 0) {
                            bl = true;
                        }
                        maajkkk3.AJakkAm.AJakKam = 0;
                    }
                    if (maajkkk3.aJakkAm != null) {
                        if (maajkkk3.aJakkAm.AJakKam != 0) {
                            bl = true;
                        }
                        maajkkk3.aJakkAm.AJakKam = 0;
                    }
                    maajkkk3 = maajkkk3.AjakkAm;
                }
            }
        }
        return bl;
    }

    kajakkk() {
        super();
    }
}

