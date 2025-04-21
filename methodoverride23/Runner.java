package com.xworkz.methodoverride23;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Person Object ----");
        Person person = new Person();
        person.speak();
        person.walk();
        person.eat();
        person.sleep();

        System.out.println("\n---- Person Reference, Scientist Object ----");
        Person person1 = new Scientist();
        person1.speak();
        person1.walk();
        person1.eat();
        person1.sleep();

        System.out.println("\n---- Scientist Object ----");
        Scientist scientist = new Scientist();
        scientist.speak();
        scientist.walk();
        scientist.eat();
        scientist.sleep();
    }
}