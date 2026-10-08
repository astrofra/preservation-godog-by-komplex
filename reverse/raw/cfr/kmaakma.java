/*
 * Decompiled with CFR 0.152.
 */
import java.applet.Applet;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageProducer;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.URL;

public final class kmaakma {
    public static Toolkit MajAKkA;
    public static Applet majAKkA;
    public static final byte[] MAjAKkA;

    /*
     * Exception decompiling
     */
    public static final int majaKkA() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Attempt to fetch element 0 from constant pool
         *     at org.benf.cfr.reader.entities.constantpool.ConstantPool.getEntry(ConstantPool.java:155)
         *     at org.benf.cfr.reader.entities.constantpool.ConstantPool.getUTF8Entry(ConstantPool.java:164)
         *     at org.benf.cfr.reader.bytecode.analysis.variables.VariableNamerHinted.getName(VariableNamerHinted.java:60)
         *     at org.benf.cfr.reader.bytecode.analysis.parse.lvalue.LocalVariable.<init>(LocalVariable.java:34)
         *     at org.benf.cfr.reader.bytecode.analysis.types.MethodPrototype.computeParameters(MethodPrototype.java:410)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.discoverStorageLiveness(Op02WithProcessedDataAndRefs.java:2010)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:461)
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

    public static final int maJAKkA(double d, double d2, double d3, double d4, double d5, double[] dArray) {
        double d6 = d * d + d3 / d4;
        double d7 = 2.0 * d * d2;
        double d8 = d2 * d2 - d5 * d5 / d4;
        return kmaakma.majaKkA(d6, d7, d8, dArray);
    }

    public static final synchronized kmaakka MAjaKkA(URL uRL) {
        Image image = majAKkA == null ? Toolkit.getDefaultToolkit().getImage(uRL) : majAKkA.getImage(uRL);
        if (image == null) {
            System.err.println("couldn't fetch image " + uRL);
            return null;
        }
        kmjjkmk kmjjkmk2 = new kmjjkmk();
        ImageProducer imageProducer = image.getSource();
        if (imageProducer == null) {
            System.err.println("couldn't fetch image " + uRL);
            return null;
        }
        imageProducer.startProduction(kmjjkmk2);
        kmjjkmk2.KkAmAJA();
        image = null;
        if (!kmjjkmk2.kKaMajA()) {
            System.err.println("error fetching image " + uRL);
            return null;
        }
        return kmjjkmk2.KKaMAJa;
    }

    public static final kmaakka mAJaKkA(URL uRL) {
        try {
            InputStream inputStream = uRL.openConnection().getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            dataInputStream.skip(8L);
            int n = dataInputStream.read();
            int n2 = dataInputStream.read();
            int n3 = dataInputStream.read();
            int n4 = dataInputStream.read();
            int n5 = dataInputStream.read();
            int n6 = dataInputStream.read();
            int n7 = (n << 8) + n2;
            int n8 = (n3 << 8) + n4;
            int n9 = (n5 << 8) + n6;
            System.out.println("w=" + n7 + " h=" + n8 + " c=" + n9);
            dataInputStream.skip(18L);
            if (n9 == 0) {
                byte[] byArray = new byte[n7 * 3];
                int[] nArray = new int[n7 * n8];
                int n10 = 0;
                int n11 = 0;
                while (n11 < n8) {
                    dataInputStream.readFully(byArray);
                    int n12 = 0;
                    int n13 = 0;
                    while (n13 < n7) {
                        nArray[n10++] = 0xFF000000 | (byArray[n12++] << 16 & 0xFF0000 | byArray[n12++] << 8 & 0xFF00 | byArray[n12++] & 0xFF);
                        ++n13;
                    }
                    ++n11;
                }
                mmajkka mmajkka2 = new mmajkka(n7, n8, nArray);
                nArray = null;
                return mmajkka2;
            }
            byte[] byArray = new byte[n9 * 3];
            byte[] byArray2 = new byte[n7 * n8];
            dataInputStream.readFully(byArray);
            dataInputStream.readFully(byArray2);
            byte[] byArray3 = new byte[256];
            byte[] byArray4 = new byte[256];
            byte[] byArray5 = new byte[256];
            int n14 = 0;
            while (n14 < n9) {
                byArray3[n14] = byArray[n14 * 3];
                byArray4[n14] = byArray[n14 * 3 + 1];
                byArray5[n14] = byArray[n14 * 3 + 2];
                ++n14;
            }
            maaakka maaakka2 = new maaakka(n7, n8, byArray2, byArray3, byArray4, byArray5);
            byArray5 = null;
            byArray4 = null;
            byArray3 = null;
            byArray2 = null;
            return maaakka2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static final int MAJaKkA(int n, int n2, int n3, int n4, int n5, int n6, float f) {
        float f2 = n & 0xFF;
        float f3 = n2 & 0xFF;
        float f4 = n3 & 0xFF;
        float f5 = n4 & 0xFF;
        float f6 = n5 & 0xFF;
        float f7 = n6 & 0xFF;
        return kmaakma.mAjaKkA(f2, f3, f4, f5, f6, f7, f);
    }

    public static final int mAjaKkA(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = 1.0f - f7;
        int n = (int)(f7 * f + f8 * f4) & 0xFF;
        int n2 = (int)(f7 * f2 + f8 * f5) & 0xFF;
        int n3 = (int)(f7 * f3 + f8 * f6) & 0xFF;
        return n << 16 | n2 << 8 | n3;
    }

    public static final int MajaKkA(double d) {
        return (int)d;
    }

    public static final int MaJAKkA(float f) {
        return (int)f;
    }

    public kmaakma() {
        super();
    }

    static {
        byte[] byArray = new byte[8];
        byArray[0] = 109;
        byArray[1] = 104;
        byArray[2] = 119;
        byArray[3] = 97;
        byArray[4] = 110;
        byArray[5] = 104;
        byArray[7] = 4;
        MAjAKkA = byArray;
    }
}

