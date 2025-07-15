package com.xwork.oilproductioncompany;

import com.xwork.oilproductioncompany.dto.OilProductionCompanyDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OilProductionCompanyRunner {
    public static void main(String[] args) {
        List<OilProductionCompanyDto> oilCompanies = new ArrayList<>();


        oilCompanies.add(new OilProductionCompanyDto("Indian Oil Corporation", "India", 5.1, 1500, false));
        oilCompanies.add(new OilProductionCompanyDto("Reliance Industries", "India", 8.0, 1300, false));
        oilCompanies.add(new OilProductionCompanyDto("ONGC (Oil and Natural Gas Corporation)", "India", 5.5, 2100, false));
        oilCompanies.add(new OilProductionCompanyDto("Bharat Petroleum Corporation Limited", "India", 4.5, 1200, false));
        oilCompanies.add(new OilProductionCompanyDto("HPCL (Hindustan Petroleum Corporation Limited)", "India", 3.2, 1100, false));
        oilCompanies.add(new OilProductionCompanyDto("Oil India Limited", "India", 2.2, 900, false));
        oilCompanies.add(new OilProductionCompanyDto("Essar Oil", "India", 3.0, 1000, false));
        oilCompanies.add(new OilProductionCompanyDto("Adani Total Gas", "India", 1.5, 500, false));
        oilCompanies.add(new OilProductionCompanyDto("Saudi Aramco", "Saudi Arabia", 2.0, 10000, false));
        oilCompanies.add(new OilProductionCompanyDto("ExxonMobil", "USA", 3.7, 4000, false));
        oilCompanies.add(new OilProductionCompanyDto("Rosneft", "Russia", 0.6, 4000, true));
        oilCompanies.add(new OilProductionCompanyDto("BP", "UK", 2.0, 3000, false));
        oilCompanies.add(new OilProductionCompanyDto("Royal Dutch Shell", "Netherlands/UK", 2.5, 3500, false));
        oilCompanies.add(new OilProductionCompanyDto("Chevron", "USA", 2.3, 2800, false));
        oilCompanies.add(new OilProductionCompanyDto("PetroChina", "China", 0.6, 3500, false));
        oilCompanies.add(new OilProductionCompanyDto("TotalEnergies", "France", 2.1, 2500, false));
        oilCompanies.add(new OilProductionCompanyDto("National Iranian Oil Company", "Iran", 0.4, 4000, true));
        oilCompanies.add(new OilProductionCompanyDto("PDVSA", "Venezuela", 0.3, 2000, true));

        System.out.println("Before Sorting:");
        for (OilProductionCompanyDto company : oilCompanies) {
            System.out.println(company);
        }


        Collections.sort(oilCompanies);

        System.out.println("\nAfter Sorting by Net Worth:");
        for (OilProductionCompanyDto company : oilCompanies) {
            System.out.println(company);
        }
    }
}
