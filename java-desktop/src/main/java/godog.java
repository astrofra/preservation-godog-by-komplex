import java.awt.image.ImageObserver;
import java.util.StringTokenizer;
import muhmu.hifi.device.Mixable;
import java.awt.Event;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.MediaTracker;
import java.awt.Font;
import java.awt.Component;
import java.awt.Graphics;
import java.util.Hashtable;
import java.awt.Container;
import muhmu.hifi.device.MAD;
import java.awt.Image;

// 
// Decompiled by Procyon v0.6.0
// 

public class godog extends DesktopDemoBase implements Runnable
{
    static final String[] kAMajAk;
    static final int KamajAk = 512;
    static final int kamajAk = 256;
    public static int KAmajAk;
    public static int kAmajAk;
    StartupTunerCanvas KaMAjAk;
    Image kaMAjAk;
    Image KAMAjAk;
    public static int kAMAjAk;
    public static int KamAjAk;
    public static boolean kamAjAk;
    public static int KAmAjAk;
    public static int kAmAjAk;
    public static boolean KkAmAjA;
    boolean kkAmAjA;
    boolean KKAmAjA;
    LegacyFullscreenWindow kKAmAjA;
    MAD KkamAjA;
    MixerBus kkamAjA;
    ModuleSong KKamAjA;
    ModuleSong kKamAjA;
    ModuleSong KkAMAjA;
    boolean kkAMAjA;
    public static RgbSurfacePresenter KKAMAjA;
    public static RgbSurface kKAMAjA;
    public static IndexedSurfacePresenter KkaMAjA;
    public static IndexedSurface kkaMAjA;
    boolean KKaMAjA;
    int kKaMAjA;
    int KkAmajA;
    String kkAmajA;
    Container KKAmajA;
    Hashtable kKAmajA;
    Hashtable KkamajA;
    int kkamajA;
    float KKamajA;
    float kKamajA;
    int KkAMajA;
    Hashtable kkAMajA;
    RgbSurface KKAMajA;
    RgbSurface kKAMajA;
    RgbSurface KkaMajA;
    int[] kkaMajA;
    int[] KKaMajA;
    int[] kKaMajA;
    public static boolean KkAmAJA;
    Graphics kkAmAJA;
    Graphics KKAmAJA;
    Component kKAmAJA;
    int KkamAJA;
    int kkamAJA;
    int KKamAJA;
    int kKamAJA;
    int KkAMAJA;
    int kkAMAJA;
    Font KKAMAJA;
    boolean kKAMAJA;
    public static godog KkaMAJA;
    Scene kkaMAJA;
    GraphicsRoutine KKaMAJA;
    int kKaMAJA;
    SmoothedFrameTimer KkAmaJA;
    float kkAmaJA;
    float KKAmaJA;
    float kKAmaJA;
    float KkamaJA;
    boolean kkamaJA;
    public String[] KKamaJA;
    
    public static void main(final String[] array) {
        GodogDesktop.main(array);
    }
    
