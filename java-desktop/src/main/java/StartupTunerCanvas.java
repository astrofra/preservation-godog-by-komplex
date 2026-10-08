import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.ColorModel;
import java.awt.image.MemoryImageSource;
import java.awt.image.DirectColorModel;
import java.util.Enumeration;
import java.awt.Graphics;
import muhmu.hifi.device.MAD;
import java.awt.Color;
import java.awt.Font;
import java.util.Vector;
import java.awt.Canvas;

// 
// Decompiled by Procyon v0.6.0
// 

public class StartupTunerCanvas extends Canvas implements Runnable
{
    Vector aJAKKaM;
    boolean AjaKKaM;
    boolean ajaKKaM;
    Thread AJaKKaM;
    boolean aJaKKaM;
    public static boolean AjAkkaM;
    Font ajAkkaM;
    Color AJAkkaM;
    int aJAkkaM;
    public MAD AjakkaM;
    long ajakkaM;
    long AJakkaM;
    int aJakkaM;
    int AjAKkaM;
    int ajAKkaM;
    
    public StartupTunerCanvas(final boolean ajaKKaM, final boolean ajaKKaM2) {
        this.aJAKKaM = new Vector(20);
        this.aJaKKaM = false;
        this.ajAkkaM = new Font("Courier", 1, 15);
        this.AJAkkaM = Color.green;
        this.aJAkkaM = 20;
        this.aJakkaM = 256;
        this.AjAKkaM = 128;
        this.ajAKkaM = 21;
        this.AjaKKaM = ajaKKaM;
        this.ajaKKaM = ajaKKaM2;
        this.setBackground(new Color(0, 60, 0));
    }
    
    public void AkkAMAJ() {
        (this.AJaKKaM = new Thread(this, "Muhmu Tunari")).start();
    }
    
