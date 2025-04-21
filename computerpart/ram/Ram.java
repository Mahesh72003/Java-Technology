package com.xworkz.computerpart.ram;

import com.xworkz.computerpart.computerpart.ComputerPart;

public class Ram extends ComputerPart {

    public void validatePartDetails() {
        System.out.println("RAM (Random Access Memory) is used to store data that is actively being used by the computer.");
    }

    public void ramCapacity() {
        System.out.println("Capacity: RAM is typically measured in gigabytes (GB) or terabytes (TB).");
    }

    public void ramSpeed() {
        System.out.println("Speed: RAM speed is measured in MHz or GHz, affecting overall performance.");
    }

    public void ramType() {
        System.out.println("Type: Common types include DDR3, DDR4, and DDR5.");
    }

    public void ramPowerConsumption() {
        System.out.println("Power Consumption: RAM uses low power to ensure minimal heat generation.");
    }

    public void ramUpgradeability() {
        System.out.println("Upgradeability: RAM can be upgraded if the motherboard supports higher capacity modules.");
    }
}
