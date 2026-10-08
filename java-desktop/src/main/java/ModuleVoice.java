import muhmu.hifi.device.MAD;
import muhmu.hifi.device.Mixable;

// 
// Decompiled by Procyon v0.6.0
// 

public class ModuleVoice implements Mixable
{
    ModuleSample akkAMaj;
    int AKkAMaj;
    int aKkAMaj;
    int AkKamaj;
    int akKamaj;
    int AKKamaj;
    int aKKamaj;
    int Akkamaj;
    int akkamaj;
    int AKkamaj;
    boolean aKkamaj;
    static final byte AkKAmaj = 1;
    static final byte akKAmaj = 2;
    static final byte AKKAmaj = 3;
    static final byte aKKAmaj = 4;
    static final byte AkkAmaj = 5;
    static final byte akkAmaj = 6;
    static final byte AKkAmaj = 7;
    static final byte aKkAmaj = 8;
    static final byte AkKaMAj = 9;
    static final byte akKaMAj = 10;
    static final byte AKKaMAj = 11;
    byte aKKaMAj;
    int AkkaMAj;
    int akkaMAj;
    int AKkaMAj;
    int aKkaMAj;
    int AkKAMAj;
    int akKAMAj;
    int AKKAMAj;
    int[] aKKAMAj;
    int AkkAMAj;
    int akkAMAj;
    int AKkAMAj;
    int aKkAMAj;
    int AkKamAj;
    int akKamAj;
    int AKKamAj;
    int aKKamAj;
    int AkkamAj;
    int akkamAj;
    int AKkamAj;
    int aKkamAj;
    int AkKAmAj;
    static final int[] akKAmAj;
    static final int[] AKKAmAj;
    static final int[] aKKAmAj;
    
    public void kKaMAJa(final boolean aKkamaj) {
        this.aKkamaj = aKkamaj;
    }
    
    public void KkaMAJa(final int n) {
        int aKkAMaj2;
        int aKkAMaj;
        if (n <= 0) {
            aKkAMaj = (aKkAMaj2 = 0);
        }
        else if (n > 64) {
            aKkAMaj = (aKkAMaj2 = 64);
        }
        else {
            aKkAMaj = n;
            aKkAMaj2 = n;
        }
        this.AKkAMaj = aKkAMaj2;
        this.aKkAMaj = aKkAMaj;
    }
    
    public void kkAmaJa(final int n) {
        final int n2 = this.AKkAMaj + n;
        this.aKkAMaj = ((n2 <= 0) ? 0 : ((n2 > 64) ? 64 : n2));
    }
    
    public void kKAmaJa(final int n) {
        final int n2 = this.aKkAMaj + n;
        this.aKkAMaj = ((n2 <= 0) ? 0 : ((n2 > 64) ? 64 : n2));
    }
    
    public void KKamaJa(final int n) {
        this.aKkAMaj = ((n <= 0) ? 0 : ((n > 64) ? 64 : n));
    }
    
    public void KkAmaJa(final int n) {
        this.Akkamaj = n;
        this.akkamaj = n;
        this.AKkamaj = ModuleSample.kKaMAjA(this.akkamaj);
    }
    
    public void kkamAJa(final int n) {
        this.akkamaj = this.Akkamaj + n;
        this.AKkamaj = ModuleSample.kKaMAjA(this.akkamaj);
    }
    
    public void KKamAJa(final int n) {
        this.akkamaj += n;
        this.AKkamaj = ModuleSample.kKaMAjA(this.akkamaj);
    }
    
    public void kKAMAJa(final int n) {
        int akKamaj2;
        int akKamaj;
        if (n <= 0) {
            akKamaj = (akKamaj2 = 0);
        }
        else if (n > 255) {
            akKamaj = (akKamaj2 = 255);
        }
        else {
            akKamaj = n;
            akKamaj2 = n;
        }
        this.AkKamaj = akKamaj2;
        this.akKamaj = akKamaj;
    }
    
    public void kkamaJa(final int n) {
        this.akKamaj = ((n <= 0) ? 0 : ((n > 255) ? 255 : n));
    }
    
    public void kkaMAJa(final int n) {
        final int n2 = this.AkKamaj + n;
        this.akKamaj = ((n2 <= 0) ? 0 : ((n2 > 255) ? 255 : n2));
    }
    
    public void KKaMAJa(final ModuleSample kmaamka, final int n) {
        this.KkamaJa(kmaamka, n, true);
    }
    
    public void KkamaJa(final ModuleSample akkAMaj, final int n, final boolean b) {
        if (akkAMaj == null) {
            this.KKAmaJa();
            return;
        }
        this.akkAMaj = akkAMaj;
        this.KkAmaJa(this.akkAMaj.KkaMAjA(n));
        if (b) {
            this.KkaMAJa(this.akkAMaj.KKAMAja);
        }
        this.aKKamaj = 0;
        this.AkKamaj = this.akkAMaj.kKaMAja;
    }
    
    public void KkamAJa() {
        this.KKAMAJa(true);
    }
    
    public void KKAMAJa(final boolean b) {
        if (this.akkAMaj == null) {
            return;
        }
        if (b) {
            this.KkaMAJa(this.akkAMaj.KKAMAja);
        }
        this.aKKamaj = 0;
        this.AkKamaj = this.akkAMaj.kKaMAja;
    }
    
    public void kKamAJa(final int n, final boolean b) {
        if (this.akkAMaj == null) {
            return;
        }
        this.KkAmaJa(this.akkAMaj.KkaMAjA(n));
        if (b) {
            this.KkaMAJa(this.akkAMaj.KKAMAja);
        }
        this.aKKamaj = 0;
        this.AkKamaj = this.akkAMaj.kKaMAja;
    }
    
