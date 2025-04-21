package com.xworkz.methodoverride7;

import com.xworkz.methodoverride7.Food;
import com.xworkz.methodoverride7.Sushi;

public class
Runner {

    public static void main(String[] args) {

        System.out.println("---- Food Object ----");
        Food food = new Food();
        food.prepare();
        food.cook();
        food.serve();
        food.pack();

        System.out.println("\n---- Food Reference, Sushi Object ----");
        Food food1 = new Sushi();
        food1.prepare();
        food1.cook();
        food1.serve();
        food1.pack();

        System.out.println("\n---- Sushi Object ----");
        Sushi sushi = new Sushi();
        sushi.prepare();
        sushi.cook();
        sushi.serve();
        sushi.pack();
    }
}