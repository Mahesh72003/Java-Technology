package com.xworkz.methodoverride47;

public class Play extends Leisure {
    @Override
    public void relax() {
        System.out.println("Playtime is filled with fun and joy.");
    }

    @Override
    public void enjoy() {
        System.out.println("Playing brings excitement and happiness.");
    }

    @Override
    public void pause() {
        System.out.println("Play is paused, but it’s time to take a break.");
    }

    @Override
    public void resume() {
        System.out.println("Play is back on, full of energy.");
    }

    @Override
    public void info() {
        System.out.println("This is an enjoyable activity called Play.");
    }
}