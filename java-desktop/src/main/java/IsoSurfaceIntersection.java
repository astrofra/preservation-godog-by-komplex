// 
// Decompiled by Procyon v0.6.0
// 

class IsoSurfaceIntersection extends Vec3f
{
    static final float kaMaJAK = 1024.0f;
    
    void kamaJak(final ScalarFieldVertex kaaakkk, final ScalarFieldVertex kaaakkk2) {
        final float n = kaaakkk2.amAJAkK - kaaakkk.amAJAkK;
        if (n == 0.0f) {
            super.x = kaaakkk.x;
            super.y = kaaakkk.y;
            super.z = kaaakkk.z;
            return;
        }
        final float n2 = (1024.0f - kaaakkk.amAJAkK) / n;
        super.x = kaaakkk.x + n2 * (kaaakkk2.x - kaaakkk.x);
        super.y = kaaakkk.y + n2 * (kaaakkk2.y - kaaakkk.y);
        super.z = kaaakkk.z + n2 * (kaaakkk2.z - kaaakkk.z);
    }
}
