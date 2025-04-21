package com.xworkz.methodoverride28;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Game Object ----");
        Game game = new Game();
        game.start();
        game.end();
        game.rules();
        game.play();

        System.out.println("\n---- Game Reference, Cricket Object ----");
        Game game1 = new Cricket();
        game1.start();
        game1.end();
        game1.rules();
        game1.play();

        System.out.println("\n---- Cricket Object ----");
        Cricket cricket = new Cricket();
        cricket.start();
        cricket.end();
        cricket.rules();
        cricket.play();
    }
}