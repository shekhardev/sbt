package streamsexamples;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PrimeNumber {

    public static List<Integer> generate(int series) {
        Set<Integer> set = new TreeSet<>();
        return Stream.iterate(2, i -> ++i)
                .filter(i -> i %2 != 0)
                .filter(i -> {
                    set.add(i);
                    return 0 == set.stream()
                            .filter(p -> p != 1)
                            .filter(p -> !Objects.equals(p, i))
                            .filter(p -> i % p == 0)
                            .count();
                })
                .limit(series)
                .collect(toList());
    }
    public static void main(String[] args) {
        List<Integer> generate = PrimeNumber.generate(10);
        System.out.println(generate);
    }
}
