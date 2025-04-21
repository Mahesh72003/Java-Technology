package com.xworkz.leather;

import com.xworkz.leather.jacket.Jacket;
import com.xworkz.leather.leather.Leather;

public class LeatherRunner {
    public static void main(String[] args) {


        Leather leather = new Leather();
        leather.validateLeatherDetails();
        leather.polish();
        leather.bendTest();
        leather.checkQuality();
        leather.measureThickness();


        Leather leatherRef = new Jacket();
        leatherRef.validateLeatherDetails();
        leatherRef.polish();
        leatherRef.bendTest();
        leatherRef.checkQuality();
        leatherRef.measureThickness();


        Jacket jacket = new Jacket();
        jacket.validateLeatherDetails();
        jacket.polish();
        jacket.bendTest();
        jacket.checkQuality();
        jacket.measureThickness();
        jacket.wear();
    }
}
