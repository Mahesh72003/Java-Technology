package com.xworkz.methodoverride20;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Machine Object ----");
        Machine machine = new Machine();
        machine.start();
        machine.stop();
        machine.maintain();
        machine.operate();

        System.out.println("\n---- Machine Reference, WashingMachine Object ----");
        Machine machine1 = new WashingMachine();
        machine1.start();
        machine1.stop();
        machine1.maintain();
        machine1.operate();

        System.out.println("\n---- WashingMachine Object ----");
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.start();
        washingMachine.stop();
        washingMachine.maintain();
        washingMachine.operate();
    }
}