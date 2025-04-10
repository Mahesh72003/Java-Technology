package com.xworkz.climbingtool;

import com.xworkz.climbingtool.climbingtool.ClimbingTool;
import com.xworkz.climbingtool.ladder.Ladder;

public class ClimbingToolRunner {
    public static void main(String[] args) {
        ClimbingTool climbingTool = new ClimbingTool();
        climbingTool.validateToolDetails();

        Ladder ladder = new Ladder();
        ladder.validateToolDetails();
    }
}
