/*
 * Decompiled with CFR 0.152.
 */
public class kmjammk
extends mmaakkk {
    int JAkKAMa;
    int jAkKAMa;
    short[][] JaKkaMa;
    public int jaKkaMa;
    public int JAKkaMa;
    int jAKkaMa;
    int JakkaMa;
    int jakkaMa;
    int JAkkaMa;
    float jAkkaMa;
    float JaKKaMa;
    public mmajkka jaKKaMa;
    public maaakka JAKKaMa;
    public maaakka jAKKaMa;
    public mmajkka JakKaMa;
    public boolean jakKaMa;
    majjmka[] JAkKaMa;
    kajjkka[] jAkKaMa;
    int AjAkKaM;
    int ajAkKaM;
    int AJAkKaM;
    int aJAkKaM;
    public float AjakKaM;
    public float ajakKaM;
    public static final int AJakKaM = 3;
    public static final int aJakKaM = 259;
    public boolean AjAKKaM;
    boolean ajAKKaM;
    static final float AJAKKaM = 0.0f;

    /*
     * Exception decompiling
     */
    public kmjammk(short[][] var1_1, float var2_2, float var3_3, mmjjmkk var4_4, boolean var5_5) {
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

    public void AKkaMAJ(int n, int n2, float f, int n3) {
        int n4;
        this.MAJakka = new majjmka[n * n2];
        int n5 = 0;
        int n6 = 0;
        while (n6 < n2) {
            n4 = 0;
            while (n4 < n) {
                float f2 = (float)(-(n4 - n / 2)) * f;
                float f3 = (float)(n6 - n2 / 2) * f;
                float f4 = 0.0f;
                this.MAJakka[n5] = new majjmka(f2, f3, f4);
                ++n5;
                ++n4;
            }
            ++n6;
        }
        this.maJakka = new kajjkka[(n - 1) * (n2 - 1) * 2];
        n4 = 0;
        int n7 = 0;
        while (n7 < n2 - 1) {
            int n8 = 0;
            while (n8 < n - 1) {
                int n9 = n7 * n2 + n8;
                int n10 = n7 * n2 + n8 + 1;
                int n11 = (n7 + 1) * n2 + n8;
                int n12 = (n7 + 1) * n2 + n8 + 1;
                this.maJakka[n4++] = new kajjkka(this, n9, n12, n10, n9, n12, n10);
                this.maJakka[n4++] = new kajjkka(this, n12, n9, n11, n12, n9, n11);
                this.maJakka[n4 - 2].amAJAKK = n3;
                this.maJakka[n4 - 1].amAJAKK = n3;
                ++n8;
            }
            ++n7;
        }
        this.JakKAma();
    }

    public void AkKAMAJ() {
    }

    public float akKAMAJ(float f, float f2, float f3, float f4, float f5) {
        return Math.min(f, Math.min(f2, Math.min(f3, Math.min(f4, f5))));
    }

    public float AKKAMAJ(float f, float f2, float f3, float f4, float f5) {
        return Math.max(f, Math.max(f2, Math.max(f3, Math.max(f4, f5))));
    }

    public void aKkaMAJ() {
        kaaamka kaaamka2 = new kaaamka();
        kaaamka2.kKAMajA(this.MajAkka, null);
        float f = this.akKAMAJ(0.0f, kaaamka2.KkaMaja.MajaKka, kaaamka2.kkaMaja.MajaKka, kaaamka2.KKaMaja.MajaKka, kaaamka2.kKaMaja.MajaKka);
        float f2 = this.AKKAMAJ(0.0f, kaaamka2.KkaMaja.MajaKka, kaaamka2.kkaMaja.MajaKka, kaaamka2.KKaMaja.MajaKka, kaaamka2.kKaMaja.MajaKka);
        float f3 = this.akKAMAJ(0.0f, kaaamka2.KkaMaja.majaKka, kaaamka2.kkaMaja.majaKka, kaaamka2.KKaMaja.majaKka, kaaamka2.kKaMaja.majaKka);
        float f4 = this.AKKAMAJ(0.0f, kaaamka2.KkaMaja.majaKka, kaaamka2.kkaMaja.majaKka, kaaamka2.KKaMaja.majaKka, kaaamka2.kKaMaja.majaKka);
        f += this.MajAkka.AMaJAkK.MajaKka;
        f2 += this.MajAkka.AMaJAkK.MajaKka;
        f3 += this.MajAkka.AMaJAkK.majaKka;
        f4 += this.MajAkka.AMaJAkK.majaKka;
        this.AjAkKaM = (int)(f /= this.jAkkaMa);
        this.ajAkKaM = (int)(f2 /= this.jAkkaMa);
        this.AJAkKaM = (int)(f3 /= this.jAkkaMa);
        this.aJAkKaM = (int)(f4 /= this.jAkkaMa);
        this.ajAkKaM += 2;
        this.aJAkKaM += 2;
        --this.AjAkKaM;
        --this.AJAkKaM;
        if (this.ajAkKaM - this.AjAkKaM > this.jAKkaMa) {
            System.err.println("dem cull X over" + (this.ajAkKaM - this.AjAkKaM - this.JAkKAMa));
            this.ajAkKaM = this.AjAkKaM + this.jAKkaMa;
        }
        if (this.aJAkKaM - this.AJAkKaM > this.JakkaMa) {
            System.err.println("dem cull Y over " + (this.aJAkKaM - this.AJAkKaM - this.jAkKAMa));
            this.aJAkKaM = this.AJAkKaM + this.JakkaMa;
        }
    }

    public void JAKkaMA() {
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
        float f20 = this.MajAkka.AmajakK;
        float f21 = this.jAkkaMa;
        float f22 = (float)this.AJAkKaM * f21;
        int n = this.AJAkKaM;
        while (n < this.aJAkKaM) {
            float f23 = (float)this.AjAkKaM * f21;
            int n2 = (n - this.AJAkKaM) * this.jAKkaMa;
            int n3 = this.AjAkKaM;
            while (n3 < this.ajAkKaM) {
                float f24;
                int n4;
                int n5;
                majjmka majjmka2 = this.MAJakka[n2];
                kajjmmk kajjmmk2 = this.mAJakka[n2];
                n3 -= this.jaKkaMa;
                n -= this.JAKkaMa;
                if (this.JaKkaMa != null && this.AjAKKaM) {
                    n5 = n3 % this.JAkKAMa;
                    if (n5 < 0) {
                        n5 += this.JAkKAMa;
                    }
                    if ((n4 = n % this.jAkKAMa) < 0) {
                        n4 += this.jAkKAMa;
                    }
                    n4 = this.JAkKAMa - 1 - n4;
                    f24 = (float)this.JaKkaMa[n4][n5] * this.JaKKaMa;
                    kajjmmk2.jAKkaMA = (float)n3 * this.AjakKaM;
                    kajjmmk2.JakkaMA = (float)n * this.ajakKaM;
                } else if (this.JaKkaMa != null && n >= 0 && n < this.jAkKAMa && n3 >= 0 && n3 < this.JAkKAMa) {
                    n5 = n3;
                    n4 = n;
                    n4 = this.JAkKAMa - 1 - n4;
                    kajjmmk2.jAKkaMA = (float)n3 * this.AjakKaM;
                    kajjmmk2.JakkaMA = (float)(-n) * this.AjakKaM;
                    f24 = (float)this.JaKkaMa[n4][n5] * this.JaKKaMa;
                } else {
                    kajjmmk2.jAKkaMA = (float)n3 * this.AjakKaM;
                    kajjmmk2.JakkaMA = (float)(-n) * this.AjakKaM;
                    f24 = -0.001f;
                }
                n3 += this.jaKkaMa;
                n += this.JAKkaMa;
                majjmka2.MajaKka = f23;
                majjmka2.majaKka = f22;
                majjmka2.MAjaKka = f24;
                float f25 = f * f23 + f4 * f22 + f7 * f24 + f10;
                float f26 = f2 * f23 + f5 * f22 + f8 * f24 + f11;
                float f27 = f3 * f23 + f6 * f22 + f9 * f24 + f12;
                if (f27 < f16) {
                    majjmka2.kAMAjAK = 32768;
                    f27 = this.majaKKa;
                } else {
                    majjmka2.kAMAjAK = f27 > f17 ? 4096 : 0;
                }
                float f28 = f13 / f27;
                majjmka2.kaMAjAK = f25 * f28 + f14;
                majjmka2.KAMAjAK = -(f26 * f28) + f15;
                if (majjmka2.kaMAjAK < 0.0f) {
                    majjmka2.kAMAjAK |= 1;
                } else if (majjmka2.kaMAjAK >= f18) {
                    majjmka2.kAMAjAK |= 8;
                }
                if (majjmka2.KAMAjAK < 0.0f) {
                    majjmka2.kAMAjAK |= 0x40;
                } else if (majjmka2.KAMAjAK >= f19) {
                    majjmka2.kAMAjAK |= 0x200;
                }
                majjmka2.KAmajAK = f25;
                majjmka2.kAmajAK = f26;
                majjmka2.KaMAjAK = f27;
                float f29 = (f27 - f20) / (this.MAjaKKa - f20);
                if (f29 < 0.0f) {
                    f29 = 0.0f;
                }
                if (f29 > 0.99609375f) {
                    f29 = 0.99609375f;
                }
                majjmka2.KamAjAK = f29;
                if (this.jakKaMa) {
                    majjmka majjmka3 = this.JAkKaMa[n2];
                    majjmka3.KamAjAK = majjmka2.KamAjAK;
                    f25 -= 2.0f * f7 * f24;
                    f26 -= 2.0f * f8 * f24;
                    if ((f27 -= 2.0f * f9 * f24) < f16) {
                        majjmka3.kAMAjAK = 32768;
                        f27 = this.majaKKa;
                    } else {
                        majjmka3.kAMAjAK = f27 > f17 ? 4096 : 0;
                    }
                    f28 = f13 / f27;
                    majjmka3.kaMAjAK = f25 * f28 + f14;
                    majjmka3.KAMAjAK = -(f26 * f28) + f15;
                    majjmka3.KaMAjAK = f27;
                    if (majjmka3.kaMAjAK < 0.0f) {
                        majjmka3.kAMAjAK |= 1;
                    } else if (majjmka3.kaMAjAK >= f18) {
                        majjmka3.kAMAjAK |= 8;
                    }
                    if (majjmka3.KAMAjAK < 0.0f) {
                        majjmka3.kAMAjAK |= 0x40;
                    } else if (majjmka3.KAMAjAK >= f19) {
                        majjmka3.kAMAjAK |= 0x200;
                    }
                }
                f23 += f21;
                ++n2;
                ++n3;
            }
            f22 += f21;
            ++n;
        }
    }

    public void aKKAMAJ() {
        kajjkka[] kajjkkaArray = kaaamma.aMaJAKK;
        int n = kaaamma.AmAjaKK;
        kaajmma kaajmma2 = this.jakKaMA();
        float f = kaajmma2.MajaKka;
        float f2 = kaajmma2.majaKka;
        float f3 = kaajmma2.MAjaKka;
        int n2 = this.AjAkKaM;
        int n3 = (this.ajAkKaM - n2) * 2 + n2;
        int n4 = this.AJAkKaM + 1;
        while (n4 < this.aJAkKaM) {
            int n5 = (n4 - this.AJAkKaM - 1) * (this.jAKkaMa - 1) * 2;
            int n6 = n5 + (n3 - n2 - 2);
            while (n5 < n6) {
                float f4;
                float f5;
                kajjkka kajjkka2 = this.maJakka[n5++];
                if ((n5 & 1) == 0) {
                    f5 = kajjkka2.amAJAkk.MAjaKka - kajjkka2.aMAJAkk.MAjaKka;
                    f4 = -(kajjkka2.AMAJAkk.MAjaKka - kajjkka2.aMAJAkk.MAjaKka);
                } else {
                    f5 = -(kajjkka2.amAJAkk.MAjaKka - kajjkka2.aMAJAkk.MAjaKka);
                    f4 = kajjkka2.AMAJAkk.MAjaKka - kajjkka2.aMAJAkk.MAjaKka;
                }
                int n7 = 37449 + kajjkka2.amAJAkk.kAMAjAK + kajjkka2.AMAJAkk.kAMAjAK + kajjkka2.aMAJAkk.kAMAjAK;
                if ((n7 & 0x34924) == 0) {
                    if ((f + kajjkka2.amAJAkk.MajaKka) * f5 + (f2 + kajjkka2.amAJAkk.majaKka) * f4 + (f3 + kajjkka2.amAJAkk.MAjaKka) * -this.jAkkaMa > 0.0f) {
                        kajjkka2.AMAJAKK = kajjkka2.amAJAkk.MAjaKka < 0.0f || kajjkka2.AMAJAkk.MAjaKka < 0.0f || kajjkka2.aMAJAkk.MAjaKka < 0.0f ? this.jAKKaMa : this.JAKKaMa;
                        kajjkka2.aMAJAKK = this.jaKKaMa;
                        kajjkka2.aMajakk = -(kajjkka2.amAJAkk.KaMAjAK + kajjkka2.AMAJAkk.KaMAjAK + kajjkka2.aMAJAkk.KaMAjAK);
                        kajjkkaArray[n++] = kajjkka2;
                    }
                } else if ((n7 & 0x24924) == 0 && (f + kajjkka2.amAJAkk.MajaKka) * f5 + (f2 + kajjkka2.amAJAkk.majaKka) * f4 + (f3 + kajjkka2.amAJAkk.MAjaKka) * -this.jAkkaMa > 0.0f) {
                    kajjkka2.AMAJAKK = kajjkka2.amAJAkk.MAjaKka < 0.0f || kajjkka2.AMAJAkk.MAjaKka < 0.0f || kajjkka2.aMAJAkk.MAjaKka < 0.0f ? this.jAKKaMa : this.JAKKaMa;
                    kajjkka2.aMAJAKK = this.jaKKaMa;
                    kajjkka2.aMajakk = -(kajjkka2.amAJAkk.KaMAjAK + kajjkka2.AMAJAkk.KaMAjAK + kajjkka2.aMAJAkk.KaMAjAK);
                    this.JaKKAma(kajjkka2);
                }
                if (!this.jakKaMa) continue;
                kajjkka kajjkka3 = this.jAkKaMa[n5 - 1];
                n7 = 37449 + kajjkka3.amAJAkk.kAMAjAK + kajjkka3.AMAJAkk.kAMAjAK + kajjkka3.aMAJAkk.kAMAjAK;
                if ((n7 & 0x34924) != 0 || !((f + kajjkka2.amAJAkk.MajaKka) * -f5 + (f2 + kajjkka2.amAJAkk.majaKka) * -f4 + (f3 - kajjkka2.amAJAkk.MAjaKka) * -this.jAkkaMa < 0.0f)) continue;
                kajjkka3.amAJAKK = 259;
                kajjkka3.aMAJAKK = this.JakKaMa;
                kajjkka3.AMAJAKK = this.JAKKaMa;
                kajjkka3.aMajakk = kajjkka3.amAJAkk.KaMAjAK + kajjkka3.AMAJAkk.KaMAjAK + kajjkka3.aMAJAkk.KaMAjAK;
                kajjkkaArray[n++] = kajjkka3;
            }
            ++n4;
        }
        kaaamma.AmAjaKK = n;
    }

    public void JaKkama(mmjjmkk mmjjmkk2, int n) {
        this.MajAkka = mmjjmkk2;
        this.MAjAkka = kaaamma.AmAjaKK;
        this.ajAKKaM = this.MajAkka.AMaJAkK.MAjaKka < 0.0f;
        this.jakkAma();
        this.aKkaMAJ();
        this.JAKkaMA();
        this.aKKAMAJ();
        this.jAkkAma();
    }
}

