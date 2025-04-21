package com.xworkz.methodoverride8;

public class Sidekick extends Character {

    @Override
    public void speak() {
        System.out.println("Sidekick says: 'I've got your back!'");
    }

    @Override
    public void act() {
        System.out.println("Sidekick jumps into action beside the hero.");
    }

    @Override
    public void assist() {
        System.out.println("Sidekick is supporting the hero with tools and advice.");
    }

    @Override
    public void retreat() {
        System.out.println("Sidekick retreats strategically to regroup.");
    }
}