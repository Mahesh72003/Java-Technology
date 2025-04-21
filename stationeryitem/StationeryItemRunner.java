package com.xworkz.stationeryitem;

import com.xworkz.stationeryitem.stationeryitem.StationeryItem;
import com.xworkz.stationeryitem.paperclip.Paperclip;

public class StationeryItemRunner {
    public static void main(String[] args) {
        StationeryItem item = new StationeryItem();
        item.validateItemDetails();
        item.describeMaterial();
        item.provideSizeDetails();
        item.provideUses();
        item.provideHistory();

        StationeryItem clipAsParent = new Paperclip();
        clipAsParent.validateItemDetails();
        clipAsParent.describeMaterial();
        clipAsParent.provideSizeDetails();
        clipAsParent.provideUses();
        clipAsParent.provideHistory();

        Paperclip clipAsChild = new Paperclip();
        clipAsChild.validateItemDetails();
        clipAsChild.describeMaterial();
        clipAsChild.provideSizeDetails();
        clipAsChild.provideUses();
        clipAsChild.provideHistory();
    }
}
