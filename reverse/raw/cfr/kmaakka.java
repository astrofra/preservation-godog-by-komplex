/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;

public abstract class kmaakka
implements ImageProducer {
    protected ImageConsumer KaMAJaK;
    public Image kaMAJaK;
    protected ColorModel KAMAJaK;
    public int kAMAJaK;
    public int KamAJaK;

    /*
     * Exception decompiling
     */
    public kmaakka(int var1_1, int var2_2) {
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

    public final void addConsumer(ImageConsumer imageConsumer) {
    }

    public final boolean isConsumer(ImageConsumer imageConsumer) {
        return false;
    }

    public final void removeConsumer(ImageConsumer imageConsumer) {
    }

    public final void requestTopDownLeftRightResend(ImageConsumer imageConsumer) {
    }

    public final void startProduction(ImageConsumer imageConsumer) {
        this.KaMAJaK = imageConsumer;
        this.KaMAJaK.setDimensions(this.kAMAJaK, this.KamAJaK);
        this.KaMAJaK.setProperties(null);
        this.KaMAJaK.setColorModel(this.KAMAJaK);
        this.KaMAJaK.setHints(30);
    }

    public final void KAmaJaK() {
        this.kamaJaK(0, 0, this.kAMAJaK, this.KamAJaK);
    }

    public abstract void kamaJaK(int var1, int var2, int var3, int var4);

    public final void kaMAJaK(Graphics graphics, int n, int n2) {
        graphics.drawImage(this.kaMAJaK, n, n2, null);
    }

    public final void KaMAJaK(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.drawImage(this.kaMAJaK, n, n2, n3, n4, Color.green, null);
    }

    public final void kAmaJaK(boolean bl) {
        if (bl) {
            if (this.kaMAJaK == null) {
                this.kaMAJaK = Toolkit.getDefaultToolkit().createImage(this);
                Toolkit.getDefaultToolkit().prepareImage(this.kaMAJaK, this.kAMAJaK, this.KamAJaK, null);
                this.KAmaJaK();
                return;
            }
        } else {
            this.kaMAJaK = null;
        }
    }
}

