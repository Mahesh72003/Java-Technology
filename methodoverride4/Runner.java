package com.xworkz.methodoverride4;

import com.xworkz.methodoverride4.CoolingSystem;
import com.xworkz.methodoverride4.AirConditioner;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- CoolingSystem Object ----");
        CoolingSystem system = new CoolingSystem();
        system.turnOn();
        system.turnOff();
        system.regulateTemperature();
        system.autoShutdown();

        System.out.println("\n---- CoolingSystem Reference, AirConditioner Object ----");
        CoolingSystem system1 = new AirConditioner();
        system1.turnOn();
        system1.turnOff();
        system1.regulateTemperature();
        system1.autoShutdown();

        System.out.println("\n---- AirConditioner Object ----");
        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        ac.turnOff();
        ac.regulateTemperature();
        ac.autoShutdown();
    }
}