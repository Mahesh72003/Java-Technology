package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

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

        System.out.println(collection);

        Collection collection1 = new HashSet();

        // add
        collection1.add("D-Mart");
        collection1.add("Bangalore");
        collection1.add("Groceries");
        collection1.add("Electronics");
        collection1.add("Electronics");
        collection1.add(500);
        collection1.add("9 AM");

        System.out.println(collection1);


        Collection collection2 = new TreeSet();

        // add
        collection2.add("D-Mart");
        collection2.add("Bangalore");
        collection2.add("Groceries");
        collection2.add("Electronics");

        collection2.add("500");
        collection2.add("9 AM");

        System.out.println(collection2);
        System.out.println("567".hashCode());

          // length
//        System.out.println(collection.size());
//        System.out.println(collection);
//
//        // remove
//        collection.remove("9 AM");
//        System.out.println(collection);
//
//        // contains
//        System.out.println(collection.contains("Electronics"));
//
//        // isEmpty
//        System.out.println(collection.isEmpty());
//
//        // clear
//        collection.clear();
//        System.out.println(collection);
//
//        // isEmpty
//        System.out.println(collection.isEmpty());
    }
}
