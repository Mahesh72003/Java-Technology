package com.xworkz.methodoverride11;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Material Object ----");
        Material material = new Material();
        material.identify();
        material.test();
        material.process();
        material.store();

        System.out.println("\n---- Material Reference, Stone Object ----");
        Material material1 = new Stone();
        material1.identify();
        material1.test();
        material1.process();
        material1.store();

        System.out.println("\n---- Stone Object ----");
        Stone stone = new Stone();
        stone.identify();
        stone.test();
        stone.process();
        stone.store();
    }
}