import java.util.Enumeration;
import muhmu.hifi.device.MAD;
import java.util.Hashtable;
import muhmu.hifi.device.Mixable;

// 
// Decompiled by Procyon v0.6.0
// 

public class MixerBus implements Mixable
{
    Hashtable MaJAKKA;
    int maJAKKA;
    MixerBusListener MAJAKKA;
    float mAJAKKA;
    float MajAKKA;
    public long majAKKA;
    
    public MixerBus() {
        this.MaJAKKA = new Hashtable(32);
        this.maJAKKA = -1;
        this.MajAKKA = 1.0f;
        this.MAJAkkA(3.0f);
    }
    
    public synchronized void MAjAkkA() {
        this.MaJAKKA.clear();
    }
    
    public void mAjAkkA(final MixerBusListener majakka) {
        this.MAJAKKA = majakka;
    }
    
    void MAJAkkA(final float n) {
        this.MajAKKA = 1.0f / n;
    }
    
    void MaJaKKA(final float majAKKA) {
        this.MajAKKA = majAKKA;
    }
    
    synchronized void MajAkkA(final int value, final Mixable value2) {
        this.MaJAKKA.put(new Integer(value), value2);
    }
    
    synchronized void majAkkA(final Mixable value) {
        this.MaJAKKA.put(new Integer(this.maJAKKA), value);
        --this.maJAKKA;
        if (this.maJAKKA == Integer.MIN_VALUE) {
            this.maJAKKA = -1;
        }
    }
    
    public synchronized boolean mix(final MAD mad, final int[] array, final int n, final int n2) {
        int n3 = (int)this.mAJAKKA;
        if (n3 >= array.length) {
            this.mAJAkkA(mad, array, 0, array.length);
        }
        else {
            int i = 0;
            while (i < array.length) {
                if (n3 > array.length) {
                    this.mAJAkkA(mad, array, i, array.length);
                    i = array.length;
                }
                else {
                    this.mAJAkkA(mad, array, i, n3);
                    i = n3;
                    this.majAKKA = mad.bufferStartTime + i * 1000 / mad.frequency;
                    if (this.MAJAKKA != null) {
                        this.MAJAKKA.onMixerTick(this);
                    }
                    this.mAJAKKA += this.MajAKKA * mad.frequency;
                    n3 = (int)this.mAJAKKA;
                }
            }
        }
        this.mAJAKKA -= (float)array.length;
        return true;
    }
    
    public synchronized void mAJAkkA(final MAD mad, final int[] array, final int n, final int n2) {
        final Enumeration elements = this.MaJAKKA.elements();
        if (elements == null) {
            return;
        }
        final Enumeration keys = this.MaJAKKA.keys();
        while (elements.hasMoreElements()) {
            final Mixable mixable = (Mixable)elements.nextElement();
            final Object nextElement = keys.nextElement();
            if (!mixable.mix(mad, array, n, n2)) {
                this.MaJAKKA.remove(nextElement);
            }
        }
    }
}
