package com.xworkz.granitesystem.model;

public class GraniteModel {
    private int graniteId;
    private String brand;
    private String color;
    private String material;
    private double price;
    private String origin;
    private String texture;

    public int getGraniteId() {
        return graniteId;
    }

    public void setGraniteId(int graniteId) {
        this.graniteId = graniteId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }
}
