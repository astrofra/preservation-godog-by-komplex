/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Window;

public final class majamka
extends Window {
    public static final int kKamaJA = 0;
    public static final int KkAMaJA = 36;
    public static final int kkAMaJA = 640;
    public static final int KKAMaJA = 480;
    public Panel kKAMaJA;
    public Dimension KkaMaJA = new Dimension(640, 480);
    public Dimension kkaMaJA = this.getToolkit().getScreenSize();

    public majamka(String string) {
        super(new Frame());
        ((Component)this).setBackground(Color.black);
        this.setLayout(null);
        ((Component)this).reshape(0, 0, this.kkaMaJA.width, this.kkaMaJA.height + 36);
        this.kKAMaJA = new Panel();
        this.kKAMaJA.setLayout(null);
        this.kKAMaJA.setBackground(Color.black);
        this.kKAMaJA.reshape(this.kkaMaJA.width / 2 - this.KkaMaJA.width / 2, this.kkaMaJA.height / 2 - this.KkaMaJA.height / 2, this.KkaMaJA.width, this.KkaMaJA.height);
        this.add(this.kKAMaJA);
    }

    public void KkAmAjA(Component component) {
        int n = (this.KkaMaJA.width - component.bounds().width) / 2;
        int n2 = (this.KkaMaJA.height - component.bounds().height) / 2;
        component.move(n, n2);
        this.kKAMaJA.add(component);
    }

    public void kAmAjAk(Component component) {
        component.reshape(0, 0, this.KkaMaJA.width, this.KkaMaJA.height);
        this.kKAMaJA.add(component);
    }

    public void dispose() {
        ((Container)this).removeNotify();
        this.removeAll();
        super.dispose();
    }

    public void show() {
        super.show();
        this.toFront();
    }
}

