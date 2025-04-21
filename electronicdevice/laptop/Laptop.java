package com.xworkz.electronicdevice.laptop;

import com.xworkz.electronicdevice.electronicdevice.ElectronicDevice;

public class Laptop extends ElectronicDevice {

          
    public void validateElectronicDeviceDetails() {
        System.out.println("It is a Laptop, a type of Electronic Device");
    }

          
    public void powerOn() {
        System.out.println("The Laptop is now powered on.");
    }

          
    public void powerOff() {
        System.out.println("The Laptop is now powered off.");
    }

          
    public void checkBatteryStatus() {
        System.out.println("The Laptop battery is at 85%.");
    }

          
    public void connectToWiFi() {
        System.out.println("Laptop is connecting to WiFi...");
    }

          
    public void installApp() {
        System.out.println("Installing application on the Laptop...");
    }

    public void laptopSpecificFeature() {
        System.out.println("Laptop-specific feature: Using a touchpad for navigation.");
    }
}
