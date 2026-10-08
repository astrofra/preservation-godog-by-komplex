import java.io.DataInputStream;
import java.awt.image.ImageProducer;
import java.awt.Image;
import java.awt.image.ImageConsumer;
import java.net.URL;
import java.applet.Applet;
import java.awt.Toolkit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kmaakma
{
    public static Toolkit MajAKkA;
    public static Applet majAKkA;
    public static final byte[] MAjAKkA;
    
    public static final int majaKkA(final double n, final double n2, final double n3, final double[] array) {
        if (n == 0.0) {
            if (n2 != 0.0) {
                array[0] = -n3 / n2;
                return 1;
            }
            if (n3 == 0.0) {
                return -1;
            }
            return 0;
        }
        else {
            final double a = n2 * n2 - 4.0 * n * n3;
            if (a < 0.0) {
                return 0;
            }
            if (a == 0.0) {
                array[0] = -n2 / (2.0 * n);
                return 1;
            }
            final double sqrt = Math.sqrt(a);
            array[0] = (-n2 - sqrt) / (2.0 * n);
            array[1] = (-n2 + sqrt) / (2.0 * n);
            return 2;
        }
    }
    
    public static final int maJAKkA(final double n, final double n2, final double n3, final double n4, final double n5, final double[] array) {
        return majaKkA(n * n + n3 / n4, 2.0 * n * n2, n2 * n2 - n5 * n5 / n4, array);
    }
    
    public static final synchronized kmaakka MAjaKkA(final URL url) {
        Image image;
        if (kmaakma.majAKkA == null) {
            image = Toolkit.getDefaultToolkit().getImage(url);
        }
        else {
            image = kmaakma.majAKkA.getImage(url);
        }
        if (image == null) {
            System.err.println("couldn't fetch image " + url);
            return null;
        }
        final kmjjkmk kmjjkmk = new kmjjkmk();
        final ImageProducer source = image.getSource();
        if (source == null) {
            System.err.println("couldn't fetch image " + url);
            return null;
        }
        source.startProduction(kmjjkmk);
        kmjjkmk.KkAmAJA();
        if (!kmjjkmk.kKaMajA()) {
            System.err.println("error fetching image " + url);
            return null;
        }
        return kmjjkmk.KKaMAJa;
    }
    
    public static final kmaakka mAJaKkA(final URL url) {
        try {
            final DataInputStream dataInputStream = new DataInputStream(url.openConnection().getInputStream());
            dataInputStream.skip(8L);
            final int read = dataInputStream.read();
            final int read2 = dataInputStream.read();
            final int read3 = dataInputStream.read();
            final int read4 = dataInputStream.read();
            final int read5 = dataInputStream.read();
            final int read6 = dataInputStream.read();
            final int i = (read << 8) + read2;
            final int j = (read3 << 8) + read4;
            final int k = (read5 << 8) + read6;
            System.out.println("w=" + i + " h=" + j + " c=" + k);
            dataInputStream.skip(18L);
            if (k == 0) {
                final byte[] b = new byte[i * 3];
                final int[] array = new int[i * j];
                int n = 0;
                for (int l = 0; l < j; ++l) {
                    dataInputStream.readFully(b);
                    int n2 = 0;
                    for (int n3 = 0; n3 < i; ++n3) {
                        array[n++] = (0xFF000000 | ((b[n2++] << 16 & 0xFF0000) | (b[n2++] << 8 & 0xFF00) | (b[n2++] & 0xFF)));
                    }
                }
                return new mmajkka(i, j, array);
            }
            final byte[] b2 = new byte[k * 3];
            final byte[] b3 = new byte[i * j];
            dataInputStream.readFully(b2);
            dataInputStream.readFully(b3);
            final byte[] array2 = new byte[256];
            final byte[] array3 = new byte[256];
            final byte[] array4 = new byte[256];
            for (int n4 = 0; n4 < k; ++n4) {
                array2[n4] = b2[n4 * 3];
                array3[n4] = b2[n4 * 3 + 1];
                array4[n4] = b2[n4 * 3 + 2];
            }
            return new maaakka(i, j, b3, array2, array3, array4);
        }
        catch (final Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static final int MAJaKkA(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7) {
        return mAjaKkA((float)(n & 0xFF), (float)(n2 & 0xFF), (float)(n3 & 0xFF), (float)(n4 & 0xFF), (float)(n5 & 0xFF), (float)(n6 & 0xFF), n7);
    }
    
    public static final int mAjaKkA(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        final float n8 = 1.0f - n7;
        return ((int)(n7 * n + n8 * n4) & 0xFF) << 16 | ((int)(n7 * n2 + n8 * n5) & 0xFF) << 8 | ((int)(n7 * n3 + n8 * n6) & 0xFF);
    }
    
    public static final int MajaKkA(final double n) {
        return (int)n;
    }
    
    public static final int MaJAKkA(final float n) {
        return (int)n;
    }
    
    static {
        MAjAKkA = new byte[] { 109, 104, 119, 97, 110, 104, 0, 4 };
    }
}
