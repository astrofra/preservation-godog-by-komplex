/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Graphics;

public class mmjjmmk
extends mmaakkk
implements mmaamka {
    static final float AKkAmAj = 1024.0f;
    static final int aKkAmAj = 10240;
    static final int JaKkAmA = 5;
    static final int jaKkAmA = 24;
    majjmka[] JAKkAmA;
    mmjjmka[] jAKkAmA;
    float[] JakkAmA;
    boolean[] jakkAmA;
    int JAkkAmA;
    int jAkkAmA;
    int JaKKAmA;
    int jaKKAmA;
    static final float JAKKAmA = 1.1920929E-7f;
    static final float jAKKAmA = 0.0018269231f;
    kaaakkk JakKAmA;
    kaaakkk jakKAmA;
    kaaakkk JAkKAmA;
    kaaakkk jAkKAmA;
    kaaakkk JaKkamA;
    kaaakkk jaKkamA;
    kaaakkk JAKkamA;
    kaaakkk jAKkamA;
    final int JakkamA = 1;
    final int jakkamA = 24;
    final int JAkkamA = 576;

    /*
     * Exception decompiling
     */
    public mmjjmmk() {
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

    public void JaKkama(mmjjmkk mmjjmkk2, int n) {
        if (!this.MaJakka) {
            return;
        }
        this.kKAMaJa(this.mAJAKKa);
        this.MajAkka = mmjjmkk2;
        this.MAjAkka = kaaamma.AmAjaKK;
        this.jakkAma();
        this.JAKkaMA();
        if (this.JAkkAmA == 0) {
            return;
        }
        this.kkaMaJa(this.maJakka, this.jAkkAmA);
    }

    public void kkaMaJa(kajjkka[] kajjkkaArray, int n) {
        kajjkka[] kajjkkaArray2 = kaaamma.aMaJAKK;
        int n2 = kaaamma.AmAjaKK;
        int n3 = 0;
        while (n3 < n) {
            kajjkka kajjkka2 = kajjkkaArray[n3];
            majjmka majjmka2 = kajjkka2.amAJAkk;
            majjmka majjmka3 = kajjkka2.AMAJAkk;
            majjmka majjmka4 = kajjkka2.aMAJAkk;
            float f = majjmka2.kaMAjAK;
            float f2 = majjmka3.kaMAjAK - f;
            float f3 = majjmka2.KAMAjAK;
            float f4 = majjmka4.KAMAjAK - f3;
            float f5 = majjmka4.kaMAjAK - f;
            float f6 = majjmka3.KAMAjAK - f3;
            if (f2 * f4 - f5 * f6 < 0.0f) {
                kajjkka2.aMajakk = -(majjmka2.KaMAjAK + majjmka3.KaMAjAK + majjmka4.KaMAjAK);
                double d = majjmka2.KaMAjAK * 0.0018269231f;
                double d2 = majjmka3.KaMAjAK * 0.0018269231f;
                double d3 = majjmka4.KaMAjAK * 0.0018269231f;
                kajjkka2.AmaJAkk.jAKkaMA = (float)((double)majjmka2.kaMAjAK * Math.cos(d) * 1.1920928955078125E-7);
                kajjkka2.AmaJAkk.JakkaMA = (float)((double)majjmka2.KAMAjAK * Math.sin(d) * 1.1920928955078125E-7);
                kajjkka2.amaJAkk.jAKkaMA = (float)((double)majjmka3.kaMAjAK * Math.cos(d2) * 1.1920928955078125E-7);
                kajjkka2.amaJAkk.JakkaMA = (float)((double)majjmka3.KAMAjAK * Math.sin(d2) * 1.1920928955078125E-7);
                kajjkka2.AMaJAkk.jAKkaMA = (float)((double)majjmka4.kaMAjAK * Math.cos(d3) * 1.1920928955078125E-7);
                kajjkka2.AMaJAkk.JakkaMA = (float)((double)majjmka4.KAMAjAK * Math.sin(d3) * 1.1920928955078125E-7);
                kajjkkaArray2[n2++] = kajjkka2;
            }
            ++n3;
        }
        kaaamma.AmAjaKK = n2;
    }

    public void JAKkaMA() {
        try {
            this.KkaMaJa();
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            this.JAkkAmA = 10239;
        }
        this.jAkkAmA = this.JAkkAmA / 3;
    }

    public void kKAMaJa(float f) {
        Math.sin((double)f * 2.3 + 1.0);
        float f2 = 6.24f;
        int n = 0;
        while (n < 5) {
            this.JAKkAmA[n].MajaKka = (float)(Math.sin((double)f * (0.2 + (double)n * 0.007) + (double)n) * (double)f2) - 12.0f;
            this.JAKkAmA[n].majaKka = (float)(Math.cos((double)f * (0.3 + (double)n * 0.02) + (double)(n * 3)) * (double)f2) - 12.0f;
            this.JAKkAmA[n].MAjaKka = (float)(Math.sin((double)f * (0.2 + (double)n * 0.03) + (double)(n * 2)) * (double)f2) - 12.0f;
            ++n;
        }
        int n2 = 0;
        float[] fArray = new float[5];
        float[] fArray2 = new float[5];
        float[] fArray3 = new float[5];
        int n3 = 0;
        while (n3 < 5) {
            fArray[n3] = this.JAKkAmA[n3].MajaKka;
            ++n3;
        }
        float[] fArray4 = this.JakkAmA;
        int n4 = 0;
        while (n4 < 24) {
            int n5 = 0;
            while (n5 < 5) {
                float f3 = (float)n4 + this.JAKkAmA[n5].MAjaKka;
                fArray3[n5] = f3 * f3;
                ++n5;
            }
            int n6 = 0;
            while (n6 < 24) {
                boolean bl = false;
                int n7 = 0;
                while (n7 < 5) {
                    float f4 = (float)n6 + this.JAKkAmA[n7].majaKka;
                    fArray2[n7] = f4 * f4 + fArray3[n7];
                    ++n7;
                }
                int n8 = 0;
                while (n8 < 24) {
                    float f5 = 710.0f;
                    int n9 = 0;
                    while (n9 < 5) {
                        float f6 = (float)n8 + fArray[n9];
                        f5 += 3200.0f / (f6 * f6 + fArray2[n9]);
                        ++n9;
                    }
                    fArray4[n2] = f5;
                    if (f5 >= 1024.0f) {
                        bl = true;
                    }
                    ++n8;
                    ++n2;
                }
                this.jakkAmA[n4 * 24 + n6] = bl;
                ++n6;
            }
            ++n4;
        }
    }

    void KkAMaJa(majjmka majjmka2, kaaakkk kaaakkk2, kaaakkk kaaakkk3) {
        float f = kaaakkk3.amAJAkK - kaaakkk2.amAJAkK;
        if (f == 0.0f) {
            majjmka2.MajaKka = kaaakkk2.MajaKka;
            majjmka2.majaKka = kaaakkk2.majaKka;
            majjmka2.MAjaKka = kaaakkk2.MAjaKka;
            return;
        }
        float f2 = (1024.0f - kaaakkk2.amAJAkK) / f;
        majjmka2.MajaKka = kaaakkk2.MajaKka + f2 * (kaaakkk3.MajaKka - kaaakkk2.MajaKka);
        majjmka2.majaKka = kaaakkk2.majaKka + f2 * (kaaakkk3.majaKka - kaaakkk2.majaKka);
        majjmka2.MAjaKka = kaaakkk2.MAjaKka + f2 * (kaaakkk3.MAjaKka - kaaakkk2.MAjaKka);
    }

    int kkAMaJa() {
        int n = 0;
        if (this.JakKAmA.amAJAkK < 1024.0f) {
            n |= 1;
        }
        if (this.jakKAmA.amAJAkK < 1024.0f) {
            n |= 2;
        }
        if (this.JAkKAmA.amAJAkK < 1024.0f) {
            n |= 4;
        }
        if (this.jAkKAmA.amAJAkK < 1024.0f) {
            n |= 8;
        }
        if (this.JaKkamA.amAJAkK < 1024.0f) {
            n |= 0x10;
        }
        if (this.jaKkamA.amAJAkK < 1024.0f) {
            n |= 0x20;
        }
        if (this.JAKkamA.amAJAkK < 1024.0f) {
            n |= 0x40;
        }
        if (this.jAKkamA.amAJAkK < 1024.0f) {
            n |= 0x80;
        }
        ++this.jaKKAmA;
        int[] nArray = mmaamka.KkAmAja;
        if (nArray[n] == 0) {
            return 0;
        }
        ++this.JaKKAmA;
        int n2 = nArray[n];
        mmjjmka[] mmjjmkaArray = this.jAKkAmA;
        if ((n2 & 1) != 0) {
            mmjjmkaArray[0].kamaJak(this.JakKAmA, this.jakKAmA);
        }
        if ((n2 & 2) != 0) {
            mmjjmkaArray[1].kamaJak(this.jakKAmA, this.JAkKAmA);
        }
        if ((n2 & 4) != 0) {
            mmjjmkaArray[2].kamaJak(this.JAkKAmA, this.jAkKAmA);
        }
        if ((n2 & 8) != 0) {
            mmjjmkaArray[3].kamaJak(this.jAkKAmA, this.JakKAmA);
        }
        if ((n2 & 0x10) != 0) {
            mmjjmkaArray[4].kamaJak(this.JaKkamA, this.jaKkamA);
        }
        if ((n2 & 0x20) != 0) {
            mmjjmkaArray[5].kamaJak(this.jaKkamA, this.JAKkamA);
        }
        if ((n2 & 0x40) != 0) {
            mmjjmkaArray[6].kamaJak(this.JAKkamA, this.jAKkamA);
        }
        if ((n2 & 0x80) != 0) {
            mmjjmkaArray[7].kamaJak(this.jAKkamA, this.JaKkamA);
        }
        if ((n2 & 0x100) != 0) {
            mmjjmkaArray[8].kamaJak(this.JakKAmA, this.JaKkamA);
        }
        if ((n2 & 0x200) != 0) {
            mmjjmkaArray[9].kamaJak(this.jakKAmA, this.jaKkamA);
        }
        if ((n2 & 0x400) != 0) {
            mmjjmkaArray[10].kamaJak(this.JAkKAmA, this.JAKkamA);
        }
        if ((n2 & 0x800) != 0) {
            mmjjmkaArray[11].kamaJak(this.jAkKAmA, this.jAKkamA);
        }
        return n;
    }

    void KkaMaJa() {
        this.JAkkAmA = 0;
        this.jAkkAmA = 0;
        this.JaKKAmA = 0;
        this.jaKKAmA = 0;
        kaaakka kaaakka2 = this.mAjAkka.kAmajAK(0.041666668f);
        kaajmma kaajmma2 = kaaakka2.kaMAjAK(new kaajmma(0.0f, 1.0f, 0.0f));
        kaajmma kaajmma3 = kaaakka2.kaMAjAK(new kaajmma(1.0f, 1.0f, 0.0f));
        kaajmma kaajmma4 = kaaakka2.kaMAjAK(new kaajmma(1.0f, 1.0f, 1.0f));
        kaajmma kaajmma5 = kaaakka2.kaMAjAK(new kaajmma(0.0f, 1.0f, 1.0f));
        kaajmma kaajmma6 = kaaakka2.kaMAjAK(new kaajmma(0.0f, 0.0f, 0.0f));
        kaajmma kaajmma7 = kaaakka2.kaMAjAK(new kaajmma(1.0f, 0.0f, 0.0f));
        kaajmma kaajmma8 = kaaakka2.kaMAjAK(new kaajmma(1.0f, 0.0f, 1.0f));
        kaajmma kaajmma9 = kaaakka2.kaMAjAK(new kaajmma(0.0f, 0.0f, 1.0f));
        kaajmma kaajmma10 = kaajmma7;
        kaajmma kaajmma11 = kaajmma2;
        kaajmma kaajmma12 = kaajmma9;
        float f = this.mAjaKKa;
        float f2 = this.MaJAKKa;
        float f3 = this.maJAKKa;
        float f4 = this.MaJaKKa;
        float f5 = this.maJaKKa;
        float f6 = this.MAJaKKa;
        kaaakkk kaaakkk2 = this.JakKAmA;
        kaaakkk kaaakkk3 = this.jakKAmA;
        kaaakkk kaaakkk4 = this.JAkKAmA;
        kaaakkk kaaakkk5 = this.jAkKAmA;
        kaaakkk kaaakkk6 = this.JaKkamA;
        kaaakkk kaaakkk7 = this.jaKkamA;
        kaaakkk kaaakkk8 = this.JAKkamA;
        kaaakkk kaaakkk9 = this.jAKkamA;
        kaajmma kaajmma13 = new kaajmma();
        kaajmma kaajmma14 = new kaajmma();
        kaajmma kaajmma15 = new kaajmma();
        kaajmma15 = kaaakka2.kaMAjAK(new kaajmma(-12.0f, -12.0f, -12.0f));
        kaajmma15.MajaKKA(f, f2, f3);
        float[] fArray = this.JakkAmA;
        majjmka[] majjmkaArray = this.MAJakka;
        boolean[] blArray = this.jakkAmA;
        int n = 0;
        while (n < 23) {
            kaajmma14.MAJAkKA(kaajmma15);
            int n2 = 0;
            while (n2 < 23) {
                kaajmma13.MAJAkKA(kaajmma14);
                int n3 = n * 24 + n2;
                int n4 = n2 * 24 + n * 576;
                if (blArray[n3] | blArray[n3 + 1] | blArray[n3 + 24] | blArray[n3 + 1 + 24]) {
                    int n5 = 0;
                    while (n5 < 23) {
                        kaaakkk2.jAKKAMa(kaajmma13.MajaKka + kaajmma2.MajaKka, kaajmma13.majaKka + kaajmma2.majaKka, kaajmma13.MAjaKka + kaajmma2.MAjaKka, fArray[n4 + 24]);
                        kaaakkk3.jAKKAMa(kaajmma13.MajaKka + kaajmma3.MajaKka, kaajmma13.majaKka + kaajmma3.majaKka, kaajmma13.MAjaKka + kaajmma3.MAjaKka, fArray[n4 + 1 + 24]);
                        kaaakkk4.jAKKAMa(kaajmma13.MajaKka + kaajmma4.MajaKka, kaajmma13.majaKka + kaajmma4.majaKka, kaajmma13.MAjaKka + kaajmma4.MAjaKka, fArray[n4 + 1 + 24 + 576]);
                        kaaakkk5.jAKKAMa(kaajmma13.MajaKka + kaajmma5.MajaKka, kaajmma13.majaKka + kaajmma5.majaKka, kaajmma13.MAjaKka + kaajmma5.MAjaKka, fArray[n4 + 576 + 24]);
                        kaaakkk6.jAKKAMa(kaajmma13.MajaKka + kaajmma6.MajaKka, kaajmma13.majaKka + kaajmma6.majaKka, kaajmma13.MAjaKka + kaajmma6.MAjaKka, fArray[n4]);
                        kaaakkk7.jAKKAMa(kaajmma13.MajaKka + kaajmma7.MajaKka, kaajmma13.majaKka + kaajmma7.majaKka, kaajmma13.MAjaKka + kaajmma7.MAjaKka, fArray[n4 + 1]);
                        kaaakkk8.jAKKAMa(kaajmma13.MajaKka + kaajmma8.MajaKka, kaajmma13.majaKka + kaajmma8.majaKka, kaajmma13.MAjaKka + kaajmma8.MAjaKka, fArray[n4 + 1 + 576]);
                        kaaakkk9.jAKKAMa(kaajmma13.MajaKka + kaajmma9.MajaKka, kaajmma13.majaKka + kaajmma9.majaKka, kaajmma13.MAjaKka + kaajmma9.MAjaKka, fArray[n4 + 576]);
                        int n6 = this.kkAMaJa();
                        int[] nArray = mmaamka.kkAmAja[n6];
                        if (nArray != null) {
                            int n7 = 0;
                            while (n7 < nArray.length) {
                                majjmka majjmka2 = majjmkaArray[this.JAkkAmA];
                                mmjjmka mmjjmka2 = this.jAKkAmA[nArray[n7]];
                                float f7 = f4 / mmjjmka2.MAjaKka;
                                majjmka2.kaMAjAK = mmjjmka2.MajaKka * f7 + f5;
                                majjmka2.KAMAjAK = -(mmjjmka2.majaKka * f7) + f6;
                                majjmka2.KaMAjAK = mmjjmka2.MAjaKka;
                                ++this.JAkkAmA;
                                ++n7;
                            }
                        }
                        ++n5;
                        kaajmma13.MaJaKka(kaajmma10);
                        ++n4;
                    }
                }
                ++n2;
                kaajmma14.MaJaKka(kaajmma11);
            }
            ++n;
            kaajmma15.MaJaKka(kaajmma12);
        }
        this.jAkkAmA = this.JAkkAmA / 3;
    }

    void KKAMaJa(Graphics graphics) {
        int[] nArray = new int[3];
        int[] nArray2 = new int[3];
        graphics.setColor(Color.white);
        int n = 0;
        int n2 = 0;
        while (n2 < this.JAkkAmA / 3) {
            float f = 0.0f;
            int n3 = 0;
            while (n3 < 3) {
                float f2 = 110.0f / (this.MAJakka[n].MAjaKka + 10.0f);
                float f3 = this.MAJakka[n].MajaKka * f2 + 160.0f;
                float f4 = this.MAJakka[n].majaKka * f2 + 100.0f;
                ++n;
                f += f2;
                nArray[n3] = (int)f3;
                nArray2[n3] = (int)f4;
                ++n3;
            }
            graphics.drawPolygon(nArray, nArray2, 3);
            ++n2;
        }
    }
}

