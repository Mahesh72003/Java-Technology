package com.xworkz.methodoverride36;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Innovation Object ----");
        Innovation innovation = new Innovation();
        innovation.design();
        innovation.function();
        innovation.improve();
        innovation.release();

        System.out.println("\n---- Innovation Reference, Smartwatch Object ----");
        Innovation innovation1 = new Smartwatch();
        innovation1.design();
        innovation1.function();
        innovation1.improve();
        innovation1.release();

        System.out.println("\n---- Smartwatch Object ----");
        Smartwatch smartwatch = new Smartwatch();
        smartwatch.design();
        smartwatch.function();
        smartwatch.improve();
        smartwatch.release();
    }
}