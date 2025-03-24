package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program_7_TakeWhile {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,9)
                .takeWhile(num -> {
                    System.out.println("TakeWhile : Applying filer on the number :- " + num);
                    return num <= 8;
                })
                .map(num -> {
                    System.out.println("Map : Mapping the number :- " + num);
                    return num * num;
                })
                .forEach(System.out::println);

        Employee naveen = new Employee(1, "Naveen Kumar", 6, "Hyderabad");
        Employee pooja = new Employee(2, "Bala NagaSri", 3, "Hyderabad");
        Employee vamsi = new Employee(3, "Vamsi Krishna", 3, "Hyderabad");

        List<Employee> inputObj = Arrays.asList(naveen,pooja,vamsi);
        inputObj.stream()
                .takeWhile(emp -> emp.getExperience() > 3)
                .map(Employee::getName)
                .forEach(System.out::println);
    }
}
