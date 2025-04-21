package com.xworkz.electronicdevice.electronicdevice;

public class ElectronicDevice {

    public void validateElectronicDeviceDetails() {
        System.out.println("It is an Electronic Device");
    }

    public void powerOn() {
        System.out.println("The electronic device is now powered on.");
    }

    public void powerOff() {
        System.out.println("The electronic device is now powered off.");
    }

    public void checkBatteryStatus() {
        System.out.println("The battery status is unknown for this device.");
    }

    public void connectToWiFi() {
        System.out.println("Connecting to WiFi...");
    }

    public void installApp() {
        System.out.println("Installing app on the electronic device...");
    }
}
