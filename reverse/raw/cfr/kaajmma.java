/*
 * Decompiled with CFR 0.152.
 */
public class kaajmma {
    public static final kaajmma MaJaKka = new kaajmma(0.0f, 0.0f, 0.0f);
    public static final kaajmma maJaKka = new kaajmma(1.0f, 0.0f, 0.0f);
    public static final kaajmma MAJaKka = new kaajmma(0.0f, 1.0f, 0.0f);
    public static final kaajmma mAJaKka = new kaajmma(0.0f, 0.0f, 1.0f);
    public float MajaKka;
    public float majaKka;
    public float MAjaKka;

    /*
     * Exception decompiling
     */
    public kaajmma() {
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

    public kaajmma(kaajmma kaajmma2) {
        super();
        this.MajaKka = kaajmma2.MajaKka;
        this.majaKka = kaajmma2.majaKka;
        this.MAjaKka = kaajmma2.MAjaKka;
    }

    public kaajmma(float f, float f2, float f3) {
        super();
        this.MajaKka = f;
        this.majaKka = f2;
        this.MAjaKka = f3;
    }

    public kaajmma(double d, double d2, double d3) {
        super();
        this.MajaKka = (float)d;
        this.majaKka = (float)d2;
        this.MAjaKka = (float)d3;
    }

    public final void MAJAkKA(kaajmma kaajmma2) {
        this.MajaKka = kaajmma2.MajaKka;
        this.majaKka = kaajmma2.majaKka;
        this.MAjaKka = kaajmma2.MAjaKka;
    }

    public final void mAJaKka(float f, float f2, float f3) {
        this.MajaKka = f;
        this.majaKka = f2;
        this.MAjaKka = f3;
    }

    public final void MajAkKA(double d, double d2, double d3) {
        this.MajaKka = (float)d;
        this.majaKka = (float)d2;
        this.MAjaKka = (float)d3;
    }

    public final void mAJAKKA(float f) {
        this.MajaKka = f;
        this.majaKka = f;
        this.MAjaKka = f;
    }

    public final void mAjaKka(double d) {
        this.MajaKka = (float)d;
        this.majaKka = (float)d;
        this.MAjaKka = (float)d;
    }

    public final float MaJakKA(kaajmma kaajmma2) {
        return this.MajaKka * kaajmma2.MajaKka + this.majaKka * kaajmma2.majaKka + this.MAjaKka * kaajmma2.MAjaKka;
    }

    public final float maJAKka() {
        return (float)Math.sqrt(this.MajaKka * this.MajaKka + this.majaKka * this.majaKka + this.MAjaKka * this.MAjaKka);
    }

    public final float maJAKKA() {
        return this.MajaKka * this.MajaKka + this.majaKka * this.majaKka + this.MAjaKka * this.MAjaKka;
    }

    public final float MAJaKka() {
        return (float)Math.atan2(this.MAjaKka, this.majaKka);
    }

    public final float maJaKka() {
        return (float)Math.atan2(this.MajaKka, this.MAjaKka);
    }

    public final float MAjAkKA() {
        return (float)Math.atan2(this.majaKka, this.MajaKka);
    }

    public final void MAJAKKA() {
        this.MajaKka = -this.MajaKka;
        this.majaKka = -this.majaKka;
        this.MAjaKka = -this.MAjaKka;
    }

    public final void MaJaKka(kaajmma kaajmma2) {
        this.MajaKka += kaajmma2.MajaKka;
        this.majaKka += kaajmma2.majaKka;
        this.MAjaKka += kaajmma2.MAjaKka;
    }

    public final void MajAKKA(kaajmma kaajmma2) {
        this.MajaKka -= kaajmma2.MajaKka;
        this.majaKka -= kaajmma2.majaKka;
        this.MAjaKka -= kaajmma2.MAjaKka;
    }

    public final void MajaKKA(float f, float f2, float f3) {
        this.MajaKka += f;
        this.majaKka += f2;
        this.MAjaKka += f3;
    }

    public final void MAjakKA(float f, float f2, float f3) {
        this.MajaKka -= f;
        this.majaKka -= f2;
        this.MAjaKka -= f3;
    }

    public final void mAjakKA(float f) {
        this.MajaKka *= f;
        this.majaKka *= f;
        this.MAjaKka *= f;
    }

    public final void mAJaKKA(float f) {
        this.MajaKka /= f;
        this.majaKka /= f;
        this.MAjaKka /= f;
    }

    public final void MAJAKka(kaajmma kaajmma2) {
        this.MajaKka *= kaajmma2.MajaKka;
        this.majaKka *= kaajmma2.majaKka;
        this.MAjaKka *= kaajmma2.MAjaKka;
    }

    public final void mAjAKKA(float f, float f2, float f3) {
        this.MajaKka *= f;
        this.majaKka *= f2;
        this.MAjaKka *= f3;
    }

    public final void MaJAkKA(kaajmma kaajmma2) {
        float f = this.majaKka * kaajmma2.MAjaKka - this.MAjaKka * kaajmma2.majaKka;
        float f2 = this.MAjaKka * kaajmma2.MajaKka - this.MajaKka * kaajmma2.MAjaKka;
        float f3 = this.MajaKka * kaajmma2.majaKka - this.majaKka * kaajmma2.MajaKka;
        this.MajaKka = f;
        this.majaKka = f2;
        this.MAjaKka = f3;
    }

    public final void MaJAKKA() {
        float f = (float)Math.sqrt(this.MajaKka * this.MajaKka + this.majaKka * this.majaKka + this.MAjaKka * this.MAjaKka);
        this.MajaKka /= f;
        this.majaKka /= f;
        this.MAjaKka /= f;
    }

    public final void majAKKA(float f) {
        float f2 = this.majaKka * (float)Math.cos(f) - (float)Math.sin(f) * this.MAjaKka;
        float f3 = this.MAjaKka * (float)Math.cos(f) + (float)Math.sin(f) * this.majaKka;
        this.majaKka = f2;
        this.MAjaKka = f3;
    }

    public final void MajaKka(float f) {
        float f2 = this.MajaKka * (float)Math.cos(f) + (float)Math.sin(f) * this.MAjaKka;
        float f3 = this.MAjaKka * (float)Math.cos(f) - (float)Math.sin(f) * this.MajaKka;
        this.MajaKka = f2;
        this.MAjaKka = f3;
    }

    public final void majakKA(float f) {
        float f2 = this.MajaKka * (float)Math.cos(f) - (float)Math.sin(f) * this.majaKka;
        float f3 = this.majaKka * (float)Math.cos(f) + (float)Math.sin(f) * this.MajaKka;
        this.MajaKka = f2;
        this.majaKka = f3;
    }

    public final void majAkKA(kaajmma kaajmma2) {
        this.mAJAkKA(kaajmma2.MajaKka, kaajmma2.majaKka, kaajmma2.MAjaKka);
    }

    public final void MAJaKKA(float f, float f2, float f3) {
        this.majaKKA(f);
        this.mAjaKKA(f2);
        this.MAjaKKA(f3);
    }

    public final kaajmma mAjAkKA(kaajmma kaajmma2) {
        kaajmma kaajmma3 = new kaajmma(this);
        kaajmma3.MaJaKka(kaajmma2);
        return kaajmma3;
    }

    public final kaajmma MAJakKA(kaajmma kaajmma2) {
        kaajmma kaajmma3 = new kaajmma(this);
        kaajmma3.MajAKKA(kaajmma2);
        return kaajmma3;
    }

    public final kaajmma mAJakKA(float f, float f2, float f3) {
        return new kaajmma(this.MajaKka + f, this.majaKka + f2, this.MAjaKka + f3);
    }

    public final kaajmma MAjaKka(float f, float f2, float f3) {
        return new kaajmma(this.MajaKka - f, this.majaKka - f2, this.MAjaKka - f3);
    }

    public final kaajmma MAjAKKA() {
        return new kaajmma(-this.MajaKka, -this.majaKka, -this.MAjaKka);
    }

    public final kaajmma MajakKA(float f) {
        kaajmma kaajmma2 = new kaajmma(this);
        kaajmma2.mAjakKA(f);
        return kaajmma2;
    }

    public final kaajmma MaJAKka(float f) {
        kaajmma kaajmma2 = new kaajmma(this);
        kaajmma2.mAJaKKA(f);
        return kaajmma2;
    }

    public final kaajmma maJAkKA(kaajmma kaajmma2) {
        kaajmma kaajmma3 = new kaajmma(this);
        kaajmma3.MAJAKka(kaajmma2);
        return kaajmma3;
    }

    public final kaajmma majaKka(kaajmma kaajmma2) {
        kaajmma kaajmma3 = new kaajmma(this);
        kaajmma3.MaJAkKA(kaajmma2);
        return kaajmma3;
    }

    public final kaajmma maJakKA() {
        kaajmma kaajmma2 = new kaajmma(this);
        kaajmma2.MaJAKKA();
        return kaajmma2;
    }

    public final kaajmma mAjaKKA(float f) {
        kaajmma kaajmma2 = new kaajmma(this);
        kaajmma2.majAKKA(f);
        return kaajmma2;
    }

    public final kaajmma MAjaKKA(float f) {
        kaajmma kaajmma2 = new kaajmma(this);
        kaajmma2.MajaKka(f);
        return kaajmma2;
    }

    public final kaajmma majaKKA(float f) {
        kaajmma kaajmma2 = new kaajmma(this);
        kaajmma2.majakKA(f);
        return kaajmma2;
    }

    public final kaajmma maJaKKA(kaajmma kaajmma2) {
        kaajmma kaajmma3 = new kaajmma(this);
        kaajmma3.majakKA(kaajmma2.MajaKka);
        kaajmma3.majAKKA(kaajmma2.majaKka);
        kaajmma3.MajaKka(kaajmma2.MAjaKka);
        return kaajmma3;
    }

    public final kaajmma mAJAkKA(float f, float f2, float f3) {
        kaajmma kaajmma2 = new kaajmma(this);
        kaajmma2.majakKA(f);
        kaajmma2.majAKKA(f2);
        kaajmma2.MajaKka(f3);
        return kaajmma2;
    }

    public final String toString() {
        return "Vector3f:{" + this.MajaKka + "; " + this.majaKka + "; " + this.MAjaKka + "} ";
    }

    static {
    }
}

