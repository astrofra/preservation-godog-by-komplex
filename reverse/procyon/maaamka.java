import java.io.ByteArrayInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class maaamka extends ByteArrayInputStream
{
    private int kKAmaja;
    private int Kkamaja;
    private byte[] kkamaja;
    private mmaakka KKamaja;
    private boolean kKamaja;
    private maaamka KkAMaja;
    private boolean kkAMaja;
    private int KKAMaja;
    private kajamma kKAMaja;
    
    maaamka(final byte[] array, final int n, final int kkAmaja, final mmaakka kKamaja) {
        super(array);
        this.kkamaja = array;
        this.KKamaja = kKamaja;
        if (n < 0) {
            super.count = Integer.MAX_VALUE;
        }
        else {
            super.count = kkAmaja * n;
        }
        this.kKAmaja = kkAmaja;
        kKamaja.AMAJaKk = false;
    }
    
    private void kKAmajA(final maaamka maaamka) {
        super.count = maaamka.count;
        this.kKAmaja = maaamka.kKAmaja;
        final byte[] kkamaja = maaamka.kkamaja;
        super.buf = kkamaja;
        this.kkamaja = kkamaja;
        this.reset();
        maaamka.kKAMaja.MAJAkKa(maaamka.KKAMaja);
    }
    
    private int KkAMajA(final int n) {
        if (!this.kKamaja) {
            return n;
        }
        if (n <= 0 && this.KkAMaja.KkAMaja != null) {
            this.kKAmajA(this.KkAMaja = this.KkAMaja.KkAMaja);
            if (super.buf.length > 0 && this.Kkamaja == 0) {
                return this.read();
            }
        }
        return n;
    }
    
    private int KKAmajA(final int n, final byte[] array, final int n2, final int n3) {
        if (!this.kKamaja) {
            return n;
        }
        if (n <= 0 && this.KkAMaja.KkAMaja != null) {
            this.kKAmajA(this.KkAMaja = this.KkAMaja.KkAMaja);
            if (super.buf.length > 0 && this.Kkamaja == 0) {
                return this.read(array, n2, n3);
            }
        }
        return n;
    }
    
    synchronized void KkamajA(final maaamka maaamka, final int kkaMaja, final kajamma kkaMaja2) {
        final boolean b = true;
        maaamka.kKamaja = b;
        this.kKamaja = b;
        maaamka.KKAMaja = kkaMaja;
        maaamka.kKAMaja = kkaMaja2;
        if (this.KkAMaja == null) {
            this.kKAmajA(this.KkAMaja = maaamka);
            return;
        }
        maaamka maaamka2;
        for (maaamka2 = this.KkAMaja; maaamka2.KkAMaja != null; maaamka2 = maaamka2.KkAMaja) {}
        maaamka2.KkAMaja = maaamka;
    }
    
    public synchronized int read() {
        int kKamajA = this.KKamajA();
        if (kKamajA <= 0 && this.kkAMaja) {
            return -1;
        }
        if (kKamajA <= 0) {
            kKamajA = 127;
        }
        return kKamajA;
    }
    
    private int KKamajA() {
        if (this.KKamaja.AMAJaKk) {
            return this.KkAMajA(-1);
        }
        if (super.pos >= super.count) {
            return this.KkAMajA(-1);
        }
        ++super.pos;
        if (this.Kkamaja >= this.kKAmaja) {
            this.Kkamaja = 0;
        }
        if (this.KKamaja.aMAJaKk) {
            ++this.Kkamaja;
            return this.KkAMajA(127);
        }
        return this.KkAMajA(super.buf[this.Kkamaja++] & 0xFF);
    }
    
    static void kkAmajA(final byte[] array, int n, final int n2) {
        for (int i = n2; i > 0; --i) {
            array[n++] = 127;
        }
    }
    
    private int kKamajA(final byte[] array, final int n, int n2) {
        if (this.Kkamaja >= this.kKAmaja) {
            return -1;
        }
        if (this.Kkamaja + n2 > this.kKAmaja) {
            n2 = this.kKAmaja - this.Kkamaja;
        }
        if (n2 <= 0) {
            return 0;
        }
        if (this.KKamaja.aMAJaKk) {
            kkAmajA(array, n, n2);
        }
        else {
            System.arraycopy(super.buf, this.Kkamaja, array, n, n2);
        }
        this.Kkamaja += n2;
        return n2;
    }
    
    void KkAmajA() {
        this.kkAMaja = true;
    }
    
    public synchronized int read(final byte[] array, final int n, int n2) {
        int n3 = n;
        int kkAMajA;
        while ((kkAMajA = this.kkAMajA(array, n3, n2)) > 0) {
            n3 += kkAMajA;
            n2 -= kkAMajA;
            if (n2 > 0) {
                continue;
            }
            break;
        }
        if (kkAMajA <= 0 && n3 == n && this.kkAMaja) {
            return -1;
        }
        if (n2 > 0) {
            kkAmajA(array, n3, n2);
            n3 += n2;
        }
        return n3 - n;
    }
    
    private int kkAMajA(final byte[] array, final int n, int n2) {
        if (this.KKamaja.AMAJaKk) {
            return -1;
        }
        if (super.pos >= super.count) {
            return this.KKAmajA(-1, array, n, n2);
        }
        if (super.pos + n2 > super.count) {
            n2 = super.count - super.pos;
        }
        if (n2 <= 0) {
            return this.KKAmajA(0, array, n, n2);
        }
        if (this.Kkamaja + n2 <= this.kKAmaja) {
            if (this.KKamaja.aMAJaKk) {
                kkAmajA(array, n, n2);
            }
            else {
                System.arraycopy(super.buf, this.Kkamaja, array, n, n2);
            }
            this.Kkamaja += n2;
        }
        else {
            int i = 0;
            while (i < n2) {
                final int kKamajA = this.kKamajA(array, n + i, n2 - i);
                if (kKamajA >= 0) {
                    i += kKamajA;
                }
                else {
                    this.Kkamaja = 0;
                }
            }
        }
        super.pos += n2;
        return this.KKAmajA(n2, array, n, n2);
    }
    
    public synchronized long skip(long n) {
        if (this.KKamaja.AMAJaKk) {
            return 0L;
        }
        if (super.pos + n > super.count) {
            n = super.count - super.pos;
        }
        if (n < 0L) {
            return 0L;
        }
        super.pos += n;
        this.Kkamaja += n;
        while (this.Kkamaja >= this.kKAmaja) {
            this.Kkamaja -= this.kKAmaja;
        }
        return n;
    }
    
    public synchronized int available() {
        if (this.KKamaja.AMAJaKk) {
            return 0;
        }
        return super.count - super.pos;
    }
    
    public synchronized void reset() {
        this.Kkamaja = 0;
        super.pos = 0;
    }
    
    protected synchronized int kkamajA() {
        return this.kKAmaja;
    }
}
