// 
// Decompiled by Procyon v0.6.0
// 

public class ScriptEventScheduler extends Thread
{
    int eventCount;
    ScheduledScriptEvent[] events;
    ScriptEventListener listener;
    int nextScheduleIndex;
    int nextDispatchIndex;
    long MajAkKA;
    
    public ScriptEventScheduler(final int n, final ScriptEventListener maJAkKA) {
        super("Muhmu Event Pipe");
        this.MajAkKA = -1L;
        this.events = new ScheduledScriptEvent[n];
        this.listener = maJAkKA;
    }
    
    public void addEvent(final int n, final String s) {
        this.events[this.eventCount++] = new ScheduledScriptEvent((float)n, s);
    }
    
    public void schedulePosition(final int n, final long ajakkam) {
        while (this.nextScheduleIndex < this.eventCount) {
            final float n2 = (float)n;
            final ScheduledScriptEvent mmjjkkk = this.events[this.nextScheduleIndex];
            if (n2 == mmjjkkk.sortKey) {
                mmjjkkk.scheduledTimeMillis = ajakkam;
                if (this.nextScheduleIndex == this.nextDispatchIndex) {
                    this.wakeDispatcher();
                }
                ++this.nextScheduleIndex;
            }
            else if (n2 > mmjjkkk.sortKey) {
                return;
            }
        }
    }
    
    synchronized void wakeDispatcher() {
        this.notify();
    }
    
    public void start() {
        new DepthSorter(this.events).mAJakkA(this.eventCount);
        this.nextDispatchIndex = 0;
        super.start();
    }
    
    public synchronized void run() {
        try {
            this.nextDispatchIndex = 0;
            while (this.nextDispatchIndex < this.eventCount) {
                final ScheduledScriptEvent mmjjkkk = this.events[this.nextDispatchIndex];
                if (mmjjkkk.scheduledTimeMillis == 0L) {
                    this.wait();
                }
                final long millis = mmjjkkk.scheduledTimeMillis - System.currentTimeMillis();
                if (millis > 0L) {
                    Thread.sleep(millis);
                }
                if (this.listener != null) {
                    this.listener.onScriptEvent((int)mmjjkkk.sortKey, mmjjkkk.command);
                }
                else {
                    System.out.println(mmjjkkk.command);
                }
                ++this.nextDispatchIndex;
            }
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("muhmupipe/muhmuscript finished. (c) saviour.");
    }
}
