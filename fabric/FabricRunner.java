package com.xworkz.fabric;

import com.xworkz.fabric.fabric.Fabric;
import com.xworkz.fabric.shirt.Shirt;

public class FabricRunner {
    public static void main(String[] args) {
        Fabric fabric = new Fabric();
        fabric.validateFabricDetails();
        fabric.getFabricInfo();
        fabric.fabricType();
        fabric.durability();
        fabric.maintenance();

        Shirt shirt = new Shirt();
        shirt.validateFabricDetails();
        shirt.getFabricInfo();
        shirt.fabricType();
        shirt.durability();
        shirt.maintenance();
        shirt.shirtType();
        shirt.collarType();
        shirt.sleeveType();

        Fabric fabric1 = new Shirt();
        fabric1.validateFabricDetails();
        fabric1.getFabricInfo();
        fabric1.fabricType();
        fabric1.durability();
        fabric1.maintenance();
    }
}
