package com.xworkz.methodoverride20;

public class WashingMachine extends Machine {

    @Override
    public void start() {
        System.out.println("Washing machine is starting the wash cycle.");
    }

    @Override
    public void stop() {
        System.out.println("Washing machine has stopped after completing the wash.");
    }

    @Override
    public void maintain() {
        System.out.println("Washing machine should be cleaned regularly to avoid damage.");
    }

    @Override
    public void operate() {
        System.out.println("Washing machine is washing clothes in auto mode.");
    }
}