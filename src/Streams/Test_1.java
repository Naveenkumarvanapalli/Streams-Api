package Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test_1 {
    public static void main(String[] args) {
        String str = "aaabbbeffrr";
        Map<String, Long> res = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(res);
        Map<Character,Long> ajay=str.chars().mapToObj(e->(char) e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(ajay);
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
        Optional<String> maxLengthOfString = strings.stream().max(Comparator.comparingInt(String::length));
        System.out.println(maxLengthOfString.get());
        List<Person> personList = Arrays.asList(
                new Person("Bala NagSri", 25),
                new Person("Naveen Kumar", 29),
                new Person("Vamsi", 24),
                new Person("Prasanna", 30)
        );
        double averageAge = personList.stream()
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
        System.out.println(averageAge);
    }
}
