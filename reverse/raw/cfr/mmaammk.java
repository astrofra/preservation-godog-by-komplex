/*
 * Decompiled with CFR 0.152.
 */
public class mmaammk
extends mmaakkk {
    public boolean aJAkkAM;
    public int AjakkAM;

    /*
     * Exception decompiling
     */
    public mmaammk() {
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

    public mmaammk(mmaakkk mmaakkk2) {
        super(mmaakkk2);
        this.aJAkkAM = true;
    }

    public void AkKAmAJ() {
        int n = 0;
        while (n < this.maJakka.length) {
            kajjkka kajjkka2 = this.maJakka[n];
            int n2 = this.maJakka.length - 1;
            while (n2 > n) {
                kajjkka kajjkka3 = this.maJakka[n2];
                if (kajjkka2.amAJAkk.kaMAjAK == kajjkka3.amAJAkk.kaMAjAK && kajjkka2.amAJAkk.KAMAjAK == kajjkka3.amAJAkk.KAMAjAK && kajjkka2.amAJAkk.KaMAjAK == kajjkka3.amAJAkk.KaMAjAK) {
                    if (kajjkka2.AMAJAkk.kaMAjAK == kajjkka3.AMAJAkk.kaMAjAK && kajjkka2.AMAJAkk.KAMAjAK == kajjkka3.AMAJAkk.KAMAjAK && kajjkka2.AMAJAkk.KaMAjAK == kajjkka3.AMAJAkk.KaMAjAK) {
                        this.maJakka[n].aMaJAkk |= 1;
                    } else if (kajjkka2.aMAJAkk.kaMAjAK == kajjkka3.aMAJAkk.kaMAjAK && kajjkka2.aMAJAkk.KAMAjAK == kajjkka3.aMAJAkk.KAMAjAK && kajjkka2.aMAJAkk.KaMAjAK == kajjkka3.aMAJAkk.KaMAjAK) {
                        this.maJakka[n].aMaJAkk |= 4;
                    }
                }
                if (kajjkka2.AMAJAkk.kaMAjAK == kajjkka3.AMAJAkk.kaMAjAK && kajjkka2.AMAJAkk.KAMAjAK == kajjkka3.AMAJAkk.KAMAjAK && kajjkka2.AMAJAkk.KaMAjAK == kajjkka3.AMAJAkk.KaMAjAK && kajjkka2.aMAJAkk.kaMAjAK == kajjkka3.aMAJAkk.kaMAjAK && kajjkka2.aMAJAkk.KAMAjAK == kajjkka3.aMAJAkk.KAMAjAK && kajjkka2.aMAJAkk.KaMAjAK == kajjkka3.aMAJAkk.KaMAjAK) {
                    this.maJakka[n].aMaJAkk |= 2;
                }
                if (this.maJakka[n].aMaJAkk != 0) break;
                --n2;
            }
            ++n;
        }
    }

    public void JaKkama(mmjjmkk mmjjmkk2, int n) {
        if (!this.MaJakka) {
            return;
        }
        this.MajAkka = mmjjmkk2;
        this.MAjAkka = kaaamma.AmAjaKK;
        this.jakkAma();
        if (this.maJAkka) {
            this.JakKaMA();
        }
        if (this.MAJAKKa != 0) {
            this.JakkaMA();
            this.jaKKaMA();
            return;
        }
        if (this.aJAkkAM) {
            this.JAkkama();
            this.jAkKAma();
            this.jAkkAma();
            return;
        }
        this.JAKkaMA();
        this.aKkamAJ();
    }

    public void aKkamAJ() {
        this.akKAmAJ(this.maJakka, this.maJakka.length);
    }

    public void akKAmAJ(kajjkka[] kajjkkaArray, int n) {
        kajjkka[] kajjkkaArray2 = kaaamma.aMaJAKK;
        int n2 = kaaamma.AmAjaKK;
        int n3 = 0;
        while (n3 < n) {
            kajjkka kajjkka2 = kajjkkaArray[n3++];
            kajjkka2.aMajakk = -(kajjkka2.amAJAkk.KaMAjAK + kajjkka2.AMAJAkk.KaMAjAK + kajjkka2.aMAJAkk.KaMAjAK + (float)this.AjakkAM);
            kajjkkaArray2[n2++] = kajjkka2;
        }
        kaaamma.AmAjaKK = n2;
    }

    public void jAKkama(kajjkka[] kajjkkaArray, int n) {
        kajjkka[] kajjkkaArray2 = kaaamma.aMaJAKK;
        int n2 = kaaamma.AmAjaKK;
        kaajmma kaajmma2 = this.jakKaMA();
        float f = kaajmma2.MajaKka;
        float f2 = kaajmma2.majaKka;
        float f3 = kaajmma2.MAjaKka;
        int n3 = 0;
        while (n3 < n) {
            kajjkka kajjkka2 = kajjkkaArray[n3++];
            int n4 = 37449 + kajjkka2.amAJAkk.kAMAjAK + kajjkka2.AMAJAkk.kAMAjAK + kajjkka2.aMAJAkk.kAMAjAK;
            if ((n4 & 0x34924) == 0) {
                if (!((f + kajjkka2.amAJAkk.MajaKka) * kajjkka2.AmaJAKK + (f2 + kajjkka2.amAJAkk.majaKka) * kajjkka2.amaJAKK + (f3 + kajjkka2.amAJAkk.MAjaKka) * kajjkka2.AMaJAKK < 0.0f)) continue;
                kajjkka2.aMajakk = -(kajjkka2.amAJAkk.KaMAjAK + kajjkka2.AMAJAkk.KaMAjAK + kajjkka2.aMAJAkk.KaMAjAK + (float)this.AjakkAM);
                kajjkkaArray2[n2++] = kajjkka2;
                continue;
            }
            if ((n4 & 0x24924) != 0 || (n4 & 0x30000) == 0 || !((f + kajjkka2.amAJAkk.MajaKka) * kajjkka2.AmaJAKK + (f2 + kajjkka2.amAJAkk.majaKka) * kajjkka2.amaJAKK + (f3 + kajjkka2.amAJAkk.MAjaKka) * kajjkka2.AMaJAKK < 0.0f)) continue;
            kajjkka2.aMajakk = -(kajjkka2.amAJAkk.KaMAjAK + kajjkka2.AMAJAkk.KaMAjAK + kajjkka2.aMAJAkk.KaMAjAK + (float)this.AjakkAM);
            this.JaKKAma(kajjkka2);
        }
        kaaamma.AmAjaKK = n2;
    }
}

