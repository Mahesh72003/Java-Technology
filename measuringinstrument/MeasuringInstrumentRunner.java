package com.xworkz.measuringinstrument;

import com.xworkz.measuringinstrument.measuringinstrument.MeasuringInstrument;
import com.xworkz.measuringinstrument.ruler.Ruler;

public class MeasuringInstrumentRunner {
    public static void main(String[] args) {


        MeasuringInstrument measuringInstrument = new MeasuringInstrument();
        measuringInstrument.validateMeasuringInstrumentDetails();
        measuringInstrument.calibrate();
        measuringInstrument.takeMeasurement();
        measuringInstrument.resetInstrument();
        measuringInstrument.showMeasurementUnit();


        MeasuringInstrument ref = new Ruler();
        ref.validateMeasuringInstrumentDetails();
        ref.calibrate();
        ref.takeMeasurement();
        ref.resetInstrument();
        ref.showMeasurementUnit();


        Ruler ruler = new Ruler();
        ruler.validateMeasuringInstrumentDetails();
        ruler.calibrate();
        ruler.takeMeasurement();
        ruler.resetInstrument();
        ruler.showMeasurementUnit();
        ruler.drawLine();
    }
}
