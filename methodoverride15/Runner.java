package com.xworkz.methodoverride15;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Dish Object ----");
        Dish dish = new Dish();
        dish.prepare();
        dish.serve();
        dish.taste();
        dish.cleanUp();

        System.out.println("\n---- Dish Reference, Salad Object ----");
        Dish dish1 = new Salad();
        dish1.prepare();
        dish1.serve();
        dish1.taste();
        dish1.cleanUp();

        System.out.println("\n---- Salad Object ----");
        Salad salad = new Salad();
        salad.prepare();
        salad.serve();
        salad.taste();
        salad.cleanUp();
    }
}