package com.xworkz.methodoverride47;

public class Runner {
    public static void main(String[] args) {
        System.out.println("--- Leisure Object ---");
        Leisure leisure = new Leisure();
        leisure.relax();
        leisure.enjoy();
        leisure.pause();
        leisure.resume();
        leisure.info();

        System.out.println("--- Leisure Reference, Play Object ---");
        Leisure playRef = new Play();
        playRef.relax();
        playRef.enjoy();
        playRef.pause();
        playRef.resume();
        playRef.info();

        System.out.println("--- Play Object ---");
        Play play = new Play();
        play.relax();
        play.enjoy();
        play.pause();
        play.resume();
        play.info();
    }
}