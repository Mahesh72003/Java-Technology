package com.xworkz.methodoverride13;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Sport Object ----");
        Sport sport = new Sport();
        sport.play();
        sport.train();
        sport.compete();
        sport.enjoy();

        System.out.println("\n---- Sport Reference, Tennis Object ----");
        Sport sport1 = new Tennis();
        sport1.play();
        sport1.train();
        sport1.compete();
        sport1.enjoy();

        System.out.println("\n---- Tennis Object ----");
        Tennis tennis = new Tennis();
        tennis.play();
        tennis.train();
        tennis.compete();
        tennis.enjoy();
    }
}