package com.xworkz.simcardsystem.simcard;

import com.xworkz.simcardsystem.model.SimCardInfo;

public class SimCard {

    public SimCardInfo[] simCardInfos;

    public void displaySimCardInfo() {
        for (SimCardInfo simCard : simCardInfos) {
            System.out.println("----------------------------------------------------");
            System.out.println("Sim Card ID: " + simCard.getSimCardId());
            System.out.println("Brand: " + simCard.getBrand());
            System.out.println("Type: " + simCard.getType());
            System.out.println("Data Limit: " + simCard.getDataLimit() + " GB");
            System.out.println("Validity: " + simCard.getValidity() + " days");
            System.out.println("Price: " + simCard.getPrice());
            System.out.println("5G Supported: " + simCard.is5GSupported());
            System.out.println("Customer Care Number: " + simCard.getCustomerCareNumber());
            System.out.println("----------------------------------------------------");
        }
    }
}
