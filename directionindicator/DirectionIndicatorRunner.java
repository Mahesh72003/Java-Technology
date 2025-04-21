package com.xworkz.directionindicator;

import com.xworkz.directionindicator.directionindicator.DirectionIndicator;
import com.xworkz.directionindicator.compass.Compass;

public class DirectionIndicatorRunner {
    public static void main(String[] args) {


        DirectionIndicator directionIndicator = new DirectionIndicator();
        directionIndicator.validateDirectionIndicatorDetails();
        directionIndicator.indicatorType();
        directionIndicator.accuracy();
        directionIndicator.usage();
        directionIndicator.maintenance();



        Compass compass = new Compass();
        compass.validateDirectionIndicatorDetails();
        compass.indicatorType();
        compass.accuracy();
        compass.usage();
        compass.maintenance();
        compass.compassType();
        compass.compassAccuracy();
        compass.compassMaterial();
        compass.compassUsage();
        compass.compassHistory();


        System.out.println("\n=== Polymorphism Example ===");
        DirectionIndicator polyCompass = new Compass();
        polyCompass.validateDirectionIndicatorDetails();
        polyCompass.indicatorType();
        polyCompass.accuracy();
        polyCompass.usage();
        polyCompass.maintenance();
    }
}
