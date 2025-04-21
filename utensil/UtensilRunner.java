package com.xworkz.utensil;

import com.xworkz.utensil.spoon.Spoon;
import com.xworkz.utensil.utensil.Utensil;

public class UtensilRunner {
    public static void main(String[] args) {


        Utensil utensil = new Utensil();
        utensil.validateUtensilDetails();
        utensil.getUtensilInfo();
        utensil.purpose();
        utensil.careInstructions();
        utensil.durability();


        Spoon spoon = new Spoon();
        spoon.validateUtensilDetails();
        spoon.getUtensilInfo();
        spoon.spoonType();
        spoon.spoonSize();
        spoon.usage();
        spoon.material();


        Utensil polymorphicUtensil = new Spoon();
        polymorphicUtensil.validateUtensilDetails();
        polymorphicUtensil.getUtensilInfo();
        polymorphicUtensil.purpose();
        polymorphicUtensil.careInstructions();
        polymorphicUtensil.durability();
    }
}
