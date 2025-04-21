package com.xworkz.medicalinstrument.stethoscope;

import com.xworkz.medicalinstrument.medicalinstrument.MedicalInstrument;

public class Stethoscope extends MedicalInstrument {

    public void validateInstrumentDetails() {
        System.out.println("Stethoscope: Used to listen to internal body sounds, especially the heart and lungs.");
    }

    public void sterilize() {
        System.out.println("Stethoscope: Cleaned with alcohol swabs.");
    }

    public void useInstrument() {
        System.out.println("Stethoscope: Doctor is listening to heartbeats.");
    }

    public void storeInstrument() {
        System.out.println("Stethoscope: Placed gently in the medical kit.");
    }

    public void checkDurability() {
        System.out.println("Stethoscope: Made with durable rubber tubing and metal chest piece.");
    }

    public void adjustEarpieces() {
        System.out.println("Stethoscope: Adjusting the earpieces for better fit.");
    }
}
