package com.xworkz.methodoverride25;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Speakers Object ----");
        Speakers speakers = new Speakers();
        speakers.playSound();
        speakers.increaseVolume();
        speakers.decreaseVolume();
        speakers.mute();

        System.out.println("\n---- Speakers Reference, Headphones Object ----");
        Speakers speakers1 = new Headphones();
        speakers1.playSound();
        speakers1.increaseVolume();
        speakers1.decreaseVolume();
        speakers1.mute();

        System.out.println("\n---- Headphones Object ----");
        Headphones headphones = new Headphones();
        headphones.playSound();
        headphones.increaseVolume();
        headphones.decreaseVolume();
        headphones.mute();
    }
}