package com.xworkz.methodoverride33;

public class Protagonist extends Role {

    @Override
    public void perform() {
        System.out.println("The protagonist is leading the story with courage.");
    }

    @Override
    public void grow() {
        System.out.println("The protagonist is evolving through challenges and experiences.");
    }

    @Override
    public void influence() {
        System.out.println("The protagonist is influencing other characters and events.");
    }

    @Override
    public void resolve() {
        System.out.println("The protagonist is resolving the conflict and achieving goals.");
    }
}