package streamsexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainMapFilterExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(new Student("Doe",18),
                new Student("John",19),
                new Student("Peter",20));


        studentList.forEach(p -> p.getName());
       // System.out.println(studentList);

        //studentList.forEach(System.out::println);
//        studentList.stream()
//                .filter(p->p.getName().startsWith("J"))
//        .forEach(p-> System.out.println(p.getName()));

        long count = studentList.stream()
                .filter(p->p.getName().startsWith("P"))
                .count();
        System.out.println(count);
    }
}
