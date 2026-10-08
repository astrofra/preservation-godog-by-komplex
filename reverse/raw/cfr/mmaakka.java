/*
 * Decompiled with CFR 0.152.
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Event;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.ColorModel;
import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;

public class mmaakka
extends Applet
implements Runnable {
    boolean AmaJAKk = true;
    boolean amaJAKk = false;
    boolean AMaJAKk = false;
    boolean aMaJAKk = true;
    private boolean AmAjaKk = false;
    private int amAjaKk = 0;
    int AMAjaKk = 0xFFFFFF;
    boolean aMAjaKk = false;
    Component AmajaKk = this;
    kaajkkk amajaKk = new kaajkkk(this);
    kajamma AMajaKk = new kajamma(this, this.amajaKk);
    Thread aMajaKk;
    mmajmmk AmAJaKk = new mmajmmk(true);
    private Image amAJaKk;
    boolean AMAJaKk;
    boolean aMAJaKk;
    private int AmaJaKk = 1000;
    private int amaJaKk;
    private int AMaJaKk;
    private int aMaJaKk;
    int KaMaJaK;
    int kaMaJaK;
    double KAMaJaK = 1.0;
    double kAMaJaK = 1.0;
    static mmaakka KamaJaK = null;
    Object kamaJaK = new Object();
    private int KAmaJaK;
    private boolean kAmaJaK;

    private void KamaJaK(String string, boolean bl) {
        if (string != null) {
            if (string.equalsIgnoreCase("low")) {
                this.AMaJAKk = false;
                this.aMaJAKk = false;
                return;
            }
            if (string.equalsIgnoreCase("autolow")) {
                this.AMaJAKk = false;
                this.aMaJAKk = true;
                return;
            }
            if (string.equalsIgnoreCase("autohigh")) {
                this.AMaJAKk = true;
                this.aMaJAKk = true;
                return;
            }
            if (string.equalsIgnoreCase("high") || string.equalsIgnoreCase("best")) {
                this.AMaJAKk = true;
                this.aMaJAKk = false;
            }
        }
    }

    void amaJaKk(boolean bl) {
        Serializable serializable;
        this.AmaJAKk = true;
        this.amaJAKk = false;
        this.AMaJAKk = false;
        this.aMaJAKk = true;
        this.AmAjaKk = false;
        this.amAjaKk = 0;
        this.AMAjaKk = 0xFFFFFF;
        this.aMAjaKk = false;
        this.AMAJaKk = false;
        this.aMAJaKk = false;
        this.AmaJaKk = 1000;
        this.amaJaKk = 0;
        this.AMaJaKk = 0;
        this.aMaJaKk = 0;
        KamaJaK = this;
        if (bl) {
            String string = this.getParameter("movie");
            try {
                URL uRL;
                InputStream inputStream;
                if (string != null && (inputStream = (uRL = new URL((URL)(serializable = this.getDocumentBase()), string)).openStream()) != null) {
                    this.AMajaKk.AmAjAkK(inputStream);
                }
            }
            catch (Exception exception) {}
            if ((string = this.getParameter("loop")) != null) {
                boolean bl2 = this.AmaJAKk = string.equalsIgnoreCase("yes") || string.equalsIgnoreCase("true");
            }
            if ((string = this.getParameter("play")) != null) {
                if (!string.equalsIgnoreCase("yes") && !string.equalsIgnoreCase("true")) {
                    this.AmAJaKk.AKkAMaJ();
                } else {
                    this.amaJAKk = true;
                }
            } else {
                this.amaJAKk = true;
            }
            string = this.getParameter("quality");
            this.KamaJaK(string, false);
            string = this.getParameter("forcergb");
            if (string != null) {
                boolean bl3 = this.AmAjaKk = string.equalsIgnoreCase("yes") || string.equalsIgnoreCase("true");
            }
            if ((string = this.getParameter("allocateFullClug")) != null) {
                boolean bl4 = this.aMAjaKk = string.equalsIgnoreCase("yes") || string.equalsIgnoreCase("true");
            }
            if ((string = this.getParameter("scale")) != null) {
                if (string.equalsIgnoreCase("showall")) {
                    this.amAjaKk = 0;
                } else if (string.equalsIgnoreCase("noborder")) {
                    this.amAjaKk = 1;
                } else if (string.equalsIgnoreCase("exactfit")) {
                    this.amAjaKk = 2;
                }
            }
            if ((string = this.getParameter("bgcolor")) != null) {
                try {
                    string = string.replace('#', '0');
                    this.AMAjaKk = Integer.valueOf(string, 16);
                    this.amajaKk.JakkamA(this.AMAjaKk | 0xFF000000, 4);
                }
                catch (NumberFormatException numberFormatException) {}
            }
            if ((string = this.getParameter("salign")) != null) {
                if (string.indexOf(108) >= 0 || string.indexOf(76) >= 0) {
                    this.amAjaKk |= 0x10;
                }
                if (string.indexOf(116) >= 0 || string.indexOf(84) >= 0) {
                    this.amAjaKk |= 0x40;
                }
                if (string.indexOf(114) >= 0 || string.indexOf(82) >= 0) {
                    this.amAjaKk |= 0x20;
                }
                if (string.indexOf(98) >= 0 || string.indexOf(66) >= 0) {
                    this.amAjaKk |= 0x80;
                }
            }
        }
        serializable = this.AmajaKk.bounds();
        this.amajaKk.jAkkamA((int)((double)serializable.width * this.KAMaJaK), (int)((double)serializable.height * this.kAMaJaK), this.AmAjaKk ? ColorModel.getRGBdefault() : this.getColorModel());
    }

    void AmaJaKk(boolean bl) {
        this.amajaKk.JAkkAMA(this.AMajaKk.MaJAkka, this.AMaJAKk, this.amAjaKk, bl);
    }

    void aMajaKk() {
        this.AmAJaKk.AKkAMaJ();
        kajamma kajamma2 = this.AMajaKk;
        kajamma2.mAJAKKa = false;
        ((kajakmk)kajamma2.MaJAKKa).stop();
    }

    void AmAJaKk() {
        this.AmAJaKk.aKKAMaJ();
    }

    int kaMaJaK() {
        return this.AMajaKk.maJaKKa;
    }

    synchronized void AMAJaKk(int n) {
        this.aMajaKk();
        kajamma kajamma2 = this.AMajaKk;
        if (n != kajamma2.maJaKKa) {
            this.amajaKk.jaKKAMA(this.AMajaKk, n);
            this.amAJaKk(0);
            this.amajaKk.JAkKamA();
        }
    }

    boolean KAMaJaK(int n, int n2) {
        if (this.amAJaKk == null || this.amajaKk.jakkAMA(n, n2)) {
            this.AmaJaKk(false);
            this.amAJaKk = this.AmajaKk.createImage(this.amajaKk);
            return true;
        }
        return false;
    }

    boolean aMAJaKk(boolean bl, int n, int n2, int n3, int n4) {
        if (!bl) {
            this.AmajaKk.repaint();
            return true;
        }
        Graphics graphics = this.AmajaKk.getGraphics();
        if (graphics != null) {
            graphics.clipRect(n + this.KaMaJaK, n2 + this.kaMaJaK, n3, n4);
            graphics.drawImage(this.amAJaKk, this.KaMaJaK, this.kaMaJaK, null);
            return true;
        }
        return false;
    }

    private static Frame AMaJaKk(Component component) {
        if (component instanceof Frame) {
            return (Frame)component;
        }
        Container container = component.getParent();
        while (container != null) {
            if (container instanceof Frame) {
                return (Frame)container;
            }
            container = container.getParent();
        }
        return null;
    }

    private int amAJaKk(int n) {
        kmjjmka kmjjmka2;
        ++this.KAmaJaK;
        int n2 = -1;
        int n3 = 0;
        while (n3 < this.AMajaKk.MAjaKKa) {
            kmjjmka2 = new kmjjmka();
            byte[] byArray = this.AMajaKk.KAMaJAK;
            int n4 = this.AMajaKk.majaKKa[n3];
            kmjjmka2.KAMaJAK = byArray;
            kmjjmka2.kAMaJAK = n4;
            int n5 = 0;
            while ((n4 = kmjjmka2.KAMaJAK[kmjjmka2.kAMaJAK++] & 0xFF) != 0) {
                int n6 = 0;
                if ((n4 & 0x80) != 0) {
                    n6 = kmjjmka2.KAmAJak();
                }
                int n7 = kmjjmka2.kAMaJAK + n6;
                if (n5 > 0) {
                    --n5;
                } else {
                    switch (n4) {
                        case 131: {
                            try {
                                String string = kmjjmka2.KamAJak();
                                String string2 = kmjjmka2.KamAJak();
                                this.getAppletContext().showDocument(new URL(this.getDocumentBase(), string), string2);
                            }
                            catch (Exception exception) {}
                            break;
                        }
                        case 129: {
                            n2 = kmjjmka2.KAmAJak();
                            break;
                        }
                        case 6: {
                            n = 1;
                            break;
                        }
                        case 7: {
                            n = 2;
                            break;
                        }
                        case 9: {
                            this.AMajaKk.MAjAkKa();
                            break;
                        }
                        case 138: {
                            int n8 = kmjjmka2.KAmAJak();
                            if (this.AMajaKk.mAjAkKa(n8)) break;
                            n5 = kmjjmka2.KAMaJAK[kmjjmka2.kAMaJAK++] & 0xFF;
                        }
                    }
                }
                kmjjmka2.kAMaJAK = n7;
            }
            ++n3;
        }
        this.AMajaKk.MAjaKKa = 0;
        if (n2 >= 0) {
            kmjjmka2 = this.AMajaKk;
            if (n2 != ((kajamma)kmjjmka2).maJaKKa) {
                this.amajaKk.jaKKAMA(this.AMajaKk, n2);
                if (this.KAmaJaK < 4) {
                    n = this.amAJaKk(0);
                } else {
                    this.AMajaKk.MAjaKKa = 0;
                }
            }
        }
        if (n == 1) {
            this.AmAJaKk();
        } else if (n == 2) {
            this.aMajaKk();
        }
        --this.KAmaJaK;
        return n;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void run() {
        long l = 0L;
        Thread thread = Thread.currentThread();
        try {
            block8: while (true) {
                Object object;
                this.aMajaKk.setPriority(4);
                while (true) {
                    object = this.AMajaKk;
                    if (((kajamma)object).mAjAkka && this.AMajaKk.majakka == 0) {
                        object = this.kamaJaK;
                        synchronized (object) {
                            Graphics graphics;
                            this.AmaJaKk(false);
                            if (this.amAJaKk == null) {
                                this.amAJaKk = this.AmajaKk.createImage(this.amajaKk);
                            }
                            if ((graphics = this.AmajaKk.getGraphics()) != null) {
                                graphics.drawImage(this.amAJaKk, 0, 0, null);
                            }
                            break;
                        }
                    }
                    this.AMajaKk.MAJaKKa.AkkAMaJ();
                }
                object = this.AMajaKk;
                if (((kajamma)object).maJaKKa <= 0) {
                    while (this.amajaKk.JaKKAMA(this.AMajaKk, 0) != 0) {
                        object = this.AMajaKk;
                        if (((kmjjmka)object).KAMaJAK != null && ((kajamma)object).MAjakka >= ((kajamma)object).mAjakka) break;
                        this.amajaKk.JAkKamA();
                        this.AMajaKk.MAJaKKa.AkkAMaJ();
                    }
                    this.amajaKk.JAkKamA();
                    if (this.AMajaKk.mAJAkka == 1) {
                        this.AmAJaKk.AKkAMaJ();
                        if (this.aMaJAKk) {
                            this.AMaJAKk = true;
                        }
                    }
                    this.amAJaKk(0);
                    Thread.sleep(this.AMajaKk.MAJAkka);
                }
                this.aMajaKk.setPriority(3);
                while (true) {
                    boolean bl = false;
                    this.AmAJaKk.akkAMaJ();
                    long l2 = System.currentTimeMillis();
                    l = l2 + (long)this.AMajaKk.MAJAkka;
                    Object object2 = this.kamaJaK;
                    synchronized (object2) {
                        block34: {
                            block33: {
                                while (true) {
                                    kajamma kajamma2 = this.AMajaKk;
                                    int n = this.amajaKk.JaKKAMA(this.AMajaKk, kajamma2.maJaKKa + 1);
                                    if (n == 1) {
                                        this.AMajaKk.MAJaKKa.AkkAMaJ();
                                        continue;
                                    }
                                    if (n < 0) break block33;
                                    if (n != 2) break block34;
                                    if (!this.AmaJAKk) break;
                                    kajamma kajamma3 = this.AMajaKk;
                                    if (kajamma3.maJaKKa == 0) break;
                                    n = this.amajaKk.JaKKAMA(this.AMajaKk, 0);
                                }
                                this.AmAJaKk.AKkAMaJ();
                            }
                            Object var8_9 = null;
                            continue block8;
                        }
                        if (this.AMajaKk.MAjaKKa > 0) {
                            this.amAJaKk(0);
                        }
                        if (this.AmajaKk.isShowing()) {
                            bl = !this.AMajaKk.AmAjakK() ? this.amajaKk.JAkKamA() : false;
                        }
                    }
                    int n = (int)(l - System.currentTimeMillis());
                    if (this.AMajaKk.mAJAKKa) {
                        Thread.sleep(this.AMajaKk.aMAjAkK());
                    } else if (n > 0) {
                        Thread.sleep(n);
                    }
                    if (!this.aMaJAKk || !bl) continue;
                    if (-n * 4 > this.AMajaKk.MAJAkka) {
                        ++this.amaJaKk;
                    } else if (n * 4 > this.AMajaKk.MAJAkka) {
                        ++this.AMaJaKk;
                    }
                    ++this.aMaJaKk;
                    if (this.aMaJaKk > 4 && this.AmaJaKk > 30) {
                        if (this.AMaJAKk) {
                            if (this.amaJaKk * 2 > this.aMaJaKk) {
                                this.AMaJAKk = false;
                                this.AmaJaKk = 0;
                                this.AmaJaKk(false);
                            }
                        } else if (this.AMaJaKk * 2 > this.aMaJaKk) {
                            this.AMaJAKk = true;
                            this.AmaJaKk = 0;
                            this.AmaJaKk(false);
                        }
                    }
                    ++this.AmaJaKk;
                }
                break;
            }
        }
        catch (Exception exception) {
            return;
        }
    }

    public boolean imageUpdate(Image image, int n, int n2, int n3, int n4, int n5) {
        return true;
    }

    public String[][] getParameterInfo() {
        String[][] stringArray = new String[][]{{"script", "url", "the Flash movie file"}, {"quality", "string", "turn on high quality rendering"}, {"loop", "boolean", "play in a contiuous loop"}, {"play", "boolean", "start playing automatically"}, {"scale", "string", "smoothing"}, {"salign", "string", "smoothing"}, {"bgcolor", "string", "#0xRGB (hex RGB value"}, {"Flash Ver", String.valueOf(131073), "Build " + 2}};
        return stringArray;
    }

    public synchronized void start() {
        Object object = this.kamaJaK;
        synchronized (object) {
            this.amaJaKk(true);
            this.aMajaKk = new Thread(this);
            this.AMAJaKk(0);
            if (this.amaJAKk) {
                this.AmAJaKk();
            }
            this.aMajaKk.start();
            return;
        }
    }

    public synchronized void stop() {
        Object object = this.kamaJaK;
        synchronized (object) {
            this.AMajaKk.MAjAkKa();
            this.aMajaKk.stop();
            this.aMajaKk = null;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean handleEvent(Event event) {
        Object object = this.kamaJaK;
        synchronized (object) {
            int n = event.x - this.KaMaJaK;
            int n2 = event.y - this.kaMaJaK;
            switch (event.id) {
                case 503: {
                    kajakkk kajakkk2 = this.amajaKk.JakkAMA(n, n2);
                    return this.KaMaJaK(n, n2, kajakkk2);
                }
                case 501: {
                    kajakkk kajakkk3 = this.amajaKk.JakkAMA(n, n2);
                    if (!this.amajaKk.jAkKamA(kajakkk3, 4)) return true;
                    Thread.yield();
                    this.amajaKk.JAkKamA();
                    return true;
                }
                case 506: {
                    kajakkk kajakkk4 = this.amajaKk.JakkAMA(n, n2);
                    return this.aMaJaKk(n, n2, kajakkk4);
                }
                case 505: {
                    if (!this.amajaKk.jAkKamA(null, 0)) return true;
                    Thread.yield();
                    this.amajaKk.JAkKamA();
                    return true;
                }
                case 502: {
                    return this.kAMaJaK();
                }
            }
            return false;
        }
    }

    private boolean KaMaJaK(int n, int n2, kajakkk kajakkk2) {
        Frame frame = mmaakka.AMaJaKk(this.AmajaKk);
        if (frame != null) {
            if (kajakkk2 != null) {
                frame.setCursor(12);
                this.kAmaJaK = true;
            } else if (this.kAmaJaK) {
                frame.setCursor(0);
                this.kAmaJaK = false;
            }
        }
        if (this.amajaKk.jAkKamA(kajakkk2, 2)) {
            Thread.yield();
            this.amajaKk.JAkKamA();
        }
        return true;
    }

    private boolean aMaJaKk(int n, int n2, kajakkk kajakkk2) {
        if (this.amajaKk.mAjaKkA != null && this.amajaKk.jAkKamA(this.amajaKk.mAjaKkA, kajakkk2 == this.amajaKk.mAjaKkA ? 4 : 2)) {
            Thread.yield();
            this.amajaKk.JAkKamA();
        }
        return true;
    }

    private boolean kAMaJaK() {
        if (this.amajaKk.MaJAKkA == 4 && this.amajaKk.mAjaKkA != null) {
            int n;
            this.amajaKk.jAkKamA(this.amajaKk.mAjaKkA, 1);
            Thread.yield();
            this.amajaKk.JAkKamA();
            mmjakka mmjakka2 = this.amajaKk.mAjaKkA.MAjaKka;
            kmjjmka kmjjmka2 = new kmjjmka();
            byte[] byArray = mmjakka2.AmaJakk.KAMaJAK;
            int n2 = mmjakka2.aMaJakk;
            kmjjmka2.KAMaJAK = byArray;
            kmjjmka2.kAMaJAK = n2;
            while ((n = kmjjmka2.KAMaJAK[kmjjmka2.kAMaJAK++] & 0xFF) != 0) {
                kmjjmka2.KAmAJak();
                kmjjmka2.KAmAJak();
                kmjjmka2.KaMAJak();
            }
            n = 0;
            while ((n2 = kmjjmka2.KAMaJAK[kmjjmka2.kAMaJAK++] & 0xFF) != 0) {
                int n3 = 0;
                if ((n2 & 0x80) != 0) {
                    n3 = kmjjmka2.KAmAJak();
                }
                int n4 = kmjjmka2.kAMaJAK + n3;
                if (n > 0) {
                    --n;
                } else {
                    switch (n2) {
                        case 131: {
                            try {
                                String string = kmjjmka2.KamAJak();
                                String string2 = kmjjmka2.KamAJak();
                                this.getAppletContext().showDocument(new URL(this.getDocumentBase(), string), string2);
                            }
                            catch (Exception exception) {}
                            break;
                        }
                        case 129: {
                            int n5 = kmjjmka2.KAmAJak();
                            this.AMAJaKk(n5);
                            break;
                        }
                        case 4: {
                            this.AMAJaKk(this.kaMaJaK() + 1);
                            break;
                        }
                        case 5: {
                            this.AMAJaKk(this.kaMaJaK() - 1);
                            break;
                        }
                        case 8: {
                            this.AMaJAKk = !this.AMaJAKk;
                            this.aMaJAKk = false;
                            this.AmaJaKk(true);
                            break;
                        }
                        case 6: {
                            this.AmAJaKk();
                            break;
                        }
                        case 7: {
                            this.aMajaKk();
                            break;
                        }
                        case 9: {
                            this.AMajaKk.MAjAkKa();
                            break;
                        }
                        case 138: {
                            int n6 = kmjjmka2.KAmAJak();
                            if (this.AMajaKk.mAjAkKa(n6)) break;
                            n = kmjjmka2.KAMaJAK[kmjjmka2.kAMaJAK++] & 0xFF;
                        }
                    }
                }
                kmjjmka2.kAMaJAK = n4;
            }
        }
        return true;
    }

    public void update(Graphics graphics) {
        Rectangle rectangle = this.AmajaKk.bounds();
        Object object = this.AMajaKk;
        if (((kajamma)object).mAjAkka) {
            object = this.kamaJaK;
            synchronized (object) {
                this.KAMaJaK((int)((double)rectangle.width * this.KAMaJaK), (int)((double)rectangle.height * this.kAMaJaK));
            }
        }
        if (this.amAJaKk != null) {
            graphics.drawImage(this.amAJaKk, this.KaMaJaK, this.kaMaJaK, null);
            return;
        }
        graphics.setColor(new Color(0xFF000000 | this.AMAjaKk));
        graphics.fillRect(this.KaMaJaK, this.kaMaJaK, this.amajaKk.MajAKkA, this.amajaKk.majAKkA);
    }

    public void paint(Graphics graphics) {
        this.AmajaKk.bounds();
        this.update(graphics);
    }

    public mmaakka() {
        super();
    }

    static {
    }
}

