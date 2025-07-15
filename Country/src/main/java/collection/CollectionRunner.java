package collection;

import java.util.ArrayList;
import java.util.Collection;


public class CollectionRunner {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add("mahesh");
        collection.add(true);
        collection.add('A');
        collection.add('V');
        System.out.println(collection);
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        collection.remove("mahesh");
        System.out.println(collection);
        collection.clear();
        System.out.println(collection);
        System.out.println(collection.isEmpty());

    }

}
