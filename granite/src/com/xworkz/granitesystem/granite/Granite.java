package com.xworkz.granitesystem.granite;

import com.xworkz.granitesystem.model.GraniteModel;

public class Granite {

    public GraniteModel[] graniteModels;

    public void displayGraniteInfo() {
        for (GraniteModel granite : graniteModels) {
            System.out.println("----------------------------------------------------");
            System.out.println("The Granite ID is: " + granite.getGraniteId());
            System.out.println("The Granite Brand is: " + granite.getBrand());
            System.out.println("The Granite Color is: " + granite.getColor());
            System.out.println("The Granite Material is: " + granite.getMaterial());
            System.out.println("The Granite Price is: " + granite.getPrice() + " per square meter");
            System.out.println("The Granite Origin is: " + granite.getOrigin());
            System.out.println("The Granite Texture is: " + granite.getTexture());
            System.out.println("----------------------------------------------------");
        }
    }
}
