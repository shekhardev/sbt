package streamsexamples;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom","Cris","Allen","Sam");

        for(String name: names){
            if(!name.equals("Sam")){
                System.out.println(name);
            }
        }

        System.out.println("Functional Style.......");
        names.stream()
                .filter(Main::isNotSam)
                .forEach(System.out::println);
    }
    private static boolean isNotSam(String name){return !name.equals("Sam");}
}
