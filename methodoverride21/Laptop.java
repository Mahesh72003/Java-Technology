package com.xworkz.methodoverride21;

public class Laptop extends Electronics {

    @Override
    public void turnOn() {
        System.out.println("Laptop is booting up with operating system.");
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop is shutting down safely.");
    }

    @Override
    public void reset() {
        System.out.println("Laptop is performing a factory reset.");
    }

    @Override
    public void update() {
        System.out.println("Laptop is installing system and software updates.");
    }
}