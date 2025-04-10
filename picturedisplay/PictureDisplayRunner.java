package com.xworkz.picturedisplay;

import com.xworkz.picturedisplay.picturedisplay.PictureDisplay;
import com.xworkz.picturedisplay.photoframe.PhotoFrame;

public class PictureDisplayRunner {
    public static void main(String[] args) {
        PictureDisplay pictureDisplay = new PictureDisplay();
        pictureDisplay.validateDisplayDetails();

        PhotoFrame photoFrame = new PhotoFrame();
        photoFrame.validateDisplayDetails();
    }
}
