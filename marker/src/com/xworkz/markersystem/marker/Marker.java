package com.xworkz.markersystem.marker;

import com.xworkz.markersystem.model.MarkerModel;

public class Marker {

    public MarkerModel[] markerModels;

    public void displayMarkerInfo() {
        for (MarkerModel marker : markerModels) {
            System.out.println("----------------------------------------------------");
            System.out.println("The Marker ID is: " + marker.getMarkerId());
            System.out.println("The Marker Brand is: " + marker.getBrand());
            System.out.println("The Marker Color is: " + marker.getColor());
            System.out.println("The Marker Type is: " + marker.getType());
            System.out.println("The Marker Price is: " + marker.getPrice());
            System.out.println("The Marker Ink Type is: " + marker.getInkType());
            System.out.println("The Marker Tip Type is: " + marker.getTipType());
            System.out.println("----------------------------------------------------");
        }
    }
}
