package com.xworkz.climbingtool.ladder;

import com.xworkz.climbingtool.climbingtool.ClimbingTool;

public class Ladder extends ClimbingTool {

    @Override
    public void validateToolDetails() {
        System.out.println("Ladder is a specific climbing tool used for reaching high places, often in construction or home use.");
    }

    public void ladderType() {
        System.out.println("Type: Step ladder, extension ladder, and folding ladder.");
    }

    public void ladderMaterial() {
        System.out.println("Material: Aluminum, fiberglass, or wood.");
    }

    public void ladderSafety() {
        System.out.println("Safety: Non-slip feet, stable structure, and lock mechanisms.");
    }

    public void ladderStorage() {
        System.out.println("Storage: Can be folded or stored against walls.");
    }

    public void ladderLoadCapacity() {
        System.out.println("Load Capacity: Typically ranges from 150 kg to 300 kg depending on the model.");
    }
}
