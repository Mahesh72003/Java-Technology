package com.xworkz.datastoragedevice;

import com.xworkz.datastoragedevice.datastoragedevice.DataStorageDevice;
import com.xworkz.datastoragedevice.flashdrive.FlashDrive;

public class DataStorageDeviceRunner {
    public static void main(String[] args) {

        DataStorageDevice dataStorageDevice = new DataStorageDevice();
        dataStorageDevice.validateDeviceDetails();
        dataStorageDevice.deviceType();
        dataStorageDevice.deviceCapacity();
        dataStorageDevice.deviceSpeed();
        dataStorageDevice.deviceConnectivity();
        dataStorageDevice.deviceDurability();


        FlashDrive flashDrive = new FlashDrive();
        flashDrive.validateDeviceDetails();
        flashDrive.deviceType();
        flashDrive.deviceCapacity();
        flashDrive.deviceSpeed();
        flashDrive.deviceConnectivity();
        flashDrive.deviceDurability();
        flashDrive.flashDriveSpeed();
        flashDrive.flashDriveCapacity();
        flashDrive.flashDriveFormFactor();
        flashDrive.flashDriveEncryption();
        flashDrive.flashDriveCompatibility();


        DataStorageDevice polyFlashDrive = new FlashDrive();
        polyFlashDrive.validateDeviceDetails();
        polyFlashDrive.deviceType();
        polyFlashDrive.deviceCapacity();
        polyFlashDrive.deviceSpeed();
        polyFlashDrive.deviceConnectivity();
        polyFlashDrive.deviceDurability();
    }
}
