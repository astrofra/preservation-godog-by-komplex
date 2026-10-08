/*
 * Decompiled with CFR 0.152.
 */
public class mmajkmk {
    public int akKaMaJ;
    int AKKaMaJ;
    byte[][] aKKaMaJ;
    static final int AkkaMaJ = 0;
    static final int akkaMaJ = 1;
    static final int AKkaMaJ = 2;
    static final int aKkaMaJ = 3;
    static final int AkKAMaJ = 4;

    mmajkmk(int n, int n2) {
        super();
        this.akKaMaJ = n;
        this.AKKaMaJ = n2;
        this.aKKaMaJ = new byte[n][n2 * 5];
    }

    void KkAMAJA(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        byte[] byArray = this.aKKaMaJ[n];
        int n8 = n2 * 5;
        byArray[n8] = (byte)n3;
        byArray[n8 + 1] = (byte)n4;
        byArray[n8 + 2] = (byte)n5;
        byArray[n8 + 3] = (byte)n6;
        byArray[n8 + 4] = (byte)n7;
    }

    byte[] kKamAJA(int n) {
        return this.aKKaMaJ[n];
    }
}

