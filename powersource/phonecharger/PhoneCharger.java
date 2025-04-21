package com.xworkz.powersource.phonecharger;

import com.xworkz.powersource.powersource.PowerSource;

public class PhoneCharger extends PowerSource {

    public void validatePowerSourceDetails() {
        System.out.println("Phone charger is a power source used specifically to charge phones.");
    }

    public void quickCharge() {
        System.out.println("Some phone chargers support quick charging features to reduce charging time.");
    }

    public void usbType() {
        System.out.println("Phone chargers use various USB types like USB-A, USB-C, etc.");
    }

    public void cableLength() {
        System.out.println("Phone chargers come with varying cable lengths for convenience.");
    }

    public void overchargeProtection() {
        System.out.println("Modern phone chargers have overcharge protection to prevent battery damage.");
    }
}
