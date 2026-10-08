/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public final class kmjamka
extends kmjjmmk {
    public mmajkka kamAJAk;
    public mmaamma KAmAJAk;
    public mmjamka kAmAJAk;
    Image KaMajAk;
    Graphics kaMajAk;
    int KAMajAk;

    public void AkKaMaJ(kmaamma kmaamma2) {
        this.kamAJAk = new mmajkka(this.jAkkamA, this.JaKKamA, 2, true);
        this.KAmAJAk = new mmaamma(this.kamAJAk);
        this.kAmAJAk = new mmjamka(this.kamAJAk, this.jAkkamA, this.JaKKamA);
        if (this.jakKamA && kmjjmmk.JAkKamA) {
            this.KaMajAk = kmaamma2.createImage(this.jAkkamA, this.JaKKamA);
            this.kaMajAk = this.KaMajAk.getGraphics();
        }
    }

    public void AKkaMaJ(kajjkka kajjkka2) {
        if (kajjkka2.amAJAKK == 1024) {
            float f = kajjkka2.amAJAkk.KamAjAK;
            int n = (int)(kajjkka2.amAJAkk.kaMAjAK / 65536.0f - f * 0.5f);
            int n2 = (int)(kajjkka2.amAJAkk.KAMAjAK / 65536.0f - f * 0.5f);
            this.kamAJAk.AMAJAkk(kajjkka2.aMAJAKK, n, n2, f, f);
            return;
        }
        if (kajjkka2.amAJAKK == 4096) {
            this.kAmAJAk.KaMaJAk(kajjkka2);
            return;
        }
        this.KAmAJAk.amAjAKK(kajjkka2);
    }

    public void AKKaMaJ(Graphics graphics, int n, int n2) {
        this.kamAJAk.KAmaJaK();
        this.kamAJAk.kaMAJaK(graphics, n, n2);
    }

    public void aKkaMaJ(Graphics graphics, int n, int n2) {
        if (kmjjmmk.JAkKamA) {
            this.kamAJAk.KAmaJaK();
            this.kamAJAk.kaMAJaK(this.kaMajAk, 0, 0);
            graphics.drawImage(this.KaMajAk, n, n2, this.jaKKamA, this.JAKKamA, Color.black, null);
            return;
        }
        this.kamAJAk.KAmaJaK();
        this.kamAJAk.KaMAJaK(graphics, n, n2, this.jaKKamA, this.JAKKamA);
    }

    public void KaMAJAk(int n) {
        this.KAMajAk = n;
    }

    public void akKaMaJ() {
        this.kAmaJAk(this.KAMajAk);
    }

    public void kAmaJAk(int n) {
        n = mmajkka.AmAJakk(n);
        int[] nArray = this.kamAJAk.AMAjakk;
        int n2 = nArray.length;
        int n3 = 0;
        while (n3 < n2) {
            nArray[n3++] = n;
        }
    }

    public kmjamka() {
        super();
    }
}

