package map.streams.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<People> peoples = papulatePeople();

        peoples.stream().filter(people -> people.getName().equals("US")).
                map((People people) -> "id : " +people.getId() + " name " + people.getName())
                .forEach(System.out::println);
    }
    static List<People> papulatePeople(){
        People people1 = new People("person1","US");
        People people2 = new People("person2","Mexico");
        People people3 = new People("person3","Canada");
        People people4 = new People("person4","US");
        List<People> list = new ArrayList<>();
        list.add(people1);
        list.add(people2);
        list.add(people3);
        list.add(people4);
        return list;
    }
}
