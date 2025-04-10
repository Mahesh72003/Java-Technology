package com.xworkz.opticalaccessory;

import com.xworkz.opticalaccessory.opticalaccessory.OpticalAccessory;
import com.xworkz.opticalaccessory.cameralens.CameraLens;

public class OpticalAccessoryRunner {
    public static void main(String[] args) {
        OpticalAccessory opticalAccessory = new OpticalAccessory();
        opticalAccessory.validateAccessoryDetails();

        CameraLens cameraLens = new CameraLens();
        cameraLens.validateAccessoryDetails();
    }
}
