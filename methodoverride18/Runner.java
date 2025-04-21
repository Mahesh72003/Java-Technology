package com.xworkz.methodoverride18;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Designer Object ----");
        Designer designer = new Designer();
        designer.design();
        designer.plan();
        designer.review();
        designer.present();

        System.out.println("\n---- Designer Reference, Developer Object ----");
        Designer designer1 = new Developer();
        designer1.design();
        designer1.plan();
        designer1.review();
        designer1.present();

        System.out.println("\n---- Developer Object ----");
        Developer developer = new Developer();
        developer.design();
        developer.plan();
        developer.review();
        developer.present();
    }
}