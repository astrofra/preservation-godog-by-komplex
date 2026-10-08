import java.awt.Graphics;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class SurfacePresenter
{
    public int jAkkamA;
    public int JaKKamA;
    public int jaKKamA;
    public int JAKKamA;
    public int jAKKamA;
    public int JakKamA;
    public boolean jakKamA;
    public static boolean JAkKamA;
    public static final int jAkKamA = 1;
    public static final int JaKkAMA = 2;
    public static final int jaKkAMA = 16;
    public static final int JAKkAMA = 32;
    public static final int jAKkAMA = 48;
    public static final int JakkAMA = 128;
    public static final int jakkAMA = 256;
    public static final int JAkkAMA = 1024;
    public static final int jAkkAMA = 2048;
    public static final int JaKKAMA = 4096;
    public static final int jaKKAMA = 17;
    public static final int JAKKAMA = 33;
    public static final int jAKKAMA = 49;
    
    public final void akkaMaJ(final DesktopDemoBase kmaamma, final int n, final int n2) {
        this.kKaMaJa(kmaamma, n, n2, 1);
    }
    
    public final void kKaMaJa(final DesktopDemoBase kmaamma, final int n, final int n2, final int n3) {
        this.KKaMaJa(kmaamma, n, n2, n3, n3);
    }
    
    public final void KKaMaJa(final DesktopDemoBase kmaamma, final int jaKKamA, final int jakKamA, final int jakKamA2, final int jakKamA3) {
        this.jAKKamA = jakKamA2;
        this.JakKamA = jakKamA3;
        this.jaKKamA = jaKKamA;
        this.JAKKamA = jakKamA;
        this.jAkkamA = jaKKamA / this.jAKKamA;
        this.JaKKamA = jakKamA / this.JakKamA;
        this.jakKamA = (this.jAKKamA != 1 || this.JakKamA != 1);
        this.AkKaMaJ(kmaamma);
    }
    
    public final void aKKaMaJ(final Graphics graphics, final int n, final int n2) {
        if (!this.jakKamA) {
            this.AKKaMaJ(graphics, n, n2);
            return;
        }
        this.aKkaMaJ(graphics, n, n2);
    }
    
    public final void AkkaMaJ(final Triangle[] array, final int n) {
        int i = 0;
        while (i < n) {
            this.AKkaMaJ(array[i++]);
        }
    }
    
    public abstract void AkKaMaJ(final DesktopDemoBase p0);
    
    public abstract void AKKaMaJ(final Graphics p0, final int p1, final int p2);
    
    public abstract void aKkaMaJ(final Graphics p0, final int p1, final int p2);
    
    public abstract void AKkaMaJ(final Triangle p0);
    
    public abstract void akKaMaJ();
    
    static {
        SurfacePresenter.JAkKamA = true;
    }
}
