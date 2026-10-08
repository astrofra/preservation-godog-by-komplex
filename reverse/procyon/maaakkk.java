import muhmu.hifi.device.Mixable;

// 
// Decompiled by Procyon v0.6.0
// 

public class maaakkk implements majamma
{
    public kmaakkk MaJAkKa;
    public mmajkmk[] maJAkKa;
    public kmaamka[] MAJAkKa;
    public mmjammk[] mAJAkKa;
    public int MajAkKa;
    public int majAkKa;
    public int MAjAkKa;
    public String mAjAkKa;
    mmajkmk AmAjAkK;
    int amAjAkK;
    int AMAjAkK;
    int aMAjAkK;
    public majakka[] AmajAkK;
    mmajmma amajAkK;
    kmjakkk AMajAkK;
    boolean aMajAkK;
    kmjakka AmAJAkK;
    
    public void JakkAMa(final mmajmma amajAkK) {
        (this.amajAkK = amajAkK).MAjAkkA();
        this.amajAkK.mAjAkkA(this);
        this.amAjAkK = this.MAjAkKa;
        this.AMAjAkK = this.majAkKa;
        this.amajAkK.MaJaKKA(JAkkAMa(this.AMAjAkK));
        this.AmajAkK = new majakka[this.MajAkKa];
        for (int i = 0; i < this.MajAkKa; ++i) {
            final majakka majakka = new majakka();
            this.AmajAkK[i] = majakka;
            this.amajAkK.MajAkkA(i, majakka);
        }
        this.MaJAkKa.jakKama();
        this.aMAjAkK = 0;
    }
    
    public void JAKkAMa(final kmjakkk aMajAkK) {
        this.AMajAkK = aMajAkK;
    }
    
    static final float JAkkAMa(final int n) {
        return 1.0f / (n / 125.0f) / 50.0f;
    }
    
    public void MAjakKa(final mmajmma mmajmma) {
        if (this.aMAjAkK-- == 0) {
            for (int i = 0; i < this.MajAkKa; ++i) {
                this.AmajAkK[i].kKAmAJa(true);
            }
            final int mAjakKa = this.MaJAkKa.MAjakKa;
            final int mAjakKa2 = this.MaJAkKa.mAjakKa;
            if (this.AMajAkK != null) {
                this.AMajAkK.JakKAMA((mAjakKa << 8) + mAjakKa2, mmajmma.majAKKA);
            }
            this.jaKkAMa((mAjakKa << 8) + mAjakKa2, mmajmma.majAKKA);
            this.jAkkAMa(this.MaJAkKa.JakKama());
            this.aMAjAkK = this.amAjAkK - 1;
        }
        else {
            for (int j = 0; j < this.MajAkKa; ++j) {
                this.AmajAkK[j].kKAmAJa(false);
            }
        }
        for (int k = 0; k < this.MajAkKa; ++k) {
            this.AmajAkK[k].AmAjaKk();
        }
    }
    
    mmjammk JaKKAMa(final int n) {
        if (n < 0 || n >= this.mAJAkKa.length) {
            return null;
        }
        return this.mAJAkKa[n];
    }
    
