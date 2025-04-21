package com.xworkz.methodoverride16;

public class Banana extends Fruit {

    @Override
    public void grow() {
        System.out.println("Bananas grow in clusters on a tall plant.");
    }

    @Override
    public void harvest() {
        System.out.println("Bananas are harvested when they turn slightly yellow.");
    }

    @Override
    public void eat() {
        System.out.println("Bananas are peeled and eaten fresh or used in smoothies and desserts.");
    }

    @Override
    public void store() {
        System.out.println("Bananas are stored at room temperature away from direct sunlight.");
    }
}