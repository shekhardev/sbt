package streamsexamples;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class TutMain {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered =strings.stream().filter(p->!p.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);

        Random random = new Random();
        random.ints().limit(2).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3,2,2,2,3,7,3,5);

        List<Integer> sqtList = numbers.stream().map(i->i * i ).distinct().collect(Collectors.toList());
        System.out.println(sqtList);

        //get count of empty string
        int count = (int) strings.stream().filter(s->s.isEmpty()).count();
        System.out.println(count);

        random.ints().limit(10).sorted().forEach(System.out::println);

        System.out.println("Filtered List: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
    }
}
