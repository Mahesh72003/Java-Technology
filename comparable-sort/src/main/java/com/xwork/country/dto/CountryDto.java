package com.xwork.country.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class CountryDto implements Comparable<CountryDto>{
    private int countryId;
    private String countryName;
    private String countryCapitalCity;
    private long countryPopulation;
    private String countryPMName;
    private String countryCurrency;
    private double gdp;
    private String continent;
    private long landSize;
    private boolean isDeveloped;
    private boolean isInEuropeanUnion;
    private boolean isInAfricanUnion;
    private String countryTeleNo;

    @Override
    public int compareTo(CountryDto o) {
        return this.getCountryName().compareTo(o.getCountryName());
    }
}
