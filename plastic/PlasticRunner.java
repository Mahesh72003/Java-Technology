package com.xworkz.plastic;

import com.xworkz.plastic.bottle.Bottle;
import com.xworkz.plastic.plastic.Plastic;

public class PlasticRunner {
    public static void main(String[] args) {


        Plastic plastic = new Plastic();
        plastic.validatePlasticDetails();
        plastic.getPlasticInfo();
        plastic.recyclePlastic();
        plastic.checkPlasticStrength();
        plastic.usePlasticSafely();


        Plastic ref = new Bottle();
        ref.validatePlasticDetails();
        ref.getPlasticInfo();
        ref.recyclePlastic();
        ref.checkPlasticStrength();
        ref.usePlasticSafely();


        Bottle bottle = new Bottle();
        bottle.validatePlasticDetails();
        bottle.getPlasticInfo();
        bottle.recyclePlastic();
        bottle.checkPlasticStrength();
        bottle.usePlasticSafely();
        bottle.bottleShape();
        bottle.reusableBottle();
        bottle.plasticBottleWaste();
    }
}
