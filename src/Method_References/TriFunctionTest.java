package Method_References;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TriFunctionTest {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Apple"),
                new Employee(2, "Pine Apple"),
                new Employee(3, "Banana"),
                new Employee(4, "Orange"),
                new Employee(5, "Mango"),
                new Employee(6, "Grapes"),
                new Employee(7, "Strawberry"),
                new Employee(8, "Blueberry"),
                new Employee(9, "Watermelon"),
                new Employee(10, "Papaya"),
                new Employee(11, "Kiwi"),
                new Employee(12, "Peach"),
                new Employee(13, "Cherry"),
                new Employee(14, "Plum"),
                new Employee(15, "Apricot"),
                new Employee(16, "Fig"),
                new Employee(17, "Pomegranate"),
                new Employee(18, "Guava"),
                new Employee(19, "Lychee"),
                new Employee(20, "Dragon Fruit"),
                new Employee(21, "Pear"),
                new Employee(22, "Raspberry"),
                // Add more entries to increase the dataset size
                new Employee(23, "Blackberry"),
                new Employee(24, "Cranberry"),
                new Employee(25, "Durian"),
                new Employee(26, "Elderberry"),
                new Employee(27, "Feijoa"),
                new Employee(28, "Gooseberry"),
                new Employee(29, "Honeydew"),
                new Employee(30, "Jackfruit"),
                new Employee(31, "Kumquat"),
                new Employee(32, "Lemon"),
                new Employee(33, "Melon"),
                new Employee(34, "Nectarine"),
                new Employee(35, "Olive"),
                new Employee(36, "Quince"),
                new Employee(37, "Rambutan"),
                new Employee(38, "Soursop"),
                new Employee(39, "Tamarind"),
                new Employee(40, "Ugli Fruit"),
                new Employee(41, "Voavanga"),
                new Employee(42, "Wolfberry")
        );

// Use System.nanoTime() for more precise timing
        long startDate1 = System.nanoTime();
        employeeList.stream()
                .parallel()
//                .distinct()
//                .map(Employee::getName)
//                .filter(name -> {
//                    System.out.println("Filter : applying filter on Employee : " + name + ". Processed by thread : " + Thread.currentThread());
//                    return name.startsWith("P");
//                        })
                .forEach(System.out::println);
        long endDate1 = System.nanoTime();
        System.out.println("Time taken to complete the stream with Parallel of ArrayList: " + (endDate1 - startDate1) + " ms");
System.out.println("*******************************************************************************************************************");
        long startDate = System.nanoTime();
        employeeList.stream()
//                .distinct()
//                .map(Employee::getName)
//                .filter(name -> {
//                    System.out.println("Filter : applying filter on Employee : " + name + ". Processed by thread : " + Thread.currentThread());
//                    return name.getName().startsWith("P");
//                })
                .forEach(System.out::println);
        long endDate = System.nanoTime();
        System.out.println("Time taken to complete the stream of ArrayList: " + (endDate - startDate) + " ms");
    }
}
