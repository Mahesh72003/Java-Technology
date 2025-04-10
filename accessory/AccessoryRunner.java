package com.xworkz.accessory;

import com.xworkz.accessory.accessory.Accessory;
import com.xworkz.accessory.wallet.Wallet;

public class AccessoryRunner {
    public static void main(String[] args) {
        Accessory accessory = new Accessory();
        accessory.validateAccessoryDetails();

        Wallet wallet = new Wallet();
        wallet.validateAccessoryDetails();
    }
}
