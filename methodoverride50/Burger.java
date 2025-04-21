package com.xworkz.methodoverride50;

public class Burger extends FastFood {
    @Override
    public void order() {
        System.out.println("Burger order is placed.");
    }

    @Override
    public void prepare() {
        System.out.println("Burger is being grilled and assembled.");
    }

    @Override
    public void serve() {
        System.out.println("Burger is served with fries.");
    }

    @Override
    public void eat() {
        System.out.println("Burger is eaten with a delicious bite.");
    }

    @Override
    public void info() {
        System.out.println("This is a fast food item called a Burger.");
    }
}