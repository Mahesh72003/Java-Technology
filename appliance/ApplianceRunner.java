package com.xworkz.appliance;

import com.xworkz.appliance.appliance.Appliance;
import com.xworkz.appliance.television.Television;

public class ApplianceRunner {
    public static void main(String[] args) {


        Appliance appliance = new Appliance();
        appliance.validateApplianceDetails();
        appliance.getApplianceInfo();
        appliance.applianceBrand();
        appliance.warrantyPeriod();
        appliance.energyRating();
        appliance.applianceType();
        appliance.madeIn();


        Television television = new Television();
        television.validateApplianceDetails();
        television.getApplianceInfo();
        television.applianceBrand();
        television.warrantyPeriod();
        television.energyRating();
        television.applianceType();
        television.madeIn();
        television.screenType();
        television.resolution();
        television.smartFeatures();
        television.soundSystem();
        television.screenSize();


        Appliance tvAsAppliance = new Television();
        tvAsAppliance.validateApplianceDetails();
        tvAsAppliance.getApplianceInfo();
        tvAsAppliance.applianceBrand();
        tvAsAppliance.warrantyPeriod();
        tvAsAppliance.energyRating();
    }
}
