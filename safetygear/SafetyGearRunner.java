package com.xworkz.safetygear;

import com.xworkz.safetygear.helmet.Helmet;
import com.xworkz.safetygear.safetygear.SafetyGear;

public class SafetyGearRunner {
    public static void main(String[] args) {
        SafetyGear gear = new SafetyGear();
        gear.validateSafetyGearDetails();

        Helmet helmet = new Helmet();
        helmet.validateSafetyGearDetails();
    }
}
