package com.xworkz.methodoverride2;
import  com.xworkz.methodoverride2.Shape;
public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }

    @Override
    public void area() {
        System.out.println("Calculating area of the square: side^2");
    }

    @Override
    public void perimeter() {
        System.out.println("Calculating perimeter of the square: 4 * side");
    }

    @Override
    public void description() {
        System.out.println("This is a square, all sides are equal.");
    }
}
