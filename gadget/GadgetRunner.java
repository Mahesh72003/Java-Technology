package com.xworkz.gadget;

import com.xworkz.gadget.gadget.Gadget;
import com.xworkz.gadget.phone.Phone;

public class GadgetRunner {
    public static void main(String[] args) {
        Gadget gadget = new Gadget();
        gadget.validateGadgetDetails();
        gadget.getGadgetInfo();


        Phone phone = new Phone();
        phone.validateGadgetDetails();
        phone.getGadgetInfo();
    }
}
