package com.xworkz.methodoverride33;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Role Object ----");
        Role role = new Role();
        role.perform();
        role.grow();
        role.influence();
        role.resolve();

        System.out.println("\n---- Role Reference, Protagonist Object ----");
        Role role1 = new Protagonist();
        role1.perform();
        role1.grow();
        role1.influence();
        role1.resolve();

        System.out.println("\n---- Protagonist Object ----");
        Protagonist protagonist = new Protagonist();
        protagonist.perform();
        protagonist.grow();
        protagonist.influence();
        protagonist.resolve();
    }
}