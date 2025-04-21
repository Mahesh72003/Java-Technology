package com.xworkz.methodoverride29;

public class Hospital extends Structure {

    @Override
    public void foundation() {
        System.out.println("The hospital structure has a reinforced foundation.");
    }

    @Override
    public void walls() {
        System.out.println("The hospital has fireproof and soundproof walls.");
    }

    @Override
    public void roof() {
        System.out.println("The hospital roof is designed for easy maintenance.");
    }

    @Override
    public void rooms() {
        System.out.println("The hospital contains specialized rooms for patients and surgeries.");
    }
}