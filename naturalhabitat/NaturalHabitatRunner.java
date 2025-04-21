package com.xworkz.naturalhabitat;

import com.xworkz.naturalhabitat.forest.Forest;
import com.xworkz.naturalhabitat.naturalhabitat.NaturalHabitat;

public class NaturalHabitatRunner {
    public static void main(String[] args) {


        NaturalHabitat habitat = new NaturalHabitat();
        habitat.validateNaturalHabitatDetails();
        habitat.protectHabitat();
        habitat.monitorEcosystem();
        habitat.restoreHabitat();
        habitat.educateConservation();


        NaturalHabitat ref = new Forest();
        ref.validateNaturalHabitatDetails();
        ref.protectHabitat();
        ref.monitorEcosystem();
        ref.restoreHabitat();
        ref.educateConservation();


        Forest forest = new Forest();
        forest.validateNaturalHabitatDetails();
        forest.protectHabitat();
        forest.monitorEcosystem();
        forest.restoreHabitat();
        forest.educateConservation();
        forest.promoteReforestation();
    }
}
