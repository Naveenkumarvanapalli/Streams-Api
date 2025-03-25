package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {
        List<Person> transactions = Arrays.asList(
                new Person("2022-01-01", 100),
                new Person("2022-01-01", 200),
                new Person("2022-01-02", 300),
                new Person("2022-01-02", 400),
                new Person("2022-01-03", 500)
        );
        Map<String, Integer> collected = transactions.stream()
                .collect(Collectors.groupingBy(Person::getName, Collectors.summingInt(Person::getAge)));
        System.out.println(collected);

        int[] array = {4, 2, 7, 1, 5, 3, 6};
        int k = 4; // Find the 3rd smallest element
        int i = Arrays.stream(array)
                .sorted()
                .skip(k - 1)
                .findFirst()
                .orElse(-1);
        System.out.println(i);

        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        Map<String, Long> collect = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> collect1 = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println(collect1.get(true));
        System.out.println(collect1.get(false));

    }


}
