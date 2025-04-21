package com.xworkz.methodoverride31;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Tool Object ----");
        Tool tool = new Tool();
        tool.useTool();
        tool.storeTool();
        tool.maintainTool();
        tool.displayTool();

        System.out.println("\n---- Tool Reference, Drums Object ----");
        Tool tool1 = new Drums();
        tool1.useTool();
        tool1.storeTool();
        tool1.maintainTool();
        tool1.displayTool();

        System.out.println("\n---- Drums Object ----");
        Drums drums = new Drums();
        drums.useTool();
        drums.storeTool();
        drums.maintainTool();
        drums.displayTool();
    }
}