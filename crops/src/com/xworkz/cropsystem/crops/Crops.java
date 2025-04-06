package com.xworkz.cropsystem.crops;

import com.xworkz.cropsystem.model.CropInfo;

public class Crops {

    public CropInfo[] cropInfos;

    public void displayCropInfo() {
        for (CropInfo crop : cropInfos) {
            System.out.println("----------------------------------------------------");
            System.out.println("Crop ID: " + crop.getCropId());
            System.out.println("Crop Name: " + crop.getCropName());
            System.out.println("Season: " + crop.getSeason());
            System.out.println("Price per Kg: " + crop.getPricePerKg());
            System.out.println("Yield per Acre: " + crop.getYieldPerAcre() + " kg");
            System.out.println("Water Requirement: " + crop.getWaterRequirement());
            System.out.println("Harvesting Month: " + crop.getHarvestingMonth());
            System.out.println("----------------------------------------------------");
        }
    }
}
