package lambaexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SampleExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

//        //external iterator
//        for (int i=0; i< numbers.size();i++){
//            System.out.println(numbers.get(i));
//        }
//        //external iterator
//        for (int e: numbers){
//            System.out.println(numbers.get(e));
//        }
        //Internal iterator
      /*  numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        }); */
    numbers.forEach((Integer value ) -> System.out.println(value));
    //same as
        numbers.forEach(System.out::println);
    }
}
