import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import desktop.audio.StreamAudioPlayer;
import desktop.audio.AudioClip;

// 
// Decompiled by Procyon v0.6.0
// 

final class kajakmk implements AudioClip, Runnable
{
    private int AKKAMAJ;
    private int aKKAMAJ;
    private int AkkAMAJ;
    private byte[] akkAMAJ;
    private int AKkAMAJ;
    private int aKkAMAJ;
    private boolean AkKamAJ;
    private boolean akKamAJ;
    private byte[] AKKamAJ;
    private int aKKamAJ;
    private mmaakka AkkamAJ;
    kajakmk akkamAJ;
    int AKkamAJ;
    static final int[] aKkamAJ;
    static final int[] AkKAmAJ;
    private maaamka akKAmAJ;
    private Thread AKKAmAJ;
    private mmajmmk aKKAmAJ;
    private kajamma AkkAmAJ;
    private int akkAmAJ;
    private byte[] AKkAmAJ;
    private boolean aKkAmAJ;
    private static byte[] AkKaMaj;
    int akKaMaj;
    int AKKaMaj;
    int aKKaMaj;
    int AkkaMaj;
    int[] akkaMaj;
    int[] AKkaMaj;
    static final int[] aKkaMaj;
    static final int[] AkKAMaj;
    static final int[] akKAMaj;
    static final int[] AKKAMaj;
    static final int[][] aKKAMaj;
    static final int[] AkkAMaj;
    
    int Kkamaja() {
        return this.AKKAMAJ & 0xF0;
    }
    
    kajakmk(final int akkamaj, final int akkamaj2, final byte[] akkAMAJ, final int n, final mmaakka akkamAJ) {
        this.akkaMaj = new int[2];
        this.AKkaMaj = new int[2];
        this.AKKAMAJ = akkamaj;
        this.akkAMAJ = akkAMAJ;
        this.aKkAMAJ = n;
        this.AKkAMAJ = n;
        this.AkkamAJ = akkamAJ;
        this.AkKamAJ = ((this.AKKAMAJ & 0x1) != 0x0);
        this.KkAmAJa();
        this.aKKAMAJ = akkamaj2;
        switch (kajakmk.aKkamAJ[this.AKKAMAJ >> 2 & 0x3]) {
            case 11025: {
                this.AkkAMAJ = (int)((akkamaj2 * 16000L + 11024L) / 11025L);
                return;
            }
            case 22050: {
                this.AkkAMAJ = (int)((akkamaj2 * 16000L + 22049L) / 22050L);
                return;
            }
            case 44100: {
                this.AkkAMAJ = (int)((akkamaj2 * 16000L + 44099L) / 44100L);
                return;
            }
            case 88200: {
                this.AkkAMAJ = (int)((akkamaj2 * 16000L + 88199L) / 88200L);
            }
            default: {}
        }
    }
    
    public synchronized void kKAmaja(final int n) {
        this.stop();
        if (this.AKKamAJ != null) {
            this.akKAmAJ = new maaamka(this.AKKamAJ, n, this.aKKamAJ, this.AkkamAJ);
            StreamAudioPlayer.player.start((InputStream)this.akKAmAJ);
        }
    }
    
    public synchronized void play() {
        this.kKAmaja(1);
    }
    
    synchronized void KKAmAJa(final int n) {
        if (this.AKKamAJ != null) {
            this.akKAmAJ = new maaamka(this.AKKamAJ, n, this.aKKamAJ, this.AkkamAJ);
            StreamAudioPlayer.player.start((InputStream)this.akKAmAJ);
        }
    }
    
    synchronized void kkAmAJa(final int n) {
        if (this.akKAmAJ != null && this.akKAmAJ.available() > 0) {
            return;
        }
        this.stop();
        if (this.AKKamAJ != null) {
            this.akKAmAJ = new maaamka(this.AKKamAJ, n, this.aKKamAJ, this.AkkamAJ);
            StreamAudioPlayer.player.start((InputStream)this.akKAmAJ);
        }
    }
    
    public synchronized void loop() {
        this.stop();
        if (this.AKKamAJ != null) {
            this.akKAmAJ = new maaamka(this.AKKamAJ, -1, this.aKKamAJ, this.AkkamAJ);
            StreamAudioPlayer.player.start((InputStream)this.akKAmAJ);
        }
    }
    
