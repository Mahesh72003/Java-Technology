package com.xworkz.powersource;

import com.xworkz.powersource.powersource.PowerSource;
import com.xworkz.powersource.phonecharger.PhoneCharger;

public class PowerSourceRunner {
    public static void main(String[] args) {
        PowerSource powerSource = new PowerSource();
        powerSource.validatePowerSourceDetails();

        PhoneCharger phoneCharger = new PhoneCharger();
        phoneCharger.validatePowerSourceDetails();
    }
}
