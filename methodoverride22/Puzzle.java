package com.xworkz.methodoverride22;

public class Puzzle extends Toy {

    @Override
    public void play() {
        System.out.println("Puzzle is being solved piece by piece.");
    }

    @Override
    public void store() {
        System.out.println("Puzzle pieces are stored in their original box.");
    }

    @Override
    public void breakToy() {
        System.out.println("Puzzle pieces are scattered and need to be reorganized.");
    }

    @Override
    public void repair() {
        System.out.println("Puzzle is being reassembled to its original form.");
    }
}