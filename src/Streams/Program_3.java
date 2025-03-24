package Streams;

import java.util.Arrays;
import java.util.List;

public class Program_3 {
    public static void main(String[] args) {
        Employee naveen = new Employee(1, "Naveen Kumar", 6, "Hyderabad");
        Employee pooja = new Employee(2, "Bala NagaSri", 3, "Hyderabad");
        Employee vamsi = new Employee(3, "Vamsi Krishna", 3, "Hyderabad");

        List<Employee> inputObj = Arrays.asList(naveen,pooja,vamsi);
        inputObj.forEach(System.out::println);
        inputObj.stream().forEach(emp -> System.out.println(emp.getName()));

    }
}
