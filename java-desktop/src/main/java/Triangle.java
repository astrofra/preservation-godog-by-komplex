// 
// Decompiled by Procyon v0.6.0
// 

public final class Triangle extends RenderPrimitive
{
    public Vertex amAJAkk;
    public Vertex AMAJAkk;
    public Vertex aMAJAkk;
    public UvCoord AmaJAkk;
    public UvCoord amaJAkk;
    public UvCoord AMaJAkk;
    public int aMaJAkk;
    
    public Triangle(final MeshObject mmaakkk, final int n, final int n2, final int n3) {
        this.amAJAkk = mmaakkk.MAJakka[n];
        this.AMAJAkk = mmaakkk.MAJakka[n2];
        this.aMAJAkk = mmaakkk.MAJakka[n3];
    }
    
    public Triangle(final MeshObject mmaakkk, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        this.amAJAkk = mmaakkk.MAJakka[n];
        this.AMAJAkk = mmaakkk.MAJakka[n2];
        this.aMAJAkk = mmaakkk.MAJakka[n3];
        this.AmaJAkk = mmaakkk.mAJakka[n4];
        this.amaJAkk = mmaakkk.mAJakka[n5];
        this.AMaJAkk = mmaakkk.mAJakka[n6];
    }
    
    public Triangle(final Vertex amAJAkk, final Vertex amajAkk, final Vertex amajAkk2) {
        this.amAJAkk = amAJAkk;
        this.AMAJAkk = amajAkk;
        this.aMAJAkk = amajAkk2;
    }
    
    public Triangle(final Vertex amAJAkk, final Vertex amajAkk, final Vertex amajAkk2, final UvCoord amaJAkk, final UvCoord amaJAkk2, final UvCoord aMaJAkk) {
        this.amAJAkk = amAJAkk;
        this.AMAJAkk = amajAkk;
        this.aMAJAkk = amajAkk2;
        this.AmaJAkk = amaJAkk;
        this.amaJAkk = amaJAkk2;
        this.AMaJAkk = aMaJAkk;
    }
    
    public Triangle(final Triangle kajjkka) {
        super.amAJAKK = kajjkka.amAJAKK;
        super.AMAJAKK = kajjkka.AMAJAKK;
        super.aMAJAKK = kajjkka.aMAJAKK;
    }
    
    public Triangle(final Triangle kajjkka, final Vertex amAJAkk, final Vertex amajAkk, final Vertex amajAkk2) {
        super.amAJAKK = kajjkka.amAJAKK;
        super.AMAJAKK = kajjkka.AMAJAKK;
        super.aMAJAKK = kajjkka.aMAJAKK;
        this.amAJAkk = amAJAkk;
        this.AMAJAkk = amajAkk;
        this.aMAJAkk = amajAkk2;
        this.AmaJAkk = new UvCoord();
        this.amaJAkk = new UvCoord();
        this.AMaJAkk = new UvCoord();
    }
    
    public Triangle(final Triangle kajjkka, final Vertex amAJAkk, final Vertex amajAkk, final Vertex amajAkk2, final UvCoord amaJAkk, final UvCoord amaJAkk2, final UvCoord aMaJAkk) {
        super.amAJAKK = kajjkka.amAJAKK;
        super.AMAJAKK = kajjkka.AMAJAKK;
        super.aMAJAKK = kajjkka.aMAJAKK;
        this.amAJAkk = amAJAkk;
        this.AMAJAkk = amajAkk;
        this.aMAJAkk = amajAkk2;
        this.AmaJAkk = amaJAkk;
        this.amaJAkk = amaJAkk2;
        this.AMaJAkk = aMaJAkk;
    }
    
    public void AmajAkk(final Triangle kajjkka) {
        super.amAJAKK = kajjkka.amAJAKK;
        super.AMAJAKK = kajjkka.AMAJAKK;
        super.aMAJAKK = kajjkka.aMAJAKK;
    }
    
    public final void aMAjaKK() {
        RenderPrimitive.aMaJAKK[RenderPrimitive.AmAjaKK++] = this;
    }
    
    public final void amajaKK() {
        final Vec3f maJakKA = this.AMAJAkk.MAJakKA(this.amAJAkk);
        maJakKA.MaJAkKA(this.aMAJAkk.MAJakKA((Vec3f)this.amAJAkk));
        maJakKA.MaJAKKA();
        super.AmaJAKK = maJakKA.x;
        super.amaJAKK = maJakKA.y;
        super.AMaJAKK = maJakKA.z;
    }
    
    public final void AmajaKK() {
        final Vertex amAJAkk = this.amAJAkk;
        amAJAkk.kAMajAK += super.AmaJAKK;
        final Vertex amAJAkk2 = this.amAJAkk;
        amAJAkk2.KamajAK += super.amaJAKK;
        final Vertex amAJAkk3 = this.amAJAkk;
        amAJAkk3.kamajAK += super.AMaJAKK;
        final Vertex amajAkk = this.AMAJAkk;
        amajAkk.kAMajAK += super.AmaJAKK;
        final Vertex amajAkk2 = this.AMAJAkk;
        amajAkk2.KamajAK += super.amaJAKK;
        final Vertex amajAkk3 = this.AMAJAkk;
        amajAkk3.kamajAK += super.AMaJAKK;
        final Vertex amajAkk4 = this.aMAJAkk;
        amajAkk4.kAMajAK += super.AmaJAKK;
        final Vertex amajAkk5 = this.aMAJAkk;
        amajAkk5.KamajAK += super.amaJAKK;
        final Vertex amajAkk6 = this.aMAJAkk;
        amajAkk6.kamajAK += super.AMaJAKK;
    }
}
