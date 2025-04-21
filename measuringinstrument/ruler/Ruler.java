package com.xworkz.measuringinstrument.ruler;

import com.xworkz.measuringinstrument.measuringinstrument.MeasuringInstrument;

public class Ruler extends MeasuringInstrument {

    public void validateMeasuringInstrumentDetails() {
        System.out.println("Ruler: A simple tool used for measuring short distances.");
    }

    public void calibrate() {
        System.out.println("Ruler: No calibration needed.");
    }

    public void takeMeasurement() {
        System.out.println("Ruler: Measuring a 15 cm object.");
    }

    public void resetInstrument() {
        System.out.println("Ruler: Reset not required, it's always ready.");
    }

    public void showMeasurementUnit() {
        System.out.println("Ruler: Shows units in cm and inches.");
    }

    public void drawLine() {
        System.out.println("Ruler: Drawing a straight line.");
    }
}
