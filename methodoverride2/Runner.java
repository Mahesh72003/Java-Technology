package com.xworkz.methodoverride2;

import com.xworkz.methodoverride2.Shape;
import com.xworkz.methodoverride2.Square;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Shape Object ----");
        Shape shape = new Shape();
        shape.draw();
        shape.area();
        shape.perimeter();
        shape.description();

        System.out.println("---- Shape Reference, Square Object ----");
        Shape shape1 = new Square();
        shape1.draw();
        shape1.area();
        shape1.perimeter();
        shape1.description();

        System.out.println("---- Square Object ----");
        Square square = new Square();
        square.draw();
        square.area();
        square.perimeter();
        square.description();
    }
}
