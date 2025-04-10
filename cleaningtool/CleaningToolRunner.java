package com.xworkz.cleaningtool;

import com.xworkz.cleaningtool.cleaningtool.CleaningTool;
import com.xworkz.cleaningtool.broom.Broom;

public class CleaningToolRunner {
    public static void main(String[] args) {
        CleaningTool cleaningTool = new CleaningTool();
        cleaningTool.validateToolDetails();

        Broom broom = new Broom();
        broom.validateToolDetails();
    }
}
