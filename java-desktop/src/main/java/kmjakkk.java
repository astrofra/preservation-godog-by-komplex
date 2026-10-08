// 
// Decompiled by Procyon v0.6.0
// 

public class kmjakkk extends Thread
{
    int mAjakKA;
    mmjjkkk[] MaJAkKA;
    mmaakma maJAkKA;
    int MAJAkKA;
    int mAJAkKA;
    long MajAkKA;
    
    public kmjakkk(final int n, final mmaakma maJAkKA) {
        super("Muhmu Event Pipe");
        this.MajAkKA = -1L;
        this.MaJAkKA = new mmjjkkk[n];
        this.maJAkKA = maJAkKA;
    }
    
    public void jakKAMA(final int n, final String s) {
        this.MaJAkKA[this.mAjakKA++] = new mmjjkkk((float)n, s);
    }
    
    public void JakKAMA(final int n, final long ajakkam) {
        while (this.MAJAkKA < this.mAjakKA) {
            final float n2 = (float)n;
            final mmjjkkk mmjjkkk = this.MaJAkKA[this.MAJAkKA];
            if (n2 == mmjjkkk.sortKey) {
                mmjjkkk.ajakkam = ajakkam;
                if (this.MAJAkKA == this.mAJAkKA) {
                    this.JAkKAMA();
                }
                ++this.MAJAkKA;
            }
            else if (n2 > mmjjkkk.sortKey) {
                return;
            }
        }
    }
    
    synchronized void JAkKAMA() {
        this.notify();
    }
    
    public void start() {
        new DepthSorter(this.MaJAkKA).mAJakkA(this.mAjakKA);
        this.mAJAkKA = 0;
        super.start();
    }
    
    public synchronized void run() {
        try {
            this.mAJAkKA = 0;
            while (this.mAJAkKA < this.mAjakKA) {
                final mmjjkkk mmjjkkk = this.MaJAkKA[this.mAJAkKA];
                if (mmjjkkk.ajakkam == 0L) {
                    this.wait();
                }
                final long millis = mmjjkkk.ajakkam - System.currentTimeMillis();
                if (millis > 0L) {
                    Thread.sleep(millis);
                }
                if (this.maJAkKA != null) {
                    this.maJAkKA.maJaKkA((int)mmjjkkk.sortKey, mmjjkkk.AJakkam);
                }
                else {
                    System.out.println(mmjjkkk.AJakkam);
                }
                ++this.mAJAkKA;
            }
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("muhmupipe/muhmuscript finished. (c) saviour.");
    }
}
