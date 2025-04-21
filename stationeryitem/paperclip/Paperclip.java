package com.xworkz.stationeryitem.paperclip;

import com.xworkz.stationeryitem.stationeryitem.StationeryItem;

public class Paperclip extends StationeryItem {
    public void validateItemDetails() {
        System.out.println("A paperclip is used to hold papers together.");
    }

    public void describeMaterial() {
        System.out.println("Paperclips are typically made of metal.");
    }

    public void provideUses() {
        System.out.println("Paperclips are used to organize paper documents.");
    }

    public void provideSizeDetails() {
        System.out.println("A standard paperclip is 1 inch in length.");
    }

    public void provideHistory() {
        System.out.println("The paperclip was invented in the 19th century.");
    }
}
