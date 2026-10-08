// 
// Decompiled by Procyon v0.6.0
// 

class ParticleVertex extends Vertex
{
    Vec3f kAmAjak;
    
    ParticleVertex() {
        this.kAmAjak = new Vec3f();
    }
    
    ParticleVertex(final float majaKka, final float majaKka2, final float mAjaKka) {
        this.kAmAjak = new Vec3f();
        super.x = majaKka;
        super.y = majaKka2;
        super.z = mAjaKka;
    }
}
