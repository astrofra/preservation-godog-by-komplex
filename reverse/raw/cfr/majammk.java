/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.MemoryImageSource;
import java.util.Enumeration;
import java.util.Vector;
import muhmu.hifi.device.MAD;

public class majammk
extends Canvas
implements Runnable {
    Vector aJAKKaM;
    boolean AjaKKaM;
    boolean ajaKKaM;
    Thread AJaKKaM;
    boolean aJaKKaM;
    public static boolean AjAkkaM;
    Font ajAkkaM;
    Color AJAkkaM;
    int aJAkkaM;
    public MAD AjakkaM;
    long ajakkaM;
    long AJakkaM;
    int aJakkaM;
    int AjAKkaM;
    int ajAKkaM;

    /*
     * Exception decompiling
     */
    public majammk(boolean var1_1, boolean var2_2) {
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

    public void AkkAMAJ() {
        this.AJaKKaM = new Thread(this, "Muhmu Tunari");
        this.AJaKKaM.start();
    }

    public synchronized void aKkAMAJ() {
        if (this.aJaKKaM) {
            return;
        }
        try {
            this.wait();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public void AKkAMAJ(long l) {
        if (AjAkkaM) {
            return;
        }
        try {
            Thread.sleep(l);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public void paint(Graphics graphics) {
        graphics.setColor(Color.yellow);
        graphics.drawRect(0, 0, this.bounds().width - 1, this.bounds().height - 1);
        graphics.setFont(this.ajAkkaM);
        graphics.setColor(this.AJAkkaM);
        Enumeration enumeration = this.aJAKKaM.elements();
        if (enumeration != null) {
            while (enumeration.hasMoreElements()) {
                kmajmka kmajmka2 = (kmajmka)enumeration.nextElement();
                kmajmka2.KAmajak(graphics);
            }
        }
    }

    public synchronized void run() {
        try {
            String string;
            this.aJAKKaM.addElement(new kmajmka("muhmu tuner (c) saviour", 10, this.aJAkkaM += 15));
            this.aJAKKaM.addElement(new kmajmka("measuring optimal parameters for this setup", 10, this.aJAkkaM += 15));
            this.paint(this.getGraphics());
            if (this.AjaKKaM) {
                this.AKkAMAJ(1000L);
                this.ajakkaM = this.akKamAJ();
                this.aJAKKaM.addElement(new kmajmka("kunigas zoom blit " + this.ajakkaM + "ms", 10, this.aJAkkaM += 15));
                ((Component)this).update(this.getGraphics());
                this.AKkAMAJ(1000L);
                this.AJakkaM = this.AkKamAJ();
                this.aJAKKaM.addElement(new kmajmka("normal zoom blit " + this.AJakkaM + "ms", 10, this.aJAkkaM += 15));
                ((Component)this).update(this.getGraphics());
                this.AKkAMAJ(500L);
                if (this.ajakkaM < this.AJakkaM) {
                    string = "kunigas";
                    kmjjmmk.JAkKamA = true;
                } else {
                    string = "normal";
                    kmjjmmk.JAkKamA = false;
                }
                this.aJAKKaM.addElement(new kmajmka("choosing " + string + " mode", 10, this.aJAkkaM += 15));
                this.paint(this.getGraphics());
                System.out.println("kunigas=" + kmjjmmk.JAkKamA);
            }
            this.AKkAMAJ(1000L);
            if (!this.ajaKKaM) {
                MAD mAD = null;
                MAD mAD2 = null;
                MAD mAD3 = null;
                mAD = MAD.getDevice_IE4();
                this.aJAKKaM.addElement(new kmajmka("ie4 audio " + (mAD == null ? "not " : "") + "found", 10, this.aJAkkaM += 15));
                this.paint(this.getGraphics());
                this.AKkAMAJ(500L);
                mAD2 = MAD.getDevice_IE3();
                this.aJAKKaM.addElement(new kmajmka("ie3 audio " + (mAD2 == null ? "not " : "") + "found", 10, this.aJAkkaM += 15));
                this.paint(this.getGraphics());
                this.AKkAMAJ(500L);
                mAD3 = MAD.getDevice_Sun();
                this.aJAKKaM.addElement(new kmajmka("sun audio " + (mAD3 == null ? "not " : "") + "found", 10, this.aJAkkaM += 15));
                this.paint(this.getGraphics());
                if (mAD != null) {
                    this.AjakkaM = mAD;
                    string = "IE4 directsound";
                } else if (mAD2 != null) {
                    this.AjakkaM = mAD2;
                    string = "IE3 directsound";
                } else if (mAD3 != null) {
                    this.AjakkaM = mAD3;
                    string = "sun 8khz crap";
                } else {
                    this.AjakkaM = MAD.getDevice_NOS();
                    string = "no sound";
                }
            } else {
                this.AjakkaM = MAD.getDevice_NOS();
                string = "no audio";
            }
            this.AKkAMAJ(500L);
            this.aJAKKaM.addElement(new kmajmka("choosing " + string, 10, this.aJAkkaM += 15));
            this.paint(this.getGraphics());
            this.aJAKKaM.addElement(new kmajmka("OK. ready to rab!", 10, 190));
            this.paint(this.getGraphics());
            this.AKkAMAJ(1500L);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.aJaKKaM = true;
        this.notifyAll();
    }

    long akKamAJ() {
        Graphics graphics = this.getGraphics();
        int[] nArray = new int[this.aJakkaM * this.AjAKkaM];
        Image image = this.createImage(new MemoryImageSource(this.aJakkaM, this.AjAKkaM, (ColorModel)new DirectColorModel(24, 0xFF0000, 65280, 255), nArray, 0, this.aJakkaM));
        Image image2 = this.createImage(this.aJakkaM, this.AjAKkaM);
        this.akkAMAJ(nArray, this.aJakkaM, this.AjAKkaM, 0, 0, this.aJakkaM - 1, this.AjAKkaM - 1, 0xFFFFFF);
        long l = System.currentTimeMillis();
        int n = 0;
        while (n < this.ajAKkaM) {
            int n2 = n * 3;
            this.akkAMAJ(nArray, this.aJakkaM, this.AjAKkaM, n2, n2, this.aJakkaM - 1 - n2 * 2, this.AjAKkaM - 1 - n2 * 2, 0xFFFFFF);
            image.flush();
            image2.getGraphics().drawImage(image, 0, 0, null);
            graphics.drawImage(image2, 0, 0, this.aJakkaM * 2, this.AjAKkaM * 2, Color.black, null);
            ++n;
        }
        long l2 = System.currentTimeMillis();
        return (l2 - l) / (long)this.ajAKkaM;
    }

    long AkKamAJ() {
        Graphics graphics = this.getGraphics();
        int[] nArray = new int[this.aJakkaM * this.AjAKkaM];
        Image image = this.createImage(new MemoryImageSource(this.aJakkaM, this.AjAKkaM, (ColorModel)new DirectColorModel(24, 0xFF0000, 65280, 255), nArray, 0, this.aJakkaM));
        this.akkAMAJ(nArray, this.aJakkaM, this.AjAKkaM, 0, 0, this.aJakkaM - 1, this.AjAKkaM - 1, 0xFFFFFF);
        long l = System.currentTimeMillis();
        int n = 0;
        while (n < this.ajAKkaM) {
            int n2 = n * 3;
            this.akkAMAJ(nArray, this.aJakkaM, this.AjAKkaM, n2, n2, this.aJakkaM - 1 - n2 * 2, this.AjAKkaM - 1 - n2 * 2, 0xFFFFFF);
            image.flush();
            graphics.drawImage(image, 0, 0, this.aJakkaM * 2, this.AjAKkaM * 2, Color.black, null);
            ++n;
        }
        long l2 = System.currentTimeMillis();
        return (l2 - l) / (long)this.ajAKkaM;
    }

    void akkAMAJ(int[] nArray, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = n3;
        while (n8 < n3 + n5 + 1) {
            nArray[n4 * n + n8] = n7;
            nArray[(n4 + n6) * n + n8] = n7;
            ++n8;
        }
        int n9 = n4 + 1;
        while (n9 < n4 + n6) {
            nArray[n9 * n + n3] = n7;
            nArray[n9 * n + n3 + n5] = n7;
            ++n9;
        }
    }
}

