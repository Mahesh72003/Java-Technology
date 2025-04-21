package com.xworkz.methodoverride43;

public class Runner {
    public static void main(String[] args) {
        System.out.println("--- Fixture Object ---");
        Fixture fixture = new Fixture();
        fixture.install();
        fixture.remove();
        fixture.use();
        fixture.repair();
        fixture.info();

        System.out.println("--- Fixture Reference, Cabinet Object ---");
        Fixture cabinetRef = new Cabinet();
        cabinetRef.install();
        cabinetRef.remove();
        cabinetRef.use();
        cabinetRef.repair();
        cabinetRef.info();

        System.out.println("--- Cabinet Object ---");
        Cabinet cabinet = new Cabinet();
        cabinet.install();
        cabinet.remove();
        cabinet.use();
        cabinet.repair();
        cabinet.info();
    }
}