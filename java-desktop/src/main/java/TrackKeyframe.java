// 
// Decompiled by Procyon v0.6.0
// 

public class TrackKeyframe
{
    public float MaJAkkA;
    public float maJAkkA;
    public float MAJAkkA;
    public float mAJAkkA;
    public float MajAkkA;
    public float majAkkA;
    public float[] MAjAkkA;
    public int[] mAjAkkA;
    public Quaternionf[] MaJaKKA;
    public Quaternionf[] maJaKKA;
    public Quaternionf[] MAJaKKA;
    
    public TrackKeyframe(final float maJAkkA, final float maJAkkA2, final float majAkkA, final float majAkkA2, final float[] mAjAkkA) {
        this.MaJAkkA = maJAkkA;
        this.maJAkkA = maJAkkA2;
        this.MAJAkkA = majAkkA;
        this.mAJAkkA = majAkkA2;
        this.MAjAkkA = mAjAkkA;
    }
    
    public TrackKeyframe(final float maJAkkA, final TrackKeyframe majjmma) {
        this.MaJAkkA = maJAkkA;
        this.maJAkkA = majjmma.maJAkkA;
        this.MAJAkkA = majjmma.MAJAkkA;
        this.mAJAkkA = majjmma.mAJAkkA;
        this.MAjAkkA = majjmma.MAjAkkA;
        this.mAjAkkA = majjmma.mAjAkkA;
        this.MaJaKKA = majjmma.MaJaKKA;
    }
    
    public TrackKeyframe(final TrackKeyframe majjmma) {
        this.MaJAkkA = majjmma.MaJAkkA;
        this.maJAkkA = majjmma.maJAkkA;
        this.MAJAkkA = majjmma.MAJAkkA;
        this.mAJAkkA = majjmma.mAJAkkA;
        this.MAjAkkA = majjmma.MAjAkkA;
        this.mAjAkkA = majjmma.mAjAkkA;
        this.MaJaKKA = majjmma.MaJaKKA;
    }
    
    public TrackKeyframe(final float maJAkkA, final float maJAkkA2, final float majAkkA, final float majAkkA2, final float n) {
        this.MaJAkkA = maJAkkA;
        this.maJAkkA = maJAkkA2;
        this.MAJAkkA = majAkkA;
        this.mAJAkkA = majAkkA2;
        this.MAjAkkA = new float[] { n };
    }
    
    public TrackKeyframe(final float maJAkkA, final float maJAkkA2, final float majAkkA, final float majAkkA2, final float n, final float n2) {
        this.MaJAkkA = maJAkkA;
        this.maJAkkA = maJAkkA2;
        this.MAJAkkA = majAkkA;
        this.mAJAkkA = majAkkA2;
        this.MAjAkkA = new float[] { n, n2 };
    }
    
    public TrackKeyframe(final float maJAkkA, final float maJAkkA2, final float majAkkA, final float majAkkA2, final float n, final float n2, final float n3) {
        this.MaJAkkA = maJAkkA;
        this.maJAkkA = maJAkkA2;
        this.MAJAkkA = majAkkA;
        this.mAJAkkA = majAkkA2;
        this.MAjAkkA = new float[] { n, n2, n3 };
    }
    
    public TrackKeyframe(final float maJAkkA, final float maJAkkA2, final float majAkkA, final float majAkkA2, final float n, final float n2, final float n3, final float n4) {
        this.MaJAkkA = maJAkkA;
        this.maJAkkA = maJAkkA2;
        this.MAJAkkA = majAkkA;
        this.mAJAkkA = majAkkA2;
        this.MAjAkkA = new float[] { n, n2, n3, n4 };
    }
    
    public TrackKeyframe(final float maJAkkA, final float maJAkkA2, final float majAkkA, final float majAkkA2, final Quaternionf kajjkkk) {
        this.MaJAkkA = maJAkkA;
        this.maJAkkA = maJAkkA2;
        this.MAJAkkA = majAkkA;
        this.mAJAkkA = majAkkA2;
        this.MaJaKKA = new Quaternionf[] { kajjkkk };
    }
    
    public TrackKeyframe(final float maJAkkA, final float maJAkkA2, final float majAkkA, final float majAkkA2, final Quaternionf[] maJaKKA) {
        this.MaJAkkA = maJAkkA;
        this.maJAkkA = maJAkkA2;
        this.MAJAkkA = majAkkA;
        this.mAJAkkA = majAkkA2;
        this.MaJaKKA = maJaKKA;
    }
}
