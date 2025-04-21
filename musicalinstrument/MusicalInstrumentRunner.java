package com.xworkz.musicalinstrument;

import com.xworkz.musicalinstrument.drum.Drum;
import com.xworkz.musicalinstrument.musicalinstrument.MusicalInstrument;

public class MusicalInstrumentRunner {
    public static void main(String[] args) {


        MusicalInstrument musicalInstrument = new MusicalInstrument();
        musicalInstrument.validateMusicalInstrumentDetails();
        musicalInstrument.tuneInstrument();
        musicalInstrument.playSound();
        musicalInstrument.storeInstrument();
        musicalInstrument.checkCondition();


        MusicalInstrument ref = new Drum();
        ref.validateMusicalInstrumentDetails();
        ref.tuneInstrument();
        ref.playSound();
        ref.storeInstrument();
        ref.checkCondition();


        Drum drum = new Drum();
        drum.validateMusicalInstrumentDetails();
        drum.tuneInstrument();
        drum.playSound();
        drum.storeInstrument();
        drum.checkCondition();
        drum.playDrumSolo();
    }
}
