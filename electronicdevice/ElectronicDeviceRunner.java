package com.xworkz.electronicdevice;

import com.xworkz.electronicdevice.electronicdevice.ElectronicDevice;
import com.xworkz.electronicdevice.laptop.Laptop;

public class ElectronicDeviceRunner {
    public static void main(String[] args) {
        ElectronicDevice electronicDevice = new ElectronicDevice();
        electronicDevice.validateElectronicDeviceDetails();
        electronicDevice.powerOn();
        electronicDevice.powerOff();
        electronicDevice.checkBatteryStatus();
        electronicDevice.connectToWiFi();
        electronicDevice.installApp();

        Laptop laptop = new Laptop();
        laptop.validateElectronicDeviceDetails();
        laptop.powerOn();
        laptop.powerOff();
        laptop.checkBatteryStatus();
        laptop.connectToWiFi();
        laptop.installApp();
        laptop.laptopSpecificFeature();

        ElectronicDevice myDevice = new Laptop();
        myDevice.validateElectronicDeviceDetails();
        myDevice.powerOn();
        myDevice.powerOff();
        myDevice.checkBatteryStatus();
        myDevice.connectToWiFi();
        myDevice.installApp();
    }
}
