// 
// Decompiled by Procyon v0.6.0
// 

public class WireframeMesh extends MeshObject
{
    public boolean aJAkkAM;
    public int AjakkAM;
    
    public WireframeMesh() {
        this.aJAkkAM = true;
    }
    
    public WireframeMesh(final MeshObject mmaakkk) {
        super(mmaakkk);
        this.aJAkkAM = true;
    }
    
    public void AkKAmAJ() {
        for (int i = 0; i < super.maJakka.length; ++i) {
            final Triangle kajjkka = super.maJakka[i];
            for (int j = super.maJakka.length - 1; j > i; --j) {
                final Triangle kajjkka2 = super.maJakka[j];
                if (kajjkka.amAJAkk.kaMAjAK == kajjkka2.amAJAkk.kaMAjAK && kajjkka.amAJAkk.KAMAjAK == kajjkka2.amAJAkk.KAMAjAK && kajjkka.amAJAkk.KaMAjAK == kajjkka2.amAJAkk.KaMAjAK) {
                    if (kajjkka.AMAJAkk.kaMAjAK == kajjkka2.AMAJAkk.kaMAjAK && kajjkka.AMAJAkk.KAMAjAK == kajjkka2.AMAJAkk.KAMAjAK && kajjkka.AMAJAkk.KaMAjAK == kajjkka2.AMAJAkk.KaMAjAK) {
                        final Triangle kajjkka3 = super.maJakka[i];
                        kajjkka3.aMaJAkk |= 0x1;
                    }
                    else if (kajjkka.aMAJAkk.kaMAjAK == kajjkka2.aMAJAkk.kaMAjAK && kajjkka.aMAJAkk.KAMAjAK == kajjkka2.aMAJAkk.KAMAjAK && kajjkka.aMAJAkk.KaMAjAK == kajjkka2.aMAJAkk.KaMAjAK) {
                        final Triangle kajjkka4 = super.maJakka[i];
                        kajjkka4.aMaJAkk |= 0x4;
                    }
                }
                if (kajjkka.AMAJAkk.kaMAjAK == kajjkka2.AMAJAkk.kaMAjAK && kajjkka.AMAJAkk.KAMAjAK == kajjkka2.AMAJAkk.KAMAjAK && kajjkka.AMAJAkk.KaMAjAK == kajjkka2.AMAJAkk.KaMAjAK && kajjkka.aMAJAkk.kaMAjAK == kajjkka2.aMAJAkk.kaMAjAK && kajjkka.aMAJAkk.KAMAjAK == kajjkka2.aMAJAkk.KAMAjAK && kajjkka.aMAJAkk.KaMAjAK == kajjkka2.aMAJAkk.KaMAjAK) {
                    final Triangle kajjkka5 = super.maJakka[i];
                    kajjkka5.aMaJAkk |= 0x2;
                }
                if (super.maJakka[i].aMaJAkk != 0) {
                    break;
                }
            }
        }
    }
    
    public void JaKkama(final Camera majAkka, final int n) {
        if (!super.MaJakka) {
            return;
        }
        super.MajAkka = majAkka;
        super.MAjAkka = RenderPrimitive.AmAjaKK;
        this.jakkAma();
        if (super.maJAkka) {
            this.JakKaMA();
        }
        if (super.MAJAKKa != 0) {
            this.JakkaMA();
            this.jaKKaMA();
            return;
        }
        if (this.aJAkkAM) {
            this.JAkkama();
            this.jAkKAma();
            this.jAkkAma();
            return;
        }
        this.JAKkaMA();
        this.aKkamAJ();
    }
    
    public void aKkamAJ() {
        this.akKAmAJ(super.maJakka, super.maJakka.length);
    }
    
    public void akKAmAJ(final Triangle[] array, final int n) {
        final Triangle[] aMaJAKK = RenderPrimitive.aMaJAKK;
        int amAjaKK = RenderPrimitive.AmAjaKK;
        Triangle kajjkka;
        for (int i = 0; i < n; kajjkka = array[i++], kajjkka.sortKey = -(kajjkka.amAJAkk.KaMAjAK + kajjkka.AMAJAkk.KaMAjAK + kajjkka.aMAJAkk.KaMAjAK + this.AjakkAM), aMaJAKK[amAjaKK++] = kajjkka) {}
        RenderPrimitive.AmAjaKK = amAjaKK;
    }
    
    public void jAKkama(final Triangle[] array, final int n) {
        final Triangle[] aMaJAKK = RenderPrimitive.aMaJAKK;
        int amAjaKK = RenderPrimitive.AmAjaKK;
        final Vec3f jakKaMA = this.jakKaMA();
        final float majaKka = jakKaMA.x;
        final float majaKka2 = jakKaMA.y;
        final float mAjaKka = jakKaMA.z;
        int i = 0;
        while (i < n) {
            final Triangle kajjkka = array[i++];
            final int n2 = 37449 + kajjkka.amAJAkk.kAMAjAK + kajjkka.AMAJAkk.kAMAjAK + kajjkka.aMAJAkk.kAMAjAK;
            if ((n2 & 0x34924) == 0x0) {
                if ((majaKka + kajjkka.amAJAkk.x) * kajjkka.AmaJAKK + (majaKka2 + kajjkka.amAJAkk.y) * kajjkka.amaJAKK + (mAjaKka + kajjkka.amAJAkk.z) * kajjkka.AMaJAKK >= 0.0f) {
                    continue;
                }
                kajjkka.sortKey = -(kajjkka.amAJAkk.KaMAjAK + kajjkka.AMAJAkk.KaMAjAK + kajjkka.aMAJAkk.KaMAjAK + this.AjakkAM);
                aMaJAKK[amAjaKK++] = kajjkka;
            }
            else {
                if ((n2 & 0x24924) != 0x0 || (n2 & 0x30000) == 0x0 || (majaKka + kajjkka.amAJAkk.x) * kajjkka.AmaJAKK + (majaKka2 + kajjkka.amAJAkk.y) * kajjkka.amaJAKK + (mAjaKka + kajjkka.amAJAkk.z) * kajjkka.AMaJAKK >= 0.0f) {
                    continue;
                }
                kajjkka.sortKey = -(kajjkka.amAJAkk.KaMAjAK + kajjkka.AMAJAkk.KaMAjAK + kajjkka.aMAJAkk.KaMAjAK + this.AjakkAM);
                this.JaKKAma(kajjkka);
            }
        }
        RenderPrimitive.AmAjaKK = amAjaKK;
    }
}
