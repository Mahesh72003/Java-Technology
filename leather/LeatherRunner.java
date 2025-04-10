package com.xworkz.leather;

import com.xworkz.leather.jacket.Jacket;
import com.xworkz.leather.leather.Leather;

public class LeatherRunner {
    public static void main(String[] args) {
        Leather leather = new Leather();
        leather.validateLeatherDetails();

        Jacket jacket = new Jacket();
        jacket.validateLeatherDetails();

    }
}
