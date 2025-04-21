package com.xworkz.methodoverride4;

public class AirConditioner extends CoolingSystem {

    @Override
    public void turnOn() {
        System.out.println("Air conditioner is now on and ready to cool the room.");
    }

    @Override
    public void turnOff() {
        System.out.println("Air conditioner is now off. Cooling has stopped.");
    }

    @Override
    public void regulateTemperature() {
        System.out.println("Air conditioner is adjusting to maintain the set temperature.");
    }

    @Override
    public void autoShutdown() {
        System.out.println("Air conditioner will shut down automatically after the timer ends.");
    }
}