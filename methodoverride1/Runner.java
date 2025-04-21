package com.xworkz.methodoverride1;
import com.xworkz.methodoverride1.Appliance;
import com.xworkz.methodoverride1.Microwave;
public class Runner {
    public static void main(String[] args) {
        System.out.println("---- Appliance Object ----");
        Appliance appliance = new Appliance();
        appliance.powerOn();
        appliance.powerOff();
        appliance.cook();
        appliance.stop();
        appliance.timer();

        System.out.println("---- Appliance Reference, Microwave Object ----");
        Appliance appliance1 = new Microwave();
        appliance1.powerOn();
        appliance1.powerOff();
        appliance1.cook();
        appliance1.stop();
        appliance1.timer();

        System.out.println("\n---- Microwave Object ----");
        Microwave microwave = new Microwave();
        microwave.powerOn();
        microwave.powerOff();
        microwave.cook();
        microwave.stop();
        microwave.timer();
    }
}

