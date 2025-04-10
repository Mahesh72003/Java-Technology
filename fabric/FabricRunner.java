package com.xworkz.fabric;

import com.xworkz.fabric.fabric.Fabric;
import com.xworkz.fabric.shirt.Shirt;

public class FabricRunner {
    public static void main(String anything[])
    {
        Fabric fabric = new Fabric();
        fabric.validateFabricDetails();
        fabric.getFabricInfo();

        Shirt shirt = new Shirt();
        shirt.validateFabricDetails();;
        shirt.getFabricInfo();
    }
}
