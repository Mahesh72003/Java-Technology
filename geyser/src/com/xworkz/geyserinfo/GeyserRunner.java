package com.xworkz.geyserinfo;

import com.xworkz.geyserinfo.geyser.Geyser;
import com.xworkz.geyserinfo.store.GeyserStore;

public class GeyserRunner {
    public static void main(String[] args) {
        Geyser[] geysers = new Geyser[5];

        Geyser geyser1 = new Geyser();
        geyser1.setGeyserId(101);
        geyser1.setBrand("Bajaj");
        geyser1.setCapacityInLiters(15);
        geyser1.setPowerInWatts(2000);
        geyser1.setIsInstant(false);
        geyser1.setColor("White");
        geyser1.setPrice(7499);
        geyser1.setMountingType("Vertical");
        geysers[0] = geyser1;

        Geyser geyser2 = new Geyser();
        geyser2.setGeyserId(102);
        geyser2.setBrand("AO Smith");
        geyser2.setCapacityInLiters(10);
        geyser2.setPowerInWatts(3000);
        geyser2.setIsInstant(true);
        geyser2.setColor("Grey");
        geyser2.setPrice(8999);
        geyser2.setMountingType("Horizontal");
        geysers[1] = geyser2;

        Geyser geyser3 = new Geyser();
        geyser3.setGeyserId(103);
        geyser3.setBrand("Venus");
        geyser3.setCapacityInLiters(25);
        geyser3.setPowerInWatts(2000);
        geyser3.setIsInstant(false);
        geyser3.setColor("Ivory");
        geyser3.setPrice(10499);
        geyser3.setMountingType("Vertical");
        geysers[2] = geyser3;

        Geyser geyser4 = new Geyser();
        geyser4.setGeyserId(104);
        geyser4.setBrand("Crompton");
        geyser4.setCapacityInLiters(6);
        geyser4.setPowerInWatts(3000);
        geyser4.setIsInstant(true);
        geyser4.setColor("Black");
        geyser4.setPrice(5999);
        geyser4.setMountingType("Wall");
        geysers[3] = geyser4;

        Geyser geyser5 = new Geyser();
        geyser5.setGeyserId(105);
        geyser5.setBrand("Havells");
        geyser5.setCapacityInLiters(15);
        geyser5.setPowerInWatts(2500);
        geyser5.setIsInstant(false);
        geyser5.setColor("Blue");
        geyser5.setPrice(9999);
        geyser5.setMountingType("Vertical");
        geysers[4] = geyser5;

        GeyserStore store = new GeyserStore();
        store.geysers = geysers;
        store.displayGeyserDetails();
    }
}
