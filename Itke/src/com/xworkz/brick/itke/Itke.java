package com.xworkz.brick.itke;

public class Itke {

    private int brickId;
    private String manufacturer;
    private String type; // Clay, Fly Ash, Concrete
    private double length;
    private double width;
    private double height;
    private boolean isEcoFriendly;
    private double weight;

    public int getBrickId() {
        return brickId;
    }

    public void setBrickId(int brickId) {
        this.brickId = brickId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isEcoFriendly() {
        return isEcoFriendly;
    }

    public void setEcoFriendly(boolean ecoFriendly) {
        isEcoFriendly = ecoFriendly;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
