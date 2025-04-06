package com.xworkz.laddersystem.ladder;

import com.xworkz.laddersystem.model.LadderInfo;

public class Ladder {

    public LadderInfo[] ladderInfos;

    public void displayLadderInfo() {
        for (LadderInfo ladder : ladderInfos) {
            System.out.println("----------------------------------------------------");
            System.out.println("Ladder ID: " + ladder.getLadderId());
            System.out.println("Material: " + ladder.getMaterial());
            System.out.println("Height: " + ladder.getHeight() + " feet");
            System.out.println("Price: " + ladder.getPrice());
            System.out.println("Type: " + ladder.getType());
            System.out.println("Weight: " + ladder.getWeight() + " kg");
            System.out.println("Max Load: " + ladder.getMaxLoad() + " kg");
            System.out.println("----------------------------------------------------");
        }
    }
}
