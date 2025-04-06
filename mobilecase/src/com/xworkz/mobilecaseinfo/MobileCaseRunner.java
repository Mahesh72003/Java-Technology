package com.xworkz.mobilecaseinfo;

import com.xworkz.mobilecaseinfo.mobilecase.MobileCase;
import com.xworkz.mobilecaseinfo.model.MobileCaseInfo;

public class MobileCaseRunner {
    public static void main(String[] args) {
        MobileCaseInfo[] mobileCaseInfos = new MobileCaseInfo[5];

        MobileCaseInfo mobileCase1 = new MobileCaseInfo();
        mobileCase1.setMobileCaseId(1);
        mobileCase1.setBrand("Spigen");
        mobileCase1.setMaterial("Silicone");
        mobileCase1.setColor("Black");
        mobileCase1.setPrice(1200.75);   
        mobileCase1.setIsWashable(true);  
        mobileCase1.setCompatibility("iPhone 13");
        mobileCase1.setShockproof(true);
        mobileCaseInfos[0] = mobileCase1;

        MobileCaseInfo mobileCase2 = new MobileCaseInfo();
        mobileCase2.setMobileCaseId(2);
        mobileCase2.setBrand("OtterBox");
        mobileCase2.setMaterial("Rubber");
        mobileCase2.setColor("Blue");
        mobileCase2.setPrice(2500.50);   
        mobileCase2.setIsWashable(false);  
        mobileCase2.setCompatibility("Samsung Galaxy S21");
        mobileCase2.setShockproof(true);
        mobileCaseInfos[1] = mobileCase2;

        MobileCaseInfo mobileCase3 = new MobileCaseInfo();
        mobileCase3.setMobileCaseId(3);
        mobileCase3.setBrand("Caseology");
        mobileCase3.setMaterial("TPU");
        mobileCase3.setColor("Red");
        mobileCase3.setPrice(900.00);    
        mobileCase3.setIsWashable(true);  
        mobileCase3.setCompatibility("OnePlus 9");
        mobileCase3.setShockproof(false);
        mobileCaseInfos[2] = mobileCase3;

        MobileCaseInfo mobileCase4 = new MobileCaseInfo();
        mobileCase4.setMobileCaseId(4);
        mobileCase4.setBrand("Samsung");
        mobileCase4.setMaterial("Polycarbonate");
        mobileCase4.setColor("Transparent");
        mobileCase4.setPrice(1500.00);   
        mobileCase4.setIsWashable(true);  
        mobileCase4.setCompatibility("Samsung Galaxy Note 20");
        mobileCase4.setShockproof(true);
        mobileCaseInfos[3] = mobileCase4;

        MobileCaseInfo mobileCase5 = new MobileCaseInfo();
        mobileCase5.setMobileCaseId(5);
        mobileCase5.setBrand("Incipio");
        mobileCase5.setMaterial("Hard Plastic");
        mobileCase5.setColor("Grey");
        mobileCase5.setPrice(1300.25);   
        mobileCase5.setIsWashable(true);  
        mobileCase5.setCompatibility("Google Pixel 5");
        mobileCase5.setShockproof(true);
        mobileCaseInfos[4] = mobileCase5;

        MobileCase mobileCase = new MobileCase();
        mobileCase.mobileCaseInfos = mobileCaseInfos;
        mobileCase.displayMobileCaseInfo();
    }
}
