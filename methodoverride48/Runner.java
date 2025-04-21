package com.xworkz.methodoverride48;

public class Runner {
    public static void main(String[] args) {
        System.out.println("--- Individual Object ---");
        Individual individual = new Individual();
        individual.think();
        individual.speak();
        individual.work();
        individual.sleep();
        individual.info();

        System.out.println("--- Individual Reference, Chef Object ---");
        Individual chefRef = new Chef();
        chefRef.think();
        chefRef.speak();
        chefRef.work();
        chefRef.sleep();
        chefRef.info();

        System.out.println("--- Chef Object ---");
        Chef chef = new Chef();
        chef.think();
        chef.speak();
        chef.work();
        chef.sleep();
        chef.info();
    }
}