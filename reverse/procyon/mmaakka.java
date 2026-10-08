import java.awt.Color;
import java.awt.Event;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.Rectangle;
import java.io.InputStream;
import java.awt.image.ColorModel;
import java.net.URL;
import java.awt.Image;
import java.awt.Component;
import java.applet.Applet;

// 
// Decompiled by Procyon v0.6.0
// 

public class mmaakka extends Applet implements Runnable
{
    boolean AmaJAKk;
    boolean amaJAKk;
    boolean AMaJAKk;
    boolean aMaJAKk;
    private boolean AmAjaKk;
    private int amAjaKk;
    int AMAjaKk;
    boolean aMAjaKk;
    Component AmajaKk;
    kaajkkk amajaKk;
    kajamma AMajaKk;
    Thread aMajaKk;
    mmajmmk AmAJaKk;
    private Image amAJaKk;
    boolean AMAJaKk;
    boolean aMAJaKk;
    private int AmaJaKk;
    private int amaJaKk;
    private int AMaJaKk;
    private int aMaJaKk;
    int KaMaJaK;
    int kaMaJaK;
    double KAMaJaK;
    double kAMaJaK;
    static mmaakka KamaJaK;
    Object kamaJaK;
    private int KAmaJaK;
    private boolean kAmaJaK;
    
    private void KamaJaK(final String s, final boolean b) {
        if (s != null) {
            if (s.equalsIgnoreCase("low")) {
                this.AMaJAKk = false;
                this.aMaJAKk = false;
                return;
            }
            if (s.equalsIgnoreCase("autolow")) {
                this.AMaJAKk = false;
                this.aMaJAKk = true;
                return;
            }
            if (s.equalsIgnoreCase("autohigh")) {
                this.AMaJAKk = true;
                this.aMaJAKk = true;
                return;
            }
            if (s.equalsIgnoreCase("high") || s.equalsIgnoreCase("best")) {
                this.AMaJAKk = true;
                this.aMaJAKk = false;
            }
        }
    }
    
    void amaJaKk(final boolean b) {
        this.AmaJAKk = true;
        this.amaJAKk = false;
        this.AMaJAKk = false;
        this.aMaJAKk = true;
        this.AmAjaKk = false;
        this.amAjaKk = 0;
        this.AMAjaKk = 16777215;
        this.aMAjaKk = false;
        this.AMAJaKk = false;
        this.aMAJaKk = false;
        this.AmaJaKk = 1000;
        this.amaJaKk = 0;
        this.AMaJaKk = 0;
        this.aMaJaKk = 0;
        mmaakka.KamaJaK = this;
        if (b) {
            final String parameter = this.getParameter("movie");
            try {
                if (parameter != null) {
                    final InputStream openStream = new URL(this.getDocumentBase(), parameter).openStream();
                    if (openStream != null) {
                        this.AMajaKk.AmAjAkK(openStream);
                    }
                }
            }
            catch (final Exception ex) {}
            final String parameter2 = this.getParameter("loop");
            if (parameter2 != null) {
                this.AmaJAKk = (parameter2.equalsIgnoreCase("yes") || parameter2.equalsIgnoreCase("true"));
            }
            final String parameter3 = this.getParameter("play");
            if (parameter3 != null) {
                if (!parameter3.equalsIgnoreCase("yes") && !parameter3.equalsIgnoreCase("true")) {
                    this.AmAJaKk.AKkAMaJ();
                }
                else {
                    this.amaJAKk = true;
                }
            }
            else {
                this.amaJAKk = true;
            }
            this.KamaJaK(this.getParameter("quality"), false);
            final String parameter4 = this.getParameter("forcergb");
            if (parameter4 != null) {
                this.AmAjaKk = (parameter4.equalsIgnoreCase("yes") || parameter4.equalsIgnoreCase("true"));
            }
            final String parameter5 = this.getParameter("allocateFullClug");
            if (parameter5 != null) {
                this.aMAjaKk = (parameter5.equalsIgnoreCase("yes") || parameter5.equalsIgnoreCase("true"));
            }
            final String parameter6 = this.getParameter("scale");
            if (parameter6 != null) {
                if (parameter6.equalsIgnoreCase("showall")) {
                    this.amAjaKk = 0;
                }
                else if (parameter6.equalsIgnoreCase("noborder")) {
                    this.amAjaKk = 1;
                }
                else if (parameter6.equalsIgnoreCase("exactfit")) {
                    this.amAjaKk = 2;
                }
            }
            final String parameter7 = this.getParameter("bgcolor");
            if (parameter7 != null) {
                try {
                    this.AMAjaKk = Integer.valueOf(parameter7.replace('#', '0'), 16);
                    this.amajaKk.JakkamA(this.AMAjaKk | 0xFF000000, 4);
                }
                catch (final NumberFormatException ex2) {}
            }
            final String parameter8 = this.getParameter("salign");
            if (parameter8 != null) {
                if (parameter8.indexOf(108) >= 0 || parameter8.indexOf(76) >= 0) {
                    this.amAjaKk |= 0x10;
                }
                if (parameter8.indexOf(116) >= 0 || parameter8.indexOf(84) >= 0) {
                    this.amAjaKk |= 0x40;
                }
                if (parameter8.indexOf(114) >= 0 || parameter8.indexOf(82) >= 0) {
                    this.amAjaKk |= 0x20;
                }
                if (parameter8.indexOf(98) >= 0 || parameter8.indexOf(66) >= 0) {
                    this.amAjaKk |= 0x80;
                }
            }
        }
        final Rectangle bounds = this.AmajaKk.bounds();
        this.amajaKk.jAkkamA((int)(bounds.width * this.KAMaJaK), (int)(bounds.height * this.kAMaJaK), this.AmAjaKk ? ColorModel.getRGBdefault() : this.getColorModel());
    }
    
