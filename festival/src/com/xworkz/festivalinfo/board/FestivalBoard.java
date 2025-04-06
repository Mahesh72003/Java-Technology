package com.xworkz.festivalinfo.board;

import com.xworkz.festivalinfo.festival.Festival;

public class FestivalBoard {
    public Festival[] festivals;

    public void displayFestivalInfo() {
        for (Festival fest : festivals) {
            System.out.println("--------------------------------------------------");
            System.out.println("Festival ID: " + fest.getFestivalId());
            System.out.println("Name: " + fest.getName());
            System.out.println("Religion: " + fest.getReligion());
            System.out.println("Celebrated in Month: " + fest.getMonth());
            System.out.println("Duration (Days): " + fest.getDurationDays());
            System.out.println("Is Public Holiday: " + fest.getIsPublicHoliday());
            System.out.println("Main Celebration Location: " + fest.getMainLocation());
            System.out.println("Food Speciality: " + fest.getFoodSpeciality());
            System.out.println("--------------------------------------------------");
        }
    }
}
