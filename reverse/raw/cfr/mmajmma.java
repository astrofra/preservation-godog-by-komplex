/*
 * Decompiled with CFR 0.152.
 */
import java.util.Enumeration;
import java.util.Hashtable;
import muhmu.hifi.device.MAD;
import muhmu.hifi.device.Mixable;

public class mmajmma
implements Mixable {
    Hashtable MaJAKKA;
    int maJAKKA;
    majamma MAJAKKA;
    float mAJAKKA;
    float MajAKKA;
    public long majAKKA;

    /*
     * Exception decompiling
     */
    public mmajmma() {
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

    public synchronized void MAjAkkA() {
        this.MaJAKKA.clear();
    }

    public void mAjAkkA(majamma majamma2) {
        this.MAJAKKA = majamma2;
    }

    void MAJAkkA(float f) {
        this.MajAKKA = 1.0f / f;
    }

    void MaJaKKA(float f) {
        this.MajAKKA = f;
    }

    synchronized void MajAkkA(int n, Mixable mixable) {
        this.MaJAKKA.put(new Integer(n), mixable);
    }

    synchronized void majAkkA(Mixable mixable) {
        this.MaJAKKA.put(new Integer(this.maJAKKA), mixable);
        --this.maJAKKA;
        if (this.maJAKKA == Integer.MIN_VALUE) {
            this.maJAKKA = -1;
        }
    }

    public synchronized boolean mix(MAD mAD, int[] nArray, int n, int n2) {
        int n3 = (int)this.mAJAKKA;
        if (n3 >= nArray.length) {
            this.mAJAkkA(mAD, nArray, 0, nArray.length);
        } else {
            int n4 = 0;
            while (n4 < nArray.length) {
                if (n3 > nArray.length) {
                    this.mAJAkkA(mAD, nArray, n4, nArray.length);
                    n4 = nArray.length;
                    continue;
                }
                this.mAJAkkA(mAD, nArray, n4, n3);
                n4 = n3;
                this.majAKKA = mAD.bufferStartTime + (long)(n4 * 1000 / mAD.frequency);
                if (this.MAJAKKA != null) {
                    this.MAJAKKA.MAjakKa(this);
                }
                this.mAJAKKA += this.MajAKKA * (float)mAD.frequency;
                n3 = (int)this.mAJAKKA;
            }
        }
        this.mAJAKKA -= (float)nArray.length;
        return true;
    }

    public synchronized void mAJAkkA(MAD mAD, int[] nArray, int n, int n2) {
        Enumeration enumeration = this.MaJAKKA.elements();
        if (enumeration == null) {
            return;
        }
        Enumeration enumeration2 = this.MaJAKKA.keys();
        while (enumeration.hasMoreElements()) {
            Mixable mixable = (Mixable)enumeration.nextElement();
            Object k = enumeration2.nextElement();
            boolean bl = mixable.mix(mAD, nArray, n, n2);
            if (bl) continue;
            this.MaJAKKA.remove(k);
        }
    }
}

