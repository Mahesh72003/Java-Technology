package com.xworkz.watertanksystem.tank;

import com.xworkz.watertanksystem.model.TankInfo;

public class WaterTank {

    public TankInfo[] tankInfos;

    public void displayTankInfo() {
        for (TankInfo tank : tankInfos) {
            System.out.println("----------------------------------------------------");
            System.out.println("The Tank ID is: " + tank.getTankId());
            System.out.println("The Tank Brand is: " + tank.getBrand());
            System.out.println("The Tank Material is: " + tank.getMaterial());
            System.out.println("The Tank Capacity is: " + tank.getCapacity() + " liters");
            System.out.println("The Tank Price is: " + tank.getPrice());
            System.out.println("The Tank Color is: " + tank.getColor());
            System.out.println("The Tank Shape is: " + tank.getShape());
            System.out.println("----------------------------------------------------");
        }
    }
}
