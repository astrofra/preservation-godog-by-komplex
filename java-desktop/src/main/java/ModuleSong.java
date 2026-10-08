/*
 * Decompiled with CFR 0.152.
 */
public class ModuleSong
implements MixerBusListener {
    public ModuleSequencer MaJAkKa;
    public ModulePattern[] maJAkKa;
    public ModuleSample[] MAJAkKa;
    public ModuleInstrument[] mAJAkKa;
    public int MajAkKa;
    public int majAkKa;
    public int MAjAkKa;
    public String mAjAkKa;
    ModulePattern AmAjAkK;
    int amAjAkK;
    int AMAjAkK;
    int aMAjAkK;
    public ModuleChannel[] AmajAkK;
    MixerBus amajAkK;
    ScriptEventScheduler AMajAkK;
    boolean aMajAkK = false;
    SongPositionQueue AmAJAkK = new SongPositionQueue();

    public void JakkAMa(MixerBus mmajmma2) {
        this.amajAkK = mmajmma2;
        this.amajAkK.MAjAkkA();
        this.amajAkK.mAjAkkA(this);
        this.amAjAkK = this.MAjAkKa;
        this.AMAjAkK = this.majAkKa;
        this.amajAkK.MaJaKKA(ModuleSong.JAkkAMa(this.AMAjAkK));
        this.AmajAkK = new ModuleChannel[this.MajAkKa];
        int n = 0;
        while (n < this.MajAkKa) {
            ModuleChannel majakka2;
            this.AmajAkK[n] = majakka2 = new ModuleChannel();
            this.amajAkK.MajAkkA(n, majakka2);
            ++n;
        }
        this.MaJAkKa.rewind();
        this.aMAjAkK = 0;
    }

    public void JAKkAMa(ScriptEventScheduler kmjakkk2) {
        this.AMajAkK = kmjakkk2;
    }

    static final float JAkkAMa(int n) {
        float f = 1.0f / ((float)n / 125.0f) / 50.0f;
        return f;
    }

    public void onMixerTick(MixerBus mmajmma2) {
        int n;
        if (this.aMAjAkK-- == 0) {
            n = 0;
            while (n < this.MajAkKa) {
                this.AmajAkK[n].kKAmAJa(true);
                ++n;
            }
            int n2 = this.MaJAkKa.orderIndex;
            int n3 = this.MaJAkKa.rowIndex;
            if (this.AMajAkK != null) {
                this.AMajAkK.schedulePosition((n2 << 8) + n3, mmajmma2.majAKKA);
            }
            this.jaKkAMa((n2 << 8) + n3, mmajmma2.majAKKA);
            byte[] byArray = this.MaJAkKa.nextRow();
            this.jAkkAMa(byArray);
            this.aMAjAkK = this.amAjAkK - 1;
        } else {
            n = 0;
            while (n < this.MajAkKa) {
                this.AmajAkK[n].kKAmAJa(false);
                ++n;
            }
        }
        n = 0;
        while (n < this.MajAkKa) {
            this.AmajAkK[n].AmAjaKk();
            ++n;
        }
    }

    ModuleInstrument JaKKAMa(int n) {
        if (n < 0 || n >= this.mAJAkKa.length) {
            return null;
        }
        return this.mAJAkKa[n];
    }

    void jAkkAMa(byte[] byArray) {
        boolean bl = false;
        int n = 0;
        boolean bl2 = false;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (n4 < this.MajAkKa) {
            int n5;
            ModuleChannel majakka2 = this.AmajAkK[n4];
            byte by = byArray[n3 + 2];
            int n6 = byArray[n3] & 0xFF;
            if (n6 != 0 && n6 <= 96) {
                if (by != 3) {
                    n5 = byArray[n3 + 1];
                    if (n5 == 0) {
                        majakka2.kKamAJa(n6, false);
                    } else {
                        ModuleInstrument mmjammk2 = this.JaKKAMa(n5 - 1);
                        majakka2.AMaJAKk(mmjammk2, n6);
                        majakka2.akkamAj = 0;
                        majakka2.AkKAmAj = 0;
                    }
                    if (by == 9) {
                        majakka2.KkAMAJa((byArray[n3 + 3] & 0xFF) << 8);
                    }
                } else if (byArray[n3 + 1] != 0) {
                    majakka2.kkAMAJa();
                }
            } else {
                n5 = byArray[n3 + 1];
                if (n5 > 0) {
                    majakka2.kkAMAJa();
                    majakka2.akkamAj = 0;
                    majakka2.AkKAmAj = 0;
                }
                if (n6 > 96) {
                    majakka2.KKAmaJa();
                }
            }
            if ((n5 = byArray[n3 + 4]) != 0) {
                if ((n5 &= 0xFF) <= 80 && n5 >= 16) {
                    majakka2.KkaMAJa(n5 - 16);
                } else {
                    int n7 = n5 & 0xF;
                    switch ((n5 & 0xF0) >> 4) {
                        case 6: {
                            majakka2.KkaMAJa(majakka2.AKkAMaj - n7 * 2);
                            break;
                        }
                        case 7: {
                            majakka2.KkaMAJa(majakka2.AKkAMaj + n7 * 2);
                            break;
                        }
                        case 8: {
                            majakka2.KkaMAJa(majakka2.AKkAMaj - n7);
                            break;
                        }
                        case 9: {
                            majakka2.KkaMAJa(majakka2.AKkAMaj + n7);
                            break;
                        }
                        case 12: {
                            majakka2.kKAMAJa(n7 << 4);
                            break;
                        }
                        case 13: {
                            if (n7 == 0) break;
                            majakka2.aKKaMAj = (byte)7;
                            majakka2.akkaMAj = -n7;
                            break;
                        }
                        case 14: {
                            if (n7 == 0) break;
                            majakka2.aKKaMAj = (byte)7;
                            majakka2.akkaMAj = n7;
                            break;
                        }
                        default: {
                            if (!this.aMajAkK) break;
                            System.out.print("unsup volcmd " + ((n5 & 0xF0) >> 4) + " ");
                            break;
                        }
                    }
                }
            }
            int n8 = byArray[n3 + 3] & 0xFF;
            block9 : switch (by) {
                case 0: {
                    if (n8 == 0) break;
                    majakka2.aKKaMAj = (byte)6;
                    majakka2.aKKAMAj[0] = 0;
                    majakka2.aKKAMAj[1] = -(n8 & 0xF) * 64;
                    majakka2.aKKAMAj[2] = -((n8 & 0xF0) >> 4) * 64;
                    majakka2.AKKAMAj = 0;
                    break;
                }
                case 1: {
                    majakka2.aKKaMAj = (byte)3;
                    if (n8 == 0) break;
                    majakka2.aKkaMAj = -n8 * 4;
                    break;
                }
                case 2: {
                    majakka2.aKKaMAj = (byte)4;
                    if (n8 == 0) break;
                    majakka2.AkKAMAj = n8 * 4;
                    break;
                }
                case 3: {
                    if (majakka2.akkAMaj == null) break;
                    majakka2.aKKaMAj = (byte)2;
                    if (n8 != 0) {
                        majakka2.AKkaMAj = byArray[n3 + 1] != 0 ? n8 << 2 : n8 << 1;
                    }
                    if (n6 != 0) {
                        majakka2.akKAMAj = majakka2.akkAMaj.KkaMAjA(n6);
                    }
                    if (!(majakka2.akKAMAj < majakka2.Akkamaj ^ majakka2.AKkaMAj < 0)) break;
                    majakka2.AKkaMAj = -majakka2.AKkaMAj;
                    break;
                }
                case 4: {
                    majakka2.aKKaMAj = (byte)5;
                    if ((n8 & 0xF) != 0) {
                        majakka2.aKKamAj = n8 & 0xF;
                    }
                    if ((n8 & 0xF0) == 0) break;
                    majakka2.AkkamAj = (n8 & 0xF0) >> 4;
                    break;
                }
                case 5: {
                    majakka2.aKKaMAj = (byte)10;
                    if ((n8 & 0xF) != 0) {
                        majakka2.AkkaMAj = -(n8 & 0xF);
                    }
                    if ((n8 & 0xF0) == 0) break;
                    majakka2.AkkaMAj = n8 >> 4;
                    break;
                }
                case 6: {
                    majakka2.aKKaMAj = (byte)9;
                    if ((n8 & 0xF) != 0) {
                        majakka2.AkkaMAj = -(n8 & 0xF);
                    }
                    if ((n8 & 0xF0) == 0) break;
                    majakka2.AkkaMAj = n8 >> 4;
                    break;
                }
                case 7: {
                    majakka2.aKKaMAj = (byte)11;
                    if ((n8 & 0xF) != 0) {
                        majakka2.AKkamAj = n8 & 0xF;
                    }
                    if ((n8 & 0xF0) == 0) break;
                    majakka2.aKkamAj = (n8 & 0xF0) >> 4;
                    break;
                }
                case 8: {
                    majakka2.kKAMAJa(n8);
                    break;
                }
                case 10: {
                    majakka2.aKKaMAj = 1;
                    if ((n8 & 0xF) != 0) {
                        majakka2.AkkaMAj = -(n8 & 0xF);
                    }
                    if ((n8 & 0xF0) == 0) break;
                    majakka2.AkkaMAj = n8 >> 4;
                    break;
                }
                case 11: {
                    bl2 = true;
                    n2 = n8;
                    break;
                }
                case 12: {
                    majakka2.KkaMAJa(n8);
                    break;
                }
                case 13: {
                    bl = true;
                    n = n8;
                    break;
                }
                case 14: {
                    int n9 = n8 & 0xF;
                    switch ((n8 & 0xF0) >> 4) {
                        case 1: {
                            if (n9 != 0) {
                                majakka2.AkkAMAj = n9;
                            }
                            majakka2.KkAmaJa(majakka2.Akkamaj - majakka2.AkkAMAj * 4);
                            break block9;
                        }
                        case 2: {
                            if (n9 != 0) {
                                majakka2.akkAMAj = n9;
                            }
                            majakka2.KkAmaJa(majakka2.Akkamaj + majakka2.akkAMAj * 4);
                            break block9;
                        }
                        case 9: {
                            if (n9 != 0) {
                                majakka2.aKKaMAj = (byte)8;
                                majakka2.AKKamAj = n9;
                                break block9;
                            }
                            majakka2.KKAMAJa(false);
                            break block9;
                        }
                        case 10: {
                            if (n9 != 0) {
                                majakka2.AKkAMAj = n9;
                            }
                            majakka2.KkaMAJa(majakka2.AKkAMaj + majakka2.AKkAMAj);
                            break block9;
                        }
                        case 11: {
                            if (n9 != 0) {
                                majakka2.aKkAMAj = n9;
                            }
                            majakka2.KkaMAJa(majakka2.AKkAMaj - majakka2.aKkAMAj);
                            break block9;
                        }
                    }
                    if (!this.aMajAkK) break;
                    System.out.print("unsup cmd E" + ((n8 & 0xF0) >> 4) + " ");
                    break;
                }
                case 15: {
                    if (n8 < 32) {
                        this.amAjAkK = n8;
                        break;
                    }
                    this.AMAjAkK = n8;
                    this.amajAkK.MaJaKKA(ModuleSong.JAkkAMa(this.AMAjAkK));
                    break;
                }
                case 33: {
                    int n9 = n8 & 0xF;
                    switch ((n8 & 0xF0) >> 4) {
                        case 1: {
                            if (n9 != 0) {
                                majakka2.AkKamAj = n9;
                            }
                            majakka2.KkAmaJa(majakka2.Akkamaj - majakka2.AkKamAj);
                            break block9;
                        }
                        case 2: {
                            if (n9 != 0) {
                                majakka2.akKamAj = n9;
                            }
                            majakka2.KkAmaJa(majakka2.Akkamaj + majakka2.akKamAj);
                            break block9;
                        }
                    }
                    if (!this.aMajAkK) break;
                    System.out.print("unsup cmd X" + ((n8 & 0xF0) >> 4) + " ");
                    break;
                }
                default: {
                    if (!this.aMajAkK) break;
                    System.out.print("unsup cmd " + by + " ");
                }
                case 9: 
            }
            ++n4;
            n3 += 5;
        }
        if (bl) {
            this.MaJAkKa.advanceOrder();
            this.MaJAkKa.seekRow(n);
            return;
        }
        if (bl2) {
            this.MaJAkKa.seekOrder(n2);
        }
    }

    public void jaKkAMa(int n, long l) {
        this.AmAJAkK.publish(n, l);
    }

    public int jakkAMa(int n) {
        return this.AmAJAkK.awaitAndSleepUntil(n);
    }

    public boolean JAKKAMa(int n) {
        return this.AmAJAkK.hasReached(n, 0);
    }

    public boolean jaKKAMa(int n, int n2) {
        return this.AmAJAkK.hasReached(n, n2);
    }

    public void jAKkAMa() {
        this.AmAJAkK.dump();
    }

    public ModuleSong() {
        super();
    }
}

