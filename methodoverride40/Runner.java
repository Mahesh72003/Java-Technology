package com.xworkz.methodoverride40;

public class Runner {
    public static void main(String[] args) {
        System.out.println("--- Technology Object ---");
        Technology tech = new Technology();
        tech.start();
        tech.shutDown();
        tech.operate();
        tech.update();

        System.out.println("--- Technology Reference, SmartTV Object ---");
        Technology smartRef = new SmartTV();
        smartRef.start();
        smartRef.shutDown();
        smartRef.operate();
        smartRef.update();


        System.out.println("--- SmartTV Object ---");
        SmartTV smart = new SmartTV();
        smart.start();
        smart.shutDown();
        smart.operate();
        smart.update();

    }
}