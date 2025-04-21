package com.xworkz.portablelight;

import com.xworkz.portablelight.flashlight.Flashlight;
import com.xworkz.portablelight.portablelight.PortableLight;

public class PortableLightRunner {
    public static void main(String[] args) {


        PortableLight portableLight = new PortableLight();
        portableLight.validatePortableLightDetails();
        portableLight.lightIntensity();
        portableLight.rechargePortableLight();
        portableLight.adjustLightAngle();
        portableLight.energyEfficiency();


        PortableLight ref = new Flashlight();
        ref.validatePortableLightDetails();
        ref.lightIntensity();
        ref.rechargePortableLight();
        ref.adjustLightAngle();
        ref.energyEfficiency();


        Flashlight flashlight = new Flashlight();
        flashlight.validatePortableLightDetails();
        flashlight.lightIntensity();
        flashlight.rechargePortableLight();
        flashlight.adjustLightAngle();
        flashlight.energyEfficiency();
        flashlight.adjustBrightness();
        flashlight.shockResistance();
        flashlight.waterproof();
        flashlight.batteryIndicator();
    }
}
