package com.xworkz.naturalhabitat;

import com.xworkz.naturalhabitat.forest.Forest;
import com.xworkz.naturalhabitat.naturalhabitat.NaturalHabitat;

public class NaturalHabitatRunner {
    public static void main(String[] args) {

        NaturalHabitat habitat = new NaturalHabitat();
        habitat.validateNaturalHabitatDetails();

        Forest forest = new Forest();
        forest.validateNaturalHabitatDetails();
    }
}