    public synchronized void stop() {
        if (this.AKKAmAJ != null) {
            synchronized (this) {
                this.aKkAmAJ = false;
                this.AKKAmAJ = null;
            }
        }
        if (this.akKAmAJ != null) {
            StreamAudioPlayer.player.stop((InputStream)this.akKAmAJ);
            try {
                this.akKAmAJ.close();
            }
            catch (final IOException ex) {}
            this.akKAmAJ = null;
        }
    }
    
    synchronized void kkamaja(final kajakmk kajakmk, final kajamma akkAmAJ) {
        final maaamka akKAmAJ = new maaamka(kajakmk.AKKamAJ, 1, kajakmk.aKKamAJ, this.AkkamAJ);
        if (this.akKAmAJ == null) {
            this.akKAmAJ = akKAmAJ;
            final maaamka maaamka = new maaamka(kajakmk.AKKamAJ, 1, kajakmk.aKKamAJ, this.AkkamAJ);
            this.akkAmAJ = 0;
            this.akKAmAJ.KkamajA(maaamka, this.akkAmAJ, akkAmAJ);
            this.AKKAmAJ = new Thread(this);
            this.AkkAmAJ = akkAmAJ;
            this.aKKAmAJ = akkAmAJ.MAJaKKa;
            this.aKkAmAJ = true;
            this.AKKAmAJ.start();
            StreamAudioPlayer.player.start((InputStream)this.akKAmAJ);
            return;
        }
        ++this.akkAmAJ;
        this.akKAmAJ.KkamajA(akKAmAJ, this.akkAmAJ, akkAmAJ);
    }
    
    synchronized void kKAMaja(final kajamma kajamma) {
        if (this.AKkAmAJ == null) {
            maaamka.kkAmajA(this.AKkAmAJ = new byte[this.akKAmAJ.kkamajA()], 0, this.AKkAmAJ.length);
        }
        final maaamka maaamka = new maaamka(this.AKkAmAJ, 1, this.AKkAmAJ.length, this.AkkamAJ);
        if (maaamka != null) {
            ++this.akkAmAJ;
            this.akKAmAJ.KkamajA(maaamka, this.akkAmAJ, kajamma);
        }
    }
    
    public synchronized void run() {
        try {
            while (this.aKkAmAJ) {
                synchronized (this) {
                    if (!this.aKkAmAJ) {

                        break;
                    }
                    final int amAjAkK = this.AkkAmAJ.AMAjAkK();
                    if (amAjAkK == 1) {
                        this.aKKAmAJ.akkAMaJ();
                    }
                    else {
                        if (amAjAkK == 2 || amAjAkK != 0) {

                            break;
                        }
                        continue;
                    }
                }
            }
        }
        catch (final InterruptedException ex) {}
        this.aKkAmAJ = false;
        if (this.akKAmAJ != null) {
            this.akKAmAJ.KkAmajA();
        }
    }
    
    synchronized boolean kKamaja() {
        if (this.akKamAJ) {
            return true;
        }
        if (this.KKamaja()) {
            final ByteArrayOutputStream out = new ByteArrayOutputStream(0);
            final DataOutputStream dataOutputStream = new DataOutputStream(out);
            try {
                dataOutputStream.writeInt(779316836);
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(this.AkkAMAJ);
                dataOutputStream.writeInt(1);
                dataOutputStream.writeInt(8000);
                dataOutputStream.writeInt(1);
                dataOutputStream.writeInt(0);
            }
            catch (final IOException ex) {
                return false;
            }
            final byte[] byteArray = out.toByteArray();
            for (int i = 0; i < 0; ++i) {
                this.AKKamAJ[i] = byteArray[i];
            }
            return this.akKamAJ = true;
        }
        return false;
    }
    
    void KkAmAJa() {
        if (kajakmk.AkKaMaj == null) {
            kajakmk.AkKaMaj = new byte[256];
            for (int i = 0; i < 8; ++i) {
                int n;
                for (int j = n = 1 << i; j > 0; --j) {
                    kajakmk.AkKaMaj[n] = (byte)i;
                    ++n;
                }
            }
            kajakmk.AkKaMaj[0] = 0;
        }
    }
    
    private static byte kkAMaja(int n) {
        int n2;
        if (n < 0) {
            n2 = 128;
            n = -n;
        }
        else {
            n2 = 0;
        }
        int n3 = n + 132;
        if (n3 > 32767) {
            n3 = 32767;
        }
        final byte b = kajakmk.AkKaMaj[n3 >> 7];
        int n4 = ~(n2 | b << 4 | (n3 >> b + 3 & 0xF));
        if (n4 == 0) {
            n4 = 2;
        }
        return (byte)n4;
    }
    
