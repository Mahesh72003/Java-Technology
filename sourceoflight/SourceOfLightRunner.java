package com.xworkz.sourceoflight;

import com.xworkz.sourceoflight.Lightbulb.Lightbulb;
import com.xworkz.sourceoflight.sourceoflight.SourceOfLight;

public class SourceOfLightRunner {
    public static void main(String[] args) {
        SourceOfLight lightSource = new SourceOfLight();
        lightSource.validateLightSourceDetails();

        Lightbulb lightbulb = new Lightbulb();
        lightbulb.validateLightSourceDetails();
    }
}
