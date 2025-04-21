package com.xworkz.climbingtool;

import com.xworkz.climbingtool.climbingtool.ClimbingTool;
import com.xworkz.climbingtool.ladder.Ladder;

public class ClimbingToolRunner {
    public static void main(String[] args) {

        ClimbingTool climbingTool = new ClimbingTool();
        climbingTool.validateToolDetails();
        climbingTool.toolMaterial();
        climbingTool.toolType();
        climbingTool.toolUses();
        climbingTool.weight();
        climbingTool.height();


        Ladder ladder = new Ladder();
        ladder.validateToolDetails();
        ladder.toolMaterial();
        ladder.toolType();
        ladder.toolUses();
        ladder.weight();
        ladder.height();
        ladder.ladderType();
        ladder.ladderMaterial();
        ladder.ladderSafety();
        ladder.ladderStorage();
        ladder.ladderLoadCapacity();


        ClimbingTool polyLadder = new Ladder();
        polyLadder.validateToolDetails();
        polyLadder.toolMaterial();
        polyLadder.toolType();
        polyLadder.toolUses();
        polyLadder.weight();
        polyLadder.height();
    }
}
