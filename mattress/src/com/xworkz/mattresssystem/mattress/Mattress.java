package com.xworkz.mattresssystem.mattress;

import com.xworkz.mattresssystem.model.MattressInfo;

public class Mattress {

    public MattressInfo[] mattressInfos;

    public void displayMattressInfo() {
        for (MattressInfo mattress : mattressInfos) {
            System.out.println("----------------------------------------------------");
            System.out.println("Mattress ID: " + mattress.getMattressId());
            System.out.println("Brand: " + mattress.getBrandName());
            System.out.println("Material: " + mattress.getMaterial());
            System.out.println("Size: " + mattress.getSize());
            System.out.println("Price: " + mattress.getPrice());
            System.out.println("Weight: " + mattress.getWeight() + " kg");
            System.out.println("Warranty: " + mattress.getWarranty() + " years");
            System.out.println("Firmness: " + mattress.getFirmness());
            System.out.println("----------------------------------------------------");
        }
    }
}
