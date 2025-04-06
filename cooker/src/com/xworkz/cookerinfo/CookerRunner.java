package com.xworkz.cookerinfo;

import com.xworkz.cookerinfo.cooker.Cooker;
import com.xworkz.cookerinfo.store.CookerStore;

public class CookerRunner {
    public static void main(String[] args) {
        Cooker[] cookers = new Cooker[5];

        Cooker cooker1 = new Cooker();
        cooker1.setCookerId(201);
        cooker1.setBrand("Prestige");
        cooker1.setCapacityInLiters(5);
        cooker1.setIsElectric(false);
        cooker1.setColor("Silver");
        cooker1.setPrice(2499);
        cooker1.setMaterial("Aluminum");
        cooker1.setIsInductionCompatible(true);
        cookers[0] = cooker1;

        Cooker cooker2 = new Cooker();
        cooker2.setCookerId(202);
        cooker2.setBrand("Butterfly");
        cooker2.setCapacityInLiters(3);
        cooker2.setIsElectric(false);
        cooker2.setColor("Black");
        cooker2.setPrice(1799);
        cooker2.setMaterial("Stainless Steel");
        cooker2.setIsInductionCompatible(true);
        cookers[1] = cooker2;

        Cooker cooker3 = new Cooker();
        cooker3.setCookerId(203);
        cooker3.setBrand("Panasonic");
        cooker3.setCapacityInLiters(4);
        cooker3.setIsElectric(true);
        cooker3.setColor("White");
        cooker3.setPrice(3699);
        cooker3.setMaterial("Plastic Body");
        cooker3.setIsInductionCompatible(false);
        cookers[2] = cooker3;

        Cooker cooker4 = new Cooker();
        cooker4.setCookerId(204);
        cooker4.setBrand("Pigeon");
        cooker4.setCapacityInLiters(2);
        cooker4.setIsElectric(false);
        cooker4.setColor("Red");
        cooker4.setPrice(1399);
        cooker4.setMaterial("Aluminum");
        cooker4.setIsInductionCompatible(false);
        cookers[3] = cooker4;

        Cooker cooker5 = new Cooker();
        cooker5.setCookerId(205);
        cooker5.setBrand("Hawkins");
        cooker5.setCapacityInLiters(6);
        cooker5.setIsElectric(false);
        cooker5.setColor("Steel Grey");
        cooker5.setPrice(2899);
        cooker5.setMaterial("Hard Anodized");
        cooker5.setIsInductionCompatible(true);
        cookers[4] = cooker5;

        CookerStore store = new CookerStore();
        store.cookers = cookers;
        store.displayCookerDetails();
    }
}
