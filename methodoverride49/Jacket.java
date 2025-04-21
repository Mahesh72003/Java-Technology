package com.xworkz.methodoverride49;

public class Jacket extends Apparel {
    @Override
    public void wear() {
        System.out.println("Jacket is worn to keep warm.");
    }

    @Override
    public void remove() {
        System.out.println("Jacket is taken off after use.");
    }

    @Override
    public void clean() {
        System.out.println("Jacket is dry cleaned for maintenance.");
    }

    @Override
    public void store() {
        System.out.println("Jacket is stored in the closet.");
    }

    @Override
    public void info() {
        System.out.println("This is a warm apparel item called a Jacket.");
    }
}