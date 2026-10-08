import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.imageio.ImageIO;

/** Window, installation-relative resources and optional validation captures. */
public final class GodogDesktop {
    private static Path assets;
    private static Path captureDirectory;
    private static int scale = 2;
    private static boolean headless;
    private static double duration;
    private static volatile long musicStart;
    private static final AtomicBoolean closing = new AtomicBoolean();
    private static final double[] captureTimes = {0, 15, 30, 45, 60, 75, 90, 105, 120, 135, 150, 165, 180, 188};
    private static int nextCapture;
    private static DesktopDemoBase demo;
    private static Frame window;

    public static void main(String[] args) {
        try {
            for (int i = 0; i < args.length; i++) {
                switch (args[i]) {
                    case "--assets" -> assets = Path.of(args[++i]).toAbsolutePath();
                    case "--mute" -> System.setProperty("godog.mute", "true");
                    case "--headless" -> { headless = true; System.setProperty("java.awt.headless", "true"); }
                    case "--scale" -> scale = Integer.parseInt(args[++i]);
                    case "--duration" -> duration = Double.parseDouble(args[++i]);
                    case "--capture-dir" -> captureDirectory = Path.of(args[++i]);
                    case "--help" -> {
                        System.out.println("GodogDesktop [--scale 1|2|3|4] [--mute] [--assets DIR] [--duration SECONDS] [--capture-dir DIR] [--headless]");
                        return;
                    }
                    default -> throw new IllegalArgumentException("Unknown option: " + args[i]);
                }
            }
            if (scale < 1 || scale > 4 || duration < 0) throw new IllegalArgumentException("Invalid scale or duration");
            if (captureDirectory != null) Files.createDirectories(captureDirectory);
            assetBase();
            EventQueue.invokeLater(() -> {
                try { launch(new godog(), null, 512, 256); }
                catch (Throwable failure) { failed(failure); }
            });
        } catch (Exception failure) { failed(failure); }
    }

    public static URL assetBase() {
        try {
            if (assets == null) {
                Path location = Path.of(GodogDesktop.class.getProtectionDomain().getCodeSource().getLocation().toURI());
                Path directory = Files.isDirectory(location) ? location : location.getParent();
                for (Path candidate = directory; candidate != null; candidate = candidate.getParent()) {
                    if (Files.isRegularFile(candidate.resolve("assets/data/rocket.xm"))) {
                        assets = candidate.resolve("assets"); break;
                    }
                }
            }
            if (assets == null || !Files.isRegularFile(assets.resolve("data/rocket.xm"))) {
                throw new IllegalStateException("Missing Godog assets; keep assets/ with the application or pass --assets DIR");
            }
            return assets.toUri().toURL();
        } catch (Exception failure) { throw new IllegalStateException("Cannot resolve Godog assets", failure); }
    }

    public static void launch(DesktopDemoBase surface, String[] parameters, int width, int height) {
        if (!EventQueue.isDispatchThread()) {
            EventQueue.invokeLater(() -> launch(surface, parameters, width, height)); return;
        }
        demo = surface;
        DesktopParameterStub stub = new DesktopParameterStub();
        if (parameters != null) for (int i = 0; i + 1 < parameters.length; i += 2) stub.AkKamaJ(parameters[i], parameters[i + 1]);
        surface.setStub(stub);
        surface.amaJakK = true;
        surface.setSize(width, height);
        Canvas canvas = surface.presentationComponent();
        canvas.setPreferredSize(new Dimension(width * scale, height * scale));
        canvas.setBackground(Color.BLACK);
        surface.setBackground(Color.BLACK);
        if (!headless) {
            window = new Frame("Godog — Komplex");
            window.add(canvas, BorderLayout.CENTER);
            window.pack();
            window.setResizable(false);
            window.setLocationRelativeTo(null);
            window.addWindowListener(new WindowAdapter() {
                @Override public void windowClosing(WindowEvent event) { close(0); }
            });
            canvas.addKeyListener(new KeyAdapter() {
                @Override public void keyPressed(KeyEvent event) {
                    if (event.getKeyCode() == KeyEvent.VK_ESCAPE) close(0);
                    else {
                        Event legacy = new Event(surface, Event.KEY_PRESS, null);
                        legacy.key = event.getKeyChar();
                        surface.keyDown(legacy, event.getKeyChar());
                    }
                }
            });
            MouseAdapter mouse = new MouseAdapter() {
                private void forward(MouseEvent event, int kind) {
                    int x = event.getX() * width / canvas.getWidth();
                    int y = event.getY() * height / canvas.getHeight();
                    Event legacy = new Event(surface, kind, null);
                    legacy.x = x; legacy.y = y;
                    if (kind == Event.MOUSE_DOWN) surface.mouseDown(legacy, x, y);
                    else if (kind == Event.MOUSE_UP) surface.mouseUp(legacy, x, y);
                    else surface.mouseMove(legacy, x, y);
                }
                @Override public void mousePressed(MouseEvent e) { canvas.requestFocusInWindow(); forward(e, Event.MOUSE_DOWN); }
                @Override public void mouseReleased(MouseEvent e) { forward(e, Event.MOUSE_UP); }
                @Override public void mouseMoved(MouseEvent e) { forward(e, Event.MOUSE_MOVE); }
                @Override public void mouseDragged(MouseEvent e) { forward(e, Event.MOUSE_MOVE); }
            };
            canvas.addMouseListener(mouse);
            canvas.addMouseMotionListener(mouse);
            canvas.addFocusListener(new FocusAdapter() {
                @Override public void focusLost(FocusEvent event) { godog.kamAjAk = false; }
            });
            window.setVisible(true);
            canvas.requestFocusInWindow();
        } else surface.setSize(width, height);
        surface.init();
        surface.start();
    }

    public static void musicStarted() {
        musicStart = System.currentTimeMillis();
        System.out.println("MUSIC 0.000");
    }

    public static void sceneStarted(String name) {
        System.out.printf(Locale.ROOT, "SCENE %.3f %s%n", elapsed(), name);
    }

    private static double elapsed() { return musicStart == 0 ? 0 : (System.currentTimeMillis() - musicStart) / 1000.0; }

    public static void framePresented(BufferedImage image) {
        if (musicStart == 0) return;
        double seconds = elapsed();
        if (captureDirectory != null && nextCapture < captureTimes.length && seconds >= captureTimes[nextCapture]) {
            double target = captureTimes[nextCapture++];
            try {
                ImageIO.write(image, "png", captureDirectory.resolve(String.format(Locale.ROOT, "frame-%06.1f.png", target)).toFile());
                System.out.printf(Locale.ROOT, "CAPTURE %.3f target=%.1f%n", seconds, target);
            } catch (Exception failure) { failed(failure); }
        }
        if (duration > 0 && seconds >= duration) close(0);
    }

    public static void failed(Throwable failure) { failure.printStackTrace(); close(1); }

    public static void close(int exitCode) {
        if (!closing.compareAndSet(false, true)) return;
        new Thread(() -> {
            int status = exitCode;
            try {
                if (demo != null) demo.stop();
                EventQueue.invokeAndWait(() -> { if (window != null) window.dispose(); });
            } catch (Exception failure) { failure.printStackTrace(); status = 1; }
            System.out.println("Godog desktop stopped.");
            System.exit(status);
        }, "Godog shutdown").start();
    }
}
