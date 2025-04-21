package com.xworkz.methodoverride28;

public class Cricket extends Game {

    @Override
    public void start() {
        System.out.println("Cricket match is about to begin. Players are on the field.");
    }

    @Override
    public void end() {
        System.out.println("Cricket match has concluded. The winner is decided.");
    }

    @Override
    public void rules() {
        System.out.println("Cricket has detailed rules for batting, bowling, and fielding.");
    }

    @Override
    public void play() {
        System.out.println("The cricket game is being played with teams on the field.");
    }
}