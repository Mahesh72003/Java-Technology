package com.xworkz.methodoverride9;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Tool Object ----");
        Tool tool = new Tool();
        tool.use();
        tool.clean();
        tool.store();
        tool.maintain();

        System.out.println("\n---- Tool Reference, Wrench Object ----");
        Tool tool1 = new Wrench();
        tool1.use();
        tool1.clean();
        tool1.store();
        tool1.maintain();

        System.out.println("\n---- Wrench Object ----");
        Wrench wrench = new Wrench();
        wrench.use();
        wrench.clean();
        wrench.store();
        wrench.maintain();
    }
}