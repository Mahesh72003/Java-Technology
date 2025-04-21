package com.xworkz.methodoverride43;

public class Cabinet extends Fixture {
    @Override
    public void install() {
        System.out.println("Cabinet is mounted on the wall.");
    }

    @Override
    public void remove() {
        System.out.println("Cabinet has been taken down.");
    }

    @Override
    public void use() {
        System.out.println("Cabinet is being used to store items.");
    }

    @Override
    public void repair() {
        System.out.println("Cabinet doors are being fixed.");
    }

    @Override
    public void info() {
        System.out.println("This is a wooden storage cabinet.");
    }
}