    void AmaJaKk(final boolean b) {
        this.amajaKk.JAkkAMA(this.AMajaKk.MaJAkka, this.AMaJAKk, this.amAjaKk, b);
    }
    
    void aMajaKk() {
        this.AmAJaKk.AKkAMaJ();
        final kajamma aMajaKk = this.AMajaKk;
        aMajaKk.mAJAKKa = false;
        ((kajakmk)aMajaKk.MaJAKKa).stop();
    }
    
    void AmAJaKk() {
        this.AmAJaKk.aKKAMaJ();
    }
    
    int kaMaJaK() {
        return this.AMajaKk.maJaKKa;
    }
    
    synchronized void AMAJaKk(final int n) {
        this.aMajaKk();
        if (n != this.AMajaKk.maJaKKa) {
            this.amajaKk.jaKKAMA(this.AMajaKk, n);
            this.amAJaKk(0);
            this.amajaKk.JAkKamA();
        }
    }
    
    boolean KAMaJaK(final int n, final int n2) {
        if (this.amAJaKk == null || this.amajaKk.jakkAMA(n, n2)) {
            this.AmaJaKk(false);
            this.amAJaKk = this.AmajaKk.createImage(this.amajaKk);
            return true;
        }
        return false;
    }
    
    boolean aMAJaKk(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (!b) {
            this.AmajaKk.repaint();
            return true;
        }
        final Graphics graphics = this.AmajaKk.getGraphics();
        if (graphics != null) {
            graphics.clipRect(n + this.KaMaJaK, n2 + this.kaMaJaK, n3, n4);
            graphics.drawImage(this.amAJaKk, this.KaMaJaK, this.kaMaJaK, null);
            return true;
        }
        return false;
    }
    
    private static Frame AMaJaKk(final Component component) {
        if (component instanceof Frame) {
            return (Frame)component;
        }
        for (Container container = component.getParent(); container != null; container = container.getParent()) {
            if (container instanceof Frame) {
                return (Frame)container;
            }
        }
        return null;
    }
    
