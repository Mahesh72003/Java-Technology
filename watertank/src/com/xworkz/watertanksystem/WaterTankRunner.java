package com.xworkz.watertanksystem;

import com.xworkz.watertanksystem.tank.WaterTank;
import com.xworkz.watertanksystem.model.TankInfo;

public class WaterTankRunner {
    public static void main(String[] args) {
        TankInfo[] tankInfos = new TankInfo[5];

        TankInfo tank1 = new TankInfo();
        tank1.setTankId(1);
        tank1.setBrand("Sintex");
        tank1.setMaterial("Polyethylene");
        tank1.setCapacity(1000);   
        tank1.setPrice(5500.75);   
        tank1.setColor("Blue");
        tank1.setShape("Cylindrical");
        tankInfos[0] = tank1;

        TankInfo tank2 = new TankInfo();
        tank2.setTankId(2);
        tank2.setBrand("Plasto");
        tank2.setMaterial("Plastic");
        tank2.setCapacity(2000);   
        tank2.setPrice(9500.50);   
        tank2.setColor("Black");
        tank2.setShape("Rectangular");
        tankInfos[1] = tank2;

        TankInfo tank3 = new TankInfo();
        tank3.setTankId(3);
        tank3.setBrand("Supreme");
        tank3.setMaterial("HDPE");
        tank3.setCapacity(1500);   
        tank3.setPrice(6500.00);   
        tank3.setColor("Green");
        tank3.setShape("Cylindrical");
        tankInfos[2] = tank3;

        TankInfo tank4 = new TankInfo();
        tank4.setTankId(4);
        tank4.setBrand("Vectus");
        tank4.setMaterial("PVC");
        tank4.setCapacity(500);   
        tank4.setPrice(3000.00);   
        tank4.setColor("White");
        tank4.setShape("Rectangular");
        tankInfos[3] = tank4;

        TankInfo tank5 = new TankInfo();
        tank5.setTankId(5);
        tank5.setBrand("National");
        tank5.setMaterial("FRP");
        tank5.setCapacity(2500);   
        tank5.setPrice(12000.00);   
        tank5.setColor("Blue");
        tank5.setShape("Cylindrical");
        tankInfos[4] = tank5;

        WaterTank waterTank = new WaterTank();
        waterTank.tankInfos = tankInfos;
        waterTank.displayTankInfo();
    }
}
