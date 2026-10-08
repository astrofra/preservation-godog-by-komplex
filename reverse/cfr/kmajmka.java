/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

class kmajmka {
    String kamajak;
    int KAmajak;
    int kAmajak;
    Color KaMAjak;
    Font kaMAjak;

    kmajmka(String string, int n, int n2, Color color, Font font) {
        super();
        this.kamajak = string;
        this.KAmajak = n;
        this.kAmajak = n2;
        this.KaMAjak = color;
        this.kaMAjak = font;
    }

    kmajmka(String string, int n, int n2) {
        super();
        this.kamajak = string;
        this.KAmajak = n;
        this.kAmajak = n2;
    }

    kmajmka(Color color, Font font) {
        super();
        this.KaMAjak = color;
        this.kaMAjak = font;
    }

    public void KAmajak(Graphics graphics) {
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

