package com.xworkz.shavingtool;

import com.xworkz.shavingtool.shavingtool.ShavingTool;
import com.xworkz.shavingtool.razor.Razor;

public class ShavingToolRunner {
    public static void main(String[] args) {
        ShavingTool shavingTool = new ShavingTool();
        shavingTool.validateToolDetails();

        Razor razor = new Razor();
        razor.validateToolDetails();
    }
}
