/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Graphics;

public abstract class kmjjmmk {
    public int jAkkamA;
    public int JaKKamA;
    public int jaKKamA;
    public int JAKKamA;
    public int jAKKamA;
    public int JakKamA;
    public boolean jakKamA;
    public static boolean JAkKamA = true;
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

    public final void akkaMaJ(kmaamma kmaamma2, int n, int n2) {
        this.kKaMaJa(kmaamma2, n, n2, 1);
    }

    public final void kKaMaJa(kmaamma kmaamma2, int n, int n2, int n3) {
        this.KKaMaJa(kmaamma2, n, n2, n3, n3);
    }

    public final void KKaMaJa(kmaamma kmaamma2, int n, int n2, int n3, int n4) {
        this.jAKKamA = n3;
        this.JakKamA = n4;
        this.jaKKamA = n;
        this.JAKKamA = n2;
        this.jAkkamA = n / this.jAKKamA;
        this.JaKKamA = n2 / this.JakKamA;
        this.jakKamA = this.jAKKamA != 1 || this.JakKamA != 1;
        this.AkKaMaJ(kmaamma2);
    }

    public final void aKKaMaJ(Graphics graphics, int n, int n2) {
        if (!this.jakKamA) {
            this.AKKaMaJ(graphics, n, n2);
            return;
        }
        this.aKkaMaJ(graphics, n, n2);
    }

    public final void AkkaMaJ(kajjkka[] kajjkkaArray, int n) {
        int n2 = 0;
        while (n2 < n) {
            this.AKkaMaJ(kajjkkaArray[n2++]);
        }
    }

    public abstract void AkKaMaJ(kmaamma var1);

    public abstract void AKKaMaJ(Graphics var1, int var2, int var3);

    public abstract void aKkaMaJ(Graphics var1, int var2, int var3);

    public abstract void AKkaMaJ(kajjkka var1);

    public abstract void akKaMaJ();

    public kmjjmmk() {
        super();
    }

    static {
    }
}

