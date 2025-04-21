package com.xworkz.methodoverride14;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Building Object ----");
        Building building = new Building();
        building.construct();
        building.renovate();
        building.maintain();
        building.use();

        System.out.println("\n---- Building Reference, Library Object ----");
        Building building1 = new Library();
        building1.construct();
        building1.renovate();
        building1.maintain();
        building1.use();

        System.out.println("\n---- Library Object ----");
        Library library = new Library();
        library.construct();
        library.renovate();
        library.maintain();
        library.use();
    }
}