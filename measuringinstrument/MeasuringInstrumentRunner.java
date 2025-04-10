package com.xworkz.measuringinstrument;

import com.xworkz.measuringinstrument.ruler.Ruler;
import com.xworkz.musicalinstrument.musicalinstrument.MusicalInstrument;

public class MeasuringInstrumentRunner {
    public static void main(String[] args) {
        MusicalInstrument musicalInstrument = new MusicalInstrument();
        musicalInstrument.validateMusicalInstrumentDetails();

        Ruler ruler = new Ruler();
        ruler.validateMusicalInstrumentDetails();
    }

}
