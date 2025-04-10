package com.xworkz.glass;

import com.xworkz.glass.glass.Glass;
import com.xworkz.glass.window.Window;

public class GlassRunner {
    public static void main(String[] args) {
        Glass glass = new Glass();
        glass.validateGlassDetails();

        Window window = new Window();
        window.validateGlassDetails();
    }
}
