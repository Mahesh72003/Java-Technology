package com.xworkz.floorcovering;

import com.xworkz.floorcovering.floorcovering.FloorCovering;
import com.xworkz.floorcovering.rug.Rug;

public class FloorCoveringRunner {
    public static void main(String[] args) {
        FloorCovering floorCovering = new FloorCovering();
        floorCovering.validateFloorCoveringDetails();
        floorCovering.material();
        floorCovering.maintenance();
        floorCovering.design();
        floorCovering.durability();

        Rug rug = new Rug();
        rug.validateFloorCoveringDetails();
        rug.material();
        rug.maintenance();
        rug.design();
        rug.durability();
        rug.rugSize();
        rug.rugType();

        FloorCovering myFloorCovering = new Rug();
        myFloorCovering.validateFloorCoveringDetails();
        myFloorCovering.material();
        myFloorCovering.maintenance();
        myFloorCovering.design();
        myFloorCovering.durability();
    }
}
