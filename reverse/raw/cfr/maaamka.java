/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;

final class maaamka
extends ByteArrayInputStream {
    private int kKAmaja;
    private int Kkamaja;
    private byte[] kkamaja;
    private mmaakka KKamaja;
    private boolean kKamaja;
    private maaamka KkAMaja;
    private boolean kkAMaja;
    private int KKAMaja;
    private kajamma kKAMaja;

    /*
     * Exception decompiling
     */
    maaamka(byte[] var1_1, int var2_2, int var3_3, mmaakka var4_4) {
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

    private void kKAmajA(maaamka maaamka2) {
        this.count = maaamka2.count;
        this.kKAmaja = maaamka2.kKAmaja;
        this.buf = maaamka2.kkamaja;
        this.kkamaja = maaamka2.kkamaja;
        this.reset();
        maaamka2.kKAMaja.MAJAkKa(maaamka2.KKAMaja);
    }

    private int KkAMajA(int n) {
        if (!this.kKamaja) {
            return n;
        }
        if (n <= 0 && this.KkAMaja.KkAMaja != null) {
            this.KkAMaja = this.KkAMaja.KkAMaja;
            this.kKAmajA(this.KkAMaja);
            if (this.buf.length > 0 && this.Kkamaja == 0) {
                return this.read();
            }
        }
        return n;
    }

    private int KKAmajA(int n, byte[] byArray, int n2, int n3) {
        if (!this.kKamaja) {
            return n;
        }
        if (n <= 0 && this.KkAMaja.KkAMaja != null) {
            this.KkAMaja = this.KkAMaja.KkAMaja;
            this.kKAmajA(this.KkAMaja);
            if (this.buf.length > 0 && this.Kkamaja == 0) {
                return this.read(byArray, n2, n3);
            }
        }
        return n;
    }

    synchronized void KkamajA(maaamka maaamka2, int n, kajamma kajamma2) {
        maaamka2.kKamaja = true;
        this.kKamaja = true;
        maaamka2.KKAMaja = n;
        maaamka2.kKAMaja = kajamma2;
        if (this.KkAMaja == null) {
            this.KkAMaja = maaamka2;
            this.kKAmajA(maaamka2);
            return;
        }
        maaamka maaamka3 = this.KkAMaja;
        while (maaamka3.KkAMaja != null) {
            maaamka3 = maaamka3.KkAMaja;
        }
        maaamka3.KkAMaja = maaamka2;
    }

    public synchronized int read() {
        int n = this.KKamajA();
        if (n <= 0 && this.kkAMaja) {
            return -1;
        }
        if (n <= 0) {
            n = 127;
        }
        return n;
    }

    private int KKamajA() {
        if (this.KKamaja.AMAJaKk) {
            return this.KkAMajA(-1);
        }
        if (this.pos < this.count) {
            ++this.pos;
            if (this.Kkamaja >= this.kKAmaja) {
                this.Kkamaja = 0;
            }
            if (this.KKamaja.aMAJaKk) {
                ++this.Kkamaja;
                return this.KkAMajA(127);
            }
            return this.KkAMajA(this.buf[this.Kkamaja++] & 0xFF);
        }
        return this.KkAMajA(-1);
    }

    static void kkAmajA(byte[] byArray, int n, int n2) {
        int n3 = n2;
        while (n3 > 0) {
            byArray[n++] = 127;
            --n3;
        }
    }

    private int kKamajA(byte[] byArray, int n, int n2) {
        if (this.Kkamaja >= this.kKAmaja) {
            return -1;
        }
        if (this.Kkamaja + n2 > this.kKAmaja) {
            n2 = this.kKAmaja - this.Kkamaja;
        }
        if (n2 <= 0) {
            return 0;
        }
        if (this.KKamaja.aMAJaKk) {
            maaamka.kkAmajA(byArray, n, n2);
        } else {
            System.arraycopy(this.buf, this.Kkamaja, byArray, n, n2);
        }
        this.Kkamaja += n2;
        return n2;
    }

    void KkAmajA() {
        this.kkAMaja = true;
    }

    public synchronized int read(byte[] byArray, int n, int n2) {
        int n3;
        int n4 = n;
        while ((n3 = this.kkAMajA(byArray, n4, n2)) > 0) {
            n4 += n3;
            if ((n2 -= n3) <= 0) break;
        }
        if (n3 <= 0 && n4 == n && this.kkAMaja) {
            return -1;
        }
        if (n2 > 0) {
            maaamka.kkAmajA(byArray, n4, n2);
            n4 += n2;
        }
        return n4 - n;
    }

    private int kkAMajA(byte[] byArray, int n, int n2) {
        if (this.KKamaja.AMAJaKk) {
            return -1;
        }
        if (this.pos >= this.count) {
            return this.KKAmajA(-1, byArray, n, n2);
        }
        if (this.pos + n2 > this.count) {
            n2 = this.count - this.pos;
        }
        if (n2 <= 0) {
            return this.KKAmajA(0, byArray, n, n2);
        }
        if (this.Kkamaja + n2 <= this.kKAmaja) {
            if (this.KKamaja.aMAJaKk) {
                maaamka.kkAmajA(byArray, n, n2);
            } else {
                System.arraycopy(this.buf, this.Kkamaja, byArray, n, n2);
            }
            this.Kkamaja += n2;
        } else {
            int n3 = 0;
            while (n3 < n2) {
                int n4 = this.kKamajA(byArray, n + n3, n2 - n3);
                if (n4 >= 0) {
                    n3 += n4;
                    continue;
                }
                this.Kkamaja = 0;
            }
        }
        this.pos += n2;
        return this.KKAmajA(n2, byArray, n, n2);
    }

    public synchronized long skip(long l) {
        if (this.KKamaja.AMAJaKk) {
            return 0L;
        }
        if ((long)this.pos + l > (long)this.count) {
            l = this.count - this.pos;
        }
        if (l < 0L) {
            return 0L;
        }
        this.pos = (int)((long)this.pos + l);
        this.Kkamaja = (int)((long)this.Kkamaja + l);
        while (this.Kkamaja >= this.kKAmaja) {
            this.Kkamaja -= this.kKAmaja;
        }
        return l;
    }

    public synchronized int available() {
        if (this.KKamaja.AMAJaKk) {
            return 0;
        }
        return this.count - this.pos;
    }

    public synchronized void reset() {
        this.Kkamaja = 0;
        this.pos = 0;
    }

    protected synchronized int kkamajA() {
        return this.kKAmaja;
    }
}

