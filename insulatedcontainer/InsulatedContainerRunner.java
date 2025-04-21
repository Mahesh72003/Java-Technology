package com.xworkz.insulatedcontainer;

import com.xworkz.insulatedcontainer.insulatedcontainer.InsulatedContainer;
import com.xworkz.insulatedcontainer.thermos.Thermos;

public class InsulatedContainerRunner {
    public static void main(String[] args) {


        InsulatedContainer insulatedContainer = new InsulatedContainer();
        insulatedContainer.validateContainerDetails();
        insulatedContainer.openLid();
        insulatedContainer.closeLid();
        insulatedContainer.checkTemperature();
        insulatedContainer.cleanContainer();


        InsulatedContainer ref = new Thermos();
        ref.validateContainerDetails();
        ref.openLid();
        ref.closeLid();
        ref.checkTemperature();
        ref.cleanContainer();


        Thermos thermos = new Thermos();
        thermos.validateContainerDetails();
        thermos.openLid();
        thermos.closeLid();
        thermos.checkTemperature();
        thermos.cleanContainer();
        thermos.fillLiquid("Coffee");
    }
}
