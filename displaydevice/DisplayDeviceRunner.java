package com.xworkz.displaydevice;

import com.xworkz.displaydevice.displaydevice.DisplayDevice;
import com.xworkz.displaydevice.tv.TV;

public class DisplayDeviceRunner {
    public static void main(String[] args) {
        DisplayDevice displayDevice = new DisplayDevice();
        displayDevice.validateDeviceDetails();
        displayDevice.displayType();
        displayDevice.resolution();
        displayDevice.screenSize();
        displayDevice.powerConsumption();
        displayDevice.inputOutputPorts();

        TV tv = new TV();
        tv.validateDeviceDetails();
        tv.displayType();
        tv.resolution();
        tv.screenSize();
        tv.powerConsumption();
        tv.inputOutputPorts();
        tv.tvType();
        tv.smartFeatures();
        tv.audioFeatures();
        tv.refreshRate();
        tv.connectivity();


        DisplayDevice myDisplay = new TV();
        myDisplay.validateDeviceDetails();
        myDisplay.displayType();
        myDisplay.resolution();
        myDisplay.screenSize();
        myDisplay.powerConsumption();
        myDisplay.inputOutputPorts();
    }
}
