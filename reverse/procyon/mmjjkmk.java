import java.io.InputStream;
import sun.awt.image.InputStreamImageSource;
import sun.awt.image.JPEGImageDecoder;
import sun.awt.image.ImageDecoder;
import java.io.IOException;
import java.net.MalformedURLException;
import java.io.ByteArrayInputStream;
import sun.awt.image.URLImageSource;

// 
// Decompiled by Procyon v0.6.0
// 

final class mmjjkmk extends URLImageSource
{
    ByteArrayInputStream KkAMAJa;
    byte[] kkAMAJa;
    
    public mmjjkmk() throws MalformedURLException {
        super(mmaakka.KamaJaK.getCodeBase().toString());
    }
    
    void KKaMajA() {
        try {
            if (this.KkAMAJa != null) {
                this.KkAMAJa.close();
                this.KkAMAJa = null;
            }
        }
        catch (final IOException ex) {}
    }
    
    protected ImageDecoder kkaMajA() {
        return new JPEGImageDecoder(this, this.KkAMAJa);
    }
}
