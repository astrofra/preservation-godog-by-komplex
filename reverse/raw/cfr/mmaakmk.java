/*
 * Decompiled with CFR 0.152.
 */
import muhmu.hifi.device.MAD;
import muhmu.hifi.device.Mixable;

public class mmaakmk
implements Mixable {
    kmaamka akkAMaj;
    int AKkAMaj = 64;
    int aKkAMaj = 64;
    int AkKamaj = 128;
    int akKamaj = 128;
    int AKKamaj;
    int aKKamaj = -1;
    int Akkamaj;
    int akkamaj;
    int AKkamaj;
    boolean aKkamaj = true;
    static final byte AkKAmaj = 1;
    static final byte akKAmaj = 2;
    static final byte AKKAmaj = 3;
    static final byte aKKAmaj = 4;
    static final byte AkkAmaj = 5;
    static final byte akkAmaj = 6;
    static final byte AKkAmaj = 7;
    static final byte aKkAmaj = 8;
    static final byte AkKaMAj = 9;
    static final byte akKaMAj = 10;
    static final byte AKKaMAj = 11;
    byte aKKaMAj;
    int AkkaMAj;
    int akkaMAj;
    int AKkaMAj;
    int aKkaMAj;
    int AkKAMAj;
    int akKAMAj;
    int AKKAMAj;
    int[] aKKAMAj = new int[3];
    int AkkAMAj;
    int akkAMAj;
    int AKkAMAj;
    int aKkAMAj;
    int AkKamAj;
    int akKamAj;
    int AKKamAj;
    int aKKamAj;
    int AkkamAj;
    int akkamAj;
    int AKkamAj;
    int aKkamAj;
    int AkKAmAj;
    static final int[] akKAmAj;
    static final int[] AKKAmAj;
    static final int[] aKKAmAj;

    /*
     * Exception decompiling
     */
    public void kKaMAJa(boolean var1_1) {
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

    public void KkaMAJa(int n) {
        this.AKkAMaj = n <= 0 ? 0 : (n > 64 ? 64 : n);
        this.aKkAMaj = this.AKkAMaj;
    }

    public void kkAmaJa(int n) {
        int n2 = this.AKkAMaj + n;
        this.aKkAMaj = n2 <= 0 ? 0 : (n2 > 64 ? 64 : n2);
    }

    public void kKAmaJa(int n) {
        int n2 = this.aKkAMaj + n;
        this.aKkAMaj = n2 <= 0 ? 0 : (n2 > 64 ? 64 : n2);
    }

    public void KKamaJa(int n) {
        this.aKkAMaj = n <= 0 ? 0 : (n > 64 ? 64 : n);
    }

    public void KkAmaJa(int n) {
        this.akkamaj = this.Akkamaj = n;
        this.AKkamaj = kmaamka.kKaMAjA(this.akkamaj);
    }

    public void kkamAJa(int n) {
        this.akkamaj = this.Akkamaj + n;
        this.AKkamaj = kmaamka.kKaMAjA(this.akkamaj);
    }

    public void KKamAJa(int n) {
        this.akkamaj += n;
        this.AKkamaj = kmaamka.kKaMAjA(this.akkamaj);
    }

    public void kKAMAJa(int n) {
        this.AkKamaj = n <= 0 ? 0 : (n > 255 ? 255 : n);
        this.akKamaj = this.AkKamaj;
    }

    public void kkamaJa(int n) {
        this.akKamaj = n <= 0 ? 0 : (n > 255 ? 255 : n);
    }

    public void kkaMAJa(int n) {
        int n2 = this.AkKamaj + n;
        this.akKamaj = n2 <= 0 ? 0 : (n2 > 255 ? 255 : n2);
    }

    public void KKaMAJa(kmaamka kmaamka2, int n) {
        this.KkamaJa(kmaamka2, n, true);
    }

    public void KkamaJa(kmaamka kmaamka2, int n, boolean bl) {
        if (kmaamka2 == null) {
            this.KKAmaJa();
            return;
        }
        this.akkAMaj = kmaamka2;
        this.KkAmaJa(this.akkAMaj.KkaMAjA(n));
        if (bl) {
            this.KkaMAJa(this.akkAMaj.KKAMAja);
        }
        this.aKKamaj = 0;
        this.AkKamaj = this.akkAMaj.kKaMAja;
    }

    public void KkamAJa() {
        this.KKAMAJa(true);
    }

    public void KKAMAJa(boolean bl) {
        if (this.akkAMaj == null) {
            return;
        }
        if (bl) {
            this.KkaMAJa(this.akkAMaj.KKAMAja);
        }
        this.aKKamaj = 0;
        this.AkKamaj = this.akkAMaj.kKaMAja;
    }

    public void kKamAJa(int n, boolean bl) {
        if (this.akkAMaj == null) {
            return;
        }
        this.KkAmaJa(this.akkAMaj.KkaMAjA(n));
        if (bl) {
            this.KkaMAJa(this.akkAMaj.KKAMAja);
        }
        this.aKKamaj = 0;
        this.AkKamaj = this.akkAMaj.kKaMAja;
    }

    public void kkAMAJa() {
        if (this.akkAMaj == null) {
            return;
        }
        this.KkaMAJa(this.akkAMaj.KKAMAja);
    }

    public void KKAmaJa() {
        this.aKKamaj = -1;
    }

    public void KkAMAJa(int n) {
        if (this.akkAMaj == null) {
            return;
        }
        if (n >= this.akkAMaj.kKamAja) {
            this.aKKamaj = -1;
            return;
        }
        this.aKKamaj = n << 12;
    }

    public boolean mix(MAD mAD, int[] nArray, int n, int n2) {
        if (this.aKKamaj == -1) {
            return true;
        }
        if (!this.aKkamaj) {
            return true;
        }
        if (this.akkAMaj.KKamAja.length == 0) {
            return true;
        }
        int n3 = this.aKkAMaj * mAD.boost >> 6;
        int n4 = this.AKkamaj / mAD.frequency;
        this.aKKamaj = mAD.stereo ? this.akkAMaj.kkaMAjA(nArray, n, n2, this.aKKamaj, n4, n3, this.AkKamaj) : this.akkAMaj.kkaMAjA(nArray, n, n2, this.aKKamaj, n4, n3, 0);
        return true;
    }

    public void kKAmAJa(boolean bl) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        if (bl) {
            int n4;
            if (this.aKKaMAj == 5) {
                n4 = AKKAmAj[this.akkamAj & 0x1F] * this.aKKamAj >> 5;
                if ((this.akkamAj & 0x20) != 0) {
                    n4 = -n4;
                }
                n2 = n4;
                this.akkamAj += this.AkkamAj;
            }
            if (this.aKKaMAj == 11) {
                n4 = AKKAmAj[this.AkKAmAj & 0x1F] * this.AKkamAj >> 6;
                if ((this.AkKAmAj & 0x20) != 0) {
                    n4 = -n4;
                }
                n = n4;
                this.AkKAmAj += this.aKkamAj;
            }
            this.aKKaMAj = 0;
        } else {
            switch (this.aKKaMAj) {
                case 10: {
                    this.KkaMAJa(this.AKkAMaj + this.AkkaMAj);
                }
                case 2: {
                    this.Akkamaj += this.AKkaMAj;
                    if (this.AKkaMAj < 0 ^ this.Akkamaj > this.akKAMAj) {
                        this.KkAmaJa(this.akKAMAj);
                        break;
                    }
                    this.KkAmaJa(this.Akkamaj);
                    break;
                }
                case 3: {
                    this.Akkamaj += this.aKkaMAj;
                    this.KkAmaJa(this.Akkamaj);
                    break;
                }
                case 4: {
                    this.Akkamaj += this.AkKAMAj;
                    this.KkAmaJa(this.Akkamaj);
                    break;
                }
                case 1: {
                    this.KkaMAJa(this.AKkAMaj + this.AkkaMAj);
                    break;
                }
                case 6: {
                    n2 += this.aKKAMAj[this.AKKAMAj++];
                    if (this.AKKAMAj != 3) break;
                    this.AKKAMAj = 0;
                    break;
                }
                case 7: {
                    this.kKAMAJa(this.AkKamaj + this.akkaMAj);
                    break;
                }
                case 8: {
                    if (--this.AKKamAj != 0) break;
                    this.KKAMAJa(false);
                    this.aKKaMAj = 0;
                    break;
                }
                case 9: {
                    this.KkaMAJa(this.AKkAMaj + this.AkkaMAj);
                }
                case 5: {
                    int n5 = AKKAmAj[this.akkamAj & 0x1F] * this.aKKamAj >> 5;
                    if ((this.akkamAj & 0x20) != 0) {
                        n5 = -n5;
                    }
                    n2 += n5;
                    this.akkamAj += this.AkkamAj;
                    break;
                }
                case 11: {
                    int n6 = AKKAmAj[this.AkKAmAj & 0x1F] * this.AKkamAj >> 6;
                    if ((this.AkKAmAj & 0x20) != 0) {
                        n6 = -n6;
                    }
                    n = n6;
                    this.AkKAmAj += this.aKkamAj;
                    break;
                }
            }
        }
        this.kkamAJa(n2);
        this.kkAmaJa(n);
        this.kkaMAJa(n3);
    }

    public mmaakmk() {
        super();
    }

    static {
        int n;
        int n2;
        akKAmAj = new int[768];
        AKKAmAj = new int[32];
        aKKAmAj = new int[256];
        int n3 = 0;
        while (n3 < 256) {
            mmaakmk.aKKAmAj[n3] = n2 = (int)(-Math.sin((double)n3 / 256.0 * Math.PI * 2.0) * 64.55);
            ++n3;
        }
        n2 = 0;
        while (n2 < 768) {
            mmaakmk.akKAmAj[n2] = n = (int)(8363.0 * Math.pow(2.0, (4608.0 - (double)n2) / 768.0));
            ++n2;
        }
        n = 0;
        while (n < 32) {
            int n4;
            mmaakmk.AKKAmAj[n] = n4 = (int)(Math.sin((double)n / 32.0 * Math.PI) * 255.0);
            ++n;
        }
    }
}

