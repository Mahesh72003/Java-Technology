package com.xworkz.methodoverride46;

public class Shovel extends Gear {
    @Override
    public void equip() {
        System.out.println("Shovel is picked up and ready to dig.");
    }

    @Override
    public void use() {
        System.out.println("Shovel is being used to dig soil.");
    }

    @Override
    public void maintain() {
        System.out.println("Shovel is cleaned and oiled to prevent rust.");
    }

    @Override
    public void store() {
        System.out.println("Shovel is placed back in the tool shed.");
    }

    @Override
    public void info() {
        System.out.println("This is a hand tool used for digging called a Shovel.");
    }
}