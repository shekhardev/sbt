package missingnumber;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingRecord {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product(5, "Macbook"),
                new Product(6, "iPad"),
                new Product(7, "iPod"),
                new Product(8, "macair"),
                new Product(9, "iPhone"),
                new Product(10, "Black Berry"));

        Map<Integer, String> map = productList.stream().collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));

        System.out.println(map);

        List<String> arr = Arrays.asList("N3", "N7", "N4", "N5", "N2");
        IntSummaryStatistics statistics =
                arr.stream()
                        .mapToInt(s -> Integer.parseInt(s.substring(1)))
                        .summaryStatistics();

        long max = statistics.getMax();
        long min = statistics.getMin();

        long missing = max*(max+1)/2 - (min-1)*min/2 - statistics.getSum();
        System.out.println(missing);

//        Product first = productList.get(0);
//        Product last = productList.get(productList.size() - 1);


        Object[] objects = productList.toArray();

        // Printing array of objects
        for (Object obj : objects) {

            //System.out.print(obj + " ");
        }
        Map<Integer, String> maps = productList.stream().collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));
        map.remove(6);
        System.out.println("Map:- " + map);

        String first = map.get(0);
        String last =map.get(map.size()-1);


        for (int i = 0; i < productList.size(); i++) {
            Product aName = productList.get(i);
            //System.out.println(aName);
        }



//        for(Product i=first+1; i<last; i++){
//            if(!productList.contains(i))
//                System.out.println("Number Not in List : "+i);
//        }
//    public static void findNemo(List<Product> names) {
//
//        if(names.contains("Nemo"))
//            System.out.println("Found Nemo");
//        else
//            System.out.println("Sorry, Nemo not found");
//    }
    }

}
