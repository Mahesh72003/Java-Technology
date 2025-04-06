package com.xworkz.chalksystem.chalk;

import com.xworkz.chalksystem.model.ChalkInfo;

public class Chalk {

    public ChalkInfo[] chalkInfos;

    public void displayChalkInfo() {
        for (ChalkInfo chalk : chalkInfos) {
            System.out.println("----------------------------------------------------");
            System.out.println("Chalk ID: " + chalk.getChalkId());
            System.out.println("Brand: " + chalk.getBrand());
            System.out.println("Color: " + chalk.getColor());
            System.out.println("Length: " + chalk.getLength() + " cm");
            System.out.println("Width: " + chalk.getWidth() + " cm");
            System.out.println("Weight: " + chalk.getWeight() + " grams");
            System.out.println("Dustless: " + chalk.isDustless());
            System.out.println("----------------------------------------------------");
        }
    }
}
