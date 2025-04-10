package com.xworkz.tallbuilding;

import com.xworkz.tallbuilding.tallbuilding.TallBuilding;
import com.xworkz.tallbuilding.skyscraper.Skyscraper;

public class TallBuildingRunner {
    public static void main(String[] args) {
        TallBuilding tallBuilding = new TallBuilding();
        tallBuilding.validateBuildingDetails();

        Skyscraper skyscraper = new Skyscraper();
        skyscraper.validateBuildingDetails();
    }
}
