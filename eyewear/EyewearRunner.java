package com.xworkz.eyewear;

import com.xworkz.eyewear.eyewear.Eyewear;
import com.xworkz.eyewear.sunglasses.Sunglasses;

public class EyewearRunner {
    public static void main(String[] args) {
        Eyewear eyewear = new Eyewear();
        eyewear.validateEyewearDetails();

        Sunglasses sunglasses = new Sunglasses();
        sunglasses.validateEyewearDetails();
    }
}
