/*
 * Decompiled with CFR 0.152.
 */
import java.applet.Applet;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.io.DataInputStream;
import java.net.URL;
import java.util.Vector;

public abstract class kmaamma
extends Applet {
    public boolean amaJakK;
    public boolean AMaJakK;
    public Thread aMaJakK;
    kmaamma AmAjAKK;

    /*
     * Exception decompiling
     */
    public kmaamma() {
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

    public boolean amajAKK() {
        return this.AMaJakK;
    }

    public void AmAJAKK() {
        if (this.AMaJakK) {
            this.aMaJakK.resume();
            this.AMaJakK = false;
            return;
        }
        this.aMaJakK.suspend();
        this.AMaJakK = true;
    }

    public void aMaJAKK() {
        this.amAJAKK(null);
    }

    public void amAJAKK(String[] stringArray) {
        this.amaJAKK(stringArray, 320, 240);
    }

    public void amaJAKK(String[] stringArray, int n, int n2) {
        kmajmmk kmajmmk2 = new kmajmmk();
        this.AmAjAKK = this;
        this.AmAjAKK.setStub(kmajmmk2);
        if (stringArray != null) {
            int n3 = 0;
            while (n3 < stringArray.length - 1) {
                kmajmmk2.AkKamaJ(stringArray[n3], stringArray[n3 + 1]);
                n3 += 2;
            }
        }
        kaaakmk kaaakmk2 = null;
        kaaakmk2 = new kaaakmk(this.getClass().getName());
        kaaakmk2.show();
        Insets insets = kaaakmk2.insets();
        int n4 = insets.left + insets.right + n;
        int n5 = insets.top + insets.bottom + n2;
        Dimension dimension = this.getToolkit().getScreenSize();
        int n6 = (dimension.width - n) / 2;
        int n7 = (dimension.height - n2) / 2;
        ((Component)kaaakmk2).reshape(n6, n7, n4, n5);
        kaaakmk2.add("Center", this.AmAjAKK);
        this.AmAjAKK.amaJakK = true;
        this.AmAjAKK.init();
        kaaakmk2.show();
        this.AmAjAKK.start();
    }

    public void finalize() {
        this.AmAjAKK.stop();
    }

    public void start() {
        if (this instanceof Runnable) {
            Runnable runnable = (Runnable)((Object)this);
            if (this.aMaJakK == null) {
                this.aMaJakK = new Thread(runnable, "Muhmu BaseApplet runner - " + runnable);
                this.aMaJakK.start();
            }
        }
    }

    public void stop() {
        if (this instanceof Runnable && this.aMaJakK != null) {
            this.aMaJakK.stop();
            this.aMaJakK = null;
            System.out.println("baseapplet: runner stopped");
        }
    }

    public byte[] AmaJAKK(URL uRL) {
        Vector<byte[]> vector = new Vector<byte[]>(10);
        int n = 65536;
        int n2 = 0;
        try {
            DataInputStream dataInputStream = new DataInputStream(uRL.openConnection().getInputStream());
            int n3 = 0;
            block2: while (n3 != -1) {
                byte[] byArray = new byte[n];
                int n4 = 0;
                vector.addElement(byArray);
                while (n4 < n) {
                    n3 = dataInputStream.read(byArray, n4, n - n4);
                    if (n3 < 0) continue block2;
                    n4 += n3;
                    n2 += n3;
                }
            }
        }
        catch (Exception exception) {
            vector.removeAllElements();
            vector = null;
            return null;
        }
        int n5 = 0;
        byte[] byArray = new byte[n2];
        int n6 = 0;
        while (n5 < n2) {
            byte[] byArray2 = (byte[])vector.elementAt(n6++);
            if (n2 - n5 >= n) {
                System.arraycopy(byArray2, 0, byArray, n5, n);
                n5 += n;
                continue;
            }
            System.arraycopy(byArray2, 0, byArray, n5, n2 - n5);
            n5 = n2;
        }
        vector.removeAllElements();
        vector = null;
        return byArray;
    }

    public URL AmAjaKK(String string) {
        return this.AMAjaKK(this.getCodeBase(), string);
    }

    public URL aMajAKK(String string) {
        return this.AMAjaKK(this.getDocumentBase(), string);
    }

    public URL AMAjaKK(URL uRL, String string) {
        if (this.amaJakK) {
            if ((string = string.replace('\\', '/')).charAt(0) == '/') {
                if (uRL.getFile().charAt(2) == ':') {
                    try {
                        return new URL("file:///" + uRL.getFile().substring(0, 3) + string);
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                        return null;
                    }
                }
                try {
                    return new URL("file:///" + string);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return null;
                }
            }
            if (string.charAt(1) == ':') {
                try {
                    return new URL("file:///" + string);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return null;
                }
            }
            try {
                return new URL(uRL, string);
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return null;
            }
        }
        try {
            return new URL(uRL, string);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public String getParameter(String string) {
        return this.AMaJAKK(string, null);
    }

    public String AMaJAKK(String string, String string2) {
        String string3 = null;
        string3 = super.getParameter(string);
        if (string3 == null) {
            string3 = string2;
        }
        return string3;
    }

    public int amAjaKK(String string, int n) {
        try {
            return Integer.parseInt(this.AMaJAKK(string, null));
        }
        catch (Exception exception) {
            return n;
        }
    }

    public long AMajAKK(String string, long l) {
        try {
            return Long.parseLong(this.AMaJAKK(string, null));
        }
        catch (Exception exception) {
            return l;
        }
    }

    public float AMAJAKK(String string, float f) {
        try {
            return Float.valueOf(this.AMaJAKK(string, null)).floatValue();
        }
        catch (Exception exception) {
            return f;
        }
    }

    public double aMAJAKK(String string, double d) {
        try {
            return Double.valueOf(this.AMaJAKK(string, null));
        }
        catch (Exception exception) {
            return d;
        }
    }
}

