package com.xworkz.storedenergy;

import com.xworkz.storedenergy.battery.Battery;
import com.xworkz.storedenergy.storedenergy.StoredEnergy;

public class StoredEnergyRunner {
    public static void main(String[] args) {


        StoredEnergy storedEnergy = new StoredEnergy();
        storedEnergy.validateStoredEnergyDetails();
        storedEnergy.energyType();
        storedEnergy.energyCapacity();
        storedEnergy.energyLoss();
        storedEnergy.storageMedium();
        storedEnergy.efficiency();


        Battery battery = new Battery();
        battery.validateStoredEnergyDetails();
        battery.batteryType();
        battery.chargeRate();
        battery.batteryLife();
        battery.dischargeRate();
        battery.voltage();


        StoredEnergy polymorphicStoredEnergy = new Battery();
        polymorphicStoredEnergy.validateStoredEnergyDetails();
        polymorphicStoredEnergy.energyType();
        polymorphicStoredEnergy.energyCapacity();
        polymorphicStoredEnergy.energyLoss();
        polymorphicStoredEnergy.storageMedium();
        polymorphicStoredEnergy.efficiency();
    }
}
