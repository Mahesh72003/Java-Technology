package com.xworkz.methodoverride45;

public class Vine extends Greenery {
    @Override
    public void grow() {
        System.out.println("Vine is growing and climbing on surfaces.");
    }

    @Override
    public void trim() {
        System.out.println("Vine is being pruned to control its spread.");
    }

    @Override
    public void water() {
        System.out.println("Vine receives moderate watering.");
    }

    @Override
    public void bloom() {
        System.out.println("Vine has small blossoms appearing.");
    }

    @Override
    public void info() {
        System.out.println("This is a climbing plant known as a Vine.");
    }
}