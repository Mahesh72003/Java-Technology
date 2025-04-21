package com.xworkz.inputdevice;

import com.xworkz.inputdevice.inputdevice.InputDevice;
import com.xworkz.inputdevice.keyboard.Keyboard;

public class InputDeviceRunner {
    public static void main(String[] args) {


        InputDevice inputDevice = new InputDevice();
        inputDevice.validateInputDeviceDetails();
        inputDevice.connect();
        inputDevice.disconnect();
        inputDevice.getType();
        inputDevice.showStatus();


        InputDevice inputRef = new Keyboard();
        inputRef.validateInputDeviceDetails();
        inputRef.connect();
        inputRef.disconnect();
        inputRef.getType();
        inputRef.showStatus();


        Keyboard keyboard = new Keyboard();
        keyboard.validateInputDeviceDetails();
        keyboard.connect();
        keyboard.disconnect();
        keyboard.getType();
        keyboard.showStatus();
    }
}
