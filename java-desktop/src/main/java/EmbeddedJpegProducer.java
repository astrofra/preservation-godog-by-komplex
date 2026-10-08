import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.awt.image.*;
import javax.imageio.ImageIO;

/** Recovered JPEG source entry points, backed by public ImageIO/ImageProducer APIs. */
final class EmbeddedJpegProducer implements ImageProducer {
    ByteArrayInputStream KkAMAJa;
    byte[] kkAMAJa;
    private ImageProducer producer;
    public EmbeddedJpegProducer() throws MalformedURLException { }
    void KKaMajA() {
        try { if (KkAMAJa != null) { KkAMAJa.close(); KkAMAJa = null; } }
        catch (IOException ignored) { }
    }
    protected ImageProducer kkaMajA() {
        if (producer == null) {
            try {
                BufferedImage image = ImageIO.read(new ByteArrayInputStream(kkAMAJa));
                if (image == null) throw new IOException("Unrecognized embedded JPEG");
                producer = image.getSource();
            } catch (IOException failure) { throw new IllegalStateException(failure); }
        }
        return producer;
    }
    public void addConsumer(ImageConsumer consumer) { kkaMajA().addConsumer(consumer); }
    public boolean isConsumer(ImageConsumer consumer) { return kkaMajA().isConsumer(consumer); }
    public void removeConsumer(ImageConsumer consumer) { kkaMajA().removeConsumer(consumer); }
    public void startProduction(ImageConsumer consumer) { kkaMajA().startProduction(consumer); }
    public void requestTopDownLeftRightResend(ImageConsumer consumer) { kkaMajA().requestTopDownLeftRightResend(consumer); }
}
