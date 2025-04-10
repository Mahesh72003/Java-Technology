package com.xworkz.rubber;

import com.xworkz.rubber.rubber.Rubber;
import com.xworkz.rubber.shoes.Shoes;

public class RubberRunner {
    public static void main(String arg[])
    {
        Rubber rubber = new Rubber();
        rubber.validateRubberDetails();

        Shoes shoes = new Shoes();
        shoes.validateRubberDetails();
    }
}