    private int amAJaKk(int amAJaKk) {
        ++this.KAmaJaK;
        int kAmAJak = -1;
        for (int i = 0; i < this.AMajaKk.MAjaKKa; ++i) {
            final kmjjmka kmjjmka = new kmjjmka();
            final byte[] kaMaJAK = this.AMajaKk.KAMaJAK;
            final int kaMaJAK2 = this.AMajaKk.majaKKa[i];
            kmjjmka.KAMaJAK = kaMaJAK;
            kmjjmka.kAMaJAK = kaMaJAK2;
            int n = 0;
            while (true) {
                final int n2 = kmjjmka.KAMaJAK[kmjjmka.kAMaJAK++] & 0xFF;
                if (n2 == 0) {
                    break;
                }
                int kAmAJak2 = 0;
                if ((n2 & 0x80) != 0x0) {
                    kAmAJak2 = kmjjmka.KAmAJak();
                }
                final int kaMaJAK3 = kmjjmka.kAMaJAK + kAmAJak2;
                if (n > 0) {
                    --n;
                }
                else {
                    switch (n2) {
                        case 131: {
                            try {
                                this.getAppletContext().showDocument(new URL(this.getDocumentBase(), kmjjmka.KamAJak()), kmjjmka.KamAJak());
                            }
                            catch (final Exception ex) {}
                            break;
                        }
                        case 129: {
                            kAmAJak = kmjjmka.KAmAJak();
                            break;
                        }
                        case 6: {
                            amAJaKk = 1;
                            break;
                        }
                        case 7: {
                            amAJaKk = 2;
                            break;
                        }
                        case 9: {
                            this.AMajaKk.MAjAkKa();
                            break;
                        }
                        case 138: {
                            if (!this.AMajaKk.mAjAkKa(kmjjmka.KAmAJak())) {
                                n = (kmjjmka.KAMaJAK[kmjjmka.kAMaJAK++] & 0xFF);
                                break;
                            }
                            break;
                        }
                    }
                }
                kmjjmka.kAMaJAK = kaMaJAK3;
            }
        }
        this.AMajaKk.MAjaKKa = 0;
        if (kAmAJak >= 0 && kAmAJak != this.AMajaKk.maJaKKa) {
            this.amajaKk.jaKKAMA(this.AMajaKk, kAmAJak);
            if (this.KAmaJaK < 4) {
                amAJaKk = this.amAJaKk(0);
            }
            else {
                this.AMajaKk.MAjaKKa = 0;
            }
        }
        if (amAJaKk == 1) {
            this.AmAJaKk();
        }
        else if (amAJaKk == 2) {
            this.aMajaKk();
        }
        --this.KAmaJaK;
        return amAJaKk;
    }
    
    public void run() {
        Thread.currentThread();
        try {
        Label_0006:
            while (true) {
                while (true) {
                    this.aMajaKk.setPriority(4);
                    while (!this.AMajaKk.mAjAkka || this.AMajaKk.majakka != 0) {
                        this.AMajaKk.MAJaKKa.AkkAMaJ();
                    }
                    synchronized (this.kamaJaK) {
                        this.AmaJaKk(false);
                        if (this.amAJaKk == null) {
                            this.amAJaKk = this.AmajaKk.createImage(this.amajaKk);
                        }
                        final Graphics graphics = this.AmajaKk.getGraphics();
                        if (graphics != null) {
                            graphics.drawImage(this.amAJaKk, 0, 0, null);
                        }
                        monitorexit(this.kamaJaK);
                    }
                    if (this.AMajaKk.maJaKKa <= 0) {
                        while (this.amajaKk.JaKKAMA(this.AMajaKk, 0) != 0) {
                            final kajamma aMajaKk = this.AMajaKk;
                            if (aMajaKk.KAMaJAK != null && (aMajaKk.MAjakka >= aMajaKk.mAjakka || false)) {
                                break;
                            }
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
                        boolean b = false;
                        this.AmAJaKk.akkAMaJ();
                        final long n = System.currentTimeMillis() + this.AMajaKk.MAJAkka;
                        synchronized (this.kamaJaK) {
                            while (true) {
                                final int jaKKAMA = this.amajaKk.JaKKAMA(this.AMajaKk, this.AMajaKk.maJaKKa + 1);
                                if (jaKKAMA == 1) {
                                    this.AMajaKk.MAJaKKa.AkkAMaJ();
                                }
                                else {
                                    if (jaKKAMA < 0) {
                                        monitorexit(this.kamaJaK);
                                        continue Label_0006;
                                    }
                                    if (jaKKAMA != 2) {
                                        if (this.AMajaKk.MAjaKKa > 0) {
                                            this.amAJaKk(0);
                                        }
                                        if (this.AmajaKk.isShowing()) {
                                            b = (!this.AMajaKk.AmAjakK() && this.amajaKk.JAkKamA());
                                        }
                                        monitorexit(this.kamaJaK);
                                        break;
                                    }
                                    if (!this.AmaJAKk || this.AMajaKk.maJaKKa == 0) {
                                        this.AmAJaKk.AKkAMaJ();
                                        monitorexit(this.kamaJaK);
                                        continue Label_0006;
                                    }
                                    this.amajaKk.JaKKAMA(this.AMajaKk, 0);
                                }
                            }
                        }
                        final int n2 = (int)(n - System.currentTimeMillis());
                        if (this.AMajaKk.mAJAKKa) {
                            Thread.sleep(this.AMajaKk.aMAjAkK());
                        }
                        else if (n2 > 0) {
                            Thread.sleep(n2);
                        }
                        if (this.aMaJAKk && b) {
                            if (-n2 * 4 > this.AMajaKk.MAJAkka) {
                                ++this.amaJaKk;
                            }
                            else if (n2 * 4 > this.AMajaKk.MAJAkka) {
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
                                }
                                else if (this.AMaJaKk * 2 > this.aMaJaKk) {
                                    this.AMaJAKk = true;
                                    this.AmaJaKk = 0;
                                    this.AmaJaKk(false);
                                }
                            }
                            ++this.AmaJaKk;
                        }
                    }
                }
                break;
            }
        }
        catch (final Exception ex) {}
    }
    
