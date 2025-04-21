package com.xworkz.computerpart;

import com.xworkz.computerpart.computerpart.ComputerPart;
import com.xworkz.computerpart.ram.Ram;

public class ComputerPartRunner {
    public static void main(String[] args) {

        ComputerPart computerPart = new ComputerPart();
        computerPart.validatePartDetails();
        computerPart.partMaterial();
        computerPart.partFunction();
        computerPart.partBrand();
        computerPart.partWarranty();
        computerPart.partCompatibility();


        Ram ram = new Ram();
        ram.validatePartDetails();
        ram.partMaterial();
        ram.partFunction();
        ram.partBrand();
        ram.partWarranty();
        ram.partCompatibility();
        ram.ramCapacity();
        ram.ramSpeed();
        ram.ramType();
        ram.ramPowerConsumption();
        ram.ramUpgradeability();


        ComputerPart polyRam = new Ram();
        polyRam.validatePartDetails();
        polyRam.partMaterial();
        polyRam.partFunction();
        polyRam.partBrand();
        polyRam.partWarranty();
        polyRam.partCompatibility();
    }
}
