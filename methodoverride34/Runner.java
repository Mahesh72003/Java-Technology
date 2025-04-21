package com.xworkz.methodoverride34;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Substance Object ----");
        Substance substance = new Substance();
        substance.form();
        substance.use();
        substance.dispose();
        substance.recycle();

        System.out.println("\n---- Substance Reference, Paper Object ----");
        Substance substance1 = new Paper();
        substance1.form();
        substance1.use();
        substance1.dispose();
        substance1.recycle();

        System.out.println("\n---- Paper Object ----");
        Paper paper = new Paper();
        paper.form();
        paper.use();
        paper.dispose();
        paper.recycle();
    }
}