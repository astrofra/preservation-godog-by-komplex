// 
// Decompiled by Procyon v0.6.0
// 

class ScheduledScriptEvent extends SortableItem
{
    long scheduledTimeMillis;
    String command;
    
    ScheduledScriptEvent(final float aMajakk, final String aJakkam) {
        super.sortKey = aMajakk;
        this.command = aJakkam;
    }
}
