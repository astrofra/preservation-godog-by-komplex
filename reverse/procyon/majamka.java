import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Window;

// 
// Decompiled by Procyon v0.6.0
// 

public final class majamka extends Window
{
    public static final int kKamaJA = 0;
    public static final int KkAMaJA = 36;
    public static final int kkAMaJA = 640;
    public static final int KKAMaJA = 480;
    public Panel kKAMaJA;
    public Dimension KkaMaJA;
    public Dimension kkaMaJA;
    
    public majamka(final String s) {
        super(new Frame());
        this.KkaMaJA = new Dimension(640, 480);
        this.kkaMaJA = this.getToolkit().getScreenSize();
        this.setBackground(Color.black);
        this.setLayout(null);
        this.reshape(0, 0, this.kkaMaJA.width, this.kkaMaJA.height + 36);
        (this.kKAMaJA = new Panel()).setLayout(null);
        this.kKAMaJA.setBackground(Color.black);
        this.kKAMaJA.reshape(this.kkaMaJA.width / 2 - this.KkaMaJA.width / 2, this.kkaMaJA.height / 2 - this.KkaMaJA.height / 2, this.KkaMaJA.width, this.KkaMaJA.height);
        this.add(this.kKAMaJA);
    }
    
    public void KkAmAjA(final Component comp) {
        comp.move((this.KkaMaJA.width - comp.bounds().width) / 2, (this.KkaMaJA.height - comp.bounds().height) / 2);
        this.kKAMaJA.add(comp);
    }
    
    public void kAmAjAk(final Component comp) {
        comp.reshape(0, 0, this.KkaMaJA.width, this.KkaMaJA.height);
        this.kKAMaJA.add(comp);
    }
    
    public void dispose() {
        this.removeNotify();
        this.removeAll();
        super.dispose();
    }
    
    public void show() {
        super.show();
        this.toFront();
    }
}
