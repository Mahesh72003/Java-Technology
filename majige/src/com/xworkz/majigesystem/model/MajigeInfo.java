package com.xworkz.majigesystem.model;

public class MajigeInfo {
    private int majigeId;
    private String brand;
    private String flavor;
    private double volume;
    private double price;
    private String texture;
    private String expiryDate;

    public int getMajigeId() {
        return majigeId;
    }

    public void setMajigeId(int majigeId) {
        this.majigeId = majigeId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
