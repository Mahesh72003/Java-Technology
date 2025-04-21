package com.xworkz.methodoverride32;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Dish Object ----");
        Dish dish = new Dish();
        dish.prepare();
        dish.serve();
        dish.eat();
        dish.cleanUp();

        System.out.println("\n---- Dish Reference, Ice Cream Object ----");
        Dish dish1 = new IceCream();
        dish1.prepare();
        dish1.serve();
        dish1.eat();
        dish1.cleanUp();

        System.out.println("\n---- Ice Cream Object ----");
        IceCream iceCream = new IceCream();
        iceCream.prepare();
        iceCream.serve();
        iceCream.eat();
        iceCream.cleanUp();
    }
}