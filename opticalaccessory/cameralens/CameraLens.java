package com.xworkz.opticalaccessory.cameralens;

import com.xworkz.opticalaccessory.opticalaccessory.OpticalAccessory;

public class CameraLens extends OpticalAccessory {

    public void validateAccessoryDetails() {
        System.out.println("CameraLens: A lens designed for use with cameras to improve image quality by focusing light onto the sensor.");
    }

    public void adjustFocus() {
        System.out.println("CameraLens: Adjusting the lens to focus on the subject.");
    }

    public void zoomIn() {
        System.out.println("CameraLens: Zooming in for a close-up shot.");
    }

    public void zoomOut() {
        System.out.println("CameraLens: Zooming out for a broader perspective.");
    }

    public void cleanLens() {
        System.out.println("CameraLens: Cleaning the lens to remove smudges for better clarity.");
    }

    public void attachToCamera() {
        System.out.println("CameraLens: Attaching the lens to the camera body.");
    }
}
