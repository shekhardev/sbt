package lambaexample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee("Tim",16),
                new Employee("Bob",17));
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() - o2.getAge();

            }
        });
        System.out.println(employees);
    }
}