    public void init() {
        godog.KkaMAJA = this;
        this.kaMAjAk = this.getImage(this.aMajAKK("images/loading.gif"));
        final MediaTracker mediaTracker = new MediaTracker(this);
        mediaTracker.addImage(this.kaMAjAk, 1);
        try {
            mediaTracker.waitForAll();
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
        this.setLayout(null);
        this.setBackground(Color.black);
        this.KKAmAjA = false;
        if (this.getParameter("nosound") != null) {
            this.KKAmAjA = true;
        }
        this.kkAmAjA = false;
        StartupTunerCanvas.AjAkkaM = true;
        this.requestFocus();
    }
    
    public void start() {
        super.start();
    }
    
    public void stop() {
        super.stop();
        if (this.kKAmAjA != null) this.kKAmAjA.dispose();
        if (this.KkamAjA != null) this.KkamAjA.stop();
        if (this.kkaMAJA != null) this.kkaMAJA.dispose();
        if (this.KKaMAJA != null) this.KKaMAJA.dispose();
    }
    
    public boolean keyDown(final Event event, final int n) {
        switch (event.key) {
            case 102: {
                this.kkamaJA = !this.kkamaJA;
                break;
            }
        }
        return true;
    }
    
    public boolean mouseMove(final Event event, final int kamAjAk, final int kamAjAk2) {
        godog.kAMAjAk = kamAjAk;
        godog.KamAjAk = kamAjAk2;
        godog.kamAjAk = false;
        return true;
    }
    
    public boolean mouseUp(final Event event, final int n, final int n2) {
        godog.kamAjAk = false;
        godog.kAMAjAk = n;
        godog.KamAjAk = n2;
        godog.KkAmAjA = true;
        godog.KAmAjAk = n;
        godog.kAmAjAk = n2;
        return true;
    }
    
    public boolean mouseDown(final Event event, final int kamAjAk, final int kamAjAk2) {
        godog.kamAjAk = true;
        godog.kAMAjAk = kamAjAk;
        godog.KamAjAk = kamAjAk2;
        return true;
    }
    
    void KaMAjAk() {
        MAD.component = this;
        this.KkamAjA = new muhmu.hifi.device.JavaSoundDevice();
        ((muhmu.hifi.device.JavaSoundDevice)this.KkamAjA).setFailureHandler(GodogDesktop::failed);
    }
    
    void kAMajAk() {
        // The browser-to-borderless-window transition now stays in one desktop window.
        this.KKAmajA = this.getParent();
    }
    
    void kAmAJAk() {
    }
    
    public void KAmajAk() {
        this.kkamAjA = new MixerBus();
        this.KkamAjA.init(this.kkamAjA, 22050, 4, 22050, MAD.component);
    }
    
    public void kamAJAk(final ModuleSong kkAMAjA, final int boost) {
        this.KkamAjA.boost = boost;
        this.KkAMAjA = null;
        (this.KkAMAjA = kkAMAjA).JakkAMa(this.kkamAjA);
        if (!this.kkAMAjA) {
            GodogDesktop.musicStarted();
            this.KkamAjA.start();
            this.kkAMAjA = true;
        }
    }
    
    public ModuleSong kamAjAk(final String s) {
        byte[] amaJAKK;
        try {
            amaJAKK = this.AmaJAKK(this.AMAjaKK(this.getDocumentBase(), s));
        }
        catch (final Exception ex) {
            ex.printStackTrace();
            return null;
        }
        if (amaJAKK == null) {
            return null;
        }
        final ModuleSong kkAmAjA = ModuleLoader.kKAmAjA(amaJAKK);
        System.gc();
        return kkAmAjA;
    }
    
    void kAmajAk() {
        int n = 1;
        int n2 = 1;
        if (this.kkAmAjA) {
            n = 2;
            n2 = 2;
        }
        final int n3 = 512;
        final int n4 = 256;
        (godog.KKAMAjA = new RgbSurfacePresenter()).KKaMaJa(this, n3, n4, n, n2);
        godog.kKAMAjA = godog.KKAMAjA.kamAJAk;
        (godog.KkaMAjA = new IndexedSurfacePresenter()).KKaMaJa(this, n3, n4, n, n2);
        godog.kkaMAjA = godog.KkaMAjA.KkaMaJa;
        godog.KAmajAk = godog.kKAMAjA.width;
        godog.kAmajAk = godog.kKAMAjA.height;
    }
    
    void kamajAk() {
        final Graphics kamAjAk = this.KamAjAk();
        final int n = 13;
        final long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < n; ++i) {
            godog.KKAMAjA.aKKaMaJ(kamAjAk, 0, 0);
        }
        System.out.println("slowness " + (System.currentTimeMillis() - currentTimeMillis) / (long)n);
    }
    