    private boolean KKamaja() {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        final int akkAMAJ = this.AkkAMAJ;
        switch (kajakmk.aKkamAJ[this.AKKAMAJ >> 2 & 0x3]) {
            case 11025: {
                n = 45158;
                break;
            }
            case 22050: {
                n = 90316;
                break;
            }
            case 44100: {
                n = 180633;
                break;
            }
            case 88200: {
                n = 361267;
                break;
            }
        }
        this.aKkAMAJ = this.AKkAMAJ;
        final byte[] array;
        if ((array = new byte[2048]) == null) {
            return false;
        }
        this.KkaMaja(0);
        if ((this.AKKamAJ = new byte[akkAMAJ]) == null) {
            return false;
        }
        for (int i = this.aKKAMAJ; i > 0; i -= 2048) {
            int n4;
            if (i > 2048) {
                this.kkaMaja(array, 2048);
                n4 = 134217728;
            }
            else {
                this.kkaMaja(array, i);
                n4 = i - 1 << 16;
            }
            while (n2 < n4 && n3 < akkAMAJ) {
                this.AKKamAJ[n3++] = array[n2 >> 16];
                n2 += n;
            }
            if (i <= 2048) {
                this.aKKamAJ = akkAMAJ - (akkAMAJ - n3);
            }
            else {
                n2 -= 134217728;
            }
        }
        return true;
    }
    
    private void kKaMaja() {
        while (this.AKKaMaj <= 24) {
            this.akKaMaj = (this.akKaMaj << 8 | (0xFF & this.akkAMAJ[this.aKkAMAJ++]));
            this.AKKaMaj += 8;
        }
    }
    
    private int KKAMaja(final int n) {
        if (this.AKKaMaj < n) {
            this.kKaMaja();
        }
        final int n2 = this.akKaMaj << 32 - this.AKKaMaj >>> 32 - n;
        this.AKKaMaj -= n;
        return n2;
    }
    
    private int KkAMaja(final int n) {
        if (this.AKKaMaj < n) {
            this.kKaMaja();
        }
        final int n2 = this.akKaMaj << 32 - this.AKKaMaj >> 32 - n;
        this.AKKaMaj -= n;
        return n2;
    }
    
    private void KKaMaja(int i) {
        if (i <= 32) {
            while (i > 0) {
                final int min = Math.min(16, i);
                this.KKAMaja(min);
                i -= min;
            }
            return;
        }
        i -= this.AKKaMaj;
        this.AKKaMaj = 0;
        this.aKkAMAJ += i / 8;
        this.KKAMaja(i & 0x7);
    }
    
    private void KkaMaja(int i) {
        if (this.aKKaMaj == 0) {
            this.aKKaMaj = this.KKAMaja(2) + 2;
        }
        final int n = this.AkkaMaj & 0xFFFFF000;
        if (n > 0 && i > n + this.AkkaMaj) {
            this.AkkaMaj += n;
            i -= n;
            int n2 = n * this.aKKaMaj;
            if (this.AkKamAJ) {
                n2 *= 2;
            }
            this.KKaMaja(n2);
        }
        int n3 = (i >> 12) * (22 + this.aKKaMaj * 4095);
        if (this.AkKamAJ) {
            n3 *= 2;
        }
        this.KKaMaja(n3);
        i &= 0xFFF;
        final byte[] array = new byte[2048];
        final int a = this.AkKamAJ ? 512 : 1024;
        while (i > 0) {
            final int min = Math.min(a, i);
            this.kkaMaja(array, min + min);
            i -= min;
        }
    }
    
