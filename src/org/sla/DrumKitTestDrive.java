package org.sla;

public class DrumKitTestDrive {
    public static void main(String[] args) {
        Drumkit d = new Drumkit();
        d.snare = false;
        if (d.snare == true) {
            d.playSnare();
        }
        d.playTopHat();
        d.playSnare();
    }
}

