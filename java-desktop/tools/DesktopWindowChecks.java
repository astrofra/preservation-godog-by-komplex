import java.awt.*;
import java.awt.event.*;

/** Native AWT lifecycle and restored input checks; requires a display. */
public class DesktopWindowChecks {
    public static void main(String[] args) throws Exception {
        GodogDesktop.main(new String[]{"--mute"});
        Thread.sleep(4000);
        try {
            EventQueue.invokeAndWait(() -> {
                Frame frame = null;
                for (Frame f : Frame.getFrames()) if (f.getTitle().startsWith("Godog")) frame = f;
                if (frame == null || !frame.isShowing()) throw new AssertionError("No visible window");
                GodogDemo demo = GodogDemo.KkaMAJA;
                Canvas canvas = demo.presentationComponent();
                if (canvas.getWidth() != 1024 || canvas.getHeight() != 512 || demo.snapshot() == null) throw new AssertionError("Wrong surface or no image");
                MouseEvent press = new MouseEvent(canvas, MouseEvent.MOUSE_PRESSED, 0, 0, 200, 100, 1, false);
                canvas.dispatchEvent(press);
                if (!GodogDemo.kamAjAk || GodogDemo.kAMAjAk != 100 || GodogDemo.KamAjAk != 50) throw new AssertionError("Scaled mouse press");
                canvas.dispatchEvent(new MouseEvent(canvas, MouseEvent.MOUSE_RELEASED, 0, 0, 220, 120, 1, false));
                if (GodogDemo.kamAjAk || GodogDemo.kAMAjAk != 110 || GodogDemo.KamAjAk != 60) throw new AssertionError("Mouse release");
                canvas.dispatchEvent(press);
                for (FocusListener listener : canvas.getFocusListeners()) listener.focusLost(new FocusEvent(canvas, FocusEvent.FOCUS_LOST));
                if (GodogDemo.kamAjAk) throw new AssertionError("Focus release");
                for (KeyListener listener : canvas.getKeyListeners()) listener.keyPressed(new KeyEvent(canvas, KeyEvent.KEY_PRESSED, 0, 0, KeyEvent.VK_F, 'f'));
                if (!demo.kkamaJA) throw new AssertionError("F key");
                frame.setState(Frame.ICONIFIED);
            });
            Thread.sleep(500);
            EventQueue.invokeAndWait(() -> {
                for (Frame frame : Frame.getFrames()) if (frame.getTitle().startsWith("Godog")) frame.setState(Frame.NORMAL);
            });
            Thread.sleep(500);
            EventQueue.invokeAndWait(() -> {
                for (Frame frame : Frame.getFrames()) if (frame.getTitle().startsWith("Godog")) {
                    System.out.println("PASS: native window, scaled mouse, release, focus loss, F key, minimize/restore; closing via WINDOW_CLOSING.");
                    frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
                }
            });
        } catch (Throwable failure) { GodogDesktop.failed(failure); }
    }
}
