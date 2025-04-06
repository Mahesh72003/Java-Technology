package com.xworkz.cookerinfo.store;

import com.xworkz.cookerinfo.cooker.Cooker;

public class CookerStore {
    public Cooker[] cookers;

    public void displayCookerDetails() {
        for (Cooker cooker : cookers) {
            System.out.println("--------------------------------------------------");
            System.out.println("Cooker ID: " + cooker.getCookerId());
            System.out.println("Brand: " + cooker.getBrand());
            System.out.println("Capacity (Liters): " + cooker.getCapacityInLiters());
            System.out.println("Electric: " + cooker.getIsElectric());
            System.out.println("Color: " + cooker.getColor());
            System.out.println("Price: ₹" + cooker.getPrice());
            System.out.println("Material: " + cooker.getMaterial());
            System.out.println("Induction Compatible: " + cooker.getIsInductionCompatible());
            System.out.println("--------------------------------------------------");
        }
    }
}
