package com.xworkz.timepiece;

import com.xworkz.timepiece.clock.Clock;
import com.xworkz.timepiece.timepiece.Timepiece;

public class TimepieceRunner {
    public static void main(String[] args) {
        Timepiece timepiece = new Timepiece();
        timepiece.validateTimepieceDetails();

        Clock clock = new Clock();
        clock.validateTimepieceDetails();
    }
}
