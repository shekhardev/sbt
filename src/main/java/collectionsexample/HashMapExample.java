package collectionsexample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(2,"one");
        map.put(1,"two");
        map.put(3,"four");
        map.put(4,"Five");

        String text = map.get(3);

        System.out.println(text);
        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+ " " + m.getValue());
        }
    }
}
