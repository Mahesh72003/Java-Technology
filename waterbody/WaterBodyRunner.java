package com.xworkz.waterbody;

import com.xworkz.waterbody.ocean.Ocean;
import com.xworkz.waterbody.waterbody.WaterBody;

public class WaterBodyRunner {
    public static void main(String[] args) {


        WaterBody body = new WaterBody();
        body.validateWaterBodyDetails();
        body.waterType();
        body.size();
        body.salinity();
        body.ecosystem();


        Ocean ocean = new Ocean();
        ocean.validateWaterBodyDetails();
        ocean.oceanDepth();
        ocean.oceanCurrents();
        ocean.marineLife();
        ocean.importance();


        WaterBody polymorphicWaterBody = new Ocean();
        polymorphicWaterBody.validateWaterBodyDetails();
        polymorphicWaterBody.waterType();
        polymorphicWaterBody.size();
        polymorphicWaterBody.salinity();
        polymorphicWaterBody.ecosystem();
    }
}
