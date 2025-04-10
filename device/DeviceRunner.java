package com.xworkz.device;

import com.xworkz.device.computer.Computer;
import com.xworkz.device.device.Device;

public class DeviceRunner {
    public static void main(String[] args) {
        Device device = new Device();
        device.validateDeviceDetails();
        device.getDeviceInfo();

        Computer computer = new Computer();
        computer.validateDeviceDetails();
        computer.getDeviceInfo();
    }
}
