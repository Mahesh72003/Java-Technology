package com.xworkz.safetygear;

import com.xworkz.safetygear.safetygear.SafetyGear;
import com.xworkz.safetygear.helmet.Helmet;

public class SafetyGearRunner {
    public static void main(String[] args) {
        SafetyGear gear = new SafetyGear();
        gear.validateSafetyGearDetails();
        gear.safetyGearPurpose();
        gear.safetyGearVariety();
        gear.safetyGearQuality();
        gear.safetyGearComfort();

        Helmet helmet = new Helmet();
        helmet.validateSafetyGearDetails();
        helmet.helmetDesign();
        helmet.helmetTypes();
        helmet.helmetComfort();
        helmet.helmetSafetyStandards();

        SafetyGear gear1 = new SafetyGear();
        SafetyGear type = (SafetyGear) gear1;
        type.validateSafetyGearDetails();
        type.safetyGearPurpose();
        type.safetyGearVariety();
        type.safetyGearQuality();
        type.safetyGearComfort();
    }
}
