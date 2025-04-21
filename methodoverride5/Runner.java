package com.xworkz.methodoverride5;

import com.xworkz.methodoverride5.Furniture;
import com.xworkz.methodoverride5.Sofa;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Furniture Object ----");
        Furniture furniture = new Furniture();
        furniture.assemble();
        furniture.disassemble();
        furniture.polish();
        furniture.move();

        System.out.println("\n---- Furniture Reference, Sofa Object ----");
        Furniture furniture1 = new Sofa();
        furniture1.assemble();
        furniture1.disassemble();
        furniture1.polish();
        furniture1.move();

        System.out.println("\n---- Sofa Object ----");
        Sofa sofa = new Sofa();
        sofa.assemble();
        sofa.disassemble();
        sofa.polish();
        sofa.move();
    }
}