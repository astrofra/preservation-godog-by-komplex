// 
// Decompiled by Procyon v0.6.0
// 

final class MovieSignal
{
    private boolean signalled;
    
    MovieSignal(final boolean jakkaMA) {
        this.signalled = jakkaMA;
    }
    
    synchronized boolean isSignalled() {
        return this.signalled;
    }
    
    synchronized void awaitSignal() throws InterruptedException {
        while (!this.signalled) {
            this.wait();
        }
    }
    
    synchronized void awaitAndConsumeSignal() throws InterruptedException {
        while (!this.signalled) {
            this.wait();
        }
        this.signalled = false;
    }
    
    synchronized void signal() {
        if (!this.signalled) {
            this.signalled = true;
        }
        this.notifyAll();
    }
    
    synchronized boolean clearAndGetPreviousSignal() {
        final boolean jakkaMA = this.signalled;
        this.signalled = false;
        return jakkaMA;
    }
}
