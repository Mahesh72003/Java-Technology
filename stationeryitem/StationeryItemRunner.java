package com.xworkz.stationeryitem;

import com.xworkz.stationeryitem.stationeryitem.StationeryItem;
import com.xworkz.stationeryitem.paperclip.Paperclip;

public class StationeryItemRunner {
    public static void main(String[] args) {
        StationeryItem stationeryItem = new StationeryItem();
        stationeryItem.validateItemDetails();

        Paperclip paperclip = new Paperclip();
        paperclip.validateItemDetails();
    }
}
