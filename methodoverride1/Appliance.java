package com.xworkz.methodoverride1;

public class Appliance {

    public void powerOn() {
        System.out.println("Appliance is now powered on. The device is ready to use.");
    }

    public void powerOff() {
        System.out.println("Appliance is powered off. All operations are halted.");
    }

    public void cook() {
        System.out.println("Appliance is starting to cook. The cooking process is underway.");
    }

    public void stop() {
        System.out.println("Appliance has been stopped. Cooking has been halted.");
    }

    public void timer() {
        System.out.println("Appliance timer is set. The device will notify you when the time is up.");
    }
}
