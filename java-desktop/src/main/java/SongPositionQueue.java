import java.util.Enumeration;
import java.util.Vector;

// 
// Decompiled by Procyon v0.6.0
// 

class SongPositionQueue
{
    Vector events;
    
    synchronized void publish(final int n, final long n2) {
        synchronized (this.events) {
            this.events.addElement(new ScheduledSongPosition(n, n2));
            final long currentTimeMillis = System.currentTimeMillis();
            final Enumeration elements = this.events.elements();
            if (elements != null) {
                while (elements.hasMoreElements()) {
                    final ScheduledSongPosition obj = (ScheduledSongPosition)elements.nextElement();
                    if (obj.timestampMillis <= currentTimeMillis) {
                        this.events.removeElement(obj);
                    }
                }
            }

        }
        this.notify();
    }
    
    int awaitAndSleepUntil(final int n) {
        final ScheduledSongPosition amajaKk = this.awaitPosition(n);
        final long millis = amajaKk.timestampMillis - System.currentTimeMillis();
        if (millis > 0L) {
            try {
                Thread.sleep(millis);
            }
            catch (final Exception ex) {
                return amajaKk.position;
            }
        }
        return amajaKk.position;
    }
    
    boolean hasReached(final int n, final int n2) {
        final long n3 = System.currentTimeMillis() + n2;
        synchronized (this.events) {
            final Enumeration elements = this.events.elements();
            if (elements == null) {
                final boolean b = false;

                return b;
            }
            int n4 = 0;
            while (elements.hasMoreElements()) {
                final ScheduledSongPosition majakmk = (ScheduledSongPosition)elements.nextElement();
                if (n4 == 0 && majakmk.position > n) {
                    final boolean b2 = true;

                    return b2;
                }
                if (majakmk.position >= n && majakmk.timestampMillis <= n3) {
                    final boolean b3 = true;

                    return b3;
                }
                ++n4;
            }

        }
        return false;
    }
    
    synchronized ScheduledSongPosition awaitPosition(final int n) {
        synchronized (this.events) {
            final Enumeration elements = this.events.elements();
            if (elements != null) {
                while (elements.hasMoreElements()) {
                    final ScheduledSongPosition majakmk = (ScheduledSongPosition)elements.nextElement();
                    if (majakmk.position >= n) {
                        final ScheduledSongPosition majakmk2 = majakmk;

                        return majakmk2;
                    }
                }
            }

        }
        ScheduledSongPosition majakmk3 = null;
    Block_4:
        while (true) {
            try {
                this.wait();
            }
            catch (final Exception ex) {
                return null;
            }
            final Enumeration elements2 = this.events.elements();
            if (elements2 != null) {
                while (elements2.hasMoreElements()) {
                    majakmk3 = (ScheduledSongPosition)elements2.nextElement();
                    if (majakmk3.position >= n) {
                        break Block_4;
                    }
                }
            }
        }
        return majakmk3;
    }
    
    public void dump() {
        synchronized (this.events) {
            final Enumeration elements = this.events.elements();
            if (elements != null) {
                while (elements.hasMoreElements()) {
                    System.out.println(elements.nextElement());
                }
            }

        }
    }
    
    SongPositionQueue() {
        this.events = new Vector(100);
    }
}
