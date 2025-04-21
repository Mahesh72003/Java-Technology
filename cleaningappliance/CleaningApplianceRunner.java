package com.xworkz.cleaningappliance;

import com.xworkz.cleaningappliance.cleaningappliance.CleaningAppliance;
import com.xworkz.cleaningappliance.vacuum.Vacuum;

public class CleaningApplianceRunner {
    public static void main(String[] args) {

        CleaningAppliance cleaningAppliance = new CleaningAppliance();
        cleaningAppliance.validateApplianceDetails();
        cleaningAppliance.applianceBrand();
        cleaningAppliance.powerConsumption();
        cleaningAppliance.applianceType();
        cleaningAppliance.isCordless();
        cleaningAppliance.weight();


        Vacuum vacuum = new Vacuum();
        vacuum.validateApplianceDetails();
        vacuum.applianceBrand();
        vacuum.powerConsumption();
        vacuum.applianceType();
        vacuum.isCordless();
        vacuum.weight();
        vacuum.suctionPower();
        vacuum.hasHEPAFilter();
        vacuum.dustCapacity();
        vacuum.noiseLevel();
        vacuum.warrantyPeriod();


        CleaningAppliance polyVacuum = new Vacuum();
        polyVacuum.validateApplianceDetails();
        polyVacuum.applianceBrand();
        polyVacuum.powerConsumption();
        polyVacuum.applianceType();
        polyVacuum.isCordless();
        polyVacuum.weight();
    }
}
