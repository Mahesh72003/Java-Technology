package com.xworkz.methodoverride8;

import com.xworkz.methodoverride8.Character;
import com.xworkz.methodoverride8.Sidekick;

public class Runner {

    public static void main(String[] args) {

        System.out.println("---- Character Object ----");
        Character character = new Character();
        character.speak();
        character.act();
        character.assist();
        character.retreat();

        System.out.println("\n---- Character Reference, Sidekick Object ----");
        Character character1 = new Sidekick();
        character1.speak();
        character1.act();
        character1.assist();
        character1.retreat();

        System.out.println("\n---- Sidekick Object ----");
        Sidekick sidekick = new Sidekick();
        sidekick.speak();
        sidekick.act();
        sidekick.assist();
        sidekick.retreat();
    }
}