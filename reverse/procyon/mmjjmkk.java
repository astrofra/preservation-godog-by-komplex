// 
// Decompiled by Procyon v0.6.0
// 

public final class mmjjmkk
{
    public int AMAJAkK;
    public int aMAJAkK;
    public float AmaJAkK;
    public float amaJAkK;
    public kaajmma AMaJAkK;
    public kaaakka aMaJAkK;
    public kaajmma AmAjakK;
    public float amAjakK;
    public float AMAjakK;
    public float aMAjakK;
    public float AmajakK;
    
    public void JakKAMa(final kaajmma kaajmma) {
        final kaajmma maJakKA = kaajmma.MAJakKA(this.AMaJAkK);
        maJakKA.MaJAKKA();
        this.aMaJAkK.kaMaJAK(maJakKA);
        final kaajmma majaKka = this.AmAjakK.majaKka(maJakKA);
        majaKka.MaJAKKA();
        maJakKA.MaJAkKA(majaKka);
        if (this.amAjakK == 0.0f) {
            this.aMaJAkK.KamaJAK(majaKka);
            this.aMaJAkK.KAMaJAK(maJakKA);
            return;
        }
        final kaajmma mAjAkKA = majaKka.MajakKA((float)Math.cos(this.amAjakK)).mAjAkKA(maJakKA.MajakKA((float)Math.sin(this.amAjakK)));
        final kaajmma mAjAkKA2 = majaKka.MajakKA((float)(-Math.sin(this.amAjakK))).mAjAkKA(maJakKA.MajakKA((float)Math.cos(this.amAjakK)));
        this.aMaJAkK.KamaJAK(mAjAkKA);
        this.aMaJAkK.KAMaJAK(mAjAkKA2);
    }
    
    public void jakKAMa(final kaajmma kaajmma) {
        this.JakKAMa(this.AMaJAkK.mAjAkKA(kaajmma));
    }
    
    public mmjjmkk() {
        this.AmaJAkK = 1.0f;
        this.amaJAkK = 1.57f;
        this.AMaJAkK = new kaajmma(6.0f, 0.0f, -40.0f);
        this.aMaJAkK = new kaaakka();
        this.AmAjakK = new kaajmma(0.0f, 0.0f, 1.0f);
        this.AMAjakK = 0.1f;
        this.aMAjakK = 26.0f;
        this.AmajakK = 15.0f;
    }
}
