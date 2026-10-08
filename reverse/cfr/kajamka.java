/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

public class kajamka {
    static int KKaMaJA = 1;
    static final int[] kKaMaJA = new int[]{1712, 1616, 1524, 1440, 1356, 1280, 1208, 1140, 1076, 1016, 960, 907, 856, 808, 762, 720, 678, 640, 604, 570, 538, 508, 480, 453, 428, 404, 381, 360, 339, 320, 302, 285, 269, 254, 240, 226, 214, 202, 190, 180, 170, 160, 151, 143, 135, 127, 120, 113, 107, 101, 95, 90, 85, 80, 75, 71, 67, 63, 60, 56, 53, 50, 47, 45, 42, 40, 37, 35, 33, 31, 30, 28};

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static maaakkk kKAmAjA(byte[] byArray) {
        if (kajamka.kkAmAjA(byArray)) {
            return kajamka.KKAmAjA(byArray);
        }
        if (kajamka.KkamAjA(byArray)) {
            return kajamka.kkamAjA(byArray);
        }
        try {
            byte[] byArray2;
            kaajkka kaajkka2 = (kaajkka)Class.forName("muhmu.gl.ZipHoax").newInstance();
            kaajkka2.aMajAKk(byArray);
            do {
                kaajkka2.AmajAKk();
                if (kaajkka2.aMAjAKk()) {
                    return null;
                }
                if (kaajkka2.AMajAKk()) return null;
                byArray2 = kaajkka2.amAjAKk();
                if (!kajamka.kkAmAjA(byArray2)) continue;
                return kajamka.KKAmAjA(byArray2);
            } while (!kajamka.KkamAjA(byArray2));
            return kajamka.kkamAjA(byArray2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public static boolean kkAmAjA(byte[] byArray) {
        int n = 0;
        try {
            String string = new String(byArray, 0, n + 1080, 4);
            int n2 = 0;
            if (string.equals("M.K.")) {
                n2 = 4;
            }
            if (string.equals("M!K!")) {
                n2 = 4;
            }
            if (string.equals("FLT4")) {
                n2 = 4;
            }
            if (string.equals("OCTA")) {
                n2 = 8;
            }
            if (string.substring(1, 4).equals("CHN")) {
                n2 = string.charAt(0) - 48;
            }
            if (string.substring(2, 4).equals("CH")) {
                n2 = (string.charAt(0) - 48) * 10 + (string.charAt(1) - 48);
            }
            if (string.substring(0, 3).equals("TDZ")) {
                n2 = string.charAt(3) - 48;
            }
            return n2 > 0;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static boolean KkamAjA(byte[] byArray) {
        try {
            String string = new String(byArray, 0, 0, 17);
            int n = mmajkkk.AkkAmAj(byArray, 58);
            return string.equals("Extended Module: ") && n >= 260;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static maaakkk KKAmAjA(byte[] byArray) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = 0;
        String string = new String(byArray, 0, n6 + 1080, 4);
        if (KKaMaJA > 1) {
            System.out.println("sign=" + string);
        }
        int n7 = 0;
        if (string.equals("M.K.")) {
            n7 = 4;
        }
        if (string.equals("M!K!")) {
            n7 = 4;
        }
        if (string.equals("FLT4")) {
            n7 = 4;
        }
        if (string.equals("OCTA")) {
            n7 = 8;
        }
        if (string.substring(1, 4).equals("CHN")) {
            n7 = string.charAt(0) - 48;
        }
        if (string.substring(2, 4).equals("CH")) {
            n7 = (string.charAt(0) - 48) * 10 + (string.charAt(1) - 48);
        }
        if (string.substring(0, 3).equals("TDZ")) {
            n7 = string.charAt(3) - 48;
        }
        if (n7 <= 0) {
            if (KKaMaJA > 1) {
                System.out.println("MOD LOADER ERROR: invalid signature");
            }
            return null;
        }
        String string2 = new String(byArray, 0, n6, 20);
        int n8 = mmajkkk.aKKAmAj(byArray, n6 + 950);
        int n9 = mmajkkk.aKKAmAj(byArray, n6 + 951);
        if (n9 >= n8) {
            n9 = 0;
        }
        kmaakkk kmaakkk2 = new kmaakkk();
        kmaakkk2.jAkKama(byArray, n6 + 952, n8);
        kmaakkk2.jAKKama(n9);
        int n10 = 0;
        int n11 = 0;
        while (n11 < 128) {
            int n12 = mmajkkk.aKKAmAj(byArray, n6 + 952 + n11);
            if (n12 > n10) {
                n10 = n12;
            }
            ++n11;
        }
        mmajkmk[] mmajkmkArray = new mmajkmk[++n10];
        if (KKaMaJA > 1) {
            System.out.println("numChans=" + n7);
        }
        if (KKaMaJA > 1) {
            System.out.println("numPatts=" + n10);
        }
        if (KKaMaJA > 0) {
            System.out.println("loading MOD \"" + string2 + "\"");
        }
        n6 += 1084;
        byte[] byArray2 = new byte[31];
        int n13 = 0;
        while (n13 < n10) {
            mmajkmkArray[n13] = new mmajkmk(64, n7);
            n5 = 0;
            while (n5 < 64) {
                int n14 = 0;
                while (n14 < n7) {
                    int n15 = (mmajkkk.aKKAmAj(byArray, n6) & 0xF) << 8 | mmajkkk.aKKAmAj(byArray, n6 + 1);
                    n4 = (mmajkkk.aKKAmAj(byArray, n6) & 0xF0) + (mmajkkk.aKKAmAj(byArray, n6 + 2) >> 4);
                    n3 = mmajkkk.aKKAmAj(byArray, n6 + 2) & 0xF;
                    n2 = mmajkkk.aKKAmAj(byArray, n6 + 3);
                    if (n4 > 0) {
                        byArray2[n4 - 1] = 1;
                    }
                    n = 0;
                    if (n15 > 0) {
                        n = 0;
                        while (n < 72) {
                            if (n15 >= kKaMaJA[n]) break;
                            ++n;
                        }
                        n += 24;
                        n -= 31;
                    }
                    mmajkmkArray[n13].KkAMAJA(n5, n14, n, n4, n3, n2, 0);
                    n6 += 4;
                    ++n14;
                }
                ++n5;
            }
            ++n13;
        }
        n5 = 31;
        kmaamka[] kmaamkaArray = new kmaamka[n5];
        mmjammk[] mmjammkArray = new mmjammk[n5];
        n4 = 0;
        while (n4 < n5) {
            n3 = 20 + n4 * 30;
            n2 = 2 * mmajkkk.JaKkAmA(byArray, n3 + 22);
            n = 2 * mmajkkk.JaKkAmA(byArray, n3 + 26);
            int n16 = 2 * mmajkkk.JaKkAmA(byArray, n3 + 28);
            String string3 = new String(byArray, 0, n3, 21);
            if (KKaMaJA > 1) {
                System.out.println("samplename=" + string3);
            }
            if (n2 == 0) {
                kmaamkaArray[n4] = null;
            } else {
                kmaamkaArray[n4] = new kmaamka();
                kmaamkaArray[n4].kKAMAjA(byArray, n6, n2);
            }
            mmjammkArray[n4] = new mmjammk();
            mmjammkArray[n4].akkaMAJ(kmaamkaArray[n4]);
            if (kmaamkaArray[n4] != null) {
                kmaamkaArray[n4].kKamAjA(string3);
                kmaamkaArray[n4].KKAMAjA(mmajkkk.aKKAmAj(byArray, n3 + 24));
                kmaamkaArray[n4].KkAMAjA(mmajkkk.aKKAmAj(byArray, n3 + 25));
                if (n16 > 2) {
                    if (n > n2) {
                        n = n2;
                    }
                    if (n + n16 > n2) {
                        n16 = 20;
                    }
                    kmaamkaArray[n4].kkAMAjA(1, n, n16);
                }
            }
            n6 += n2;
            ++n4;
        }
        maaakkk maaakkk2 = new maaakkk();
        maaakkk2.mAjAkKa = string2;
        maaakkk2.majAkKa = 125;
        maaakkk2.MAjAkKa = 6;
        maaakkk2.MajAkKa = n7;
        maaakkk2.MaJAkKa = kmaakkk2;
        maaakkk2.maJAkKa = mmajkmkArray;
        maaakkk2.MAJAkKa = kmaamkaArray;
        maaakkk2.mAJAkKa = mmjammkArray;
        kmaakkk2.JAKKama(maaakkk2);
        return maaakkk2;
    }

    public static maaakkk kkamAjA(byte[] byArray) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        String string = new String(byArray, 0, 0, 17);
        String string2 = new String(byArray, 0, 17, 20);
        String string3 = new String(byArray, 0, 38, 20);
        int n11 = mmajkkk.AkkAmAj(byArray, 58);
        int n12 = mmajkkk.jAKkAmA(byArray, 60);
        int n13 = mmajkkk.AkkAmAj(byArray, 64);
        int n14 = mmajkkk.AkkAmAj(byArray, 66);
        int n15 = mmajkkk.AkkAmAj(byArray, 68);
        int n16 = mmajkkk.AkkAmAj(byArray, 70);
        int n17 = mmajkkk.AkkAmAj(byArray, 72);
        int n18 = mmajkkk.AkkAmAj(byArray, 74);
        int n19 = mmajkkk.AkkAmAj(byArray, 76);
        int n20 = mmajkkk.AkkAmAj(byArray, 78);
        if (!string.equals("Extended Module: ") || n11 < 260) {
            if (KKaMaJA > 1) {
                System.out.println("ERROR LOADING XM: Invalid module");
            }
            return null;
        }
        maaakkk maaakkk2 = new maaakkk();
        maaakkk2.MAjAkKa = n19;
        maaakkk2.majAkKa = n20;
        kmaakkk kmaakkk2 = new kmaakkk();
        kmaakkk2.jAKKama(n14);
        if (KKaMaJA > 1) {
            System.out.println("initializing song.");
        }
        int n21 = n16;
        int n22 = 0;
        int n23 = 0;
        while (n23 < n13) {
            int n24 = mmajkkk.aKKAmAj(byArray, 80 + n23);
            if (n24 > n22) {
                n22 = n24;
            }
            ++n23;
        }
        if (n22 >= n16) {
            n16 = n22 + 1;
        }
        kmaakkk2.jAkKama(byArray, 80, n13);
        mmajkmk[] mmajkmkArray = new mmajkmk[n16];
        mmajkmk mmajkmk2 = new mmajkmk(64, n15);
        int n25 = 0;
        int n26 = n12 + 60;
        if (KKaMaJA > 1) {
            System.out.println("signature=" + string);
        }
        if (KKaMaJA > 1) {
            System.out.println("name=" + string2);
        }
        if (KKaMaJA > 1) {
            System.out.println("trackerName=" + string3);
        }
        if (KKaMaJA > 1) {
            System.out.println("version=" + n11);
        }
        if (KKaMaJA > 1) {
            System.out.println("headerSize=" + n12);
        }
        if (KKaMaJA > 1) {
            System.out.println("songlen=" + n13);
        }
        if (KKaMaJA > 1) {
            System.out.println("restart=" + n14);
        }
        if (KKaMaJA > 1) {
            System.out.println("numChans=" + n15);
        }
        if (KKaMaJA > 1) {
            System.out.println("numPatts=" + n16);
        }
        if (KKaMaJA > 1) {
            System.out.println("numInsts=" + n17);
        }
        if (KKaMaJA > 1) {
            System.out.println("flags=" + n18);
        }
        if (KKaMaJA > 1) {
            System.out.println("speed=" + n19);
        }
        if (KKaMaJA > 1) {
            System.out.println("tempo=" + n20);
        }
        if (KKaMaJA > 0) {
            System.out.println("loading XM \"" + string2 + "\"");
        }
        maaakkk2.mAjAkKa = string2;
        int n27 = n17;
        int n28 = 0;
        while (n28 < n16) {
            if (n28 < n21) {
                int n29 = mmajkkk.jAKkAmA(byArray, n26);
                mmajkkk.aKKAmAj(byArray, n26 + 4);
                int n30 = mmajkkk.AkkAmAj(byArray, n26 + 5);
                n10 = mmajkkk.AkkAmAj(byArray, n26 + 7);
                mmajkmkArray[n28] = new mmajkmk(n30, n15);
                n9 = n26 + n29;
                n8 = 0;
                while (n8 < n30) {
                    n7 = 0;
                    while (n7 < n15) {
                        n6 = 0;
                        n5 = 0;
                        n4 = 0;
                        n3 = 0;
                        n2 = 0;
                        if ((n = byArray[n9++]) < 0) {
                            if ((n & 1) != 0) {
                                n6 = byArray[n9++];
                            }
                        } else {
                            n6 = n;
                            n = 127;
                        }
                        if ((n & 2) != 0) {
                            n5 = byArray[n9++];
                        }
                        if ((n & 4) != 0) {
                            n2 = byArray[n9++];
                        }
                        if ((n & 8) != 0) {
                            n4 = byArray[n9++];
                        }
                        if ((n & 0x10) != 0) {
                            n3 = byArray[n9++];
                        }
                        mmajkmkArray[n28].KkAMAJA(n8, n7, n6, n5, n4, n3, n2);
                        ++n7;
                    }
                    ++n8;
                }
                n26 += n29;
                n26 += n10;
            } else {
                mmajkmkArray[n28] = mmajkmk2;
            }
            ++n28;
        }
        mmjammk[] mmjammkArray = new mmjammk[n27];
        kmaamka[] kmaamkaArray = new kmaamka[n17 * 20];
        n10 = 0;
        while (n10 < n17 * 20) {
            kmaamkaArray[n10] = new kmaamka();
            ++n10;
        }
        n9 = 0;
        n8 = 0;
        n7 = 0;
        n = 0;
        n6 = 0;
        n5 = 0;
        while (n5 < n17) {
            int n31;
            int n32;
            int n33;
            int n34;
            int n35;
            int n36;
            int n37;
            int n38;
            byte by;
            byte by2;
            int n39;
            int n40;
            byte by3;
            int n41;
            int n42;
            n4 = n25;
            if (n5 < n27) {
                mmjammkArray[n5] = new mmjammk();
                mmjammk mmjammk2 = mmjammkArray[n5];
                n7 = mmajkkk.jAKkAmA(byArray, n26);
                String string4 = new String(byArray, 0, n26 + 4, 22);
                mmajkkk.aKKAmAj(byArray, n26 + 26);
                n8 = mmajkkk.AkkAmAj(byArray, n26 + 27);
                if (KKaMaJA > 1) {
                    System.out.println("samplename=" + string4);
                }
                n26 += 29;
                n6 = n7 - 29;
                if (n8 != 0) {
                    n42 = 0;
                    boolean bl = false;
                    n41 = 0;
                    by3 = byArray[n26 + 204];
                    if ((by3 & 1) != 0) {
                        n42 = 1;
                    }
                    if ((by3 & 4) != 0) {
                        bl = true;
                    }
                    if ((by3 & 2) != 0) {
                        n41 = 1;
                    }
                    n40 = byArray[n26 + 196];
                    n39 = byArray[n26 + 198];
                    by2 = byArray[n26 + 199];
                    by = byArray[n26 + 200];
                    Point[] pointArray = new Point[n40];
                    n38 = 0;
                    while (n38 < n40) {
                        n37 = mmajkkk.AkkAmAj(byArray, n26 + 100 + n38 * 4);
                        n36 = mmajkkk.AkkAmAj(byArray, n26 + 100 + n38 * 4 + 2);
                        pointArray[n38] = new Point(n37, n36);
                        ++n38;
                    }
                    mmjammk2.JaKKAMa = new majjkka(pointArray, n39, (int)by2, (int)by);
                    mmjammk2.JaKKAMa.AMajAkk = n42;
                    mmjammk2.JaKKAMa.aMajAkk = bl;
                    mmjammk2.JaKKAMa.AmAJAkk = n41;
                    n42 = 0;
                    bl = false;
                    n41 = 0;
                    by3 = byArray[n26 + 205];
                    if ((by3 & 1) != 0) {
                        n42 = 1;
                    }
                    if ((by3 & 4) != 0) {
                        bl = true;
                    }
                    if ((by3 & 2) != 0) {
                        n41 = 1;
                    }
                    n37 = byArray[n26 + 197];
                    n36 = byArray[n26 + 201];
                    n35 = byArray[n26 + 202];
                    n34 = byArray[n26 + 203];
                    pointArray = new Point[n37];
                    n33 = 0;
                    while (n33 < n37) {
                        n32 = mmajkkk.AkkAmAj(byArray, n26 + 148 + n33 * 4);
                        n31 = mmajkkk.AkkAmAj(byArray, n26 + 148 + n33 * 4 + 2);
                        pointArray[n33] = new Point(n32, n31);
                        ++n33;
                    }
                    mmjammk2.jaKKAMa = new majjkka(pointArray, n36, n35, n34);
                    mmjammk2.jaKKAMa.AMajAkk = n42;
                    mmjammk2.jaKKAMa.aMajAkk = bl;
                    mmjammk2.jaKKAMa.AmAJAkk = n41;
                    n32 = mmajkkk.AkkAmAj(byArray, n26 + 210);
                    mmjammk2.JaKKAMa.AMAjAkk(n32);
                    n31 = mmajkkk.aKKAmAj(byArray, n26 + 206);
                    int n43 = mmajkkk.aKKAmAj(byArray, n26 + 207);
                    int n44 = mmajkkk.aKKAmAj(byArray, n26 + 208);
                    int n45 = mmajkkk.aKKAmAj(byArray, n26 + 209);
                    mmjammk2.jakKAMa = n31;
                    mmjammk2.JakKAMa = n43;
                    mmjammk2.jAKKAMa = (n44 & 0xF) << 4;
                    mmjammk2.JAKKAMa = (n45 & 0x3F) << 2;
                    if (n44 != 0) {
                        if (KKaMaJA > 1) {
                            System.out.println("dep=" + n44);
                        }
                        if (KKaMaJA > 1) {
                            System.out.println("swe=" + n43);
                        }
                        if (KKaMaJA > 1) {
                            System.out.println("spe=" + n45);
                        }
                        if (KKaMaJA > 1) {
                            System.out.println("typ=" + n31);
                        }
                    }
                    n = mmajkkk.jAKkAmA(byArray, n26);
                    int n46 = 0;
                    while (n46 < 96) {
                        int n47 = mmajkkk.aKKAmAj(byArray, n26 + 4 + n46);
                        mmjammk2.jAkkAMa[n46] = kmaamkaArray[n47 + n4];
                        if (n47 >= n9) {
                            n9 = n47 + 1;
                        }
                        ++n46;
                    }
                    n26 += 214;
                    n6 -= 214;
                } else {
                    n9 = 0;
                }
            } else {
                n6 = 0;
            }
            n3 = (n26 += n6) + n8 * n;
            n2 = 0;
            n42 = 0;
            while (n42 < n8) {
                String string5 = new String(byArray, 0, n26 + 18, 22);
                n41 = mmajkkk.jAKkAmA(byArray, n26);
                kmaamkaArray[n25].kKamAjA(string5);
                by3 = (byte)(mmajkkk.aKKAmAj(byArray, n26 + 14) & 3);
                n40 = mmajkkk.jAKkAmA(byArray, n26 + 4);
                n39 = mmajkkk.jAKkAmA(byArray, n26 + 8);
                by2 = byArray[n26 + 16];
                by = byArray[n26 + 12];
                byte by4 = byArray[n26 + 13];
                kmaamkaArray[n25].KKamAjA(by2);
                kmaamkaArray[n25].KkAMAjA(by);
                kmaamkaArray[n25].KKAMAjA(by4);
                n38 = byArray[n26 + 15];
                n37 = n38 & 0xFF;
                kmaamkaArray[n25].KKaMAjA(n37);
                n36 = 0;
                n34 = n35 = n3 + n2;
                n33 = n41;
                n32 = n35;
                if ((mmajkkk.aKKAmAj(byArray, n26 + 14) & 0x10) != 0) {
                    n33 /= 2;
                    n40 /= 2;
                    n39 /= 2;
                    n31 = 0;
                    while (n31 < n41 / 2) {
                        byArray[n34] = (byte)((n36 += mmajkkk.AKkAmAj(byArray, n35)) >>> 8);
                        n35 += 2;
                        ++n34;
                        ++n31;
                    }
                } else {
                    n31 = 0;
                    while (n31 < n41) {
                        n36 += byArray[n35];
                        n36 = (byte)n36;
                        byArray[n35] = (byte)n36;
                        ++n35;
                        ++n31;
                    }
                }
                kmaamkaArray[n25].kKAMAjA(byArray, n32, n33);
                kmaamkaArray[n25].kkAMAjA(by3, n40, n39);
                n2 += n41;
                ++n25;
                n26 += n;
                ++n42;
            }
            n26 += n2;
            ++n5;
        }
        maaakkk2.MajAkKa = n15;
        maaakkk2.MaJAkKa = kmaakkk2;
        maaakkk2.maJAkKa = mmajkmkArray;
        maaakkk2.MAJAkKa = kmaamkaArray;
        maaakkk2.mAJAkKa = mmjammkArray;
        kmaakkk2.JAKKama(maaakkk2);
        return maaakkk2;
    }

    public kajamka() {
        super();
    }

    static {
    }
}

