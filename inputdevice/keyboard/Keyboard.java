package com.xworkz.inputdevice.keyboard;

import com.xworkz.inputdevice.inputdevice.InputDevice;

public class Keyboard extends InputDevice {

     
    public void validateInputDeviceDetails() {
        System.out.println("Keyboard: Validating keyboard input.");
    }

     
    public void connect() {
        System.out.println("Keyboard: Keyboard connected via USB.");
    }

     
    public void disconnect() {
        System.out.println("Keyboard: Keyboard disconnected safely.");
    }

     
    public String getType() {
        System.out.println("Keyboard: This is a mechanical keyboard.");
        return "Mechanical Keyboard";
    }

     
    public void showStatus() {
        System.out.println("Keyboard: All keys are functional.");
    }

    public void pressKey(char key) {
        System.out.println("Keyboard: Key '" + key + "' pressed.");
    }
}