    private void kkaMaja(final byte[] array, int n) {
        int n2 = 0;
        if (this.aKKaMaj == 0) {
            this.aKKaMaj = this.KKAMaja(2) + 2;
        }
        final int[] array2 = kajakmk.aKKAMaj[this.aKKaMaj - 2];
        final int n3 = 1 << this.aKKaMaj - 2;
        final int n4 = 1 << this.aKKaMaj - 1;
        if (!this.AkKamAJ) {
            int kkAMaja = this.akkaMaj[0];
            int kkaMaja = this.AKkaMaj[0];
            int akkaMaj = this.AkkaMaj;
            while (n-- > 0) {
                if ((++akkaMaj & 0xFFF) == 0x1) {
                    kkAMaja = this.KkAMaja(16);
                    array[n2++] = kkAMaja(kkAMaja);
                    kkaMaja = this.KKAMaja(6);
                }
                else {
                    final int kkaMaja2 = this.KKAMaja(this.aKKaMaj);
                    int n5 = kajakmk.AkkAMaj[kkaMaja];
                    int n6 = 0;
                    int i = n3;
                    do {
                        if ((kkaMaja2 & i) != 0x0) {
                            n6 += n5;
                        }
                        n5 >>= 1;
                        i >>= 1;
                    } while (i != 0);
                    final int n7 = n6 + n5;
                    if ((kkaMaja2 & n4) != 0x0) {
                        kkAMaja -= n7;
                    }
                    else {
                        kkAMaja += n7;
                    }
                    kkaMaja += array2[kkaMaja2 & ~n4];
                    if (kkaMaja < 0) {
                        kkaMaja = 0;
                    }
                    else if (kkaMaja > 88) {
                        kkaMaja = 88;
                    }
                    if (kkAMaja != (short)kkAMaja) {
                        kkAMaja = ((kkAMaja < 0) ? -32768 : 32767);
                    }
                    array[n2++] = kkAMaja(kkAMaja);
                }
            }
            this.akkaMaj[0] = kkAMaja;
            this.AKkaMaj[0] = kkaMaja;
            this.AkkaMaj = akkaMaj;
            return;
        }
        int n8 = 0;
        while (n-- > 0) {
            ++this.AkkaMaj;
            if ((this.AkkaMaj & 0xFFF) == 0x1) {
                for (int j = 0; j < 2; ++j) {
                    this.akkaMaj[j] = this.KkAMaja(16);
                    if (j == 0) {
                        n8 = this.akkaMaj[j];
                    }
                    else {
                        n8 = n8 + this.akkaMaj[j] >> 1;
                        array[n2++] = kkAMaja(n8);
                    }
                    this.AKkaMaj[j] = this.KKAMaja(6);
                }
            }
            else {
                for (int k = 0; k < 2; ++k) {
                    final int kkaMaja3 = this.KKAMaja(this.aKKaMaj);
                    int n9 = kajakmk.AkkAMaj[this.AKkaMaj[k]];
                    int n10 = 0;
                    int l = n3;
                    do {
                        if ((kkaMaja3 & l) != 0x0) {
                            n10 += n9;
                        }
                        n9 >>= 1;
                        l >>= 1;
                    } while (l != 0);
                    final int n11 = n10 + n9;
                    if ((kkaMaja3 & n4) != 0x0) {
                        final int[] akkaMaj2 = this.akkaMaj;
                        final int n12 = k;
                        akkaMaj2[n12] -= n11;
                    }
                    else {
                        final int[] akkaMaj3 = this.akkaMaj;
                        final int n13 = k;
                        akkaMaj3[n13] += n11;
                    }
                    final int[] aKkaMaj = this.AKkaMaj;
                    final int n14 = k;
                    aKkaMaj[n14] += array2[kkaMaja3 & ~n4];
                    if (this.AKkaMaj[k] < 0) {
                        this.AKkaMaj[k] = 0;
                    }
                    else if (this.AKkaMaj[k] > 88) {
                        this.AKkaMaj[k] = 88;
                    }
                    if (this.akkaMaj[k] != (short)this.akkaMaj[k]) {
                        this.akkaMaj[k] = ((this.akkaMaj[k] < 0) ? -32768 : 32767);
                    }
                    if (k == 0) {
                        n8 = this.akkaMaj[k];
                    }
                    else {
                        n8 = n8 + this.akkaMaj[k] >> 1;
                        array[n2++] = kkAMaja(n8);
                    }
                }
            }
        }
    }
    
    static {
        aKkamAJ = new int[] { 11025, 22050, 44100, 88200 };
        AkKAmAJ = new int[] { 3, 2, 1, 0 };
        aKkaMaj = new int[] { -1, 2 };
        AkKAMaj = new int[] { -1, -1, 2, 4 };
        akKAMaj = new int[] { -1, -1, -1, -1, 2, 4, 6, 8 };
        AKKAMaj = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 1, 2, 4, 6, 8, 10, 13, 16 };
        aKKAMaj = new int[][] { kajakmk.aKkaMaj, kajakmk.AkKAMaj, kajakmk.akKAMaj, kajakmk.AKKAMaj };
        AkkAMaj = new int[] { 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767 };
    }
}
