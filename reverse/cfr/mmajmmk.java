/*
 * Decompiled with CFR 0.152.
 */
final class mmajmmk {
    private boolean jakkaMA;

    mmajmmk(boolean bl) {
        super();
        this.jakkaMA = bl;
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
        boolean bl = this.jakkaMA;
        this.jakkaMA = false;
        return bl;
    }
}

