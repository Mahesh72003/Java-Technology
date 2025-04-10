package com.xworkz.waterbody;
import com.xworkz.waterbody.ocean.Ocean;
import com.xworkz.waterbody.waterbody.WaterBody;

public class WaterBodyRunner {
    public static void main(String[] args) {
        WaterBody body = new WaterBody();
        body.validateWaterBodyDetails();
        Ocean ocean = new Ocean();
        ocean.validateWaterBodyDetails();
    }

}
