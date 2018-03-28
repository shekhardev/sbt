package collectionsexample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTimeExample {
    public static void main(String[] args) {
        List<Integer> arrayList= new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        doTimings("ArrayList",arrayList);
        doTimings("LinkedList",linkedList);
    }
    private static void doTimings(String type, List<Integer> list){
        for(int i=0; i<1E5 ; i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();

        for(int i=0; i< 1E5; i++){
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time Taken "+ (end - start) + " ms for  " +type);

    }
}
