package com.xworkz.plastic;
import com.xworkz.plastic.bottle.Bottle;
import com.xworkz.plastic.plastic.Plastic;

public class PlasticRunner {
    public static void main(String any[])
    {
        Plastic plastic = new Plastic();
        plastic.validatePlasticDetails();
        plastic.getPlasticInfo();

        Bottle bottle =new Bottle();
        bottle.validatePlasticDetails();;
        bottle.getPlasticInfo();
    }
}
