package com.xworkz.methodoverride29;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Structure Object ----");
        Structure structure = new Structure();
        structure.foundation();
        structure.walls();
        structure.roof();
        structure.rooms();

        System.out.println("\n---- Structure Reference, Hospital Object ----");
        Structure structure1 = new Hospital();
        structure1.foundation();
        structure1.walls();
        structure1.roof();
        structure1.rooms();

        System.out.println("\n---- Hospital Object ----");
        Hospital hospital = new Hospital();
        hospital.foundation();
        hospital.walls();
        hospital.roof();
        hospital.rooms();
    }
}