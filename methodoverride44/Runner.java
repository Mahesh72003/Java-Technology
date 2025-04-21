package com.xworkz.methodoverride44;

public class Runner {
    public static void main(String[] args) {
        System.out.println("--- Activity Object ---");
        Activity activity = new Activity();
        activity.start();
        activity.pause();
        activity.resume();
        activity.stop();
        activity.info();

        System.out.println("--- Activity Reference, Rugby Object ---");
        Activity rugbyRef = new Rugby();
        rugbyRef.start();
        rugbyRef.pause();
        rugbyRef.resume();
        rugbyRef.stop();
        rugbyRef.info();

        System.out.println("--- Rugby Object ---");
        Rugby rugby = new Rugby();
        rugby.start();
        rugby.pause();
        rugby.resume();
        rugby.stop();
        rugby.info();
    }
}