package com.xworkz.ceramic;

import com.xworkz.ceramic.ceramic.Ceramic;
import com.xworkz.ceramic.mug.Mug;

public class CeramicRunner {
    public static void main(String[] args) {

        Ceramic ceramic = new Ceramic();
        ceramic.validateCeramicDetails();
        ceramic.ceramicMaterial();
        ceramic.ceramicTypes();
        ceramic.ceramicDurability();
        ceramic.ceramicUses();
        ceramic.madeIn();


        Mug mug = new Mug();
        mug.validateCeramicDetails();
        mug.ceramicMaterial();
        mug.ceramicTypes();
        mug.ceramicDurability();
        mug.ceramicUses();
        mug.madeIn();
        mug.mugCapacity();
        mug.mugDesign();
        mug.mugColor();
        mug.mugWithLid();
        mug.microwaveSafe();

        System.out.println("\n=== Polymorphism ===");
        Ceramic polyCeramic = new Mug();
        polyCeramic.validateCeramicDetails();
        polyCeramic.ceramicMaterial();
        polyCeramic.ceramicTypes();
        polyCeramic.ceramicDurability();
        polyCeramic.ceramicUses();
        polyCeramic.madeIn();
    }
}
