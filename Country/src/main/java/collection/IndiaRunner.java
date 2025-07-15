package collection;

import java.util.ArrayList;
import java.util.Collection;

public class IndiaRunner {
    public static void main(String[] args) {
        Collection collection = new ArrayList();

        // add
        collection.add("India");
        collection.add("New Delhi");
        collection.add("Hindi");
        collection.add(1400000000L);
        collection.add("Republic Day - Jan 26");

        // length
        System.out.println(collection.size());
        System.out.println(collection);

        // remove
        collection.remove("Republic Day - Jan 26");
        System.out.println(collection);

        // contains
        System.out.println(collection.contains("Hindi"));

        // isEmpty
        System.out.println(collection.isEmpty());

        // clear
        collection.clear();
        System.out.println(collection);

        // isEmpty
        System.out.println(collection.isEmpty());
    }
}
