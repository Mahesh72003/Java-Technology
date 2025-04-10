package com.xworkz.inputdevice;

import com.xworkz.inputdevice.inputdevice.InputDevice;
import com.xworkz.inputdevice.keyboard.Keyboard;

public class InputDeviceRunner {
    public static void main(String any[])
    {
        InputDevice inputDevice = new InputDevice();
        inputDevice.validateInputDeviceDetails();;

        Keyboard keyboard = new Keyboard();
        keyboard.validateInputDeviceDetails();

    }
}
