import java.awt.Point;

// 
// Decompiled by Procyon v0.6.0
// 

public class ModuleLoader
{
    static int KKaMaJA;
    static final int[] kKaMaJA;
    
    public static ModuleSong kKAmAjA(final byte[] array) {
        if (kkAmAjA(array)) {
            return KKAmAjA(array);
        }
        if (KkamAjA(array)) {
            return kkamAjA(array);
        }
        try {
            final ArchiveDecoder kaajkka = (ArchiveDecoder)Class.forName("muhmu.gl.ZipHoax").newInstance();
            kaajkka.aMajAKk(array);
            byte[] amAjAKk;
            do {
                kaajkka.AmajAKk();
                if (kaajkka.aMAjAKk()) {
                    return null;
                }
                if (kaajkka.AMajAKk()) {
                    return null;
                }
                amAjAKk = kaajkka.amAjAKk();
                if (kkAmAjA(amAjAKk)) {
                    return KKAmAjA(amAjAKk);
                }
            } while (!KkamAjA(amAjAKk));
            return kkamAjA(amAjAKk);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static boolean kkAmAjA(final byte[] ascii) {
        final int n = 0;
        try {
            final String s = new String(ascii, 0, n + 1080, 4);
            int n2 = 0;
            if (s.equals("M.K.")) {
                n2 = 4;
            }
            if (s.equals("M!K!")) {
                n2 = 4;
            }
            if (s.equals("FLT4")) {
                n2 = 4;
            }
            if (s.equals("OCTA")) {
                n2 = 8;
            }
            if (s.substring(1, 4).equals("CHN")) {
                n2 = s.charAt(0) - '0';
            }
            if (s.substring(2, 4).equals("CH")) {
                n2 = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
            }
            if (s.substring(0, 3).equals("TDZ")) {
                n2 = s.charAt(3) - '0';
            }
            return n2 > 0;
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public static boolean KkamAjA(final byte[] ascii) {
        try {
            final String s = new String(ascii, 0, 0, 17);
            final int akkAmAj = ByteReaders.readUnsignedShortLE(ascii, 58);
            return s.equals("Extended Module: ") && akkAmAj >= 260;
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public static ModuleSong KKAmAjA(final byte[] ascii) {
        int offset = 0;
        final String str = new String(ascii, 0, offset + 1080, 4);
        if (ModuleLoader.KKaMaJA > 1) {
            System.out.println("sign=" + str);
        }
        int n = 0;
        if (str.equals("M.K.")) {
            n = 4;
        }
        if (str.equals("M!K!")) {
            n = 4;
        }
        if (str.equals("FLT4")) {
            n = 4;
        }
        if (str.equals("OCTA")) {
            n = 8;
        }
        if (str.substring(1, 4).equals("CHN")) {
            n = str.charAt(0) - '0';
        }
        if (str.substring(2, 4).equals("CH")) {
            n = (str.charAt(0) - '0') * 10 + (str.charAt(1) - '0');
        }
        if (str.substring(0, 3).equals("TDZ")) {
            n = str.charAt(3) - '0';
        }
        if (n <= 0) {
            if (ModuleLoader.KKaMaJA > 1) {
                System.out.println("MOD LOADER ERROR: invalid signature");
            }
            return null;
        }
        final String s = new String(ascii, 0, offset, 20);
        final int akkAmAj = ByteReaders.readUnsignedByte(ascii, offset + 950);
        int akkAmAj2 = ByteReaders.readUnsignedByte(ascii, offset + 951);
        if (akkAmAj2 >= akkAmAj) {
            akkAmAj2 = 0;
        }
        final ModuleSequencer maJAkKa = new ModuleSequencer();
        maJAkKa.loadOrderTable(ascii, offset + 952, akkAmAj);
        maJAkKa.setRestartOrder(akkAmAj2);
        int i = 0;
        for (int j = 0; j < 128; ++j) {
            final int akkAmAj3 = ByteReaders.readUnsignedByte(ascii, offset + 952 + j);
            if (akkAmAj3 > i) {
                i = akkAmAj3;
            }
        }
        final ModulePattern[] maJAkKa2 = new ModulePattern[++i];
        if (ModuleLoader.KKaMaJA > 1) {
            System.out.println("numChans=" + n);
        }
        if (ModuleLoader.KKaMaJA > 1) {
            System.out.println("numPatts=" + i);
        }
        if (ModuleLoader.KKaMaJA > 0) {
            System.out.println("loading MOD \"" + s + "\"");
        }
        offset += 1084;
        final byte[] array = new byte[31];
        for (int k = 0; k < i; ++k) {
            maJAkKa2[k] = new ModulePattern(64, n);
            for (int l = 0; l < 64; ++l) {
                for (int n2 = 0; n2 < n; ++n2) {
                    final int n3 = (ByteReaders.readUnsignedByte(ascii, offset) & 0xF) << 8 | ByteReaders.readUnsignedByte(ascii, offset + 1);
                    final int n4 = (ByteReaders.readUnsignedByte(ascii, offset) & 0xF0) + (ByteReaders.readUnsignedByte(ascii, offset + 2) >> 4);
                    final int n5 = ByteReaders.readUnsignedByte(ascii, offset + 2) & 0xF;
                    final int akkAmAj4 = ByteReaders.readUnsignedByte(ascii, offset + 3);
                    if (n4 > 0) {
                        array[n4 - 1] = 1;
                    }
                    int n6 = 0;
                    if (n3 > 0) {
                        for (n6 = 0; n6 < 72 && n3 < ModuleLoader.kKaMaJA[n6]; ++n6) {}
                        n6 += 24;
                        n6 -= 31;
                    }
                    maJAkKa2[k].setCell(l, n2, n6, n4, n5, akkAmAj4, 0);
                    offset += 4;
                }
            }
        }
        final int n7 = 31;
        final ModuleSample[] majAkKa = new ModuleSample[n7];
        final ModuleInstrument[] majAkKa2 = new ModuleInstrument[n7];
        for (int n8 = 0; n8 < n7; ++n8) {
            final int offset2 = 20 + n8 * 30;
            final int n9 = 2 * ByteReaders.readUnsignedShortBE(ascii, offset2 + 22);
            int n10 = 2 * ByteReaders.readUnsignedShortBE(ascii, offset2 + 26);
            int n11 = 2 * ByteReaders.readUnsignedShortBE(ascii, offset2 + 28);
            final String str2 = new String(ascii, 0, offset2, 21);
            if (ModuleLoader.KKaMaJA > 1) {
                System.out.println("samplename=" + str2);
            }
            if (n9 == 0) {
                majAkKa[n8] = null;
            }
            else {
                (majAkKa[n8] = new ModuleSample()).kKAMAjA(ascii, offset, n9);
            }
            (majAkKa2[n8] = new ModuleInstrument()).setSampleForAllNotes(majAkKa[n8]);
            if (majAkKa[n8] != null) {
                majAkKa[n8].kKamAjA(str2);
                majAkKa[n8].KKAMAjA(ByteReaders.readUnsignedByte(ascii, offset2 + 24));
                majAkKa[n8].KkAMAjA(ByteReaders.readUnsignedByte(ascii, offset2 + 25));
                if (n11 > 2) {
                    if (n10 > n9) {
                        n10 = n9;
                    }
                    if (n10 + n11 > n9) {
                        n11 = 20;
                    }
                    majAkKa[n8].kkAMAjA(1, n10, n11);
                }
            }
            offset += n9;
        }
        final ModuleSong maaakkk = new ModuleSong();
        maaakkk.mAjAkKa = s;
        maaakkk.majAkKa = 125;
        maaakkk.MAjAkKa = 6;
        maaakkk.MajAkKa = n;
        maaakkk.MaJAkKa = maJAkKa;
        maaakkk.maJAkKa = maJAkKa2;
        maaakkk.MAJAkKa = majAkKa;
        maaakkk.mAJAkKa = majAkKa2;
        maJAkKa.setSong(maaakkk);
        return maaakkk;
    }
    
    public static ModuleSong kkamAjA(final byte[] ascii) {
        final String str = new String(ascii, 0, 0, 17);
        final String mAjAkKa = new String(ascii, 0, 17, 20);
        final String str2 = new String(ascii, 0, 38, 20);
        final int akkAmAj = ByteReaders.readUnsignedShortLE(ascii, 58);
        final int jaKkAmA = ByteReaders.readIntLE(ascii, 60);
        final int akkAmAj2 = ByteReaders.readUnsignedShortLE(ascii, 64);
        final int akkAmAj3 = ByteReaders.readUnsignedShortLE(ascii, 66);
        final int akkAmAj4 = ByteReaders.readUnsignedShortLE(ascii, 68);
        int akkAmAj5 = ByteReaders.readUnsignedShortLE(ascii, 70);
        final int akkAmAj6 = ByteReaders.readUnsignedShortLE(ascii, 72);
        final int akkAmAj7 = ByteReaders.readUnsignedShortLE(ascii, 74);
        final int akkAmAj8 = ByteReaders.readUnsignedShortLE(ascii, 76);
        final int akkAmAj9 = ByteReaders.readUnsignedShortLE(ascii, 78);
        if (!str.equals("Extended Module: ") || akkAmAj < 260) {
            if (ModuleLoader.KKaMaJA > 1) {
                System.out.println("ERROR LOADING XM: Invalid module");
            }
            return null;
        }
        final ModuleSong maaakkk = new ModuleSong();
        maaakkk.MAjAkKa = akkAmAj8;
        maaakkk.majAkKa = akkAmAj9;
        final ModuleSequencer maJAkKa = new ModuleSequencer();
        maJAkKa.setRestartOrder(akkAmAj3);
        if (ModuleLoader.KKaMaJA > 1) {
            System.out.println("initializing song.");
        }
        final int n = akkAmAj5;
        int n2 = 0;
        for (int i = 0; i < akkAmAj2; ++i) {
            final int akkAmAj10 = ByteReaders.readUnsignedByte(ascii, 80 + i);
            if (akkAmAj10 > n2) {
                n2 = akkAmAj10;
            }
        }
        if (n2 >= akkAmAj5) {
            akkAmAj5 = n2 + 1;
        }
        maJAkKa.loadOrderTable(ascii, 80, akkAmAj2);
        final ModulePattern[] maJAkKa2 = new ModulePattern[akkAmAj5];
        final ModulePattern mmajkmk = new ModulePattern(64, akkAmAj4);
        int n3 = 0;
        int n4 = jaKkAmA + 60;
        if (ModuleLoader.KKaMaJA > 1) {
            System.out.println("signature=" + str);
        }
        if (ModuleLoader.KKaMaJA > 1) {
            System.out.println("name=" + mAjAkKa);
        }
        if (ModuleLoader.KKaMaJA > 1) {
            System.out.println("trackerName=" + str2);
        }
        if (ModuleLoader.KKaMaJA > 1) {
            System.out.println("version=" + akkAmAj);
        }
        if (ModuleLoader.KKaMaJA > 1) {
            System.out.println("headerSize=" + jaKkAmA);
        }
        if (ModuleLoader.KKaMaJA > 1) {
            System.out.println("songlen=" + akkAmAj2);
        }
        if (ModuleLoader.KKaMaJA > 1) {
            System.out.println("restart=" + akkAmAj3);
        }
        if (ModuleLoader.KKaMaJA > 1) {
            System.out.println("numChans=" + akkAmAj4);
        }
        if (ModuleLoader.KKaMaJA > 1) {
            System.out.println("numPatts=" + akkAmAj5);
        }
        if (ModuleLoader.KKaMaJA > 1) {
            System.out.println("numInsts=" + akkAmAj6);
        }
        if (ModuleLoader.KKaMaJA > 1) {
            System.out.println("flags=" + akkAmAj7);
        }
        if (ModuleLoader.KKaMaJA > 1) {
            System.out.println("speed=" + akkAmAj8);
        }
        if (ModuleLoader.KKaMaJA > 1) {
            System.out.println("tempo=" + akkAmAj9);
        }
        if (ModuleLoader.KKaMaJA > 0) {
            System.out.println("loading XM \"" + mAjAkKa + "\"");
        }
        maaakkk.mAjAkKa = mAjAkKa;
        final int n5 = akkAmAj6;
        for (int j = 0; j < akkAmAj5; ++j) {
            if (j < n) {
                final int jaKkAmA2 = ByteReaders.readIntLE(ascii, n4);
                ByteReaders.readUnsignedByte(ascii, n4 + 4);
                final int akkAmAj11 = ByteReaders.readUnsignedShortLE(ascii, n4 + 5);
                final int akkAmAj12 = ByteReaders.readUnsignedShortLE(ascii, n4 + 7);
                maJAkKa2[j] = new ModulePattern(akkAmAj11, akkAmAj4);
                int n6 = n4 + jaKkAmA2;
                for (int k = 0; k < akkAmAj11; ++k) {
                    for (int l = 0; l < akkAmAj4; ++l) {
                        int n7 = 0;
                        int n8 = 0;
                        int n9 = 0;
                        int n10 = 0;
                        int n11 = 0;
                        int n12 = ascii[n6++];
                        if (n12 < 0) {
                            if ((n12 & 0x1) != 0x0) {
                                n7 = ascii[n6++];
                            }
                        }
                        else {
                            n7 = n12;
                            n12 = 127;
                        }
                        if ((n12 & 0x2) != 0x0) {
                            n8 = ascii[n6++];
                        }
                        if ((n12 & 0x4) != 0x0) {
                            n11 = ascii[n6++];
                        }
                        if ((n12 & 0x8) != 0x0) {
                            n9 = ascii[n6++];
                        }
                        if ((n12 & 0x10) != 0x0) {
                            n10 = ascii[n6++];
                        }
                        maJAkKa2[j].setCell(k, l, n7, n8, n9, n10, n11);
                    }
                }
                n4 = n4 + jaKkAmA2 + akkAmAj12;
            }
            else {
                maJAkKa2[j] = mmajkmk;
            }
        }
        final ModuleInstrument[] majAkKa = new ModuleInstrument[n5];
        final ModuleSample[] majAkKa2 = new ModuleSample[akkAmAj6 * 20];
        for (int n13 = 0; n13 < akkAmAj6 * 20; ++n13) {
            majAkKa2[n13] = new ModuleSample();
        }
        int n14 = 0;
        int akkAmAj13 = 0;
        int jaKkAmA3 = 0;
        for (int n15 = 0; n15 < akkAmAj6; ++n15) {
            final int n16 = n3;
            int n17;
            if (n15 < n5) {
                majAkKa[n15] = new ModuleInstrument();
                final ModuleInstrument mmjammk = majAkKa[n15];
                final int jaKkAmA4 = ByteReaders.readIntLE(ascii, n4);
                final String str3 = new String(ascii, 0, n4 + 4, 22);
                ByteReaders.readUnsignedByte(ascii, n4 + 26);
                akkAmAj13 = ByteReaders.readUnsignedShortLE(ascii, n4 + 27);
                if (ModuleLoader.KKaMaJA > 1) {
                    System.out.println("samplename=" + str3);
                }
                n4 += 29;
                n17 = jaKkAmA4 - 29;
                if (akkAmAj13 != 0) {
                    boolean aMajAkk = false;
                    boolean aMajAkk2 = false;
                    boolean amAJAkk = false;
                    final byte b = ascii[n4 + 204];
                    if ((b & 0x1) != 0x0) {
                        aMajAkk = true;
                    }
                    if ((b & 0x4) != 0x0) {
                        aMajAkk2 = true;
                    }
                    if ((b & 0x2) != 0x0) {
                        amAJAkk = true;
                    }
                    final byte b2 = ascii[n4 + 196];
                    final byte b3 = ascii[n4 + 198];
                    final byte b4 = ascii[n4 + 199];
                    final byte b5 = ascii[n4 + 200];
                    final Point[] array = new Point[b2];
                    for (byte b6 = 0; b6 < b2; ++b6) {
                        array[b6] = new Point(ByteReaders.readUnsignedShortLE(ascii, n4 + 100 + b6 * 4), ByteReaders.readUnsignedShortLE(ascii, n4 + 100 + b6 * 4 + 2));
                    }
                    mmjammk.volumeEnvelope = new Envelope(array, b3, b4, b5);
                    mmjammk.volumeEnvelope.enabled = aMajAkk;
                    mmjammk.volumeEnvelope.loopEnabled = aMajAkk2;
                    mmjammk.volumeEnvelope.sustainEnabled = amAJAkk;
                    boolean aMajAkk3 = false;
                    boolean aMajAkk4 = false;
                    boolean amAJAkk2 = false;
                    final byte b7 = ascii[n4 + 205];
                    if ((b7 & 0x1) != 0x0) {
                        aMajAkk3 = true;
                    }
                    if ((b7 & 0x4) != 0x0) {
                        aMajAkk4 = true;
                    }
                    if ((b7 & 0x2) != 0x0) {
                        amAJAkk2 = true;
                    }
                    final byte b8 = ascii[n4 + 197];
                    final byte b9 = ascii[n4 + 201];
                    final byte b10 = ascii[n4 + 202];
                    final byte b11 = ascii[n4 + 203];
                    final Point[] array2 = new Point[b8];
                    for (byte b12 = 0; b12 < b8; ++b12) {
                        array2[b12] = new Point(ByteReaders.readUnsignedShortLE(ascii, n4 + 148 + b12 * 4), ByteReaders.readUnsignedShortLE(ascii, n4 + 148 + b12 * 4 + 2));
                    }
                    mmjammk.panningEnvelope = new Envelope(array2, b9, b10, b11);
                    mmjammk.panningEnvelope.enabled = aMajAkk3;
                    mmjammk.panningEnvelope.loopEnabled = aMajAkk4;
                    mmjammk.panningEnvelope.sustainEnabled = amAJAkk2;
                    mmjammk.volumeEnvelope.setFadeoutStep(ByteReaders.readUnsignedShortLE(ascii, n4 + 210));
                    final int akkAmAj14 = ByteReaders.readUnsignedByte(ascii, n4 + 206);
                    final int akkAmAj15 = ByteReaders.readUnsignedByte(ascii, n4 + 207);
                    final int akkAmAj16 = ByteReaders.readUnsignedByte(ascii, n4 + 208);
                    final int akkAmAj17 = ByteReaders.readUnsignedByte(ascii, n4 + 209);
                    mmjammk.jakKAMa = akkAmAj14;
                    mmjammk.JakKAMa = akkAmAj15;
                    mmjammk.jAKKAMa = (akkAmAj16 & 0xF) << 4;
                    mmjammk.JAKKAMa = (akkAmAj17 & 0x3F) << 2;
                    if (akkAmAj16 != 0) {
                        if (ModuleLoader.KKaMaJA > 1) {
                            System.out.println("dep=" + akkAmAj16);
                        }
                        if (ModuleLoader.KKaMaJA > 1) {
                            System.out.println("swe=" + akkAmAj15);
                        }
                        if (ModuleLoader.KKaMaJA > 1) {
                            System.out.println("spe=" + akkAmAj17);
                        }
                        if (ModuleLoader.KKaMaJA > 1) {
                            System.out.println("typ=" + akkAmAj14);
                        }
                    }
                    jaKkAmA3 = ByteReaders.readIntLE(ascii, n4);
                    for (int n18 = 0; n18 < 96; ++n18) {
                        final int akkAmAj18 = ByteReaders.readUnsignedByte(ascii, n4 + 4 + n18);
                        mmjammk.sampleByNote[n18] = majAkKa2[akkAmAj18 + n16];
                        if (akkAmAj18 >= n14) {
                            n14 = akkAmAj18 + 1;
                        }
                    }
                    n4 += 214;
                    n17 -= 214;
                }
                else {
                    n14 = 0;
                }
            }
            else {
                n17 = 0;
            }
            int n19 = n4 + n17;
            final int n20 = n19 + akkAmAj13 * jaKkAmA3;
            int n21 = 0;
            for (int n22 = 0; n22 < akkAmAj13; ++n22) {
                final String s = new String(ascii, 0, n19 + 18, 22);
                final int jaKkAmA5 = ByteReaders.readIntLE(ascii, n19);
                majAkKa2[n3].kKamAjA(s);
                final byte b13 = (byte)(ByteReaders.readUnsignedByte(ascii, n19 + 14) & 0x3);
                int jaKkAmA6 = ByteReaders.readIntLE(ascii, n19 + 4);
                int jaKkAmA7 = ByteReaders.readIntLE(ascii, n19 + 8);
                final byte b14 = ascii[n19 + 16];
                final byte b15 = ascii[n19 + 12];
                final byte b16 = ascii[n19 + 13];
                majAkKa2[n3].KKamAjA(b14);
                majAkKa2[n3].KkAMAjA(b15);
                majAkKa2[n3].KKAMAjA(b16);
                majAkKa2[n3].KKaMAjA(ascii[n19 + 15] & 0xFF);
                int n23 = 0;
                int n25;
                int n24 = n25 = n20 + n21;
                int n26 = jaKkAmA5;
                final int n27 = n24;
                if ((ByteReaders.readUnsignedByte(ascii, n19 + 14) & 0x10) != 0x0) {
                    n26 /= 2;
                    jaKkAmA6 /= 2;
                    jaKkAmA7 /= 2;
                    for (int n28 = 0; n28 < jaKkAmA5 / 2; ++n28) {
                        n23 += ByteReaders.readSignedShortLE(ascii, n24);
                        ascii[n25] = (byte)(n23 >>> 8);
                        n24 += 2;
                        ++n25;
                    }
                }
                else {
                    for (int n29 = 0; n29 < jaKkAmA5; ++n29) {
                        n23 = (byte)(n23 + ascii[n24]);
                        ascii[n24] = (byte)n23;
                        ++n24;
                    }
                }
                majAkKa2[n3].kKAMAjA(ascii, n27, n26);
                majAkKa2[n3].kkAMAjA(b13, jaKkAmA6, jaKkAmA7);
                n21 += jaKkAmA5;
                ++n3;
                n19 += jaKkAmA3;
            }
            n4 = n19 + n21;
        }
        maaakkk.MajAkKa = akkAmAj4;
        maaakkk.MaJAkKa = maJAkKa;
        maaakkk.maJAkKa = maJAkKa2;
        maaakkk.MAJAkKa = majAkKa2;
        maaakkk.mAJAkKa = majAkKa;
        maJAkKa.setSong(maaakkk);
        return maaakkk;
    }
    
    static {
        ModuleLoader.KKaMaJA = 1;
        kKaMaJA = new int[] { 1712, 1616, 1524, 1440, 1356, 1280, 1208, 1140, 1076, 1016, 960, 907, 856, 808, 762, 720, 678, 640, 604, 570, 538, 508, 480, 453, 428, 404, 381, 360, 339, 320, 302, 285, 269, 254, 240, 226, 214, 202, 190, 180, 170, 160, 151, 143, 135, 127, 120, 113, 107, 101, 95, 90, 85, 80, 75, 71, 67, 63, 60, 56, 53, 50, 47, 45, 42, 40, 37, 35, 33, 31, 30, 28 };
    }
}
