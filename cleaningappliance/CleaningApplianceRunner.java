package com.xworkz.cleaningappliance;

import com.xworkz.cleaningappliance.cleaningappliance.CleaningAppliance;
import com.xworkz.cleaningappliance.vacuum.Vacuum;

public class CleaningApplianceRunner {
    public static void main(String[] args) {
        CleaningAppliance cleaningAppliance = new CleaningAppliance();
        cleaningAppliance.validateApplianceDetails();

        Vacuum vacuum = new Vacuum();
        vacuum.validateApplianceDetails();
    }
}
