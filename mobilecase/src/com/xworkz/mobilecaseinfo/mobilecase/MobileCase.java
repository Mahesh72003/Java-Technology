package com.xworkz.mobilecaseinfo.mobilecase;

import com.xworkz.mobilecaseinfo.model.MobileCaseInfo;

public class MobileCase {

    public MobileCaseInfo[] mobileCaseInfos;

    public void displayMobileCaseInfo() {
        for (MobileCaseInfo mobileCase : mobileCaseInfos) {
            System.out.println("----------------------------------------------------");
            System.out.println("Mobile Case ID: " + mobileCase.getMobileCaseId());
            System.out.println("Brand: " + mobileCase.getBrand());
            System.out.println("Material: " + mobileCase.getMaterial());
            System.out.println("Color: " + mobileCase.getColor());
            System.out.println("Price: " + mobileCase.getPrice());
            System.out.println("Compatible With: " + mobileCase.getCompatibility());
            System.out.println("Shockproof: " + mobileCase.isShockproof());
            System.out.println("Washable: " + mobileCase.isWashable());
            System.out.println("----------------------------------------------------");
        }
    }
}
