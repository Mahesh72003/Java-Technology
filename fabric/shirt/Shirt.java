package com.xworkz.fabric.shirt;

import com.xworkz.fabric.fabric.Fabric;

public class Shirt extends Fabric {

    @Override
    public void validateFabricDetails() {
        System.out.println("A shirt is made from fabric, worn as a garment.");
    }

    @Override
    public void getFabricInfo() {
        System.out.println("Shirts are typically made from cotton, linen, or blends.");
    }

    public void shirtType() {
        System.out.println("Shirts can be formal, casual, or t-shirts.");
    }

    public void collarType() {
        System.out.println("Shirts may have different collar types like spread, button-down, or mandarin.");
    }

    public void sleeveType() {
        System.out.println("Shirts may have different sleeve types like short, long, or rolled-up sleeves.");
    }
}
