package com.xworkz.methodoverride22;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Toy Object ----");
        Toy toy = new Toy();
        toy.play();
        toy.store();
        toy.breakToy();
        toy.repair();

        System.out.println("\n---- Toy Reference, Puzzle Object ----");
        Toy toy1 = new Puzzle();
        toy1.play();
        toy1.store();
        toy1.breakToy();
        toy1.repair();

        System.out.println("\n---- Puzzle Object ----");
        Puzzle puzzle = new Puzzle();
        puzzle.play();
        puzzle.store();
        puzzle.breakToy();
        puzzle.repair();
    }
}