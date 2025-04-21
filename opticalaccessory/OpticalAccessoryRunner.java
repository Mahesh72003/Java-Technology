package com.xworkz.opticalaccessory;

import com.xworkz.opticalaccessory.cameralens.CameraLens;
import com.xworkz.opticalaccessory.opticalaccessory.OpticalAccessory;

public class OpticalAccessoryRunner {
    public static void main(String[] args) {


        OpticalAccessory opticalAccessory = new OpticalAccessory();
        opticalAccessory.validateAccessoryDetails();
        opticalAccessory.adjustFocus();
        opticalAccessory.zoomIn();
        opticalAccessory.zoomOut();
        opticalAccessory.cleanLens();


        OpticalAccessory ref = new CameraLens();
        ref.validateAccessoryDetails();
        ref.adjustFocus();
        ref.zoomIn();
        ref.zoomOut();
        ref.cleanLens();


        CameraLens cameraLens = new CameraLens();
        cameraLens.validateAccessoryDetails();
        cameraLens.adjustFocus();
        cameraLens.zoomIn();
        cameraLens.zoomOut();
        cameraLens.cleanLens();
        cameraLens.attachToCamera();
    }
}
