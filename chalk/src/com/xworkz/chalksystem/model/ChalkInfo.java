package com.xworkz.chalksystem.model;

public class ChalkInfo {
    private int chalkId;
    private String brand;
    private String color;
    private double length;
    private double width;
    private double weight;
    private boolean isDustless;

    public int getChalkId() {
        return chalkId;
    }

    public void setChalkId(int chalkId) {
        this.chalkId = chalkId;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isDustless() {
        return isDustless;
    }

    public void setIsDustless(boolean isDustless) {
        this.isDustless = isDustless;
    }
}
