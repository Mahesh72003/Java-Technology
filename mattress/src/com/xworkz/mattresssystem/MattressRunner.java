package com.xworkz.mattresssystem;

import com.xworkz.mattresssystem.mattress.Mattress;
import com.xworkz.mattresssystem.model.MattressInfo;

public class MattressRunner {
    public static void main(String[] args) {
        MattressInfo[] mattressInfos = new MattressInfo[5];

        MattressInfo mattress1 = new MattressInfo();
        mattress1.setMattressId(1);
        mattress1.setBrandName("Sleepwell");
        mattress1.setMaterial("Memory Foam");
        mattress1.setSize("Queen");
        mattress1.setPrice(12000.50);   
        mattress1.setWeight(25.5);     
        mattress1.setWarranty(5);      
        mattress1.setFirmness("Medium Firm");
        mattressInfos[0] = mattress1;

        MattressInfo mattress2 = new MattressInfo();
        mattress2.setMattressId(2);
        mattress2.setBrandName("Kurlon");
        mattress2.setMaterial("Coir");
        mattress2.setSize("King");
        mattress2.setPrice(15000.00);   
        mattress2.setWeight(30.0);     
        mattress2.setWarranty(7);      
        mattress2.setFirmness("Firm");
        mattressInfos[1] = mattress2;

        MattressInfo mattress3 = new MattressInfo();
        mattress3.setMattressId(3);
        mattress3.setBrandName("Springtek");
        mattress3.setMaterial("Pocket Spring");
        mattress3.setSize("Single");
        mattress3.setPrice(8000.75);   
        mattress3.setWeight(18.0);     
        mattress3.setWarranty(3);      
        mattress3.setFirmness("Soft");
        mattressInfos[2] = mattress3;

        MattressInfo mattress4 = new MattressInfo();
        mattress4.setMattressId(4);
        mattress4.setBrandName("Duroflex");
        mattress4.setMaterial("Hybrid Foam");
        mattress4.setSize("Queen");
        mattress4.setPrice(11000.00);   
        mattress4.setWeight(22.0);     
        mattress4.setWarranty(6);      
        mattress4.setFirmness("Medium");
        mattressInfos[3] = mattress4;

        MattressInfo mattress5 = new MattressInfo();
        mattress5.setMattressId(5);
        mattress5.setBrandName("Peps");
        mattress5.setMaterial("Latex Foam");
        mattress5.setSize("King");
        mattress5.setPrice(18000.00);  
        mattress5.setWeight(35.0);     
        mattress5.setWarranty(10);     
        mattress5.setFirmness("Firm");
        mattressInfos[4] = mattress5;

        Mattress mattress = new Mattress();
        mattress.mattressInfos = mattressInfos;
        mattress.displayMattressInfo();
    }
}
