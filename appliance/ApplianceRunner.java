package com.xworkz.appliance;

import com.xworkz.appliance.appliance.Appliance;
import com.xworkz.appliance.television.Television;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance appliance = new Appliance();
        appliance.validateApplianceDetails();
        appliance.getApplianceInfo();

        Television television=new Television();
        television.validateApplianceDetails();
        television.getApplianceInfo();
    }

}
