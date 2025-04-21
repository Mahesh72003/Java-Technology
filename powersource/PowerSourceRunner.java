package com.xworkz.powersource;

import com.xworkz.powersource.powersource.PowerSource;
import com.xworkz.powersource.phonecharger.PhoneCharger;

public class PowerSourceRunner {
    public static void main(String[] args) {



        PowerSource powerSource = new PowerSource();
        powerSource.validatePowerSourceDetails();
        powerSource.powerEfficiency();
        powerSource.chargingTime();
        powerSource.voltageInfo();
        powerSource.compatibility();



        PhoneCharger phoneCharger = new PhoneCharger();
        phoneCharger.validatePowerSourceDetails();
        phoneCharger.quickCharge();
        phoneCharger.usbType();
        phoneCharger.cableLength();
        phoneCharger.overchargeProtection();



        PowerSource powerSourceRef = new PhoneCharger();
        powerSourceRef.validatePowerSourceDetails();
        powerSourceRef.powerEfficiency();
        powerSourceRef.chargingTime();
        powerSourceRef.voltageInfo();
        powerSourceRef.compatibility();
    }
}
