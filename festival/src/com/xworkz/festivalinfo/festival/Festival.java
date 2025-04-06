package com.xworkz.festivalinfo.festival;

public class Festival {
    private int festivalId;
    private String name;
    private String religion;
    private String month;
    private int durationDays;
    private boolean isPublicHoliday;
    private String mainLocation;
    private String foodSpeciality;

    public int getFestivalId() {
        return festivalId;
    }

    public void setFestivalId(int festivalId) {
        this.festivalId = festivalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDurationDays() {
        return durationDays;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    public boolean getIsPublicHoliday() {
        return isPublicHoliday;
    }

    public void setIsPublicHoliday(boolean isPublicHoliday) {
        this.isPublicHoliday = isPublicHoliday;
    }

    public String getMainLocation() {
        return mainLocation;
    }

    public void setMainLocation(String mainLocation) {
        this.mainLocation = mainLocation;
    }

    public String getFoodSpeciality() {
        return foodSpeciality;
    }

    public void setFoodSpeciality(String foodSpeciality) {
        this.foodSpeciality = foodSpeciality;
    }
}
