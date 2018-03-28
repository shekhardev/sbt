package lambaexample;

import java.util.Arrays;
import java.util.List;

public class Conditional {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,5,4,6,7,8);

        System.out.println(
                numbers.stream()
                    .filter(e->e > 3)
                    .filter(e -> e %2 ==0)
                    .map(e->e *2)
                    .findFirst()
        );
    }
}
