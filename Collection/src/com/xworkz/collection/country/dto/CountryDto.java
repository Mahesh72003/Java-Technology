package com.xworkz.collection.country.dto;

public class CountryDto {

    private int countryId;
    private String countryName;
    private long countryPopulation;
    private String countryPMName;

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCountryPopulation(long countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public void setCountryPMName(String countryPMName) {
        this.countryPMName = countryPMName;
    }

    public int getCountryId() {
        return countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public long getCountryPopulation() {
        return countryPopulation;
    }

    public String getCountryPMName() {
        return countryPMName;
    }
}