    public boolean imageUpdate(final Image image, final int n, final int n2, final int n3, final int n4, final int n5) {
        return true;
    }
    
    public String[][] getParameterInfo() {
        return new String[][] { { "script", "url", "the Flash movie file" }, { "quality", "string", "turn on high quality rendering" }, { "loop", "boolean", "play in a contiuous loop" }, { "play", "boolean", "start playing automatically" }, { "scale", "string", "smoothing" }, { "salign", "string", "smoothing" }, { "bgcolor", "string", "#0xRGB (hex RGB value" }, { "Flash Ver", String.valueOf(131073), "Build " + 2 } };
    }
    
    public synchronized void start() {
        synchronized (this.kamaJaK) {
            this.amaJaKk(true);
            this.aMajaKk = new Thread(this);
            this.AMAJaKk(0);
            if (this.amaJAKk) {
                this.AmAJaKk();
            }
            this.aMajaKk.start();
            monitorexit(this.kamaJaK);
        }
    }
    
    public synchronized void stop() {
        synchronized (this.kamaJaK) {
            this.AMajaKk.MAjAkKa();
            this.aMajaKk.stop();
            this.aMajaKk = null;
            monitorexit(this.kamaJaK);
        }
    }
    
    public boolean handleEvent(final Event event) {
        synchronized (this.kamaJaK) {
            final int n = event.x - this.KaMaJaK;
            final int n2 = event.y - this.kaMaJaK;
            switch (event.id) {
                case 2: {
                    final boolean kaMaJaK = this.KaMaJaK(n, n2, this.amajaKk.JakkAMA(n, n2));
                    monitorexit(this.kamaJaK);
                    return kaMaJaK;
                }
                case 0: {
                    if (this.amajaKk.jAkKamA(this.amajaKk.JakkAMA(n, n2), 4)) {
                        Thread.yield();
                        this.amajaKk.JAkKamA();
                    }
                    final boolean b = true;
                    monitorexit(this.kamaJaK);
                    return b;
                }
                case 5: {
                    final boolean aMaJaKk = this.aMaJaKk(n, n2, this.amajaKk.JakkAMA(n, n2));
                    monitorexit(this.kamaJaK);
                    return aMaJaKk;
                }
                case 4: {
                    if (this.amajaKk.jAkKamA(null, 0)) {
                        Thread.yield();
                        this.amajaKk.JAkKamA();
                    }
                    final boolean b2 = true;
                    monitorexit(this.kamaJaK);
                    return b2;
                }
                case 1: {
                    final boolean kaMaJaK2 = this.kAMaJaK();
                    monitorexit(this.kamaJaK);
                    return kaMaJaK2;
                }
                default: {
                    final boolean b3 = false;
                    monitorexit(this.kamaJaK);
                    return b3;
                }
            }
        }
    }
    
    private boolean KaMaJaK(final int n, final int n2, final kajakkk kajakkk) {
        final Frame aMaJaKk = AMaJaKk(this.AmajaKk);
        if (aMaJaKk != null) {
            if (kajakkk != null) {
                aMaJaKk.setCursor(12);
                this.kAmaJaK = true;
            }
            else if (this.kAmaJaK) {
                aMaJaKk.setCursor(0);
                this.kAmaJaK = false;
            }
        }
        if (this.amajaKk.jAkKamA(kajakkk, 2)) {
            Thread.yield();
            this.amajaKk.JAkKamA();
        }
        return true;
    }
    
