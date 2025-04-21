package com.xworkz.sourceoflight;

import com.xworkz.sourceoflight.sourceoflight.SourceOfLight;
import com.xworkz.sourceoflight.Lightbulb.Lightbulb;

public class SourceOfLightRunner {
    public static void main(String[] args) {
        SourceOfLight lightSource = new SourceOfLight();
        lightSource.validateLightSourceDetails();
        lightSource.lightIntensity();
        lightSource.energyEfficiency();
        lightSource.lightColor();
        lightSource.lightApplication();

        Lightbulb lightbulb = new Lightbulb();
        lightbulb.validateLightSourceDetails();
        lightbulb.lightbulbType();
        lightbulb.lightbulbEfficiency();
        lightbulb.lightbulbLifespan();
        lightbulb.lightbulbApplication();

        SourceOfLight lightSource1 = new SourceOfLight();
        SourceOfLight type = (SourceOfLight) lightSource1;
        type.validateLightSourceDetails();
        type.lightIntensity();
        type.energyEfficiency();
        type.lightColor();
        type.lightApplication();
    }
}
