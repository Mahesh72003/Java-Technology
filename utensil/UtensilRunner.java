package com.xworkz.utensil;

import com.xworkz.utensil.spoon.Spoon;
import com.xworkz.utensil.utensil.Utensil;

public class UtensilRunner {
    public static void main(String[] args) {
        Utensil utensil = new Utensil();
        utensil.validateUtensilDetails();
        utensil.getUtensilInfo();
        Spoon spoon = new Spoon();
        spoon.validateUtensilDetails();
        spoon.getUtensilInfo();

    }
}
