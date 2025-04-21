package com.xworkz.methodoverride23;

public class Scientist extends Person {

    @Override
    public void speak() {
        System.out.println("Scientist is giving a lecture on quantum physics.");
    }

    @Override
    public void walk() {
        System.out.println("Scientist is walking through the research lab.");
    }

    @Override
    public void eat() {
        System.out.println("Scientist is having a quick snack between experiments.");
    }

    @Override
    public void sleep() {
        System.out.println("Scientist is sleeping after a long day of research.");
    }
}