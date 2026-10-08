import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;

/** Desktop platform boundary for the two recovered Applet subclasses. */
public class DesktopSurface extends Panel {
    private DesktopParameterStub desktopStub = new DesktopParameterStub();
    private BufferedImage working = new BufferedImage(512, 256, BufferedImage.TYPE_INT_RGB);
    private volatile BufferedImage presented;
    private final Canvas presentation = new Canvas() {
        @Override public void paint(Graphics graphics) { paintPresented(graphics, getWidth(), getHeight()); }
        @Override public void update(Graphics graphics) { paint(graphics); }
    };

    public Canvas presentationComponent() { return presentation; }

    public void setStub(DesktopParameterStub stub) { desktopStub = stub; }
    public URL getCodeBase() { return GodogDesktop.assetBase(); }
    public URL getDocumentBase() { return getCodeBase(); }
    public String getParameter(String name) { return desktopStub.getParameter(name); }
    public DesktopResourceContext getAppletContext() { return desktopStub.getAppletContext(); }
    public Image getImage(URL url) { return Toolkit.getDefaultToolkit().getImage(url); }
    public void init() { }
    public void start() { }
    public void stop() { }
    public void destroy() { stop(); }
    public boolean isActive() { return true; }
    public String[][] getParameterInfo() { return null; }
    public String getAppletInfo() { return "Godog desktop preservation"; }
    public void showStatus(String message) { System.out.println(message); }

    @Override public Image createImage(int width, int height) {
        return new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    }

    /** Recovered worker-side drawing targets an image, never a window's Graphics. */
    @Override public Graphics getGraphics() { return working.createGraphics(); }

    public void publishFrame() {
        BufferedImage copy = new BufferedImage(working.getWidth(), working.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = copy.createGraphics();
        graphics.drawImage(working, 0, 0, null);
        graphics.dispose();
        presented = copy;
        GodogDesktop.framePresented(copy);
        presentation.repaint();
    }

    public BufferedImage snapshot() { return presented; }

    @Override public void paint(Graphics graphics) {
        paintPresented(graphics, getWidth(), getHeight());
    }

    private void paintPresented(Graphics graphics, int width, int height) {
        BufferedImage frame = presented;
        if (frame != null) {
            ((Graphics2D)graphics).setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
            graphics.drawImage(frame, 0, 0, width, height, null);
        }
    }

    @Override public void update(Graphics graphics) { paint(graphics); }
}
