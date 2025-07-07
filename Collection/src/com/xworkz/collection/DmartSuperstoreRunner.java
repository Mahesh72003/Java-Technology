package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;

public class DmartSuperstoreRunner {
    public static void main(String[] args) {
        Collection collection = new ArrayList();

        // add
        collection.add("D-Mart");
        collection.add("Bangalore");
        collection.add("Groceries");
        collection.add("Electronics");
        collection.add(500);
        collection.add("9 AM");


        // length
        System.out.println(collection.size());
        System.out.println(collection);

        // remove
        collection.remove("9 AM");
        System.out.println(collection);

        // contains
        System.out.println(collection.contains("Electronics"));

        // isEmpty
        System.out.println(collection.isEmpty());

        // clear
        collection.clear();
        System.out.println(collection);

        // isEmpty
        System.out.println(collection.isEmpty());
    }
}
