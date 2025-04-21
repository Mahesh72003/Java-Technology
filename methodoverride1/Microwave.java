package com.xworkz.methodoverride1;
import com.xworkz.methodoverride1.Appliance;
public class Microwave extends Appliance {

    @Override
    public void powerOn() {
        System.out.println("Microwave is now powered on. Ready for your cooking needs. Please set your preferences.");
    }

    @Override
    public void powerOff() {
        System.out.println("Microwave is powered off. The microwave is no longer operational.");
    }

    @Override
    public void cook() {
        System.out.println("Microwave is heating your food. The cooking process is running at full power.");
    }

    @Override
    public void stop() {
        System.out.println("Microwave has been stopped. The food is no longer heating. Please check your meal.");
    }

    @Override
    public void timer() {
        System.out.println("Microwave timer is set. Cooking time is now being tracked, you will be notified once the time elapses.");
    }
}
