package com.xworkz.brick.storage;

import com.xworkz.brick.itke.Itke;

public class BrickStorage {
    public Itke[] bricks;

    public void displayBrickDetails() {
        for (Itke brick : bricks) {
            System.out.println("--------------------------------------------------");
            System.out.println("Brick ID: " + brick.getBrickId());
            System.out.println("Manufacturer: " + brick.getManufacturer());
            System.out.println("Type: " + brick.getType());
            System.out.println("Dimensions (LxWxH): " + brick.getLength() + " x " + brick.getWidth() + " x " + brick.getHeight() + " cm");
            System.out.println("Weight: " + brick.getWeight() + " kg");
            System.out.println("Eco Friendly: " + brick.isEcoFriendly());
            System.out.println("--------------------------------------------------");
        }
    }
}
