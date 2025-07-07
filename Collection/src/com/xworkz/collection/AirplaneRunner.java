package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class AirplaneRunner {
    public static void main(String[] args) {
        Collection collection = new ArrayList();

        // add
        collection.add("Boeing 747");
        collection.add("Jet Airways");
        collection.add(180); // Passenger capacity
        collection.add("Fuel: 183,380 L");
        collection.add("Range: 13,450 km");

        // length
        System.out.println(collection.size());
        System.out.println(collection);

        // remove
        collection.remove("Fuel: 183,380 L");
        System.out.println(collection);

        // contains
        System.out.println(collection.contains("Boeing 747"));

        // isEmpty
        System.out.println(collection.isEmpty());

        // clear
        collection.clear();
        System.out.println(collection);

        // isEmpty
        System.out.println(collection.isEmpty());
    }
}