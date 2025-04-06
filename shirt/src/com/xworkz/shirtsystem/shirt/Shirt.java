package com.xworkz.shirtsystem.shirt;

import com.xworkz.shirtsystem.model.ShirtModel;

public class Shirt {

    public ShirtModel[] shirtModels;

    public void displayShirtInfo() {
        for (ShirtModel shirt : shirtModels) {
            System.out.println("----------------------------------------------------");
            System.out.println("The Shirt ID is: " + shirt.getShirtId());
            System.out.println("The Shirt Brand is: " + shirt.getBrand());
            System.out.println("The Shirt Size is: " + shirt.getSize());
            System.out.println("The Shirt Color is: " + shirt.getColor());
            System.out.println("The Shirt Material is: " + shirt.getMaterial());
            System.out.println("The Shirt Price is: " + shirt.getPrice());
            System.out.println("Is the Shirt in Stock: " + shirt.isInStock());
            System.out.println("----------------------------------------------------");
        }
    }
}
