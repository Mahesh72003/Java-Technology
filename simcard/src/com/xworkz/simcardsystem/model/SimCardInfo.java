package com.xworkz.simcardsystem.model;

public class SimCardInfo {
    private int simCardId;
    private String brand;
    private String type;
    private double dataLimit;
    private int validity;
    private double price;
    private boolean is5GSupported;
    private String customerCareNumber;

    public int getSimCardId() {
        return simCardId;
    }

    public void setSimCardId(int simCardId) {
        this.simCardId = simCardId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDataLimit() {
        return dataLimit;
    }

    public void setDataLimit(double dataLimit) {
        this.dataLimit = dataLimit;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean is5GSupported() {
        return is5GSupported;
    }

    public void setIs5GSupported(boolean is5GSupported) {
        this.is5GSupported = is5GSupported;
    }

    public String getCustomerCareNumber() {
        return customerCareNumber;
    }

    public void setCustomerCareNumber(String customerCareNumber) {
        this.customerCareNumber = customerCareNumber;
    }
}
