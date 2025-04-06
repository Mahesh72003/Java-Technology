package com.xworkz.granitesystem;

import com.xworkz.granitesystem.granite.Granite;
import com.xworkz.granitesystem.model.GraniteModel;

public class GraniteRunner {
    public static void main(String[] args) {
        GraniteModel[] graniteModels = new GraniteModel[5];

        GraniteModel granite1 = new GraniteModel();
        granite1.setGraniteId(1);
        granite1.setBrand("Karnataka Black");
        granite1.setColor("Black");
        granite1.setMaterial("Granite");
        granite1.setPrice(3500.99);  
        granite1.setOrigin("India");
        granite1.setTexture("Smooth");
        graniteModels[0] = granite1;

        GraniteModel granite2 = new GraniteModel();
        granite2.setGraniteId(2);
        granite2.setBrand("Imperial Red");
        granite2.setColor("Red");
        granite2.setMaterial("Granite");
        granite2.setPrice(4200.75);   
        granite2.setOrigin("Italy");
        granite2.setTexture("Granular");
        graniteModels[1] = granite2;

        GraniteModel granite3 = new GraniteModel();
        granite3.setGraniteId(3);
        granite3.setBrand("Tan Brown");
        granite3.setColor("Brown");
        granite3.setMaterial("Granite");
        granite3.setPrice(5000.00);   
        granite3.setOrigin("Russia");
        granite3.setTexture("Rough");
        graniteModels[2] = granite3;

        GraniteModel granite4 = new GraniteModel();
        granite4.setGraniteId(4);
        granite4.setBrand("Misty Brown");
        granite4.setColor("Brown");
        granite4.setMaterial("Granite");
        granite4.setPrice(4600.50);   
        granite4.setOrigin("India");
        granite4.setTexture("Polished");
        graniteModels[3] = granite4;

        GraniteModel granite5 = new GraniteModel();
        granite5.setGraniteId(5);
        granite5.setBrand("White Pearl");
        granite5.setColor("White");
        granite5.setMaterial("Granite");
        granite5.setPrice(3800.00);   
        granite5.setOrigin("USA");
        granite5.setTexture("Smooth");
        graniteModels[4] = granite5;

        Granite granite = new Granite();
        granite.graniteModels = graniteModels;
        granite.displayGraniteInfo();
    }
}
