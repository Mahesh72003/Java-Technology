package com.xworkz.material;

import com.xworkz.material.material.Material;
import com.xworkz.material.paper.Paper;

public class MaterialRunner {
    public static void main(String[] args) {

        Material material = new Material();
        material.validateMaterialDetails();
        material.getMaterialInfo();


        Paper paper = new Paper();
        paper.validateMaterialDetails();
        paper.getMaterialInfo();
    }
}
