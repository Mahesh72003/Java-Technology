package com.xworkz.cleaningappliance.vacuum;

import com.xworkz.cleaningappliance.cleaningappliance.CleaningAppliance;

public class Vacuum extends CleaningAppliance {


    public void validateApplianceDetails() {
        System.out.println("Vacuum cleaner is a powerful tool for cleaning floors, carpets, and upholstery.");
    }

    public void suctionPower() {
        System.out.println("Suction Power: 20 kPa");
    }

    public void hasHEPAFilter() {
        System.out.println("HEPA Filter: Yes");
    }

    public void dustCapacity() {
        System.out.println("Dust Capacity: 2 liters");
    }

    public void noiseLevel() {
        System.out.println("Noise Level: 75 dB");
    }

    public void warrantyPeriod() {
        System.out.println("Warranty: 2 years");
    }
}
