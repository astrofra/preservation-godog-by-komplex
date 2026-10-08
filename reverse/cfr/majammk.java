/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.MemoryImageSource;
import java.util.Enumeration;
import java.util.Vector;
import muhmu.hifi.device.MAD;

public class majammk
extends Canvas
implements Runnable {
    Vector aJAKKaM = new Vector(20);
    boolean AjaKKaM;
    boolean ajaKKaM;
    Thread AJaKKaM;
    boolean aJaKKaM = false;
    public static boolean AjAkkaM;
    Font ajAkkaM = new Font("Courier", 1, 15);
    Color AJAkkaM = Color.green;
    int aJAkkaM = 20;
    public MAD AjakkaM;
    long ajakkaM;
    long AJakkaM;
    int aJakkaM = 256;
    int AjAKkaM = 128;
    int ajAKkaM = 21;

    public majammk(boolean bl, boolean bl2) {
        super();
        this.AjaKKaM = bl;
        this.ajaKKaM = bl2;
        this.setBackground(new Color(0, 60, 0));
    }

    public void AkkAMAJ() {
        this.AJaKKaM = new Thread(this, "Muhmu Tunari");
        this.AJaKKaM.start();
    }

    public synchronized void aKkAMAJ() {
        if (this.aJaKKaM) {
            return;
        }
        try {
            this.wait();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public void AKkAMAJ(long l) {
        if (AjAkkaM) {
            return;
        }
        try {
            Thread.sleep(l);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public void paint(Graphics graphics) {
        graphics.setColor(Color.yellow);
        graphics.drawRect(0, 0, this.bounds().width - 1, this.bounds().height - 1);
        graphics.setFont(this.ajAkkaM);
        graphics.setColor(this.AJAkkaM);
        Enumeration enumeration = this.aJAKKaM.elements();
        if (enumeration != null) {
            while (enumeration.hasMoreElements()) {
                kmajmka kmajmka2 = (kmajmka)enumeration.nextElement();
                kmajmka2.KAmajak(graphics);
            }
        }
    }

    public synchronized void run() {
        try {
            String string;
            this.aJAKKaM.addElement(new kmajmka("muhmu tuner (c) saviour", 10, this.aJAkkaM += 15));
            this.aJAKKaM.addElement(new kmajmka("measuring optimal parameters for this setup", 10, this.aJAkkaM += 15));
            this.paint(this.getGraphics());
            if (this.AjaKKaM) {
                this.AKkAMAJ(1000L);
                this.ajakkaM = this.akKamAJ();
                this.aJAKKaM.addElement(new kmajmka("kunigas zoom blit " + this.ajakkaM + "ms", 10, this.aJAkkaM += 15));
                ((Component)this).update(this.getGraphics());
                this.AKkAMAJ(1000L);
                this.AJakkaM = this.AkKamAJ();
                this.aJAKKaM.addElement(new kmajmka("normal zoom blit " + this.AJakkaM + "ms", 10, this.aJAkkaM += 15));
                ((Component)this).update(this.getGraphics());
                this.AKkAMAJ(500L);
                if (this.ajakkaM < this.AJakkaM) {
                    string = "kunigas";
                    kmjjmmk.JAkKamA = true;
                } else {
                    string = "normal";
                    kmjjmmk.JAkKamA = false;
                }
                this.aJAKKaM.addElement(new kmajmka("choosing " + string + " mode", 10, this.aJAkkaM += 15));
                this.paint(this.getGraphics());
                System.out.println("kunigas=" + kmjjmmk.JAkKamA);
            }
            this.AKkAMAJ(1000L);
            if (!this.ajaKKaM) {
                MAD mAD = null;
                MAD mAD2 = null;
                MAD mAD3 = null;
                mAD = MAD.getDevice_IE4();
                this.aJAKKaM.addElement(new kmajmka("ie4 audio " + (mAD == null ? "not " : "") + "found", 10, this.aJAkkaM += 15));
                this.paint(this.getGraphics());
                this.AKkAMAJ(500L);
                mAD2 = MAD.getDevice_IE3();
                this.aJAKKaM.addElement(new kmajmka("ie3 audio " + (mAD2 == null ? "not " : "") + "found", 10, this.aJAkkaM += 15));
                this.paint(this.getGraphics());
                this.AKkAMAJ(500L);
                mAD3 = MAD.getDevice_Sun();
                this.aJAKKaM.addElement(new kmajmka("sun audio " + (mAD3 == null ? "not " : "") + "found", 10, this.aJAkkaM += 15));
                this.paint(this.getGraphics());
                if (mAD != null) {
                    this.AjakkaM = mAD;
                    string = "IE4 directsound";
                } else if (mAD2 != null) {
                    this.AjakkaM = mAD2;
                    string = "IE3 directsound";
                } else if (mAD3 != null) {
                    this.AjakkaM = mAD3;
                    string = "sun 8khz crap";
                } else {
                    this.AjakkaM = MAD.getDevice_NOS();
                    string = "no sound";
                }
            } else {
                this.AjakkaM = MAD.getDevice_NOS();
                string = "no audio";
            }
            this.AKkAMAJ(500L);
            this.aJAKKaM.addElement(new kmajmka("choosing " + string, 10, this.aJAkkaM += 15));
            this.paint(this.getGraphics());
            this.aJAKKaM.addElement(new kmajmka("OK. ready to rab!", 10, 190));
            this.paint(this.getGraphics());
            this.AKkAMAJ(1500L);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.aJaKKaM = true;
        this.notifyAll();
    }

    long akKamAJ() {
        Graphics graphics = this.getGraphics();
        int[] nArray = new int[this.aJakkaM * this.AjAKkaM];
        Image image = this.createImage(new MemoryImageSource(this.aJakkaM, this.AjAKkaM, (ColorModel)new DirectColorModel(24, 0xFF0000, 65280, 255), nArray, 0, this.aJakkaM));
        Image image2 = this.createImage(this.aJakkaM, this.AjAKkaM);
        this.akkAMAJ(nArray, this.aJakkaM, this.AjAKkaM, 0, 0, this.aJakkaM - 1, this.AjAKkaM - 1, 0xFFFFFF);
        long l = System.currentTimeMillis();
        int n = 0;
        while (n < this.ajAKkaM) {
            int n2 = n * 3;
            this.akkAMAJ(nArray, this.aJakkaM, this.AjAKkaM, n2, n2, this.aJakkaM - 1 - n2 * 2, this.AjAKkaM - 1 - n2 * 2, 0xFFFFFF);
            image.flush();
            image2.getGraphics().drawImage(image, 0, 0, null);
            graphics.drawImage(image2, 0, 0, this.aJakkaM * 2, this.AjAKkaM * 2, Color.black, null);
            ++n;
        }
        long l2 = System.currentTimeMillis();
        return (l2 - l) / (long)this.ajAKkaM;
    }

    long AkKamAJ() {
        Graphics graphics = this.getGraphics();
        int[] nArray = new int[this.aJakkaM * this.AjAKkaM];
        Image image = this.createImage(new MemoryImageSource(this.aJakkaM, this.AjAKkaM, (ColorModel)new DirectColorModel(24, 0xFF0000, 65280, 255), nArray, 0, this.aJakkaM));
        this.akkAMAJ(nArray, this.aJakkaM, this.AjAKkaM, 0, 0, this.aJakkaM - 1, this.AjAKkaM - 1, 0xFFFFFF);
        long l = System.currentTimeMillis();
        int n = 0;
        while (n < this.ajAKkaM) {
            int n2 = n * 3;
            this.akkAMAJ(nArray, this.aJakkaM, this.AjAKkaM, n2, n2, this.aJakkaM - 1 - n2 * 2, this.AjAKkaM - 1 - n2 * 2, 0xFFFFFF);
            image.flush();
            graphics.drawImage(image, 0, 0, this.aJakkaM * 2, this.AjAKkaM * 2, Color.black, null);
            ++n;
        }
        long l2 = System.currentTimeMillis();
        return (l2 - l) / (long)this.ajAKkaM;
    }

    void akkAMAJ(int[] nArray, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = n3;
        while (n8 < n3 + n5 + 1) {
            nArray[n4 * n + n8] = n7;
            nArray[(n4 + n6) * n + n8] = n7;
            ++n8;
        }
        int n9 = n4 + 1;
        while (n9 < n4 + n6) {
            nArray[n9 * n + n3] = n7;
            nArray[n9 * n + n3 + n5] = n7;
            ++n9;
        }
    }
}

