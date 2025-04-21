package com.xworkz.utensil.spoon;

import com.xworkz.utensil.utensil.Utensil;

public class Spoon extends Utensil {

    @Override
    public void validateUtensilDetails() {
        System.out.println("Spoon: A utensil used for eating, stirring, or serving food.");
    }

    public void spoonType() {
        System.out.println("This is a stainless steel spoon.");
    }

    public void spoonSize() {
        System.out.println("The spoon has a medium size, ideal for soups and desserts.");
    }

    public void usage() {
        System.out.println("Spoons are commonly used for scooping, stirring, and eating liquids.");
    }

    public void material() {
        System.out.println("This spoon is made of high-quality stainless steel for durability.");
    }
}