    private boolean aMaJaKk(final int n, final int n2, final kajakkk kajakkk) {
        if (this.amajaKk.mAjaKkA != null && this.amajaKk.jAkKamA(this.amajaKk.mAjaKkA, (kajakkk == this.amajaKk.mAjaKkA) ? 4 : 2)) {
            Thread.yield();
            this.amajaKk.JAkKamA();
        }
        return true;
    }
    
    private boolean kAMaJaK() {
        if (this.amajaKk.MaJAKkA == 4 && this.amajaKk.mAjaKkA != null) {
            this.amajaKk.jAkKamA(this.amajaKk.mAjaKkA, 1);
            Thread.yield();
            this.amajaKk.JAkKamA();
            final mmjakka mAjaKka = this.amajaKk.mAjaKkA.MAjaKka;
            final kmjjmka kmjjmka = new kmjjmka();
            final byte[] kaMaJAK = mAjaKka.AmaJakk.KAMaJAK;
            final int aMaJakk = mAjaKka.aMaJakk;
            kmjjmka.KAMaJAK = kaMaJAK;
            kmjjmka.kAMaJAK = aMaJakk;
            while ((kmjjmka.KAMaJAK[kmjjmka.kAMaJAK++] & 0xFF) != 0x0) {
                kmjjmka.KAmAJak();
                kmjjmka.KAmAJak();
                kmjjmka.KaMAJak();
            }
            int n = 0;
            while (true) {
                final int n2 = kmjjmka.KAMaJAK[kmjjmka.kAMaJAK++] & 0xFF;
                if (n2 == 0) {
                    break;
                }
                int kAmAJak = 0;
                if ((n2 & 0x80) != 0x0) {
                    kAmAJak = kmjjmka.KAmAJak();
                }
                final int kaMaJAK2 = kmjjmka.kAMaJAK + kAmAJak;
                if (n > 0) {
                    --n;
                }
                else {
                    switch (n2) {
                        case 131: {
                            try {
                                this.getAppletContext().showDocument(new URL(this.getDocumentBase(), kmjjmka.KamAJak()), kmjjmka.KamAJak());
                            }
                            catch (final Exception ex) {}
                            break;
                        }
                        case 129: {
                            this.AMAJaKk(kmjjmka.KAmAJak());
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
                            if (!this.AMajaKk.mAjAkKa(kmjjmka.KAmAJak())) {
                                n = (kmjjmka.KAMaJAK[kmjjmka.kAMaJAK++] & 0xFF);
                                break;
                            }
                            break;
                        }
                    }
                }
                kmjjmka.kAMaJAK = kaMaJAK2;
            }
        }
        return true;
    }
    
    public void update(final Graphics graphics) {
        final Rectangle bounds = this.AmajaKk.bounds();
        if (this.AMajaKk.mAjAkka) {
            synchronized (this.kamaJaK) {
                this.KAMaJaK((int)(bounds.width * this.KAMaJaK), (int)(bounds.height * this.kAMaJaK));
                monitorexit(this.kamaJaK);
            }
        }
        if (this.amAJaKk != null) {
            graphics.drawImage(this.amAJaKk, this.KaMaJaK, this.kaMaJaK, null);
            return;
        }
        graphics.setColor(new Color(0xFF000000 | this.AMAjaKk));
        graphics.fillRect(this.KaMaJaK, this.kaMaJaK, this.amajaKk.MajAKkA, this.amajaKk.majAKkA);
    }
    
    public void paint(final Graphics graphics) {
        this.AmajaKk.bounds();
        this.update(graphics);
    }
    
    public mmaakka() {
        this.AmaJAKk = true;
        this.amaJAKk = false;
        this.AMaJAKk = false;
        this.aMaJAKk = true;
        this.AmAjaKk = false;
        this.amAjaKk = 0;
        this.AMAjaKk = 16777215;
        this.aMAjaKk = false;
        this.AmajaKk = this;
        this.amajaKk = new kaajkkk(this);
        this.AMajaKk = new kajamma(this, this.amajaKk);
        this.AmAJaKk = new mmajmmk(true);
        this.AmaJaKk = 1000;
        this.KAMaJaK = 1.0;
        this.kAMaJaK = 1.0;
        this.kamaJaK = new Object();
    }
    
    static {
        mmaakka.KamaJaK = null;
    }
}
