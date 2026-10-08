/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class maaamma
extends kmjjmma {
    kmjamma amAjAKK;
    mmajkka AMAjAKK;
    mmajkka aMAjAKK;
    mmajkka AmajAKK;
    mmajkka amajAKK;
    kmaamma AMajAKK;
    int aMajAKK;
    int AmAJAKK;

    public String MaJAkkA() {
        return "movieintro";
    }

    public void MAjakkA() {
        this.amAjAKK = null;
        this.amajAKK = null;
        this.AmajAKK = null;
        this.AMAjAKK = null;
    }

    public void mAjakkA(kmaamma kmaamma2) {
        this.AMajAKK = kmaamma2;
        this.aMAjAKK = new mmajkka(512, 256, 1, false);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.AMajAKK.aMajAKK("data/intro4.swz").openStream(), 8192);
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new GZIPInputStream(bufferedInputStream), 8192);
            this.amAjAKK = new kmjamma(this.aMAjAKK, bufferedInputStream2);
        }
        catch (IOException iOException) {}
        this.AMAjAKK = (mmajkka)kmaakma.MAjaKkA(this.AMajAKK.aMajAKK("images/introtausta3.jpg"));
        this.amajAKK = (mmajkka)kmaakma.MAjaKkA(this.AMajAKK.aMajAKK("images/myrkky.jpg"));
    }

    public void MajakkA(mmajkka mmajkka2, float f, float f2) {
        mmajkka2.aMaJAkk();
        int n = 0;
        int n2 = (int)(((double)f - 22.5) * 18.0);
        n2 = Math.max(n2, 0);
        if (n2 > 0) {
            mmajkka2.amaJAkk(this.amajAKK, n %= 512, -(n2 %= this.amajAKK.KamAJaK - 256));
        } else {
            mmajkka2.amaJAkk(this.AMAjAKK, n, n2);
        }
        int n3 = (int)(f * 10.0f);
        this.amAjAKK.majakKa(n3 % this.amAjAKK.MajakKa());
        mmajkka2.AMAJakk(this.aMAjAKK, 0, 0);
        mmajkka2.aMajAkk();
    }

    public void majakkA(String string, float f) {
        if (string.equals("phase")) {
            this.aMajAKK = 50;
            this.AmAJAKK = 200;
        }
        if (string.equals("suh")) {
            this.aMajAKK = 50;
            this.AmAJAKK = 200;
        }
        if (string.equals("suh0")) {
            this.aMajAKK = 100;
            this.AmAJAKK = 150;
        }
        if (string.equals("suh1")) {
            this.aMajAKK = 128;
            this.AmAJAKK = 50;
        }
        if (string.equals("suh2")) {
            this.aMajAKK = 256;
            this.AmAJAKK = 70;
        }
    }

    public maaamma() {
        super();
    }
}

