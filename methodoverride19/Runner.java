package com.xworkz.methodoverride19;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Bird Object ----");
        Bird bird = new Bird();
        bird.fly();
        bird.sing();
        bird.eat();
        bird.sleep();

        System.out.println("\n---- Bird Reference, Parrot Object ----");
        Bird bird1 = new Parrot();
        bird1.fly();
        bird1.sing();
        bird1.eat();
        bird1.sleep();

        System.out.println("\n---- Parrot Object ----");
        Parrot parrot = new Parrot();
        parrot.fly();
        parrot.sing();
        parrot.eat();
        parrot.sleep();
    }
}