package com.xworkz.methodoverride21;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Electronics Object ----");
        Electronics electronics = new Electronics();
        electronics.turnOn();
        electronics.turnOff();
        electronics.reset();
        electronics.update();

        System.out.println("\n---- Electronics Reference, Laptop Object ----");
        Electronics electronics1 = new Laptop();
        electronics1.turnOn();
        electronics1.turnOff();
        electronics1.reset();
        electronics1.update();

        System.out.println("\n---- Laptop Object ----");
        Laptop laptop = new Laptop();
        laptop.turnOn();
        laptop.turnOff();
        laptop.reset();
        laptop.update();
    }
}