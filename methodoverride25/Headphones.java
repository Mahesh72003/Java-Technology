package com.xworkz.methodoverride25;

public class Headphones extends Speakers {

    @Override
    public void playSound() {
        System.out.println("Headphones are delivering immersive stereo sound.");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Headphones volume increased via inline controls.");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Headphones volume decreased gently.");
    }

    @Override
    public void mute() {
        System.out.println("Headphones muted instantly using the mic switch.");
    }
}