package com.xworkz.inputdevice.inputdevice;

public class InputDevice {

    public void validateInputDeviceDetails() {
        System.out.println("InputDevice: Used to input data to electronics.");
    }

    public void connect() {
        System.out.println("InputDevice: Connecting the input device...");
    }

    public void disconnect() {
        System.out.println("InputDevice: Disconnecting the input device...");
    }

    public String getType() {
        System.out.println("InputDevice: General input device.");
        return "Generic Device";
    }

    public void showStatus() {
        System.out.println("InputDevice: Device is operational.");
    }
}
