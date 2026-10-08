// 
// Decompiled by Procyon v0.6.0
// 

public class ModuleInstrument
{
    ModuleSample[] sampleByNote;
    Envelope volumeEnvelope;
    Envelope panningEnvelope;
    int JAKKAMa;
    int jAKKAMa;
    int JakKAMa;
    int jakKAMa;
    
    public void setSampleForAllNotes(final ModuleSample kmaamka) {
        for (int i = 0; i < 96; ++i) {
            this.sampleByNote[i] = kmaamka;
        }
    }
    
    public void setSampleForNote(final int n, final ModuleSample kmaamka) {
        this.sampleByNote[n] = kmaamka;
    }
    
    public ModuleInstrument() {
        this.sampleByNote = new ModuleSample[96];
    }
}
