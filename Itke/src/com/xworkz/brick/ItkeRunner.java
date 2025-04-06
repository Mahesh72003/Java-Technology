package com.xworkz.brick;

import com.xworkz.brick.itke.Itke;
import com.xworkz.brick.storage.BrickStorage;

public class ItkeRunner {
    public static void main(String[] args) {
        Itke[] bricks = new Itke[5];

        Itke itke1 = new Itke();
        itke1.setBrickId(1);
        itke1.setManufacturer("Ashoka Bricks");
        itke1.setType("Clay");
        itke1.setLength(19.0);
        itke1.setWidth(9.0);
        itke1.setHeight(5.0);
        itke1.setWeight(3.5);
        itke1.setEcoFriendly(true);
        bricks[0] = itke1;

        Itke itke2 = new Itke();
        itke2.setBrickId(2);
        itke2.setManufacturer("Durga Fly Ash");
        itke2.setType("Fly Ash");
        itke2.setLength(20.0);
        itke2.setWidth(10.0);
        itke2.setHeight(7.0);
        itke2.setWeight(2.8);
        itke2.setEcoFriendly(true);
        bricks[1] = itke2;

        Itke itke3 = new Itke();
        itke3.setBrickId(3);
        itke3.setManufacturer("Namma Concrete");
        itke3.setType("Concrete");
        itke3.setLength(22.0);
        itke3.setWidth(11.0);
        itke3.setHeight(6.5);
        itke3.setWeight(4.2);
        itke3.setEcoFriendly(false);
        bricks[2] = itke3;

        Itke itke4 = new Itke();
        itke4.setBrickId(4);
        itke4.setManufacturer("Raj Bricks");
        itke4.setType("Clay");
        itke4.setLength(19.5);
        itke4.setWidth(9.2);
        itke4.setHeight(5.3);
        itke4.setWeight(3.4);
        itke4.setEcoFriendly(true);
        bricks[3] = itke4;

        Itke itke5 = new Itke();
        itke5.setBrickId(5);
        itke5.setManufacturer("Kaveri Blocks");
        itke5.setType("Fly Ash");
        itke5.setLength(21.0);
        itke5.setWidth(10.5);
        itke5.setHeight(6.0);
        itke5.setWeight(3.0);
        itke5.setEcoFriendly(true);
        bricks[4] = itke5;

        BrickStorage storage = new BrickStorage();
        storage.bricks = bricks;
        storage.displayBrickDetails();
    }
}
