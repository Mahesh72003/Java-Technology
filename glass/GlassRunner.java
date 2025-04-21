package com.xworkz.glass;

import com.xworkz.glass.glass.Glass;
import com.xworkz.glass.window.Window;

public class GlassRunner {
    public static void main(String[] args) {
        Glass glass = new Glass();
        glass.validateGlassDetails();
        glass.typesOfGlass();
        glass.glassProperties();
        glass.glassApplications();
        glass.glassCleaning();

        Window window = new Window();
        window.validateGlassDetails();
        window.typesOfGlass();
        window.glassProperties();
        window.glassApplications();
        window.glassCleaning();
        window.windowTypes();
        window.windowFrameMaterial();
        window.windowOpeningMechanism();

        Glass glass1 = new Window();
        glass1.validateGlassDetails();
        glass1.typesOfGlass();
        glass1.glassProperties();
        glass1.glassApplications();
        glass1.glassCleaning();
    }
}
