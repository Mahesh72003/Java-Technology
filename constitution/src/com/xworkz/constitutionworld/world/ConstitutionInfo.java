package com.xworkz.constitutionworld.world;

public class ConstitutionInfo {
    private int constitutionId;
    private String country;
    private int yearAdopted;
    private int totalArticles;
    private int totalParts;
    private String languageOfAdoption;
    private int signatories;

    public int getConstitutionId() {
        return constitutionId;
    }

    public void setConstitutionId(int constitutionId) {
        this.constitutionId = constitutionId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYearAdopted() {
        return yearAdopted;
    }

    public void setYearAdopted(int yearAdopted) {
        this.yearAdopted = yearAdopted;
    }

    public int getTotalArticles() {
        return totalArticles;
    }

    public void setTotalArticles(int totalArticles) {
        this.totalArticles = totalArticles;
    }

    public int getTotalParts() {
        return totalParts;
    }

    public void setTotalParts(int totalParts) {
        this.totalParts = totalParts;
    }

    public String getLanguageOfAdoption() {
        return languageOfAdoption;
    }

    public void setLanguageOfAdoption(String languageOfAdoption) {
        this.languageOfAdoption = languageOfAdoption;
    }

    public int getSignatories() {
        return signatories;
    }

    public void setSignatories(int signatories) {
        this.signatories = signatories;
    }
}
