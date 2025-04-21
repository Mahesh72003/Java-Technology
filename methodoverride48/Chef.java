package com.xworkz.methodoverride48;

public class Chef extends Individual {
    @Override
    public void think() {
        System.out.println("Chef is thinking about the next recipe.");
    }

    @Override
    public void speak() {
        System.out.println("Chef is talking to the kitchen staff.");
    }

    @Override
    public void work() {
        System.out.println("Chef is preparing meals in the kitchen.");
    }

    @Override
    public void sleep() {
        System.out.println("Chef is resting after a long day of cooking.");
    }

    @Override
    public void info() {
        System.out.println("This is an individual who is a Chef, specializing in cooking.");
    }
}