    void KAMAjAk() {
        if (this.KKaMAjA) {
            this.KKaMAjA = false;
            this.kamajAk();
        }
        if (this.kKaMAjA != -1) {
            if (this.KkAMAjA == null) {
                return;
            }
            if (!this.KkAMAjA.jaKKAMa(this.kKaMAjA, (int)this.KkAmaJA.getAverageFrameMillis())) {
                return;
            }
        }
        if (this.kkAmajA != null) {
            this.KAmAJAk(this.kkAmajA);
            this.kkAmajA = null;
        }
        while (!false && this.KkAmajA < this.KKamaJA.length) {
            final String s = this.KKamaJA[this.KkAmajA++];
            if (s.trim().length() == 0 || s.charAt(0) == '#') {
                break;
            }
            final String trim = s.trim();
            if (trim.charAt(0) == '_') {
                final int kKaMAjA = this.kKaMAjA;
                int n = 1;
                if (trim.charAt(1) == '_') {
                    n = 2;
                }
                final int index = trim.indexOf(32);
                if (index == -1) {
                    this.kKaMAjA = Integer.parseInt(trim.substring(n, trim.length()), 16);
                }
                else {
                    this.kKaMAjA = Integer.parseInt(trim.substring(n, index), 16);
                    this.kkAmajA = trim.substring(index + 1, trim.length());
                }
                if (n == 2) {
                    this.kKaMAjA += kKaMAjA;
                }
                return;
            }
            this.KAmAJAk(trim);
        }
    }
    
