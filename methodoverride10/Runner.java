package com.xworkz.methodoverride10;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Instrument Object ----");
        Instrument instrument = new Instrument();
        instrument.play();
        instrument.tune();
        instrument.clean();
        instrument.store();

        System.out.println("\n---- Instrument Reference, Violin Object ----");
        Instrument instrument1 = new Violin();
        instrument1.play();
        instrument1.tune();
        instrument1.clean();
        instrument1.store();

        System.out.println("\n---- Violin Object ----");
        Violin violin = new Violin();
        violin.play();
        violin.tune();
        violin.clean();
        violin.store();
    }
}