import java.awt.Point;

// 
// Decompiled by Procyon v0.6.0
// 

final class MovieBounds
{
    int minX;
    int minY;
    int maxX;
    int maxY;
    
    MovieBounds() {
        final int n = Integer.MIN_VALUE;
        this.maxY = n;
        this.maxX = n;
        this.minY = n;
        this.minX = n;
    }
    
    MovieBounds(final MovieBounds kaajmmk) {
        this.minX = kaajmmk.minX;
        this.minY = kaajmmk.minY;
        this.maxX = kaajmmk.maxX;
        this.maxY = kaajmmk.maxY;
    }
    
    MovieBounds(final int n, final int n2, final int n3, final int n4) {
        if (n < n3) {
            this.minX = n;
            this.maxX = n3;
        }
        else {
            this.minX = n3;
            this.maxX = n;
        }
        if (n2 < n4) {
            this.minY = n2;
            this.maxY = n4;
            return;
        }
        this.minY = n4;
        this.maxY = n2;
    }
    
    final void includeBounds(final MovieBounds kaajmmk) {
        if (kaajmmk.minX != Integer.MIN_VALUE) {
            if (this.minX == Integer.MIN_VALUE) {
                this.minX = kaajmmk.minX;
                this.maxX = kaajmmk.maxX;
                this.minY = kaajmmk.minY;
                this.maxY = kaajmmk.maxY;
                return;
            }
            this.minX = Math.min(this.minX, kaajmmk.minX);
            this.maxX = Math.max(this.maxX, kaajmmk.maxX);
            this.minY = Math.min(this.minY, kaajmmk.minY);
            this.maxY = Math.max(this.maxY, kaajmmk.maxY);
        }
    }
    
    final void includePoint(final Point point) {
        if (this.minX == Integer.MIN_VALUE) {
            final int x = point.x;
            this.maxX = x;
            this.minX = x;
            final int y = point.y;
            this.maxY = y;
            this.minY = y;
            return;
        }
        if (point.x < this.minX) {
            this.minX = point.x;
        }
        else if (point.x > this.maxX) {
            this.maxX = point.x;
        }
        if (point.y < this.minY) {
            this.minY = point.y;
            return;
        }
        if (point.y > this.maxY) {
            this.maxY = point.y;
        }
    }
    
    final boolean intersects(final MovieBounds kaajmmk) {
        return this.minX <= kaajmmk.maxX && kaajmmk.minX <= this.maxX && this.minY <= kaajmmk.maxY && kaajmmk.minY <= this.maxY;
    }
    
    final boolean contains(final Point point) {
        return this.minX <= point.x && point.x <= this.maxX && this.minY <= point.y && point.y <= this.maxY;
    }
}
