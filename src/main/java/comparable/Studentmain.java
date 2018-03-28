package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Studentmain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(101,"tom",26));
        list.add(new Student(106,"Chris",27));
        list.add(new Student(108,"Dru",21));

        long startTime = System.nanoTime();
        Collections.sort(list);
        for(Student st:list){
            System.out.println(st.getRoolno()+" "+st.getName()+" "+st.getAge());
        }
        System.out.println("Non Stream Result : " + (System.nanoTime() - startTime) / 1000000 + " ms");
        long start1Time = System.nanoTime();
        list.stream().map(st -> st.getRoolno() + " " + st.getName() + " " + st.getAge()).forEach(System.out::println);
        System.out.println("Stream Result : " + (System.nanoTime() - start1Time) / 1000000 + " ms");
    }
}
