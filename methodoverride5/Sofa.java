package com.xworkz.methodoverride5;

public class Sofa extends Furniture {

    @Override
    public void assemble() {
        System.out.println("Sofa is being assembled with cushions and frame.");
    }

    @Override
    public void disassemble() {
        System.out.println("Sofa is being disassembled for transport.");
    }

    @Override
    public void polish() {
        System.out.println("Sofa is being cleaned and polished for a fresh look.");
    }

    @Override
    public void move() {
        System.out.println("Sofa is being carefully moved to the living room.");
    }
}