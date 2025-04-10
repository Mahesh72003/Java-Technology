package com.xworkz.electronicdevice;

import com.xworkz.electronicdevice.electronicdevice.ElectronicDevice;
import com.xworkz.electronicdevice.laptop.Laptop;

public class ElectronicDeviceRunner {
    public static void main(String any[]){
        ElectronicDevice electronicDevice = new ElectronicDevice();
        electronicDevice.validateElectronicDeviceDetails();

        Laptop laptop = new Laptop();
        laptop.validateElectronicDeviceDetails();
    }
}
