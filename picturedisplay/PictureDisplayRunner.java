package com.xworkz.picturedisplay;

import com.xworkz.picturedisplay.picturedisplay.PictureDisplay;
import com.xworkz.picturedisplay.photoframe.PhotoFrame;

public class PictureDisplayRunner {
    public static void main(String[] args) {


        PictureDisplay pictureDisplay = new PictureDisplay();
        pictureDisplay.validateDisplayDetails();
        pictureDisplay.adjustSize();
        pictureDisplay.setOrientation();
        pictureDisplay.hangOnWall();
        pictureDisplay.cleanFrame();


        PictureDisplay ref = new PhotoFrame();
        ref.validateDisplayDetails();
        ref.adjustSize();
        ref.setOrientation();
        ref.hangOnWall();
        ref.cleanFrame();


        PhotoFrame photoFrame = new PhotoFrame();
        photoFrame.validateDisplayDetails();
        photoFrame.adjustSize();
        photoFrame.setOrientation();
        photoFrame.hangOnWall();
        photoFrame.cleanFrame();
        photoFrame.addDecorativeElement();
    }
}
