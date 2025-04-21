package com.xworkz.methodoverride46;

public class Runner {
    public static void main(String[] args) {
        System.out.println("--- Gear Object ---");
        Gear gear = new Gear();
        gear.equip();
        gear.use();
        gear.maintain();
        gear.store();
        gear.info();

        System.out.println("--- Gear Reference, Shovel Object ---");
        Gear shovelRef = new Shovel();
        shovelRef.equip();
        shovelRef.use();
        shovelRef.maintain();
        shovelRef.store();
        shovelRef.info();

        System.out.println("--- Shovel Object ---");
        Shovel shovel = new Shovel();
        shovel.equip();
        shovel.use();
        shovel.maintain();
        shovel.store();
        shovel.info();
    }
}