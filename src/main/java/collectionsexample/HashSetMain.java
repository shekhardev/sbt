package collectionsexample;

import java.util.*;

public class HashSetMain {
    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
        System.out.println(listNumbers);
        Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);

        System.out.println(uniqueNumbers);

        // create hash map
        HashMap newmap = new HashMap();

        // populate hash map
        newmap.put(1, "tutorials");
        newmap.put(2, "point");
        newmap.put(3, "is best");

        System.out.println("Initial map elements: " + newmap);

        // clear hash map
        newmap.clear();

        System.out.println("Map elements after clear: " + newmap);


    }
}
