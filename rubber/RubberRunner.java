package com.xworkz.rubber;

import com.xworkz.rubber.rubber.Rubber;
import com.xworkz.rubber.shoes.Shoes;

public class RubberRunner {
    public static void main(String arg[]) {


        Rubber rubber = new Rubber();
        rubber.validateRubberDetails();
        rubber.rubberElasticity();
        rubber.rubberUses();
        rubber.rubberDurability();
        rubber.rubberResilience();


        Shoes shoes = new Shoes();
        shoes.validateRubberDetails();
        shoes.shoeDesign();
        shoes.shoeProtection();
        shoes.shoeGrip();
        shoes.shoeMaintenance();


        Rubber rubber1 = new Rubber();
        Rubber type = (Rubber) rubber1;
        type.validateRubberDetails();
        type.rubberElasticity();
        type.rubberUses();
        type.rubberDurability();
        type.rubberResilience();
    }
}
