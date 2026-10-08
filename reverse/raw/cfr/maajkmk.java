/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.StringTokenizer;

public class maajkmk {
    public static final mmaakkk kKAMAJA() {
        mmaakkk mmaakkk2 = new mmaakkk();
        try {
            URL uRL;
            InputStream inputStream = uRL.openConnection().getInputStream();
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 8192));
            boolean bl = false;
            try {
                String string;
                while ((string = dataInputStream.readLine()) != null) {
                    double d;
                    double d2;
                    int n;
                    int n2;
                    String string2;
                    StringTokenizer stringTokenizer = new StringTokenizer(string.trim(), " ");
                    String string3 = string2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : "";
                    if (stringTokenizer.hasMoreTokens() && string2.startsWith("Vertices:") && !bl) {
                        bl = true;
                        n2 = Integer.parseInt(stringTokenizer.nextToken());
                        mmaakkk2.MAJakka = new majjmka[n2];
                        mmaakkk2.mAJakka = new kajjmmk[n2];
                        n = 0;
                        while (n < n2) {
                            kajjmmk kajjmmk2;
                            majjmka majjmka2;
                            stringTokenizer = new StringTokenizer(dataInputStream.readLine().trim(), " ");
                            stringTokenizer.nextToken();
                            d2 = maajkmk.KKAMAJA(stringTokenizer.nextToken());
                            stringTokenizer.nextToken();
                            d = maajkmk.KKAMAJA(stringTokenizer.nextToken());
                            stringTokenizer.nextToken();
                            double d3 = maajkmk.KKAMAJA(stringTokenizer.nextToken());
                            mmaakkk2.MAJakka[n] = majjmka2 = new majjmka(d2, d, d3);
                            mmaakkk2.mAJakka[n] = kajjmmk2 = new kajjmmk(0.0f, 0.0f);
                            ++n;
                        }
                    }
                    if (stringTokenizer.hasMoreTokens() && string2.startsWith("Vertices:") && bl) {
                        bl = true;
                        n2 = Integer.parseInt(stringTokenizer.nextToken());
                        n = 0;
                        while (n < n2) {
                            stringTokenizer = new StringTokenizer(dataInputStream.readLine().trim(), " ");
                            stringTokenizer.nextToken();
                            d2 = maajkmk.KKAMAJA(stringTokenizer.nextToken());
                            stringTokenizer.nextToken();
                            d = maajkmk.KKAMAJA(stringTokenizer.nextToken());
                            mmaakkk2.mAJakka[n].jAKkaMA = (float)d2;
                            mmaakkk2.mAJakka[n].JakkaMA = (float)d;
                            ++n;
                        }
                    }
                    if (!stringTokenizer.hasMoreTokens() || !string2.startsWith("Faces:")) continue;
                    n2 = Integer.parseInt(stringTokenizer.nextToken());
                    mmaakkk2.maJakka = new kajjkka[n2];
                    n = 0;
                    while (n < n2) {
                        kajjkka kajjkka2;
                        stringTokenizer = new StringTokenizer(dataInputStream.readLine().trim(), " ");
                        stringTokenizer.nextToken();
                        int n3 = maajkmk.kkAMAJA(stringTokenizer.nextToken());
                        stringTokenizer.nextToken();
                        int n4 = maajkmk.kkAMAJA(stringTokenizer.nextToken());
                        stringTokenizer.nextToken();
                        int n5 = maajkmk.kkAMAJA(stringTokenizer.nextToken());
                        mmaakkk2.maJakka[n] = kajjkka2 = new kajjkka(mmaakkk2, n3, n4, n5, n3, n4, n5);
                        ++n;
                    }
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
        mmaakkk2.JakKAma();
        return mmaakkk2;
    }

    public static double KKAMAJA(String string) {
        if (string.charAt(string.length() - 1) == ',') {
            string = string.substring(0, string.length() - 1);
        }
        return Double.valueOf(string);
    }

    public static int kkAMAJA(String string) {
        if (string.charAt(string.length() - 1) == ',') {
            string = string.substring(0, string.length() - 1);
        }
        return Integer.parseInt(string);
    }

    public maajkmk() {
        super();
    }
}

