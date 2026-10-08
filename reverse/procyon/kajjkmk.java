import java.awt.image.ImageObserver;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

// 
// Decompiled by Procyon v0.6.0
// 

public class kajjkmk extends kmjjmmk
{
    public maaakka KkaMaJa;
    public maaakmk kkaMaJa;
    Image KKaMaJa;
    Graphics kKaMaJa;
    int AkKaMaJ;
    
    public void aKkaMaJ(final Graphics graphics, final int n, final int n2) {
        if (kmjjmmk.JAkKamA) {
            this.KkaMaJa.KAmaJaK();
            this.KkaMaJa.kaMAJaK(this.kKaMaJa, 0, 0);
            graphics.drawImage(this.KKaMaJa, n, n2, super.jaKKamA, super.JAKKamA, Color.green, null);
            return;
        }
        this.KkaMaJa.KAmaJaK();
        this.KkaMaJa.KaMAJaK(graphics, n, n2, super.jaKKamA, super.JAKKamA);
    }
    
    public kajjkmk() {
        this.AkKaMaJ = 0;
    }
    
    public void AKKaMaJ(final Graphics graphics, final int n, final int n2) {
        this.KkaMaJa.KAmaJaK();
        this.KkaMaJa.kaMAJaK(graphics, n, n2);
    }
    
    public void akKaMaJ() {
        for (int i = 0; i < this.KkaMaJa.kamAJaK.length; ++i) {
            this.KkaMaJa.kamAJaK[i] = 10;
        }
        ++this.AkKaMaJ;
    }
    
    public void AkKaMaJ(final kmaamma kmaamma) {
        this.KkaMaJa = new maaakka(super.jAkkamA, super.JaKKamA, 2, true);
        this.kkaMaJa = new maaakmk(this.KkaMaJa);
        if (super.jakKamA && kmjjmmk.JAkKamA) {
            this.KKaMaJa = kmaamma.createImage(super.jAkkamA, super.JaKKamA);
            this.kKaMaJa = this.KKaMaJa.getGraphics();
        }
    }
    
    public void AKkaMaJ(final kajjkka kajjkka) {
        this.kkaMaJa.kKamaJa(kajjkka);
    }
}
