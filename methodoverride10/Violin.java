package com.xworkz.methodoverride10;

public class Violin extends Instrument {

    @Override
    public void play() {
        System.out.println("Violin is being played, producing beautiful melodies.");
    }

    @Override
    public void tune() {
        System.out.println("Violin is being tuned for perfect pitch.");
    }

    @Override
    public void clean() {
        System.out.println("Violin is being cleaned with a soft cloth and bow care.");
    }

    @Override
    public void store() {
        System.out.println("Violin is being stored in its case to protect it from damage.");
    }
}