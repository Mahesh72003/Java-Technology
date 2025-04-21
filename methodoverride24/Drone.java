package com.xworkz.methodoverride24;

public class Drone extends RCAircraft {

    @Override
    public void takeOff() {
        System.out.println("Drone is launching vertically from the ground.");
    }

    @Override
    public void land() {
        System.out.println("Drone is descending and landing with precision.");
    }

    @Override
    public void hover() {
        System.out.println("Drone is hovering steadily for aerial photography.");
    }

    @Override
    public void control() {
        System.out.println("Drone is controlled via smartphone app.");
    }
}