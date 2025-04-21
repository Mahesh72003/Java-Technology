package com.xworkz.audiodevice;

import com.xworkz.audiodevice.audiodevice.AudioDevice;
import com.xworkz.audiodevice.speaker.Speaker;

public class AudioDeviceRunner {
    public static void main(String[] args) {

        AudioDevice device = new AudioDevice();
        device.validateAudioDeviceDetails();
        device.deviceBrand();
        device.powerSource();
        device.connectivityOptions();
        device.supportedFormats();
        device.deviceType();


        Speaker speaker = new Speaker();
        speaker.validateAudioDeviceDetails();
        speaker.deviceBrand();
        speaker.powerSource();
        speaker.connectivityOptions();
        speaker.supportedFormats();
        speaker.deviceType();
        speaker.speakerType();
        speaker.soundOutput();
        speaker.batteryBackup();
        speaker.waterproofRating();
        speaker.hasMicSupport();


        AudioDevice polySpeaker = new Speaker();
        polySpeaker.validateAudioDeviceDetails();
        polySpeaker.deviceBrand();
        polySpeaker.powerSource();
        polySpeaker.connectivityOptions();
        polySpeaker.supportedFormats();
        polySpeaker.deviceType();
    }
}
