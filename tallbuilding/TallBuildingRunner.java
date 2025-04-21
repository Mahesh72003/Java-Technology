package com.xworkz.tallbuilding;

import com.xworkz.tallbuilding.tallbuilding.TallBuilding;
import com.xworkz.tallbuilding.skyscraper.Skyscraper;

public class TallBuildingRunner {
    public static void main(String[] args) {


        TallBuilding tallBuilding = new TallBuilding();
        tallBuilding.validateBuildingDetails();
        tallBuilding.buildingMaterials();
        tallBuilding.architecturalStyle();
        tallBuilding.purpose();
        tallBuilding.height();


        Skyscraper skyscraper = new Skyscraper();
        skyscraper.validateBuildingDetails();
        skyscraper.skyscraperType();
        skyscraper.elevators();
        skyscraper.cityImpact();
        skyscraper.safetyFeatures();


        TallBuilding polymorphicBuilding = new Skyscraper();
        polymorphicBuilding.validateBuildingDetails();
        polymorphicBuilding.buildingMaterials();
        polymorphicBuilding.architecturalStyle();
        polymorphicBuilding.purpose();
        polymorphicBuilding.height();
    }
}
