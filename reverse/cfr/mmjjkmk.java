/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import sun.awt.image.ImageDecoder;
import sun.awt.image.JPEGImageDecoder;
import sun.awt.image.URLImageSource;

final class mmjjkmk
extends URLImageSource {
    ByteArrayInputStream KkAMAJa;
    byte[] kkAMAJa;

    public mmjjkmk() throws MalformedURLException {
        super(mmaakka.KamaJaK.getCodeBase().toString());
    }

    void KKaMajA() {
        try {
            if (this.KkAMAJa != null) {
                ((InputStream)this.KkAMAJa).close();
                this.KkAMAJa = null;
                return;
            }
        }
        catch (IOException iOException) {}
    }

    protected ImageDecoder kkaMajA() {
        return new JPEGImageDecoder(this, this.KkAMAJa);
    }
}

