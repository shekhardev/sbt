package comparable;

public class Student implements Comparable<Student> {

    private int roolno;
    private String name;
    private int age;

    public Student(int roolno, String name, int age) {
        this.roolno = roolno;
        this.name = name;
        this.age = age;
    }

    public int getRoolno() {
        return roolno;
    }

    public void setRoolno(int roolno) {
        this.roolno = roolno;
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

    @Override
    public int compareTo(Student st) {
        if (age == st.age)
        return 0;
        else if (age>st.age)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roolno=" + roolno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
