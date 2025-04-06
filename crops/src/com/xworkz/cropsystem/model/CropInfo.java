package com.xworkz.cropsystem.model;

public class CropInfo {
    private int cropId;
    private String cropName;
    private String season;
    private double pricePerKg;
    private double yieldPerAcre;
    private String waterRequirement;
    private String harvestingMonth;

    public int getCropId() {
        return cropId;
    }

    public void setCropId(int cropId) {
        this.cropId = cropId;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public double getYieldPerAcre() {
        return yieldPerAcre;
    }

    public void setYieldPerAcre(double yieldPerAcre) {
        this.yieldPerAcre = yieldPerAcre;
    }

    public String getWaterRequirement() {
        return waterRequirement;
    }

    public void setWaterRequirement(String waterRequirement) {
        this.waterRequirement = waterRequirement;
    }

    public String getHarvestingMonth() {
        return harvestingMonth;
    }

    public void setHarvestingMonth(String harvestingMonth) {
        this.harvestingMonth = harvestingMonth;
    }
}
