package com.xworkz.directionindicator;

import com.xworkz.directionindicator.directionindicator.DirectionIndicator;
import com.xworkz.directionindicator.compass.Compass;

public class DirectionIndicatorRunner {
    public static void main(String[] args) {
        DirectionIndicator directionIndicator = new DirectionIndicator();
        directionIndicator.validateDirectionIndicatorDetails();

        Compass compass = new Compass();
        compass.validateDirectionIndicatorDetails();
    }
}
