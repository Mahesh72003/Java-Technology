package com.xworkz.methodoverride9;

public class Wrench extends Tool {

    @Override
    public void use() {
        System.out.println("Wrench is being used to tighten bolts.");
    }

    @Override
    public void clean() {
        System.out.println("Wrench is being cleaned after use.");
    }

    @Override
    public void store() {
        System.out.println("Wrench is being stored in the toolbox.");
    }

    @Override
    public void maintain() {
        System.out.println("Wrench is being oiled and checked for wear.");
    }
}