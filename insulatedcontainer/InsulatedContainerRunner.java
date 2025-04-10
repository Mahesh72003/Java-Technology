package com.xworkz.insulatedcontainer;

import com.xworkz.insulatedcontainer.insulatedcontainer.InsulatedContainer;
import com.xworkz.insulatedcontainer.thermos.Thermos;

public class InsulatedContainerRunner {
    public static void main(String[] args) {
        InsulatedContainer insulatedContainer = new InsulatedContainer();
        insulatedContainer.validateContainerDetails();

        Thermos thermos = new Thermos();
        thermos.validateContainerDetails();
    }
}
