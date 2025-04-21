package com.xworkz.methodoverride50;

public class Runner {
    public static void main(String[] args) {
        System.out.println("--- FastFood Object ---");
        FastFood fastFood = new FastFood();
        fastFood.order();
        fastFood.prepare();
        fastFood.serve();
        fastFood.eat();
        fastFood.info();

        System.out.println("--- FastFood Reference, Burger Object ---");
        FastFood burgerRef = new Burger();
        burgerRef.order();
        burgerRef.prepare();
        burgerRef.serve();
        burgerRef.eat();
        burgerRef.info();

        System.out.println("--- Burger Object ---");
        Burger burger = new Burger();
        burger.order();
        burger.prepare();
        burger.serve();
        burger.eat();
        burger.info();
    }
}