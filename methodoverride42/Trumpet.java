package com.xworkz.methodoverride42;

public class Trumpet extends Sound {
    @Override
    public void play() {
        System.out.println("Trumpet is being played melodiously.");
    }

    @Override
    public void stop() {
        System.out.println("Trumpet sound has stopped.");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Trumpet's volume is increasing.");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Trumpet's volume is decreasing.");
    }

    @Override
    public void info() {
        System.out.println("This is a brass musical instrument: Trumpet.");
    }
}