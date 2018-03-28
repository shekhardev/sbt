package streamsexamples.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {

        List<Student> students= Arrays.asList(new Student("Allen",14),
                new Student("Tom",19),
                new Student("Chris", 18),
                new Student("Sam",20));



        students.stream()
                //.filter(p-> p.getAge() %2 ==1 )
                .filter(p->p.getName() == "Tom")
                .forEach(System.out::println);

    }
}
