package functionaljava8;

import java.util.Arrays;
import java.util.List;

public class DoubleEven {
    public static void main(String[] args) {
        //find the double of the first even number greate than 3
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //Imparative Style
        int result =0;
        for (int e:values){
            if (e>=3 && e % 2 ==0){
                result = e *2;
                break;
            }
        }
        System.out.println(result);
        //Declarative style
        System.out.println(
        values.stream()
                .filter(e->e>3).filter(e->e%2 ==0)
                .map(e->e * 2)
                .findFirst());
    }
}
