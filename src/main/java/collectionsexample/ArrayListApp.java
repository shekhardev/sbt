package collectionsexample;

import java.util.ArrayList;

public class ArrayListApp {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        System.out.println(numbers.get(0));
        System.out.println("****************");
        for (int i=0;i < numbers.size();i++){
            System.out.println( numbers.get(i));
        }
        System.out.println("**222222222********");
        for (Integer number:numbers){
            System.out.println(number);
        }
        System.out.println("333333333333333");
        numbers.stream()
                .forEach(System.out::println);
    }
}
