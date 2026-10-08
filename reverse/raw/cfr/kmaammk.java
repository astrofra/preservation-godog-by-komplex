/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

final class kmaammk {
    int ajakkAM;
    int AJakkAM;
    int aJakkAM;
    int AjAKkAM;
    int ajAKkAM;
    int AJAKkAM;
    private static final int[] aJAKkAM = new int[]{0x40000000, 1073872888, 1074265984, 1074920825, 1075836932, 1077013639, 1078450093, 1080145258, 1082097918, 1084306681, 1086769986, 1089486107, 1092453157, 1095669100, 1099131748, 1102838780, 1106787739, 1110976045, 1115401003, 1120059807, 1124949552, 1130067241, 1135409791, 1140974043, 1146756771, 1152754686, 1158964447, 1165382668, 1172005924, 1178830760, 1185853694, 1193071229, 1200479854, 1208076055, 1215856315, 1223817123, 1231954981, 1240266402, 1248747921, 1257396097, 1266207514, 1275178788, 1284306569, 1293587545, 1303018442, 1312596028, 1322317116, 1332178565, 0x50000000, 1352310217, 1362574382, 1372966831, 1383484673, 1394125071, 1404885240, 1415762448, 1426754019, 1437857331, 1449069814, 1460388955, 1471812291, 1483337417, 1494961978, 1506683672, 1518500250, 1518500250};

