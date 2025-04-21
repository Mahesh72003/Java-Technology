package com.xworkz.methodoverride24;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- RCAircraft Object ----");
        RCAircraft rc = new RCAircraft();
        rc.takeOff();
        rc.land();
        rc.hover();
        rc.control();

        System.out.println("\n---- RCAircraft Reference, Drone Object ----");
        RCAircraft rc1 = new Drone();
        rc1.takeOff();
        rc1.land();
        rc1.hover();
        rc1.control();

        System.out.println("\n---- Drone Object ----");
        Drone drone = new Drone();
        drone.takeOff();
        drone.land();
        drone.hover();
        drone.control();
    }
}