    void KAmAJAk(final String str) {
        final StringTokenizer stringTokenizer = new StringTokenizer(str);
        if (stringTokenizer.hasMoreTokens()) {
            final String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("init")) {
                this.kAMAjAk(stringTokenizer.nextToken());
                return;
            }
            if (nextToken.equals("show")) {
                this.kaMAJAk(stringTokenizer.nextToken());
                return;
            }
            if (nextToken.equals("msg")) {
                final String nextToken2 = stringTokenizer.nextToken();
                String string = "";
                while (stringTokenizer.hasMoreTokens()) {
                    string = String.valueOf(string) + stringTokenizer.nextToken() + " ";
                }
                this.KAMajAk(nextToken2, string.trim());
                return;
            }
            if (nextToken.equals("shutdown")) {
                this.kAMajAk();
                return;
            }
            if (nextToken.equals("post")) {
                this.KamAJAk(Integer.parseInt(stringTokenizer.nextToken()));
                return;
            }
            if (nextToken.startsWith("layer")) {
                RgbSurface kkaMajA;
                if (stringTokenizer.hasMoreTokens()) {
                    kkaMajA = (RgbSurface)this.kkAMajA.get(stringTokenizer.nextToken());
                }
                else {
                    kkaMajA = null;
                }
                final int[] kKaMajA = new int[5];
                if (stringTokenizer.hasMoreTokens()) {
                    kKaMajA[0] = Integer.parseInt(stringTokenizer.nextToken());
                }
                if (stringTokenizer.hasMoreTokens()) {
                    kKaMajA[1] = Integer.parseInt(stringTokenizer.nextToken());
                }
                if (stringTokenizer.hasMoreTokens()) {
                    kKaMajA[2] = Integer.parseInt(stringTokenizer.nextToken());
                }
                if (stringTokenizer.hasMoreTokens()) {
                    kKaMajA[3] = Integer.parseInt(stringTokenizer.nextToken());
                }
                if (stringTokenizer.hasMoreTokens()) {
                    kKaMajA[4] = Integer.parseInt(stringTokenizer.nextToken());
                }
                if (nextToken.equals("layer0")) {
                    this.KKAMajA = kkaMajA;
                    this.kkaMajA = kKaMajA;
                }
                if (nextToken.equals("layer1")) {
                    this.kKAMajA = kkaMajA;
                    this.KKaMajA = kKaMajA;
                }
                if (nextToken.equals("layer2")) {
                    this.KkaMajA = kkaMajA;
                    this.kKaMajA = kKaMajA;
                }
            }
            else {
                if (nextToken.equals("mod")) {
                    this.kamAJAk(this.KKamAjA, 96);
                    return;
                }
                if (nextToken.equals("go")) {
                    this.KkAMAjA.MaJAkKa.seekOrder(Integer.parseInt(stringTokenizer.nextToken()));
                    return;
                }
                if (nextToken.equals("filmbox")) {
                    this.KKaMAJA = null;
                    this.kkaMAJA = null;
                    return;
                }
                if (nextToken.equals("clear24")) {
                    final int int1 = Integer.parseInt(stringTokenizer.nextToken(), 16);
                    godog.KKAMAjA.kAmaJAk(int1);
                    godog.KKAMAjA.kamAJAk.aMaJAkk();
                    godog.KKAMAjA.kAmaJAk(int1);
                    return;
                }
                if (nextToken.equals("clear8")) {
                    Integer.parseInt(stringTokenizer.nextToken(), 16);
                    godog.KkaMAjA.akKaMaJ();
                    return;
                }
                if (nextToken.equals("kill")) {
                    this.KaMajAk(stringTokenizer.nextToken());
                    return;
                }
                if (nextToken.equals("killmod")) {
                    if (Integer.parseInt(stringTokenizer.nextToken()) == 1) {
                        this.KKamAjA = null;
                    }
                }
                else {
                    if (nextToken.equals("reality")) {
                        return; // Same desktop surface remains visible for the end screen.
                    }
                    if (nextToken.equals("loaded")) {
                        this.kKAMAJA = false;
                        this.repaint(0L);
                    }
                }
            }
        }
    }
    
    void kAMAjAk(final String str) {
        System.out.print(String.valueOf(this.kkamajA++));
        final Scene kmjjmma = (Scene)this.kKAmajA.get(str);
        if (kmjjmma != null) {
            kmjjmma.load(this);
            System.runFinalization();
            System.gc();
            return;
        }
        final GraphicsRoutine kajakka = (GraphicsRoutine)this.KkamajA.get(str);
        if (kajakka != null) {
            kajakka.load(this);
            System.runFinalization();
            System.gc();
            return;
        }
        System.out.println("muhmuscript error: no such routine " + str);
    }
    
    void KAMajAk(final String str, final String s) {
        final Scene kmjjmma = (Scene)this.kKAmajA.get(str);
        if (kmjjmma != null) {
            kmjjmma.handleMessage(s, this.KKAmaJA - this.KkamaJA);
            return;
        }
        final GraphicsRoutine kajakka = (GraphicsRoutine)this.KkamajA.get(str);
        if (kajakka != null) {
            kajakka.handleMessage(s, this.KKAmaJA - this.KkamaJA);
            return;
        }
        System.out.println("muhmuscript error: no such routine " + str);
    }
    
    void kaMAJAk(final String str) {
        GodogDesktop.sceneStarted(str);
        this.KkAmaJA.resetWithFrameDuration(80L);
        this.KKAmaJA = this.KkAmaJA.getElapsedMillis() / 1000.0f;
        this.kKAmaJA = this.KKAmaJA - 0.08f;
        this.KkamaJA = this.KKAmaJA;
        final Scene kkaMAJA = (Scene)this.kKAmajA.get(str);
        if (kkaMAJA != null) {
            kkaMAJA.enter();
            this.kkaMAJA = kkaMAJA;
            this.KKaMAJA = null;
            return;
        }
        final GraphicsRoutine kKaMAJA = (GraphicsRoutine)this.KkamajA.get(str);
        if (kKaMAJA != null) {
            kKaMAJA.enter();
            this.kkaMAJA = null;
            this.KKaMAJA = kKaMAJA;
            return;
        }
        System.out.println("muhmuscript error: no such routine " + str);
    }
    
    void KaMajAk(final String str) {
        final Scene kmjjmma = (Scene)this.kKAmajA.get(str);
        if (kmjjmma != null) {
            kmjjmma.dispose();
            this.kKAmajA.remove(str);
            System.runFinalization();
            System.gc();
            return;
        }
        final GraphicsRoutine kajakka = (GraphicsRoutine)this.KkamajA.get(str);
        if (kajakka != null) {
            kajakka.dispose();
            this.KkamajA.remove(str);
            System.runFinalization();
            System.gc();
            return;
        }
        System.out.println("muhmuscript error: no such routine " + str);
    }
    
    void KamAJAk(final int kkAMajA) {
        this.kKamajA = 0.0f;
        this.KkAMajA = kkAMajA;
        this.KKamajA = this.KKAmaJA;
    }
    
    void kaMAjAk(final Scene value) {
        this.kKAmajA.put(value.getSceneId(), value);
    }
    
    void KamajAk(final GraphicsRoutine value) {
        this.KkamajA.put(value.getRoutineId(), value);
    }
    
    public void kAMAJAk() {
        this.KamajAk(new EndscreenRoutine());
        this.kaMAjAk(new VehjeScene());
        this.kaMAjAk(new LinjanenScene());
        this.kaMAjAk(new EvilScene());
        this.kaMAjAk(new MovieIntroScene());
        this.kaMAjAk(new TravScene());
        this.kaMAjAk(new PaaScene());
        this.kkAMajA = new Hashtable();
        for (int i = 0; i < godog.kAMajAk.length; ++i) {
            this.kkAMajA.put(godog.kAMajAk[i].substring(7, godog.kAMajAk[i].indexOf(46)), ImageMathSupport.MAjaKkA(this.aMajAKK(godog.kAMajAk[i])));
        }
    }
    
    public void run() {
        this.KaMAjAk();
        System.gc();
        System.runFinalization();
        this.kAmajAk();
        this.kAMAJAk();
        this.kAmAJAk();
        this.KAmajAk();
        this.KKamAjA = this.kamAjAk("data/rocket.xm");
        this.kaMajAk();
        this.kaMajAk();
        this.KkAmaJA = new SmoothedFrameTimer(10, 60);
        this.KAMAJAk(this, 0, 0, 512, 256);
        try {
            while (super.aMaJakK == Thread.currentThread()) {
                if (super.AMaJakK) { Thread.sleep(20); continue; }
                if (!godog.KkAmAJA) {
                    godog.KkAmAJA = true;
                    if (this.kkAmAJA != null) this.kkAmAJA.dispose();
                    this.kkAmAJA = this.KamAjAk();
                }
                this.KAMAjAk();
                final Graphics kkAmAJA = this.kkAmAJA;
                if (this.kkamaJA) {
                    this.KAmAjAk(kkAmAJA);
                }
                this.KKAmaJA = this.KkAmaJA.getElapsedMillis() / 1000.0f;
                this.kkAmaJA = this.KKAmaJA - this.kKAmaJA;
                if (this.kkaMAJA != null) {
                    this.kkaMAJA.render(godog.kKAMAjA, this.KKAmaJA - this.KkamaJA, this.kkAmaJA);
                    if (this.KKAMajA != null) {
                        int i = -(int)(this.kkaMajA[0] * Math.random() + this.kkaMajA[2]);
                        int j = -(int)(this.kkaMajA[1] * Math.random() + this.kkaMajA[3]);
                        if (this.kkaMajA[4] > 0) {
                            while (j < 256) {
                                while (i < 512) {
                                    godog.kKAMAjA.AMAJakk(this.KKAMajA, i, j);
                                    i += this.KKAMajA.width;
                                }
                                j += this.KKAMajA.height;
                            }
                        }
                        else {
                            godog.kKAMAjA.AMAJakk(this.KKAMajA, i, j);
                        }
                    }
                    if (this.kKAMajA != null) {
                        int k = -(int)(this.KKaMajA[0] * Math.random() + this.KKaMajA[2]);
                        int l = -(int)(this.KKaMajA[1] * Math.random() + this.KKaMajA[3]);
                        if (this.KKaMajA[4] > 0) {
                            while (l < 256) {
                                while (k < 512) {
                                    godog.kKAMAjA.amAJAkk(this.kKAMajA, k, l);
                                    k += this.kKAMajA.width;
                                }
                                l += this.kKAMajA.height;
                            }
                        }
                        else {
                            godog.kKAMAjA.amAJAkk(this.kKAMajA, k, l);
                        }
                    }
                    if (this.KkaMajA != null) {
                        int n = -(int)(this.kKaMajA[0] * Math.random() + this.kKaMajA[2]);
                        int n2 = -(int)(this.kKaMajA[1] * Math.random() + this.kKaMajA[3]);
                        if (this.kKaMajA[4] > 0) {
                            while (n2 < 256) {
                                while (n < 512) {
                                    godog.kKAMAjA.AMAJakk(this.KkaMajA, n, n2);
                                    n += this.KkaMajA.width;
                                }
                                n2 += this.KkaMajA.height;
                            }
                        }
                        else {
                            godog.kKAMAjA.AMAJakk(this.KkaMajA, n, n2);
                        }
                    }
                    switch (this.KkAMajA) {
                        case 1: {
                            godog.kKAMAjA.AmAjakk(RgbSurface.AMaJakk(255, 255, 255));
                            break;
                        }
                        case 2: {
                            godog.kKAMAjA.amAJakk(Math.max(0.0f, 0.93f - (this.KKAmaJA - this.KKamajA) * 2.0f));
                            break;
                        }
                    }
                    godog.KKAMAjA.aKKaMaJ(kkAmAJA, 0, 0);
                }
                if (this.KKaMAJA != null && kkAmAJA != null) {
                    this.KKaMAJA.render(kkAmAJA, this.KKAmaJA - this.KkamaJA, this.kkAmaJA);
                }
                this.kKAmaJA = this.KKAmaJA;
                this.KkAmaJA.recordFrame();
                ++this.kKaMAJA;
                this.publishFrame();
                Thread.sleep(5L);
            }
        }
        catch (final Exception ex) {
            if (super.aMaJakK == Thread.currentThread()) GodogDesktop.failed(ex);
        }
    }
    
    void KAmAjAk(final Graphics graphics) {
        final int n = 2;
        final int n2 = 12;
        final String value = String.valueOf((int)this.KkAmaJA.getAverageFrameMillis());
        graphics.setColor(Color.black);
        graphics.drawString(value, n + 1, n2);
        graphics.drawString(value, n - 1, n2);
        graphics.drawString(value, n, n2 + 1);
        graphics.drawString(value, n, n2 - 1);
        graphics.setColor(Color.white);
        graphics.drawString(value, n, n2);
    }
    
    void KAMAJAk(final Component kkAmAJA, final int kkamAJA, final int kkamAJA2, final int kKamAJA, final int kKamAJA2) {
        this.kKAmAJA = kkAmAJA;
        this.KkamAJA = kkamAJA;
        this.kkamAJA = kkamAJA2;
        this.KKamAJA = kKamAJA;
        this.kKamAJA = kKamAJA2;
        godog.KkAmAJA = false;
    }
    
    Graphics KamAjAk() {
        return this.kKAmAJA.getGraphics().create(this.KkamAJA, this.kkamAJA, this.KKamAJA, this.kKamAJA);
    }
    
    public void paint(final Graphics graphics) {
        if (!this.kKAMAJA) { super.paint(graphics); return; }
        if (this.kKAMAJA) {
            final int n = this.getFontMetrics(this.KKAMAJA).stringWidth("komplex@jyu.fi") + 14;
            final int n2 = 20;
            final int n3 = (512 - n) / 2;
            final int n4 = (256 - n2) / 2;
            graphics.setFont(this.KKAMAJA);
            graphics.setColor(Color.black);
            graphics.fillRect(n3, n4, n, n2);
            graphics.setColor(Color.white);
            graphics.drawImage(this.kaMAjAk, 226, 118, null);
        }
    }
    
    public void kaMajAk() {
        ++this.KkAMAJA;
        Graphics loadingGraphics = this.getGraphics();
        this.paint(loadingGraphics);
        loadingGraphics.dispose();
        this.publishFrame();
    }
    
    public godog() {
        this.kkAMAjA = false;
        this.kKaMAjA = -1;
        this.kKAmajA = new Hashtable();
        this.KkamajA = new Hashtable();
        this.kkaMajA = new int[5];
        this.KKaMajA = new int[5];
        this.kKaMajA = new int[5];
        this.kkAMAJA = 31;
        this.KKAMAJA = new Font("Courier", 1, 15);
        this.kKAMAJA = true;
        this.KKamaJA = new String[] { "init movieintro", "init paa", "init trav", "init linjanen", "init evil", "init vehje", "init endscreen", "loaded", "shutdown", "mod 1", "_000 clear24 ffffff", "layer0 filmdamage 0 1536 0 0 1", "show movieintro", "_300 layer0 filmdamage 264 1536 0 0 1", "_500 layer0 filmdamage 64 1536 0 0 1", "_700", "show paa", "layer0 megaruno 512 190 0 0 1", "layer1 filmdamage 0 1280 0 0 1", "_800 layer0 megaruno 512 190 0 0 0", "layer2 godog1 0 0 -213 -190 ", "_80d layer1 maska2 200 200 0 0 1", "_810 layer1 maska7 0 0 0 0 0", "_814 layer0 maska9 0 0 0 0 0", "_817 layer0 megaruno 512 190 0 0 0", "_81d layer1 maska8 200 200 0 0 1", "_820 layer1 maska9 0 0 0 0 0", "_82d layer1 maska10 200 200 0 0 1", "_830 layer1 maska11 0 0 0 0 0", "_83d layer1 maska13 200 200 0 0 1", "_420 layer1 megaruno 90 20 40 -43 0", "__4 layer1 maska12 10 70 -70 -75 0", "__4 layer1 maska13 80 10 -100 -15 0", "__4 layer1 filmdamage 0 1280 0 0 1", "_730", "layer0 megaruno 8 8 407 200 1", "__4 layer0 filmdamage 0 1280 0 0 1", "__4 layer1 megaruno 8 8 400 200 1", "__4 layer0", "_800", "layer0", "layer1", "layer0 maska12 10 10 40 -5 0", "__10", "layer0 maska12 10 10 -10 -55 0", "__4", "layer0 maska15 10 10 -10 -15 0", "__4", "layer1 maska12 10 10 -55 -105 0", "__4 layer1", "layer0 megaruno 8 8 400 200 1", "_820 layer0 maska16 10 10 -10 -5 0", "_822 layer0 maska2 10 10 -10 -5 0", "_824 layer0 maska9 10 10 -10 -5 0", "_828 layer0 maska12 10 10 -10 -5 0", "_830 layer0 maska16 10 10 -10 -5 0", "layer0", "_824", "layer1 maska7 10 0 -10 0 0", "layer0", "__2 layer1 maska10 0 0 0 0 0", "__4 layer0 maska11 0 0 0 0", "__4 layer0 maska12 0 0 0 0", "__4 layer0 maska13 20 20 0 0 1", "__4 layer0 maska12 0 0 0 0", "_10 layer0 maska12 0 0 0 0", "__4 layer0 maska12 0 0 0 0", "__2 layer0 maska7 4 0 40 0 1", "__4 layer0 maska15 0 0 0 0", "__4 layer0 maska14 0 0 0 0", "__4 layer0 maska13 0 0 0 0", "_a00", "layer0 filmdamage 0 1280 0 0 1", "layer1 ", "layer2 ", "_a20 layer0 filmdamage 512 10 0 0 1", "_a30 layer2 megaruno 50 10 200 200", "_0b00", "layer0", "layer2", "clear24 ffffff", "show trav", "__10", "layer2 godog2 0 0 -220 -188", "_c10", "layer0 maska12 0 0", "__2 layer1 maska7 32 0", "__2 layer1 maska9 16 16", "layer0", "__4 layer1 maska16 512 256 -256 -128 1", "__4 layer1", "_b00 layer0 maska12 32 8", "layer2", "__10", "layer2 godog3 0 0 -230 -40", "__4 layer1 maska15 512 256 -256 -128 1", "__4 layer1 megaruno 512 256 -256 -128 1", "__4 layer1 maska11 512 256 -256 -128 1", "__4 layer1", "_d30 layer0", "__4 layer1 maska8 512 256 -256 -128 1", "__4 layer1 megaruno 512 256 -256 -128 1", "__4 layer1 maska7 512 256 -256 -128 1", "__4 layer1", "layer0", "_e00 show vehje", "layer2 godog4 0 0 -18 -18", "layer1 maska10 8 8 12 12", "_e04 layer0 maska9 0 0 30 30", "__02 layer0", "_e0c layer0 maska7 4 4 30 30", "__02 layer0", "_e10 layer1 maska13 64 32 0 0", "_e14 layer0 maska8 4 4 30 30", "__02 layer0", "_e17 layer0 maska8 4 4 30 30", "__02 layer0", "_e1c layer0 maska8 4 4 30 30", "_e1d layer1", "__02 layer0", "_e20 layer1 maska13 64 32 0 0", "_e2d layer1", "_e30 layer1 maska13 64 32 0 0", "_e37 layer0 maska8 4 4 30 30", "__02 layer0", "_e3c layer0 maska2 104 104 30 30", "__02 layer0", "_e3d layer1", "_f00", "layer0", "show evil", "layer2", "__10", "layer2 godog5 0 0 -20 -177", "_1000 layer1 maska9 32 32 0 0 1", "_1004 layer0 maska12 16 256 0 0 1", "__4 layer0", "layer1", "_100c layer0 maska11 32 32 0 0 1", "__4 layer0", "_1014 layer0 maska8 32 32 0 0 1", "_1017 layer1 maska16 32 32 0 0 1", "__4 layer0", "_101c layer0 maska15 32 32 0 0 1", "_1020 layer1 maska10 22 56 0 0 1", "__4 layer1", "_102c layer0 maska11 32 32 0 0 1", "_1030 layer1 megaruno 52 56 0 0 1", "__4 layer1", "_1100 layer0 maska10 32 8 -0 -120 1", "_1120 layer0 maska13 8 8 -240 -120 1", "__4 layer0", "_1200 layer0 maska11 8 8 -240 -120 1", "_1220 layer0", "_1300", "show linjanen", "layer1", "layer2", "__10", "layer2 godog6 0 0 -143 -140", "msg linjanen spc3", "__4 msg linjanen flash", "msg linjanen spc0", "_1220 msg linjanen flash", "msg linjanen spc2", "__4 msg linjanen flash", "msg linjanen spc0", "_1300 msg linjanen flash", "_1320 msg linjanen flash", "_1400", "_1620 layer2", "reality", "show endscreen", "_22222" };
    }
    
    static {
        kAMajAk = new String[] { "images/filmdamage.jpg", "images/maska2.jpg", "images/maska7.jpg", "images/maska8.jpg", "images/maska9.jpg", "images/maska10.jpg", "images/maska11.jpg", "images/maska12.jpg", "images/maska13.jpg", "images/maska15.jpg", "images/maska16.jpg", "images/megaruno.jpg", "images/godog1.jpg", "images/godog2.jpg", "images/godog3.jpg", "images/godog4.jpg", "images/godog5.jpg", "images/godog6.jpg" };
    }
}
