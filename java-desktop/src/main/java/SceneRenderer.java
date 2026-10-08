import java.util.Enumeration;
import java.util.Vector;

// 
// Decompiled by Procyon v0.6.0
// 

public class SceneRenderer
{
    public Vector mAjAKkA;
    Triangle[] MaJakkA;
    DepthSorter maJakkA;
    public static boolean MAJakkA;
    public static boolean mAJakkA;
    public static boolean MajakkA;
    public static boolean majakkA;
    
    public void MAjAKkA() {
        int n = 0;
        final Enumeration elements = this.mAjAKkA.elements();
        if (elements != null) {
            while (elements.hasMoreElements()) {
                n += ((MeshObject)elements.nextElement()).maJakka.length;
            }
        }
        this.MaJakkA = new Triangle[n];
        this.maJakkA = new DepthSorter(this.MaJakkA);
    }
    
    public void mAjAKkA(final Camera mmjjmkk, final SurfacePresenter kmjjmmk) {
        RenderPrimitive.aMaJAKK = this.MaJakkA;
        RenderPrimitive.AmAjaKK = 0;
        mmjjmkk.viewportWidth = kmjjmmk.jAkkamA;
        mmjjmkk.viewportHeight = kmjjmmk.JaKKamA;
        final ViewFrustum kaaamka = new ViewFrustum();
        kaaamka.kKAMajA(mmjjmkk, null);
        final Enumeration elements = this.mAjAKkA.elements();
        if (elements != null) {
            while (elements.hasMoreElements()) {
                final MeshObject mmaakkk = (MeshObject)elements.nextElement();
                final int kkaMajA = kaaamka.KkaMajA(mmaakkk);
                if (kkaMajA != -1) {
                    mmaakkk.JaKkama(mmjjmkk, kkaMajA);
                }
                if (mmaakkk.mAJAkka) {
                    final MeshObject majAkka = mmaakkk.majAkka;
                    majAkka.Majakka.MAJAkKA(mmaakkk.Majakka);
                    majAkka.mAjakka.KaMAjAK(mmaakkk.mAjakka);
                    final Vec3f majakka = majAkka.Majakka;
                    majakka.z *= -1.0f;
                    final Mat3f mAjakka;
                    final Mat3f kaaakka = mAjakka = majAkka.mAjakka;
                    mAjakka.KAMAjaK *= -1.0f;
                    final Mat3f kaaakka2 = kaaakka;
                    kaaakka2.kamAjaK *= -1.0f;
                    final Mat3f kaaakka3 = kaaakka;
                    kaaakka3.KaMaJAK *= -1.0f;
                    final int amAjaKK = RenderPrimitive.AmAjaKK;
                    final int kkaMajA2 = kaaamka.KkaMajA(majAkka);
                    if (kkaMajA2 != -1) {
                        majAkka.JaKkama(mmjjmkk, kkaMajA2);
                    }
                    for (int i = amAjaKK; i < RenderPrimitive.AmAjaKK; ++i) {
                        final Triangle kajjkka = RenderPrimitive.aMaJAKK[i];
                        kajjkka.sortKey *= -1.0f;
                    }
                }
            }
        }
        if (SceneRenderer.mAJakkA) {
            this.maJakkA.mAJakkA(RenderPrimitive.AmAjaKK);
        }
    }
    
    public void MajAKkA(final SurfacePresenter kmjjmmk) {
        if (SceneRenderer.majakkA) {
            kmjjmmk.AkkaMaJ(RenderPrimitive.aMaJAKK, RenderPrimitive.AmAjaKK);
        }
    }
    
    public void mAJAKkA(final MeshObject obj) {
        this.mAjAKkA.addElement(obj);
    }
    
    public void majAKkA(final float n) {
        this.MAJAKkA(n, null);
    }
    
    public void MAJAKkA(final float majakKa, final Camera mmjjmkk) {
        for (int i = 0; i < this.mAjAKkA.size(); ++i) {
            ((MeshObject)this.mAjAKkA.elementAt(i)).mAJAKKa = majakKa;
        }
    }
    
    public SceneRenderer() {
        this.mAjAKkA = new Vector(10);
    }
    
    static {
        SceneRenderer.MAJakkA = true;
        SceneRenderer.mAJakkA = true;
        SceneRenderer.MajakkA = true;
        SceneRenderer.majakkA = true;
    }
}
