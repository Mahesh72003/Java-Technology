package com.xworkz.timepiece.clock;

import com.xworkz.timepiece.timepiece.Timepiece;

public class Clock extends Timepiece {

    @Override
    public void validateTimepieceDetails() {
        System.out.println("Clock: A timepiece used to measure and display time in a fixed location.");
    }

    public void clockType() {
        System.out.println("This is an analog clock with hour, minute, and second hands.");
    }

    public void powerSource() {
        System.out.println("Clocks can be powered by batteries, electricity, or mechanical wind-up.");
    }

    public void alarm() {
        System.out.println("This clock is equipped with an alarm function.");
    }

    public void decorativeFeatures() {
        System.out.println("Clocks are often designed with decorative elements for aesthetic appeal.");
    }
}
