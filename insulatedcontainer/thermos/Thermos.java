package com.xworkz.insulatedcontainer.thermos;

import com.xworkz.insulatedcontainer.insulatedcontainer.InsulatedContainer;

public class Thermos extends InsulatedContainer {

   
    public void validateContainerDetails() {
        System.out.println("Thermos: Validating thermos container details.");
    }

    
    public void openLid() {
        System.out.println("Thermos: Lid opened with a click mechanism.");
    }

    
    public void closeLid() {
        System.out.println("Thermos: Lid tightly sealed.");
    }

    
    public void checkTemperature() {
        System.out.println("Thermos: Temperature is 60°C.");
    }
    
    public void cleanContainer() {
        System.out.println("Thermos: Cleaning with hot water.");
    }

    public void fillLiquid(String liquid) {
        System.out.println("Thermos: Filled with " + liquid + ".");
    }
}
