package com.xworkz.eyewear;

import com.xworkz.eyewear.eyewear.Eyewear;
import com.xworkz.eyewear.sunglasses.Sunglasses;

public class EyewearRunner {
    public static void main(String[] args) {
        Eyewear eyewear = new Eyewear();
        eyewear.validateEyewearDetails();
        eyewear.material();
        eyewear.purpose();
        eyewear.frameType();
        eyewear.maintenance();

        Sunglasses sunglasses = new Sunglasses();
        sunglasses.validateEyewearDetails();
        sunglasses.material();
        sunglasses.purpose();
        sunglasses.frameType();
        sunglasses.maintenance();
        sunglasses.lensType();
        sunglasses.uvProtection();
        sunglasses.style();
        sunglasses.storage();

        Eyewear myEyewear = new Sunglasses();
        myEyewear.validateEyewearDetails();
        myEyewear.material();
        myEyewear.purpose();
        myEyewear.frameType();
        myEyewear.maintenance();
    }
}
