package com.xworkz.celebritysystem.manager;

import com.xworkz.celebritysystem.celebrity.Celebrity;

public class CelebrityManager {
    public Celebrity[] celebrities;

    public void displayCelebrityInfo() {
        for (Celebrity celeb : celebrities) {
            System.out.println("--------------------------------------------------");
            System.out.println("Celebrity ID: " + celeb.getCelebrityId());
            System.out.println("Name: " + celeb.getName());
            System.out.println("Profession: " + celeb.getProfession());
            System.out.println("Age: " + celeb.getAge());
            System.out.println("Nationality: " + celeb.getNationality());
            System.out.println("Currently Active: " + celeb.getIsActive());
            System.out.println("Net Worth in INR: " + celeb.getNetWorth());
            System.out.println("Language Industry: " + celeb.getLanguageIndustry());
            System.out.println("--------------------------------------------------");
        }
    }
}
