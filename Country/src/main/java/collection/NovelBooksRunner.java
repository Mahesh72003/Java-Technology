package collection;

import java.util.ArrayList;
import java.util.Collection;

public class NovelBooksRunner {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        //add
        collection.add(9359858);
        collection.add("English");
        collection.add("Sherlock Holmes");
        collection.add("Conan Doyle’s");
        collection.add("200 g");

        //length
        System.out.println(collection.size());
        System.out.println(collection);
        //remove
        collection.remove("200 g");
        System.out.println(collection);
        //contains
        System.out.println(collection.contains(9359858));
        //isEmpty
        System.out.println(collection.isEmpty());
        //clear
        collection.clear();
        System.out.println(collection);
        //isEmpty
        System.out.println(collection.isEmpty());

    }
}
