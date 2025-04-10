package com.xworkz.floorcovering;

import com.xworkz.floorcovering.floorcovering.FloorCovering;
import com.xworkz.floorcovering.rug.Rug;

public class FloorCoveringRunner {
    public static void main(String[] args) {
        FloorCovering floorCovering = new FloorCovering();
        floorCovering.validateFloorCoveringDetails();

        Rug rug = new Rug();
        rug.validateFloorCoveringDetails();
    }
}
