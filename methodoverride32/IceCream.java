package com.xworkz.methodoverride32;

public class IceCream extends Dish {

    @Override
    public void prepare() {
        System.out.println("Ice cream is being scooped into bowls.");
    }

    @Override
    public void serve() {
        System.out.println("Ice cream is served with toppings.");
    }

    @Override
    public void eat() {
        System.out.println("Ice cream is being enjoyed on a sunny day.");
    }

    @Override
    public void cleanUp() {
        System.out.println("Cleaning up the ice cream bowls.");
    }
}