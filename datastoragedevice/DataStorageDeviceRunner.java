package com.xworkz.datastoragedevice;

import com.xworkz.datastoragedevice.datastoragedevice.DataStorageDevice;
import com.xworkz.datastoragedevice.flashdrive.FlashDrive;

public class DataStorageDeviceRunner {
    public static void main(String[] args) {
        DataStorageDevice dataStorageDevice = new DataStorageDevice();
        dataStorageDevice.validateDeviceDetails();

        FlashDrive flashDrive = new FlashDrive();
        flashDrive.validateDeviceDetails();
    }
}
