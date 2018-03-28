package streamsexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsSample {
    public static List<Person> createPeople() {
        return Arrays.asList(
                new Person("Sara", Gender.FEMALE, 20),
                new Person("Tom", Gender.MALE, 19),
                new Person("John", Gender.MALE, 18),
                new Person("Chris", Gender.MALE, 21)
        );
    }
    public static void main(String[] args) {
        List<Person> people = createPeople();

        List<String> names = new ArrayList<>();
        for (Person person:people){
            if(person.getAge() >18){
                names.add(person.getName().toUpperCase());
            }
            System.out.println(names);
        }
    }
}
