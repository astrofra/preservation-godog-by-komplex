/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

class majjkka {
    byte[] amAjAkk;
    int AMAjAkk;
    int aMAjAkk;
    int AmajAkk;
    int amajAkk;
    public boolean AMajAkk;
    public boolean aMajAkk;
    public boolean AmAJAkk;

    /*
     * Exception decompiling
     */
    majjkka(byte[] var1_1, int var2_2, int var3_3, int var4_4) {
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

    majjkka(Point[] pointArray, int n, int n2, int n3) {
        super();
        this.AMajAkk = true;
        this.aMajAkk = false;
        this.AmAJAkk = false;
        if (n < pointArray.length) {
            this.AMAjAkk = pointArray[n].x;
        }
        if (n2 < pointArray.length) {
            this.aMAjAkk = pointArray[n2].x;
        }
        if (n3 < pointArray.length) {
            this.AmajAkk = pointArray[n3].x;
        }
        if (pointArray.length < 1) {
            this.amAjAkk = null;
            return;
        }
        this.amAjAkk = new byte[pointArray[pointArray.length - 1].x + 1];
        int n4 = 0;
        int n5 = 0;
        while (n5 < pointArray.length - 1) {
            int n6 = pointArray[n5].x;
            int n7 = pointArray[n5].y;
            int n8 = pointArray[n5 + 1].x;
            int n9 = pointArray[n5 + 1].y;
            int n10 = n7 <<= 8;
            int n11 = ((n9 <<= 8) - n7) / (n8 - n6);
            n4 = n6;
            while (n4 < n8) {
                if (n4 >= this.amAjAkk.length) {
                    return;
                }
                this.amAjAkk[n4] = (byte)(n10 >> 8);
                n10 += n11;
                ++n4;
            }
            ++n5;
        }
        this.amAjAkk[n4] = (byte)pointArray[pointArray.length - 1].y;
    }

    public void AMAjAkk(int n) {
        this.amajAkk = n;
    }

    public byte amAjAkk(int n) {
        if (n > this.amAjAkk.length) {
            return this.amAjAkk[this.amAjAkk.length - 1];
        }
        return this.amAjAkk[n];
    }

    public int aMAjAkk(int n, boolean bl) {
        ++n;
        if (bl) {
            if (this.aMajAkk && n != this.AMAjAkk && n >= this.AmajAkk) {
                n = this.aMAjAkk;
            }
        } else {
            if (this.AmAJAkk && n >= this.AMAjAkk) {
                n = this.AMAjAkk;
            }
            if (this.aMajAkk && n >= this.AmajAkk) {
                n = this.aMAjAkk;
            }
        }
        if (n >= this.amAjAkk.length) {
            n = this.amAjAkk.length - 1;
        }
        return n;
    }

    public String toString() {
        String string = "[" + this.amAjAkk.length + "] {";
        int n = 0;
        while (n < this.amAjAkk.length) {
            string = String.valueOf(string) + this.amAjAkk[n] + ", ";
            ++n;
        }
        return string;
    }
}

