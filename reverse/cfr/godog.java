/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Event;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.net.URL;
import java.util.Hashtable;
import java.util.StringTokenizer;
import muhmu.hifi.device.MAD;

public class godog
extends kmaamma
implements Runnable {
    static final String[] kAMajAk = new String[]{"images/filmdamage.jpg", "images/maska2.jpg", "images/maska7.jpg", "images/maska8.jpg", "images/maska9.jpg", "images/maska10.jpg", "images/maska11.jpg", "images/maska12.jpg", "images/maska13.jpg", "images/maska15.jpg", "images/maska16.jpg", "images/megaruno.jpg", "images/godog1.jpg", "images/godog2.jpg", "images/godog3.jpg", "images/godog4.jpg", "images/godog5.jpg", "images/godog6.jpg"};
    static final int KamajAk = 512;
    static final int kamajAk = 256;
    public static int KAmajAk;
    public static int kAmajAk;
    majammk KaMAjAk;
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
    majamka kKAmAjA;
    MAD KkamAjA;
    mmajmma kkamAjA;
    maaakkk KKamAjA;
    maaakkk kKamAjA;
    maaakkk KkAMAjA;
    boolean kkAMAjA = false;
    public static kmjamka KKAMAjA;
    public static mmajkka kKAMAjA;
    public static kajjkmk KkaMAjA;
    public static maaakka kkaMAjA;
    boolean KKaMAjA;
    int kKaMAjA = -1;
    int KkAmajA;
    String kkAmajA;
    Container KKAmajA;
    Hashtable kKAmajA = new Hashtable();
    Hashtable KkamajA = new Hashtable();
    int kkamajA;
    float KKamajA;
    float kKamajA;
    int KkAMajA;
    Hashtable kkAMajA;
    mmajkka KKAMajA;
    mmajkka kKAMajA;
    mmajkka KkaMajA;
    int[] kkaMajA = new int[5];
    int[] KKaMajA = new int[5];
    int[] kKaMajA = new int[5];
    public static boolean KkAmAJA;
    Graphics kkAmAJA;
    Graphics KKAmAJA;
    Component kKAmAJA;
    int KkamAJA;
    int kkamAJA;
    int KKamAJA;
    int kKamAJA;
    int KkAMAJA;
    int kkAMAJA = 31;
    Font KKAMAJA = new Font("Courier", 1, 15);
    boolean kKAMAJA = true;
    public static godog KkaMAJA;
    kmjjmma kkaMAJA;
    kajakka KKaMAJA;
    int kKaMAJA;
    maajmka KkAmaJA;
    float kkAmaJA;
    float KKAmaJA;
    float kKAmaJA;
    float KkamaJA;
    boolean kkamaJA;
    public String[] KKamaJA = new String[]{"init movieintro", "init paa", "init trav", "init linjanen", "init evil", "init vehje", "init endscreen", "loaded", "shutdown", "mod 1", "_000 clear24 ffffff", "layer0 filmdamage 0 1536 0 0 1", "show movieintro", "_300 layer0 filmdamage 264 1536 0 0 1", "_500 layer0 filmdamage 64 1536 0 0 1", "_700", "show paa", "layer0 megaruno 512 190 0 0 1", "layer1 filmdamage 0 1280 0 0 1", "_800 layer0 megaruno 512 190 0 0 0", "layer2 godog1 0 0 -213 -190 ", "_80d layer1 maska2 200 200 0 0 1", "_810 layer1 maska7 0 0 0 0 0", "_814 layer0 maska9 0 0 0 0 0", "_817 layer0 megaruno 512 190 0 0 0", "_81d layer1 maska8 200 200 0 0 1", "_820 layer1 maska9 0 0 0 0 0", "_82d layer1 maska10 200 200 0 0 1", "_830 layer1 maska11 0 0 0 0 0", "_83d layer1 maska13 200 200 0 0 1", "_420 layer1 megaruno 90 20 40 -43 0", "__4 layer1 maska12 10 70 -70 -75 0", "__4 layer1 maska13 80 10 -100 -15 0", "__4 layer1 filmdamage 0 1280 0 0 1", "_730", "layer0 megaruno 8 8 407 200 1", "__4 layer0 filmdamage 0 1280 0 0 1", "__4 layer1 megaruno 8 8 400 200 1", "__4 layer0", "_800", "layer0", "layer1", "layer0 maska12 10 10 40 -5 0", "__10", "layer0 maska12 10 10 -10 -55 0", "__4", "layer0 maska15 10 10 -10 -15 0", "__4", "layer1 maska12 10 10 -55 -105 0", "__4 layer1", "layer0 megaruno 8 8 400 200 1", "_820 layer0 maska16 10 10 -10 -5 0", "_822 layer0 maska2 10 10 -10 -5 0", "_824 layer0 maska9 10 10 -10 -5 0", "_828 layer0 maska12 10 10 -10 -5 0", "_830 layer0 maska16 10 10 -10 -5 0", "layer0", "_824", "layer1 maska7 10 0 -10 0 0", "layer0", "__2 layer1 maska10 0 0 0 0 0", "__4 layer0 maska11 0 0 0 0", "__4 layer0 maska12 0 0 0 0", "__4 layer0 maska13 20 20 0 0 1", "__4 layer0 maska12 0 0 0 0", "_10 layer0 maska12 0 0 0 0", "__4 layer0 maska12 0 0 0 0", "__2 layer0 maska7 4 0 40 0 1", "__4 layer0 maska15 0 0 0 0", "__4 layer0 maska14 0 0 0 0", "__4 layer0 maska13 0 0 0 0", "_a00", "layer0 filmdamage 0 1280 0 0 1", "layer1 ", "layer2 ", "_a20 layer0 filmdamage 512 10 0 0 1", "_a30 layer2 megaruno 50 10 200 200", "_0b00", "layer0", "layer2", "clear24 ffffff", "show trav", "__10", "layer2 godog2 0 0 -220 -188", "_c10", "layer0 maska12 0 0", "__2 layer1 maska7 32 0", "__2 layer1 maska9 16 16", "layer0", "__4 layer1 maska16 512 256 -256 -128 1", "__4 layer1", "_b00 layer0 maska12 32 8", "layer2", "__10", "layer2 godog3 0 0 -230 -40", "__4 layer1 maska15 512 256 -256 -128 1", "__4 layer1 megaruno 512 256 -256 -128 1", "__4 layer1 maska11 512 256 -256 -128 1", "__4 layer1", "_d30 layer0", "__4 layer1 maska8 512 256 -256 -128 1", "__4 layer1 megaruno 512 256 -256 -128 1", "__4 layer1 maska7 512 256 -256 -128 1", "__4 layer1", "layer0", "_e00 show vehje", "layer2 godog4 0 0 -18 -18", "layer1 maska10 8 8 12 12", "_e04 layer0 maska9 0 0 30 30", "__02 layer0", "_e0c layer0 maska7 4 4 30 30", "__02 layer0", "_e10 layer1 maska13 64 32 0 0", "_e14 layer0 maska8 4 4 30 30", "__02 layer0", "_e17 layer0 maska8 4 4 30 30", "__02 layer0", "_e1c layer0 maska8 4 4 30 30", "_e1d layer1", "__02 layer0", "_e20 layer1 maska13 64 32 0 0", "_e2d layer1", "_e30 layer1 maska13 64 32 0 0", "_e37 layer0 maska8 4 4 30 30", "__02 layer0", "_e3c layer0 maska2 104 104 30 30", "__02 layer0", "_e3d layer1", "_f00", "layer0", "show evil", "layer2", "__10", "layer2 godog5 0 0 -20 -177", "_1000 layer1 maska9 32 32 0 0 1", "_1004 layer0 maska12 16 256 0 0 1", "__4 layer0", "layer1", "_100c layer0 maska11 32 32 0 0 1", "__4 layer0", "_1014 layer0 maska8 32 32 0 0 1", "_1017 layer1 maska16 32 32 0 0 1", "__4 layer0", "_101c layer0 maska15 32 32 0 0 1", "_1020 layer1 maska10 22 56 0 0 1", "__4 layer1", "_102c layer0 maska11 32 32 0 0 1", "_1030 layer1 megaruno 52 56 0 0 1", "__4 layer1", "_1100 layer0 maska10 32 8 -0 -120 1", "_1120 layer0 maska13 8 8 -240 -120 1", "__4 layer0", "_1200 layer0 maska11 8 8 -240 -120 1", "_1220 layer0", "_1300", "show linjanen", "layer1", "layer2", "__10", "layer2 godog6 0 0 -143 -140", "msg linjanen spc3", "__4 msg linjanen flash", "msg linjanen spc0", "_1220 msg linjanen flash", "msg linjanen spc2", "__4 msg linjanen flash", "msg linjanen spc0", "_1300 msg linjanen flash", "_1320 msg linjanen flash", "_1400", "_1620 layer2", "reality", "show endscreen", "_22222"};

    public static void main(String[] stringArray) {
        new godog().amaJAKK(stringArray, 512, 256);
    }

    public void init() {
        KkaMAJA = this;
        this.kaMAjAk = this.getImage(this.aMajAKK("images/loading.gif"));
        MediaTracker mediaTracker = new MediaTracker(this);
        mediaTracker.addImage(this.kaMAjAk, 1);
        try {
            mediaTracker.waitForAll();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.setLayout(null);
        this.setBackground(Color.black);
        this.KKAmAjA = false;
        if (this.getParameter("nosound") != null) {
            this.KKAmAjA = true;
        }
        this.kkAmAjA = false;
        majammk.AjAkkaM = true;
        this.requestFocus();
    }

    public void start() {
        super.start();
    }

    public void stop() {
        super.stop();
        if (this.kKAmAjA != null) {
            this.kKAmAjA.dispose();
            this.kKAmAjA = null;
        }
        this.KkamAjA.stop();
        this.KkamAjA = null;
        this.kkamAjA = null;
    }

    public boolean keyDown(Event event, int n) {
        switch (event.key) {
            case 102: {
                this.kkamaJA = !this.kkamaJA;
                break;
            }
        }
        return true;
    }

    public boolean mouseMove(Event event, int n, int n2) {
        kAMAjAk = n;
        KamAjAk = n2;
        kamAjAk = false;
        return true;
    }

    public boolean mouseUp(Event event, int n, int n2) {
        kamAjAk = false;
        kAMAjAk = n;
        KamAjAk = n2;
        KkAmAjA = true;
        KAmAjAk = n;
        kAmAjAk = n2;
        return true;
    }

    public boolean mouseDown(Event event, int n, int n2) {
        kamAjAk = true;
        kAMAjAk = n;
        KamAjAk = n2;
        return true;
    }

    void KaMAjAk() {
        MAD.component = this;
        this.KaMAjAk = new majammk(this.kkAmAjA, this.KKAmAjA);
        this.KaMAjAk.reshape(0, 0, 512, 256);
        this.KaMAjAk.show();
        this.add(this.KaMAjAk);
        this.KaMAjAk.AkkAMAJ();
        this.KaMAjAk.aKkAMAJ();
        this.remove(this.KaMAjAk);
        this.KkamAjA = this.KaMAjAk.AjakkaM;
        this.KaMAjAk = null;
        System.gc();
        System.out.println("tuner finito.");
    }

    void kAMajAk() {
        this.KKAmajA = this.getParent();
        this.kKAmAjA = new majamka("Komplex' Rocket");
        this.kKAmAjA.KkAmAjA(this);
        this.kKAmAjA.show();
    }

    void kAmAJAk() {
    }

    public void KAmajAk() {
        this.kkamAjA = new mmajmma();
        this.KkamAjA.init(this.kkamAjA, 22050, 4, 22050, MAD.component);
    }

    public void kamAJAk(maaakkk maaakkk2, int n) {
        this.KkamAjA.boost = n;
        this.KkAMAjA = null;
        this.KkAMAjA = maaakkk2;
        this.KkAMAjA.JakkAMa(this.kkamAjA);
        if (!this.kkAMAjA) {
            this.KkamAjA.start();
            this.kkAMAjA = true;
        }
    }

    public maaakkk kamAjAk(String string) {
        Object object;
        byte[] byArray = null;
        try {
            object = this.AMAjaKK(this.getDocumentBase(), string);
            byArray = this.AmaJAKK((URL)object);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
        if (byArray == null) {
            return null;
        }
        object = kajamka.kKAmAjA(byArray);
        byArray = null;
        System.gc();
        return object;
    }

    void kAmajAk() {
        int n = 1;
        int n2 = 1;
        if (this.kkAmAjA) {
            n = 2;
            n2 = 2;
        }
        int n3 = 512;
        int n4 = 256;
        KKAMAjA = new kmjamka();
        KKAMAjA.KKaMaJa(this, n3, n4, n, n2);
        kKAMAjA = godog.KKAMAjA.kamAJAk;
        KkaMAjA = new kajjkmk();
        KkaMAjA.KKaMaJa(this, n3, n4, n, n2);
        kkaMAjA = godog.KkaMAjA.KkaMaJa;
        KAmajAk = godog.kKAMAjA.kAMAJaK;
        kAmajAk = godog.kKAMAjA.KamAJaK;
    }

    void kamajAk() {
        Graphics graphics = this.KamAjAk();
        int n = 13;
        long l = System.currentTimeMillis();
        int n2 = 0;
        while (n2 < n) {
            KKAMAjA.aKKaMaJ(graphics, 0, 0);
            ++n2;
        }
        long l2 = System.currentTimeMillis();
        System.out.println("slowness " + (l2 - l) / (long)n);
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
            if (!this.KkAMAjA.jaKKAMa(this.kKaMAjA, (int)this.KkAmaJA.kAMAjak())) {
                return;
            }
        }
        if (this.kkAmajA != null) {
            this.KAmAJAk(this.kkAmajA);
            this.kkAmajA = null;
        }
        boolean bl = false;
        while (!bl && this.KkAmajA < this.KKamaJA.length) {
            String string;
            if ((string = this.KKamaJA[this.KkAmajA++]).trim().length() == 0 || string.charAt(0) == '#') break;
            char c = (string = string.trim()).charAt(0);
            if (c == '_') {
                int n;
                int n2 = this.kKaMAjA;
                int n3 = 1;
                if (string.charAt(1) == '_') {
                    n3 = 2;
                }
                if ((n = string.indexOf(32)) == -1) {
                    this.kKaMAjA = Integer.parseInt(string.substring(n3, string.length()), 16);
                } else {
                    this.kKaMAjA = Integer.parseInt(string.substring(n3, n), 16);
                    this.kkAmajA = string.substring(n + 1, string.length());
                }
                if (n3 == 2) {
                    this.kKaMAjA = n2 + this.kKaMAjA;
                }
                bl = true;
                return;
            }
            this.KAmAJAk(string);
        }
    }

    void KAmAJAk(String string) {
        StringTokenizer stringTokenizer = new StringTokenizer(string);
        if (stringTokenizer.hasMoreTokens()) {
            String string2 = stringTokenizer.nextToken();
            if (string2.equals("init")) {
                this.kAMAjAk(stringTokenizer.nextToken());
                return;
            }
            if (string2.equals("show")) {
                this.kaMAJAk(stringTokenizer.nextToken());
                return;
            }
            if (string2.equals("msg")) {
                String string3 = stringTokenizer.nextToken();
                String string4 = "";
                while (stringTokenizer.hasMoreTokens()) {
                    string4 = String.valueOf(string4) + stringTokenizer.nextToken() + " ";
                }
                string4 = string4.trim();
                this.KAMajAk(string3, string4);
                return;
            }
            if (string2.equals("shutdown")) {
                this.kAMajAk();
                return;
            }
            if (string2.equals("post")) {
                this.KamAJAk(Integer.parseInt(stringTokenizer.nextToken()));
                return;
            }
            if (string2.startsWith("layer")) {
                mmajkka mmajkka2 = stringTokenizer.hasMoreTokens() ? (mmajkka)this.kkAMajA.get(stringTokenizer.nextToken()) : null;
                int[] nArray = new int[5];
                if (stringTokenizer.hasMoreTokens()) {
                    nArray[0] = Integer.parseInt(stringTokenizer.nextToken());
                }
                if (stringTokenizer.hasMoreTokens()) {
                    nArray[1] = Integer.parseInt(stringTokenizer.nextToken());
                }
                if (stringTokenizer.hasMoreTokens()) {
                    nArray[2] = Integer.parseInt(stringTokenizer.nextToken());
                }
                if (stringTokenizer.hasMoreTokens()) {
                    nArray[3] = Integer.parseInt(stringTokenizer.nextToken());
                }
                if (stringTokenizer.hasMoreTokens()) {
                    nArray[4] = Integer.parseInt(stringTokenizer.nextToken());
                }
                if (string2.equals("layer0")) {
                    this.KKAMajA = mmajkka2;
                    this.kkaMajA = nArray;
                }
                if (string2.equals("layer1")) {
                    this.kKAMajA = mmajkka2;
                    this.KKaMajA = nArray;
                }
                if (string2.equals("layer2")) {
                    this.KkaMajA = mmajkka2;
                    this.kKaMajA = nArray;
                    return;
                }
            } else {
                if (string2.equals("mod")) {
                    this.kamAJAk(this.KKamAjA, 96);
                    return;
                }
                if (string2.equals("go")) {
                    int n = Integer.parseInt(stringTokenizer.nextToken());
                    this.KkAMAjA.MaJAkKa.JaKKama(n);
                    return;
                }
                if (string2.equals("filmbox")) {
                    this.KKaMAJA = null;
                    this.kkaMAJA = null;
                    return;
                }
                if (string2.equals("clear24")) {
                    int n = Integer.parseInt(stringTokenizer.nextToken(), 16);
                    KKAMAjA.kAmaJAk(n);
                    godog.KKAMAjA.kamAJAk.aMaJAkk();
                    KKAMAjA.kAmaJAk(n);
                    return;
                }
                if (string2.equals("clear8")) {
                    Integer.parseInt(stringTokenizer.nextToken(), 16);
                    KkaMAjA.akKaMaJ();
                    return;
                }
                if (string2.equals("kill")) {
                    this.KaMajAk(stringTokenizer.nextToken());
                    return;
                }
                if (string2.equals("killmod")) {
                    int n = Integer.parseInt(stringTokenizer.nextToken());
                    if (n == 1) {
                        this.KKamAjA = null;
                        return;
                    }
                } else {
                    if (string2.equals("reality")) {
                        this.kKAmAjA.remove(this);
                        this.move(0, 0);
                        this.KKAmajA.add("Center", this);
                        this.KKAmajA.layout();
                        this.show();
                        this.kKAmAjA.dispose();
                        return;
                    }
                    if (string2.equals("loaded")) {
                        this.kKAMAJA = false;
                        this.repaint(0L);
                    }
                }
            }
        }
    }

    void kAMAjAk(String string) {
        System.out.print(String.valueOf(this.kkamajA++));
        kmjjmma kmjjmma2 = (kmjjmma)this.kKAmajA.get(string);
        if (kmjjmma2 != null) {
            kmjjmma2.mAjakkA(this);
            System.runFinalization();
            System.gc();
            return;
        }
        kajakka kajakka2 = (kajakka)this.KkamajA.get(string);
        if (kajakka2 != null) {
            kajakka2.AmajaKk(this);
            System.runFinalization();
            System.gc();
            return;
        }
        System.out.println("muhmuscript error: no such routine " + string);
    }

    void KAMajAk(String string, String string2) {
        kmjjmma kmjjmma2 = (kmjjmma)this.kKAmajA.get(string);
        if (kmjjmma2 != null) {
            kmjjmma2.majakkA(string2, this.KKAmaJA - this.KkamaJA);
            return;
        }
        kajakka kajakka2 = (kajakka)this.KkamajA.get(string);
        if (kajakka2 != null) {
            kajakka2.AMAjaKk(string2, this.KKAmaJA - this.KkamaJA);
            return;
        }
        System.out.println("muhmuscript error: no such routine " + string);
    }

    void kaMAJAk(String string) {
        this.KkAmaJA.kaMAjak(80L);
        this.KKAmaJA = (float)this.KkAmaJA.kAmajak() / 1000.0f;
        this.kKAmaJA = this.KKAmaJA - 0.08f;
        this.KkamaJA = this.KKAmaJA;
        kmjjmma kmjjmma2 = (kmjjmma)this.kKAmajA.get(string);
        if (kmjjmma2 != null) {
            kmjjmma2.maJAkkA();
            this.kkaMAJA = kmjjmma2;
            this.KKaMAJA = null;
            return;
        }
        kajakka kajakka2 = (kajakka)this.KkamajA.get(string);
        if (kajakka2 != null) {
            kajakka2.AMajaKk();
            this.kkaMAJA = null;
            this.KKaMAJA = kajakka2;
            return;
        }
        System.out.println("muhmuscript error: no such routine " + string);
    }

    void KaMajAk(String string) {
        kmjjmma kmjjmma2 = (kmjjmma)this.kKAmajA.get(string);
        if (kmjjmma2 != null) {
            kmjjmma2.MAjakkA();
            this.kKAmajA.remove(string);
            System.runFinalization();
            System.gc();
            return;
        }
        kajakka kajakka2 = (kajakka)this.KkamajA.get(string);
        if (kajakka2 != null) {
            kajakka2.aMAjaKk();
            this.KkamajA.remove(string);
            System.runFinalization();
            System.gc();
            return;
        }
        System.out.println("muhmuscript error: no such routine " + string);
    }

    void KamAJAk(int n) {
        this.kKamajA = 0.0f;
        this.KkAMajA = n;
        this.KKamajA = this.KKAmaJA;
    }

    void kaMAjAk(kmjjmma kmjjmma2) {
        this.kKAmajA.put(kmjjmma2.MaJAkkA(), kmjjmma2);
    }

    void KamajAk(kajakka kajakka2) {
        this.KkamajA.put(kajakka2.amajaKk(), kajakka2);
    }

    public void kAMAJAk() {
        this.KamajAk(new kmaakmk());
        this.kaMAjAk(new kajjmma());
        this.kaMAjAk(new kmajkmk());
        this.kaMAjAk(new maajkka());
        this.kaMAjAk(new maaamma());
        this.kaMAjAk(new majakma());
        this.kaMAjAk(new majakkk());
        this.kkAMajA = new Hashtable();
        int n = 0;
        while (n < kAMajAk.length) {
            String string = kAMajAk[n].substring(7, kAMajAk[n].indexOf(46));
            this.kkAMajA.put(string, kmaakma.MAjaKkA(this.aMajAKK(kAMajAk[n])));
            ++n;
        }
    }

    /*
     * Unable to fully structure code
     */
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
        this.KkAmaJA = new maajmka(10, 60);
        this.KAMAJAk(this, 0, 0, 512, 256);
        try {
            while (this.aMaJakK != null) {
                block16: {
                    block21: {
                        block22: {
                            block19: {
                                block20: {
                                    block17: {
                                        block18: {
                                            if (!godog.KkAmAJA) {
                                                godog.KkAmAJA = true;
                                                this.kkAmAJA = this.KamAjAk();
                                            }
                                            this.KAMAjAk();
                                            var1_1 = this.kkAmAJA;
                                            if (this.kkamaJA) {
                                                this.KAmAjAk(var1_1);
                                            }
                                            this.KKAmaJA = (float)this.KkAmaJA.kAmajak() / 1000.0f;
                                            this.kkAmaJA = this.KKAmaJA - this.kKAmaJA;
                                            if (this.kkaMAJA == null) break block16;
                                            this.kkaMAJA.MajakkA(godog.kKAMAjA, this.KKAmaJA - this.KkamaJA, this.kkAmaJA);
                                            if (this.KKAMajA == null) break block17;
                                            var2_3 = -((int)((double)this.kkaMajA[0] * Math.random() + (double)this.kkaMajA[2]));
                                            var3_4 = -((int)((double)this.kkaMajA[1] * Math.random() + (double)this.kkaMajA[3]));
                                            if (this.kkaMajA[4] <= 0) break block18;
                                            ** GOTO lbl36
                                            {
                                                godog.kKAMAjA.AMAJakk(this.KKAMajA, var2_3, var3_4);
                                                var2_3 += this.KKAMajA.kAMAJaK;
                                                do {
                                                    if (var2_3 < 512) continue block7;
                                                    var3_4 += this.KKAMajA.KamAJaK;
lbl36:
                                                    // 2 sources

                                                } while (var3_4 < 256);
                                            }
                                            break block17;
                                        }
                                        godog.kKAMAjA.AMAJakk(this.KKAMajA, var2_3, var3_4);
                                    }
                                    if (this.kKAMajA == null) break block19;
                                    var2_3 = -((int)((double)this.KKaMajA[0] * Math.random() + (double)this.KKaMajA[2]));
                                    var3_4 = -((int)((double)this.KKaMajA[1] * Math.random() + (double)this.KKaMajA[3]));
                                    if (this.KKaMajA[4] <= 0) break block20;
                                    ** GOTO lbl51
                                    {
                                        godog.kKAMAjA.amAJAkk(this.kKAMajA, var2_3, var3_4);
                                        var2_3 += this.kKAMajA.kAMAJaK;
                                        do {
                                            if (var2_3 < 512) continue block9;
                                            var3_4 += this.kKAMajA.KamAJaK;
lbl51:
                                            // 2 sources

                                        } while (var3_4 < 256);
                                    }
                                    break block19;
                                }
                                godog.kKAMAjA.amAJAkk(this.kKAMajA, var2_3, var3_4);
                            }
                            if (this.KkaMajA == null) break block21;
                            var2_3 = -((int)((double)this.kKaMajA[0] * Math.random() + (double)this.kKaMajA[2]));
                            var3_4 = -((int)((double)this.kKaMajA[1] * Math.random() + (double)this.kKaMajA[3]));
                            if (this.kKaMajA[4] <= 0) break block22;
                            ** GOTO lbl66
                            {
                                godog.kKAMAjA.AMAJakk(this.KkaMajA, var2_3, var3_4);
                                var2_3 += this.KkaMajA.kAMAJaK;
                                do {
                                    if (var2_3 < 512) continue block11;
                                    var3_4 += this.KkaMajA.KamAJaK;
lbl66:
                                    // 2 sources

                                } while (var3_4 < 256);
                            }
                            break block21;
                        }
                        godog.kKAMAjA.AMAJakk(this.KkaMajA, var2_3, var3_4);
                    }
                    switch (this.KkAMajA) {
                        case 1: {
                            godog.kKAMAjA.AmAjakk(mmajkka.AMaJakk(255, 255, 255));
                            break;
                        }
                        case 2: {
                            godog.kKAMAjA.amAJakk(Math.max(0.0f, 0.93f - (this.KKAmaJA - this.KKamajA) * 2.0f));
                            break;
                        }
                    }
                    godog.KKAMAjA.aKKaMaJ(var1_1, 0, 0);
                }
                if (this.KKaMAJA != null && var1_1 != null) {
                    this.KKaMAJA.amAjaKk(var1_1, this.KKAmaJA - this.KkamaJA, this.kkAmaJA);
                }
                this.kKAmaJA = this.KKAmaJA;
                this.KkAmaJA.KaMAjak();
                ++this.kKaMAJA;
                Thread.sleep(5L);
            }
            return;
        }
        catch (Exception var1_2) {
            var1_2.printStackTrace();
            return;
        }
    }

    void KAmAjAk(Graphics graphics) {
        int n = 2;
        int n2 = 12;
        String string = String.valueOf((int)this.KkAmaJA.kAMAjak());
        graphics.setColor(Color.black);
        graphics.drawString(string, n + 1, n2);
        graphics.drawString(string, n - 1, n2);
        graphics.drawString(string, n, n2 + 1);
        graphics.drawString(string, n, n2 - 1);
        graphics.setColor(Color.white);
        graphics.drawString(string, n, n2);
    }

    void KAMAJAk(Component component, int n, int n2, int n3, int n4) {
        this.kKAmAJA = component;
        this.KkamAJA = n;
        this.kkamAJA = n2;
        this.KKamAJA = n3;
        this.kKamAJA = n4;
        KkAmAJA = false;
    }

    Graphics KamAjAk() {
        Graphics graphics = this.kKAmAJA.getGraphics();
        return graphics.create(this.KkamAJA, this.kkamAJA, this.KKamAJA, this.kKamAJA);
    }

    public void paint(Graphics graphics) {
        KkAmAJA = false;
        if (this.kKAMAJA) {
            String string = "komplex@jyu.fi";
            FontMetrics fontMetrics = this.getFontMetrics(this.KKAMAJA);
            int n = fontMetrics.stringWidth(string) + 14;
            int n2 = 20;
            int n3 = (512 - n) / 2;
            int n4 = (256 - n2) / 2;
            graphics.setFont(this.KKAMAJA);
            graphics.setColor(Color.black);
            graphics.fillRect(n3, n4, n, n2);
            graphics.setColor(Color.white);
            graphics.drawImage(this.kaMAjAk, 226, 118, null);
        }
    }

    public void kaMajAk() {
        ++this.KkAMAJA;
        this.paint(this.getGraphics());
    }

    public godog() {
        super();
    }

    static {
    }
}

