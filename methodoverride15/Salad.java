package com.xworkz.methodoverride15;

public class Salad extends Dish {

    @Override
    public void prepare() {
        System.out.println("Salad is being prepared with fresh vegetables and dressing.");
    }

    @Override
    public void serve() {
        System.out.println("Salad is served chilled in a bowl.");
    }

    @Override
    public void taste() {
        System.out.println("Salad tastes fresh, crisp, and healthy.");
    }

    @Override
    public void cleanUp() {
        System.out.println("Salad preparation utensils are cleaned and sanitized.");
    }
}