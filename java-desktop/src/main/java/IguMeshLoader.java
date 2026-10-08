import java.util.StringTokenizer;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.net.URL;

// 
// Decompiled by Procyon v0.6.0
// 

public class IguMeshLoader
{
    public static final MeshObject kKAMAJA(final URL url) {
        final MeshObject mmaakkk = new MeshObject();
        try {
            final DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(url.openConnection().getInputStream(), 8192));
            int n = 0;
            try {
                while (true) {
                    final String line = dataInputStream.readLine();
                    if (line == null) {
                        break;
                    }
                    StringTokenizer stringTokenizer = new StringTokenizer(line.trim(), " ");
                    final String s = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : "";
                    if (stringTokenizer.hasMoreTokens() && s.startsWith("Vertices:") && n == 0) {
                        n = 1;
                        final int int1 = Integer.parseInt(stringTokenizer.nextToken());
                        mmaakkk.MAJakka = new Vertex[int1];
                        mmaakkk.mAJakka = new UvCoord[int1];
                        for (int i = 0; i < int1; ++i) {
                            stringTokenizer = new StringTokenizer(dataInputStream.readLine().trim(), " ");
                            stringTokenizer.nextToken();
                            final double kkamaja = KKAMAJA(stringTokenizer.nextToken());
                            stringTokenizer.nextToken();
                            final double kkamaja2 = KKAMAJA(stringTokenizer.nextToken());
                            stringTokenizer.nextToken();
                            mmaakkk.MAJakka[i] = new Vertex(kkamaja, kkamaja2, KKAMAJA(stringTokenizer.nextToken()));
                            mmaakkk.mAJakka[i] = new UvCoord(0.0f, 0.0f);
                        }
                    }
                    if (stringTokenizer.hasMoreTokens() && s.startsWith("Vertices:") && n != 0) {
                        n = 1;
                        for (int int2 = Integer.parseInt(stringTokenizer.nextToken()), j = 0; j < int2; ++j) {
                            stringTokenizer = new StringTokenizer(dataInputStream.readLine().trim(), " ");
                            stringTokenizer.nextToken();
                            final double kkamaja3 = KKAMAJA(stringTokenizer.nextToken());
                            stringTokenizer.nextToken();
                            final double kkamaja4 = KKAMAJA(stringTokenizer.nextToken());
                            mmaakkk.mAJakka[j].u = (float)kkamaja3;
                            mmaakkk.mAJakka[j].v = (float)kkamaja4;
                        }
                    }
                    if (!stringTokenizer.hasMoreTokens() || !s.startsWith("Faces:")) {
                        continue;
                    }
                    final int int3 = Integer.parseInt(stringTokenizer.nextToken());
                    mmaakkk.maJakka = new Triangle[int3];
                    for (int k = 0; k < int3; ++k) {
                        final StringTokenizer stringTokenizer2 = new StringTokenizer(dataInputStream.readLine().trim(), " ");
                        stringTokenizer2.nextToken();
                        final int kkAMAJA = kkAMAJA(stringTokenizer2.nextToken());
                        stringTokenizer2.nextToken();
                        final int kkAMAJA2 = kkAMAJA(stringTokenizer2.nextToken());
                        stringTokenizer2.nextToken();
                        final int kkAMAJA3 = kkAMAJA(stringTokenizer2.nextToken());
                        mmaakkk.maJakka[k] = new Triangle(mmaakkk, kkAMAJA, kkAMAJA2, kkAMAJA3, kkAMAJA, kkAMAJA2, kkAMAJA3);
                    }
                }
            }
            catch (final Exception ex) {
                ex.printStackTrace();
            }
        }
        catch (final Exception ex2) {
            ex2.printStackTrace();
            return null;
        }
        mmaakkk.JakKAma();
        return mmaakkk;
    }
    
    public static double KKAMAJA(String substring) {
        if (substring.charAt(substring.length() - 1) == ',') {
            substring = substring.substring(0, substring.length() - 1);
        }
        return Double.valueOf(substring);
    }
    
    public static int kkAMAJA(String substring) {
        if (substring.charAt(substring.length() - 1) == ',') {
            substring = substring.substring(0, substring.length() - 1);
        }
        return Integer.parseInt(substring);
    }
}
