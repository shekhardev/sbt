package streamsexamples;

import io.reactivex.Observable;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom","Cris","Allen","Sam");

        for(String name: names){
            if(!name.equals("Sam")){
                System.out.println(name);
            }
        }
        System.out.println("----------------------------------------------------------\n");

        List<Customer> customers= Arrays.asList(new Customer(101,"Sekhar",16),
                new Customer(102,"Sekhar",16),
                new Customer(103,"Sekhar",16),
                new Customer(104,"Sekhar",16),
                new Customer(104,"Sekhar",16));

        List<Customer> result =
                customers.stream()
                        .filter(p->(p.getId()) %2 == 0)
                        .collect(Collectors.toList());
        System.out.println(result);

        //distinct
        System.out.println("**********************************************\n");
//        Stream<Customer> diststream = customers.stream().distinct();
//        diststream.forEach(System.out::print);

        System.out.println(customers.stream().map(x-> x.getId()).distinct().collect(Collectors.toList()));

        customers.stream().distinct().collect(Collectors.toList());

        System.out.println("********************************************\n");
        System.out.println("----------------------------------------------------------");
        System.out.println("Functional Style.......");
        names.stream()
                .filter(Main::isNotSam)
                .forEach(System.out::println);
    }
    private static boolean isNotSam(String name){return !name.equals("Sam");}
}

