package desktop.audio;

import java.io.InputStream;
import java.util.IdentityHashMap;
import javax.sound.sampled.*;

/** Java Sound output for the movie player's legacy 8 kHz mu-law streams. */
public final class StreamAudioPlayer {
    public static final StreamAudioPlayer player = new StreamAudioPlayer();
    private final IdentityHashMap<InputStream, SourceDataLine> lines = new IdentityHashMap<>();

    public synchronized void start(InputStream stream) {
        if (lines.containsKey(stream) || Boolean.getBoolean("godog.mute")) return;
        try {
            AudioFormat encoded = new AudioFormat(AudioFormat.Encoding.ULAW, 8000, 8, 1, 1, 8000, false);
            AudioFormat pcm = new AudioFormat(8000, 16, 1, true, false);
            SourceDataLine line = AudioSystem.getSourceDataLine(pcm);
            line.open(pcm);
            lines.put(stream, line);
            Thread thread = new Thread(() -> {
                try {
                    AudioInputStream input = AudioSystem.getAudioInputStream(pcm,
                            new AudioInputStream(stream, encoded, AudioSystem.NOT_SPECIFIED));
                    line.start();
                    byte[] buffer = new byte[1600];
                    int count;
                    while (line.isOpen() && (count = input.read(buffer)) != -1) line.write(buffer, 0, count);
                } catch (Exception failure) {
                    if (line.isOpen()) failure.printStackTrace();
                } finally { stop(stream); }
            }, "Godog movie audio");
            thread.setDaemon(true);
            thread.start();
        } catch (LineUnavailableException failure) { throw new IllegalStateException(failure); }
    }

    public synchronized void stop(InputStream stream) {
        SourceDataLine line = lines.remove(stream);
        if (line != null) { line.stop(); line.flush(); line.close(); }
    }
}
