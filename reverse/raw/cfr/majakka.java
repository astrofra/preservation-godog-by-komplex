/*
 * Decompiled with CFR 0.152.
 */
public class majakka
extends mmaakmk {
    mmjammk amajAKk;
    kmajkkk AMajAKk;
    kmajkkk aMajAKk;
    int AmAJAKk;
    int amAJAKk;
    int AMAJAKk;
    boolean aMAJAKk;

    /*
     * Exception decompiling
     */
    majakka() {
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

    public void AMaJAKk(mmjammk mmjammk2, int n) {
        this.amajAKk = mmjammk2;
        if (this.amajAKk == null) {
            this.AMajAKk.JAkkAmA(null);
            this.aMajAKk.JAkkAmA(null);
            this.KKAmaJa();
            return;
        }
        this.AMajAKk.JAkkAmA(this.amajAKk.JaKKAMa);
        this.aMajAKk.JAkkAmA(this.amajAKk.jaKKAMa);
        this.aMaJAKk();
        int n2 = n < 0 ? 0 : (n > 95 ? 95 : n);
        kmaamka kmaamka2 = this.amajAKk.jAkkAMa[n2];
        super.KKaMAJa(kmaamka2, n);
    }

    public void kkAMAJa() {
        if (this.amajAKk == null) {
            return;
        }
        super.kkAMAJa();
    }

    public void KKAmaJa() {
        if (this.amajAKk != null && this.AMajAKk.AjAkkAm) {
            this.AMajAKk.JakkAmA();
            return;
        }
        super.KKAmaJa();
    }

    void aMaJAKk() {
        if (this.amajAKk.jAKKAMa > 0) {
            this.aMAJAKk = true;
            this.AmAJAKk = 0;
            this.amAJAKk = this.amajAKk.JakKAMa == 0 ? this.amajAKk.jAKKAMa : 0;
            this.amaJAKk();
            return;
        }
        this.aMAJAKk = false;
    }

    int amaJAKk() {
        if (this.amajAKk.JakKAMa != 0) {
            this.amAJAKk += this.amajAKk.jAKKAMa / this.amajAKk.JakKAMa;
            if (this.amAJAKk > this.amajAKk.jAKKAMa) {
                this.amAJAKk = this.amajAKk.jAKKAMa;
            }
        }
        int n = 0;
        switch (this.amajAKk.jakKAMa) {
            case 3: {
                n = (64 - (this.AmAJAKk >> 1) & 0x7F) - 64;
                break;
            }
            case 2: {
                n = (64 + (this.AmAJAKk >> 1) & 0x7F) - 64;
                break;
            }
            case 1: {
                n = (this.AmAJAKk & 0x80) != 0 ? 64 : -64;
                break;
            }
            case 0: {
                n = mmaakmk.aKKAmAj[this.AmAJAKk & 0xFF];
                break;
            }
        }
        this.AmAJAKk += this.amajAKk.JAKKAMa >> 2;
        return n * this.amAJAKk >> 10;
    }

    public void AmAjaKk() {
        byte by;
        if (this.AMajAKk.AjAkkAm) {
            by = this.AMajAKk.jAkkAmA();
            this.KKamaJa(by * this.aKkAMaj >> 6);
        }
        if (this.aMajAKk.AjAkkAm) {
            by = this.aMajAKk.jAkkAmA();
            int n = this.AkKamaj < 128 ? this.AkKamaj : 255 - this.AkKamaj;
            n = (by - 32) * n >> 5;
            this.kkamaJa(this.akKamaj + n);
        }
        if (this.aMAJAKk) {
            this.AMAJAKk = this.amaJAKk();
            this.KKamAJa(this.AMAJAKk);
        }
    }
}

