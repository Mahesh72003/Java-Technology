package com.xworkz.medicalinstrument;

import com.xworkz.medicalinstrument.medicalinstrument.MedicalInstrument;
import com.xworkz.medicalinstrument.stethoscope.Stethoscope;

public class MedicalInstrumentRunner {
    public static void main(String[] args) {
        MedicalInstrument medicalInstrument = new MedicalInstrument();
        medicalInstrument.validateInstrumentDetails();

        Stethoscope stethoscope = new Stethoscope();
        stethoscope.validateInstrumentDetails();
    }
}
