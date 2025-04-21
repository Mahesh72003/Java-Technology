package com.xworkz.methodoverride42;

public class Runner {
    public static void main(String[] args) {
        System.out.println("--- Sound Object ---");
        Sound sound = new Sound();
        sound.play();
        sound.stop();
        sound.increaseVolume();
        sound.decreaseVolume();
        sound.info();

        System.out.println("--- Sound Reference, Trumpet Object ---");
        Sound trumpetRef = new Trumpet();
        trumpetRef.play();
        trumpetRef.stop();
        trumpetRef.increaseVolume();
        trumpetRef.decreaseVolume();
        trumpetRef.info();

        System.out.println("--- Trumpet Object ---");
        Trumpet trumpet = new Trumpet();
        trumpet.play();
        trumpet.stop();
        trumpet.increaseVolume();
        trumpet.decreaseVolume();
        trumpet.info();
    }
}