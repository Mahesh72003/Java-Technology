package com.xworkz.methodoverride26;

public class Succulents extends Cactus {

    @Override
    public void storeWater() {
        System.out.println("Succulents store water in leaves, stems, or roots.");
    }

    @Override
    public void surviveDesert() {
        System.out.println("Succulents adapt well to dry, arid environments.");
    }

    @Override
    public void photosynthesize() {
        System.out.println("Succulents use CAM photosynthesis to conserve water.");
    }

    @Override
    public void bloom() {
        System.out.println("Succulents bloom with delicate, vibrant flowers.");
    }
}