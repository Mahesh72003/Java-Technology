package com.xworkz.material.paper;

import com.xworkz.material.material.Material;

public class Paper extends Material {

     
    public void validateMaterialDetails() {
        System.out.println("Paper: Validating paper material.");
    }

    public void getMaterialInfo() {
        System.out.println("Paper: Made from wood pulp, mostly biodegradable.");
    }
     
    public void processMaterial() {
        System.out.println("Paper: Pressing and drying the pulp into sheets.");
    }

    public void testDurability() {
        System.out.println("Paper: Tearing and moisture tests for strength.");
    }

    public void recycleMaterial() {
        System.out.println("Paper: Shredding and reprocessing into new paper.");
    }

    public void printOnPaper() {
        System.out.println("Paper: Printing content on the paper.");
    }
}
