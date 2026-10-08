/*
 * Decompiled with CFR 0.152.
 */
public final class mmjjmkk {
    public int AMAJAkK;
    public int aMAJAkK;
    public float AmaJAkK = 1.0f;
    public float amaJAkK = 1.57f;
    public kaajmma AMaJAkK = new kaajmma(6.0f, 0.0f, -40.0f);
    public kaaakka aMaJAkK = new kaaakka();
    public kaajmma AmAjakK = new kaajmma(0.0f, 0.0f, 1.0f);
    public float amAjakK;
    public float AMAjakK = 0.1f;
    public float aMAjakK = 26.0f;
    public float AmajakK = 15.0f;

    public void JakKAMa(kaajmma kaajmma2) {
        kaajmma kaajmma3 = kaajmma2.MAJakKA(this.AMaJAkK);
        kaajmma3.MaJAKKA();
        this.aMaJAkK.kaMaJAK(kaajmma3);
        kaajmma kaajmma4 = this.AmAjakK.majaKka(kaajmma3);
        kaajmma4.MaJAKKA();
        kaajmma3.MaJAkKA(kaajmma4);
        if (this.amAjakK == 0.0f) {
            this.aMaJAkK.KamaJAK(kaajmma4);
            this.aMaJAkK.KAMaJAK(kaajmma3);
            return;
        }
        kaajmma kaajmma5 = kaajmma4.MajakKA((float)Math.cos(this.amAjakK)).mAjAkKA(kaajmma3.MajakKA((float)Math.sin(this.amAjakK)));
        kaajmma kaajmma6 = kaajmma4.MajakKA((float)(-Math.sin(this.amAjakK))).mAjAkKA(kaajmma3.MajakKA((float)Math.cos(this.amAjakK)));
        this.aMaJAkK.KamaJAK(kaajmma5);
        this.aMaJAkK.KAMaJAK(kaajmma6);
    }

    public void jakKAMa(kaajmma kaajmma2) {
        this.JakKAMa(this.AMaJAkK.mAjAkKA(kaajmma2));
    }

    public mmjjmkk() {
        super();
    }
}

