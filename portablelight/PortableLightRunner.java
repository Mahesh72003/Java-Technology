package com.xworkz.portablelight;

import com.xworkz.portablelight.flashlight.Flashlight;
import com.xworkz.portablelight.portablelight.PortableLight;

public class PortableLightRunner {
    public static void main(String anytihg[])
    {
        PortableLight portableLight = new PortableLight();
        portableLight.validatePortableLightDetails();

        Flashlight flashlight = new Flashlight();
        flashlight.validatePortableLightDetails();
    }
}
