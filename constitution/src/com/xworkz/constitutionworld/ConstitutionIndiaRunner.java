package com.xworkz.constitutionworld;

import com.xworkz.constitutionworld.constitution.Constitution;
import com.xworkz.constitutionworld.world.ConstitutionInfo;

public class ConstitutionIndiaRunner {
    public static void main(String[] args) {
        ConstitutionInfo[] constitutionInfos = new ConstitutionInfo[5];


        ConstitutionInfo constitution1 = new ConstitutionInfo();
        constitution1.setConstitutionId(1);
        constitution1.setCountry("India");
        constitution1.setYearAdopted(1950);
        constitution1.setTotalArticles(395);
        constitution1.setTotalParts(22);
        constitution1.setSignatories(284);
        constitution1.setLanguageOfAdoption("English");

        ConstitutionInfo constitution2 = new ConstitutionInfo();
        constitution2.setConstitutionId(2);
        constitution2.setCountry("United States of America");
        constitution2.setYearAdopted(1787);
        constitution2.setTotalArticles(7);
        constitution2.setTotalParts(27);
        constitution2.setSignatories(39);
        constitution2.setLanguageOfAdoption("English");


        ConstitutionInfo constitution3 = new ConstitutionInfo();
        constitution3.setConstitutionId(3);
        constitution3.setCountry("Canada");
        constitution3.setYearAdopted(1867);
        constitution3.setTotalArticles(147);
        constitution3.setTotalParts(12);
        constitution3.setSignatories(5);
        constitution3.setLanguageOfAdoption("English, French");


        ConstitutionInfo constitution4 = new ConstitutionInfo();
        constitution4.setConstitutionId(4);
        constitution4.setCountry("Australia");
        constitution4.setYearAdopted(1901);
        constitution4.setTotalArticles(128);
        constitution4.setTotalParts(9);
        constitution4.setSignatories(7);
        constitution4.setLanguageOfAdoption("English");


        ConstitutionInfo constitution5 = new ConstitutionInfo();
        constitution5.setConstitutionId(5);
        constitution5.setCountry("Germany");
        constitution5.setYearAdopted(1949);
        constitution5.setTotalArticles(146);
        constitution5.setTotalParts(11);
        constitution5.setSignatories(12);
        constitution5.setLanguageOfAdoption("German");


        constitutionInfos[0] = constitution1;
        constitutionInfos[1] = constitution2;
        constitutionInfos[2] = constitution3;
        constitutionInfos[3] = constitution4;
        constitutionInfos[4] = constitution5;


        Constitution constitution = new Constitution();
        constitution.constitutionInfos = constitutionInfos;
        constitution.displayConstitutionInfo();
    }
}