    public synchronized void aKkAMAJ() {
        if (this.aJaKKaM) {
            return;
        }
        try {
            this.wait();
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void AKkAMAJ(final long millis) {
        if (StartupTunerCanvas.AjAkkaM) {
            return;
        }
        try {
            Thread.sleep(millis);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void paint(final Graphics graphics) {
        graphics.setColor(Color.yellow);
        graphics.drawRect(0, 0, this.bounds().width - 1, this.bounds().height - 1);
        graphics.setFont(this.ajAkkaM);
        graphics.setColor(this.AJAkkaM);
        final Enumeration elements = this.aJAKKaM.elements();
        if (elements != null) {
            while (elements.hasMoreElements()) {
                ((TunerLine)elements.nextElement()).KAmajak(graphics);
            }
        }
    }
    
    public synchronized void run() {
        try {
            final Vector ajakKaM = this.aJAKKaM;
            final String s = "muhmu tuner (c) saviour";
            final int n = 10;
            final int ajAkkaM = this.aJAkkaM + 15;
            this.aJAkkaM = ajAkkaM;
            ajakKaM.addElement(new TunerLine(s, n, ajAkkaM));
            final Vector ajakKaM2 = this.aJAKKaM;
            final String s2 = "measuring optimal parameters for this setup";
            final int n2 = 10;
            final int ajAkkaM2 = this.aJAkkaM + 15;
            this.aJAkkaM = ajAkkaM2;
            ajakKaM2.addElement(new TunerLine(s2, n2, ajAkkaM2));
            this.paint(this.getGraphics());
            if (this.AjaKKaM) {
                this.AKkAMAJ(1000L);
                this.ajakkaM = this.akKamAJ();
                final Vector ajakKaM3 = this.aJAKKaM;
                final String string = "kunigas zoom blit " + this.ajakkaM + "ms";
                final int n3 = 10;
                final int ajAkkaM3 = this.aJAkkaM + 15;
                this.aJAkkaM = ajAkkaM3;
                ajakKaM3.addElement(new TunerLine(string, n3, ajAkkaM3));
                this.update(this.getGraphics());
                this.AKkAMAJ(1000L);
                this.AJakkaM = this.AkKamAJ();
                final Vector ajakKaM4 = this.aJAKKaM;
                final String string2 = "normal zoom blit " + this.AJakkaM + "ms";
                final int n4 = 10;
                final int ajAkkaM4 = this.aJAkkaM + 15;
                this.aJAkkaM = ajAkkaM4;
                ajakKaM4.addElement(new TunerLine(string2, n4, ajAkkaM4));
                this.update(this.getGraphics());
                this.AKkAMAJ(500L);
                String str;
                if (this.ajakkaM < this.AJakkaM) {
                    str = "kunigas";
                    SurfacePresenter.JAkKamA = true;
                }
                else {
                    str = "normal";
                    SurfacePresenter.JAkKamA = false;
                }
                final Vector ajakKaM5 = this.aJAKKaM;
                final String string3 = "choosing " + str + " mode";
                final int n5 = 10;
                final int ajAkkaM5 = this.aJAkkaM + 15;
                this.aJAkkaM = ajAkkaM5;
                ajakKaM5.addElement(new TunerLine(string3, n5, ajAkkaM5));
                this.paint(this.getGraphics());
                System.out.println("kunigas=" + SurfacePresenter.JAkKamA);
            }
            this.AKkAMAJ(1000L);
            String str2;
            if (!this.ajaKKaM) {
                final MAD device_IE4 = MAD.getDevice_IE4();
                final Vector ajakKaM6 = this.aJAKKaM;
                final String string4 = "ie4 audio " + ((device_IE4 == null) ? "not " : "") + "found";
                final int n6 = 10;
                final int ajAkkaM6 = this.aJAkkaM + 15;
                this.aJAkkaM = ajAkkaM6;
                ajakKaM6.addElement(new TunerLine(string4, n6, ajAkkaM6));
                this.paint(this.getGraphics());
                this.AKkAMAJ(500L);
                final MAD device_IE5 = MAD.getDevice_IE3();
                final Vector ajakKaM7 = this.aJAKKaM;
                final String string5 = "ie3 audio " + ((device_IE5 == null) ? "not " : "") + "found";
                final int n7 = 10;
                final int ajAkkaM7 = this.aJAkkaM + 15;
                this.aJAkkaM = ajAkkaM7;
                ajakKaM7.addElement(new TunerLine(string5, n7, ajAkkaM7));
                this.paint(this.getGraphics());
                this.AKkAMAJ(500L);
                final MAD device_Sun = MAD.getDevice_Sun();
                final Vector ajakKaM8 = this.aJAKKaM;
                final String string6 = "sun audio " + ((device_Sun == null) ? "not " : "") + "found";
                final int n8 = 10;
                final int ajAkkaM8 = this.aJAkkaM + 15;
                this.aJAkkaM = ajAkkaM8;
                ajakKaM8.addElement(new TunerLine(string6, n8, ajAkkaM8));
                this.paint(this.getGraphics());
                if (device_IE4 != null) {
                    this.AjakkaM = device_IE4;
                    str2 = "IE4 directsound";
                }
                else if (device_IE5 != null) {
                    this.AjakkaM = device_IE5;
                    str2 = "IE3 directsound";
                }
                else if (device_Sun != null) {
                    this.AjakkaM = device_Sun;
                    str2 = "sun 8khz crap";
                }
                else {
                    this.AjakkaM = MAD.getDevice_NOS();
                    str2 = "no sound";
                }
            }
            else {
                this.AjakkaM = MAD.getDevice_NOS();
                str2 = "no audio";
            }
            this.AKkAMAJ(500L);
            final Vector ajakKaM9 = this.aJAKKaM;
            final String string7 = "choosing " + str2;
            final int n9 = 10;
            final int ajAkkaM9 = this.aJAkkaM + 15;
            this.aJAkkaM = ajAkkaM9;
            ajakKaM9.addElement(new TunerLine(string7, n9, ajAkkaM9));
            this.paint(this.getGraphics());
            this.aJAKKaM.addElement(new TunerLine("OK. ready to rab!", 10, 190));
            this.paint(this.getGraphics());
            this.AKkAMAJ(1500L);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
        this.aJaKKaM = true;
        this.notifyAll();
    }
    
    long akKamAJ() {
        final Graphics graphics = this.getGraphics();
        final int[] pix = new int[this.aJakkaM * this.AjAKkaM];
        final Image image = this.createImage(new MemoryImageSource(this.aJakkaM, this.AjAKkaM, new DirectColorModel(24, 16711680, 65280, 255), pix, 0, this.aJakkaM));
        final Image image2 = this.createImage(this.aJakkaM, this.AjAKkaM);
        this.akkAMAJ(pix, this.aJakkaM, this.AjAKkaM, 0, 0, this.aJakkaM - 1, this.AjAKkaM - 1, 16777215);
        final long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < this.ajAKkaM; ++i) {
            final int n = i * 3;
            this.akkAMAJ(pix, this.aJakkaM, this.AjAKkaM, n, n, this.aJakkaM - 1 - n * 2, this.AjAKkaM - 1 - n * 2, 16777215);
            image.flush();
            image2.getGraphics().drawImage(image, 0, 0, null);
            graphics.drawImage(image2, 0, 0, this.aJakkaM * 2, this.AjAKkaM * 2, Color.black, null);
        }
        return (System.currentTimeMillis() - currentTimeMillis) / this.ajAKkaM;
    }
    
    long AkKamAJ() {
        final Graphics graphics = this.getGraphics();
        final int[] pix = new int[this.aJakkaM * this.AjAKkaM];
        final Image image = this.createImage(new MemoryImageSource(this.aJakkaM, this.AjAKkaM, new DirectColorModel(24, 16711680, 65280, 255), pix, 0, this.aJakkaM));
        this.akkAMAJ(pix, this.aJakkaM, this.AjAKkaM, 0, 0, this.aJakkaM - 1, this.AjAKkaM - 1, 16777215);
        final long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < this.ajAKkaM; ++i) {
            final int n = i * 3;
            this.akkAMAJ(pix, this.aJakkaM, this.AjAKkaM, n, n, this.aJakkaM - 1 - n * 2, this.AjAKkaM - 1 - n * 2, 16777215);
            image.flush();
            graphics.drawImage(image, 0, 0, this.aJakkaM * 2, this.AjAKkaM * 2, Color.black, null);
        }
        return (System.currentTimeMillis() - currentTimeMillis) / this.ajAKkaM;
    }
    
    void akkAMAJ(final int[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        for (int i = n3; i < n3 + n5 + 1; ++i) {
            array[(n4 + n6) * n + i] = (array[n4 * n + i] = n7);
        }
        for (int j = n4 + 1; j < n4 + n6; ++j) {
            array[j * n + n3 + n5] = (array[j * n + n3] = n7);
        }
    }
}
