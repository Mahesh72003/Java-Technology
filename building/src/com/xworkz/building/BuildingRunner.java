package com.xworkz.building;

import com.xworkz.building.dto.BuildingDto;

public class BuildingRunner {

    public static void main(String[] args) {

        BuildingDto building = new BuildingDto();

        building.setBuildingName("Skyline Tower");
        building.setAddress("Bangalore, MG Road");
        building.setTotalFloors(25);
        building.setArea(12000.50);
        building.setHasParking(true);

        System.out.println(building.toString());
    }
}