    /*
     * Exception decompiling
     */
    kmaammk() {
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

    kmaammk(kmaammk kmaammk2) {
        super();
        this.ajakkAM = 65536;
        this.AjAKkAM = 65536;
        this.ajakkAM = kmaammk2.ajakkAM;
        this.AJakkAM = kmaammk2.AJakkAM;
        this.aJakkAM = kmaammk2.aJakkAM;
        this.AjAKkAM = kmaammk2.AjAKkAM;
        this.ajAKkAM = kmaammk2.ajAKkAM;
        this.AJAKkAM = kmaammk2.AJAKkAM;
    }

    final void akKaMaj(Point point, Point point2) {
        int n = this.ajakkAM;
        int n2 = point.x;
        int n3 = (int)((long)n * (long)n2 + 32768L >> 16) + this.ajAKkAM;
        if (this.aJakkAM != 0) {
            n = this.aJakkAM;
            n2 = point.y;
            n3 += (int)((long)n * (long)n2 + 32768L >> 16);
        }
        n = this.AjAKkAM;
        n2 = point.y;
        int n4 = (int)((long)n * (long)n2 + 32768L >> 16) + this.AJAKkAM;
        if (this.AJakkAM != 0) {
            n = this.AJakkAM;
            n2 = point.x;
            n4 += (int)((long)n * (long)n2 + 32768L >> 16);
        }
        point2.x = n3;
        point2.y = n4;
    }

    final void akkAmAJ(Point point) {
        int n;
        int n2 = this.ajakkAM;
        int n3 = point.x;
        n2 = (int)((long)n2 * (long)n3 + 32768L >> 16) + this.ajAKkAM;
        if (this.aJakkAM != 0) {
            n3 = this.aJakkAM;
            n = point.y;
            n2 += (int)((long)n3 * (long)n + 32768L >> 16);
        }
        n3 = this.AjAKkAM;
        n = point.y;
        n3 = (int)((long)n3 * (long)n + 32768L >> 16) + this.AJAKkAM;
        if (this.AJakkAM != 0) {
            n = this.AJakkAM;
            int n4 = point.x;
            n3 += (int)((long)n * (long)n4 + 32768L >> 16);
        }
        point.x = n2;
        point.y = n3;
    }

    final void aKKAmAJ(int n, int n2) {
        this.ajakkAM = n;
        this.AjAKkAM = n2;
        this.aJakkAM = 0;
        this.AJakkAM = 0;
        this.AJAKkAM = 0;
        this.ajAKkAM = 0;
    }

    final void AkkAmAJ(Point point) {
        int n;
        int n2 = this.ajakkAM;
        int n3 = point.x;
        n2 = (int)((long)n2 * (long)n3 + 32768L >> 16);
        if (this.aJakkAM != 0) {
            n3 = this.aJakkAM;
            n = point.y;
            n2 += (int)((long)n3 * (long)n + 32768L >> 16);
        }
        n3 = this.AjAKkAM;
        n = point.y;
        n3 = (int)((long)n3 * (long)n + 32768L >> 16);
        if (this.AJakkAM != 0) {
            n = this.AJakkAM;
            int n4 = point.x;
            n3 += (int)((long)n * (long)n4 + 32768L >> 16);
        }
        point.x = n2;
        point.y = n3;
    }

    final kaajmmk AKKaMaj(kaajmmk kaajmmk2) {
        kaajmmk kaajmmk3 = new kaajmmk();
        if (kaajmmk2.jAKkAMa != Integer.MIN_VALUE) {
            Point point = new Point(kaajmmk2.jAKkAMa, kaajmmk2.JakkAMa);
            Point point2 = new Point(0, 0);
            this.akKaMaj(point, point2);
            kaajmmk3.AKKaMAJ(point2);
            point.x = kaajmmk2.jakkAMa;
            this.akKaMaj(point, point2);
            kaajmmk3.AKKaMAJ(point2);
            point.y = kaajmmk2.JAkkAMa;
            this.akKaMaj(point, point2);
            kaajmmk3.AKKaMAJ(point2);
            point.x = kaajmmk2.jAKkAMa;
            this.akKaMaj(point, point2);
            kaajmmk3.AKKaMAJ(point2);
        }
        return kaajmmk3;
    }

    int AKKAmAJ(int n) {
        Point point = new Point(n, n);
        this.AkkAmAJ(point);
        int n2 = kmaammk.AKkAmAJ(point.x, point.y);
        n2 = (int)(46341L * (long)n2 + 32768L >> 16);
        if (n > 0) {
            n2 = Math.max(1, n2);
        }
        return n2;
    }

    final kmaammk AkkaMaj() {
        kmaammk kmaammk2 = new kmaammk();
        if (this.AJakkAM == 0 && this.aJakkAM == 0) {
            int n = this.ajakkAM;
            kmaammk2.ajakkAM = n != 0 ? (int)(0x100000000L / (long)n) : Integer.MAX_VALUE;
            n = this.AjAKkAM;
            kmaammk2.AjAKkAM = n != 0 ? (int)(0x100000000L / (long)n) : Integer.MAX_VALUE;
            n = kmaammk2.ajakkAM;
            int n2 = this.ajAKkAM;
            kmaammk2.ajAKkAM = -((int)((long)n * (long)n2 + 32768L >> 16));
            n = kmaammk2.AjAKkAM;
            n2 = this.AJAKkAM;
            kmaammk2.AJAKkAM = -((int)((long)n * (long)n2 + 32768L >> 16));
        } else {
            double d = (double)this.ajakkAM * 1.52587890625E-5;
            double d2 = (double)this.AjAKkAM * 1.52587890625E-5;
            double d3 = (double)this.AJakkAM * 1.52587890625E-5;
            double d4 = (double)this.aJakkAM * 1.52587890625E-5;
            double d5 = d * d2 - d3 * d4;
            if (d5 != 0.0) {
                d5 = 1.0 / d5;
                kmaammk2.ajakkAM = (int)(d2 * d5 * 65536.0);
                kmaammk2.AJakkAM = -((int)(d3 * d5 * 65536.0));
                kmaammk2.aJakkAM = -((int)(d4 * d5 * 65536.0));
                kmaammk2.AjAKkAM = (int)(d * d5 * 65536.0);
                Point point = new Point(this.ajAKkAM, this.AJAKkAM);
                kmaammk2.AkkAmAJ(point);
                kmaammk2.ajAKkAM = -point.x;
                kmaammk2.AJAKkAM = -point.y;
            }
        }
        return kmaammk2;
    }

    static final kmaammk aKKaMaj(kmaammk kmaammk2, kmaammk kmaammk3) {
        kmaammk kmaammk4 = new kmaammk();
        int n = kmaammk2.ajakkAM;
        int n2 = kmaammk3.ajakkAM;
        kmaammk4.ajakkAM = (int)((long)n * (long)n2 + 32768L >> 16);
        n = kmaammk2.AjAKkAM;
        n2 = kmaammk3.AjAKkAM;
        kmaammk4.AjAKkAM = (int)((long)n * (long)n2 + 32768L >> 16);
        n = kmaammk2.ajAKkAM;
        n2 = kmaammk3.ajakkAM;
        kmaammk4.ajAKkAM = (int)((long)n * (long)n2 + 32768L >> 16) + kmaammk3.ajAKkAM;
        n = kmaammk2.AJAKkAM;
        n2 = kmaammk3.AjAKkAM;
        kmaammk4.AJAKkAM = (int)((long)n * (long)n2 + 32768L >> 16) + kmaammk3.AJAKkAM;
        if (kmaammk2.AJakkAM != 0 || kmaammk2.aJakkAM != 0 || kmaammk3.AJakkAM != 0 || kmaammk3.aJakkAM != 0) {
            n = kmaammk2.AJakkAM;
            n2 = kmaammk3.aJakkAM;
            kmaammk4.ajakkAM += (int)((long)n * (long)n2 + 32768L >> 16);
            n = kmaammk2.aJakkAM;
            n2 = kmaammk3.AJakkAM;
            kmaammk4.AjAKkAM += (int)((long)n * (long)n2 + 32768L >> 16);
            n = kmaammk2.ajakkAM;
            n2 = kmaammk3.AJakkAM;
            int n3 = (int)((long)n * (long)n2 + 32768L >> 16);
            n = kmaammk2.AJakkAM;
            n2 = kmaammk3.AjAKkAM;
            kmaammk4.AJakkAM += n3 + (int)((long)n * (long)n2 + 32768L >> 16);
            n = kmaammk2.aJakkAM;
            n2 = kmaammk3.ajakkAM;
            int n4 = (int)((long)n * (long)n2 + 32768L >> 16);
            n = kmaammk2.AjAKkAM;
            n2 = kmaammk3.aJakkAM;
            kmaammk4.aJakkAM += n4 + (int)((long)n * (long)n2 + 32768L >> 16);
            n = kmaammk2.AJAKkAM;
            n2 = kmaammk3.aJakkAM;
            kmaammk4.ajAKkAM += (int)((long)n * (long)n2 + 32768L >> 16);
            n = kmaammk2.ajAKkAM;
            n2 = kmaammk3.AJakkAM;
            kmaammk4.AJAKkAM += (int)((long)n * (long)n2 + 32768L >> 16);
        }
        return kmaammk4;
    }

    static final int AkKaMaj(int n) {
        if (n > 0) {
            return n;
        }
        return -n;
    }

    static final int aKkAmAJ(int n, int n2) {
        int n3 = n > 0 ? n : -n;
        int n4 = n2 > 0 ? n2 : -n2;
        return n3 + n4 - (Math.min(n3, n4) >> 1);
    }

    static final int AKkAmAJ(int n, int n2) {
        int n3;
        int n4;
        int n5 = n > 0 ? n : -n;
        int n6 = n4 = n2 > 0 ? n2 : -n2;
        if (n5 > n4) {
            n3 = n5;
            n5 = n4;
            n4 = n3;
        }
        if (n4 == 0) {
            return 0;
        }
        n3 = n4 != 0 ? (int)(((long)n5 << 16) / (long)n4) : Integer.MAX_VALUE;
        int n7 = n3 >> 10;
        int n8 = (n3 & 0x3FF) << 6;
        int n9 = 65536 - n8;
        int n10 = aJAKkAM[n7];
        int n11 = (int)((long)n9 * (long)n10 + 32768L >> 16);
        n9 = aJAKkAM[n7 + 1];
        n9 = n11 + (int)((long)n8 * (long)n9 + 32768L >> 16);
        return (int)((long)n4 * (long)(n9 >>= 14) + 32768L >> 16);
    }

    static {
    }
}

