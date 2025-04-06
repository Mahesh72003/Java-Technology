package com.xworkz.mobilecaseinfo.model;

public class MobileCaseInfo {
    private int mobileCaseId;
    private String brand;
    private String material;
    private String color;
    private double price;
    private boolean isWashable;
    private String compatibility;
    private boolean shockproof;

    public int getMobileCaseId() {
        return mobileCaseId;
    }

    public void setMobileCaseId(int mobileCaseId) {
        this.mobileCaseId = mobileCaseId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWashable() {
        return isWashable;
    }

    public void setIsWashable(boolean isWashable) {
        this.isWashable = isWashable;
    }

    public String getCompatibility() {
        return compatibility;
    }

    public void setCompatibility(String compatibility) {
        this.compatibility = compatibility;
    }

    public boolean isShockproof() {
        return shockproof;
    }

    public void setShockproof(boolean shockproof) {
        this.shockproof = shockproof;
    }
}
