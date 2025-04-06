package com.xworkz.laddersystem.model;

public class LadderInfo {
    private int ladderId;
    private String material;
    private double height;  // Height in feet
    private double price;   // Price in INR
    private String type;
    private double weight;  // Weight in kg
    private double maxLoad; // Maximum load in kg

    public int getLadderId() {
        return ladderId;
    }

    public void setLadderId(int ladderId) {
        this.ladderId = ladderId;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }
}
