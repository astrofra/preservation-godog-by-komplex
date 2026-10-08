import java.awt.Point;

// 
// Decompiled by Procyon v0.6.0
// 

final class kmaammk
{
    int ajakkAM;
    int AJakkAM;
    int aJakkAM;
    int AjAKkAM;
    int ajAKkAM;
    int AJAKkAM;
    private static final int[] aJAKkAM;
    
    kmaammk() {
        this.ajakkAM = 65536;
        this.AjAKkAM = 65536;
    }
    
    kmaammk(final kmaammk kmaammk) {
        this.ajakkAM = 65536;
        this.AjAKkAM = 65536;
        this.ajakkAM = kmaammk.ajakkAM;
        this.AJakkAM = kmaammk.AJakkAM;
        this.aJakkAM = kmaammk.aJakkAM;
        this.AjAKkAM = kmaammk.AjAKkAM;
        this.ajAKkAM = kmaammk.ajAKkAM;
        this.AJAKkAM = kmaammk.AJAKkAM;
    }
    
    final void akKaMaj(final Point point, final Point point2) {
        int x = (int)(this.ajakkAM * (long)point.x + 32768L >> 16) + this.ajAKkAM;
        if (this.aJakkAM != 0) {
            x += (int)(this.aJakkAM * (long)point.y + 32768L >> 16);
        }
        int y = (int)(this.AjAKkAM * (long)point.y + 32768L >> 16) + this.AJAKkAM;
        if (this.AJakkAM != 0) {
            y += (int)(this.AJakkAM * (long)point.x + 32768L >> 16);
        }
        point2.x = x;
        point2.y = y;
    }
    
    final void akkAmAJ(final Point point) {
        int x = (int)(this.ajakkAM * (long)point.x + 32768L >> 16) + this.ajAKkAM;
        if (this.aJakkAM != 0) {
            x += (int)(this.aJakkAM * (long)point.y + 32768L >> 16);
        }
        int y = (int)(this.AjAKkAM * (long)point.y + 32768L >> 16) + this.AJAKkAM;
        if (this.AJakkAM != 0) {
            y += (int)(this.AJakkAM * (long)point.x + 32768L >> 16);
        }
        point.x = x;
        point.y = y;
    }
    
    final void aKKAmAJ(final int ajakkAM, final int ajAKkAM) {
        this.ajakkAM = ajakkAM;
        this.AjAKkAM = ajAKkAM;
        final int n = 0;
        this.aJakkAM = n;
        this.AJakkAM = n;
        final int n2 = 0;
        this.AJAKkAM = n2;
        this.ajAKkAM = n2;
    }
    
    final void AkkAmAJ(final Point point) {
        int x = (int)(this.ajakkAM * (long)point.x + 32768L >> 16);
        if (this.aJakkAM != 0) {
            x += (int)(this.aJakkAM * (long)point.y + 32768L >> 16);
        }
        int y = (int)(this.AjAKkAM * (long)point.y + 32768L >> 16);
        if (this.AJakkAM != 0) {
            y += (int)(this.AJakkAM * (long)point.x + 32768L >> 16);
        }
        point.x = x;
        point.y = y;
    }
    
    final kaajmmk AKKaMaj(final kaajmmk kaajmmk) {
        final kaajmmk kaajmmk2 = new kaajmmk();
        if (kaajmmk.jAKkAMa != Integer.MIN_VALUE) {
            final Point point = new Point(kaajmmk.jAKkAMa, kaajmmk.JakkAMa);
            final Point point2 = new Point(0, 0);
            this.akKaMaj(point, point2);
            kaajmmk2.AKKaMAJ(point2);
            point.x = kaajmmk.jakkAMa;
            this.akKaMaj(point, point2);
            kaajmmk2.AKKaMAJ(point2);
            point.y = kaajmmk.JAkkAMa;
            this.akKaMaj(point, point2);
            kaajmmk2.AKKaMAJ(point2);
            point.x = kaajmmk.jAKkAMa;
            this.akKaMaj(point, point2);
            kaajmmk2.AKKaMAJ(point2);
        }
        return kaajmmk2;
    }
    
    int AKKAmAJ(final int n) {
        final Point point = new Point(n, n);
        this.AkkAmAJ(point);
        int max = (int)(46341L * AKkAmAJ(point.x, point.y) + 32768L >> 16);
        if (n > 0) {
            max = Math.max(1, max);
        }
        return max;
    }
    
    final kmaammk AkkaMaj() {
        final kmaammk kmaammk = new kmaammk();
        if (this.AJakkAM == 0 && this.aJakkAM == 0) {
            final kmaammk kmaammk2 = kmaammk;
            final int ajakkAM = this.ajakkAM;
            kmaammk2.ajakkAM = ((ajakkAM != 0) ? ((int)(4294967296L / ajakkAM)) : Integer.MAX_VALUE);
            final kmaammk kmaammk3 = kmaammk;
            final int ajAKkAM = this.AjAKkAM;
            kmaammk3.AjAKkAM = ((ajAKkAM != 0) ? ((int)(4294967296L / ajAKkAM)) : Integer.MAX_VALUE);
            kmaammk.ajAKkAM = -(int)(kmaammk.ajakkAM * (long)this.ajAKkAM + 32768L >> 16);
            kmaammk.AJAKkAM = -(int)(kmaammk.AjAKkAM * (long)this.AJAKkAM + 32768L >> 16);
        }
        else {
            final double n = this.ajakkAM * 1.52587890625E-5;
            final double n2 = this.AJakkAM * 1.52587890625E-5;
            final double n3 = this.aJakkAM * 1.52587890625E-5;
            final double n4 = this.AjAKkAM * 1.52587890625E-5;
            final double n5 = n * n4 - n2 * n3;
            if (n5 != 0.0) {
                final double n6 = 1.0 / n5;
                kmaammk.ajakkAM = (int)(n4 * n6 * 65536.0);
                kmaammk.AJakkAM = -(int)(n2 * n6 * 65536.0);
                kmaammk.aJakkAM = -(int)(n3 * n6 * 65536.0);
                kmaammk.AjAKkAM = (int)(n * n6 * 65536.0);
                final Point point = new Point(this.ajAKkAM, this.AJAKkAM);
                kmaammk.AkkAmAJ(point);
                kmaammk.ajAKkAM = -point.x;
                kmaammk.AJAKkAM = -point.y;
            }
        }
        return kmaammk;
    }
    
