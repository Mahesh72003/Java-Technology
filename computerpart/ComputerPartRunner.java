package com.xworkz.computerpart;

import com.xworkz.computerpart.computerpart.ComputerPart;
import com.xworkz.computerpart.ram.Ram;

public class ComputerPartRunner {
    public static void main(String[] args) {
        ComputerPart computerPart = new ComputerPart();
        computerPart.validatePartDetails();

        Ram ram = new Ram();
        ram.validatePartDetails();
    }
}
