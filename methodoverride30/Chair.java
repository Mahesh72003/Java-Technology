package com.xworkz.methodoverride30;

public class Chair extends Item {

    @Override
    public void use() {
        System.out.println("Chair is being used to sit.");
    }

    @Override
    public void clean() {
        System.out.println("Chair is being wiped clean.");
    }

    @Override
    public void store() {
        System.out.println("Chair is stored in the living room.");
    }

    @Override
    public void display() {
        System.out.println("Chair is displayed in the dining area.");
    }
}