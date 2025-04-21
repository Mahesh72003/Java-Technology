package com.xworkz.methodoverride34;

public class Paper extends Substance {

    @Override
    public void form() {
        System.out.println("Paper is formed from wood pulp.");
    }

    @Override
    public void use() {
        System.out.println("Paper is being used for writing and printing.");
    }

    @Override
    public void dispose() {
        System.out.println("Paper is disposed of after use.");
    }

    @Override
    public void recycle() {
        System.out.println("Paper is recycled to make new paper products.");
    }
}