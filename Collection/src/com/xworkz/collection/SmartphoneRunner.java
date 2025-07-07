package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class SmartphoneRunner {
    public static void main(String[] args) {
        Collection collection = new ArrayList();

        // add
        collection.add("Samsung Galaxy S24");
        collection.add("Android");
        collection.add(256);
        collection.add(8);
        collection.add("Phantom Black");

        // length
        System.out.println(collection.size());
        System.out.println(collection);

        // remove
        collection.remove("Phantom Black");
        System.out.println(collection);

        // contains
        System.out.println(collection.contains("Android"));

        // isEmpty
        System.out.println(collection.isEmpty());

        // clear
        collection.clear();
        System.out.println(collection);

        // isEmpty
        System.out.println(collection.isEmpty());
    }
}
