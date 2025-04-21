package com.xworkz.methodoverride26;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Cactus Object ----");
        Cactus cactus = new Cactus();
        cactus.storeWater();
        cactus.surviveDesert();
        cactus.photosynthesize();
        cactus.bloom();

        System.out.println("\n---- Cactus Reference, Succulents Object ----");
        Cactus cactus1 = new Succulents();
        cactus1.storeWater();
        cactus1.surviveDesert();
        cactus1.photosynthesize();
        cactus1.bloom();

        System.out.println("\n---- Succulents Object ----");
        Succulents succulents = new Succulents();
        succulents.storeWater();
        succulents.surviveDesert();
        succulents.photosynthesize();
        succulents.bloom();
    }
}