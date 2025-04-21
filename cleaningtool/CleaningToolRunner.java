package com.xworkz.cleaningtool;

import com.xworkz.cleaningtool.cleaningtool.CleaningTool;
import com.xworkz.cleaningtool.broom.Broom;

public class CleaningToolRunner {
    public static void main(String[] args) {

        CleaningTool cleaningTool = new CleaningTool();
        cleaningTool.validateToolDetails();
        cleaningTool.toolMaterial();
        cleaningTool.toolType();
        cleaningTool.toolUses();
        cleaningTool.isEcoFriendly();
        cleaningTool.weight();


        Broom broom = new Broom();
        broom.validateToolDetails();
        broom.toolMaterial();
        broom.toolType();
        broom.toolUses();
        broom.isEcoFriendly();
        broom.weight();
        broom.broomHandleLength();
        broom.broomHeadType();
        broom.broomForIndoor();
        broom.broomForOutdoor();
        broom.broomColor();


        CleaningTool polyBroom = new Broom();
        polyBroom.validateToolDetails();
        polyBroom.toolMaterial();
        polyBroom.toolType();
        polyBroom.toolUses();
        polyBroom.isEcoFriendly();
        polyBroom.weight();
    }
}
