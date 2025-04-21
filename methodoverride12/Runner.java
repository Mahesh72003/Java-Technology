package com.xworkz.methodoverride12;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Technology Object ----");
        Technology technology = new Technology();
        technology.innovate();
        technology.apply();
        technology.develop();
        technology.communicate();

        System.out.println("\n---- Technology Reference, Smartphone Object ----");
        Technology technology1 = new Smartphone();
        technology1.innovate();
        technology1.apply();
        technology1.develop();
        technology1.communicate();

        System.out.println("\n---- Smartphone Object ----");
        Smartphone smartphone = new Smartphone();
        smartphone.innovate();
        smartphone.apply();
        smartphone.develop();
        smartphone.communicate();
    }
}