package com.xworkz.methodoverride11;

public class Stone extends Material {

    @Override
    public void identify() {
        System.out.println("Stone is being identified by its type and texture.");
    }

    @Override
    public void test() {
        System.out.println("Stone is being tested for hardness and durability.");
    }

    @Override
    public void process() {
        System.out.println("Stone is being cut and shaped for construction.");
    }

    @Override
    public void store() {
        System.out.println("Stone is being stored in a dry and safe place to prevent damage.");
    }
}