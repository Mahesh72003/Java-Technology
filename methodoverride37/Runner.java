package com.xworkz.methodoverride37;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Device Object ----");
        Device device = new Device();
        device.powerOn();
        device.operate();
        device.shutdown();
        device.reset();

        System.out.println("\n---- Device Reference, Robot Object ----");
        Device device1 = new Robot();
        device1.powerOn();
        device1.operate();
        device1.shutdown();
        device1.reset();

        System.out.println("\n---- Robot Object ----");
        Robot robot = new Robot();
        robot.powerOn();
        robot.operate();
        robot.shutdown();
        robot.reset();
    }
}