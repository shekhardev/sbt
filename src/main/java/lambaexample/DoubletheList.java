package lambaexample;

import java.util.Arrays;
import java.util.List;

public class DoubletheList {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4);

        int result =0;
        for(int e: numbers){
            result += e*2;

        }
        System.out.println(result);

        System.out.println(
                numbers.stream()
                .map(e-> e *2)
                .reduce(0,(c,e)->c+e)
        );
    }
}
