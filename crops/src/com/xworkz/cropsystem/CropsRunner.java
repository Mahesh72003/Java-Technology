package com.xworkz.cropsystem;

import com.xworkz.cropsystem.crops.Crops;
import com.xworkz.cropsystem.model.CropInfo;

public class CropsRunner {
    public static void main(String[] args) {
        CropInfo[] cropInfos = new CropInfo[5];

        CropInfo crop1 = new CropInfo();
        crop1.setCropId(1);
        crop1.setCropName("Rice");
        crop1.setSeason("Kharif");
        crop1.setPricePerKg(30.5);  
        crop1.setYieldPerAcre(1200);   
        crop1.setWaterRequirement("High");
        crop1.setHarvestingMonth("October");
        cropInfos[0] = crop1;

        CropInfo crop2 = new CropInfo();
        crop2.setCropId(2);
        crop2.setCropName("Wheat");
        crop2.setSeason("Rabi");
        crop2.setPricePerKg(45.0);  
        crop2.setYieldPerAcre(1000);   
        crop2.setWaterRequirement("Medium");
        crop2.setHarvestingMonth("April");
        cropInfos[1] = crop2;

        CropInfo crop3 = new CropInfo();
        crop3.setCropId(3);
        crop3.setCropName("Cotton");
        crop3.setSeason("Kharif");
        crop3.setPricePerKg(75.0);  
        crop3.setYieldPerAcre(800);   
        crop3.setWaterRequirement("High");
        crop3.setHarvestingMonth("November");
        cropInfos[2] = crop3;

        CropInfo crop4 = new CropInfo();
        crop4.setCropId(4);
        crop4.setCropName("Maize");
        crop4.setSeason("Kharif");
        crop4.setPricePerKg(25.0);  
        crop4.setYieldPerAcre(1000);   
        crop4.setWaterRequirement("Medium");
        crop4.setHarvestingMonth("October");
        cropInfos[3] = crop4;

        CropInfo crop5 = new CropInfo();
        crop5.setCropId(5);
        crop5.setCropName("Sugarcane");
        crop5.setSeason("Rabi");
        crop5.setPricePerKg(35.0);  
        crop5.setYieldPerAcre(1800);   
        crop5.setWaterRequirement("Very High");
        crop5.setHarvestingMonth("March");
        cropInfos[4] = crop5;

        Crops crops = new Crops();
        crops.cropInfos = cropInfos;
        crops.displayCropInfo();
    }
}