    static final kmaammk aKKaMaj(final kmaammk kmaammk, final kmaammk kmaammk2) {
        final kmaammk kmaammk3 = new kmaammk();
        kmaammk3.ajakkAM = (int)(kmaammk.ajakkAM * (long)kmaammk2.ajakkAM + 32768L >> 16);
        kmaammk3.AjAKkAM = (int)(kmaammk.AjAKkAM * (long)kmaammk2.AjAKkAM + 32768L >> 16);
        kmaammk3.ajAKkAM = (int)(kmaammk.ajAKkAM * (long)kmaammk2.ajakkAM + 32768L >> 16) + kmaammk2.ajAKkAM;
        kmaammk3.AJAKkAM = (int)(kmaammk.AJAKkAM * (long)kmaammk2.AjAKkAM + 32768L >> 16) + kmaammk2.AJAKkAM;
        if (kmaammk.AJakkAM != 0 || kmaammk.aJakkAM != 0 || kmaammk2.AJakkAM != 0 || kmaammk2.aJakkAM != 0) {
            final kmaammk kmaammk4 = kmaammk3;
            kmaammk4.ajakkAM += (int)(kmaammk.AJakkAM * (long)kmaammk2.aJakkAM + 32768L >> 16);
            final kmaammk kmaammk5 = kmaammk3;
            kmaammk5.AjAKkAM += (int)(kmaammk.aJakkAM * (long)kmaammk2.AJakkAM + 32768L >> 16);
            final kmaammk kmaammk6 = kmaammk3;
            kmaammk6.AJakkAM += (int)(kmaammk.ajakkAM * (long)kmaammk2.AJakkAM + 32768L >> 16) + (int)(kmaammk.AJakkAM * (long)kmaammk2.AjAKkAM + 32768L >> 16);
            final kmaammk kmaammk7 = kmaammk3;
            kmaammk7.aJakkAM += (int)(kmaammk.aJakkAM * (long)kmaammk2.ajakkAM + 32768L >> 16) + (int)(kmaammk.AjAKkAM * (long)kmaammk2.aJakkAM + 32768L >> 16);
            final kmaammk kmaammk8 = kmaammk3;
            kmaammk8.ajAKkAM += (int)(kmaammk.AJAKkAM * (long)kmaammk2.aJakkAM + 32768L >> 16);
            final kmaammk kmaammk9 = kmaammk3;
            kmaammk9.AJAKkAM += (int)(kmaammk.ajAKkAM * (long)kmaammk2.AJakkAM + 32768L >> 16);
        }
        return kmaammk3;
    }
    
    static final int AkKaMaj(final int n) {
        if (n > 0) {
            return n;
        }
        return -n;
    }
    
    static final int aKkAmAJ(final int n, final int n2) {
        final int a = (n > 0) ? n : (-n);
        final int b = (n2 > 0) ? n2 : (-n2);
        return a + b - (Math.min(a, b) >> 1);
    }
    
    static final int AKkAmAJ(final int n, final int n2) {
        int n3 = (n > 0) ? n : (-n);
        int n4 = (n2 > 0) ? n2 : (-n2);
        if (n3 > n4) {
            final int n5 = n3;
            n3 = n4;
            n4 = n5;
        }
        if (n4 == 0) {
            return 0;
        }
        final int n6 = (n4 != 0) ? ((int)(((long)n3 << 16) / n4)) : Integer.MAX_VALUE;
        final int n7 = n6 >> 10;
        final int n8 = (n6 & 0x3FF) << 6;
        return (int)(n4 * (long)((int)((65536 - n8) * (long)kmaammk.aJAKkAM[n7] + 32768L >> 16) + (int)(n8 * (long)kmaammk.aJAKkAM[n7 + 1] + 32768L >> 16) >> 14) + 32768L >> 16);
    }
    
    static {
        aJAKkAM = new int[] { 1073741824, 1073872888, 1074265984, 1074920825, 1075836932, 1077013639, 1078450093, 1080145258, 1082097918, 1084306681, 1086769986, 1089486107, 1092453157, 1095669100, 1099131748, 1102838780, 1106787739, 1110976045, 1115401003, 1120059807, 1124949552, 1130067241, 1135409791, 1140974043, 1146756771, 1152754686, 1158964447, 1165382668, 1172005924, 1178830760, 1185853694, 1193071229, 1200479854, 1208076055, 1215856315, 1223817123, 1231954981, 1240266402, 1248747921, 1257396097, 1266207514, 1275178788, 1284306569, 1293587545, 1303018442, 1312596028, 1322317116, 1332178565, 1342177280, 1352310217, 1362574382, 1372966831, 1383484673, 1394125071, 1404885240, 1415762448, 1426754019, 1437857331, 1449069814, 1460388955, 1471812291, 1483337417, 1494961978, 1506683672, 1518500250, 1518500250 };
    }
}
