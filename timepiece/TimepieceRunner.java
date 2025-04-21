package com.xworkz.timepiece;

import com.xworkz.timepiece.clock.Clock;
import com.xworkz.timepiece.timepiece.Timepiece;

public class TimepieceRunner {
    public static void main(String[] args) {


        Timepiece timepiece = new Timepiece();
        timepiece.validateTimepieceDetails();
        timepiece.timeType();
        timepiece.timeMeasurement();
        timepiece.displayType();
        timepiece.material();


        Clock clock = new Clock();
        clock.validateTimepieceDetails();
        clock.clockType();
        clock.powerSource();
        clock.alarm();
        clock.decorativeFeatures();


        Timepiece polymorphicTimepiece = new Clock();
        polymorphicTimepiece.validateTimepieceDetails();
        polymorphicTimepiece.timeType();
        polymorphicTimepiece.timeMeasurement();
        polymorphicTimepiece.displayType();
        polymorphicTimepiece.material();
    }
}
