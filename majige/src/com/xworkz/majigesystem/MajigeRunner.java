package com.xworkz.majigesystem;

import com.xworkz.majigesystem.majige.Majige;
import com.xworkz.majigesystem.model.MajigeInfo;

public class MajigeRunner {
    public static void main(String[] args) {
        MajigeInfo[] majigeInfos = new MajigeInfo[5];

        MajigeInfo majige1 = new MajigeInfo();
        majige1.setMajigeId(1);
        majige1.setBrand("Nandini");
        majige1.setFlavor("Plain");
        majige1.setVolume(500);  
        majige1.setPrice(40.50);    
        majige1.setTexture("Smooth");
        majige1.setExpiryDate("2025-06-15");
        majigeInfos[0] = majige1;

        MajigeInfo majige2 = new MajigeInfo();
        majige2.setMajigeId(2);
        majige2.setBrand("Amul");
        majige2.setFlavor("Mint");
        majige2.setVolume(600);  
        majige2.setPrice(50.75);    
        majige2.setTexture("Creamy");
        majige2.setExpiryDate("2025-07-10");
        majigeInfos[1] = majige2;

        MajigeInfo majige3 = new MajigeInfo();
        majige3.setMajigeId(3);
        majige3.setBrand("Mother Dairy");
        majige3.setFlavor("Lemon");
        majige3.setVolume(450);  
        majige3.setPrice(45.00);    
        majige3.setTexture("Silky");
        majige3.setExpiryDate("2025-05-20");
        majigeInfos[2] = majige3;

        MajigeInfo majige4 = new MajigeInfo();
        majige4.setMajigeId(4);
        majige4.setBrand("Vadilal");
        majige4.setFlavor("Rose");
        majige4.setVolume(500);  
        majige4.setPrice(55.00);    
        majige4.setTexture("Rich");
        majige4.setExpiryDate("2025-06-30");
        majigeInfos[3] = majige4;

        MajigeInfo majige5 = new MajigeInfo();
        majige5.setMajigeId(5);
        majige5.setBrand("Britannia");
        majige5.setFlavor("Strawberry");
        majige5.setVolume(400);  
        majige5.setPrice(42.25);    
        majige5.setTexture("Light");
        majige5.setExpiryDate("2025-07-05");
        majigeInfos[4] = majige5;

        Majige majige = new Majige();
        majige.majigeInfos = majigeInfos;
        majige.displayMajigeInfo();
    }
}
