package compareobjects;

public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person("Sekhar",16);
        Person person1 = new Person("Sekhar",16);

        System.out.println(person == person1);
        System.out.println(person.equals(person1));
    }
}
