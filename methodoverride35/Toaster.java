package com.xworkz.methodoverride35;

public class Toaster extends Gadget {

    @Override
    public void powerOn() {
        System.out.println("The toaster is powered on, ready to toast.");
    }

    @Override
    public void operate() {
        System.out.println("The toaster is toasting bread.");
    }

    @Override
    public void stop() {
        System.out.println("The toaster has completed its toasting process.");
    }

    @Override
    public void store() {
        System.out.println("The toaster is stored on the kitchen counter.");
    }
}