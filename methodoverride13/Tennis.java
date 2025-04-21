package com.xworkz.methodoverride13;

public class Tennis extends Sport {

    @Override
    public void play() {
        System.out.println("Tennis is being played with a racket and a ball on a court.");
    }

    @Override
    public void train() {
        System.out.println("Tennis players train to improve their serve, backhand, and footwork.");
    }

    @Override
    public void compete() {
        System.out.println("Tennis players compete in singles or doubles matches.");
    }

    @Override
    public void enjoy() {
        System.out.println("Tennis is enjoyed by millions as a professional sport and recreational activity.");
    }
}