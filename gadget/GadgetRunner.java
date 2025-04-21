package com.xworkz.gadget;

import com.xworkz.gadget.gadget.Gadget;
import com.xworkz.gadget.phone.Phone;

public class GadgetRunner {
    public static void main(String[] args) {
        Gadget gadget = new Gadget();
        gadget.validateGadgetDetails();
        gadget.getGadgetInfo();
        gadget.powerSource();
        gadget.connectivity();
        gadget.maintenance();

        Phone phone = new Phone();
        phone.validateGadgetDetails();
        phone.getGadgetInfo();
        phone.powerSource();
        phone.connectivity();
        phone.maintenance();
        phone.cameraFeatures();
        phone.phoneOperatingSystem();
        phone.screenSize();

        Gadget gadget1 = new Phone();
        gadget1.validateGadgetDetails();
        gadget1.getGadgetInfo();
        gadget1.powerSource();
        gadget1.connectivity();
        gadget1.maintenance();
    }
}
