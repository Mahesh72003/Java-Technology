package com.xworkz.steelsystem.material;

public class Material
{
    private int SteelId;
    private String BrandName;
    private String grade;
    private double height;
    private double length;
    private double width;
    private boolean isUsableFood;

    public int getSteelId() {
        return SteelId;
    }

    public void setSteelId(int steelId) {
        SteelId = steelId;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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

    public void setsUsableFood(boolean usableFood) {
        isUsableFood = usableFood;
    }

    public boolean getisUsableFood() {
        return isUsableFood;
    }

}