    void jAkkAMa(final byte[] array) {
        boolean b = false;
        int n = 0;
        boolean b2 = false;
        int n2 = 0;
        int n3 = 0;
        int i = 0;
    Label_1651_Outer:
        while (i < this.MajAkKa) {
            final majakka majakka = this.AmajAkK[i];
            final byte j = array[n3 + 2];
            final int n4 = array[n3] & 0xFF;
            if (n4 != 0 && n4 <= 96) {
                if (j != 3) {
                    final byte b3 = array[n3 + 1];
                    if (b3 == 0) {
                        majakka.kKamAJa(n4, false);
                    }
                    else {
                        majakka.AMaJAKk(this.JaKKAMa(b3 - 1), n4);
                        majakka.akkamAj = 0;
                        majakka.AkKAmAj = 0;
                    }
                    if (j == 9) {
                        majakka.KkAMAJa((array[n3 + 3] & 0xFF) << 8);
                    }
                }
                else if (array[n3 + 1] != 0) {
                    majakka.kkAMAJa();
                }
            }
            else {
                if (array[n3 + 1] > 0) {
                    majakka.kkAMAJa();
                    majakka.akkamAj = 0;
                    majakka.AkKAmAj = 0;
                }
                if (n4 > 96) {
                    majakka.KKAmaJa();
                }
            }
            final byte b4 = array[n3 + 4];
            if (b4 != 0) {
                final int n5 = b4 & 0xFF;
                if (n5 <= 80 && n5 >= 16) {
                    majakka.KkaMAJa(n5 - 16);
                }
                else {
                    final int akkaMAj = n5 & 0xF;
                    switch ((n5 & 0xF0) >> 4) {
                        case 6: {
                            majakka.KkaMAJa(majakka.AKkAMaj - akkaMAj * 2);
                            break;
                        }
                        case 7: {
                            majakka.KkaMAJa(majakka.AKkAMaj + akkaMAj * 2);
                            break;
                        }
                        case 8: {
                            majakka.KkaMAJa(majakka.AKkAMaj - akkaMAj);
                            break;
                        }
                        case 9: {
                            majakka.KkaMAJa(majakka.AKkAMaj + akkaMAj);
                            break;
                        }
                        case 12: {
                            majakka.kKAMAJa(akkaMAj << 4);
                            break;
                        }
                        case 13: {
                            if (akkaMAj != 0) {
                                majakka.aKKaMAj = 7;
                                majakka.akkaMAj = -akkaMAj;
                                break;
                            }
                            break;
                        }
                        case 14: {
                            if (akkaMAj != 0) {
                                majakka.aKKaMAj = 7;
                                majakka.akkaMAj = akkaMAj;
                                break;
                            }
                            break;
                        }
                        default: {
                            if (this.aMajAkK) {
                                System.out.print("unsup volcmd " + ((n5 & 0xF0) >> 4) + " ");
                                break;
                            }
                            break;
                        }
                    }
                }
            }
            final int n6 = array[n3 + 3] & 0xFF;
            while (true) {
                switch (j) {
                    case 0: {
                        if (n6 != 0) {
                            majakka.aKKaMAj = 6;
                            majakka.aKKAMAj[0] = 0;
                            majakka.aKKAMAj[1] = -(n6 & 0xF) * 64;
                            majakka.aKKAMAj[2] = -((n6 & 0xF0) >> 4) * 64;
                            majakka.AKKAMAj = 0;
                        }
                        break Label_1651;
                    }
                    case 1: {
                        majakka.aKKaMAj = 3;
                        if (n6 != 0) {
                            majakka.aKkaMAj = -n6 * 4;
                        }
                        break Label_1651;
                    }
                    case 2: {
                        majakka.aKKaMAj = 4;
                        if (n6 != 0) {
                            majakka.AkKAMAj = n6 * 4;
                        }
                        break Label_1651;
                    }
                    case 3: {
                        if (majakka.akkAMaj == null) {
                            break Label_1651;
                        }
                        majakka.aKKaMAj = 2;
                        if (n6 != 0) {
                            if (array[n3 + 1] != 0) {
                                majakka.AKkaMAj = n6 << 2;
                            }
                            else {
                                majakka.AKkaMAj = n6 << 1;
                            }
                        }
                        if (n4 != 0) {
                            majakka.akKAMAj = majakka.akkAMaj.KkaMAjA(n4);
                        }
                        if (majakka.akKAMAj < majakka.Akkamaj ^ majakka.AKkaMAj < 0) {
                            majakka.AKkaMAj = -majakka.AKkaMAj;
                        }
                        break Label_1651;
                    }
                    case 4: {
                        majakka.aKKaMAj = 5;
                        if ((n6 & 0xF) != 0x0) {
                            majakka.aKKamAj = (n6 & 0xF);
                        }
                        if ((n6 & 0xF0) != 0x0) {
                            majakka.AkkamAj = (n6 & 0xF0) >> 4;
                        }
                        break Label_1651;
                    }
                    case 5: {
                        majakka.aKKaMAj = 10;
                        if ((n6 & 0xF) != 0x0) {
                            majakka.AkkaMAj = -(n6 & 0xF);
                        }
                        if ((n6 & 0xF0) != 0x0) {
                            majakka.AkkaMAj = n6 >> 4;
                        }
                        break Label_1651;
                    }
                    case 6: {
                        majakka.aKKaMAj = 9;
                        if ((n6 & 0xF) != 0x0) {
                            majakka.AkkaMAj = -(n6 & 0xF);
                        }
                        if ((n6 & 0xF0) != 0x0) {
                            majakka.AkkaMAj = n6 >> 4;
                        }
                        break Label_1651;
                    }
                    case 7: {
                        majakka.aKKaMAj = 11;
                        if ((n6 & 0xF) != 0x0) {
                            majakka.AKkamAj = (n6 & 0xF);
                        }
                        if ((n6 & 0xF0) != 0x0) {
                            majakka.aKkamAj = (n6 & 0xF0) >> 4;
                        }
                        break Label_1651;
                    }
                    case 10: {
                        majakka.aKKaMAj = 1;
                        if ((n6 & 0xF) != 0x0) {
                            majakka.AkkaMAj = -(n6 & 0xF);
                        }
                        if ((n6 & 0xF0) != 0x0) {
                            majakka.AkkaMAj = n6 >> 4;
                        }
                        break Label_1651;
                    }
                    case 14: {
                        final int aKkAMAj = n6 & 0xF;
                        switch ((n6 & 0xF0) >> 4) {
                            case 1: {
                                if (aKkAMAj != 0) {
                                    majakka.AkkAMAj = aKkAMAj;
                                }
                                majakka.KkAmaJa(majakka.Akkamaj - majakka.AkkAMAj * 4);
                                break Label_1651;
                            }
                            case 2: {
                                if (aKkAMAj != 0) {
                                    majakka.akkAMAj = aKkAMAj;
                                }
                                majakka.KkAmaJa(majakka.Akkamaj + majakka.akkAMAj * 4);
                                break Label_1651;
                            }
                            case 9: {
                                if (aKkAMAj != 0) {
                                    majakka.aKKaMAj = 8;
                                    majakka.AKKamAj = aKkAMAj;
                                    break Label_1651;
                                }
                                majakka.KKAMAJa(false);
                                break Label_1651;
                            }
                            case 10: {
                                if (aKkAMAj != 0) {
                                    majakka.AKkAMAj = aKkAMAj;
                                }
                                majakka.KkaMAJa(majakka.AKkAMaj + majakka.AKkAMAj);
                                break Label_1651;
                            }
                            case 11: {
                                if (aKkAMAj != 0) {
                                    majakka.aKkAMAj = aKkAMAj;
                                }
                                majakka.KkaMAJa(majakka.AKkAMaj - majakka.aKkAMAj);
                                break Label_1651;
                            }
                            default: {
                                if (this.aMajAkK) {
                                    System.out.print("unsup cmd E" + ((n6 & 0xF0) >> 4) + " ");
                                }
                                break Label_1651;
                            }
                        }
                        break;
                    }
                    case 15: {
                        if (n6 < 32) {
                            this.amAjAkK = n6;
                            break Label_1651;
                        }
                        this.AMAjAkK = n6;
                        this.amajAkK.MaJaKKA(JAkkAMa(this.AMAjAkK));
                        break Label_1651;
                    }
                    case 33: {
                        final int n7 = n6 & 0xF;
                        switch ((n6 & 0xF0) >> 4) {
                            case 1: {
                                if (n7 != 0) {
                                    majakka.AkKamAj = n7;
                                }
                                majakka.KkAmaJa(majakka.Akkamaj - majakka.AkKamAj);
                                break Label_1651;
                            }
                            case 2: {
                                if (n7 != 0) {
                                    majakka.akKamAj = n7;
                                }
                                majakka.KkAmaJa(majakka.Akkamaj + majakka.akKamAj);
                                break Label_1651;
                            }
                            default: {
                                if (this.aMajAkK) {
                                    System.out.print("unsup cmd X" + ((n6 & 0xF0) >> 4) + " ");
                                }
                                break Label_1651;
                            }
                        }
                        break;
                    }
                    default: {
                        if (this.aMajAkK) {
                            System.out.print("unsup cmd " + j + " ");
                        }
                        break Label_1651;
                    }
                    case 9: {
                        ++i;
                        n3 += 5;
                        continue Label_1651_Outer;
                    }
                    case 8: {
                        majakka.kKAMAJa(n6);
                        continue;
                    }
                    case 11: {
                        b2 = true;
                        n2 = n6;
                        continue;
                    }
                    case 12: {
                        majakka.KkaMAJa(n6);
                        continue;
                    }
                    case 13: {
                        b = true;
                        n = n6;
                        continue;
                    }
                }
                break;
            }
        }
        if (b) {
            this.MaJAkKa.JaKkAMa();
            this.MaJAkKa.JAkKama(n);
            return;
        }
        if (b2) {
            this.MaJAkKa.JaKKama(n2);
        }
    }
    
    public void jaKkAMa(final int n, final long n2) {
        this.AmAJAkK.AmAJAKk(n, n2);
    }
    
    public int jakkAMa(final int n) {
        return this.AmAJAkK.aMAJAKk(n);
    }
    
    public boolean JAKKAMa(final int n) {
        return this.AmAJAkK.AmaJAKk(n, 0);
    }
    
    public boolean jaKKAMa(final int n, final int n2) {
        return this.AmAJAkK.AmaJAKk(n, n2);
    }
    
    public void jAKkAMa() {
        this.AmAJAkK.amAJAKk();
    }
    
    public maaakkk() {
        this.aMajAkK = false;
        this.AmAJAkK = new kmjakka();
    }
}
