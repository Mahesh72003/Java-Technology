package com.xworkz.displaydevice;

import com.xworkz.displaydevice.displaydevice.DisplayDevice;
import com.xworkz.displaydevice.tv.TV;

public class DisplayDeviceRunner {
    public static void main(String[] args) {
        DisplayDevice displayDevice = new DisplayDevice();
        displayDevice.validateDeviceDetails();

        TV tv = new TV();
        tv.validateDeviceDetails();
    }
}
