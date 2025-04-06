package com.xworkz.cookerinfo.cooker;

public class Cooker {
    private int cookerId;
    private String brand;
    private int capacityInLiters;
    private boolean isElectric;
    private String color;
    private double price;
    private String material;
    private boolean isInductionCompatible;

    public int getCookerId() {
        return cookerId;
    }

    public void setCookerId(int cookerId) {
        this.cookerId = cookerId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacityInLiters() {
        return capacityInLiters;
    }

    public void setCapacityInLiters(int capacityInLiters) {
        this.capacityInLiters = capacityInLiters;
    }

    public boolean getIsElectric() {
        return isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean getIsInductionCompatible() {
        return isInductionCompatible;
    }

    public void setIsInductionCompatible(boolean isInductionCompatible) {
        this.isInductionCompatible = isInductionCompatible;
    }
}
