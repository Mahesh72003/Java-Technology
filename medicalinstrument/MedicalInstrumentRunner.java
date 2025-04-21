package com.xworkz.medicalinstrument;

import com.xworkz.medicalinstrument.medicalinstrument.MedicalInstrument;
import com.xworkz.medicalinstrument.stethoscope.Stethoscope;

public class MedicalInstrumentRunner {
    public static void main(String[] args) {


        MedicalInstrument instrument = new MedicalInstrument();
        instrument.validateInstrumentDetails();
        instrument.sterilize();
        instrument.useInstrument();
        instrument.storeInstrument();
        instrument.checkDurability();


        MedicalInstrument ref = new Stethoscope();
        ref.validateInstrumentDetails();
        ref.sterilize();
        ref.useInstrument();
        ref.storeInstrument();
        ref.checkDurability();


        Stethoscope stethoscope = new Stethoscope();
        stethoscope.validateInstrumentDetails();
        stethoscope.sterilize();
        stethoscope.useInstrument();
        stethoscope.storeInstrument();
        stethoscope.checkDurability();
        stethoscope.adjustEarpieces();
    }
}