    public void kkAMAJa() {
        if (this.akkAMaj == null) {
            return;
        }
        this.KkaMAJa(this.akkAMaj.KKAMAja);
    }
    
    public void KKAmaJa() {
        this.aKKamaj = -1;
    }
    
    public void KkAMAJa(final int n) {
        if (this.akkAMaj == null) {
            return;
        }
        if (n >= this.akkAMaj.kKamAja) {
            this.aKKamaj = -1;
            return;
        }
        this.aKKamaj = n << 12;
    }
    
    public boolean mix(final MAD mad, final int[] array, final int n, final int n2) {
        if (this.aKKamaj == -1) {
            return true;
        }
        if (!this.aKkamaj) {
            return true;
        }
        if (this.akkAMaj.KKamAja.length == 0) {
            return true;
        }
        final int n3 = this.aKkAMaj * mad.boost >> 6;
        final int n4 = this.AKkamaj / mad.frequency;
        if (mad.stereo) {
            this.aKKamaj = this.akkAMaj.kkaMAjA(array, n, n2, this.aKKamaj, n4, n3, this.AkKamaj);
        }
        else {
            this.aKKamaj = this.akkAMaj.kkaMAjA(array, n, n2, this.aKKamaj, n4, n3, 0);
        }
        return true;
    }
    
    public void kKAmAJa(final boolean b) {
        int n = 0;
        int n2 = 0;
        final int n3 = 0;
        if (b) {
            if (this.aKKaMAj == 5) {
                int n4 = ModuleVoice.AKKAmAj[this.akkamAj & 0x1F] * this.aKKamAj >> 5;
                if ((this.akkamAj & 0x20) != 0x0) {
                    n4 = -n4;
                }
                n2 = n4;
                this.akkamAj += this.AkkamAj;
            }
            if (this.aKKaMAj == 11) {
                int n5 = ModuleVoice.AKKAmAj[this.AkKAmAj & 0x1F] * this.AKkamAj >> 6;
                if ((this.AkKAmAj & 0x20) != 0x0) {
                    n5 = -n5;
                }
                n = n5;
                this.AkKAmAj += this.aKkamAj;
            }
            this.aKKaMAj = 0;
        }
        else {
            switch (this.aKKaMAj) {
                case 10: {
                    this.KkaMAJa(this.AKkAMaj + this.AkkaMAj);
                }
                case 2: {
                    this.Akkamaj += this.AKkaMAj;
                    if (this.AKkaMAj < 0 ^ this.Akkamaj > this.akKAMAj) {
                        this.KkAmaJa(this.akKAMAj);
                        break;
                    }
                    this.KkAmaJa(this.Akkamaj);
                    break;
                }
                case 3: {
                    this.KkAmaJa(this.Akkamaj += this.aKkaMAj);
                    break;
                }
                case 4: {
                    this.KkAmaJa(this.Akkamaj += this.AkKAMAj);
                    break;
                }
                case 1: {
                    this.KkaMAJa(this.AKkAMaj + this.AkkaMAj);
                    break;
                }
                case 6: {
                    n2 += this.aKKAMAj[this.AKKAMAj++];
                    if (this.AKKAMAj == 3) {
                        this.AKKAMAj = 0;
                        break;
                    }
                    break;
                }
                case 7: {
                    this.kKAMAJa(this.AkKamaj + this.akkaMAj);
                    break;
                }
                case 8: {
                    final int akKamAj = this.AKKamAj - 1;
                    this.AKKamAj = akKamAj;
                    if (akKamAj == 0) {
                        this.KKAMAJa(false);
                        this.aKKaMAj = 0;
                        break;
                    }
                    break;
                }
                case 9: {
                    this.KkaMAJa(this.AKkAMaj + this.AkkaMAj);
                }
                case 5: {
                    int n6 = ModuleVoice.AKKAmAj[this.akkamAj & 0x1F] * this.aKKamAj >> 5;
                    if ((this.akkamAj & 0x20) != 0x0) {
                        n6 = -n6;
                    }
                    n2 += n6;
                    this.akkamAj += this.AkkamAj;
                    break;
                }
                case 11: {
                    int n7 = ModuleVoice.AKKAmAj[this.AkKAmAj & 0x1F] * this.AKkamAj >> 6;
                    if ((this.AkKAmAj & 0x20) != 0x0) {
                        n7 = -n7;
                    }
                    n = n7;
                    this.AkKAmAj += this.aKkamAj;
                    break;
                }
            }
        }
        this.kkamAJa(n2);
        this.kkAmaJa(n);
        this.kkaMAJa(n3);
    }
    
    public ModuleVoice() {
        this.AKkAMaj = 64;
        this.aKkAMaj = 64;
        this.AkKamaj = 128;
        this.akKamaj = 128;
        this.aKKamaj = -1;
        this.aKkamaj = true;
        this.aKKAMAj = new int[3];
    }
    
    static {
        akKAmAj = new int[768];
        AKKAmAj = new int[32];
        aKKAmAj = new int[256];
        for (int i = 0; i < 256; ++i) {
            ModuleVoice.aKKAmAj[i] = (int)(-Math.sin(i / 256.0 * 3.141592653589793 * 2.0) * 64.55);
        }
        for (int j = 0; j < 768; ++j) {
            ModuleVoice.akKAmAj[j] = (int)(8363.0 * Math.pow(2.0, (4608.0 - j) / 768.0));
        }
        for (int k = 0; k < 32; ++k) {
            ModuleVoice.AKKAmAj[k] = (int)(Math.sin(k / 32.0 * 3.141592653589793) * 255.0);
        }
    }
}
