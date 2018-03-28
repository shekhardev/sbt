package compareobjects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public boolean equals(Object obj){
        if (obj == null) return false;
        if (!(obj instanceof Person))return false;

        Person p2 = (Person) obj;
        return (p2.name ==name) && (p2.age == age);
    }
}
