package com.xworkz.majigesystem.majige;

import com.xworkz.majigesystem.model.MajigeInfo;

public class Majige {

    public MajigeInfo[] majigeInfos;

    public void displayMajigeInfo() {
        for (MajigeInfo majige : majigeInfos) {
            System.out.println("----------------------------------------------------");
            System.out.println("Majige ID: " + majige.getMajigeId());
            System.out.println("Brand: " + majige.getBrand());
            System.out.println("Flavor: " + majige.getFlavor());
            System.out.println("Volume: " + majige.getVolume() + " ml");
            System.out.println("Price: " + majige.getPrice());
            System.out.println("Texture: " + majige.getTexture());
            System.out.println("Expiry Date: " + majige.getExpiryDate());
            System.out.println("----------------------------------------------------");
        }
    }
}
