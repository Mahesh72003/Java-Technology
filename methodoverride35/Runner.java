package com.xworkz.methodoverride35;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Gadget Object ----");
        Gadget gadget = new Gadget();
        gadget.powerOn();
        gadget.operate();
        gadget.stop();
        gadget.store();

        System.out.println("\n---- Gadget Reference, Toaster Object ----");
        Gadget gadget1 = new Toaster();
        gadget1.powerOn();
        gadget1.operate();
        gadget1.stop();
        gadget1.store();

        System.out.println("\n---- Toaster Object ----");
        Toaster toaster = new Toaster();
        toaster.powerOn();
        toaster.operate();
        toaster.stop();
        toaster.store();
    }
}