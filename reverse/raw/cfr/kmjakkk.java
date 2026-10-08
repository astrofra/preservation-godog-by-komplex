/*
 * Decompiled with CFR 0.152.
 */
public class kmjakkk
extends Thread {
    int mAjakKA;
    mmjjkkk[] MaJAkKA;
    mmaakma maJAkKA;
    int MAJAkKA;
    int mAJAkKA;
    long MajAkKA;

    /*
     * Exception decompiling
     */
    public kmjakkk(int var1_1, mmaakma var2_2) {
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

    public void jakKAMA(int n, String string) {
        this.MaJAkKA[this.mAjakKA++] = new mmjjkkk(n, string);
    }

    public void JakKAMA(int n, long l) {
        mmjjkkk mmjjkkk2;
        float f;
        while (true) {
            if (this.MAJAkKA >= this.mAjakKA) {
                return;
            }
            f = n;
            mmjjkkk2 = this.MaJAkKA[this.MAJAkKA];
            if (f != mmjjkkk2.aMajakk) break;
            mmjjkkk2.ajakkam = l;
            if (this.MAJAkKA == this.mAJAkKA) {
                this.JAkKAMA();
            }
            ++this.MAJAkKA;
        }
        if (f > mmjjkkk2.aMajakk) {
            return;
        }
    }

    synchronized void JAkKAMA() {
        this.notify();
    }

    public void start() {
        new mmjjmma(this.MaJAkKA).mAJakkA(this.mAjakKA);
        this.mAJAkKA = 0;
        super.start();
    }

    public synchronized void run() {
        try {
            this.mAJAkKA = 0;
            while (this.mAJAkKA < this.mAjakKA) {
                long l;
                mmjjkkk mmjjkkk2 = this.MaJAkKA[this.mAJAkKA];
                if (mmjjkkk2.ajakkam == 0L) {
                    this.wait();
                }
                if ((l = mmjjkkk2.ajakkam - System.currentTimeMillis()) > 0L) {
                    Thread.sleep(l);
                }
                if (this.maJAkKA != null) {
                    this.maJAkKA.maJaKkA((int)mmjjkkk2.aMajakk, mmjjkkk2.AJakkam);
                } else {
                    System.out.println(mmjjkkk2.AJakkam);
                }
                ++this.mAJAkKA;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        System.out.println("muhmupipe/muhmuscript finished. (c) saviour.");
    }
}

