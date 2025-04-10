package com.xworkz.musicalinstrument;

import com.xworkz.musicalinstrument.drum.Drum;
import com.xworkz.musicalinstrument.musicalinstrument.MusicalInstrument;

public class MusicalInstrumentRunner {
    public static void main(String[] args) {
        MusicalInstrument musicalInstrument = new MusicalInstrument();
        musicalInstrument.validateMusicalInstrumentDetails();

        Drum drum = new Drum();
        drum.validateMusicalInstrumentDetails();
    }
}
