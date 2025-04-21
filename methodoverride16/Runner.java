package com.xworkz.methodoverride16;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Fruit Object ----");
        Fruit fruit = new Fruit();
        fruit.grow();
        fruit.harvest();
        fruit.eat();
        fruit.store();

        System.out.println("\n---- Fruit Reference, Banana Object ----");
        Fruit fruit1 = new Banana();
        fruit1.grow();
        fruit1.harvest();
        fruit1.eat();
        fruit1.store();

        System.out.println("\n---- Banana Object ----");
        Banana banana = new Banana();
        banana.grow();
        banana.harvest();
        banana.eat();
        banana.store();
    }
}