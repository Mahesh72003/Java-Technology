package com.xworkz.storedenergy.battery;

import com.xworkz.storedenergy.storedenergy.StoredEnergy;

public class Battery extends StoredEnergy {

    @Override
    public void validateStoredEnergyDetails() {
        System.out.println("Battery: Stores energy chemically for later use.");
    }

    public void batteryType() {
        System.out.println("This is a lithium-ion battery.");
    }

    public void chargeRate() {
        System.out.println("Charge rate is measured in Coulombs per second or Amps.");
    }

    public void batteryLife() {
        System.out.println("Battery life is typically measured in charge cycles.");
    }

    public void dischargeRate() {
        System.out.println("Discharge rate refers to the rate at which a battery releases stored energy.");
    }

    public void voltage() {
        System.out.println("Typical battery voltage ranges from 1.2V to 3.7V for lithium-based batteries.");
    }
}
