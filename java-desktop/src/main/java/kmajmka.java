import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;

// 
// Decompiled by Procyon v0.6.0
// 

class kmajmka
{
    String kamajak;
    int KAmajak;
    int kAmajak;
    Color KaMAjak;
    Font kaMAjak;
    
    kmajmka(final String kamajak, final int kAmajak, final int kAmajak2, final Color kaMAjak, final Font kaMAjak2) {
        this.kamajak = kamajak;
        this.KAmajak = kAmajak;
        this.kAmajak = kAmajak2;
        this.KaMAjak = kaMAjak;
        this.kaMAjak = kaMAjak2;
    }
    
    kmajmka(final String kamajak, final int kAmajak, final int kAmajak2) {
        this.kamajak = kamajak;
        this.KAmajak = kAmajak;
        this.kAmajak = kAmajak2;
    }
    
    kmajmka(final Color kaMAjak, final Font kaMAjak2) {
        this.KaMAjak = kaMAjak;
        this.kaMAjak = kaMAjak2;
    }
    
    public void KAmajak(final Graphics graphics) {
        if (this.KaMAjak != null) {
            graphics.setColor(this.KaMAjak);
        }
        if (this.kaMAjak != null) {
            graphics.setFont(this.kaMAjak);
        }
        if (this.kamajak != null) {
            graphics.drawString(this.kamajak, this.KAmajak, this.kAmajak);
        }
    }
}
