package com.xworkz.methodoverride19;

public class Parrot extends Bird {

    @Override
    public void fly() {
        System.out.println("Parrot is flying gracefully with colorful wings.");
    }

    @Override
    public void sing() {
        System.out.println("Parrot is mimicking human speech and whistling tunes.");
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating fruits, nuts, and seeds.");
    }

    @Override
    public void sleep() {
        System.out.println("Parrot is perched quietly, resting for the night.");
    }
}