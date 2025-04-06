package com.xworkz.celebritysystem.celebrity;

public class Celebrity {
    private int celebrityId;
    private String name;
    private String profession;
    private int age;
    private String nationality;
    private boolean isActive;
    private double netWorth;
    private String languageIndustry;

    public int getCelebrityId() {
        return celebrityId;
    }

    public void setCelebrityId(int celebrityId) {
        this.celebrityId = celebrityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public double getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(double netWorth) {
        this.netWorth = netWorth;
    }

    public String getLanguageIndustry() {
        return languageIndustry;
    }

    public void setLanguageIndustry(String languageIndustry) {
        this.languageIndustry = languageIndustry;
    }
}
