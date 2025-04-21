package com.xworkz.methodoverride7;

public class Sushi extends Food {

    @Override
    public void prepare() {
        System.out.println("Sushi ingredients are being sliced and arranged.");
    }

    @Override
    public void cook() {
        System.out.println("Sushi rice is being steamed and seasoned.");
    }

    @Override
    public void serve() {
        System.out.println("Sushi is served with wasabi, soy sauce, and ginger.");
    }

    @Override
    public void pack() {
        System.out.println("Sushi is carefully packed in a bento box.");
    }
}