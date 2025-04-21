package com.xworkz.material;

import com.xworkz.material.material.Material;
import com.xworkz.material.paper.Paper;

public class MaterialRunner {
    public static void main(String[] args) {


        Material material = new Material();
        material.validateMaterialDetails();
        material.getMaterialInfo();
        material.processMaterial();
        material.testDurability();
        material.recycleMaterial();


        Material materialRef = new Paper();
        materialRef.validateMaterialDetails();
        materialRef.getMaterialInfo();
        materialRef.processMaterial();
        materialRef.testDurability();
        materialRef.recycleMaterial();


        Paper paper = new Paper();
        paper.validateMaterialDetails();
        paper.getMaterialInfo();
        paper.processMaterial();
        paper.testDurability();
        paper.recycleMaterial();
        paper.printOnPaper();
    }
}
