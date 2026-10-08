// 
// Decompiled by Procyon v0.6.0
// 

public class UvCoord
{
    public float u;
    public float v;
    
    public UvCoord() {
    }
    
    public UvCoord(final UvCoord kajjmmk) {
        this.u = kajjmmk.u;
        this.v = kajjmmk.v;
    }
    
    public UvCoord(final float jaKkaMA, final float jakkaMA) {
        this.u = jaKkaMA;
        this.v = jakkaMA;
    }
    
    public UvCoord(final double n, final double n2) {
        this.u = (float)n;
        this.v = (float)n2;
    }
    
    public void set(final UvCoord kajjmmk) {
        this.u = kajjmmk.u;
        this.v = kajjmmk.v;
    }
    
    public void set(final float jaKkaMA, final float jakkaMA) {
        this.u = jaKkaMA;
        this.v = jakkaMA;
    }
    
    public void set(final double n, final double n2) {
        this.u = (float)n;
        this.v = (float)n2;
    }
}
