package com.xworkz.audiodevice.speaker;

import com.xworkz.audiodevice.audiodevice.AudioDevice;

public class Speaker extends AudioDevice {


    public void validateAudioDeviceDetails() {
        System.out.println("Speaker is an output device that converts electrical signals into sound.");
    }

    public void speakerType() {
        System.out.println("Speaker Type: Portable Bluetooth Speaker");
    }

    public void soundOutput() {
        System.out.println("Sound Output: 20W RMS");
    }

    public void batteryBackup() {
        System.out.println("Battery Backup: 10 hours");
    }

    public void waterproofRating() {
        System.out.println("Waterproof Rating: IPX7");
    }

    public void hasMicSupport() {
        System.out.println("Mic Support: Yes, built-in microphone for calls.");
    }
}
