/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class kajjkmk
extends kmjjmmk {
    public maaakka KkaMaJa;
    public maaakmk kkaMaJa;
    Image KKaMaJa;
    Graphics kKaMaJa;
    int AkKaMaJ = 0;

    public void aKkaMaJ(Graphics graphics, int n, int n2) {
        if (kmjjmmk.JAkKamA) {
            this.KkaMaJa.KAmaJaK();
            this.KkaMaJa.kaMAJaK(this.kKaMaJa, 0, 0);
            graphics.drawImage(this.KKaMaJa, n, n2, this.jaKKamA, this.JAKKamA, Color.green, null);
            return;
        }
        this.KkaMaJa.KAmaJaK();
        this.KkaMaJa.KaMAJaK(graphics, n, n2, this.jaKKamA, this.JAKKamA);
    }

    public kajjkmk() {
        super();
    }

    public void AKKaMaJ(Graphics graphics, int n, int n2) {
        this.KkaMaJa.KAmaJaK();
        this.KkaMaJa.kaMAJaK(graphics, n, n2);
    }

    public void akKaMaJ() {
        int n = 0;
        while (n < this.KkaMaJa.kamAJaK.length) {
            this.KkaMaJa.kamAJaK[n] = 10;
            ++n;
        }
        ++this.AkKaMaJ;
    }

    public void AkKaMaJ(kmaamma kmaamma2) {
        this.KkaMaJa = new maaakka(this.jAkkamA, this.JaKKamA, 2, true);
        this.kkaMaJa = new maaakmk(this.KkaMaJa);
        if (this.jakKamA && kmjjmmk.JAkKamA) {
            this.KKaMaJa = kmaamma2.createImage(this.jAkkamA, this.JaKKamA);
            this.kKaMaJa = this.KKaMaJa.getGraphics();
        }
    }

    public void AKkaMaJ(kajjkka kajjkka2) {
        this.kkaMaJa.kKamaJa(kajjkka2);
    }
}

