package muhmu.hifi.device;

import java.awt.Component;
import java.util.Arrays;
import javax.sound.sampled.*;

/** New output backend; the original XM sequencer and packed-stereo mixer are unchanged. */
public final class JavaSoundDevice extends MAD implements Runnable {
    private Mixable mixable;
    private SourceDataLine line;
    private volatile Thread mixer;
    private int[] buffer;
    private byte[] pcm;
    private final boolean mute;
    private long framesWritten;
    private long startMillis;
    private java.util.function.Consumer<Throwable> failureHandler = Throwable::printStackTrace;

    public void setFailureHandler(java.util.function.Consumer<Throwable> handler) { failureHandler = handler; }

    public JavaSoundDevice() { this(Boolean.getBoolean("godog.mute")); }
    public JavaSoundDevice(boolean mute) { this.mute = mute; }

    @Override public boolean init(Mixable mixable, int n, int format, int frequency, Component component) {
        this.mixable = mixable;
        this.frequency = frequency;
        this.stereo = true;
        buffer = new int[1024];
        pcm = new byte[buffer.length * 4];
        if (!mute) {
            try {
                AudioFormat audio = new AudioFormat(frequency, 16, 2, true, false);
                line = AudioSystem.getSourceDataLine(audio);
                line.open(audio, pcm.length * 2);
            } catch (LineUnavailableException failure) {
                throw new IllegalStateException("Cannot open audio output; use --mute for silent playback", failure);
            }
        }
        return true;
    }

    @Override public synchronized void start() {
        if (mixer != null) return;
        framesWritten = 0;
        startMillis = System.currentTimeMillis();
        if (line != null) line.start();
        mixer = new Thread(this, "Godog XM audio");
        mixer.start();
    }

    @Override public void stop() {
        Thread worker = mixer;
        mixer = null;
        if (line != null) { line.stop(); line.flush(); line.close(); }
        if (worker != null && worker != Thread.currentThread()) {
            worker.interrupt();
            try { worker.join(2000); } catch (InterruptedException failure) { Thread.currentThread().interrupt(); }
            if (worker.isAlive()) throw new IllegalStateException("Audio worker did not stop");
        }
    }

    @Override public void run() {
        try {
            while (mixer == Thread.currentThread()) {
                if (line == null) {
                    bufferStartTime = startMillis + framesWritten * 1000 / frequency;
                } else {
                    long queued = Math.max(0, framesWritten - line.getLongFramePosition());
                    bufferStartTime = System.currentTimeMillis() + queued * 1000 / frequency;
                }
                Arrays.fill(buffer, 0);
                mixable.mix(this, buffer, 0, buffer.length);
                for (int i = 0, p = 0; i < buffer.length; i++) {
                    int sample = buffer[i];
                    pcm[p++] = (byte)sample;
                    pcm[p++] = (byte)(sample >>> 8);
                    pcm[p++] = (byte)(sample >>> 16);
                    pcm[p++] = (byte)(sample >>> 24);
                }
                if (line != null) {
                    for (int offset = 0; offset < pcm.length && mixer == Thread.currentThread();) {
                        offset += line.write(pcm, offset, pcm.length - offset);
                    }
                }
                framesWritten += buffer.length;
                if (line == null) {
                    long delay = startMillis + framesWritten * 1000 / frequency - System.currentTimeMillis();
                    if (delay > 0) Thread.sleep(delay);
                }
            }
        } catch (InterruptedException stopped) {
            Thread.currentThread().interrupt();
        } catch (Throwable failure) {
            if (mixer == Thread.currentThread()) failureHandler.accept(failure);
        } finally { mixer = null; }
    }
}
