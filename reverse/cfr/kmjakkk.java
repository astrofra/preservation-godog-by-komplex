/*
 * Decompiled with CFR 0.152.
 */
public class kmjakkk
extends Thread {
    int mAjakKA;
    mmjjkkk[] MaJAkKA;
    mmaakma maJAkKA;
    int MAJAkKA;
    int mAJAkKA;
    long MajAkKA = -1L;

    public kmjakkk(int n, mmaakma mmaakma2) {
        super("Muhmu Event Pipe");
        this.MaJAkKA = new mmjjkkk[n];
        this.maJAkKA = mmaakma2;
    }

    public void jakKAMA(int n, String string) {
        this.MaJAkKA[this.mAjakKA++] = new mmjjkkk(n, string);
    }

    public void JakKAMA(int n, long l) {
        mmjjkkk mmjjkkk2;
        float f;
        while (true) {
            if (this.MAJAkKA >= this.mAjakKA) {
                return;
            }
            f = n;
            mmjjkkk2 = this.MaJAkKA[this.MAJAkKA];
            if (f != mmjjkkk2.aMajakk) break;
            mmjjkkk2.ajakkam = l;
            if (this.MAJAkKA == this.mAJAkKA) {
                this.JAkKAMA();
            }
            ++this.MAJAkKA;
        }
        if (f > mmjjkkk2.aMajakk) {
            return;
        }
    }

    synchronized void JAkKAMA() {
        this.notify();
    }

    public void start() {
        new mmjjmma(this.MaJAkKA).mAJakkA(this.mAjakKA);
        this.mAJAkKA = 0;
        super.start();
    }

    public synchronized void run() {
        try {
            this.mAJAkKA = 0;
            while (this.mAJAkKA < this.mAjakKA) {
                long l;
                mmjjkkk mmjjkkk2 = this.MaJAkKA[this.mAJAkKA];
                if (mmjjkkk2.ajakkam == 0L) {
                    this.wait();
                }
                if ((l = mmjjkkk2.ajakkam - System.currentTimeMillis()) > 0L) {
                    Thread.sleep(l);
                }
                if (this.maJAkKA != null) {
                    this.maJAkKA.maJaKkA((int)mmjjkkk2.aMajakk, mmjjkkk2.AJakkam);
                } else {
                    System.out.println(mmjjkkk2.AJakkam);
                }
                ++this.mAJAkKA;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        System.out.println("muhmupipe/muhmuscript finished. (c) saviour.");
    }
}

