package com.xworkz.methodoverride43;

public class Fixture {
    public void install() {
        System.out.println("Fixture is being installed.");
    }

    public void remove() {
        System.out.println("Fixture is being removed.");
    }

    public void use() {
        System.out.println("Fixture is now in use.");
    }

    public void repair() {
        System.out.println("Fixture is under maintenance.");
    }

    public void info() {
        System.out.println("This is a general fixture.");
    }
}