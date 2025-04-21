package com.xworkz.accessory;

import com.xworkz.accessory.accessory.Accessory;
import com.xworkz.accessory.wallet.Wallet;

public class AccessoryRunner {
    public static void main(String[] args) {

        Accessory accessory = new Accessory();
        accessory.validateAccessoryDetails();
        accessory.showMaterial();
        accessory.showPurpose();
        accessory.brandInfo();
        accessory.priceRange();
        accessory.availableColors();


        Wallet wallet = new Wallet();
        wallet.validateAccessoryDetails();
        wallet.walletSpecificFeature();
        wallet.numberOfCompartments();
        wallet.materialUsed();
        wallet.warrantyInfo();
        wallet.madeIn();


        Accessory polyWallet = new Wallet();
        polyWallet.validateAccessoryDetails();
        polyWallet.showMaterial();
        polyWallet.showPurpose();
        polyWallet.brandInfo();
        polyWallet.priceRange();
        polyWallet.availableColors();
    }
}
