package com.xworkz.methodoverride40;

public class SmartTV extends Technology {

    @Override
    public void start() {
        System.out.println("SmartTV is powering on. Displaying welcome screen.");
    }

    @Override
    public void shutDown() {
        System.out.println("SmartTV is turning off. Saving settings.");
    }

    @Override
    public void operate() {
        System.out.println("SmartTV is streaming your favorite show.");
    }

    @Override
    public void update() {
        System.out.println("SmartTV is installing the latest firmware update.");
    }
}