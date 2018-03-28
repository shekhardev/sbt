package streamsexamples;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.nio.file.Files.*;

public class FlatmapMain {
    public static void main(String[] args) throws IOException {
//        List<String>  firstname= Arrays.asList("Sekhar","Pooja","Anitha");
//        List<String>  lastname= Arrays.asList("Reddy","Reddy","Reddy");
        List<Student> firstname = Arrays.asList(new Student("Sekhar",16),
                                    new Student("Reddy",16));
        List<Student> lastname = Arrays.asList(new Student("Sekhar",16),
                new Student("Reddy",16));

        List<Student> names= Stream
                            .of(firstname,lastname)
                            .flatMap(p->p.stream())
                            .filter(p->p.getName().startsWith("S"))
                            .collect(Collectors.toList());
        names.forEach(System.out::println);

        System.out.println(
        IntStream
                .range(1,5)
                .sum());
        //
        Stream.of("Sekhar","SR","RS","Reddy")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
        // File reading from a file
        Stream<String> bands = Files.lines(Paths.get("C:\\SpringBoot\\SbtTests\\src\\main\\java\\streamsexamples\\bands.txt"));

        bands.sorted()
                .filter(x->x.contains("sekhar"))
                .forEach(System.out::println);
        bands.close();



    }
}
