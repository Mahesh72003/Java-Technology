package com.xworkz.datastoragedevice.flashdrive;

import com.xworkz.datastoragedevice.datastoragedevice.DataStorageDevice;

public class FlashDrive extends DataStorageDevice {


    public void validateDeviceDetails() {
        System.out.println("Flash drive is a portable data storage device that connects via USB.");
    }

    public void flashDriveSpeed() {
        System.out.println("Speed: Flash drives typically offer speeds from 50 MB/s to 400 MB/s.");
    }

    public void flashDriveCapacity() {
        System.out.println("Capacity: Flash drives typically range from 4 GB to 1 TB.");
    }

    public void flashDriveFormFactor() {
        System.out.println("Form Factor: Compact and portable, typically about the size of a thumb.");
    }

    public void flashDriveEncryption() {
        System.out.println("Encryption: Some flash drives offer built-in encryption for security.");
    }

    public void flashDriveCompatibility() {
        System.out.println("Compatibility: Flash drives are compatible with most computers and operating systems.");
    }
}
