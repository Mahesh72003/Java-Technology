package com.xworkz.constitutionworld.constitution;

import com.xworkz.constitutionworld.world.ConstitutionInfo;

public class Constitution {

    public ConstitutionInfo[] constitutionInfos;

    public void displayConstitutionInfo() {
        for (ConstitutionInfo constitution : constitutionInfos) {
            System.out.println("----------------------------------------------------");
            System.out.println("Constitution ID: " + constitution.getConstitutionId());
            System.out.println("Country: " + constitution.getCountry());
            System.out.println("Year Adopted: " + constitution.getYearAdopted());
            System.out.println("Total Articles: " + constitution.getTotalArticles());
            System.out.println("Total Parts: " + constitution.getTotalParts());
            System.out.println("Number of Signatories: " + constitution.getSignatories());
            System.out.println("Language of Adoption: " + constitution.getLanguageOfAdoption());
            System.out.println("----------------------------------------------------");
        }
    }
}
