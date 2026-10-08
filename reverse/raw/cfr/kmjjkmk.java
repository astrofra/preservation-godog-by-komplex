/*
 * Decompiled with CFR 0.152.
 */
import java.awt.image.ColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.IndexColorModel;
import java.util.Hashtable;

class kmjjkmk
implements ImageConsumer {
    ColorModel KKAMAJa;
    int kKAMAJa;
    int KkaMAJa;
    boolean kkaMAJa;
    kmaakka KKaMAJa;
    boolean kKaMAJa;
    boolean KkAmaJa;

    /*
     * Exception decompiling
     */
    public boolean kKaMajA() {
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

    public synchronized void KkAmAJA() {
        try {
            while (true) {
                if (this.kKaMAJa) {
                    return;
                }
                this.wait(500L);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public synchronized void imageComplete(int n) {
        if (!this.kKaMAJa) {
            if (this.KKaMAJa == null || n == 1 || n == 4) {
                this.KkAmaJa = true;
            } else if (this.kkaMAJa) {
                ((mmajkka)this.KKaMAJa).Amajakk();
            } else {
                ((maaakka)this.KKaMAJa).KAMAjaK((IndexColorModel)this.KKAMAJa);
            }
            this.kKaMAJa = true;
            this.notify();
        }
    }

    public void setColorModel(ColorModel colorModel) {
        this.KKAMAJa = colorModel;
    }

    public void setDimensions(int n, int n2) {
        this.kKAMAJa = n;
        this.KkaMAJa = n2;
    }

    public void setHints(int n) {
        if (this.KKAMAJa instanceof IndexColorModel) {
            this.kkaMAJa = false;
            this.KKaMAJa = new maaakka(this.kKAMAJa, this.KkaMAJa, 1, false);
            return;
        }
        this.kkaMAJa = true;
        this.KKaMAJa = new mmajkka(this.kKAMAJa, this.KkaMAJa, 1, false);
    }

    public void setPixels(int n, int n2, int n3, int n4, ColorModel colorModel, byte[] byArray, int n5, int n6) {
        int n7 = n2 * this.kKAMAJa + n;
        int n8 = 0;
        while (n8 < n4) {
            System.arraycopy(byArray, n5, ((maaakka)this.KKaMAJa).kamAJaK, n7, n3);
            n5 += n6;
            n7 += this.kKAMAJa;
            ++n8;
        }
    }

    public void setPixels(int n, int n2, int n3, int n4, ColorModel colorModel, int[] nArray, int n5, int n6) {
        int n7 = n2 * this.kKAMAJa + n;
        int n8 = 0;
        while (n8 < n4) {
            System.arraycopy(nArray, n5, ((mmajkka)this.KKaMAJa).AMAjakk, n7, n3);
            n5 += n6;
            n7 += this.kKAMAJa;
            ++n8;
        }
    }

    public void setProperties(Hashtable hashtable) {
    }

    kmjjkmk() {
        super();
    }
}

