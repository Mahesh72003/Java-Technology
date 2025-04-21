package com.xworkz.methodoverride27;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Country Object ----");
        Country country = new Country();
        country.name();
        country.population();
        country.language();
        country.economy();

        System.out.println("\n---- Country Reference, Australia Object ----");
        Country country1 = new Australia();
        country1.name();
        country1.population();
        country1.language();
        country1.economy();

        System.out.println("\n---- Australia Object ----");
        Australia australia = new Australia();
        australia.name();
        australia.population();
        australia.language();
        australia.economy();
    }
}