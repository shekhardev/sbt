package lambaexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StrategyPattern {

    public static int totalValues(List<Integer> values,
        Predicate<Integer> selector){
        /*int result =0;
        for(int e: values){
            if (selector.test(e))
            result += e;
        }
        return result;
        */

        // Functional Style
        return values.stream()
                .filter(selector)
                .reduce(0,Integer::sum);

    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,20,25,30);

        System.out.println(totalValues(numbers,e->true));
        System.out.println(totalValues(numbers,e->e % 2 ==0));
        System.out.println(totalValues(numbers,e->e % 2 !=0));
    }
}
