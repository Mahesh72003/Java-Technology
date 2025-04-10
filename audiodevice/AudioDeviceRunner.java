package com.xworkz.audiodevice;

import com.xworkz.audiodevice.audiodevice.AudioDevice;
import com.xworkz.audiodevice.speaker.Speaker;

public class AudioDeviceRunner {
    public static void main(String[] args) {
        AudioDevice device = new AudioDevice();
        device.validateAudioDeviceDetails();

        Speaker speaker = new Speaker();
        speaker.validateAudioDeviceDetails();
    }
}
