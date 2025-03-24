package Streams;

import java.util.Arrays;
import java.util.List;

public class Program_6 {
    public static void main(String[] args) {
        Employee naveen = new Employee(1, "Naveen Kumar", 6, "Hyderabad");
        Employee pooja = new Employee(2, "Bala NagaSri", 3, "Hyderabad");
        Employee vamsi = new Employee(3, "Vamsi Krishna", 3, "Hyderabad");
        Employee prasanna = new Employee(3, "Lakshmi Prasanna", 7, "Rajahmundry");
        Employee ajay = new Employee(3, "Ajay Kumar", 8, "Rajahmundry");

        List<Employee> inputObj = Arrays.asList(naveen,pooja,vamsi,prasanna,ajay);

        inputObj.stream()
                .filter(emp -> emp.getExperience() > 5)
                .map(Employee::getName)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
    }
}

