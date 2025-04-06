package com.xworkz.shirtsystem;

import com.xworkz.shirtsystem.shirt.Shirt;
import com.xworkz.shirtsystem.model.ShirtModel;

public class ShirtRunner {
    public static void main(String[] args) {
        ShirtModel[] shirtModels = new ShirtModel[5];

        ShirtModel shirt1 = new ShirtModel();
        shirt1.setShirtId(1);
        shirt1.setBrand("Van Heusen");
        shirt1.setSize("M");
        shirt1.setColor("White");
        shirt1.setMaterial("Cotton");
        shirt1.setPrice(1299.99);
        shirt1.setInStock(true);
        shirtModels[0] = shirt1;

        ShirtModel shirt2 = new ShirtModel();
        shirt2.setShirtId(2);
        shirt2.setBrand("Peter England");
        shirt2.setSize("L");
        shirt2.setColor("Blue");
        shirt2.setMaterial("Polyester");
        shirt2.setPrice(999.99);
        shirt2.setInStock(true);
        shirtModels[1] = shirt2;

        ShirtModel shirt3 = new ShirtModel();
        shirt3.setShirtId(3);
        shirt3.setBrand("Allen Solly");
        shirt3.setSize("S");
        shirt3.setColor("Black");
        shirt3.setMaterial("Linen");
        shirt3.setPrice(1499.50);
        shirt3.setInStock(false);
        shirtModels[2] = shirt3;

        ShirtModel shirt4 = new ShirtModel();
        shirt4.setShirtId(4);
        shirt4.setBrand("Indian Terrain");
        shirt4.setSize("XL");
        shirt4.setColor("Grey");
        shirt4.setMaterial("Cotton");
        shirt4.setPrice(1699.75);
        shirt4.setInStock(true);
        shirtModels[3] = shirt4;

        ShirtModel shirt5 = new ShirtModel();
        shirt5.setShirtId(5);
        shirt5.setBrand("Club Fox");
        shirt5.setSize("M");
        shirt5.setColor("Red");
        shirt5.setMaterial("Polyester");
        shirt5.setPrice(799.50);
        shirt5.setInStock(true);
        shirtModels[4] = shirt5;

        Shirt shirt = new Shirt();
        shirt.shirtModels = shirtModels;
        shirt.displayShirtInfo();
    }
}
