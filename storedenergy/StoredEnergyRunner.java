package com.xworkz.storedenergy;

import com.xworkz.storedenergy.battery.Battery;
import com.xworkz.storedenergy.storedenergy.StoredEnergy;

public class StoredEnergyRunner {
    public static void main(String[] args) {
        StoredEnergy storedEnergy = new StoredEnergy();
        storedEnergy.validateStoredEnergyDetails();

        Battery battery=new Battery();
        battery.validateStoredEnergyDetails();
    }
}
