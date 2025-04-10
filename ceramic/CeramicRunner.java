package com.xworkz.ceramic;

import com.xworkz.ceramic.ceramic.Ceramic;
import com.xworkz.ceramic.mug.Mug;

public class CeramicRunner {
    public static void main(String[] args) {
        Ceramic ceramic = new Ceramic();
        ceramic.validateCeramicDetails();
        Mug mug = new Mug();
        mug.validateCeramicDetails();
    }
}
