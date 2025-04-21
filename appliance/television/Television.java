package com.xworkz.appliance.television;

import com.xworkz.appliance.appliance.Appliance;

public class Television extends Appliance {


    public void validateApplianceDetails() {
        System.out.println("Television is used for entertainment and information.");
    }

    public void screenType() {
        System.out.println("Screen Type: OLED Display");
    }

    public void resolution() {
        System.out.println("Resolution: 4K Ultra HD");
    }

    public void smartFeatures() {
        System.out.println("Smart Features: Wi-Fi, Voice Control, Built-in Apps");
    }

    public void soundSystem() {
        System.out.println("Sound: Dolby Atmos surround sound");
    }

    public void screenSize() {
        System.out.println("Screen Size: 55 inches");
    }
}
