/*
 * Decompiled with CFR 0.152.
 */
public class mmaakkk {
    protected String mAjAKka;
    public boolean MaJakka;
    public kajjkka[] maJakka;
    public majjmka[] MAJakka;
    public kajjmmk[] mAJakka;
    public final kaajmma Majakka;
    public final kaajmma majakka;
    public final kaajmma MAjakka;
    public final kaaakka mAjakka;
    float MaJAkka;
    public boolean maJAkka;
    public boolean MAJAkka;
    public boolean mAJAkka;
    public mmjjmkk MajAkka;
    public mmaakkk majAkka;
    int MAjAkka;
    kaaakka mAjAkka;
    float MaJaKKa;
    int maJaKKa;
    int MAJaKKa;
    int mAJaKKa;
    int MajaKKa;
    float majaKKa;
    float MAjaKKa;
    float mAjaKKa;
    float MaJAKKa;
    float maJAKKa;
    public int MAJAKKa;
    public float mAJAKKa;
    public boolean MajAKKa;
    public kaaakka majAKKa;
    public static int MAjAKKa;
    public static majjmka[] mAjAKKa;
    public static int MaJakKa;
    public static kajjkka[] maJakKa;

    /*
     * Exception decompiling
     */
    public mmaakkk() {
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

    public mmaakkk(mmaakkk mmaakkk2) {
        super();
        this.MaJakka = true;
        this.Majakka = new kaajmma();
        this.majakka = new kaajmma(1.0f, 1.0f, 1.0f);
        this.MAjakka = new kaajmma();
        this.mAjakka = new kaaakka();
        this.MajAKKa = false;
        this.MAJakka = new majjmka[mmaakkk2.MAJakka.length];
        int n = 0;
        while (n < this.MAJakka.length) {
            this.MAJakka[n] = new majjmka(mmaakkk2.MAJakka[n]);
            ++n;
        }
        this.mAJakka = new kajjmmk[mmaakkk2.mAJakka.length];
        int n2 = 0;
        while (n2 < this.MAJakka.length) {
            this.mAJakka[n2] = new kajjmmk(mmaakkk2.mAJakka[n2]);
            ++n2;
        }
        this.maJakka = new kajjkka[mmaakkk2.maJakka.length];
        int n3 = 0;
        while (n3 < this.maJakka.length) {
            kajjkka kajjkka2 = mmaakkk2.maJakka[n3];
            int n4 = 0;
            while (mmaakkk2.MAJakka[n4] != kajjkka2.amAJAkk) {
                ++n4;
            }
            int n5 = 0;
            while (mmaakkk2.MAJakka[n5] != kajjkka2.AMAJAkk) {
                ++n5;
            }
            int n6 = 0;
            while (mmaakkk2.MAJakka[n6] != kajjkka2.aMAJAkk) {
                ++n6;
            }
            int n7 = 0;
            while (mmaakkk2.mAJakka[n7] != kajjkka2.AmaJAkk) {
                ++n7;
            }
            int n8 = 0;
            while (mmaakkk2.mAJakka[n8] != kajjkka2.amaJAkk) {
                ++n8;
            }
            int n9 = 0;
            while (mmaakkk2.mAJakka[n9] != kajjkka2.AMaJAkk) {
                ++n9;
            }
            this.maJakka[n3] = new kajjkka(this, n4, n5, n6, n7, n8, n9);
            this.maJakka[n3].AmajAkk(kajjkka2);
            ++n3;
        }
        this.Majakka.MAJAkKA(mmaakkk2.Majakka);
        this.majakka.MAJAkKA(mmaakkk2.majakka);
        this.MAjakka.MAJAkKA(mmaakkk2.MAjakka);
        this.mAjakka.KaMAjAK(mmaakkk2.mAjakka);
        this.MaJAkka = mmaakkk2.MaJAkka;
        this.maJAkka = mmaakkk2.maJAkka;
        this.mAJAkka = mmaakkk2.mAJAkka;
        this.MAJAkka = mmaakkk2.MAJAkka;
        this.JakKAma();
    }

    public void JaKKaMA(boolean bl) {
        this.mAJAkka = bl;
        if (!this.mAJAkka) {
            this.majAkka = null;
            return;
        }
        this.majAkka = new mmaakkk(this);
        this.majAkka.mAJAkka = false;
    }

    public void jAkKaMA(String string) {
        this.mAjAKka = string.intern();
    }

    public String jAKKaMA() {
        if (this.mAjAKka == null) {
            return "";
        }
        return this.mAjAKka.intern();
    }

    public void jakkama(mmajkka mmajkka2, mmajkka mmajkka3) {
        Object object;
        kaajmma kaajmma2 = new kaajmma();
        int n = 0;
        while (n < this.MAJakka.length) {
            majjmka majjmka2 = this.MAJakka[n];
            object = this.mAJakka[n];
            kaajmma2.MAJAkKA(majjmka2);
            kaajmma2.majakKA(0.7853982f);
            kaajmma2.MaJAKKA();
            double d = kaajmma2.MAjAkKA();
            double d2 = Math.min(Math.abs(1.0 / Math.cos(d)), Math.abs(1.0 / Math.cos(1.5707963267948966 - d)));
            mmjamma mmjamma2 = new mmjamma(kaajmma2.MajaKka, kaajmma2.majaKka, 0.0);
            mmjamma2.mAjAKka();
            mmjamma2.Majakka(Math.acos(Math.abs(kaajmma2.MAjaKka)) / 1.5707963267948966);
            mmjamma2.Majakka(d2);
            double d3 = mmjamma2.mAJAKka;
            double d4 = mmjamma2.MajAKka;
            ((kajjmmk)object).jAKkaMA = (float)((d3 + 1.0) / 2.0);
            ((kajjmmk)object).JakkaMA = (float)((d4 + 1.0) / 2.0);
            ++n;
        }
        int n2 = 0;
        while (n2 < this.maJakka.length) {
            object = this.maJakka[n2];
            ((kaaamma)object).aMAJAKK = ((kaaamma)object).AMaJAKK < 0.0f ? mmajkka2 : mmajkka3;
            ++n2;
        }
    }

    public void JAKKaMA() {
        kaajmma kaajmma2 = new kaajmma();
        int n = 0;
        while (n < this.MAJakka.length) {
            majjmka majjmka2 = this.MAJakka[n];
            kajjmmk kajjmmk2 = this.mAJakka[n];
            kaajmma2.mAJaKka(majjmka2.kAMajAK, majjmka2.KamajAK, majjmka2.kamajAK);
            kaajmma2.MaJAKKA();
            double d = 1.5707963267948966 - Math.acos(kaajmma2.majaKka);
            double d2 = kaajmma2.maJaKka();
            d2 /= Math.PI;
            d2 = -d2;
            kajjmmk2.jAKkaMA = (float)((d2 + 1.0) / 2.0);
            kajjmmk2.JakkaMA = (float)(((d /= 1.5707963267948966) + 1.0) / 2.0);
            ++n;
        }
    }

    public void jaKkama(kaajmma kaajmma2) {
        kaajmma kaajmma3 = this.MAjakka.MAJakKA(kaajmma2);
        int n = 0;
        while (n < this.MAJakka.length) {
            majjmka majjmka2 = this.MAJakka[n];
            majjmka2.MaJaKka(kaajmma3);
            ++n;
        }
        this.MAjakka.MAJAkKA(kaajmma2);
    }

    public void Jakkama(kaajmma kaajmma2) {
        this.jAkkaMA(kaajmma2.MajaKka, kaajmma2.majaKka, kaajmma2.MAjaKka);
    }

    public void jAkkaMA(float f, float f2, float f3) {
        int n = 0;
        while (n < this.MAJakka.length) {
            majjmka majjmka2 = this.MAJakka[n];
            majjmka2.mAjAKKA(f, f2, f3);
            ++n;
        }
    }

    public void JakKAma() {
        Object object;
        int n = 0;
        while (n < this.maJakka.length) {
            object = this.maJakka[n];
            ((kaaamma)object).amajaKK();
            ((kaaamma)object).AmajaKK();
            ++n;
        }
        if (this.maJAkka) {
            this.mAJakka = new kajjmmk[this.MAJakka.length];
            int n2 = 0;
            while (n2 < this.MAJakka.length) {
                this.mAJakka[n2] = new kajjmmk();
                ++n2;
            }
            int n3 = 0;
            while (n3 < this.maJakka.length) {
                kajjkka kajjkka2 = this.maJakka[n3];
                int n4 = 0;
                while (this.MAJakka[n4] != kajjkka2.amAJAkk) {
                    ++n4;
                }
                int n5 = 0;
                while (this.MAJakka[n5] != kajjkka2.AMAJAkk) {
                    ++n5;
                }
                int n6 = 0;
                while (this.MAJakka[n6] != kajjkka2.aMAJAkk) {
                    ++n6;
                }
                this.maJakka[n3].AmaJAkk = this.mAJakka[n4];
                this.maJakka[n3].amaJAkk = this.mAJakka[n5];
                this.maJakka[n3].AMaJAkk = this.mAJakka[n6];
                ++n3;
            }
        }
        object = new kaajmma();
        float f = 0.0f;
        int n7 = 0;
        while (n7 < this.MAJakka.length) {
            majjmka majjmka2 = this.MAJakka[n7];
            ((kaajmma)object).mAJaKka(majjmka2.kAMajAK, majjmka2.KamajAK, majjmka2.kamajAK);
            ((kaajmma)object).MaJAKKA();
            majjmka2.kAMajAK = ((kaajmma)object).MajaKka;
            majjmka2.KamajAK = ((kaajmma)object).majaKka;
            majjmka2.kamajAK = ((kaajmma)object).MAjaKka;
            float f2 = majjmka2.maJAKKA();
            if (f2 > f) {
                f = f2;
            }
            ++n7;
        }
        this.MaJAkka = (float)Math.sqrt(f);
    }

    public void jAKkAma(mmajkka mmajkka2, float f) {
        int n = 0;
        while (n < this.MAJakka.length) {
            majjmka majjmka2 = this.MAJakka[n];
            kajjmmk kajjmmk2 = this.mAJakka[n];
            kajjmmk2.jAKkaMA = -majjmka2.majaKka / f * (float)mmajkka2.kAMAJaK;
            kajjmmk2.JakkaMA = 0.0f;
            ++n;
        }
        int n2 = 0;
        while (n2 < this.maJakka.length) {
            this.maJakka[n2].aMAJAKK = mmajkka2;
            ++n2;
        }
    }

    public void JAkKaMA(mmajkka mmajkka2) {
        int n = 0;
        while (n < this.maJakka.length) {
            this.maJakka[n].aMAJAKK = mmajkka2;
            ++n;
        }
    }

    public void jAKKAma(mmajkka mmajkka2, maaakka maaakka2) {
        int n = 0;
        while (n < this.maJakka.length) {
            this.maJakka[n].aMAJAKK = mmajkka2;
            this.maJakka[n].AMAJAKK = maaakka2;
            ++n;
        }
    }

    public void JAKkAma(int n) {
        int n2 = 0;
        while (n2 < this.maJakka.length) {
            this.maJakka[n2].amAJAKK = n;
            ++n2;
        }
    }

    public void jakkaMA() {
        int n = 0;
        while (n < this.maJakka.length) {
            kajjkka kajjkka2 = this.maJakka[n];
            kajjkka2.AmaJAKK = -kajjkka2.AmaJAKK;
            kajjkka2.amaJAKK = -kajjkka2.amaJAKK;
            kajjkka2.AMaJAKK = -kajjkka2.AMaJAKK;
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
        if (this.MAJAKKa != 0) {
            this.JakkaMA();
            if (this.MAJAkka) {
                this.JaKkAma();
            }
            if (this.maJAkka) {
                this.JakKaMA();
            }
            this.jaKKaMA();
            return;
        }
        if (this.maJAkka) {
            this.JakKaMA();
        }
        if (n == 0) {
            this.JAKkaMA();
            if (this.MAJAkka) {
                this.JaKkAma();
            }
            this.jAKkaMA();
            return;
        }
        this.JAkkama();
        if (this.MAJAkka) {
            this.JaKkAma();
        }
        this.jAkKAma();
        this.jAkkAma();
    }

    kaajmma jakKaMA() {
        kaajmma kaajmma2 = new kaajmma(this.Majakka);
        kaajmma2.MajAKKA(this.MajAkka.AMaJAkK);
        this.mAjakka.kamaJAK().KAmAjAK(kaajmma2);
        return new kaajmma(kaajmma2.MajaKka / this.majakka.MajaKka, kaajmma2.majaKka / this.majakka.majaKka, kaajmma2.MAjaKka / this.majakka.MAjaKka);
    }

    void JaKkAma() {
        float f = this.MajAkka.AmajakK;
        float f2 = this.MajAkka.aMAjakK;
        majjmka[] majjmkaArray = this.MAJakka;
        int n = majjmkaArray.length;
        int n2 = 0;
        while (n2 < n) {
            majjmka majjmka2 = majjmkaArray[n2];
            float f3 = (majjmka2.KaMAjAK - f) / (f2 - f);
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 > 0.99609375f) {
                f3 = 0.99609375f;
            }
            majjmka2.KamAjAK = f3;
            ++n2;
        }
    }

    public void jaKkAma() {
        int n = 0;
        while (n < this.maJakka.length) {
            this.maJakka[n].aMAjaKK();
            ++n;
        }
    }

    public void jakkAma() {
        this.mAjAkka = this.mAjakka.KAMAjAK(this.MajAkka.aMaJAkK.kamaJAK());
        this.mAjAkka.kamAJAK(this.majakka);
        this.MaJaKKa = (float)((double)(65536 * (this.MajAkka.AMAJAkK >> 1)) / Math.tan(this.MajAkka.amaJAkK / 2.0f));
        this.maJaKKa = this.MajAkka.AMAJAkK << 16 >> 1;
        this.MAJaKKa = this.MajAkka.aMAJAkK << 16 >> 1;
        this.mAJaKKa = this.MajAkka.AMAJAkK << 16;
        this.MajaKKa = this.MajAkka.aMAJAkK << 16;
        this.majaKKa = this.MajAkka.AMAjakK;
        this.MAjaKKa = this.MajAkka.aMAjakK;
        kaajmma kaajmma2 = new kaajmma(this.Majakka);
        kaajmma2.MajAKKA(this.MajAkka.AMaJAkK);
        this.MajAkka.aMaJAkK.kamaJAK().KAmAjAK(kaajmma2);
        this.mAjaKKa = kaajmma2.MajaKka;
        this.MaJAKKa = kaajmma2.majaKka;
        this.maJAKKa = kaajmma2.MAjaKka;
    }

    public void JAKkaMA() {
        this.jakKAma(this.MAJakka, this.MAJakka.length);
    }

    public void jakKAma(majjmka[] majjmkaArray, int n) {
        kaaakka kaaakka2 = this.mAjAkka;
        float f = kaaakka2.KaMAjaK;
        float f2 = kaaakka2.kaMAjaK;
        float f3 = kaaakka2.KAMAjaK;
        float f4 = kaaakka2.kAMAjaK;
        float f5 = kaaakka2.KamAjaK;
        float f6 = kaaakka2.kamAjaK;
        float f7 = kaaakka2.KAmAjaK;
        float f8 = kaaakka2.kAmAjaK;
        float f9 = kaaakka2.KaMaJAK;
        float f10 = this.mAjaKKa;
        float f11 = this.MaJAKKa;
        float f12 = this.maJAKKa;
        float f13 = this.MaJaKKa;
        float f14 = this.maJaKKa;
        float f15 = this.MAJaKKa;
        int n2 = 0;
        while (n2 < n) {
            majjmka majjmka2 = majjmkaArray[n2++];
            float f16 = majjmka2.MajaKka;
            float f17 = majjmka2.majaKka;
            float f18 = majjmka2.MAjaKka;
            float f19 = f * f16 + f4 * f17 + f7 * f18 + f10;
            float f20 = f2 * f16 + f5 * f17 + f8 * f18 + f11;
            float f21 = f3 * f16 + f6 * f17 + f9 * f18 + f12;
            float f22 = f13 / f21;
            majjmka2.kaMAjAK = f19 * f22 + f14;
            majjmka2.KAMAjAK = -(f20 * f22) + f15;
            majjmka2.KaMAjAK = f21;
        }
    }

    public void JAkkama() {
        this.jaKKAma(this.MAJakka, this.MAJakka.length);
    }

    public void jaKKAma(majjmka[] majjmkaArray, int n) {
        kaaakka kaaakka2 = this.mAjAkka;
        float f = kaaakka2.KaMAjaK;
        float f2 = kaaakka2.kaMAjaK;
        float f3 = kaaakka2.KAMAjaK;
        float f4 = kaaakka2.kAMAjaK;
        float f5 = kaaakka2.KamAjaK;
        float f6 = kaaakka2.kamAjaK;
        float f7 = kaaakka2.KAmAjaK;
        float f8 = kaaakka2.kAmAjaK;
        float f9 = kaaakka2.KaMaJAK;
        float f10 = this.mAjaKKa;
        float f11 = this.MaJAKKa;
        float f12 = this.maJAKKa;
        float f13 = this.MaJaKKa;
        float f14 = this.maJaKKa;
        float f15 = this.MAJaKKa;
        float f16 = this.majaKKa;
        float f17 = this.MAjaKKa;
        float f18 = this.mAJaKKa;
        float f19 = this.MajaKKa;
        int n2 = 0;
        while (n2 < n) {
            majjmka majjmka2 = majjmkaArray[n2++];
            float f20 = f * majjmka2.MajaKka + f4 * majjmka2.majaKka + f7 * majjmka2.MAjaKka + f10;
            float f21 = f2 * majjmka2.MajaKka + f5 * majjmka2.majaKka + f8 * majjmka2.MAjaKka + f11;
            float f22 = f3 * majjmka2.MajaKka + f6 * majjmka2.majaKka + f9 * majjmka2.MAjaKka + f12;
            if (f22 < f16) {
                majjmka2.kAMAjAK = 32768;
                f22 = this.majaKKa;
            } else {
                majjmka2.kAMAjAK = f22 > f17 ? 4096 : 0;
            }
            float f23 = f13 / f22;
            majjmka2.kaMAjAK = f20 * f23 + f14;
            majjmka2.KAMAjAK = -(f21 * f23) + f15;
            majjmka2.KAmajAK = f20;
            majjmka2.kAmajAK = f21;
            majjmka2.KaMAjAK = f22;
            if (majjmka2.kaMAjAK < 0.0f) {
                majjmka2.kAMAjAK |= 1;
            } else if (majjmka2.kaMAjAK >= f18) {
                majjmka2.kAMAjAK |= 8;
            }
            if (majjmka2.KAMAjAK < 0.0f) {
                majjmka2.kAMAjAK |= 0x40;
                continue;
            }
            if (!(majjmka2.KAMAjAK >= f19)) continue;
            majjmka2.kAMAjAK |= 0x200;
        }
    }

    public void JakkaMA() {
        this.JAkKAma(this.MAJakka, this.MAJakka.length);
    }

    public void JAkKAma(majjmka[] majjmkaArray, int n) {
        kaaakka kaaakka2 = this.mAjAkka;
        float f = kaaakka2.KaMAjaK;
        float f2 = kaaakka2.kaMAjaK;
        float f3 = kaaakka2.KAMAjaK;
        float f4 = kaaakka2.kAMAjaK;
        float f5 = kaaakka2.KamAjaK;
        float f6 = kaaakka2.kamAjaK;
        float f7 = kaaakka2.KAmAjaK;
        float f8 = kaaakka2.kAmAjaK;
        float f9 = kaaakka2.KaMaJAK;
        kaaakka kaaakka3 = this.mAjakka;
        float f10 = this.mAjaKKa;
        float f11 = this.MaJAKKa;
        float f12 = this.maJAKKa;
        float f13 = this.MaJaKKa;
        float f14 = this.maJaKKa;
        float f15 = this.MAJaKKa;
        float f16 = this.majaKKa;
        float f17 = this.MAjaKKa;
        float f18 = this.mAJaKKa;
        float f19 = this.MajaKKa;
        int n2 = this.MAJAKKa;
        kaajmma kaajmma2 = new kaajmma();
        int n3 = 0;
        while (n3 < n) {
            majjmka majjmka2 = majjmkaArray[n3++];
            float f20 = majjmka2.MajaKka;
            float f21 = majjmka2.majaKka;
            float f22 = majjmka2.MAjaKka;
            float f23 = 0.0f;
            float f24 = 0.0f;
            float f25 = 0.0f;
            f20 -= f23;
            f21 -= f24;
            f22 -= f25;
            switch (n2) {
                case 1: {
                    float f26 = (float)Math.atan2(f20, f21) * 2.0f + this.mAJAKKa;
                    f26 = (float)Math.sin(f26);
                    f26 = 1.0f + f26 * 0.175f;
                    f20 *= f26;
                    f21 *= f26;
                    f22 *= f26;
                    break;
                }
                case 2: {
                    float f26 = f20 * f20 + f21 * f21 + f22 * f22;
                    f26 = (float)((double)f26 * 0.085);
                    kaajmma2.mAJaKka(f20, f21, f22);
                    kaajmma2.majakKA(f26 *= (float)Math.sin(this.mAJAKKa + f22 * 0.1f));
                    f20 = kaajmma2.MajaKka;
                    f21 = kaajmma2.majaKka;
                    f22 = kaajmma2.MAjaKka;
                    break;
                }
                case 3: {
                    float f26 = (float)Math.sqrt(f20 * f20 + f21 * f21 + f22 * f22);
                    f26 = (float)Math.sin((double)(f26 * 3.1f) + (double)this.mAJAKKa * 2.1);
                    f26 = 1.0f + f26 * 0.109f;
                    f20 *= f26;
                    f21 *= f26;
                    f22 *= f26;
                    break;
                }
                case 4: {
                    float f26 = (float)Math.sqrt(f20 * f20 + f21 * f21 + f22 * f22);
                    f26 = (float)Math.sin((double)(f26 * 3.14f) + (double)this.mAJAKKa * 2.7);
                    f26 = 1.0f + (float)Math.sin(f26) * 0.109f;
                    f20 *= f26;
                    f21 *= f26;
                    f22 *= f26;
                    break;
                }
                case 5: {
                    float f26 = f20 * f20 + f21 * f21 + f22 * f22;
                    kaajmma2.mAJaKka(f20, f21, f22);
                    kaajmma2.majakKA((f26 *= 0.25f) * (float)Math.sin(this.mAJAKKa + f20 * 0.2f + f22 * 0.3f));
                    f20 = kaajmma2.MajaKka;
                    f21 = kaajmma2.majaKka;
                    f22 = kaajmma2.MAjaKka;
                    break;
                }
            }
            float f27 = f * (f20 += f23) + f4 * (f21 += f24) + f7 * (f22 += f25) + f10;
            float f28 = f2 * f20 + f5 * f21 + f8 * f22 + f11;
            float f29 = f3 * f20 + f6 * f21 + f9 * f22 + f12;
            if (f29 < f16) {
                majjmka2.kAMAjAK = 32768;
                f29 = this.majaKKa;
            } else {
                majjmka2.kAMAjAK = f29 > f17 ? 4096 : 0;
            }
            float f30 = f13 / f29;
            majjmka2.kaMAjAK = f27 * f30 + f14;
            majjmka2.KAMAjAK = -(f28 * f30) + f15;
            majjmka2.KAmajAK = f27;
            majjmka2.kAmajAK = f28;
            majjmka2.KaMAjAK = f29;
            if (majjmka2.kaMAjAK < 0.0f) {
                majjmka2.kAMAjAK |= 1;
            } else if (majjmka2.kaMAjAK >= f18) {
                majjmka2.kAMAjAK |= 8;
            }
            if (majjmka2.KAMAjAK < 0.0f) {
                majjmka2.kAMAjAK |= 0x40;
                continue;
            }
            if (!(majjmka2.KAMAjAK >= f19)) continue;
            majjmka2.kAMAjAK |= 0x200;
        }
    }

    public void jAKkaMA() {
        this.JAkkaMA(this.maJakka, this.maJakka.length);
    }

    public void JAkkaMA(kajjkka[] kajjkkaArray, int n) {
        kajjkka[] kajjkkaArray2 = kaaamma.aMaJAKK;
        int n2 = kaaamma.AmAjaKK;
        kaajmma kaajmma2 = this.jakKaMA();
        float f = kaajmma2.MajaKka;
        float f2 = kaajmma2.majaKka;
        float f3 = kaajmma2.MAjaKka;
        int n3 = 0;
        while (n3 < n) {
            kajjkka kajjkka2 = kajjkkaArray[n3++];
            if (!((f + kajjkka2.amAJAkk.MajaKka) * kajjkka2.AmaJAKK + (f2 + kajjkka2.amAJAkk.majaKka) * kajjkka2.amaJAKK + (f3 + kajjkka2.amAJAkk.MAjaKka) * kajjkka2.AMaJAKK < 0.0f)) continue;
            kajjkka2.aMajakk = -(kajjkka2.amAJAkk.KaMAjAK + kajjkka2.AMAJAkk.KaMAjAK + kajjkka2.aMAJAkk.KaMAjAK);
            kajjkkaArray2[n2++] = kajjkka2;
        }
        kaaamma.AmAjaKK = n2;
    }

    public void jAkKAma() {
        this.jAKkama(this.maJakka, this.maJakka.length);
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
                kajjkka2.aMajakk = -(kajjkka2.amAJAkk.KaMAjAK + kajjkka2.AMAJAkk.KaMAjAK + kajjkka2.aMAJAkk.KaMAjAK);
                kajjkkaArray2[n2++] = kajjkka2;
                continue;
            }
            if ((n4 & 0x24924) != 0 || (n4 & 0x30000) == 0 || !((f + kajjkka2.amAJAkk.MajaKka) * kajjkka2.AmaJAKK + (f2 + kajjkka2.amAJAkk.majaKka) * kajjkka2.amaJAKK + (f3 + kajjkka2.amAJAkk.MAjaKka) * kajjkka2.AMaJAKK < 0.0f)) continue;
            kajjkka2.aMajakk = -(kajjkka2.amAJAkk.KaMAjAK + kajjkka2.AMAJAkk.KaMAjAK + kajjkka2.aMAJAkk.KaMAjAK);
            this.JaKKAma(kajjkka2);
        }
        kaaamma.AmAjaKK = n2;
    }

    public void JakkAma() {
        kajjkka[] kajjkkaArray = this.maJakka;
        int n = kajjkkaArray.length;
        this.JAKKAma(kajjkkaArray, n);
    }

    public void JAKKAma(kajjkka[] kajjkkaArray, int n) {
        kajjkka[] kajjkkaArray2 = kaaamma.aMaJAKK;
        int n2 = kaaamma.AmAjaKK;
        int n3 = 0;
        while (n3 < n) {
            kajjkka kajjkka2 = kajjkkaArray[n3++];
            float f = kajjkka2.amAJAkk.kaMAjAK;
            float f2 = kajjkka2.AMAJAkk.kaMAjAK - f;
            float f3 = kajjkka2.amAJAkk.KAMAjAK;
            float f4 = kajjkka2.aMAJAkk.KAMAjAK - f3;
            float f5 = kajjkka2.aMAJAkk.kaMAjAK - f;
            float f6 = kajjkka2.AMAJAkk.KAMAjAK - f3;
            if (!(f2 * f4 - f5 * f6 < 0.0f)) continue;
            kajjkka2.aMajakk = -(kajjkka2.amAJAkk.KaMAjAK + kajjkka2.AMAJAkk.KaMAjAK + kajjkka2.aMAJAkk.KaMAjAK);
            kajjkkaArray2[n2++] = kajjkka2;
        }
        kaaamma.AmAjaKK = n2;
    }

    public void jaKKaMA() {
        kajjkka[] kajjkkaArray = this.maJakka;
        int n = kajjkkaArray.length;
        kajjkka[] kajjkkaArray2 = kaaamma.aMaJAKK;
        int n2 = kaaamma.AmAjaKK;
        float f = this.majaKKa;
        int n3 = 0;
        while (n3 < n) {
            kajjkka kajjkka2 = kajjkkaArray[n3++];
            if (kajjkka2.amAJAkk.KaMAjAK < f || kajjkka2.AMAJAkk.KaMAjAK < f || kajjkka2.aMAJAkk.KaMAjAK < f) break;
            float f2 = kajjkka2.amAJAkk.kaMAjAK;
            float f3 = kajjkka2.AMAJAkk.kaMAjAK - f2;
            float f4 = kajjkka2.amAJAkk.KAMAjAK;
            float f5 = kajjkka2.aMAJAkk.KAMAjAK - f4;
            float f6 = kajjkka2.aMAJAkk.kaMAjAK - f2;
            float f7 = kajjkka2.AMAJAkk.KAMAjAK - f4;
            if (!(f3 * f5 - f6 * f7 < 0.0f)) continue;
            kajjkka2.aMajakk = -(kajjkka2.amAJAkk.KaMAjAK + kajjkka2.AMAJAkk.KaMAjAK + kajjkka2.aMAJAkk.KaMAjAK);
            kajjkkaArray2[n2++] = kajjkka2;
        }
        kaaamma.AmAjaKK = n2;
    }

    public final void JakKaMA() {
        kaaakka kaaakka2 = this.mAjakka;
        if (this.MajAKKa) {
            kaaakka2 = this.MajAkka.aMaJAkK.kamaJAK();
        }
        if (this.majAKKa != null) {
            kaaakka2 = kaaakka2.KAMAjAK(this.majAKKa);
        }
        float f = kaaakka2.KaMAjaK;
        float f2 = kaaakka2.kaMAjaK;
        float f3 = kaaakka2.kAMAjaK;
        float f4 = kaaakka2.KamAjaK;
        float f5 = kaaakka2.KAmAjaK;
        float f6 = kaaakka2.kAmAjaK;
        kajjmmk[] kajjmmkArray = this.mAJakka;
        int n = kajjmmkArray.length;
        majjmka[] majjmkaArray = this.MAJakka;
        int n2 = 0;
        while (n2 < n) {
            kajjmmk kajjmmk2 = kajjmmkArray[n2];
            majjmka majjmka2 = majjmkaArray[n2++];
            kajjmmk2.jAKkaMA = (f * majjmka2.kAMajAK + f3 * majjmka2.KamajAK + f5 * majjmka2.kamajAK + 1.0f) * 0.5f;
            kajjmmk2.JakkaMA = (f2 * majjmka2.kAMajAK + f4 * majjmka2.KamajAK + f6 * majjmka2.kamajAK + 1.0f) * 0.5f;
        }
    }

    public void JaKKAma(kajjkka kajjkka2) {
        if (MaJakKa < maJakKa.length) {
            mmaakkk.maJakKa[mmaakkk.MaJakKa++] = kajjkka2;
        }
    }

    public void jAkkAma() {
        if (MaJakKa == 0) {
            return;
        }
        int n = 0;
        while (n < MaJakKa) {
            kajjkka kajjkka2 = maJakKa[n];
            kajjmmk kajjmmk2 = kajjkka2.AmaJAkk;
            kajjmmk kajjmmk3 = kajjkka2.amaJAkk;
            kajjmmk kajjmmk4 = kajjkka2.AMaJAkk;
            majjmka majjmka2 = kajjkka2.amAJAkk;
            majjmka majjmka3 = kajjkka2.AMAJAkk;
            majjmka majjmka4 = kajjkka2.aMAJAkk;
            int n2 = majjmka2.kAMAjAK;
            int n3 = majjmka3.kAMAjAK;
            int n4 = majjmka4.kAMAjAK;
            int n5 = ((n2 & 0x8000) + (n3 & 0x8000) * 2 + (n4 & 0x8000) * 4) / 32768;
            switch (n5) {
                case 1: {
                    this.jAkkama(kajjkka2, majjmka3, majjmka4, majjmka2, kajjmmk3, kajjmmk4, kajjmmk2);
                    break;
                }
                case 2: {
                    this.jAkkama(kajjkka2, majjmka2, majjmka4, majjmka3, kajjmmk2, kajjmmk4, kajjmmk3);
                    break;
                }
                case 4: {
                    this.jAkkama(kajjkka2, majjmka2, majjmka3, majjmka4, kajjmmk2, kajjmmk3, kajjmmk4);
                    break;
                }
                case 5: {
                    this.JAkkAma(kajjkka2, majjmka3, majjmka2, majjmka4, kajjmmk3, kajjmmk2, kajjmmk4);
                    break;
                }
                case 3: {
                    this.JAkkAma(kajjkka2, majjmka4, majjmka3, majjmka2, kajjmmk4, kajjmmk3, kajjmmk2);
                    break;
                }
                case 6: {
                    this.JAkkAma(kajjkka2, majjmka2, majjmka3, majjmka4, kajjmmk2, kajjmmk3, kajjmmk4);
                    break;
                }
            }
            ++n;
        }
        this.JAKkama(mAjAKKa, MAjAKKa);
        MAjAKKa = 0;
        MaJakKa = 0;
    }

    void JAkkAma(kajjkka kajjkka2, majjmka majjmka2, majjmka majjmka3, majjmka majjmka4, kajjmmk kajjmmk2, kajjmmk kajjmmk3, kajjmmk kajjmmk4) {
        float f = (majjmka2.KaMAjAK - this.majaKKa) / (majjmka2.KaMAjAK - majjmka3.KaMAjAK);
        float f2 = majjmka2.KAmajAK + f * (majjmka3.KAmajAK - majjmka2.KAmajAK);
        float f3 = majjmka2.kAmajAK + f * (majjmka3.kAmajAK - majjmka2.kAmajAK);
        majjmka majjmka5 = new majjmka(f2, f3, this.majaKKa);
        majjmka5.kAMajak(f2, f3, this.majaKKa);
        kajjmmk kajjmmk5 = new kajjmmk(kajjmmk2.jAKkaMA + f * (kajjmmk3.jAKkaMA - kajjmmk2.jAKkaMA), kajjmmk2.JakkaMA + f * (kajjmmk3.JakkaMA - kajjmmk2.JakkaMA));
        f = (majjmka2.KaMAjAK - this.majaKKa) / (majjmka2.KaMAjAK - majjmka4.KaMAjAK);
        float f4 = majjmka2.KAmajAK + f * (majjmka4.KAmajAK - majjmka2.KAmajAK);
        float f5 = majjmka2.kAmajAK + f * (majjmka4.kAmajAK - majjmka2.kAmajAK);
        majjmka majjmka6 = new majjmka();
        majjmka6.kAMajak(f4, f5, this.majaKKa);
        kajjmmk kajjmmk6 = new kajjmmk(kajjmmk2.jAKkaMA + f * (kajjmmk4.jAKkaMA - kajjmmk2.jAKkaMA), kajjmmk2.JakkaMA + f * (kajjmmk4.JakkaMA - kajjmmk2.JakkaMA));
        mmaakkk.mAjAKKa[mmaakkk.MAjAKKa++] = majjmka5;
        mmaakkk.mAjAKKa[mmaakkk.MAjAKKa++] = majjmka6;
        kajjkka kajjkka3 = new kajjkka(kajjkka2, majjmka2, majjmka5, majjmka6, kajjmmk2, kajjmmk5, kajjmmk6);
        kajjkka3.aMajakk = kajjkka2.aMajakk;
        kaaamma.aMaJAKK[kaaamma.AmAjaKK++] = kajjkka3;
    }

    void jAkkama(kajjkka kajjkka2, majjmka majjmka2, majjmka majjmka3, majjmka majjmka4, kajjmmk kajjmmk2, kajjmmk kajjmmk3, kajjmmk kajjmmk4) {
        float f = (majjmka2.KaMAjAK - this.majaKKa) / (majjmka2.KaMAjAK - majjmka4.KaMAjAK);
        float f2 = majjmka2.KAmajAK + f * (majjmka4.KAmajAK - majjmka2.KAmajAK);
        float f3 = majjmka2.kAmajAK + f * (majjmka4.kAmajAK - majjmka2.kAmajAK);
        majjmka majjmka5 = new majjmka();
        majjmka5.kAMajak(f2, f3, this.majaKKa);
        kajjmmk kajjmmk5 = new kajjmmk(kajjmmk2.jAKkaMA + f * (kajjmmk4.jAKkaMA - kajjmmk2.jAKkaMA), kajjmmk2.JakkaMA + f * (kajjmmk4.JakkaMA - kajjmmk2.JakkaMA));
        f = (majjmka3.KaMAjAK - this.majaKKa) / (majjmka3.KaMAjAK - majjmka4.KaMAjAK);
        float f4 = majjmka3.KAmajAK + f * (majjmka4.KAmajAK - majjmka3.KAmajAK);
        float f5 = majjmka3.kAmajAK + f * (majjmka4.kAmajAK - majjmka3.kAmajAK);
        majjmka majjmka6 = new majjmka();
        majjmka6.kAMajak(f4, f5, this.majaKKa);
        kajjmmk kajjmmk6 = new kajjmmk(kajjmmk3.jAKkaMA + f * (kajjmmk4.jAKkaMA - kajjmmk3.jAKkaMA), kajjmmk3.JakkaMA + f * (kajjmmk4.JakkaMA - kajjmmk3.JakkaMA));
        mmaakkk.mAjAKKa[mmaakkk.MAjAKKa++] = majjmka5;
        mmaakkk.mAjAKKa[mmaakkk.MAjAKKa++] = majjmka6;
        kajjkka kajjkka3 = new kajjkka(kajjkka2, majjmka5, majjmka2, majjmka3, kajjmmk5, kajjmmk2, kajjmmk3);
        kajjkka3.aMajakk = kajjkka2.aMajakk;
        kaaamma.aMaJAKK[kaaamma.AmAjaKK++] = kajjkka3;
        kajjkka3 = new kajjkka(kajjkka2, majjmka5, majjmka6, majjmka3, kajjmmk5, kajjmmk6, kajjmmk3);
        kajjkka3.aMajakk = kajjkka2.aMajakk;
        kaaamma.aMaJAKK[kaaamma.AmAjaKK++] = kajjkka3;
    }

    public void JAKkama(majjmka[] majjmkaArray, int n) {
        float f = this.maJaKKa;
        float f2 = this.MAJaKKa;
        float f3 = this.MaJaKKa;
        int n2 = 0;
        while (n2 < n) {
            majjmka majjmka2 = majjmkaArray[n2];
            float f4 = f3 / majjmka2.KaMAjAK;
            majjmka2.kaMAjAK = majjmka2.KAmajAK * f4 + f;
            majjmka2.KAMAjAK = -(majjmka2.kAmajAK * f4) + f2;
            ++n2;
        }
    }

    static {
        mAjAKKa = new majjmka[1000];
        maJakKa = new kajjkka[1000];
    }
}

