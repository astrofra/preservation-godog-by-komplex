// 
// Decompiled by Procyon v0.6.0
// 

public final class Camera
{
    public int viewportWidth;
    public int viewportHeight;
    public float AmaJAkK;
    public float amaJAkK;
    public Vec3f position;
    public Mat3f orientation;
    public Vec3f upVector;
    public float rollRadians;
    public float nearClip;
    public float farClip;
    public float fogStart;
    
    public void lookAt(final Vec3f kaajmma) {
        final Vec3f maJakKA = kaajmma.MAJakKA(this.position);
        maJakKA.MaJAKKA();
        this.orientation.kaMaJAK(maJakKA);
        final Vec3f majaKka = this.upVector.majaKka(maJakKA);
        majaKka.MaJAKKA();
        maJakKA.MaJAkKA(majaKka);
        if (this.rollRadians == 0.0f) {
            this.orientation.KamaJAK(majaKka);
            this.orientation.KAMaJAK(maJakKA);
            return;
        }
        final Vec3f mAjAkKA = majaKka.MajakKA((float)Math.cos(this.rollRadians)).mAjAkKA(maJakKA.MajakKA((float)Math.sin(this.rollRadians)));
        final Vec3f mAjAkKA2 = majaKka.MajakKA((float)(-Math.sin(this.rollRadians))).mAjAkKA(maJakKA.MajakKA((float)Math.cos(this.rollRadians)));
        this.orientation.KamaJAK(mAjAkKA);
        this.orientation.KAMaJAK(mAjAkKA2);
    }
    
    public void lookAlong(final Vec3f kaajmma) {
        this.lookAt(this.position.mAjAkKA(kaajmma));
    }
    
    public Camera() {
        this.AmaJAkK = 1.0f;
        this.amaJAkK = 1.57f;
        this.position = new Vec3f(6.0f, 0.0f, -40.0f);
        this.orientation = new Mat3f();
        this.upVector = new Vec3f(0.0f, 0.0f, 1.0f);
        this.nearClip = 0.1f;
        this.farClip = 26.0f;
        this.fogStart = 15.0f;
    }
}
