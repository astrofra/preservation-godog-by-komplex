/*
 * Decompiled with CFR 0.152.
 */
import java.util.Enumeration;
import java.util.Vector;

class kmjakka {
    Vector AmajAKk = new Vector(100);

    /*
     * Exception decompiling
     */
    synchronized void AmAJAKk(int var1_1, long var2_2) {
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

    int aMAJAKk(int n) {
        majakmk majakmk2 = this.AMAJAKk(n);
        long l = majakmk2.akKAMAJ - System.currentTimeMillis();
        if (l > 0L) {
            try {
                Thread.sleep(l);
            }
            catch (Exception exception) {
                return majakmk2.AkKAMAJ;
            }
        }
        return majakmk2.AkKAMAJ;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean AmaJAKk(int n, int n2) {
        long l = System.currentTimeMillis();
        l += (long)n2;
        Vector vector = this.AmajAKk;
        synchronized (vector) {
            Enumeration enumeration = this.AmajAKk.elements();
            if (enumeration == null) return false;
            int n3 = 0;
            while (enumeration.hasMoreElements()) {
                majakmk majakmk2 = (majakmk)enumeration.nextElement();
                if (n3 == 0 && majakmk2.AkKAMAJ > n) {
                    return true;
                }
                if (majakmk2.AkKAMAJ >= n && majakmk2.akKAMAJ <= l) {
                    return true;
                }
                ++n3;
            }
            return false;
        }
    }

    /*
     * Unable to fully structure code
     */
    synchronized majakmk AMAJAKk(int var1_1) {
        var3_2 = this.AmajAKk;
        synchronized (var3_2) {
            var5_3 = this.AmajAKk.elements();
            if (var5_3 != null) {
                while (var5_3.hasMoreElements()) {
                    var6_4 = (majakmk)var5_3.nextElement();
                    if (var6_4.AkKAMAJ < var1_1) continue;
                    var2_5 = var6_4;
                    var4_7 = null;
                    return var2_5;
                }
            }
        }
        block6: while (true) {
            try {
                this.wait();
            }
            catch (Exception v1) {
                return null;
            }
            var2_6 = this.AmajAKk.elements();
            if (var2_6 == null) continue;
            do {
                if (var2_6.hasMoreElements()) ** break;
                continue block6;
                var3_2 = (majakmk)var2_6.nextElement();
            } while (var3_2.AkKAMAJ < var1_1);
            break;
        }
        return var3_2;
    }

    public void amAJAKk() {
        Vector vector = this.AmajAKk;
        synchronized (vector) {
            Enumeration enumeration = this.AmajAKk.elements();
            if (enumeration != null) {
                while (enumeration.hasMoreElements()) {
                    majakmk majakmk2 = (majakmk)enumeration.nextElement();
                    System.out.println(majakmk2);
                }
            }
            return;
        }
    }

    kmjakka() {
        super();
    }
}

