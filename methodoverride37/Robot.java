package com.xworkz.methodoverride37;

public class Robot extends Device {

    @Override
    public void powerOn() {
        System.out.println("The robot is powered on and ready to assist.");
    }

    @Override
    public void operate() {
        System.out.println("The robot is performing tasks and interacting with the environment.");
    }

    @Override
    public void shutdown() {
        System.out.println("The robot is shutting down and conserving energy.");
    }

    @Override
    public void reset() {
        System.out.println("The robot is being reset for a new task.");
    }
}