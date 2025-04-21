package com.xworkz.device;

import com.xworkz.device.computer.Computer;
import com.xworkz.device.device.Device;

public class DeviceRunner {
    public static void main(String[] args) {


        Device device = new Device();
        device.validateDeviceDetails();
        device.getDeviceInfo();
        device.deviceCategory();
        device.powerSource();
        device.deviceSize();
        device.connectivity();
        device.deviceMaintenance();



        Computer computer = new Computer();
        computer.validateDeviceDetails();
        computer.getDeviceInfo();
        computer.deviceCategory();
        computer.powerSource();
        computer.deviceSize();
        computer.connectivity();
        computer.deviceMaintenance();
        computer.computerProcessor();
        computer.computerStorage();
        computer.computerMemory();
        computer.computerOperatingSystem();
        computer.computerPorts();



        Device polyComputer = new Computer();
        polyComputer.validateDeviceDetails();
        polyComputer.getDeviceInfo();
        polyComputer.deviceCategory();
        polyComputer.powerSource();
        polyComputer.deviceSize();
        polyComputer.connectivity();
        polyComputer.deviceMaintenance();
    }
}
