/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.ColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.io.InputStream;
import java.util.Hashtable;

public class kmjamma
extends Component
implements ImageConsumer {
    mmaakka MAjAKka;
    mmjakmk mAjAKka;
    mmajkka MaJakka;
    private ImageProducer maJakka;
    public int[] MAJakka;
    int mAJakka;

    /*
     * Exception decompiling
     */
    public void majakKa(int var1_1) {
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

    public int MajakKa() {
        return this.mAjAKka.KKamaJA();
    }

    public kmjamma(mmajkka mmajkka2, InputStream inputStream) {
        super();
        this.MaJakka = mmajkka2;
        try {
            this.MAjAKka = new mmaakka();
            this.mAjAKka = new mmjakmk(this.MAjAKka);
            this.mAjAKka.KKAmaJA(true);
            this.mAjAKka.kKamaJA(this);
            this.mAjAKka.kKamAja(true);
            this.mAjAKka.kkAMaJA(inputStream);
            this.mAjAKka.KkamaJA();
            this.mAjAKka.kkaMAja(3, false);
            this.mAjAKka.KkamAja(0);
            while (this.maJakka == null) {
                Thread.sleep(100L);
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public Rectangle bounds() {
        return new Rectangle(this.MaJakka.kAMAJaK, this.MaJakka.KamAJaK);
    }

    public void update(Graphics graphics) {
    }

    public void mAJakKa(Graphics graphics) {
    }

    public void paint(Graphics graphics) {
    }

    public void repaint() {
    }

    public boolean isShowing() {
        return true;
    }

    public Graphics getGraphics() {
        return null;
    }

    public Image createImage(ImageProducer imageProducer) {
        this.maJakka = imageProducer;
        this.maJakka.startProduction(this);
        return null;
    }

    public void imageComplete(int n) {
    }

    public void setColorModel(ColorModel colorModel) {
    }

    public void setDimensions(int n, int n2) {
        this.MAJakka = new int[n * n2];
        int n3 = 0;
        while (n3 < this.MAJakka.length) {
            this.MAJakka[n3] = -16777216;
            ++n3;
        }
        this.mAJakka = n;
    }

    public void setHints(int n) {
    }

    public void setPixels(int n, int n2, int n3, int n4, ColorModel colorModel, byte[] byArray, int n5, int n6) {
    }

    public void setPixels(int n, int n2, int n3, int n4, ColorModel colorModel, int[] nArray, int n5, int n6) {
        int n7 = n2 * this.mAJakka + n;
        int[] nArray2 = this.MaJakka.AMAjakk;
        int n8 = 0;
        while (n8 < n4) {
            int n9 = n3;
            switch (n9 & 3) {
                case 3: {
                    nArray2[n7++] = (nArray[n5++] & 0xFF) * 0x100401;
                }
                case 2: {
                    nArray2[n7++] = (nArray[n5++] & 0xFF) * 0x100401;
                }
                case 1: {
                    nArray2[n7++] = (nArray[n5++] & 0xFF) * 0x100401;
                }
            }
            n9 >>= 2;
            while (n9-- > 0) {
                nArray2[n7++] = (nArray[n5++] & 0xFF) * 0x100401;
                nArray2[n7++] = (nArray[n5++] & 0xFF) * 0x100401;
                nArray2[n7++] = (nArray[n5++] & 0xFF) * 0x100401;
                nArray2[n7++] = (nArray[n5++] & 0xFF) * 0x100401;
            }
            n5 += n6 - n3;
            n7 += this.mAJakka - n3;
            ++n8;
        }
    }

    public void setProperties(Hashtable hashtable) {
    }
}

