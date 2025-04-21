package com.xworkz.accessory.wallet;

import com.xworkz.accessory.accessory.Accessory;

public class Wallet extends Accessory {


    public void validateAccessoryDetails() {
        System.out.println("Wallet: Organizes and secures money, cards, and identity documents.");
    }

    public void walletSpecificFeature() {
        System.out.println("This wallet has RFID-blocking technology.");
    }

    public void numberOfCompartments() {
        System.out.println("This wallet has 5 compartments including a coin pocket.");
    }

    public void materialUsed() {
        System.out.println("Made of high-quality genuine leather.");
    }

    public void warrantyInfo() {
        System.out.println("Comes with a 1-year manufacturer warranty.");
    }

    public void madeIn() {
        System.out.println("This wallet is made in Italy.");
    }
}
