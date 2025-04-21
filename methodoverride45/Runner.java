package com.xworkz.methodoverride45;

public class Runner {
    public static void main(String[] args) {
        System.out.println("--- Greenery Object ---");
        Greenery greenery = new Greenery();
        greenery.grow();
        greenery.trim();
        greenery.water();
        greenery.bloom();
        greenery.info();

        System.out.println("--- Greenery Reference, Vine Object ---");
        Greenery vineRef = new Vine();
        vineRef.grow();
        vineRef.trim();
        vineRef.water();
        vineRef.bloom();
        vineRef.info();

        System.out.println("--- Vine Object ---");
        Vine vine = new Vine();
        vine.grow();
        vine.trim();
        vine.water();
        vine.bloom();
        vine.info();
    }
}