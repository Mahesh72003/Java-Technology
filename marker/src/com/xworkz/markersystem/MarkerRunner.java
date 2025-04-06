package com.xworkz.markersystem;

import com.xworkz.markersystem.marker.Marker;
import com.xworkz.markersystem.model.MarkerModel;

public class MarkerRunner {
    public static void main(String[] args) {
        MarkerModel[] markerModels = new MarkerModel[5];

        MarkerModel marker1 = new MarkerModel();
        marker1.setMarkerId(1);
        marker1.setBrand("Camlin");
        marker1.setColor("Red");
        marker1.setType("Whiteboard Marker");
        marker1.setPrice(25.50);   
        marker1.setInkType("Alcohol-based");
        marker1.setTipType("Bullet Tip");
        markerModels[0] = marker1;

        MarkerModel marker2 = new MarkerModel();
        marker2.setMarkerId(2);
        marker2.setBrand("Faber-Castell");
        marker2.setColor("Blue");
        marker2.setType("Permanent Marker");
        marker2.setPrice(45.75);   
        marker2.setInkType("Solvent-based");
        marker2.setTipType("Chisel Tip");
        markerModels[1] = marker2;

        MarkerModel marker3 = new MarkerModel();
        marker3.setMarkerId(3);
        marker3.setBrand("Luxor");
        marker3.setColor("Green");
        marker3.setType("Highlighter");
        marker3.setPrice(35.25);   
        marker3.setInkType("Water-based");
        marker3.setTipType("Broad Tip");
        markerModels[2] = marker3;

        MarkerModel marker4 = new MarkerModel();
        marker4.setMarkerId(4);
        marker4.setBrand("Pilot");
        marker4.setColor("Black");
        marker4.setType("Permanent Marker");
        marker4.setPrice(30.50);   
        marker4.setInkType("Oil-based");
        marker4.setTipType("Fine Tip");
        markerModels[3] = marker4;

        MarkerModel marker5 = new MarkerModel();
        marker5.setMarkerId(5);
        marker5.setBrand("Sharpie");
        marker5.setColor("Purple");
        marker5.setType("Whiteboard Marker");
        marker5.setPrice(40.00);   
        marker5.setInkType("Alcohol-based");
        marker5.setTipType("Fine Tip");
        markerModels[4] = marker5;

        Marker marker = new Marker();
        marker.markerModels = markerModels;
        marker.displayMarkerInfo();
    }
}
