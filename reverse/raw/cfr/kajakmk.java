/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  sun.audio.AudioPlayer
 */
import java.applet.AudioClip;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;

final class kajakmk
implements AudioClip,
Runnable {
    private int AKKAMAJ;
    private int aKKAMAJ;
    private int AkkAMAJ;
    private byte[] akkAMAJ;
    private int AKkAMAJ;
    private int aKkAMAJ;
    private boolean AkKamAJ;
    private boolean akKamAJ;
    private byte[] AKKamAJ;
    private int aKKamAJ;
    private mmaakka AkkamAJ;
    kajakmk akkamAJ;
    int AKkamAJ;
    static final int[] aKkamAJ = new int[]{11025, 22050, 44100, 88200};
    static final int[] AkKAmAJ;
    private maaamka akKAmAJ;
    private Thread AKKAmAJ;
    private mmajmmk aKKAmAJ;
    private kajamma AkkAmAJ;
    private int akkAmAJ;
    private byte[] AKkAmAJ;
    private boolean aKkAmAJ;
    private static byte[] AkKaMaj;
    int akKaMaj;
    int AKKaMaj;
    int aKKaMaj;
    int AkkaMaj;
    int[] akkaMaj = new int[2];
    int[] AKkaMaj = new int[2];
    static final int[] aKkaMaj;
    static final int[] AkKAMaj;
    static final int[] akKAMaj;
    static final int[] AKKAMaj;
    static final int[][] aKKAMaj;
    static final int[] AkkAMaj;

    /*
     * Exception decompiling
     */
    int Kkamaja() {
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

    kajakmk(int n, int n2, byte[] byArray, int n3, mmaakka mmaakka2) {
        super();
        this.AKKAMAJ = n;
        this.akkAMAJ = byArray;
        this.AKkAMAJ = this.aKkAMAJ = n3;
        this.AkkamAJ = mmaakka2;
        this.AkKamAJ = (this.AKKAMAJ & 1) != 0;
        this.KkAmAJa();
        this.aKKAMAJ = n2;
        switch (aKkamAJ[this.AKKAMAJ >> 2 & 3]) {
            case 11025: {
                this.AkkAMAJ = (int)(((long)n2 * 16000L + 11024L) / 11025L);
                return;
            }
            case 22050: {
                this.AkkAMAJ = (int)(((long)n2 * 16000L + 22049L) / 22050L);
                return;
            }
            case 44100: {
                this.AkkAMAJ = (int)(((long)n2 * 16000L + 44099L) / 44100L);
                return;
            }
            case 88200: {
                this.AkkAMAJ = (int)(((long)n2 * 16000L + 88199L) / 88200L);
                return;
            }
        }
    }

    public synchronized void kKAmaja(int n) {
        this.stop();
        if (this.AKKamAJ != null) {
            this.akKAmAJ = new maaamka(this.AKKamAJ, n, this.aKKamAJ, this.AkkamAJ);
            AudioPlayer.player.start((InputStream)this.akKAmAJ);
        }
    }

    public synchronized void play() {
        this.kKAmaja(1);
    }

    synchronized void KKAmAJa(int n) {
        if (this.AKKamAJ != null) {
            this.akKAmAJ = new maaamka(this.AKKamAJ, n, this.aKKamAJ, this.AkkamAJ);
            AudioPlayer.player.start((InputStream)this.akKAmAJ);
        }
    }

    synchronized void kkAmAJa(int n) {
        if (this.akKAmAJ != null && this.akKAmAJ.available() > 0) {
            return;
        }
        this.stop();
        if (this.AKKamAJ != null) {
            this.akKAmAJ = new maaamka(this.AKKamAJ, n, this.aKKamAJ, this.AkkamAJ);
            AudioPlayer.player.start((InputStream)this.akKAmAJ);
        }
    }

    public synchronized void loop() {
        this.stop();
        if (this.AKKamAJ != null) {
            this.akKAmAJ = new maaamka(this.AKKamAJ, -1, this.aKKamAJ, this.AkkamAJ);
            AudioPlayer.player.start((InputStream)this.akKAmAJ);
        }
    }

    public synchronized void stop() {
        if (this.AKKAmAJ != null) {
            kajakmk kajakmk2 = this;
            synchronized (kajakmk2) {
                this.aKkAmAJ = false;
                this.AKKAmAJ = null;
            }
        }
        if (this.akKAmAJ != null) {
            AudioPlayer.player.stop((InputStream)this.akKAmAJ);
            try {
                ((InputStream)this.akKAmAJ).close();
            }
            catch (IOException iOException) {}
            this.akKAmAJ = null;
        }
    }

    synchronized void kkamaja(kajakmk kajakmk2, kajamma kajamma2) {
        maaamka maaamka2 = new maaamka(kajakmk2.AKKamAJ, 1, kajakmk2.aKKamAJ, this.AkkamAJ);
        if (this.akKAmAJ == null) {
            this.akKAmAJ = maaamka2;
            maaamka2 = new maaamka(kajakmk2.AKKamAJ, 1, kajakmk2.aKKamAJ, this.AkkamAJ);
            this.akkAmAJ = 0;
            this.akKAmAJ.KkamajA(maaamka2, this.akkAmAJ, kajamma2);
            this.AKKAmAJ = new Thread(this);
            this.AkkAmAJ = kajamma2;
            this.aKKAmAJ = kajamma2.MAJaKKa;
            this.aKkAmAJ = true;
            this.AKKAmAJ.start();
            AudioPlayer.player.start((InputStream)this.akKAmAJ);
            return;
        }
        ++this.akkAmAJ;
        this.akKAmAJ.KkamajA(maaamka2, this.akkAmAJ, kajamma2);
    }

    synchronized void kKAMaja(kajamma kajamma2) {
        maaamka maaamka2;
        if (this.AKkAmAJ == null) {
            this.AKkAmAJ = new byte[this.akKAmAJ.kkamajA()];
            maaamka.kkAmajA(this.AKkAmAJ, 0, this.AKkAmAJ.length);
        }
        if ((maaamka2 = new maaamka(this.AKkAmAJ, 1, this.AKkAmAJ.length, this.AkkamAJ)) != null) {
            ++this.akkAmAJ;
            this.akKAmAJ.KkamajA(maaamka2, this.akkAmAJ, kajamma2);
        }
    }

    /*
     * Unable to fully structure code
     */
    public synchronized void run() {
lbl1:
        // 3 sources

        try {
            while (this.aKkAmAJ) {
                var2_2 = this;
                synchronized (var2_2) {
                    block9: {
                        block10: {
                            if (!this.aKkAmAJ) break block9;
                            var1_1 = this.AkkAmAJ.AMAjAkK();
                            if (var1_1 != 1) break block10;
                            this.aKKAmAJ.akkAMaJ();
                            ** GOTO lbl1
                        }
                        if (var1_1 == 2) break block9;
                        if (var1_1 == 0) ** GOTO lbl1
                    }
                    var3_3 = null;
                    break;
                }
            }
        }
        catch (InterruptedException v1) {}
        this.aKkAmAJ = false;
        if (this.akKAmAJ != null) {
            this.akKAmAJ.KkAmajA();
        }
    }

    synchronized boolean kKamaja() {
        if (this.akKamAJ) {
            return true;
        }
        if (this.KKamaja()) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(0);
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeInt(779316836);
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(this.AkkAMAJ);
                dataOutputStream.writeInt(1);
                dataOutputStream.writeInt(8000);
                dataOutputStream.writeInt(1);
                dataOutputStream.writeInt(0);
            }
            catch (IOException iOException) {
                return false;
            }
            byte[] byArray = byteArrayOutputStream.toByteArray();
            int n = 0;
            while (n < 0) {
                this.AKKamAJ[n] = byArray[n];
                ++n;
            }
            this.akKamAJ = true;
            return true;
        }
        return false;
    }

    void KkAmAJa() {
        if (AkKaMaj == null) {
            AkKaMaj = new byte[256];
            int n = 0;
            while (n < 8) {
                int n2;
                int n3 = n2 = 1 << n;
                while (n2 > 0) {
                    kajakmk.AkKaMaj[n3] = (byte)n;
                    ++n3;
                    --n2;
                }
                ++n;
            }
            kajakmk.AkKaMaj[0] = 0;
        }
    }

    private static byte kkAMaja(int n) {
        int n2;
        byte by;
        int n3;
        int n4;
        if (n < 0) {
            n4 = 128;
            n = -n;
        } else {
            n4 = 0;
        }
        int n5 = n + 132;
        if (n5 > Short.MAX_VALUE) {
            n5 = Short.MAX_VALUE;
        }
        if ((n3 = ~(n4 | (by = AkKaMaj[n5 >> 7]) << 4 | (n2 = n5 >> by + 3 & 0xF))) == 0) {
            n3 = 2;
        }
        return (byte)n3;
    }

    private boolean KKamaja() {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = this.AkkAMAJ;
        switch (aKkamAJ[this.AKKAMAJ >> 2 & 3]) {
            case 11025: {
                n = 45158;
                break;
            }
            case 22050: {
                n = 90316;
                break;
            }
            case 44100: {
                n = 180633;
                break;
            }
            case 88200: {
                n = 361267;
            }
        }
        this.aKkAMAJ = this.AKkAMAJ;
        byte[] byArray = new byte[2048];
        if (byArray == null) {
            return false;
        }
        this.KkaMaja(0);
        this.AKKamAJ = new byte[n5];
        if (this.AKKamAJ == null) {
            return false;
        }
        int n6 = this.aKKAMAJ;
        while (n6 > 0) {
            if (n6 > 2048) {
                this.kkaMaja(byArray, 2048);
                n2 = 0x8000000;
            } else {
                this.kkaMaja(byArray, n6);
                n2 = n6 - 1 << 16;
            }
            while (n3 < n2 && n4 < n5) {
                this.AKKamAJ[n4++] = byArray[n3 >> 16];
                n3 += n;
            }
            if (n6 <= 2048) {
                this.aKKamAJ = n5 - (n5 - n4);
            } else {
                n3 -= 0x8000000;
            }
            n6 -= 2048;
        }
        return true;
    }

    private void kKaMaja() {
        while (this.AKKaMaj <= 24) {
            this.akKaMaj = this.akKaMaj << 8 | 0xFF & this.akkAMAJ[this.aKkAMAJ++];
            this.AKKaMaj += 8;
        }
    }

    private int KKAMaja(int n) {
        if (this.AKKaMaj < n) {
            this.kKaMaja();
        }
        int n2 = this.akKaMaj << 32 - this.AKKaMaj >>> 32 - n;
        this.AKKaMaj -= n;
        return n2;
    }

    private int KkAMaja(int n) {
        if (this.AKKaMaj < n) {
            this.kKaMaja();
        }
        int n2 = this.akKaMaj << 32 - this.AKKaMaj >> 32 - n;
        this.AKKaMaj -= n;
        return n2;
    }

    private void KKaMaja(int n) {
        if (n <= 32) {
            while (n > 0) {
                int n2 = Math.min(16, n);
                this.KKAMaja(n2);
                n -= n2;
            }
            return;
        }
        this.AKKaMaj = 0;
        int n3 = (n -= this.AKKaMaj) / 8;
        this.aKkAMAJ += n3;
        this.KKAMaja(n & 7);
    }

    private void KkaMaja(int n) {
        int n2;
        int n3;
        if (this.aKKaMaj == 0) {
            this.aKKaMaj = this.KKAMaja(2) + 2;
        }
        if ((n3 = this.AkkaMaj & 0xFFFFF000) > 0 && n > n3 + this.AkkaMaj) {
            this.AkkaMaj += n3;
            n -= n3;
            n2 = n3 * this.aKKaMaj;
            if (this.AkKamAJ) {
                n2 *= 2;
            }
            this.KKaMaja(n2);
        }
        n2 = n >> 12;
        int n4 = n2 * (22 + this.aKKaMaj * 4095);
        if (this.AkKamAJ) {
            n4 *= 2;
        }
        this.KKaMaja(n4);
        n &= 0xFFF;
        byte[] byArray = new byte[2048];
        int n5 = this.AkKamAJ ? 512 : 1024;
        while (n > 0) {
            int n6 = Math.min(n5, n);
            this.kkaMaja(byArray, n6 + n6);
            n -= n6;
        }
    }

    private void kkaMaja(byte[] byArray, int n) {
        int n2 = 0;
        if (this.aKKaMaj == 0) {
            this.aKKaMaj = this.KKAMaja(2) + 2;
        }
        int[] nArray = aKKAMaj[this.aKKaMaj - 2];
        int n3 = 1 << this.aKKaMaj - 2;
        int n4 = 1 << this.aKKaMaj - 1;
        if (!this.AkKamAJ) {
            int n5 = this.akkaMaj[0];
            int n6 = this.AKkaMaj[0];
            int n7 = this.AkkaMaj;
            while (n-- > 0) {
                if ((++n7 & 0xFFF) == 1) {
                    n5 = this.KkAMaja(16);
                    byArray[n2++] = kajakmk.kkAMaja(n5);
                    n6 = this.KKAMaja(6);
                    continue;
                }
                int n8 = this.KKAMaja(this.aKKaMaj);
                int n9 = AkkAMaj[n6];
                int n10 = 0;
                int n11 = n3;
                do {
                    if ((n8 & n11) != 0) {
                        n10 += n9;
                    }
                    n9 >>= 1;
                } while ((n11 >>= 1) != 0);
                n5 = (n8 & n4) != 0 ? (n5 -= n10) : (n5 += (n10 += n9));
                if ((n6 += nArray[n8 & ~n4]) < 0) {
                    n6 = 0;
                } else if (n6 > 88) {
                    n6 = 88;
                }
                if (n5 != (short)n5) {
                    n5 = n5 < 0 ? Short.MIN_VALUE : Short.MAX_VALUE;
                }
                byArray[n2++] = kajakmk.kkAMaja(n5);
            }
            this.akkaMaj[0] = n5;
            this.AKkaMaj[0] = n6;
            this.AkkaMaj = n7;
            return;
        }
        int n12 = 0;
        while (n-- > 0) {
            int n13;
            ++this.AkkaMaj;
            if ((this.AkkaMaj & 0xFFF) == 1) {
                n13 = 0;
                while (n13 < 2) {
                    this.akkaMaj[n13] = this.KkAMaja(16);
                    if (n13 == 0) {
                        n12 = this.akkaMaj[n13];
                    } else {
                        n12 += this.akkaMaj[n13];
                        byArray[n2++] = kajakmk.kkAMaja(n12 >>= 1);
                    }
                    this.AKkaMaj[n13] = this.KKAMaja(6);
                    ++n13;
                }
                continue;
            }
            n13 = 0;
            while (n13 < 2) {
                int n14 = this.KKAMaja(this.aKKaMaj);
                int n15 = AkkAMaj[this.AKkaMaj[n13]];
                int n16 = 0;
                int n17 = n3;
                do {
                    if ((n14 & n17) != 0) {
                        n16 += n15;
                    }
                    n15 >>= 1;
                } while ((n17 >>= 1) != 0);
                n16 += n15;
                if ((n14 & n4) != 0) {
                    int n18 = n13;
                    this.akkaMaj[n18] = this.akkaMaj[n18] - n16;
                } else {
                    int n19 = n13;
                    this.akkaMaj[n19] = this.akkaMaj[n19] + n16;
                }
                int n20 = n13;
                this.AKkaMaj[n20] = this.AKkaMaj[n20] + nArray[n14 & ~n4];
                if (this.AKkaMaj[n13] < 0) {
                    this.AKkaMaj[n13] = 0;
                } else if (this.AKkaMaj[n13] > 88) {
                    this.AKkaMaj[n13] = 88;
                }
                if (this.akkaMaj[n13] != (short)this.akkaMaj[n13]) {
                    int n21 = this.akkaMaj[n13] = this.akkaMaj[n13] < 0 ? Short.MIN_VALUE : Short.MAX_VALUE;
                }
                if (n13 == 0) {
                    n12 = this.akkaMaj[n13];
                } else {
                    n12 += this.akkaMaj[n13];
                    byArray[n2++] = kajakmk.kkAMaja(n12 >>= 1);
                }
                ++n13;
            }
        }
    }

    static {
        int[] nArray = new int[4];
        nArray[0] = 3;
        nArray[1] = 2;
        nArray[2] = 1;
        AkKAmAJ = nArray;
        aKkaMaj = new int[]{-1, 2};
        AkKAMaj = new int[]{-1, -1, 2, 4};
        akKAMaj = new int[]{-1, -1, -1, -1, 2, 4, 6, 8};
        AKKAMaj = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 1, 2, 4, 6, 8, 10, 13, 16};
        aKKAMaj = new int[][]{aKkaMaj, AkKAMaj, akKAMaj, AKKAMaj};
        AkkAMaj = new int[]{7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, Short.MAX_VALUE};
    }
}

