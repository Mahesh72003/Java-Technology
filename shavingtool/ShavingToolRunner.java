package com.xworkz.shavingtool;

import com.xworkz.shavingtool.shavingtool.ShavingTool;
import com.xworkz.shavingtool.razor.Razor;

public class ShavingToolRunner {
    public static void main(String[] args) {
        ShavingTool shavingTool = new ShavingTool();
        shavingTool.validateToolDetails();
        shavingTool.toolMaterial();
        shavingTool.toolSafety();
        shavingTool.toolUsage();
        shavingTool.toolMaintenance();

        Razor razor = new Razor();
        razor.validateToolDetails();
        razor.razorType();
        razor.razorSafety();
        razor.razorMaintenance();
        razor.razorUsage();

        ShavingTool shavingTool1 = new ShavingTool();
        ShavingTool type = (ShavingTool) shavingTool1;
        type.validateToolDetails();
        type.toolMaterial();
        type.toolSafety();
        type.toolUsage();
        type.toolMaintenance();
    }
}
