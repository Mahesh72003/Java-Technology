package com.xworkz.methodoverride39;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Nation Object ----");
        Nation nation = new Nation();
        nation.culture();
        nation.population();
        nation.geography();
        nation.economy();

        System.out.println("\n---- Nation Reference, Japan Object ----");
        Nation nation1 = new Japan();
        nation1.culture();
        nation1.population();
        nation1.geography();
        nation1.economy();

        System.out.println("\n---- Japan Object ----");
        Japan japan = new Japan();
        japan.culture();
        japan.population();
        japan.geography();
        japan.economy();
    }
}