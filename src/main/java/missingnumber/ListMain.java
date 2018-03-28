package missingnumber;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class ListMain {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(6);
        integerList.add(9);
        integerList.add(10);
        int first = integerList.get(0);

        int last  = integerList.get(integerList.size()-1);
        for(int i=first+1; i<last; i++){
            if(!integerList.contains(i));
                //System.out.println("Number Not in List : "+i);
        }
        //striting
        List<Integer> missingList= new ArrayList<>();
        for (int j=0;j<10;j++){
            missingList.add(j);
        }
        missingList.remove(7);
        System.out.println(missingList);

        int find = missingList.get(0);

        int end = missingList.get(missingList.size()-1);
        IntStream.range(find + 1, end).filter(i -> !missingList.contains(i)).forEach(System.out::println);
        //end

        List<Integer>  list = new ArrayList<>();
        for (int i=0; i< 10; i++){
            list.add(i);
            //System.out.println(list);
        }
//        System.out.println(list);
//        list.remove(5);
//        System.out.println(list);

        ArrayList<Integer> A = new ArrayList<Integer>();
       // getMissingNo(A);
    }
    static void getMissingNo (ArrayList<Integer> list1)
    {
        for (int i=0; i< 10; i++){
            list1.add(i);
        }
        list1.remove(5);
        System.out.println(list1);

    }

}
