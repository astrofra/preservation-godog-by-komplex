/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;

final class maaamka
extends ByteArrayInputStream {
    private int kKAmaja;
    private int Kkamaja;
    private byte[] kkamaja;
    private mmaakka KKamaja;
    private boolean kKamaja;
    private maaamka KkAMaja;
    private boolean kkAMaja;
    private int KKAMaja;
    private kajamma kKAMaja;

    maaamka(byte[] byArray, int n, int n2, mmaakka mmaakka2) {
        super(byArray);
        this.kkamaja = byArray;
        this.KKamaja = mmaakka2;
        this.count = n < 0 ? Integer.MAX_VALUE : n2 * n;
        this.kKAmaja = n2;
        mmaakka2.AMAJaKk = false;
    }

    private void kKAmajA(maaamka maaamka2) {
        this.count = maaamka2.count;
        this.kKAmaja = maaamka2.kKAmaja;
        this.buf = maaamka2.kkamaja;
        this.kkamaja = maaamka2.kkamaja;
        this.reset();
        maaamka2.kKAMaja.MAJAkKa(maaamka2.KKAMaja);
    }

    private int KkAMajA(int n) {
        if (!this.kKamaja) {
            return n;
        }
        if (n <= 0 && this.KkAMaja.KkAMaja != null) {
            this.KkAMaja = this.KkAMaja.KkAMaja;
            this.kKAmajA(this.KkAMaja);
            if (this.buf.length > 0 && this.Kkamaja == 0) {
                return this.read();
            }
        }
        return n;
    }

    private int KKAmajA(int n, byte[] byArray, int n2, int n3) {
        if (!this.kKamaja) {
            return n;
        }
        if (n <= 0 && this.KkAMaja.KkAMaja != null) {
            this.KkAMaja = this.KkAMaja.KkAMaja;
            this.kKAmajA(this.KkAMaja);
            if (this.buf.length > 0 && this.Kkamaja == 0) {
                return this.read(byArray, n2, n3);
            }
        }
        return n;
    }

    synchronized void KkamajA(maaamka maaamka2, int n, kajamma kajamma2) {
        maaamka2.kKamaja = true;
        this.kKamaja = true;
        maaamka2.KKAMaja = n;
        maaamka2.kKAMaja = kajamma2;
        if (this.KkAMaja == null) {
            this.KkAMaja = maaamka2;
            this.kKAmajA(maaamka2);
            return;
        }
        maaamka maaamka3 = this.KkAMaja;
        while (maaamka3.KkAMaja != null) {
            maaamka3 = maaamka3.KkAMaja;
        }
        maaamka3.KkAMaja = maaamka2;
    }

    public synchronized int read() {
        int n = this.KKamajA();
        if (n <= 0 && this.kkAMaja) {
            return -1;
        }
        if (n <= 0) {
            n = 127;
        }
        return n;
    }

    private int KKamajA() {
        if (this.KKamaja.AMAJaKk) {
            return this.KkAMajA(-1);
        }
        if (this.pos < this.count) {
            ++this.pos;
            if (this.Kkamaja >= this.kKAmaja) {
                this.Kkamaja = 0;
            }
            if (this.KKamaja.aMAJaKk) {
                ++this.Kkamaja;
                return this.KkAMajA(127);
            }
            return this.KkAMajA(this.buf[this.Kkamaja++] & 0xFF);
        }
        return this.KkAMajA(-1);
    }

    static void kkAmajA(byte[] byArray, int n, int n2) {
        int n3 = n2;
        while (n3 > 0) {
            byArray[n++] = 127;
            --n3;
        }
    }

    private int kKamajA(byte[] byArray, int n, int n2) {
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
            maaamka.kkAmajA(byArray, n, n2);
        } else {
            System.arraycopy(this.buf, this.Kkamaja, byArray, n, n2);
        }
        this.Kkamaja += n2;
        return n2;
    }

    void KkAmajA() {
        this.kkAMaja = true;
    }

    public synchronized int read(byte[] byArray, int n, int n2) {
        int n3;
        int n4 = n;
        while ((n3 = this.kkAMajA(byArray, n4, n2)) > 0) {
            n4 += n3;
            if ((n2 -= n3) <= 0) break;
        }
        if (n3 <= 0 && n4 == n && this.kkAMaja) {
            return -1;
        }
        if (n2 > 0) {
            maaamka.kkAmajA(byArray, n4, n2);
            n4 += n2;
        }
        return n4 - n;
    }

    private int kkAMajA(byte[] byArray, int n, int n2) {
        if (this.KKamaja.AMAJaKk) {
            return -1;
        }
        if (this.pos >= this.count) {
            return this.KKAmajA(-1, byArray, n, n2);
        }
        if (this.pos + n2 > this.count) {
            n2 = this.count - this.pos;
        }
        if (n2 <= 0) {
            return this.KKAmajA(0, byArray, n, n2);
        }
        if (this.Kkamaja + n2 <= this.kKAmaja) {
            if (this.KKamaja.aMAJaKk) {
                maaamka.kkAmajA(byArray, n, n2);
            } else {
                System.arraycopy(this.buf, this.Kkamaja, byArray, n, n2);
            }
            this.Kkamaja += n2;
        } else {
            int n3 = 0;
            while (n3 < n2) {
                int n4 = this.kKamajA(byArray, n + n3, n2 - n3);
                if (n4 >= 0) {
                    n3 += n4;
                    continue;
                }
                this.Kkamaja = 0;
            }
        }
        this.pos += n2;
        return this.KKAmajA(n2, byArray, n, n2);
    }

    public synchronized long skip(long l) {
        if (this.KKamaja.AMAJaKk) {
            return 0L;
        }
        if ((long)this.pos + l > (long)this.count) {
            l = this.count - this.pos;
        }
        if (l < 0L) {
            return 0L;
        }
        this.pos = (int)((long)this.pos + l);
        this.Kkamaja = (int)((long)this.Kkamaja + l);
        while (this.Kkamaja >= this.kKAmaja) {
            this.Kkamaja -= this.kKAmaja;
        }
        return l;
    }

    public synchronized int available() {
        if (this.KKamaja.AMAJaKk) {
            return 0;
        }
        return this.count - this.pos;
    }

    public synchronized void reset() {
        this.Kkamaja = 0;
        this.pos = 0;
    }

    protected synchronized int kkamajA() {
        return this.kKAmaja;
    }
}

