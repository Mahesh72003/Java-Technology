package com.xworkz.methodoverride17;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Plant Object ----");
        Plant plant = new Plant();
        plant.grow();
        plant.photosynthesize();
        plant.absorbWater();
        plant.reproduce();

        System.out.println("\n---- Plant Reference, Bush Object ----");
        Plant plant1 = new Bush();
        plant1.grow();
        plant1.photosynthesize();
        plant1.absorbWater();
        plant1.reproduce();

        System.out.println("\n---- Bush Object ----");
        Bush bush = new Bush();
        bush.grow();
        bush.photosynthesize();
        bush.absorbWater();
        bush.reproduce();
    }
}