// 
// Decompiled by Procyon v0.6.0
// 

final class mmajmmk
{
    private boolean jakkaMA;
    
    mmajmmk(final boolean jakkaMA) {
        this.jakkaMA = jakkaMA;
    }
    
    synchronized boolean aKkAMaJ() {
        return this.jakkaMA;
    }
    
    synchronized void akkAMaJ() {
        while (!this.jakkaMA) {
            this.wait();
        }
    }
    
    synchronized void AkkAMaJ() {
        while (!this.jakkaMA) {
            this.wait();
        }
        this.jakkaMA = false;
    }
    
    synchronized void aKKAMaJ() {
        if (!this.jakkaMA) {
            this.jakkaMA = true;
        }
        this.notifyAll();
    }
    
    synchronized boolean AKkAMaJ() {
        final boolean jakkaMA = this.jakkaMA;
        this.jakkaMA = false;
        return jakkaMA;
    }
}
