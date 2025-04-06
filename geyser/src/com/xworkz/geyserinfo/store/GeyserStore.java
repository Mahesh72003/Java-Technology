package com.xworkz.geyserinfo.store;

import com.xworkz.geyserinfo.geyser.Geyser;

public class GeyserStore {
    public Geyser[] geysers;

    public void displayGeyserDetails() {
        for (Geyser g : geysers) {
            System.out.println("--------------------------------------------------");
            System.out.println("Geyser ID: " + g.getGeyserId());
            System.out.println("Brand: " + g.getBrand());
            System.out.println("Capacity (Liters): " + g.getCapacityInLiters());
            System.out.println("Power (Watts): " + g.getPowerInWatts());
            System.out.println("Instant Heating: " + g.getIsInstant());
            System.out.println("Color: " + g.getColor());
            System.out.println("Price: ₹" + g.getPrice());
            System.out.println("Mounting Type: " + g.getMountingType());
            System.out.println("--------------------------------------------------");
        }
    }
}
