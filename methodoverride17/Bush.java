package com.xworkz.methodoverride17;

public class Bush extends Plant {

    @Override
    public void grow() {
        System.out.println("Bush is growing low to the ground with thick foliage.");
    }

    @Override
    public void photosynthesize() {
        System.out.println("Bush is converting sunlight into energy through its leaves.");
    }

    @Override
    public void absorbWater() {
        System.out.println("Bush absorbs water efficiently from shallow soil.");
    }

    @Override
    public void reproduce() {
        System.out.println("Bush reproduces through seeds and can spread rapidly.");
    }
}