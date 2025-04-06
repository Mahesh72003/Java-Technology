package com.xworkz.geyserinfo.geyser;

public class Geyser {
    private int geyserId;
    private String brand;
    private double capacityInLiters;
    private int powerInWatts;
    private boolean isInstant;
    private String color;
    private double price;
    private String mountingType;

    public int getGeyserId() {
        return geyserId;
    }

    public void setGeyserId(int geyserId) {
        this.geyserId = geyserId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCapacityInLiters() {
        return capacityInLiters;
    }

    public void setCapacityInLiters(double capacityInLiters) {
        this.capacityInLiters = capacityInLiters;
    }

    public int getPowerInWatts() {
        return powerInWatts;
    }

    public void setPowerInWatts(int powerInWatts) {
        this.powerInWatts = powerInWatts;
    }

    public boolean getIsInstant() {
        return isInstant;
    }

    public void setIsInstant(boolean isInstant) {
        this.isInstant = isInstant;
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

    public String getMountingType() {
        return mountingType;
    }

    public void setMountingType(String mountingType) {
        this.mountingType = mountingType;
    }
}
